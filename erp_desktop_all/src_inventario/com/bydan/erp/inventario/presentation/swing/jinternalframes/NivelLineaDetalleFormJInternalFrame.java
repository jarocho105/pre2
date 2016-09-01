/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.NivelLineaConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class NivelLineaDetalleFormJInternalFrame extends NivelLineaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleNivelLinea;
	
	protected JMenuBar jmenuBarDetalleNivelLinea;
	
	protected JMenu jmenuDetalleNivelLinea;
	protected JMenu jmenuDetalleArchivoNivelLinea;
	protected JMenu jmenuDetalleAccionesNivelLinea;
	protected JMenu jmenuDetalleDatosNivelLinea;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleNivelLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNivelLinea;	
	protected GridBagConstraints gridBagConstraintsNivelLinea;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected NivelLineaBeanSwingJInternalFrameAdditional jInternalFrameDetalleNivelLinea;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public NivelLineaSessionBean nivellineaSessionBean;
	
	

	public LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=null;
	public LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteLinea=false;
	public LineaSessionBean lineaSessionBean;

	public ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrame=null;
	public ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteComisionConfig=false;
	public ComisionConfigSessionBean comisionconfigSessionBean;
	
		
	
	public NivelLineaLogic nivellineaLogic;
	
	public JScrollPane jScrollPanelDatosNivelLinea;
	public JScrollPane jScrollPanelDatosEdicionNivelLinea;
	public JScrollPane jScrollPanelDatosGeneralNivelLinea;
	
	protected JPanel jPanelCamposNivelLinea;    
	protected JPanel jPanelCamposOcultosNivelLinea;    	
	protected JPanel jPanelAccionesNivelLinea;
	protected JPanel jPanelAccionesFormularioNivelLinea;
    
	
	
	protected Integer iXPanelCamposNivelLinea=0;
	protected Integer iYPanelCamposNivelLinea=0;
	
	protected Integer iXPanelCamposOcultosNivelLinea=0;
	protected Integer iYPanelCamposOcultosNivelLinea=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoNivelLinea;
	public JButton jButtonModificarNivelLinea;
	public JButton jButtonActualizarNivelLinea;
    public JButton jButtonEliminarNivelLinea;
	public JButton jButtonCancelarNivelLinea;
    public JButton jButtonGuardarCambiosNivelLinea;
	public JButton jButtonGuardarCambiosTablaNivelLinea;
	protected JButton jButtonCerrarNivelLinea;
	
	
	protected JButton jButtonProcesarInformacionNivelLinea;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoNivelLinea;
	protected JCheckBox jCheckBoxPostAccionSinCerrarNivelLinea;
	protected JCheckBox jCheckBoxPostAccionSinMensajeNivelLinea;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNivelLinea;
	protected JButton jButtonModificarToolBarNivelLinea;
	protected JButton jButtonActualizarToolBarNivelLinea;
    protected JButton jButtonEliminarToolBarNivelLinea;
	protected JButton jButtonCancelarToolBarNivelLinea;
    protected JButton jButtonGuardarCambiosToolBarNivelLinea;
	protected JButton jButtonGuardarCambiosTablaToolBarNivelLinea;
	protected JButton jButtonMostrarOcultarTablaToolBarNivelLinea;
	protected JButton jButtonCerrarToolBarNivelLinea;
	
	protected JButton jButtonProcesarInformacionToolBarNivelLinea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNivelLinea;
	protected JMenuItem jMenuItemModificarNivelLinea;
	protected JMenuItem jMenuItemActualizarNivelLinea;
    protected JMenuItem jMenuItemEliminarNivelLinea;
	protected JMenuItem jMenuItemCancelarNivelLinea;
    protected JMenuItem jMenuItemGuardarCambiosNivelLinea;
	protected JMenuItem jMenuItemGuardarCambiosTablaNivelLinea;
	protected JMenuItem jMenuItemCerrarNivelLinea;
	protected JMenuItem jMenuItemDetalleCerrarNivelLinea;
	protected JMenuItem jMenuItemDetalleMostarOcultarNivelLinea;
	
	protected JMenuItem jMenuItemProcesarInformacionNivelLinea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNivelLinea;
	protected JMenuItem jMenuItemMostrarOcultarNivelLinea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNivelLinea;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNivelLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNivelLinea;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioNivelLinea;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidNivelLinea;
	public JLabel jLabelIdNivelLinea;
	public JTextFieldMe jTextFieldidNivelLinea;
	public JButton jButtonidNivelLineaBusqueda= new JButtonMe();

	public JPanel jPanelnombreNivelLinea;
	public JLabel jLabelnombreNivelLinea;
	public JTextArea jTextAreanombreNivelLinea;
	public JScrollPane jscrollPanenombreNivelLinea;
	public JButton jButtonnombreNivelLineaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesNivelLinea;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public NivelLineaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposNivelLinea=new JPanel();
				this.jPanelAccionesFormularioNivelLinea=new JPanel();
				this.jmenuBarDetalleNivelLinea=new JMenuBar();
				this.jTtoolBarDetalleNivelLinea=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelLineaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("NivelLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public NivelLineaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("NivelLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelLineaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NivelLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelLineaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NivelLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelLineaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NivelLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarNivelLinea() {
		return this.jButtonActualizarToolBarNivelLinea;
	}
	
	public JButton getjButtonEliminarToolBarNivelLinea() {
		return this.jButtonEliminarToolBarNivelLinea;
	}
	
	public JButton getjButtonCancelarToolBarNivelLinea() {
		return this.jButtonCancelarToolBarNivelLinea;
	}		
	
	public JButton getjButtonProcesarInformacionNivelLinea() {
		return this.jButtonProcesarInformacionNivelLinea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNivelLinea)	{
		this.jButtonProcesarInformacionNivelLinea = jButtonProcesarInformacionNivelLinea;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNivelLinea() {
		return this.jComboBoxTiposAccionesNivelLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNivelLinea(
			JComboBox jComboBoxTiposRelacionesNivelLinea) {
		this.jComboBoxTiposRelacionesNivelLinea = jComboBoxTiposRelacionesNivelLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNivelLinea(
			JComboBox jComboBoxTiposAccionesNivelLinea) {
		this.jComboBoxTiposAccionesNivelLinea = jComboBoxTiposAccionesNivelLinea;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioNivelLinea() {
		return this.jComboBoxTiposAccionesFormularioNivelLinea;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioNivelLinea(
			JComboBox jComboBoxTiposAccionesFormularioNivelLinea) {
		this.jComboBoxTiposAccionesFormularioNivelLinea = jComboBoxTiposAccionesFormularioNivelLinea;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.nivellineaSessionBean=new NivelLineaSessionBean();
		
		this.nivellineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.nivellineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.nivellineaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.lineaSessionBean=new LineaSessionBean();
		//this.comisionconfigSessionBean=new ComisionConfigSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NivelLineaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NivelLineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NivelLineaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Nivel Linea MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		NivelLineaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNivelLinea= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarNivelLinea=new JButtonMe();
				this.jButtonModificarToolBarNivelLinea=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarNivelLinea,this.jTtoolBarDetalleNivelLinea,
							"actualizar","actualizar","Actualizar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarNivelLinea,this.jTtoolBarDetalleNivelLinea,
							"eliminar","eliminar","Eliminar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarNivelLinea,this.jTtoolBarDetalleNivelLinea,
							"cancelar","cancelar","Cancelar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarNivelLinea,this.jTtoolBarDetalleNivelLinea,
							"guardarcambios","guardarcambios","Guardar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarNivelLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarNivelLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarNivelLinea,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleNivelLinea=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleNivelLinea=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoNivelLinea=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesNivelLinea=new JMenuMe("Acciones");
		this.jmenuDetalleDatosNivelLinea=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNivelLinea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNivelLinea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNivelLinea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarNivelLinea= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarNivelLinea.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarNivelLinea,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarNivelLinea= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarNivelLinea.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarNivelLinea,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarNivelLinea= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarNivelLinea.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarNivelLinea,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarNivelLinea= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarNivelLinea.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarNivelLinea,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosNivelLinea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNivelLinea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNivelLinea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNivelLinea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNivelLinea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNivelLinea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarNivelLinea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarNivelLinea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarNivelLinea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNivelLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNivelLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNivelLinea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNivelLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNivelLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNivelLinea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoNivelLinea.add(this.jMenuItemDetalleCerrarNivelLinea);
		
		this.jmenuDetalleAccionesNivelLinea.add(this.jMenuItemActualizarNivelLinea);
		this.jmenuDetalleAccionesNivelLinea.add(this.jMenuItemEliminarNivelLinea);
		this.jmenuDetalleAccionesNivelLinea.add(this.jMenuItemCancelarNivelLinea);		
		
		//this.jmenuDetalleDatosNivelLinea.add(this.jMenuItemDetalleAbrirOrderByNivelLinea);				
		this.jmenuDetalleDatosNivelLinea.add(this.jMenuItemDetalleMostarOcultarNivelLinea);				
				
		//this.jmenuDetalleAccionesNivelLinea.add(this.jMenuItemGuardarCambiosNivelLinea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleNivelLinea.add(this.jmenuDetalleArchivoNivelLinea);		
		this.jmenuBarDetalleNivelLinea.add(this.jmenuDetalleAccionesNivelLinea);		
		this.jmenuBarDetalleNivelLinea.add(this.jmenuDetalleDatosNivelLinea);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleNivelLinea.add(this.jmenuDetalleNivelLinea);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleNivelLinea);				
	}
	
	
	public void inicializarElementosCamposNivelLinea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdNivelLinea = new JLabelMe();
		jLabelIdNivelLinea.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdNivelLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNivelLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNivelLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdNivelLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidNivelLinea = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidNivelLinea.setToolTipText(NivelLineaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutNivelLinea= new GridBagLayout();

		this.jPanelidNivelLinea.setLayout(this.gridaBagLayoutNivelLinea);

		jTextFieldidNivelLinea = new JTextFieldMe();
		jTextFieldidNivelLinea.setText("Id");

		jTextFieldidNivelLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidNivelLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidNivelLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreNivelLinea = new JLabelMe();
		this.jLabelnombreNivelLinea.setText(""+NivelLineaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreNivelLinea.setToolTipText("Nombre");
		this.jLabelnombreNivelLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreNivelLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreNivelLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreNivelLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreNivelLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreNivelLinea.setToolTipText(NivelLineaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutNivelLinea = new GridBagLayout();
		this.jPanelnombreNivelLinea.setLayout(this.gridaBagLayoutNivelLinea);


		jTextAreanombreNivelLinea= new JTextAreaMe();
		jTextAreanombreNivelLinea.setEnabled(false);
		jTextAreanombreNivelLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreNivelLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreNivelLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreNivelLinea.setLineWrap(true);
		jTextAreanombreNivelLinea.setWrapStyleWord(true);
		jTextAreanombreNivelLinea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreNivelLinea.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreNivelLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreNivelLinea = new JScrollPane(jTextAreanombreNivelLinea);
		jscrollPanenombreNivelLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreNivelLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreNivelLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreNivelLineaBusqueda= new JButtonMe();
		this.jButtonnombreNivelLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreNivelLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreNivelLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreNivelLineaBusqueda.setText("U");
		this.jButtonnombreNivelLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreNivelLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreNivelLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreNivelLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreNivelLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreNivelLineaBusqueda"));

		if(this.nivellineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreNivelLineaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysNivelLinea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleNivelLinea = new NivelLineaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Nivel Linea DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNivelLinea= new GridBagLayout();
		

		
		String sToolTipNivelLinea="";
		sToolTipNivelLinea=NivelLineaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNivelLinea+="(Inventario.NivelLinea)";
		}
		
		if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
			sToolTipNivelLinea+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoNivelLinea = new JButtonMe();
		this.jButtonModificarNivelLinea = new JButtonMe();
        this.jButtonActualizarNivelLinea = new JButtonMe();
        this.jButtonEliminarNivelLinea = new JButtonMe();
        this.jButtonCancelarNivelLinea = new JButtonMe();
        this.jButtonGuardarCambiosNivelLinea = new JButtonMe();
		this.jButtonGuardarCambiosTablaNivelLinea = new JButtonMe();
		this.jButtonCerrarNivelLinea = new JButtonMe();
		
		this.jScrollPanelDatosNivelLinea = new JScrollPane();   
        this.jScrollPanelDatosEdicionNivelLinea = new JScrollPane();
		this.jScrollPanelDatosGeneralNivelLinea = new JScrollPane();
				
		
		
		this.jPanelCamposNivelLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosNivelLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesNivelLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioNivelLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Nivel Linea";
		
		if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Lineas" + this.sPath));
		} else {
			this.jScrollPanelDatosNivelLinea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposNivelLinea.setName("jPanelCamposNivelLinea"); 

		this.jPanelCamposOcultosNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosNivelLinea.setName("jPanelCamposOcultosNivelLinea"); 

        this.jPanelAccionesNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNivelLinea.setToolTipText("Acciones");
        this.jPanelAccionesNivelLinea.setName("Acciones"); 

		this.jPanelAccionesFormularioNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioNivelLinea.setToolTipText("Acciones");
        this.jPanelAccionesFormularioNivelLinea.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoNivelLinea.setText("Nuevo");
		this.jButtonModificarNivelLinea.setText("Editar");
        this.jButtonActualizarNivelLinea.setText("Actualizar");
        this.jButtonEliminarNivelLinea.setText("Eliminar");
        this.jButtonCancelarNivelLinea.setText("Cancelar");
        this.jButtonGuardarCambiosNivelLinea.setText("Guardar");
		this.jButtonGuardarCambiosTablaNivelLinea.setText("Guardar");
		this.jButtonCerrarNivelLinea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNivelLinea,"nuevo_button","Nuevo",this.nivellineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarNivelLinea,"modificar_button","Editar",this.nivellineaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarNivelLinea,"actualizar_button","Actualizar",this.nivellineaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarNivelLinea,"eliminar_button","Eliminar",this.nivellineaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarNivelLinea,"cancelar_button","Cancelar",this.nivellineaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosNivelLinea,"guardarcambios_button","Guardar",this.nivellineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNivelLinea,"guardarcambiostabla_button","Guardar",this.nivellineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNivelLinea,"cerrar_button","Salir",this.nivellineaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoNivelLinea.setToolTipText("Nuevo"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarNivelLinea.setToolTipText("Editar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarNivelLinea.setToolTipText("Actualizar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarNivelLinea.setToolTipText("Eliminar)"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarNivelLinea.setToolTipText("Cancelar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosNivelLinea.setToolTipText("Guardar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaNivelLinea.setToolTipText("Guardar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNivelLinea.setToolTipText("Salir"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoNivelLinea";
		inputMap = this.jButtonNuevoNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNivelLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNivelLinea"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarNivelLinea";
		inputMap = this.jButtonActualizarNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarNivelLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarNivelLinea"));
		
		//ELIMINAR
		sMapKey = "EliminarNivelLinea";
		inputMap = this.jButtonEliminarNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarNivelLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarNivelLinea"));
		
		//CANCELAR	
		sMapKey = "CancelarNivelLinea";
		inputMap = this.jButtonCancelarNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarNivelLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarNivelLinea"));
		
		//CERRAR		
		sMapKey = "CerrarNivelLinea";
		inputMap = this.jButtonCerrarNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNivelLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNivelLinea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNivelLinea";
		inputMap = this.jButtonGuardarCambiosTablaNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNivelLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNivelLinea"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoNivelLinea = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoNivelLinea.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoNivelLinea.setToolTipText("Nuevo NivelLinea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarNivelLinea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarNivelLinea.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarNivelLinea.setToolTipText("Sin Cerrar Ventana NivelLinea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeNivelLinea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeNivelLinea.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeNivelLinea.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesNivelLinea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNivelLinea.setText("Accion");
		this.jComboBoxTiposAccionesNivelLinea.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioNivelLinea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioNivelLinea.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioNivelLinea.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesNivelLinea = new JLabelMe();
		
		this.jLabelAccionesNivelLinea.setText("Acciones");		
		this.jLabelAccionesNivelLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNivelLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNivelLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposNivelLinea();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysNivelLinea();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesNivelLinea=new JTabbedPane();
		this.jTabbedPaneRelacionesNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesNivelLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesNivelLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNivelLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNivelLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioNivelLinea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNivelLinea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNivelLinea.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposNivelLinea = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosNivelLinea = new GridBagLayout();
		
		this.jPanelCamposNivelLinea.setLayout(gridaBagLayoutCamposNivelLinea);
		this.jPanelCamposOcultosNivelLinea.setLayout(gridaBagLayoutCamposOcultosNivelLinea);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsNivelLinea = new GridBagConstraints();
	this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelLinea.gridy = 0;
	this.gridBagConstraintsNivelLinea.gridx = 0;
	this.gridBagConstraintsNivelLinea.ipadx = 0;
	this.gridBagConstraintsNivelLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidNivelLinea.add(jLabelIdNivelLinea, this.gridBagConstraintsNivelLinea);



	this.gridBagConstraintsNivelLinea = new GridBagConstraints();
	this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelLinea.gridy = 0;
	this.gridBagConstraintsNivelLinea.gridx = 1;
	this.gridBagConstraintsNivelLinea.ipadx = 0;
	this.gridBagConstraintsNivelLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidNivelLinea.add(jTextFieldidNivelLinea, this.gridBagConstraintsNivelLinea);


	this.gridBagConstraintsNivelLinea = new GridBagConstraints();
	this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelLinea.gridy = 0;
	this.gridBagConstraintsNivelLinea.gridx = 0;
	this.gridBagConstraintsNivelLinea.ipadx = 0;
	this.gridBagConstraintsNivelLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreNivelLinea.add(jLabelnombreNivelLinea, this.gridBagConstraintsNivelLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		//this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelLinea.gridy = 0;
		this.gridBagConstraintsNivelLinea.gridx = 2;
		this.gridBagConstraintsNivelLinea.ipadx = 0;
		this.gridBagConstraintsNivelLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreNivelLinea.add(jButtonnombreNivelLineaBusqueda, this.gridBagConstraintsNivelLinea);
	}

	this.gridBagConstraintsNivelLinea = new GridBagConstraints();
	this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelLinea.gridy = 0;
	this.gridBagConstraintsNivelLinea.gridx = 1;
	this.gridBagConstraintsNivelLinea.ipadx = 0;
	this.gridBagConstraintsNivelLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreNivelLinea.add(jscrollPanenombreNivelLinea, this.gridBagConstraintsNivelLinea);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsNivelLinea = new GridBagConstraints();
	this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNivelLinea.gridy = iYPanelCamposNivelLinea;
	this.gridBagConstraintsNivelLinea.gridx = iXPanelCamposNivelLinea++;
	this.gridBagConstraintsNivelLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNivelLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNivelLinea.add(this.jPanelidNivelLinea, this.gridBagConstraintsNivelLinea);



	if(iXPanelCamposNivelLinea % 1==0) {
		iXPanelCamposNivelLinea=0;
		iYPanelCamposNivelLinea++;
	}
	this.gridBagConstraintsNivelLinea = new GridBagConstraints();
	this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNivelLinea.gridy = iYPanelCamposNivelLinea;
	this.gridBagConstraintsNivelLinea.gridx = iXPanelCamposNivelLinea++;
	this.gridBagConstraintsNivelLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNivelLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNivelLinea.add(this.jPanelnombreNivelLinea, this.gridBagConstraintsNivelLinea);



	if(iXPanelCamposNivelLinea % 1==0) {
		iXPanelCamposNivelLinea=0;
		iYPanelCamposNivelLinea++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNivelLinea= new GridBagLayout();
		this.jPanelAccionesNivelLinea.setLayout(gridaBagLayoutAccionesNivelLinea);
		
		GridBagLayout gridaBagLayoutAccionesFormularioNivelLinea= new GridBagLayout();
		this.jPanelAccionesFormularioNivelLinea.setLayout(gridaBagLayoutAccionesFormularioNivelLinea);
		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNivelLinea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNivelLinea.add(this.jComboBoxTiposAccionesFormularioNivelLinea, this.gridBagConstraintsNivelLinea);

		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNivelLinea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNivelLinea.add(this.jCheckBoxPostAccionNuevoNivelLinea, this.gridBagConstraintsNivelLinea);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.nivellineaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNivelLinea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNivelLinea.add(this.jCheckBoxPostAccionSinCerrarNivelLinea, this.gridBagConstraintsNivelLinea);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.nivellineaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.nivellineaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNivelLinea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNivelLinea.add(this.jCheckBoxPostAccionSinMensajeNivelLinea, this.gridBagConstraintsNivelLinea);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelLinea.gridy = 0;
		this.gridBagConstraintsNivelLinea.gridx = iPosXAccion++;
			
		this.jPanelAccionesNivelLinea.add(this.jButtonModificarNivelLinea, this.gridBagConstraintsNivelLinea);							

		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelLinea.gridy = 0;
		this.gridBagConstraintsNivelLinea.gridx =iPosXAccion++;
			
		this.jPanelAccionesNivelLinea.add(this.jButtonEliminarNivelLinea, this.gridBagConstraintsNivelLinea);
		
			
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy = 0;		
		this.gridBagConstraintsNivelLinea.gridx = iPosXAccion++;
		
		this.jPanelAccionesNivelLinea.add(this.jButtonActualizarNivelLinea, this.gridBagConstraintsNivelLinea);


		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy = 0;		
		this.gridBagConstraintsNivelLinea.gridx = iPosXAccion++;
		
		this.jPanelAccionesNivelLinea.add(this.jButtonGuardarCambiosNivelLinea, this.gridBagConstraintsNivelLinea);	
		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy = 0;		
		this.gridBagConstraintsNivelLinea.gridx =iPosXAccion++;
		
		this.jPanelAccionesNivelLinea.add(this.jButtonCancelarNivelLinea, this.gridBagConstraintsNivelLinea);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNivelLinea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNivelLinea);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.nivellineaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();						
			this.gridBagConstraintsNivelLinea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNivelLinea.gridx = 0;		
			//this.gridBagConstraintsNivelLinea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNivelLinea.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNivelLinea.gridx =0;
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNivelLinea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNivelLinea, this.gridBagConstraintsNivelLinea);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(NivelLineaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleNivelLinea = new NivelLineaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Nivel Linea DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Nivel Linea DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Nivel Linea Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			NivelLineaModel nivellineaModel=new NivelLineaModel(this);
			
			//SI USARA CLASE INTERNA
			//NivelLineaModel.NivelLineaFocusTraversalPolicy nivellineaFocusTraversalPolicy = nivellineaModel.new NivelLineaFocusTraversalPolicy(this);
			
			//nivellineaFocusTraversalPolicy.setnivellineaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(nivellineaModel);
			
			
			this.jContentPaneDetalleNivelLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleNivelLinea = new GridBagLayout();	
			this.jContentPaneDetalleNivelLinea.setLayout(gridaBagLayoutDetalleNivelLinea);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNivelLinea = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsNivelLinea = new GridBagConstraints();
				this.gridBagConstraintsNivelLinea.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsNivelLinea.gridx = 0;
					
				
				this.jContentPaneDetalleNivelLinea.add(jTtoolBarDetalleNivelLinea, gridBagConstraintsNivelLinea);								
				
}
			
			this.jScrollPanelDatosEdicionNivelLinea=   new JScrollPane(jContentPaneDetalleNivelLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNivelLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNivelLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNivelLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralNivelLinea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNivelLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNivelLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNivelLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			
			
	        this.gridBagConstraintsNivelLinea.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsNivelLinea.gridx = 0;
	        
			this.jContentPaneDetalleNivelLinea.add(jPanelCamposNivelLinea, gridBagConstraintsNivelLinea);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& nivellineaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameComisionConfig(this.puedeCargarPorParteComisionConfig,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameLinea(this.puedeCargarPorParteLinea,false,-1);
					
					if(this.nivellineaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsNivelLinea= new GridBagConstraints();
						this.gridBagConstraintsNivelLinea.gridy = iGridyRelaciones++;
						this.gridBagConstraintsNivelLinea.gridx = 0;
						this.jContentPaneDetalleNivelLinea.add(this.jTabbedPaneRelacionesNivelLinea, this.gridBagConstraintsNivelLinea);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNivelLinea.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameComisionConfig(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameLinea(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosNivelLinea.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsNivelLinea = new GridBagConstraints();
					this.gridBagConstraintsNivelLinea.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsNivelLinea.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsNivelLinea.gridx = 0;
					
				
					this.jContentPaneDetalleNivelLinea.add(jPanelCamposOcultosNivelLinea, gridBagConstraintsNivelLinea);
				
					this.jPanelCamposOcultosNivelLinea.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsNivelLinea.gridx = 0;
	        this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleNivelLinea.add(this.jPanelAccionesFormularioNivelLinea, this.gridBagConstraintsNivelLinea);							
			
			
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
	        this.gridBagConstraintsNivelLinea.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsNivelLinea.gridx = 0;
	        
			
			this.jContentPaneDetalleNivelLinea.add(this.jPanelAccionesNivelLinea, this.gridBagConstraintsNivelLinea);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionNivelLinea);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionNivelLinea=   new JScrollPane(this.jPanelCamposNivelLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNivelLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNivelLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNivelLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsNivelLinea.gridx = 0;
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsNivelLinea.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionNivelLinea, this.gridBagConstraintsNivelLinea);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNivelLinea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioNivelLinea, this.gridBagConstraintsNivelLinea);			
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNivelLinea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesNivelLinea, this.gridBagConstraintsNivelLinea);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNivelLinea, this.gridBagConstraintsNivelLinea);
			
			
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNivelLinea, this.gridBagConstraintsNivelLinea);
		
			
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNivelLinea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNivelLinea, this.gridBagConstraintsNivelLinea);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralNivelLinea;//jContentPane;
		
		return jScrollPanelDatosEdicionNivelLinea;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameComisionConfig(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.comisionconfigSessionBean=new ComisionConfigSessionBean();
		this.comisionconfigSessionBean.setConGuardarRelaciones(false);
		this.comisionconfigSessionBean.setEsGuardarRelacionado(true);

		this.comisionconfigBeanSwingJInternalFrame=null;//new ComisionConfigBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.comisionconfigBeanSwingJInternalFramePopup=new ComisionConfigBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.comisionconfigBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.comisionconfigSessionBean.getEsGuardarRelacionado()) {

				ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL=NivelLineaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=NivelLineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.comisionconfigSessionBean.setEsGuardarRelacionado(true);

				this.comisionconfigBeanSwingJInternalFrame=new ComisionConfigBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.comisionconfigBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.comisionconfigBeanSwingJInternalFrame.setcomisionconfigSessionBean(this.comisionconfigSessionBean);

				//this.gridBagConstraintsNivelLinea = new GridBagConstraints();
				//this.gridBagConstraintsNivelLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsNivelLinea.gridx = 0;
				//this.jContentPaneDetalleNivelLinea.add(this.comisionconfigBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsNivelLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesNivelLinea.add("Comision Configes",this.comisionconfigBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesNivelLinea.setComponentAt(iIndexTab,this.comisionconfigBeanSwingJInternalFrame.getContentPane());
				}

				//ComisionConfigJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.comisionconfigSessionBean.setEsGuardarRelacionado(false);
				this.comisionconfigBeanSwingJInternalFrame=null;//new ComisionConfigBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteComisionConfig) {
					this.jTabbedPaneRelacionesNivelLinea.add("Comision Configes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameLinea(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.lineaSessionBean=new LineaSessionBean();
		this.lineaSessionBean.setConGuardarRelaciones(false);
		this.lineaSessionBean.setEsGuardarRelacionado(true);

		this.lineaBeanSwingJInternalFrame=null;//new LineaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.lineaBeanSwingJInternalFramePopup=new LineaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.lineaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.lineaSessionBean.getEsGuardarRelacionado()) {

				LineaJInternalFrame.STIPO_TAMANIO_GENERAL=NivelLineaJInternalFrame.STIPO_TAMANIO_GENERAL;
				LineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=NivelLineaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.lineaSessionBean.setEsGuardarRelacionado(true);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.lineaBeanSwingJInternalFrame.setlineaSessionBean(this.lineaSessionBean);

				//this.gridBagConstraintsNivelLinea = new GridBagConstraints();
				//this.gridBagConstraintsNivelLinea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsNivelLinea.gridx = 0;
				//this.jContentPaneDetalleNivelLinea.add(this.lineaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsNivelLinea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesNivelLinea.add("Lineas",this.lineaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesNivelLinea.setComponentAt(iIndexTab,this.lineaBeanSwingJInternalFrame.getContentPane());
				}

				//LineaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.lineaSessionBean.setEsGuardarRelacionado(false);
				this.lineaBeanSwingJInternalFrame=null;//new LineaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.lineaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteLinea) {
					this.jTabbedPaneRelacionesNivelLinea.add("Lineas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarLineaBeanSwingJInternalFrame(List<NivelLinea> nivellineas,NivelLinea nivellinea,LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.nivellineaLogic.getConnexion());

					lineaBeanSwingJInternalFrame.setnivellineasForeignKey(nivellineas);
					lineaBeanSwingJInternalFrame.setnivellineaForeignKey(nivellinea);
					lineaBeanSwingJInternalFrame.lineaSessionBean.setisBusquedaDesdeForeignKeySesionNivelLinea(true);
					lineaBeanSwingJInternalFrame.lineaSessionBean.setlidNivelLineaActual(nivellinea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					lineaBeanSwingJInternalFrame.cargarCombosForeignKeyLinea(lineaBeanSwingJInternalFrame.isCargarCombosDependencia);
					lineaBeanSwingJInternalFrame.setVisibilidadBusquedasParaNivelLinea(true);
					lineaBeanSwingJInternalFrame.setid_nivel_lineaFK_IdNivelLinea(nivellinea.getId());

					if(!this.conCargarFormDetalle) {
						lineaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					lineaBeanSwingJInternalFrame.setSelectedItemCombosFrameNivelLineaForeignKey(nivellinea,1,false,true,true);
					lineaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					lineaBeanSwingJInternalFrame.procesarBusqueda("FK_IdNivelLinea");
					lineaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdNivelLinea");
					lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea(true);
					lineaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesLinea("n",lineaBeanSwingJInternalFrame.isGuardarCambiosEnLote, lineaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					lineaBeanSwingJInternalFrame.setAutoscrolls(true);
					lineaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						lineaBeanSwingJInternalFrame.actualizarEstadoPanelsLinea("relacionado");
					} else {
						lineaBeanSwingJInternalFrame.actualizarEstadoPanelsLinea("no_relacionado");
					}

					lineaBeanSwingJInternalFrame.getjButtonRecargarInformacionLinea().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarComisionConfigBeanSwingJInternalFrame(List<NivelLinea> nivellineas,NivelLinea nivellinea,ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//comisionconfigBeanSwingJInternalFrame=new ComisionConfigBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					comisionconfigBeanSwingJInternalFrame.getComisionConfigLogic().setConnexion(this.nivellineaLogic.getConnexion());

					comisionconfigBeanSwingJInternalFrame.setnivellineasForeignKey(nivellineas);
					comisionconfigBeanSwingJInternalFrame.setnivellineaForeignKey(nivellinea);
					comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.setisBusquedaDesdeForeignKeySesionNivelLinea(true);
					comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.setlidNivelLineaActual(nivellinea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					comisionconfigBeanSwingJInternalFrame.cargarCombosForeignKeyComisionConfig(comisionconfigBeanSwingJInternalFrame.isCargarCombosDependencia);
					comisionconfigBeanSwingJInternalFrame.setVisibilidadBusquedasParaNivelLinea(true);
					comisionconfigBeanSwingJInternalFrame.setid_nivel_lineaFK_IdNivelLinea(nivellinea.getId());

					if(!this.conCargarFormDetalle) {
						comisionconfigBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					comisionconfigBeanSwingJInternalFrame.setSelectedItemCombosFrameNivelLineaForeignKey(nivellinea,1,false,true,true);
					comisionconfigBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					comisionconfigBeanSwingJInternalFrame.procesarBusqueda("FK_IdNivelLinea");
					comisionconfigBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdNivelLinea");
					comisionconfigBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionConfig(true);
					comisionconfigBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesComisionConfig("n",comisionconfigBeanSwingJInternalFrame.isGuardarCambiosEnLote, comisionconfigBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					comisionconfigBeanSwingJInternalFrame.setAutoscrolls(true);
					comisionconfigBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						comisionconfigBeanSwingJInternalFrame.actualizarEstadoPanelsComisionConfig("relacionado");
					} else {
						comisionconfigBeanSwingJInternalFrame.actualizarEstadoPanelsComisionConfig("no_relacionado");
					}

					comisionconfigBeanSwingJInternalFrame.getjButtonRecargarInformacionComisionConfig().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
