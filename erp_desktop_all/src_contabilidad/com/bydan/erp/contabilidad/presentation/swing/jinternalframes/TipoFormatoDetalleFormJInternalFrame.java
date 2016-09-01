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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoFormatoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoFormatoDetalleFormJInternalFrame extends TipoFormatoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoFormato;
	
	protected JMenuBar jmenuBarDetalleTipoFormato;
	
	protected JMenu jmenuDetalleTipoFormato;
	protected JMenu jmenuDetalleArchivoTipoFormato;
	protected JMenu jmenuDetalleAccionesTipoFormato;
	protected JMenu jmenuDetalleDatosTipoFormato;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFormato;	
	protected GridBagConstraints gridBagConstraintsTipoFormato;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoFormatoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoFormato;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoFormatoSessionBean tipoformatoSessionBean;
	
	

	public FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame=null;
	public FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormato=false;
	public FormatoSessionBean formatoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoFormatoLogic tipoformatoLogic;
	
	public JScrollPane jScrollPanelDatosTipoFormato;
	public JScrollPane jScrollPanelDatosEdicionTipoFormato;
	public JScrollPane jScrollPanelDatosGeneralTipoFormato;
	
	protected JPanel jPanelCamposTipoFormato;    
	protected JPanel jPanelCamposOcultosTipoFormato;    	
	protected JPanel jPanelAccionesTipoFormato;
	protected JPanel jPanelAccionesFormularioTipoFormato;
    
	
	
	protected Integer iXPanelCamposTipoFormato=0;
	protected Integer iYPanelCamposTipoFormato=0;
	
	protected Integer iXPanelCamposOcultosTipoFormato=0;
	protected Integer iYPanelCamposOcultosTipoFormato=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoFormato;
	public JButton jButtonModificarTipoFormato;
	public JButton jButtonActualizarTipoFormato;
    public JButton jButtonEliminarTipoFormato;
	public JButton jButtonCancelarTipoFormato;
    public JButton jButtonGuardarCambiosTipoFormato;
	public JButton jButtonGuardarCambiosTablaTipoFormato;
	protected JButton jButtonCerrarTipoFormato;
	
	
	protected JButton jButtonProcesarInformacionTipoFormato;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoFormato;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoFormato;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoFormato;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFormato;
	protected JButton jButtonModificarToolBarTipoFormato;
	protected JButton jButtonActualizarToolBarTipoFormato;
    protected JButton jButtonEliminarToolBarTipoFormato;
	protected JButton jButtonCancelarToolBarTipoFormato;
    protected JButton jButtonGuardarCambiosToolBarTipoFormato;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoFormato;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFormato;
	protected JButton jButtonCerrarToolBarTipoFormato;
	
	protected JButton jButtonProcesarInformacionToolBarTipoFormato;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFormato;
	protected JMenuItem jMenuItemModificarTipoFormato;
	protected JMenuItem jMenuItemActualizarTipoFormato;
    protected JMenuItem jMenuItemEliminarTipoFormato;
	protected JMenuItem jMenuItemCancelarTipoFormato;
    protected JMenuItem jMenuItemGuardarCambiosTipoFormato;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFormato;
	protected JMenuItem jMenuItemCerrarTipoFormato;
	protected JMenuItem jMenuItemDetalleCerrarTipoFormato;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFormato;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoFormato;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFormato;
	protected JMenuItem jMenuItemMostrarOcultarTipoFormato;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFormato;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFormato;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFormato;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoFormato;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoFormato;
	public JLabel jLabelIdTipoFormato;
	public JLabel jLabelidTipoFormato;
	public JButton jButtonidTipoFormatoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoFormato;
	public JLabel jLabelnombreTipoFormato;
	public JTextArea jTextAreanombreTipoFormato;
	public JScrollPane jscrollPanenombreTipoFormato;
	public JButton jButtonnombreTipoFormatoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoFormato;
	public JLabel jLabelid_empresaTipoFormato;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoFormato;
	public JButton jButtonid_empresaTipoFormato= new JButtonMe();
	public JButton jButtonid_empresaTipoFormatoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoFormatoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoFormato;
	
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
	
	public TipoFormatoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoFormato=new JPanel();
				this.jPanelAccionesFormularioTipoFormato=new JPanel();
				this.jmenuBarDetalleTipoFormato=new JMenuBar();
				this.jTtoolBarDetalleTipoFormato=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormatoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoFormato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoFormatoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoFormato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormatoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFormato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormatoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFormato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormatoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFormato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoFormato() {
		return this.jButtonActualizarToolBarTipoFormato;
	}
	
	public JButton getjButtonEliminarToolBarTipoFormato() {
		return this.jButtonEliminarToolBarTipoFormato;
	}
	
	public JButton getjButtonCancelarToolBarTipoFormato() {
		return this.jButtonCancelarToolBarTipoFormato;
	}		
	
	public JButton getjButtonProcesarInformacionTipoFormato() {
		return this.jButtonProcesarInformacionTipoFormato;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFormato)	{
		this.jButtonProcesarInformacionTipoFormato = jButtonProcesarInformacionTipoFormato;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFormato() {
		return this.jComboBoxTiposAccionesTipoFormato;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFormato(
			JComboBox jComboBoxTiposRelacionesTipoFormato) {
		this.jComboBoxTiposRelacionesTipoFormato = jComboBoxTiposRelacionesTipoFormato;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFormato(
			JComboBox jComboBoxTiposAccionesTipoFormato) {
		this.jComboBoxTiposAccionesTipoFormato = jComboBoxTiposAccionesTipoFormato;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoFormato() {
		return this.jComboBoxTiposAccionesFormularioTipoFormato;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoFormato(
			JComboBox jComboBoxTiposAccionesFormularioTipoFormato) {
		this.jComboBoxTiposAccionesFormularioTipoFormato = jComboBoxTiposAccionesFormularioTipoFormato;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoformatoSessionBean=new TipoFormatoSessionBean();
		
		this.tipoformatoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoformatoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoformatoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.formatoSessionBean=new FormatoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFormatoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFormatoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFormatoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Formato  MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoFormatoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoFormato= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoFormato=new JButtonMe();
				this.jButtonModificarToolBarTipoFormato=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoFormato,this.jTtoolBarDetalleTipoFormato,
							"actualizar","actualizar","Actualizar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoFormato,this.jTtoolBarDetalleTipoFormato,
							"eliminar","eliminar","Eliminar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoFormato,this.jTtoolBarDetalleTipoFormato,
							"cancelar","cancelar","Cancelar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoFormato,this.jTtoolBarDetalleTipoFormato,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoFormato,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoFormato,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoFormato,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoFormato=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoFormato=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoFormato=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoFormato=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoFormato=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFormato= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFormato.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFormato,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoFormato= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoFormato.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoFormato,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoFormato= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoFormato.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoFormato,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoFormato= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoFormato.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoFormato,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoFormato= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoFormato.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoFormato,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoFormato= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFormato.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFormato,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFormato= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFormato.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFormato,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoFormato= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoFormato.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoFormato,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFormato= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFormato.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFormato,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFormato= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFormato.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFormato,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoFormato.add(this.jMenuItemDetalleCerrarTipoFormato);
		
		this.jmenuDetalleAccionesTipoFormato.add(this.jMenuItemActualizarTipoFormato);
		this.jmenuDetalleAccionesTipoFormato.add(this.jMenuItemEliminarTipoFormato);
		this.jmenuDetalleAccionesTipoFormato.add(this.jMenuItemCancelarTipoFormato);		
		
		//this.jmenuDetalleDatosTipoFormato.add(this.jMenuItemDetalleAbrirOrderByTipoFormato);				
		this.jmenuDetalleDatosTipoFormato.add(this.jMenuItemDetalleMostarOcultarTipoFormato);				
				
		//this.jmenuDetalleAccionesTipoFormato.add(this.jMenuItemGuardarCambiosTipoFormato);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoFormato.add(this.jmenuDetalleArchivoTipoFormato);		
		this.jmenuBarDetalleTipoFormato.add(this.jmenuDetalleAccionesTipoFormato);		
		this.jmenuBarDetalleTipoFormato.add(this.jmenuDetalleDatosTipoFormato);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoFormato.add(this.jmenuDetalleTipoFormato);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoFormato);				
	}
	
	
	public void inicializarElementosCamposTipoFormato() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoFormato = new JLabelMe();
		jLabelIdTipoFormato.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoFormato,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoFormato = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoFormato.setToolTipText(TipoFormatoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoFormato= new GridBagLayout();

		this.jPanelidTipoFormato.setLayout(this.gridaBagLayoutTipoFormato);

		jLabelidTipoFormato = new JLabel();
		jLabelidTipoFormato.setText("Id");

		jLabelidTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoFormato = new JLabelMe();
		this.jLabelnombreTipoFormato.setText(""+TipoFormatoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoFormato.setToolTipText("Nombre");
		this.jLabelnombreTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoFormato,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoFormato=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoFormato.setToolTipText(TipoFormatoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoFormato = new GridBagLayout();
		this.jPanelnombreTipoFormato.setLayout(this.gridaBagLayoutTipoFormato);


		jTextAreanombreTipoFormato= new JTextAreaMe();
		jTextAreanombreTipoFormato.setEnabled(false);
		jTextAreanombreTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFormato.setLineWrap(true);
		jTextAreanombreTipoFormato.setWrapStyleWord(true);
		jTextAreanombreTipoFormato.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoFormato.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoFormato,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoFormato = new JScrollPane(jTextAreanombreTipoFormato);
		jscrollPanenombreTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));

		this.jButtonnombreTipoFormatoBusqueda= new JButtonMe();
		this.jButtonnombreTipoFormatoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFormatoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFormatoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoFormatoBusqueda.setText("U");
		this.jButtonnombreTipoFormatoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoFormatoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoFormatoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoFormatoBusqueda"));

		if(this.tipoformatoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoFormatoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoFormato() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoFormato = new JLabelMe();
		this.jLabelid_empresaTipoFormato.setText(""+TipoFormatoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoFormato.setToolTipText("Empresa");
		this.jLabelid_empresaTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoFormato,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoFormato=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoFormato.setToolTipText(TipoFormatoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoFormato = new GridBagLayout();
		this.jPanelid_empresaTipoFormato.setLayout(this.gridaBagLayoutTipoFormato);


		jComboBoxid_empresaTipoFormato= new JComboBoxMe();
		jComboBoxid_empresaTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoFormato,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoFormato.setEnabled(false);

		this.jButtonid_empresaTipoFormato= new JButtonMe();
		this.jButtonid_empresaTipoFormato.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoFormato.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoFormato.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoFormato.setText("Buscar");
		this.jButtonid_empresaTipoFormato.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoFormato.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoFormato,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoFormato"));

		this.jButtonid_empresaTipoFormatoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoFormatoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoFormatoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoFormatoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoFormatoBusqueda.setText("U");
		this.jButtonid_empresaTipoFormatoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoFormatoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoFormatoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoFormatoBusqueda"));

		if(this.tipoformatoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoFormatoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoFormatoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoFormatoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoFormatoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoFormatoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoFormatoUpdate.setText("U");
		this.jButtonid_empresaTipoFormatoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoFormatoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoFormatoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoFormatoUpdate"));



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
		//this.jInternalFrameDetalleTipoFormato = new TipoFormatoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Formato  DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFormato= new GridBagLayout();
		

		
		String sToolTipTipoFormato="";
		sToolTipTipoFormato=TipoFormatoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFormato+="(Contabilidad.TipoFormato)";
		}
		
		if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFormato+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoFormato = new JButtonMe();
		this.jButtonModificarTipoFormato = new JButtonMe();
        this.jButtonActualizarTipoFormato = new JButtonMe();
        this.jButtonEliminarTipoFormato = new JButtonMe();
        this.jButtonCancelarTipoFormato = new JButtonMe();
        this.jButtonGuardarCambiosTipoFormato = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoFormato = new JButtonMe();
		this.jButtonCerrarTipoFormato = new JButtonMe();
		
		this.jScrollPanelDatosTipoFormato = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoFormato = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoFormato = new JScrollPane();
				
		
		
		this.jPanelCamposTipoFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Formato ";
		
		if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Formato s" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFormato.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoFormato.setName("jPanelCamposTipoFormato"); 

		this.jPanelCamposOcultosTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoFormato.setName("jPanelCamposOcultosTipoFormato"); 

        this.jPanelAccionesTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFormato.setToolTipText("Acciones");
        this.jPanelAccionesTipoFormato.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoFormato.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoFormato.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoFormato.setText("Nuevo");
		this.jButtonModificarTipoFormato.setText("Editar");
        this.jButtonActualizarTipoFormato.setText("Actualizar");
        this.jButtonEliminarTipoFormato.setText("Eliminar");
        this.jButtonCancelarTipoFormato.setText("Cancelar");
        this.jButtonGuardarCambiosTipoFormato.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoFormato.setText("Guardar");
		this.jButtonCerrarTipoFormato.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFormato,"nuevo_button","Nuevo",this.tipoformatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoFormato,"modificar_button","Editar",this.tipoformatoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoFormato,"actualizar_button","Actualizar",this.tipoformatoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoFormato,"eliminar_button","Eliminar",this.tipoformatoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoFormato,"cancelar_button","Cancelar",this.tipoformatoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoFormato,"guardarcambios_button","Guardar",this.tipoformatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFormato,"guardarcambiostabla_button","Guardar",this.tipoformatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFormato,"cerrar_button","Salir",this.tipoformatoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoFormato.setToolTipText("Nuevo"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoFormato.setToolTipText("Editar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoFormato.setToolTipText("Actualizar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoFormato.setToolTipText("Eliminar)"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoFormato.setToolTipText("Cancelar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoFormato.setToolTipText("Guardar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoFormato.setToolTipText("Guardar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFormato.setToolTipText("Salir"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFormato";
		inputMap = this.jButtonNuevoTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFormato.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFormato"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoFormato";
		inputMap = this.jButtonActualizarTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoFormato"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoFormato";
		inputMap = this.jButtonEliminarTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoFormato"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoFormato";
		inputMap = this.jButtonCancelarTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoFormato"));
		
		//CERRAR		
		sMapKey = "CerrarTipoFormato";
		inputMap = this.jButtonCerrarTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFormato"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFormato";
		inputMap = this.jButtonGuardarCambiosTablaTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFormato"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoFormato = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoFormato.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoFormato.setToolTipText("Nuevo TipoFormato");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoFormato = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoFormato.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoFormato.setToolTipText("Sin Cerrar Ventana TipoFormato");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoFormato = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoFormato.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoFormato.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoFormato = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFormato.setText("Accion");
		this.jComboBoxTiposAccionesTipoFormato.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoFormato = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoFormato.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoFormato.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoFormato = new JLabelMe();
		
		this.jLabelAccionesTipoFormato.setText("Acciones");		
		this.jLabelAccionesTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoFormato();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoFormato();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoFormato=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoFormato,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoFormato.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFormato.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFormato.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoFormato.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFormato.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFormato.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoFormato = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoFormato = new GridBagLayout();
		
		this.jPanelCamposTipoFormato.setLayout(gridaBagLayoutCamposTipoFormato);
		this.jPanelCamposOcultosTipoFormato.setLayout(gridaBagLayoutCamposOcultosTipoFormato);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoFormato = new GridBagConstraints();
	this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormato.gridy = 0;
	this.gridBagConstraintsTipoFormato.gridx = 0;
	this.gridBagConstraintsTipoFormato.ipadx = 0;
	this.gridBagConstraintsTipoFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoFormato.add(jLabelIdTipoFormato, this.gridBagConstraintsTipoFormato);



	this.gridBagConstraintsTipoFormato = new GridBagConstraints();
	this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormato.gridy = 0;
	this.gridBagConstraintsTipoFormato.gridx = 1;
	this.gridBagConstraintsTipoFormato.ipadx = 0;
	this.gridBagConstraintsTipoFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoFormato.add(jLabelidTipoFormato, this.gridBagConstraintsTipoFormato);


	this.gridBagConstraintsTipoFormato = new GridBagConstraints();
	this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormato.gridy = 0;
	this.gridBagConstraintsTipoFormato.gridx = 0;
	this.gridBagConstraintsTipoFormato.ipadx = 0;
	this.gridBagConstraintsTipoFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoFormato.add(jLabelid_empresaTipoFormato, this.gridBagConstraintsTipoFormato);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormato.gridy = 0;
		this.gridBagConstraintsTipoFormato.gridx = 2;
		this.gridBagConstraintsTipoFormato.ipadx = 0;
		this.gridBagConstraintsTipoFormato.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoFormato.add(jButtonid_empresaTipoFormatoBusqueda, this.gridBagConstraintsTipoFormato);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormato.gridy = 0;
		this.gridBagConstraintsTipoFormato.gridx = 3;
		this.gridBagConstraintsTipoFormato.ipadx = 0;
		this.gridBagConstraintsTipoFormato.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoFormato.add(jButtonid_empresaTipoFormatoUpdate, this.gridBagConstraintsTipoFormato);
	}

	this.gridBagConstraintsTipoFormato = new GridBagConstraints();
	this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormato.gridy = 0;
	this.gridBagConstraintsTipoFormato.gridx = 1;
	this.gridBagConstraintsTipoFormato.ipadx = 0;
	this.gridBagConstraintsTipoFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoFormato.add(jComboBoxid_empresaTipoFormato, this.gridBagConstraintsTipoFormato);


	this.gridBagConstraintsTipoFormato = new GridBagConstraints();
	this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormato.gridy = 0;
	this.gridBagConstraintsTipoFormato.gridx = 0;
	this.gridBagConstraintsTipoFormato.ipadx = 0;
	this.gridBagConstraintsTipoFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoFormato.add(jLabelnombreTipoFormato, this.gridBagConstraintsTipoFormato);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormato.gridy = 0;
		this.gridBagConstraintsTipoFormato.gridx = 2;
		this.gridBagConstraintsTipoFormato.ipadx = 0;
		this.gridBagConstraintsTipoFormato.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoFormato.add(jButtonnombreTipoFormatoBusqueda, this.gridBagConstraintsTipoFormato);
	}

	this.gridBagConstraintsTipoFormato = new GridBagConstraints();
	this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormato.gridy = 0;
	this.gridBagConstraintsTipoFormato.gridx = 1;
	this.gridBagConstraintsTipoFormato.ipadx = 0;
	this.gridBagConstraintsTipoFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoFormato.add(jscrollPanenombreTipoFormato, this.gridBagConstraintsTipoFormato);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoFormato = new GridBagConstraints();
	this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormato.gridy = iYPanelCamposTipoFormato;
	this.gridBagConstraintsTipoFormato.gridx = iXPanelCamposTipoFormato++;
	this.gridBagConstraintsTipoFormato.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormato.add(this.jPanelidTipoFormato, this.gridBagConstraintsTipoFormato);



	if(iXPanelCamposTipoFormato % 1==0) {
		iXPanelCamposTipoFormato=0;
		iYPanelCamposTipoFormato++;
	}
	this.gridBagConstraintsTipoFormato = new GridBagConstraints();
	this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormato.gridy = iYPanelCamposTipoFormato;
	this.gridBagConstraintsTipoFormato.gridx = iXPanelCamposTipoFormato++;
	this.gridBagConstraintsTipoFormato.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormato.add(this.jPanelnombreTipoFormato, this.gridBagConstraintsTipoFormato);



	if(iXPanelCamposTipoFormato % 1==0) {
		iXPanelCamposTipoFormato=0;
		iYPanelCamposTipoFormato++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoFormato = new GridBagConstraints();
	this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormato.gridy = iYPanelCamposOcultosTipoFormato;
	this.gridBagConstraintsTipoFormato.gridx = iXPanelCamposOcultosTipoFormato++;
	this.gridBagConstraintsTipoFormato.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoFormato.add(this.jPanelid_empresaTipoFormato, this.gridBagConstraintsTipoFormato);



	if(iXPanelCamposOcultosTipoFormato % 1==0) {
		iXPanelCamposOcultosTipoFormato=0;
		iYPanelCamposOcultosTipoFormato++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesTipoFormato= new GridBagLayout();
		this.jPanelAccionesTipoFormato.setLayout(gridaBagLayoutAccionesTipoFormato);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoFormato= new GridBagLayout();
		this.jPanelAccionesFormularioTipoFormato.setLayout(gridaBagLayoutAccionesFormularioTipoFormato);
		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFormato.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFormato.add(this.jComboBoxTiposAccionesFormularioTipoFormato, this.gridBagConstraintsTipoFormato);

		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFormato.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFormato.add(this.jCheckBoxPostAccionNuevoTipoFormato, this.gridBagConstraintsTipoFormato);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoformatoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFormato.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFormato.add(this.jCheckBoxPostAccionSinCerrarTipoFormato, this.gridBagConstraintsTipoFormato);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoformatoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFormato.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFormato.add(this.jCheckBoxPostAccionSinMensajeTipoFormato, this.gridBagConstraintsTipoFormato);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormato.gridy = 0;
		this.gridBagConstraintsTipoFormato.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoFormato.add(this.jButtonModificarTipoFormato, this.gridBagConstraintsTipoFormato);							

		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormato.gridy = 0;
		this.gridBagConstraintsTipoFormato.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoFormato.add(this.jButtonEliminarTipoFormato, this.gridBagConstraintsTipoFormato);
		
			
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy = 0;		
		this.gridBagConstraintsTipoFormato.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFormato.add(this.jButtonActualizarTipoFormato, this.gridBagConstraintsTipoFormato);


		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy = 0;		
		this.gridBagConstraintsTipoFormato.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFormato.add(this.jButtonGuardarCambiosTipoFormato, this.gridBagConstraintsTipoFormato);	
		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy = 0;		
		this.gridBagConstraintsTipoFormato.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoFormato.add(this.jButtonCancelarTipoFormato, this.gridBagConstraintsTipoFormato);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFormato = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFormato);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoformatoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();						
			this.gridBagConstraintsTipoFormato.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFormato.gridx = 0;		
			//this.gridBagConstraintsTipoFormato.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFormato.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFormato.gridx =0;
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFormato.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFormato, this.gridBagConstraintsTipoFormato);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoFormatoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoFormato = new TipoFormatoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Formato  DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Formato  DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Formato  Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoFormatoModel tipoformatoModel=new TipoFormatoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoFormatoModel.TipoFormatoFocusTraversalPolicy tipoformatoFocusTraversalPolicy = tipoformatoModel.new TipoFormatoFocusTraversalPolicy(this);
			
			//tipoformatoFocusTraversalPolicy.settipoformatoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoformatoModel);
			
			
			this.jContentPaneDetalleTipoFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoFormato = new GridBagLayout();	
			this.jContentPaneDetalleTipoFormato.setLayout(gridaBagLayoutDetalleTipoFormato);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFormato = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoFormato = new GridBagConstraints();
				this.gridBagConstraintsTipoFormato.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoFormato.gridx = 0;
					
				
				this.jContentPaneDetalleTipoFormato.add(jTtoolBarDetalleTipoFormato, gridBagConstraintsTipoFormato);								
				
}
			
			this.jScrollPanelDatosEdicionTipoFormato=   new JScrollPane(jContentPaneDetalleTipoFormato,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFormato.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFormato.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFormato.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoFormato=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFormato.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFormato.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFormato.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoFormato.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoFormato.gridx = 0;
	        
			this.jContentPaneDetalleTipoFormato.add(jPanelCamposTipoFormato, gridBagConstraintsTipoFormato);
			
			
			
			
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
						&& tipoformatoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFormato(this.puedeCargarPorParteFormato,false,-1);
					
					if(this.tipoformatoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoFormato= new GridBagConstraints();
						this.gridBagConstraintsTipoFormato.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoFormato.gridx = 0;
						this.jContentPaneDetalleTipoFormato.add(this.jTabbedPaneRelacionesTipoFormato, this.gridBagConstraintsTipoFormato);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoFormato.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFormato(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoFormato.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoFormato = new GridBagConstraints();
					this.gridBagConstraintsTipoFormato.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoFormato.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoFormato.gridx = 0;
					
				
					this.jContentPaneDetalleTipoFormato.add(jPanelCamposOcultosTipoFormato, gridBagConstraintsTipoFormato);
				
					this.jPanelCamposOcultosTipoFormato.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoFormato.gridx = 0;
	        this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoFormato.add(this.jPanelAccionesFormularioTipoFormato, this.gridBagConstraintsTipoFormato);							
			
			
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
	        this.gridBagConstraintsTipoFormato.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoFormato.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoFormato.add(this.jPanelAccionesTipoFormato, this.gridBagConstraintsTipoFormato);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoFormato);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoFormato=   new JScrollPane(this.jPanelCamposTipoFormato,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFormato.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFormato.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFormato.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoFormato.gridx = 0;
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoFormato.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoFormato, this.gridBagConstraintsTipoFormato);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFormato.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoFormato, this.gridBagConstraintsTipoFormato);			
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFormato.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoFormato, this.gridBagConstraintsTipoFormato);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormato.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFormato, this.gridBagConstraintsTipoFormato);
			
			
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormato.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFormato, this.gridBagConstraintsTipoFormato);
		
			
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormato.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFormato, this.gridBagConstraintsTipoFormato);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoFormato;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoFormato;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFormato(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formatoSessionBean=new FormatoSessionBean();
		this.formatoSessionBean.setConGuardarRelaciones(false);
		this.formatoSessionBean.setEsGuardarRelacionado(true);

		this.formatoBeanSwingJInternalFrame=null;//new FormatoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formatoBeanSwingJInternalFramePopup=new FormatoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formatoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formatoSessionBean.getEsGuardarRelacionado()) {

				FormatoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoFormatoJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormatoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoFormatoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formatoSessionBean.setEsGuardarRelacionado(true);

				this.formatoBeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formatoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formatoBeanSwingJInternalFrame.setformatoSessionBean(this.formatoSessionBean);

				//this.gridBagConstraintsTipoFormato = new GridBagConstraints();
				//this.gridBagConstraintsTipoFormato.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoFormato.gridx = 0;
				//this.jContentPaneDetalleTipoFormato.add(this.formatoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoFormato);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoFormato.add("Formatoes",this.formatoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoFormato.setComponentAt(iIndexTab,this.formatoBeanSwingJInternalFrame.getContentPane());
				}

				//FormatoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formatoSessionBean.setEsGuardarRelacionado(false);
				this.formatoBeanSwingJInternalFrame=null;//new FormatoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formatoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormato) {
					this.jTabbedPaneRelacionesTipoFormato.add("Formatoes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFormatoBeanSwingJInternalFrame(List<TipoFormato> tipoformatos,TipoFormato tipoformato,FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formatoBeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formatoBeanSwingJInternalFrame.getFormatoLogic().setConnexion(this.tipoformatoLogic.getConnexion());

					formatoBeanSwingJInternalFrame.settipoformatosForeignKey(tipoformatos);
					formatoBeanSwingJInternalFrame.settipoformatoForeignKey(tipoformato);
					formatoBeanSwingJInternalFrame.formatoSessionBean.setisBusquedaDesdeForeignKeySesionTipoFormato(true);
					formatoBeanSwingJInternalFrame.formatoSessionBean.setlidTipoFormatoActual(tipoformato.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formatoBeanSwingJInternalFrame.cargarCombosForeignKeyFormato(formatoBeanSwingJInternalFrame.isCargarCombosDependencia);
					formatoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoFormato(true);
					formatoBeanSwingJInternalFrame.setid_tipo_formatoFK_IdTipoFormato(tipoformato.getId());

					if(!this.conCargarFormDetalle) {
						formatoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formatoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoFormatoForeignKey(tipoformato,1,false,true,true);
					formatoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formatoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoFormato");
					formatoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoFormato");
					formatoBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato(true);
					formatoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormato("n",formatoBeanSwingJInternalFrame.isGuardarCambiosEnLote, formatoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formatoBeanSwingJInternalFrame.setAutoscrolls(true);
					formatoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formatoBeanSwingJInternalFrame.actualizarEstadoPanelsFormato("relacionado");
					} else {
						formatoBeanSwingJInternalFrame.actualizarEstadoPanelsFormato("no_relacionado");
					}

					formatoBeanSwingJInternalFrame.getjButtonRecargarInformacionFormato().setVisible(false);

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
