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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.TipoMermaConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class TipoMermaDetalleFormJInternalFrame extends TipoMermaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoMerma;
	
	protected JMenuBar jmenuBarDetalleTipoMerma;
	
	protected JMenu jmenuDetalleTipoMerma;
	protected JMenu jmenuDetalleArchivoTipoMerma;
	protected JMenu jmenuDetalleAccionesTipoMerma;
	protected JMenu jmenuDetalleDatosTipoMerma;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMerma;	
	protected GridBagConstraints gridBagConstraintsTipoMerma;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoMermaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoMerma;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoMermaSessionBean tipomermaSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;	
	
	public TipoMermaLogic tipomermaLogic;
	
	public JScrollPane jScrollPanelDatosTipoMerma;
	public JScrollPane jScrollPanelDatosEdicionTipoMerma;
	public JScrollPane jScrollPanelDatosGeneralTipoMerma;
	
	protected JPanel jPanelCamposTipoMerma;    
	protected JPanel jPanelCamposOcultosTipoMerma;    	
	protected JPanel jPanelAccionesTipoMerma;
	protected JPanel jPanelAccionesFormularioTipoMerma;
    
	
	
	protected Integer iXPanelCamposTipoMerma=0;
	protected Integer iYPanelCamposTipoMerma=0;
	
	protected Integer iXPanelCamposOcultosTipoMerma=0;
	protected Integer iYPanelCamposOcultosTipoMerma=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoMerma;
	public JButton jButtonModificarTipoMerma;
	public JButton jButtonActualizarTipoMerma;
    public JButton jButtonEliminarTipoMerma;
	public JButton jButtonCancelarTipoMerma;
    public JButton jButtonGuardarCambiosTipoMerma;
	public JButton jButtonGuardarCambiosTablaTipoMerma;
	protected JButton jButtonCerrarTipoMerma;
	
	
	protected JButton jButtonProcesarInformacionTipoMerma;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoMerma;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoMerma;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoMerma;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMerma;
	protected JButton jButtonModificarToolBarTipoMerma;
	protected JButton jButtonActualizarToolBarTipoMerma;
    protected JButton jButtonEliminarToolBarTipoMerma;
	protected JButton jButtonCancelarToolBarTipoMerma;
    protected JButton jButtonGuardarCambiosToolBarTipoMerma;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoMerma;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMerma;
	protected JButton jButtonCerrarToolBarTipoMerma;
	
	protected JButton jButtonProcesarInformacionToolBarTipoMerma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMerma;
	protected JMenuItem jMenuItemModificarTipoMerma;
	protected JMenuItem jMenuItemActualizarTipoMerma;
    protected JMenuItem jMenuItemEliminarTipoMerma;
	protected JMenuItem jMenuItemCancelarTipoMerma;
    protected JMenuItem jMenuItemGuardarCambiosTipoMerma;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMerma;
	protected JMenuItem jMenuItemCerrarTipoMerma;
	protected JMenuItem jMenuItemDetalleCerrarTipoMerma;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMerma;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoMerma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMerma;
	protected JMenuItem jMenuItemMostrarOcultarTipoMerma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMerma;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMerma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMerma;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoMerma;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoMerma;
	public JLabel jLabelIdTipoMerma;
	public JTextFieldMe jTextFieldidTipoMerma;
	public JButton jButtonidTipoMermaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoMerma;
	public JLabel jLabelnombreTipoMerma;
	public JTextArea jTextAreanombreTipoMerma;
	public JScrollPane jscrollPanenombreTipoMerma;
	public JButton jButtonnombreTipoMermaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoMerma;
	public JLabel jLabeldescripcionTipoMerma;
	public JTextArea jTextAreadescripcionTipoMerma;
	public JScrollPane jscrollPanedescripcionTipoMerma;
	public JButton jButtondescripcionTipoMermaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisTipoMerma;
	public JLabel jLabelid_paisTipoMerma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTipoMerma;
	public JButton jButtonid_paisTipoMerma= new JButtonMe();
	public JButton jButtonid_paisTipoMermaUpdate= new JButtonMe();
	public JButton jButtonid_paisTipoMermaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoMerma;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoMermaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoMerma=new JPanel();
				this.jPanelAccionesFormularioTipoMerma=new JPanel();
				this.jmenuBarDetalleTipoMerma=new JMenuBar();
				this.jTtoolBarDetalleTipoMerma=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMermaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoMermaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMermaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMermaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMermaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoMerma() {
		return this.jButtonActualizarToolBarTipoMerma;
	}
	
	public JButton getjButtonEliminarToolBarTipoMerma() {
		return this.jButtonEliminarToolBarTipoMerma;
	}
	
	public JButton getjButtonCancelarToolBarTipoMerma() {
		return this.jButtonCancelarToolBarTipoMerma;
	}		
	
	public JButton getjButtonProcesarInformacionTipoMerma() {
		return this.jButtonProcesarInformacionTipoMerma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMerma)	{
		this.jButtonProcesarInformacionTipoMerma = jButtonProcesarInformacionTipoMerma;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMerma() {
		return this.jComboBoxTiposAccionesTipoMerma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMerma(
			JComboBox jComboBoxTiposRelacionesTipoMerma) {
		this.jComboBoxTiposRelacionesTipoMerma = jComboBoxTiposRelacionesTipoMerma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMerma(
			JComboBox jComboBoxTiposAccionesTipoMerma) {
		this.jComboBoxTiposAccionesTipoMerma = jComboBoxTiposAccionesTipoMerma;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoMerma() {
		return this.jComboBoxTiposAccionesFormularioTipoMerma;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoMerma(
			JComboBox jComboBoxTiposAccionesFormularioTipoMerma) {
		this.jComboBoxTiposAccionesFormularioTipoMerma = jComboBoxTiposAccionesFormularioTipoMerma;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipomermaSessionBean=new TipoMermaSessionBean();
		
		this.tipomermaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomermaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomermaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMermaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMermaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMermaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Merma MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoMermaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoMerma= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoMerma=new JButtonMe();
				this.jButtonModificarToolBarTipoMerma=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoMerma,this.jTtoolBarDetalleTipoMerma,
							"actualizar","actualizar","Actualizar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoMerma,this.jTtoolBarDetalleTipoMerma,
							"eliminar","eliminar","Eliminar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoMerma,this.jTtoolBarDetalleTipoMerma,
							"cancelar","cancelar","Cancelar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoMerma,this.jTtoolBarDetalleTipoMerma,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoMerma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoMerma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoMerma,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoMerma=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoMerma=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoMerma=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoMerma=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoMerma=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMerma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMerma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMerma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoMerma= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoMerma.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoMerma,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoMerma= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoMerma.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoMerma,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoMerma= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoMerma.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoMerma,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoMerma= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoMerma.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoMerma,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoMerma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMerma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMerma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMerma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMerma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMerma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoMerma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoMerma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoMerma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMerma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMerma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMerma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMerma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMerma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMerma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoMerma.add(this.jMenuItemDetalleCerrarTipoMerma);
		
		this.jmenuDetalleAccionesTipoMerma.add(this.jMenuItemActualizarTipoMerma);
		this.jmenuDetalleAccionesTipoMerma.add(this.jMenuItemEliminarTipoMerma);
		this.jmenuDetalleAccionesTipoMerma.add(this.jMenuItemCancelarTipoMerma);		
		
		//this.jmenuDetalleDatosTipoMerma.add(this.jMenuItemDetalleAbrirOrderByTipoMerma);				
		this.jmenuDetalleDatosTipoMerma.add(this.jMenuItemDetalleMostarOcultarTipoMerma);				
				
		//this.jmenuDetalleAccionesTipoMerma.add(this.jMenuItemGuardarCambiosTipoMerma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoMerma.add(this.jmenuDetalleArchivoTipoMerma);		
		this.jmenuBarDetalleTipoMerma.add(this.jmenuDetalleAccionesTipoMerma);		
		this.jmenuBarDetalleTipoMerma.add(this.jmenuDetalleDatosTipoMerma);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoMerma);				
	}
	
	
	public void inicializarElementosCamposTipoMerma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoMerma = new JLabelMe();
		jLabelIdTipoMerma.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoMerma = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoMerma.setToolTipText(TipoMermaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoMerma= new GridBagLayout();

		this.jPanelidTipoMerma.setLayout(this.gridaBagLayoutTipoMerma);

		jTextFieldidTipoMerma = new JTextFieldMe();
		jTextFieldidTipoMerma.setText("Id");

		jTextFieldidTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoMerma = new JLabelMe();
		this.jLabelnombreTipoMerma.setText(""+TipoMermaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoMerma.setToolTipText("Nombre");
		this.jLabelnombreTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoMerma.setToolTipText(TipoMermaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoMerma = new GridBagLayout();
		this.jPanelnombreTipoMerma.setLayout(this.gridaBagLayoutTipoMerma);


		jTextAreanombreTipoMerma= new JTextAreaMe();
		jTextAreanombreTipoMerma.setEnabled(false);
		jTextAreanombreTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMerma.setLineWrap(true);
		jTextAreanombreTipoMerma.setWrapStyleWord(true);
		jTextAreanombreTipoMerma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoMerma.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoMerma = new JScrollPane(jTextAreanombreTipoMerma);
		jscrollPanenombreTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoMermaBusqueda= new JButtonMe();
		this.jButtonnombreTipoMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoMermaBusqueda.setText("U");
		this.jButtonnombreTipoMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoMermaBusqueda"));

		if(this.tipomermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoMermaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoMerma = new JLabelMe();
		this.jLabeldescripcionTipoMerma.setText(""+TipoMermaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionTipoMerma.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoMerma.setToolTipText(TipoMermaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoMerma = new GridBagLayout();
		this.jPaneldescripcionTipoMerma.setLayout(this.gridaBagLayoutTipoMerma);


		jTextAreadescripcionTipoMerma= new JTextAreaMe();
		jTextAreadescripcionTipoMerma.setEnabled(false);
		jTextAreadescripcionTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoMerma.setLineWrap(true);
		jTextAreadescripcionTipoMerma.setWrapStyleWord(true);
		jTextAreadescripcionTipoMerma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoMerma.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoMerma = new JScrollPane(jTextAreadescripcionTipoMerma);
		jscrollPanedescripcionTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoMermaBusqueda= new JButtonMe();
		this.jButtondescripcionTipoMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoMermaBusqueda.setText("U");
		this.jButtondescripcionTipoMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoMermaBusqueda"));

		if(this.tipomermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoMermaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoMerma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisTipoMerma = new JLabelMe();
		this.jLabelid_paisTipoMerma.setText(""+TipoMermaConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTipoMerma.setToolTipText("Pais");
		this.jLabelid_paisTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTipoMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTipoMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTipoMerma.setToolTipText(TipoMermaConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTipoMerma = new GridBagLayout();
		this.jPanelid_paisTipoMerma.setLayout(this.gridaBagLayoutTipoMerma);


		jComboBoxid_paisTipoMerma= new JComboBoxMe();
		jComboBoxid_paisTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTipoMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTipoMerma= new JButtonMe();
		this.jButtonid_paisTipoMerma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoMerma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoMerma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoMerma.setText("Buscar");
		this.jButtonid_paisTipoMerma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTipoMerma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoMerma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTipoMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoMerma"));

		this.jButtonid_paisTipoMermaBusqueda= new JButtonMe();
		this.jButtonid_paisTipoMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoMermaBusqueda.setText("U");
		this.jButtonid_paisTipoMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTipoMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTipoMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoMermaBusqueda"));

		if(this.tipomermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTipoMermaBusqueda.setVisible(false);		}

		this.jButtonid_paisTipoMermaUpdate= new JButtonMe();
		this.jButtonid_paisTipoMermaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoMermaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoMermaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoMermaUpdate.setText("U");
		this.jButtonid_paisTipoMermaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTipoMermaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoMermaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTipoMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoMermaUpdate"));



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
		//this.jInternalFrameDetalleTipoMerma = new TipoMermaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Merma DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMerma= new GridBagLayout();
		

		
		String sToolTipTipoMerma="";
		sToolTipTipoMerma=TipoMermaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMerma+="(Produccion.TipoMerma)";
		}
		
		if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMerma+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoMerma = new JButtonMe();
		this.jButtonModificarTipoMerma = new JButtonMe();
        this.jButtonActualizarTipoMerma = new JButtonMe();
        this.jButtonEliminarTipoMerma = new JButtonMe();
        this.jButtonCancelarTipoMerma = new JButtonMe();
        this.jButtonGuardarCambiosTipoMerma = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoMerma = new JButtonMe();
		this.jButtonCerrarTipoMerma = new JButtonMe();
		
		this.jScrollPanelDatosTipoMerma = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoMerma = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoMerma = new JScrollPane();
				
		
		
		this.jPanelCamposTipoMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Merma";
		
		if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mermas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMerma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoMerma.setName("jPanelCamposTipoMerma"); 

		this.jPanelCamposOcultosTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoMerma.setName("jPanelCamposOcultosTipoMerma"); 

        this.jPanelAccionesTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMerma.setToolTipText("Acciones");
        this.jPanelAccionesTipoMerma.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoMerma.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoMerma.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoMerma.setText("Nuevo");
		this.jButtonModificarTipoMerma.setText("Editar");
        this.jButtonActualizarTipoMerma.setText("Actualizar");
        this.jButtonEliminarTipoMerma.setText("Eliminar");
        this.jButtonCancelarTipoMerma.setText("Cancelar");
        this.jButtonGuardarCambiosTipoMerma.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoMerma.setText("Guardar");
		this.jButtonCerrarTipoMerma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMerma,"nuevo_button","Nuevo",this.tipomermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoMerma,"modificar_button","Editar",this.tipomermaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoMerma,"actualizar_button","Actualizar",this.tipomermaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoMerma,"eliminar_button","Eliminar",this.tipomermaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoMerma,"cancelar_button","Cancelar",this.tipomermaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoMerma,"guardarcambios_button","Guardar",this.tipomermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMerma,"guardarcambiostabla_button","Guardar",this.tipomermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMerma,"cerrar_button","Salir",this.tipomermaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoMerma.setToolTipText("Nuevo"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoMerma.setToolTipText("Editar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoMerma.setToolTipText("Actualizar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoMerma.setToolTipText("Eliminar)"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoMerma.setToolTipText("Cancelar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoMerma.setToolTipText("Guardar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoMerma.setToolTipText("Guardar"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMerma.setToolTipText("Salir"+" "+TipoMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMerma";
		inputMap = this.jButtonNuevoTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMerma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMerma"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoMerma";
		inputMap = this.jButtonActualizarTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoMerma"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoMerma";
		inputMap = this.jButtonEliminarTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoMerma"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoMerma";
		inputMap = this.jButtonCancelarTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoMerma"));
		
		//CERRAR		
		sMapKey = "CerrarTipoMerma";
		inputMap = this.jButtonCerrarTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMerma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMerma";
		inputMap = this.jButtonGuardarCambiosTablaTipoMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMerma"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoMerma = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoMerma.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoMerma.setToolTipText("Nuevo TipoMerma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoMerma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoMerma.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoMerma.setToolTipText("Sin Cerrar Ventana TipoMerma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoMerma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoMerma.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoMerma.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoMerma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMerma.setText("Accion");
		this.jComboBoxTiposAccionesTipoMerma.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoMerma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoMerma.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoMerma.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoMerma = new JLabelMe();
		
		this.jLabelAccionesTipoMerma.setText("Acciones");		
		this.jLabelAccionesTipoMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoMerma();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoMerma();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoMerma=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoMerma,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoMerma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMerma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMerma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoMerma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMerma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMerma.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoMerma, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoMerma = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoMerma = new GridBagLayout();
		
		this.jPanelCamposTipoMerma.setLayout(gridaBagLayoutCamposTipoMerma);
		this.jPanelCamposOcultosTipoMerma.setLayout(gridaBagLayoutCamposOcultosTipoMerma);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoMerma = new GridBagConstraints();
	this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMerma.gridy = 0;
	this.gridBagConstraintsTipoMerma.gridx = 0;
	this.gridBagConstraintsTipoMerma.ipadx = 0;
	this.gridBagConstraintsTipoMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoMerma.add(jLabelIdTipoMerma, this.gridBagConstraintsTipoMerma);



	this.gridBagConstraintsTipoMerma = new GridBagConstraints();
	this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMerma.gridy = 0;
	this.gridBagConstraintsTipoMerma.gridx = 1;
	this.gridBagConstraintsTipoMerma.ipadx = 0;
	this.gridBagConstraintsTipoMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoMerma.add(jTextFieldidTipoMerma, this.gridBagConstraintsTipoMerma);


	this.gridBagConstraintsTipoMerma = new GridBagConstraints();
	this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMerma.gridy = 0;
	this.gridBagConstraintsTipoMerma.gridx = 0;
	this.gridBagConstraintsTipoMerma.ipadx = 0;
	this.gridBagConstraintsTipoMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTipoMerma.add(jLabelid_paisTipoMerma, this.gridBagConstraintsTipoMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		//this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMerma.gridy = 0;
		this.gridBagConstraintsTipoMerma.gridx = 2;
		this.gridBagConstraintsTipoMerma.ipadx = 0;
		this.gridBagConstraintsTipoMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoMerma.add(jButtonid_paisTipoMermaBusqueda, this.gridBagConstraintsTipoMerma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		//this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMerma.gridy = 0;
		this.gridBagConstraintsTipoMerma.gridx = 3;
		this.gridBagConstraintsTipoMerma.ipadx = 0;
		this.gridBagConstraintsTipoMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoMerma.add(jButtonid_paisTipoMermaUpdate, this.gridBagConstraintsTipoMerma);
	}

	this.gridBagConstraintsTipoMerma = new GridBagConstraints();
	this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMerma.gridy = 0;
	this.gridBagConstraintsTipoMerma.gridx = 1;
	this.gridBagConstraintsTipoMerma.ipadx = 0;
	this.gridBagConstraintsTipoMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTipoMerma.add(jComboBoxid_paisTipoMerma, this.gridBagConstraintsTipoMerma);


	this.gridBagConstraintsTipoMerma = new GridBagConstraints();
	this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMerma.gridy = 0;
	this.gridBagConstraintsTipoMerma.gridx = 0;
	this.gridBagConstraintsTipoMerma.ipadx = 0;
	this.gridBagConstraintsTipoMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoMerma.add(jLabelnombreTipoMerma, this.gridBagConstraintsTipoMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		//this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMerma.gridy = 0;
		this.gridBagConstraintsTipoMerma.gridx = 2;
		this.gridBagConstraintsTipoMerma.ipadx = 0;
		this.gridBagConstraintsTipoMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoMerma.add(jButtonnombreTipoMermaBusqueda, this.gridBagConstraintsTipoMerma);
	}

	this.gridBagConstraintsTipoMerma = new GridBagConstraints();
	this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMerma.gridy = 0;
	this.gridBagConstraintsTipoMerma.gridx = 1;
	this.gridBagConstraintsTipoMerma.ipadx = 0;
	this.gridBagConstraintsTipoMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoMerma.add(jscrollPanenombreTipoMerma, this.gridBagConstraintsTipoMerma);


	this.gridBagConstraintsTipoMerma = new GridBagConstraints();
	this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMerma.gridy = 0;
	this.gridBagConstraintsTipoMerma.gridx = 0;
	this.gridBagConstraintsTipoMerma.ipadx = 0;
	this.gridBagConstraintsTipoMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoMerma.add(jLabeldescripcionTipoMerma, this.gridBagConstraintsTipoMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		//this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMerma.gridy = 0;
		this.gridBagConstraintsTipoMerma.gridx = 2;
		this.gridBagConstraintsTipoMerma.ipadx = 0;
		this.gridBagConstraintsTipoMerma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoMerma.add(jButtondescripcionTipoMermaBusqueda, this.gridBagConstraintsTipoMerma);
	}

	this.gridBagConstraintsTipoMerma = new GridBagConstraints();
	this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMerma.gridy = 0;
	this.gridBagConstraintsTipoMerma.gridx = 1;
	this.gridBagConstraintsTipoMerma.ipadx = 0;
	this.gridBagConstraintsTipoMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoMerma.add(jscrollPanedescripcionTipoMerma, this.gridBagConstraintsTipoMerma);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoMerma = new GridBagConstraints();
	this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMerma.gridy = iYPanelCamposTipoMerma;
	this.gridBagConstraintsTipoMerma.gridx = iXPanelCamposTipoMerma++;
	this.gridBagConstraintsTipoMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMerma.add(this.jPanelidTipoMerma, this.gridBagConstraintsTipoMerma);



	if(iXPanelCamposTipoMerma % 1==0) {
		iXPanelCamposTipoMerma=0;
		iYPanelCamposTipoMerma++;
	}
	this.gridBagConstraintsTipoMerma = new GridBagConstraints();
	this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMerma.gridy = iYPanelCamposTipoMerma;
	this.gridBagConstraintsTipoMerma.gridx = iXPanelCamposTipoMerma++;
	this.gridBagConstraintsTipoMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMerma.add(this.jPanelid_paisTipoMerma, this.gridBagConstraintsTipoMerma);



	if(iXPanelCamposTipoMerma % 1==0) {
		iXPanelCamposTipoMerma=0;
		iYPanelCamposTipoMerma++;
	}
	this.gridBagConstraintsTipoMerma = new GridBagConstraints();
	this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMerma.gridy = iYPanelCamposTipoMerma;
	this.gridBagConstraintsTipoMerma.gridx = iXPanelCamposTipoMerma++;
	this.gridBagConstraintsTipoMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMerma.add(this.jPanelnombreTipoMerma, this.gridBagConstraintsTipoMerma);



	if(iXPanelCamposTipoMerma % 1==0) {
		iXPanelCamposTipoMerma=0;
		iYPanelCamposTipoMerma++;
	}
	this.gridBagConstraintsTipoMerma = new GridBagConstraints();
	this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMerma.gridy = iYPanelCamposTipoMerma;
	this.gridBagConstraintsTipoMerma.gridx = iXPanelCamposTipoMerma++;
	this.gridBagConstraintsTipoMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMerma.add(this.jPaneldescripcionTipoMerma, this.gridBagConstraintsTipoMerma);



	if(iXPanelCamposTipoMerma % 1==0) {
		iXPanelCamposTipoMerma=0;
		iYPanelCamposTipoMerma++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoMerma= new GridBagLayout();
		this.jPanelAccionesTipoMerma.setLayout(gridaBagLayoutAccionesTipoMerma);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoMerma= new GridBagLayout();
		this.jPanelAccionesFormularioTipoMerma.setLayout(gridaBagLayoutAccionesFormularioTipoMerma);
		
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMerma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMerma.add(this.jComboBoxTiposAccionesFormularioTipoMerma, this.gridBagConstraintsTipoMerma);

		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMerma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMerma.add(this.jCheckBoxPostAccionNuevoTipoMerma, this.gridBagConstraintsTipoMerma);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipomermaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMerma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMerma.add(this.jCheckBoxPostAccionSinCerrarTipoMerma, this.gridBagConstraintsTipoMerma);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipomermaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipomermaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMerma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMerma.add(this.jCheckBoxPostAccionSinMensajeTipoMerma, this.gridBagConstraintsTipoMerma);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMerma.gridy = 0;
		this.gridBagConstraintsTipoMerma.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoMerma.add(this.jButtonModificarTipoMerma, this.gridBagConstraintsTipoMerma);							

		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMerma.gridy = 0;
		this.gridBagConstraintsTipoMerma.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoMerma.add(this.jButtonEliminarTipoMerma, this.gridBagConstraintsTipoMerma);
		
			
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy = 0;		
		this.gridBagConstraintsTipoMerma.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMerma.add(this.jButtonActualizarTipoMerma, this.gridBagConstraintsTipoMerma);


		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy = 0;		
		this.gridBagConstraintsTipoMerma.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMerma.add(this.jButtonGuardarCambiosTipoMerma, this.gridBagConstraintsTipoMerma);	
		
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy = 0;		
		this.gridBagConstraintsTipoMerma.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoMerma.add(this.jButtonCancelarTipoMerma, this.gridBagConstraintsTipoMerma);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMerma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMerma);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomermaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();						
			this.gridBagConstraintsTipoMerma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMerma.gridx = 0;		
			//this.gridBagConstraintsTipoMerma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMerma.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMerma.gridx =0;
		this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMerma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMerma, this.gridBagConstraintsTipoMerma);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoMermaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoMerma = new TipoMermaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Merma DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Merma DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Merma Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoMermaModel tipomermaModel=new TipoMermaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoMermaModel.TipoMermaFocusTraversalPolicy tipomermaFocusTraversalPolicy = tipomermaModel.new TipoMermaFocusTraversalPolicy(this);
			
			//tipomermaFocusTraversalPolicy.settipomermaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipomermaModel);
			
			
			this.jContentPaneDetalleTipoMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoMerma = new GridBagLayout();	
			this.jContentPaneDetalleTipoMerma.setLayout(gridaBagLayoutDetalleTipoMerma);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMerma = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoMerma = new GridBagConstraints();
				this.gridBagConstraintsTipoMerma.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoMerma.gridx = 0;
					
				
				this.jContentPaneDetalleTipoMerma.add(jTtoolBarDetalleTipoMerma, gridBagConstraintsTipoMerma);								
				
}
			
			this.jScrollPanelDatosEdicionTipoMerma=   new JScrollPane(jContentPaneDetalleTipoMerma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMerma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMerma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMerma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoMerma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMerma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMerma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMerma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoMerma.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoMerma.gridx = 0;
	        
			this.jContentPaneDetalleTipoMerma.add(jPanelCamposTipoMerma, gridBagConstraintsTipoMerma);
			
			
			
			
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
						&& tipomermaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipomermaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoMerma= new GridBagConstraints();
						this.gridBagConstraintsTipoMerma.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoMerma.gridx = 0;
						this.jContentPaneDetalleTipoMerma.add(this.jTabbedPaneRelacionesTipoMerma, this.gridBagConstraintsTipoMerma);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoMerma.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoMerma.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoMerma = new GridBagConstraints();
					this.gridBagConstraintsTipoMerma.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoMerma.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoMerma.gridx = 0;
					
				
					this.jContentPaneDetalleTipoMerma.add(jPanelCamposOcultosTipoMerma, gridBagConstraintsTipoMerma);
				
					this.jPanelCamposOcultosTipoMerma.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoMerma.gridx = 0;
	        this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoMerma.add(this.jPanelAccionesFormularioTipoMerma, this.gridBagConstraintsTipoMerma);							
			
			
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
	        this.gridBagConstraintsTipoMerma.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoMerma.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoMerma.add(this.jPanelAccionesTipoMerma, this.gridBagConstraintsTipoMerma);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoMerma);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoMerma=   new JScrollPane(this.jPanelCamposTipoMerma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMerma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMerma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMerma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoMerma.gridx = 0;
			this.gridBagConstraintsTipoMerma.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoMerma.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoMerma.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoMerma, this.gridBagConstraintsTipoMerma);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMerma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoMerma, this.gridBagConstraintsTipoMerma);			
			
			this.gridBagConstraintsTipoMerma = new GridBagConstraints();
			this.gridBagConstraintsTipoMerma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMerma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoMerma, this.gridBagConstraintsTipoMerma);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMerma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMerma, this.gridBagConstraintsTipoMerma);
			
			
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMerma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMerma, this.gridBagConstraintsTipoMerma);
		
			
		this.gridBagConstraintsTipoMerma = new GridBagConstraints();
		this.gridBagConstraintsTipoMerma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMerma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMerma, this.gridBagConstraintsTipoMerma);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoMerma;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoMerma;
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
