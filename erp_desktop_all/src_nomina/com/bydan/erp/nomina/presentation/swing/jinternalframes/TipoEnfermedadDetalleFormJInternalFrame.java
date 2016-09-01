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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoEnfermedadConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoEnfermedadDetalleFormJInternalFrame extends TipoEnfermedadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoEnfermedad;
	
	protected JMenuBar jmenuBarDetalleTipoEnfermedad;
	
	protected JMenu jmenuDetalleTipoEnfermedad;
	protected JMenu jmenuDetalleArchivoTipoEnfermedad;
	protected JMenu jmenuDetalleAccionesTipoEnfermedad;
	protected JMenu jmenuDetalleDatosTipoEnfermedad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoEnfermedad;	
	protected GridBagConstraints gridBagConstraintsTipoEnfermedad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoEnfermedadBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoEnfermedad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoEnfermedadSessionBean tipoenfermedadSessionBean;
	
	

	public EnfermedadBeanSwingJInternalFrame enfermedadBeanSwingJInternalFrame=null;
	public EnfermedadBeanSwingJInternalFrame enfermedadBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEnfermedad=false;
	public EnfermedadSessionBean enfermedadSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoEnfermedadLogic tipoenfermedadLogic;
	
	public JScrollPane jScrollPanelDatosTipoEnfermedad;
	public JScrollPane jScrollPanelDatosEdicionTipoEnfermedad;
	public JScrollPane jScrollPanelDatosGeneralTipoEnfermedad;
	
	protected JPanel jPanelCamposTipoEnfermedad;    
	protected JPanel jPanelCamposOcultosTipoEnfermedad;    	
	protected JPanel jPanelAccionesTipoEnfermedad;
	protected JPanel jPanelAccionesFormularioTipoEnfermedad;
    
	
	
	protected Integer iXPanelCamposTipoEnfermedad=0;
	protected Integer iYPanelCamposTipoEnfermedad=0;
	
	protected Integer iXPanelCamposOcultosTipoEnfermedad=0;
	protected Integer iYPanelCamposOcultosTipoEnfermedad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoEnfermedad;
	public JButton jButtonModificarTipoEnfermedad;
	public JButton jButtonActualizarTipoEnfermedad;
    public JButton jButtonEliminarTipoEnfermedad;
	public JButton jButtonCancelarTipoEnfermedad;
    public JButton jButtonGuardarCambiosTipoEnfermedad;
	public JButton jButtonGuardarCambiosTablaTipoEnfermedad;
	protected JButton jButtonCerrarTipoEnfermedad;
	
	
	protected JButton jButtonProcesarInformacionTipoEnfermedad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoEnfermedad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoEnfermedad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoEnfermedad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoEnfermedad;
	protected JButton jButtonModificarToolBarTipoEnfermedad;
	protected JButton jButtonActualizarToolBarTipoEnfermedad;
    protected JButton jButtonEliminarToolBarTipoEnfermedad;
	protected JButton jButtonCancelarToolBarTipoEnfermedad;
    protected JButton jButtonGuardarCambiosToolBarTipoEnfermedad;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoEnfermedad;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoEnfermedad;
	protected JButton jButtonCerrarToolBarTipoEnfermedad;
	
	protected JButton jButtonProcesarInformacionToolBarTipoEnfermedad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoEnfermedad;
	protected JMenuItem jMenuItemModificarTipoEnfermedad;
	protected JMenuItem jMenuItemActualizarTipoEnfermedad;
    protected JMenuItem jMenuItemEliminarTipoEnfermedad;
	protected JMenuItem jMenuItemCancelarTipoEnfermedad;
    protected JMenuItem jMenuItemGuardarCambiosTipoEnfermedad;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoEnfermedad;
	protected JMenuItem jMenuItemCerrarTipoEnfermedad;
	protected JMenuItem jMenuItemDetalleCerrarTipoEnfermedad;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoEnfermedad;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoEnfermedad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoEnfermedad;
	protected JMenuItem jMenuItemMostrarOcultarTipoEnfermedad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoEnfermedad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoEnfermedad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoEnfermedad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoEnfermedad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoEnfermedad;
	public JLabel jLabelIdTipoEnfermedad;
	public JLabel jLabelidTipoEnfermedad;
	public JButton jButtonidTipoEnfermedadBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoEnfermedad;
	public JLabel jLabelcodigoTipoEnfermedad;
	public JTextField jTextFieldcodigoTipoEnfermedad;
	public JButton jButtoncodigoTipoEnfermedadBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoEnfermedad;
	public JLabel jLabelnombreTipoEnfermedad;
	public JTextArea jTextAreanombreTipoEnfermedad;
	public JScrollPane jscrollPanenombreTipoEnfermedad;
	public JButton jButtonnombreTipoEnfermedadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoEnfermedad;
	public JLabel jLabelid_empresaTipoEnfermedad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoEnfermedad;
	public JButton jButtonid_empresaTipoEnfermedad= new JButtonMe();
	public JButton jButtonid_empresaTipoEnfermedadUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoEnfermedadBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoEnfermedad;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoEnfermedadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoEnfermedad=new JPanel();
				this.jPanelAccionesFormularioTipoEnfermedad=new JPanel();
				this.jmenuBarDetalleTipoEnfermedad=new JMenuBar();
				this.jTtoolBarDetalleTipoEnfermedad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEnfermedadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoEnfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoEnfermedadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoEnfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEnfermedadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEnfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEnfermedadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEnfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEnfermedadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoEnfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoEnfermedad() {
		return this.jButtonActualizarToolBarTipoEnfermedad;
	}
	
	public JButton getjButtonEliminarToolBarTipoEnfermedad() {
		return this.jButtonEliminarToolBarTipoEnfermedad;
	}
	
	public JButton getjButtonCancelarToolBarTipoEnfermedad() {
		return this.jButtonCancelarToolBarTipoEnfermedad;
	}		
	
	public JButton getjButtonProcesarInformacionTipoEnfermedad() {
		return this.jButtonProcesarInformacionTipoEnfermedad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoEnfermedad)	{
		this.jButtonProcesarInformacionTipoEnfermedad = jButtonProcesarInformacionTipoEnfermedad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoEnfermedad() {
		return this.jComboBoxTiposAccionesTipoEnfermedad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoEnfermedad(
			JComboBox jComboBoxTiposRelacionesTipoEnfermedad) {
		this.jComboBoxTiposRelacionesTipoEnfermedad = jComboBoxTiposRelacionesTipoEnfermedad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoEnfermedad(
			JComboBox jComboBoxTiposAccionesTipoEnfermedad) {
		this.jComboBoxTiposAccionesTipoEnfermedad = jComboBoxTiposAccionesTipoEnfermedad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoEnfermedad() {
		return this.jComboBoxTiposAccionesFormularioTipoEnfermedad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoEnfermedad(
			JComboBox jComboBoxTiposAccionesFormularioTipoEnfermedad) {
		this.jComboBoxTiposAccionesFormularioTipoEnfermedad = jComboBoxTiposAccionesFormularioTipoEnfermedad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoenfermedadSessionBean=new TipoEnfermedadSessionBean();
		
		this.tipoenfermedadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoenfermedadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoenfermedadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.enfermedadSessionBean=new EnfermedadSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoEnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoEnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoEnfermedadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Enfermedad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoEnfermedadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoEnfermedad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoEnfermedad=new JButtonMe();
				this.jButtonModificarToolBarTipoEnfermedad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoEnfermedad,this.jTtoolBarDetalleTipoEnfermedad,
							"actualizar","actualizar","Actualizar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoEnfermedad,this.jTtoolBarDetalleTipoEnfermedad,
							"eliminar","eliminar","Eliminar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoEnfermedad,this.jTtoolBarDetalleTipoEnfermedad,
							"cancelar","cancelar","Cancelar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoEnfermedad,this.jTtoolBarDetalleTipoEnfermedad,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoEnfermedad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoEnfermedad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoEnfermedad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoEnfermedad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoEnfermedad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoEnfermedad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoEnfermedad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoEnfermedad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoEnfermedad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoEnfermedad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoEnfermedad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoEnfermedad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoEnfermedad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoEnfermedad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoEnfermedad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoEnfermedad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoEnfermedad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoEnfermedad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoEnfermedad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoEnfermedad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoEnfermedad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoEnfermedad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoEnfermedad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoEnfermedad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoEnfermedad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoEnfermedad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoEnfermedad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoEnfermedad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoEnfermedad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoEnfermedad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoEnfermedad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoEnfermedad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoEnfermedad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoEnfermedad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoEnfermedad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoEnfermedad.add(this.jMenuItemDetalleCerrarTipoEnfermedad);
		
		this.jmenuDetalleAccionesTipoEnfermedad.add(this.jMenuItemActualizarTipoEnfermedad);
		this.jmenuDetalleAccionesTipoEnfermedad.add(this.jMenuItemEliminarTipoEnfermedad);
		this.jmenuDetalleAccionesTipoEnfermedad.add(this.jMenuItemCancelarTipoEnfermedad);		
		
		//this.jmenuDetalleDatosTipoEnfermedad.add(this.jMenuItemDetalleAbrirOrderByTipoEnfermedad);				
		this.jmenuDetalleDatosTipoEnfermedad.add(this.jMenuItemDetalleMostarOcultarTipoEnfermedad);				
				
		//this.jmenuDetalleAccionesTipoEnfermedad.add(this.jMenuItemGuardarCambiosTipoEnfermedad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoEnfermedad.add(this.jmenuDetalleArchivoTipoEnfermedad);		
		this.jmenuBarDetalleTipoEnfermedad.add(this.jmenuDetalleAccionesTipoEnfermedad);		
		this.jmenuBarDetalleTipoEnfermedad.add(this.jmenuDetalleDatosTipoEnfermedad);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoEnfermedad.add(this.jmenuDetalleTipoEnfermedad);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoEnfermedad);				
	}
	
	
	public void inicializarElementosCamposTipoEnfermedad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoEnfermedad = new JLabelMe();
		jLabelIdTipoEnfermedad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoEnfermedad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoEnfermedad.setToolTipText(TipoEnfermedadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoEnfermedad= new GridBagLayout();

		this.jPanelidTipoEnfermedad.setLayout(this.gridaBagLayoutTipoEnfermedad);

		jLabelidTipoEnfermedad = new JLabel();
		jLabelidTipoEnfermedad.setText("Id");

		jLabelidTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoEnfermedad = new JLabelMe();
		this.jLabelcodigoTipoEnfermedad.setText(""+TipoEnfermedadConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoEnfermedad.setToolTipText("Codigo");
		this.jLabelcodigoTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoEnfermedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoEnfermedad.setToolTipText(TipoEnfermedadConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoEnfermedad = new GridBagLayout();
		this.jPanelcodigoTipoEnfermedad.setLayout(this.gridaBagLayoutTipoEnfermedad);


		jTextFieldcodigoTipoEnfermedad= new JTextFieldMe();

		jTextFieldcodigoTipoEnfermedad.setEnabled(false);
		jTextFieldcodigoTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoEnfermedadBusqueda= new JButtonMe();
		this.jButtoncodigoTipoEnfermedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoEnfermedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoEnfermedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoEnfermedadBusqueda.setText("U");
		this.jButtoncodigoTipoEnfermedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoEnfermedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoEnfermedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoEnfermedadBusqueda"));

		if(this.tipoenfermedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoEnfermedadBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoEnfermedad = new JLabelMe();
		this.jLabelnombreTipoEnfermedad.setText(""+TipoEnfermedadConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoEnfermedad.setToolTipText("Nombre");
		this.jLabelnombreTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoEnfermedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoEnfermedad.setToolTipText(TipoEnfermedadConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoEnfermedad = new GridBagLayout();
		this.jPanelnombreTipoEnfermedad.setLayout(this.gridaBagLayoutTipoEnfermedad);


		jTextAreanombreTipoEnfermedad= new JTextAreaMe();
		jTextAreanombreTipoEnfermedad.setEnabled(false);
		jTextAreanombreTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEnfermedad.setLineWrap(true);
		jTextAreanombreTipoEnfermedad.setWrapStyleWord(true);
		jTextAreanombreTipoEnfermedad.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoEnfermedad.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoEnfermedad = new JScrollPane(jTextAreanombreTipoEnfermedad);
		jscrollPanenombreTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoEnfermedadBusqueda= new JButtonMe();
		this.jButtonnombreTipoEnfermedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoEnfermedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoEnfermedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoEnfermedadBusqueda.setText("U");
		this.jButtonnombreTipoEnfermedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoEnfermedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoEnfermedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoEnfermedadBusqueda"));

		if(this.tipoenfermedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoEnfermedadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoEnfermedad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoEnfermedad = new JLabelMe();
		this.jLabelid_empresaTipoEnfermedad.setText(""+TipoEnfermedadConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoEnfermedad.setToolTipText("Empresa");
		this.jLabelid_empresaTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoEnfermedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoEnfermedad.setToolTipText(TipoEnfermedadConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoEnfermedad = new GridBagLayout();
		this.jPanelid_empresaTipoEnfermedad.setLayout(this.gridaBagLayoutTipoEnfermedad);


		jComboBoxid_empresaTipoEnfermedad= new JComboBoxMe();
		jComboBoxid_empresaTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoEnfermedad.setEnabled(false);

		this.jButtonid_empresaTipoEnfermedad= new JButtonMe();
		this.jButtonid_empresaTipoEnfermedad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoEnfermedad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoEnfermedad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoEnfermedad.setText("Buscar");
		this.jButtonid_empresaTipoEnfermedad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoEnfermedad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoEnfermedad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoEnfermedad"));

		this.jButtonid_empresaTipoEnfermedadBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoEnfermedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoEnfermedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoEnfermedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoEnfermedadBusqueda.setText("U");
		this.jButtonid_empresaTipoEnfermedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoEnfermedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoEnfermedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoEnfermedadBusqueda"));

		if(this.tipoenfermedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoEnfermedadBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoEnfermedadUpdate= new JButtonMe();
		this.jButtonid_empresaTipoEnfermedadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoEnfermedadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoEnfermedadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoEnfermedadUpdate.setText("U");
		this.jButtonid_empresaTipoEnfermedadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoEnfermedadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoEnfermedadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoEnfermedadUpdate"));



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
		//this.jInternalFrameDetalleTipoEnfermedad = new TipoEnfermedadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Enfermedad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoEnfermedad= new GridBagLayout();
		

		
		String sToolTipTipoEnfermedad="";
		sToolTipTipoEnfermedad=TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoEnfermedad+="(Nomina.TipoEnfermedad)";
		}
		
		if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoEnfermedad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoEnfermedad = new JButtonMe();
		this.jButtonModificarTipoEnfermedad = new JButtonMe();
        this.jButtonActualizarTipoEnfermedad = new JButtonMe();
        this.jButtonEliminarTipoEnfermedad = new JButtonMe();
        this.jButtonCancelarTipoEnfermedad = new JButtonMe();
        this.jButtonGuardarCambiosTipoEnfermedad = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoEnfermedad = new JButtonMe();
		this.jButtonCerrarTipoEnfermedad = new JButtonMe();
		
		this.jScrollPanelDatosTipoEnfermedad = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoEnfermedad = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoEnfermedad = new JScrollPane();
				
		
		
		this.jPanelCamposTipoEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Enfermedad";
		
		if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Enfermedades" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoEnfermedad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoEnfermedad.setName("jPanelCamposTipoEnfermedad"); 

		this.jPanelCamposOcultosTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoEnfermedad.setName("jPanelCamposOcultosTipoEnfermedad"); 

        this.jPanelAccionesTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoEnfermedad.setToolTipText("Acciones");
        this.jPanelAccionesTipoEnfermedad.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoEnfermedad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoEnfermedad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoEnfermedad.setText("Nuevo");
		this.jButtonModificarTipoEnfermedad.setText("Editar");
        this.jButtonActualizarTipoEnfermedad.setText("Actualizar");
        this.jButtonEliminarTipoEnfermedad.setText("Eliminar");
        this.jButtonCancelarTipoEnfermedad.setText("Cancelar");
        this.jButtonGuardarCambiosTipoEnfermedad.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoEnfermedad.setText("Guardar");
		this.jButtonCerrarTipoEnfermedad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoEnfermedad,"nuevo_button","Nuevo",this.tipoenfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoEnfermedad,"modificar_button","Editar",this.tipoenfermedadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoEnfermedad,"actualizar_button","Actualizar",this.tipoenfermedadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoEnfermedad,"eliminar_button","Eliminar",this.tipoenfermedadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoEnfermedad,"cancelar_button","Cancelar",this.tipoenfermedadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoEnfermedad,"guardarcambios_button","Guardar",this.tipoenfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoEnfermedad,"guardarcambiostabla_button","Guardar",this.tipoenfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoEnfermedad,"cerrar_button","Salir",this.tipoenfermedadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoEnfermedad.setToolTipText("Nuevo"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoEnfermedad.setToolTipText("Editar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoEnfermedad.setToolTipText("Actualizar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoEnfermedad.setToolTipText("Eliminar)"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoEnfermedad.setToolTipText("Cancelar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoEnfermedad.setToolTipText("Guardar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoEnfermedad.setToolTipText("Guardar"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoEnfermedad.setToolTipText("Salir"+" "+TipoEnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoEnfermedad";
		inputMap = this.jButtonNuevoTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoEnfermedad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoEnfermedad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoEnfermedad";
		inputMap = this.jButtonActualizarTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoEnfermedad"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoEnfermedad";
		inputMap = this.jButtonEliminarTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoEnfermedad"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoEnfermedad";
		inputMap = this.jButtonCancelarTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoEnfermedad"));
		
		//CERRAR		
		sMapKey = "CerrarTipoEnfermedad";
		inputMap = this.jButtonCerrarTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoEnfermedad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoEnfermedad";
		inputMap = this.jButtonGuardarCambiosTablaTipoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoEnfermedad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoEnfermedad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoEnfermedad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoEnfermedad.setToolTipText("Nuevo TipoEnfermedad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoEnfermedad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoEnfermedad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoEnfermedad.setToolTipText("Sin Cerrar Ventana TipoEnfermedad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoEnfermedad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoEnfermedad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoEnfermedad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoEnfermedad.setText("Accion");
		this.jComboBoxTiposAccionesTipoEnfermedad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoEnfermedad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoEnfermedad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoEnfermedad = new JLabelMe();
		
		this.jLabelAccionesTipoEnfermedad.setText("Acciones");		
		this.jLabelAccionesTipoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoEnfermedad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoEnfermedad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoEnfermedad=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoEnfermedad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEnfermedad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEnfermedad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoEnfermedad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoEnfermedad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoEnfermedad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoEnfermedad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoEnfermedad = new GridBagLayout();
		
		this.jPanelCamposTipoEnfermedad.setLayout(gridaBagLayoutCamposTipoEnfermedad);
		this.jPanelCamposOcultosTipoEnfermedad.setLayout(gridaBagLayoutCamposOcultosTipoEnfermedad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEnfermedad.gridy = 0;
	this.gridBagConstraintsTipoEnfermedad.gridx = 0;
	this.gridBagConstraintsTipoEnfermedad.ipadx = 0;
	this.gridBagConstraintsTipoEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoEnfermedad.add(jLabelIdTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);



	this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEnfermedad.gridy = 0;
	this.gridBagConstraintsTipoEnfermedad.gridx = 1;
	this.gridBagConstraintsTipoEnfermedad.ipadx = 0;
	this.gridBagConstraintsTipoEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoEnfermedad.add(jLabelidTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);


	this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEnfermedad.gridy = 0;
	this.gridBagConstraintsTipoEnfermedad.gridx = 0;
	this.gridBagConstraintsTipoEnfermedad.ipadx = 0;
	this.gridBagConstraintsTipoEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoEnfermedad.add(jLabelid_empresaTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		//this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = 0;
		this.gridBagConstraintsTipoEnfermedad.gridx = 2;
		this.gridBagConstraintsTipoEnfermedad.ipadx = 0;
		this.gridBagConstraintsTipoEnfermedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoEnfermedad.add(jButtonid_empresaTipoEnfermedadBusqueda, this.gridBagConstraintsTipoEnfermedad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		//this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = 0;
		this.gridBagConstraintsTipoEnfermedad.gridx = 3;
		this.gridBagConstraintsTipoEnfermedad.ipadx = 0;
		this.gridBagConstraintsTipoEnfermedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoEnfermedad.add(jButtonid_empresaTipoEnfermedadUpdate, this.gridBagConstraintsTipoEnfermedad);
	}

	this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEnfermedad.gridy = 0;
	this.gridBagConstraintsTipoEnfermedad.gridx = 1;
	this.gridBagConstraintsTipoEnfermedad.ipadx = 0;
	this.gridBagConstraintsTipoEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoEnfermedad.add(jComboBoxid_empresaTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);


	this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEnfermedad.gridy = 0;
	this.gridBagConstraintsTipoEnfermedad.gridx = 0;
	this.gridBagConstraintsTipoEnfermedad.ipadx = 0;
	this.gridBagConstraintsTipoEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoEnfermedad.add(jLabelcodigoTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		//this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = 0;
		this.gridBagConstraintsTipoEnfermedad.gridx = 2;
		this.gridBagConstraintsTipoEnfermedad.ipadx = 0;
		this.gridBagConstraintsTipoEnfermedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoEnfermedad.add(jButtoncodigoTipoEnfermedadBusqueda, this.gridBagConstraintsTipoEnfermedad);
	}

	this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEnfermedad.gridy = 0;
	this.gridBagConstraintsTipoEnfermedad.gridx = 1;
	this.gridBagConstraintsTipoEnfermedad.ipadx = 0;
	this.gridBagConstraintsTipoEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoEnfermedad.add(jTextFieldcodigoTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);


	this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEnfermedad.gridy = 0;
	this.gridBagConstraintsTipoEnfermedad.gridx = 0;
	this.gridBagConstraintsTipoEnfermedad.ipadx = 0;
	this.gridBagConstraintsTipoEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoEnfermedad.add(jLabelnombreTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		//this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = 0;
		this.gridBagConstraintsTipoEnfermedad.gridx = 2;
		this.gridBagConstraintsTipoEnfermedad.ipadx = 0;
		this.gridBagConstraintsTipoEnfermedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoEnfermedad.add(jButtonnombreTipoEnfermedadBusqueda, this.gridBagConstraintsTipoEnfermedad);
	}

	this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEnfermedad.gridy = 0;
	this.gridBagConstraintsTipoEnfermedad.gridx = 1;
	this.gridBagConstraintsTipoEnfermedad.ipadx = 0;
	this.gridBagConstraintsTipoEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoEnfermedad.add(jscrollPanenombreTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEnfermedad.gridy = iYPanelCamposTipoEnfermedad;
	this.gridBagConstraintsTipoEnfermedad.gridx = iXPanelCamposTipoEnfermedad++;
	this.gridBagConstraintsTipoEnfermedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEnfermedad.add(this.jPanelidTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);



	if(iXPanelCamposTipoEnfermedad % 1==0) {
		iXPanelCamposTipoEnfermedad=0;
		iYPanelCamposTipoEnfermedad++;
	}
	this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEnfermedad.gridy = iYPanelCamposTipoEnfermedad;
	this.gridBagConstraintsTipoEnfermedad.gridx = iXPanelCamposTipoEnfermedad++;
	this.gridBagConstraintsTipoEnfermedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEnfermedad.add(this.jPanelcodigoTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);



	if(iXPanelCamposTipoEnfermedad % 1==0) {
		iXPanelCamposTipoEnfermedad=0;
		iYPanelCamposTipoEnfermedad++;
	}
	this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEnfermedad.gridy = iYPanelCamposTipoEnfermedad;
	this.gridBagConstraintsTipoEnfermedad.gridx = iXPanelCamposTipoEnfermedad++;
	this.gridBagConstraintsTipoEnfermedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEnfermedad.add(this.jPanelnombreTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);



	if(iXPanelCamposTipoEnfermedad % 1==0) {
		iXPanelCamposTipoEnfermedad=0;
		iYPanelCamposTipoEnfermedad++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEnfermedad.gridy = iYPanelCamposOcultosTipoEnfermedad;
	this.gridBagConstraintsTipoEnfermedad.gridx = iXPanelCamposOcultosTipoEnfermedad++;
	this.gridBagConstraintsTipoEnfermedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoEnfermedad.add(this.jPanelid_empresaTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);



	if(iXPanelCamposOcultosTipoEnfermedad % 1==0) {
		iXPanelCamposOcultosTipoEnfermedad=0;
		iYPanelCamposOcultosTipoEnfermedad++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoEnfermedad= new GridBagLayout();
		this.jPanelAccionesTipoEnfermedad.setLayout(gridaBagLayoutAccionesTipoEnfermedad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoEnfermedad= new GridBagLayout();
		this.jPanelAccionesFormularioTipoEnfermedad.setLayout(gridaBagLayoutAccionesFormularioTipoEnfermedad);
		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoEnfermedad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoEnfermedad.add(this.jComboBoxTiposAccionesFormularioTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);

		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoEnfermedad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoEnfermedad.add(this.jCheckBoxPostAccionNuevoTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoenfermedadSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoEnfermedad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoEnfermedad.add(this.jCheckBoxPostAccionSinCerrarTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoenfermedadSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoenfermedadSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoEnfermedad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoEnfermedad.add(this.jCheckBoxPostAccionSinMensajeTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = 0;
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoEnfermedad.add(this.jButtonModificarTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);							

		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEnfermedad.gridy = 0;
		this.gridBagConstraintsTipoEnfermedad.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoEnfermedad.add(this.jButtonEliminarTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		
			
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy = 0;		
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoEnfermedad.add(this.jButtonActualizarTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);


		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy = 0;		
		this.gridBagConstraintsTipoEnfermedad.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoEnfermedad.add(this.jButtonGuardarCambiosTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);	
		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy = 0;		
		this.gridBagConstraintsTipoEnfermedad.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoEnfermedad.add(this.jButtonCancelarTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoEnfermedad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoEnfermedad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoenfermedadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();						
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoEnfermedad.gridx = 0;		
			//this.gridBagConstraintsTipoEnfermedad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoEnfermedad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoEnfermedad.gridx =0;
		this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoEnfermedad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoEnfermedadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoEnfermedad = new TipoEnfermedadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Enfermedad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Enfermedad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Enfermedad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoEnfermedadModel tipoenfermedadModel=new TipoEnfermedadModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoEnfermedadModel.TipoEnfermedadFocusTraversalPolicy tipoenfermedadFocusTraversalPolicy = tipoenfermedadModel.new TipoEnfermedadFocusTraversalPolicy(this);
			
			//tipoenfermedadFocusTraversalPolicy.settipoenfermedadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoenfermedadModel);
			
			
			this.jContentPaneDetalleTipoEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoEnfermedad = new GridBagLayout();	
			this.jContentPaneDetalleTipoEnfermedad.setLayout(gridaBagLayoutDetalleTipoEnfermedad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoEnfermedad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
				this.gridBagConstraintsTipoEnfermedad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoEnfermedad.gridx = 0;
					
				
				this.jContentPaneDetalleTipoEnfermedad.add(jTtoolBarDetalleTipoEnfermedad, gridBagConstraintsTipoEnfermedad);								
				
}
			
			this.jScrollPanelDatosEdicionTipoEnfermedad=   new JScrollPane(jContentPaneDetalleTipoEnfermedad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoEnfermedad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEnfermedad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEnfermedad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoEnfermedad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoEnfermedad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEnfermedad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEnfermedad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoEnfermedad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoEnfermedad.gridx = 0;
	        
			this.jContentPaneDetalleTipoEnfermedad.add(jPanelCamposTipoEnfermedad, gridBagConstraintsTipoEnfermedad);
			
			
			
			
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
						&& tipoenfermedadSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameEnfermedad(this.puedeCargarPorParteEnfermedad,false,-1);
					
					if(this.tipoenfermedadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoEnfermedad= new GridBagConstraints();
						this.gridBagConstraintsTipoEnfermedad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoEnfermedad.gridx = 0;
						this.jContentPaneDetalleTipoEnfermedad.add(this.jTabbedPaneRelacionesTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoEnfermedad.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameEnfermedad(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoEnfermedad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
					this.gridBagConstraintsTipoEnfermedad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoEnfermedad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoEnfermedad.gridx = 0;
					
				
					this.jContentPaneDetalleTipoEnfermedad.add(jPanelCamposOcultosTipoEnfermedad, gridBagConstraintsTipoEnfermedad);
				
					this.jPanelCamposOcultosTipoEnfermedad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoEnfermedad.gridx = 0;
	        this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoEnfermedad.add(this.jPanelAccionesFormularioTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);							
			
			
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
	        this.gridBagConstraintsTipoEnfermedad.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoEnfermedad.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoEnfermedad.add(this.jPanelAccionesTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoEnfermedad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoEnfermedad=   new JScrollPane(this.jPanelCamposTipoEnfermedad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoEnfermedad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEnfermedad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEnfermedad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoEnfermedad.gridx = 0;
			this.gridBagConstraintsTipoEnfermedad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoEnfermedad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoEnfermedad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoEnfermedad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);			
			
			this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsTipoEnfermedad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoEnfermedad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEnfermedad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
			
			
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEnfermedad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		
			
		this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsTipoEnfermedad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoEnfermedad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoEnfermedad, this.gridBagConstraintsTipoEnfermedad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoEnfermedad;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoEnfermedad;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameEnfermedad(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.enfermedadSessionBean=new EnfermedadSessionBean();
		this.enfermedadSessionBean.setConGuardarRelaciones(false);
		this.enfermedadSessionBean.setEsGuardarRelacionado(true);

		this.enfermedadBeanSwingJInternalFrame=null;//new EnfermedadBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.enfermedadBeanSwingJInternalFramePopup=new EnfermedadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.enfermedadBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.enfermedadSessionBean.getEsGuardarRelacionado()) {

				EnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL=TipoEnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL;
				EnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoEnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.enfermedadSessionBean.setEsGuardarRelacionado(true);

				this.enfermedadBeanSwingJInternalFrame=new EnfermedadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.enfermedadBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.enfermedadBeanSwingJInternalFrame.setenfermedadSessionBean(this.enfermedadSessionBean);

				//this.gridBagConstraintsTipoEnfermedad = new GridBagConstraints();
				//this.gridBagConstraintsTipoEnfermedad.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoEnfermedad.gridx = 0;
				//this.jContentPaneDetalleTipoEnfermedad.add(this.enfermedadBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoEnfermedad);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoEnfermedad.add("Enfermedades",this.enfermedadBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoEnfermedad.setComponentAt(iIndexTab,this.enfermedadBeanSwingJInternalFrame.getContentPane());
				}

				//EnfermedadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.enfermedadSessionBean.setEsGuardarRelacionado(false);
				this.enfermedadBeanSwingJInternalFrame=null;//new EnfermedadBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.enfermedadSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEnfermedad) {
					this.jTabbedPaneRelacionesTipoEnfermedad.add("Enfermedades",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarEnfermedadBeanSwingJInternalFrame(List<TipoEnfermedad> tipoenfermedads,TipoEnfermedad tipoenfermedad,EnfermedadBeanSwingJInternalFrame enfermedadBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//enfermedadBeanSwingJInternalFrame=new EnfermedadBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					enfermedadBeanSwingJInternalFrame.getEnfermedadLogic().setConnexion(this.tipoenfermedadLogic.getConnexion());

					enfermedadBeanSwingJInternalFrame.settipoenfermedadsForeignKey(tipoenfermedads);
					enfermedadBeanSwingJInternalFrame.settipoenfermedadForeignKey(tipoenfermedad);
					enfermedadBeanSwingJInternalFrame.enfermedadSessionBean.setisBusquedaDesdeForeignKeySesionTipoEnfermedad(true);
					enfermedadBeanSwingJInternalFrame.enfermedadSessionBean.setlidTipoEnfermedadActual(tipoenfermedad.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					enfermedadBeanSwingJInternalFrame.cargarCombosForeignKeyEnfermedad(enfermedadBeanSwingJInternalFrame.isCargarCombosDependencia);
					enfermedadBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoEnfermedad(true);
					enfermedadBeanSwingJInternalFrame.setid_tipo_enfermedadFK_IdTipoEnfermedad(tipoenfermedad.getId());

					if(!this.conCargarFormDetalle) {
						enfermedadBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					enfermedadBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoEnfermedadForeignKey(tipoenfermedad,1,false,true,true);
					enfermedadBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					enfermedadBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoEnfermedad");
					enfermedadBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoEnfermedad");
					enfermedadBeanSwingJInternalFrame.inicializarActualizarBindingTablaEnfermedad(true);
					enfermedadBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEnfermedad("n",enfermedadBeanSwingJInternalFrame.isGuardarCambiosEnLote, enfermedadBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					enfermedadBeanSwingJInternalFrame.setAutoscrolls(true);
					enfermedadBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						enfermedadBeanSwingJInternalFrame.actualizarEstadoPanelsEnfermedad("relacionado");
					} else {
						enfermedadBeanSwingJInternalFrame.actualizarEstadoPanelsEnfermedad("no_relacionado");
					}

					enfermedadBeanSwingJInternalFrame.getjButtonRecargarInformacionEnfermedad().setVisible(false);

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
