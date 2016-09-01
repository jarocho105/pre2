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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.PerfilCampoConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class PerfilCampoDetalleFormJInternalFrame extends PerfilCampoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePerfilCampo;
	
	protected JMenuBar jmenuBarDetallePerfilCampo;
	
	protected JMenu jmenuDetallePerfilCampo;
	protected JMenu jmenuDetalleArchivoPerfilCampo;
	protected JMenu jmenuDetalleAccionesPerfilCampo;
	protected JMenu jmenuDetalleDatosPerfilCampo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePerfilCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPerfilCampo;	
	protected GridBagConstraints gridBagConstraintsPerfilCampo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PerfilCampoBeanSwingJInternalFrameAdditional jInternalFrameDetallePerfilCampo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_perfil="";

	protected CampoBeanSwingJInternalFrame campoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_campo="";
	
	public PerfilCampoSessionBean perfilcampoSessionBean;
	
	
	
	
	public PerfilSessionBean perfilSessionBean;
	public CampoSessionBean campoSessionBean;	
	
	public PerfilCampoLogic perfilcampoLogic;
	
	public JScrollPane jScrollPanelDatosPerfilCampo;
	public JScrollPane jScrollPanelDatosEdicionPerfilCampo;
	public JScrollPane jScrollPanelDatosGeneralPerfilCampo;
	
	protected JPanel jPanelCamposPerfilCampo;    
	protected JPanel jPanelCamposOcultosPerfilCampo;    	
	protected JPanel jPanelAccionesPerfilCampo;
	protected JPanel jPanelAccionesFormularioPerfilCampo;
    
	
	
	protected Integer iXPanelCamposPerfilCampo=0;
	protected Integer iYPanelCamposPerfilCampo=0;
	
	protected Integer iXPanelCamposOcultosPerfilCampo=0;
	protected Integer iYPanelCamposOcultosPerfilCampo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPerfilCampo;
	public JButton jButtonModificarPerfilCampo;
	public JButton jButtonActualizarPerfilCampo;
    public JButton jButtonEliminarPerfilCampo;
	public JButton jButtonCancelarPerfilCampo;
    public JButton jButtonGuardarCambiosPerfilCampo;
	public JButton jButtonGuardarCambiosTablaPerfilCampo;
	protected JButton jButtonCerrarPerfilCampo;
	
	
	protected JButton jButtonProcesarInformacionPerfilCampo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPerfilCampo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPerfilCampo;
	protected JCheckBox jCheckBoxPostAccionSinMensajePerfilCampo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPerfilCampo;
	protected JButton jButtonModificarToolBarPerfilCampo;
	protected JButton jButtonActualizarToolBarPerfilCampo;
    protected JButton jButtonEliminarToolBarPerfilCampo;
	protected JButton jButtonCancelarToolBarPerfilCampo;
    protected JButton jButtonGuardarCambiosToolBarPerfilCampo;
	protected JButton jButtonGuardarCambiosTablaToolBarPerfilCampo;
	protected JButton jButtonMostrarOcultarTablaToolBarPerfilCampo;
	protected JButton jButtonCerrarToolBarPerfilCampo;
	
	protected JButton jButtonProcesarInformacionToolBarPerfilCampo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPerfilCampo;
	protected JMenuItem jMenuItemModificarPerfilCampo;
	protected JMenuItem jMenuItemActualizarPerfilCampo;
    protected JMenuItem jMenuItemEliminarPerfilCampo;
	protected JMenuItem jMenuItemCancelarPerfilCampo;
    protected JMenuItem jMenuItemGuardarCambiosPerfilCampo;
	protected JMenuItem jMenuItemGuardarCambiosTablaPerfilCampo;
	protected JMenuItem jMenuItemCerrarPerfilCampo;
	protected JMenuItem jMenuItemDetalleCerrarPerfilCampo;
	protected JMenuItem jMenuItemDetalleMostarOcultarPerfilCampo;
	
	protected JMenuItem jMenuItemProcesarInformacionPerfilCampo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPerfilCampo;
	protected JMenuItem jMenuItemMostrarOcultarPerfilCampo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPerfilCampo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPerfilCampo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPerfilCampo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPerfilCampo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPerfilCampo;
	public JLabel jLabelIdPerfilCampo;
	public JLabel jLabelidPerfilCampo;
	public JButton jButtonidPerfilCampoBusqueda= new JButtonMe();

	public JPanel jPaneltodoPerfilCampo;
	public JLabel jLabeltodoPerfilCampo;
	public JCheckBox jCheckBoxtodoPerfilCampo;
	public JButton jButtontodoPerfilCampoBusqueda= new JButtonMe();

	public JPanel jPanelingresoPerfilCampo;
	public JLabel jLabelingresoPerfilCampo;
	public JCheckBox jCheckBoxingresoPerfilCampo;
	public JButton jButtoningresoPerfilCampoBusqueda= new JButtonMe();

	public JPanel jPanelmodificacionPerfilCampo;
	public JLabel jLabelmodificacionPerfilCampo;
	public JCheckBox jCheckBoxmodificacionPerfilCampo;
	public JButton jButtonmodificacionPerfilCampoBusqueda= new JButtonMe();

	public JPanel jPaneleliminacionPerfilCampo;
	public JLabel jLabeleliminacionPerfilCampo;
	public JCheckBox jCheckBoxeliminacionPerfilCampo;
	public JButton jButtoneliminacionPerfilCampoBusqueda= new JButtonMe();

	public JPanel jPanelconsultaPerfilCampo;
	public JLabel jLabelconsultaPerfilCampo;
	public JCheckBox jCheckBoxconsultaPerfilCampo;
	public JButton jButtonconsultaPerfilCampoBusqueda= new JButtonMe();

	public JPanel jPanelestadoPerfilCampo;
	public JLabel jLabelestadoPerfilCampo;
	public JCheckBox jCheckBoxestadoPerfilCampo;
	public JButton jButtonestadoPerfilCampoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_perfilPerfilCampo;
	public JLabel jLabelid_perfilPerfilCampo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_perfilPerfilCampo;
	public JButton jButtonid_perfilPerfilCampo= new JButtonMe();
	public JButton jButtonid_perfilPerfilCampoUpdate= new JButtonMe();
	public JButton jButtonid_perfilPerfilCampoBusqueda= new JButtonMe();

	public JPanel jPanelid_campoPerfilCampo;
	public JLabel jLabelid_campoPerfilCampo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_campoPerfilCampo;
	public JButton jButtonid_campoPerfilCampo= new JButtonMe();
	public JButton jButtonid_campoPerfilCampoUpdate= new JButtonMe();
	public JButton jButtonid_campoPerfilCampoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPerfilCampo;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PerfilCampoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPerfilCampo=new JPanel();
				this.jPanelAccionesFormularioPerfilCampo=new JPanel();
				this.jmenuBarDetallePerfilCampo=new JMenuBar();
				this.jTtoolBarDetallePerfilCampo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilCampoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PerfilCampo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PerfilCampoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PerfilCampo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilCampoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilCampo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilCampoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilCampo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilCampoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PerfilCampo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPerfilCampo() {
		return this.jButtonActualizarToolBarPerfilCampo;
	}
	
	public JButton getjButtonEliminarToolBarPerfilCampo() {
		return this.jButtonEliminarToolBarPerfilCampo;
	}
	
	public JButton getjButtonCancelarToolBarPerfilCampo() {
		return this.jButtonCancelarToolBarPerfilCampo;
	}		
	
	public JButton getjButtonProcesarInformacionPerfilCampo() {
		return this.jButtonProcesarInformacionPerfilCampo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPerfilCampo)	{
		this.jButtonProcesarInformacionPerfilCampo = jButtonProcesarInformacionPerfilCampo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPerfilCampo() {
		return this.jComboBoxTiposAccionesPerfilCampo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPerfilCampo(
			JComboBox jComboBoxTiposRelacionesPerfilCampo) {
		this.jComboBoxTiposRelacionesPerfilCampo = jComboBoxTiposRelacionesPerfilCampo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPerfilCampo(
			JComboBox jComboBoxTiposAccionesPerfilCampo) {
		this.jComboBoxTiposAccionesPerfilCampo = jComboBoxTiposAccionesPerfilCampo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPerfilCampo() {
		return this.jComboBoxTiposAccionesFormularioPerfilCampo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPerfilCampo(
			JComboBox jComboBoxTiposAccionesFormularioPerfilCampo) {
		this.jComboBoxTiposAccionesFormularioPerfilCampo = jComboBoxTiposAccionesFormularioPerfilCampo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.perfilcampoSessionBean=new PerfilCampoSessionBean();
		
		this.perfilcampoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfilcampoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.perfilcampoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PerfilCampoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PerfilCampoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PerfilCampoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Perfil Campo MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
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
	
		PerfilCampoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePerfilCampo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPerfilCampo=new JButtonMe();
				this.jButtonModificarToolBarPerfilCampo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPerfilCampo,this.jTtoolBarDetallePerfilCampo,
							"actualizar","actualizar","Actualizar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPerfilCampo,this.jTtoolBarDetallePerfilCampo,
							"eliminar","eliminar","Eliminar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPerfilCampo,this.jTtoolBarDetallePerfilCampo,
							"cancelar","cancelar","Cancelar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPerfilCampo,this.jTtoolBarDetallePerfilCampo,
							"guardarcambios","guardarcambios","Guardar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePerfilCampo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePerfilCampo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPerfilCampo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPerfilCampo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPerfilCampo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPerfilCampo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPerfilCampo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPerfilCampo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPerfilCampo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPerfilCampo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPerfilCampo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPerfilCampo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPerfilCampo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPerfilCampo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPerfilCampo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPerfilCampo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPerfilCampo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPerfilCampo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPerfilCampo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPerfilCampo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPerfilCampo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPerfilCampo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPerfilCampo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPerfilCampo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPerfilCampo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPerfilCampo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPerfilCampo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPerfilCampo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPerfilCampo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPerfilCampo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPerfilCampo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPerfilCampo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPerfilCampo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPerfilCampo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPerfilCampo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPerfilCampo.add(this.jMenuItemDetalleCerrarPerfilCampo);
		
		this.jmenuDetalleAccionesPerfilCampo.add(this.jMenuItemActualizarPerfilCampo);
		this.jmenuDetalleAccionesPerfilCampo.add(this.jMenuItemEliminarPerfilCampo);
		this.jmenuDetalleAccionesPerfilCampo.add(this.jMenuItemCancelarPerfilCampo);		
		
		//this.jmenuDetalleDatosPerfilCampo.add(this.jMenuItemDetalleAbrirOrderByPerfilCampo);				
		this.jmenuDetalleDatosPerfilCampo.add(this.jMenuItemDetalleMostarOcultarPerfilCampo);				
				
		//this.jmenuDetalleAccionesPerfilCampo.add(this.jMenuItemGuardarCambiosPerfilCampo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePerfilCampo.add(this.jmenuDetalleArchivoPerfilCampo);		
		this.jmenuBarDetallePerfilCampo.add(this.jmenuDetalleAccionesPerfilCampo);		
		this.jmenuBarDetallePerfilCampo.add(this.jmenuDetalleDatosPerfilCampo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePerfilCampo);				
	}
	
	
	public void inicializarElementosCamposPerfilCampo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPerfilCampo = new JLabelMe();
		jLabelIdPerfilCampo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPerfilCampo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPerfilCampo.setToolTipText(PerfilCampoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPerfilCampo= new GridBagLayout();

		this.jPanelidPerfilCampo.setLayout(this.gridaBagLayoutPerfilCampo);

		jLabelidPerfilCampo = new JLabel();
		jLabelidPerfilCampo.setText("Id");

		jLabelidPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeltodoPerfilCampo = new JLabelMe();
		this.jLabeltodoPerfilCampo.setText(""+PerfilCampoConstantesFunciones.LABEL_TODO+" : *");
		this.jLabeltodoPerfilCampo.setToolTipText("Todo");
		this.jLabeltodoPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltodoPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltodoPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltodoPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltodoPerfilCampo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltodoPerfilCampo.setToolTipText(PerfilCampoConstantesFunciones.LABEL_TODO);
		this.gridaBagLayoutPerfilCampo = new GridBagLayout();
		this.jPaneltodoPerfilCampo.setLayout(this.gridaBagLayoutPerfilCampo);


		jCheckBoxtodoPerfilCampo= new JCheckBoxMe();
		jCheckBoxtodoPerfilCampo.setEnabled(false);

		jCheckBoxtodoPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxtodoPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxtodoPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxtodoPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontodoPerfilCampoBusqueda= new JButtonMe();
		this.jButtontodoPerfilCampoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontodoPerfilCampoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontodoPerfilCampoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontodoPerfilCampoBusqueda.setText("U");
		this.jButtontodoPerfilCampoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontodoPerfilCampoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontodoPerfilCampoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxtodoPerfilCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxtodoPerfilCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"todoPerfilCampoBusqueda"));

		if(this.perfilcampoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontodoPerfilCampoBusqueda.setVisible(false);		}


					
		this.jLabelingresoPerfilCampo = new JLabelMe();
		this.jLabelingresoPerfilCampo.setText(""+PerfilCampoConstantesFunciones.LABEL_INGRESO+" : *");
		this.jLabelingresoPerfilCampo.setToolTipText("Ingreso");
		this.jLabelingresoPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingresoPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingresoPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelingresoPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelingresoPerfilCampo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelingresoPerfilCampo.setToolTipText(PerfilCampoConstantesFunciones.LABEL_INGRESO);
		this.gridaBagLayoutPerfilCampo = new GridBagLayout();
		this.jPanelingresoPerfilCampo.setLayout(this.gridaBagLayoutPerfilCampo);


		jCheckBoxingresoPerfilCampo= new JCheckBoxMe();
		jCheckBoxingresoPerfilCampo.setEnabled(false);

		jCheckBoxingresoPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxingresoPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxingresoPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxingresoPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoningresoPerfilCampoBusqueda= new JButtonMe();
		this.jButtoningresoPerfilCampoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningresoPerfilCampoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningresoPerfilCampoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoningresoPerfilCampoBusqueda.setText("U");
		this.jButtoningresoPerfilCampoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoningresoPerfilCampoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoningresoPerfilCampoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxingresoPerfilCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxingresoPerfilCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingresoPerfilCampoBusqueda"));

		if(this.perfilcampoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoningresoPerfilCampoBusqueda.setVisible(false);		}


					
		this.jLabelmodificacionPerfilCampo = new JLabelMe();
		this.jLabelmodificacionPerfilCampo.setText(""+PerfilCampoConstantesFunciones.LABEL_MODIFICACION+" : *");
		this.jLabelmodificacionPerfilCampo.setToolTipText("Modificacion");
		this.jLabelmodificacionPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmodificacionPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmodificacionPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmodificacionPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmodificacionPerfilCampo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmodificacionPerfilCampo.setToolTipText(PerfilCampoConstantesFunciones.LABEL_MODIFICACION);
		this.gridaBagLayoutPerfilCampo = new GridBagLayout();
		this.jPanelmodificacionPerfilCampo.setLayout(this.gridaBagLayoutPerfilCampo);


		jCheckBoxmodificacionPerfilCampo= new JCheckBoxMe();
		jCheckBoxmodificacionPerfilCampo.setEnabled(false);

		jCheckBoxmodificacionPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxmodificacionPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxmodificacionPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxmodificacionPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonmodificacionPerfilCampoBusqueda= new JButtonMe();
		this.jButtonmodificacionPerfilCampoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmodificacionPerfilCampoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmodificacionPerfilCampoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmodificacionPerfilCampoBusqueda.setText("U");
		this.jButtonmodificacionPerfilCampoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmodificacionPerfilCampoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmodificacionPerfilCampoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxmodificacionPerfilCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxmodificacionPerfilCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"modificacionPerfilCampoBusqueda"));

		if(this.perfilcampoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmodificacionPerfilCampoBusqueda.setVisible(false);		}


					
		this.jLabeleliminacionPerfilCampo = new JLabelMe();
		this.jLabeleliminacionPerfilCampo.setText(""+PerfilCampoConstantesFunciones.LABEL_ELIMINACION+" : *");
		this.jLabeleliminacionPerfilCampo.setToolTipText("Eliminacion");
		this.jLabeleliminacionPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeleliminacionPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeleliminacionPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeleliminacionPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneleliminacionPerfilCampo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneleliminacionPerfilCampo.setToolTipText(PerfilCampoConstantesFunciones.LABEL_ELIMINACION);
		this.gridaBagLayoutPerfilCampo = new GridBagLayout();
		this.jPaneleliminacionPerfilCampo.setLayout(this.gridaBagLayoutPerfilCampo);


		jCheckBoxeliminacionPerfilCampo= new JCheckBoxMe();
		jCheckBoxeliminacionPerfilCampo.setEnabled(false);

		jCheckBoxeliminacionPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxeliminacionPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxeliminacionPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxeliminacionPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoneliminacionPerfilCampoBusqueda= new JButtonMe();
		this.jButtoneliminacionPerfilCampoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoneliminacionPerfilCampoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoneliminacionPerfilCampoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoneliminacionPerfilCampoBusqueda.setText("U");
		this.jButtoneliminacionPerfilCampoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoneliminacionPerfilCampoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoneliminacionPerfilCampoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxeliminacionPerfilCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxeliminacionPerfilCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"eliminacionPerfilCampoBusqueda"));

		if(this.perfilcampoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoneliminacionPerfilCampoBusqueda.setVisible(false);		}


					
		this.jLabelconsultaPerfilCampo = new JLabelMe();
		this.jLabelconsultaPerfilCampo.setText(""+PerfilCampoConstantesFunciones.LABEL_CONSULTA+" : *");
		this.jLabelconsultaPerfilCampo.setToolTipText("Consulta");
		this.jLabelconsultaPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelconsultaPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelconsultaPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelconsultaPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelconsultaPerfilCampo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelconsultaPerfilCampo.setToolTipText(PerfilCampoConstantesFunciones.LABEL_CONSULTA);
		this.gridaBagLayoutPerfilCampo = new GridBagLayout();
		this.jPanelconsultaPerfilCampo.setLayout(this.gridaBagLayoutPerfilCampo);


		jCheckBoxconsultaPerfilCampo= new JCheckBoxMe();
		jCheckBoxconsultaPerfilCampo.setEnabled(false);

		jCheckBoxconsultaPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxconsultaPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxconsultaPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxconsultaPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonconsultaPerfilCampoBusqueda= new JButtonMe();
		this.jButtonconsultaPerfilCampoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonconsultaPerfilCampoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonconsultaPerfilCampoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonconsultaPerfilCampoBusqueda.setText("U");
		this.jButtonconsultaPerfilCampoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonconsultaPerfilCampoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonconsultaPerfilCampoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxconsultaPerfilCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxconsultaPerfilCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"consultaPerfilCampoBusqueda"));

		if(this.perfilcampoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonconsultaPerfilCampoBusqueda.setVisible(false);		}


					
		this.jLabelestadoPerfilCampo = new JLabelMe();
		this.jLabelestadoPerfilCampo.setText(""+PerfilCampoConstantesFunciones.LABEL_ESTADO+" : *");
		this.jLabelestadoPerfilCampo.setToolTipText("Estado");
		this.jLabelestadoPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestadoPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestadoPerfilCampo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestadoPerfilCampo.setToolTipText(PerfilCampoConstantesFunciones.LABEL_ESTADO);
		this.gridaBagLayoutPerfilCampo = new GridBagLayout();
		this.jPanelestadoPerfilCampo.setLayout(this.gridaBagLayoutPerfilCampo);


		jCheckBoxestadoPerfilCampo= new JCheckBoxMe();
		jCheckBoxestadoPerfilCampo.setEnabled(false);

		jCheckBoxestadoPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxestadoPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonestadoPerfilCampoBusqueda= new JButtonMe();
		this.jButtonestadoPerfilCampoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoPerfilCampoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoPerfilCampoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestadoPerfilCampoBusqueda.setText("U");
		this.jButtonestadoPerfilCampoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestadoPerfilCampoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestadoPerfilCampoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxestadoPerfilCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxestadoPerfilCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estadoPerfilCampoBusqueda"));

		if(this.perfilcampoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestadoPerfilCampoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPerfilCampo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_perfilPerfilCampo = new JLabelMe();
		this.jLabelid_perfilPerfilCampo.setText(""+PerfilCampoConstantesFunciones.LABEL_IDPERFIL+" : *");
		this.jLabelid_perfilPerfilCampo.setToolTipText("Perfil");
		this.jLabelid_perfilPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_perfilPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_perfilPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_perfilPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_perfilPerfilCampo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_perfilPerfilCampo.setToolTipText(PerfilCampoConstantesFunciones.LABEL_IDPERFIL);
		this.gridaBagLayoutPerfilCampo = new GridBagLayout();
		this.jPanelid_perfilPerfilCampo.setLayout(this.gridaBagLayoutPerfilCampo);


		jComboBoxid_perfilPerfilCampo= new JComboBoxMe();
		jComboBoxid_perfilPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_perfilPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_perfilPerfilCampo= new JButtonMe();
		this.jButtonid_perfilPerfilCampo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_perfilPerfilCampo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_perfilPerfilCampo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_perfilPerfilCampo.setText("Buscar");
		this.jButtonid_perfilPerfilCampo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_perfilPerfilCampo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_perfilPerfilCampo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_perfilPerfilCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_perfilPerfilCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilPerfilCampo"));

		this.jButtonid_perfilPerfilCampoBusqueda= new JButtonMe();
		this.jButtonid_perfilPerfilCampoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilPerfilCampoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilPerfilCampoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_perfilPerfilCampoBusqueda.setText("U");
		this.jButtonid_perfilPerfilCampoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_perfilPerfilCampoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_perfilPerfilCampoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_perfilPerfilCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_perfilPerfilCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilPerfilCampoBusqueda"));

		if(this.perfilcampoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_perfilPerfilCampoBusqueda.setVisible(false);		}

		this.jButtonid_perfilPerfilCampoUpdate= new JButtonMe();
		this.jButtonid_perfilPerfilCampoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilPerfilCampoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilPerfilCampoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_perfilPerfilCampoUpdate.setText("U");
		this.jButtonid_perfilPerfilCampoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_perfilPerfilCampoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_perfilPerfilCampoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_perfilPerfilCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_perfilPerfilCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilPerfilCampoUpdate"));



					
		this.jLabelid_campoPerfilCampo = new JLabelMe();
		this.jLabelid_campoPerfilCampo.setText(""+PerfilCampoConstantesFunciones.LABEL_IDCAMPO+" : *");
		this.jLabelid_campoPerfilCampo.setToolTipText("Campo");
		this.jLabelid_campoPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_campoPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_campoPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_campoPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_campoPerfilCampo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_campoPerfilCampo.setToolTipText(PerfilCampoConstantesFunciones.LABEL_IDCAMPO);
		this.gridaBagLayoutPerfilCampo = new GridBagLayout();
		this.jPanelid_campoPerfilCampo.setLayout(this.gridaBagLayoutPerfilCampo);


		jComboBoxid_campoPerfilCampo= new JComboBoxMe();
		jComboBoxid_campoPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_campoPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_campoPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_campoPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_campoPerfilCampo= new JButtonMe();
		this.jButtonid_campoPerfilCampo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_campoPerfilCampo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_campoPerfilCampo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_campoPerfilCampo.setText("Buscar");
		this.jButtonid_campoPerfilCampo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_campoPerfilCampo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_campoPerfilCampo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_campoPerfilCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_campoPerfilCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_campoPerfilCampo"));

		this.jButtonid_campoPerfilCampoBusqueda= new JButtonMe();
		this.jButtonid_campoPerfilCampoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_campoPerfilCampoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_campoPerfilCampoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_campoPerfilCampoBusqueda.setText("U");
		this.jButtonid_campoPerfilCampoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_campoPerfilCampoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_campoPerfilCampoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_campoPerfilCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_campoPerfilCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_campoPerfilCampoBusqueda"));

		if(this.perfilcampoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_campoPerfilCampoBusqueda.setVisible(false);		}

		this.jButtonid_campoPerfilCampoUpdate= new JButtonMe();
		this.jButtonid_campoPerfilCampoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_campoPerfilCampoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_campoPerfilCampoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_campoPerfilCampoUpdate.setText("U");
		this.jButtonid_campoPerfilCampoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_campoPerfilCampoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_campoPerfilCampoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_campoPerfilCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_campoPerfilCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_campoPerfilCampoUpdate"));



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
		//this.jInternalFrameDetallePerfilCampo = new PerfilCampoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Perfil Campo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPerfilCampo= new GridBagLayout();
		

		
		String sToolTipPerfilCampo="";
		sToolTipPerfilCampo=PerfilCampoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPerfilCampo+="(Seguridad.PerfilCampo)";
		}
		
		if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPerfilCampo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPerfilCampo = new JButtonMe();
		this.jButtonModificarPerfilCampo = new JButtonMe();
        this.jButtonActualizarPerfilCampo = new JButtonMe();
        this.jButtonEliminarPerfilCampo = new JButtonMe();
        this.jButtonCancelarPerfilCampo = new JButtonMe();
        this.jButtonGuardarCambiosPerfilCampo = new JButtonMe();
		this.jButtonGuardarCambiosTablaPerfilCampo = new JButtonMe();
		this.jButtonCerrarPerfilCampo = new JButtonMe();
		
		this.jScrollPanelDatosPerfilCampo = new JScrollPane();   
        this.jScrollPanelDatosEdicionPerfilCampo = new JScrollPane();
		this.jScrollPanelDatosGeneralPerfilCampo = new JScrollPane();
				
		
		
		this.jPanelCamposPerfilCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPerfilCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPerfilCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPerfilCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Perfil Campo";
		
		if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Campos" + this.sPath));
		} else {
			this.jScrollPanelDatosPerfilCampo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPerfilCampo.setName("jPanelCamposPerfilCampo"); 

		this.jPanelCamposOcultosPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPerfilCampo.setName("jPanelCamposOcultosPerfilCampo"); 

        this.jPanelAccionesPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPerfilCampo.setToolTipText("Acciones");
        this.jPanelAccionesPerfilCampo.setName("Acciones"); 

		this.jPanelAccionesFormularioPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPerfilCampo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPerfilCampo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPerfilCampo.setText("Nuevo");
		this.jButtonModificarPerfilCampo.setText("Editar");
        this.jButtonActualizarPerfilCampo.setText("Actualizar");
        this.jButtonEliminarPerfilCampo.setText("Eliminar");
        this.jButtonCancelarPerfilCampo.setText("Cancelar");
        this.jButtonGuardarCambiosPerfilCampo.setText("Guardar");
		this.jButtonGuardarCambiosTablaPerfilCampo.setText("Guardar");
		this.jButtonCerrarPerfilCampo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPerfilCampo,"nuevo_button","Nuevo",this.perfilcampoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPerfilCampo,"modificar_button","Editar",this.perfilcampoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPerfilCampo,"actualizar_button","Actualizar",this.perfilcampoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPerfilCampo,"eliminar_button","Eliminar",this.perfilcampoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPerfilCampo,"cancelar_button","Cancelar",this.perfilcampoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPerfilCampo,"guardarcambios_button","Guardar",this.perfilcampoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPerfilCampo,"guardarcambiostabla_button","Guardar",this.perfilcampoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPerfilCampo,"cerrar_button","Salir",this.perfilcampoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPerfilCampo.setToolTipText("Nuevo"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPerfilCampo.setToolTipText("Editar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPerfilCampo.setToolTipText("Actualizar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPerfilCampo.setToolTipText("Eliminar)"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPerfilCampo.setToolTipText("Cancelar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPerfilCampo.setToolTipText("Guardar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPerfilCampo.setToolTipText("Guardar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPerfilCampo.setToolTipText("Salir"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPerfilCampo";
		inputMap = this.jButtonNuevoPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPerfilCampo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPerfilCampo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPerfilCampo";
		inputMap = this.jButtonActualizarPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPerfilCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPerfilCampo"));
		
		//ELIMINAR
		sMapKey = "EliminarPerfilCampo";
		inputMap = this.jButtonEliminarPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPerfilCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPerfilCampo"));
		
		//CANCELAR	
		sMapKey = "CancelarPerfilCampo";
		inputMap = this.jButtonCancelarPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPerfilCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPerfilCampo"));
		
		//CERRAR		
		sMapKey = "CerrarPerfilCampo";
		inputMap = this.jButtonCerrarPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPerfilCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPerfilCampo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPerfilCampo";
		inputMap = this.jButtonGuardarCambiosTablaPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPerfilCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPerfilCampo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPerfilCampo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPerfilCampo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPerfilCampo.setToolTipText("Nuevo PerfilCampo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPerfilCampo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPerfilCampo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPerfilCampo.setToolTipText("Sin Cerrar Ventana PerfilCampo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePerfilCampo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePerfilCampo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePerfilCampo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPerfilCampo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPerfilCampo.setText("Accion");
		this.jComboBoxTiposAccionesPerfilCampo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPerfilCampo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPerfilCampo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPerfilCampo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPerfilCampo = new JLabelMe();
		
		this.jLabelAccionesPerfilCampo.setText("Acciones");		
		this.jLabelAccionesPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPerfilCampo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPerfilCampo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPerfilCampo=new JTabbedPane();
		this.jTabbedPaneRelacionesPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPerfilCampo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPerfilCampo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfilCampo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfilCampo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPerfilCampo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPerfilCampo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPerfilCampo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPerfilCampo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPerfilCampo = new GridBagLayout();
		
		this.jPanelCamposPerfilCampo.setLayout(gridaBagLayoutCamposPerfilCampo);
		this.jPanelCamposOcultosPerfilCampo.setLayout(gridaBagLayoutCamposOcultosPerfilCampo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 0;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPerfilCampo.add(jLabelIdPerfilCampo, this.gridBagConstraintsPerfilCampo);



	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 1;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPerfilCampo.add(jLabelidPerfilCampo, this.gridBagConstraintsPerfilCampo);


	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 0;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_perfilPerfilCampo.add(jLabelid_perfilPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	//this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 2;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_perfilPerfilCampo.add(jButtonid_perfilPerfilCampo, this.gridBagConstraintsPerfilCampo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		//this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilCampo.gridy = 0;
		this.gridBagConstraintsPerfilCampo.gridx = 3;
		this.gridBagConstraintsPerfilCampo.ipadx = 0;
		this.gridBagConstraintsPerfilCampo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_perfilPerfilCampo.add(jButtonid_perfilPerfilCampoBusqueda, this.gridBagConstraintsPerfilCampo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		//this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilCampo.gridy = 0;
		this.gridBagConstraintsPerfilCampo.gridx = 4;
		this.gridBagConstraintsPerfilCampo.ipadx = 0;
		this.gridBagConstraintsPerfilCampo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_perfilPerfilCampo.add(jButtonid_perfilPerfilCampoUpdate, this.gridBagConstraintsPerfilCampo);
	}

	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 1;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_perfilPerfilCampo.add(jComboBoxid_perfilPerfilCampo, this.gridBagConstraintsPerfilCampo);


	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 0;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_campoPerfilCampo.add(jLabelid_campoPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		//this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilCampo.gridy = 0;
		this.gridBagConstraintsPerfilCampo.gridx = 2;
		this.gridBagConstraintsPerfilCampo.ipadx = 0;
		this.gridBagConstraintsPerfilCampo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_campoPerfilCampo.add(jButtonid_campoPerfilCampoBusqueda, this.gridBagConstraintsPerfilCampo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		//this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilCampo.gridy = 0;
		this.gridBagConstraintsPerfilCampo.gridx = 3;
		this.gridBagConstraintsPerfilCampo.ipadx = 0;
		this.gridBagConstraintsPerfilCampo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_campoPerfilCampo.add(jButtonid_campoPerfilCampoUpdate, this.gridBagConstraintsPerfilCampo);
	}

	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 1;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_campoPerfilCampo.add(jComboBoxid_campoPerfilCampo, this.gridBagConstraintsPerfilCampo);


	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 0;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltodoPerfilCampo.add(jLabeltodoPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		//this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilCampo.gridy = 0;
		this.gridBagConstraintsPerfilCampo.gridx = 2;
		this.gridBagConstraintsPerfilCampo.ipadx = 0;
		this.gridBagConstraintsPerfilCampo.insets = new Insets(0, 0, 0, 0);
		this.jPaneltodoPerfilCampo.add(jButtontodoPerfilCampoBusqueda, this.gridBagConstraintsPerfilCampo);
	}

	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 1;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltodoPerfilCampo.add(jCheckBoxtodoPerfilCampo, this.gridBagConstraintsPerfilCampo);


	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 0;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelingresoPerfilCampo.add(jLabelingresoPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		//this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilCampo.gridy = 0;
		this.gridBagConstraintsPerfilCampo.gridx = 2;
		this.gridBagConstraintsPerfilCampo.ipadx = 0;
		this.gridBagConstraintsPerfilCampo.insets = new Insets(0, 0, 0, 0);
		this.jPanelingresoPerfilCampo.add(jButtoningresoPerfilCampoBusqueda, this.gridBagConstraintsPerfilCampo);
	}

	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 1;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelingresoPerfilCampo.add(jCheckBoxingresoPerfilCampo, this.gridBagConstraintsPerfilCampo);


	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 0;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmodificacionPerfilCampo.add(jLabelmodificacionPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		//this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilCampo.gridy = 0;
		this.gridBagConstraintsPerfilCampo.gridx = 2;
		this.gridBagConstraintsPerfilCampo.ipadx = 0;
		this.gridBagConstraintsPerfilCampo.insets = new Insets(0, 0, 0, 0);
		this.jPanelmodificacionPerfilCampo.add(jButtonmodificacionPerfilCampoBusqueda, this.gridBagConstraintsPerfilCampo);
	}

	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 1;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmodificacionPerfilCampo.add(jCheckBoxmodificacionPerfilCampo, this.gridBagConstraintsPerfilCampo);


	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 0;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneleliminacionPerfilCampo.add(jLabeleliminacionPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		//this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilCampo.gridy = 0;
		this.gridBagConstraintsPerfilCampo.gridx = 2;
		this.gridBagConstraintsPerfilCampo.ipadx = 0;
		this.gridBagConstraintsPerfilCampo.insets = new Insets(0, 0, 0, 0);
		this.jPaneleliminacionPerfilCampo.add(jButtoneliminacionPerfilCampoBusqueda, this.gridBagConstraintsPerfilCampo);
	}

	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 1;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneleliminacionPerfilCampo.add(jCheckBoxeliminacionPerfilCampo, this.gridBagConstraintsPerfilCampo);


	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 0;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelconsultaPerfilCampo.add(jLabelconsultaPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		//this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilCampo.gridy = 0;
		this.gridBagConstraintsPerfilCampo.gridx = 2;
		this.gridBagConstraintsPerfilCampo.ipadx = 0;
		this.gridBagConstraintsPerfilCampo.insets = new Insets(0, 0, 0, 0);
		this.jPanelconsultaPerfilCampo.add(jButtonconsultaPerfilCampoBusqueda, this.gridBagConstraintsPerfilCampo);
	}

	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 1;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelconsultaPerfilCampo.add(jCheckBoxconsultaPerfilCampo, this.gridBagConstraintsPerfilCampo);


	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 0;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestadoPerfilCampo.add(jLabelestadoPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		//this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilCampo.gridy = 0;
		this.gridBagConstraintsPerfilCampo.gridx = 2;
		this.gridBagConstraintsPerfilCampo.ipadx = 0;
		this.gridBagConstraintsPerfilCampo.insets = new Insets(0, 0, 0, 0);
		this.jPanelestadoPerfilCampo.add(jButtonestadoPerfilCampoBusqueda, this.gridBagConstraintsPerfilCampo);
	}

	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilCampo.gridy = 0;
	this.gridBagConstraintsPerfilCampo.gridx = 1;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestadoPerfilCampo.add(jCheckBoxestadoPerfilCampo, this.gridBagConstraintsPerfilCampo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilCampo.gridy = iYPanelCamposPerfilCampo;
	this.gridBagConstraintsPerfilCampo.gridx = iXPanelCamposPerfilCampo++;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilCampo.add(this.jPanelidPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(iXPanelCamposPerfilCampo % 1==0) {
		iXPanelCamposPerfilCampo=0;
		iYPanelCamposPerfilCampo++;
	}
	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilCampo.gridy = iYPanelCamposPerfilCampo;
	this.gridBagConstraintsPerfilCampo.gridx = iXPanelCamposPerfilCampo++;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilCampo.add(this.jPanelid_perfilPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(iXPanelCamposPerfilCampo % 1==0) {
		iXPanelCamposPerfilCampo=0;
		iYPanelCamposPerfilCampo++;
	}
	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilCampo.gridy = iYPanelCamposPerfilCampo;
	this.gridBagConstraintsPerfilCampo.gridx = iXPanelCamposPerfilCampo++;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilCampo.add(this.jPanelid_campoPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(iXPanelCamposPerfilCampo % 1==0) {
		iXPanelCamposPerfilCampo=0;
		iYPanelCamposPerfilCampo++;
	}
	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilCampo.gridy = iYPanelCamposPerfilCampo;
	this.gridBagConstraintsPerfilCampo.gridx = iXPanelCamposPerfilCampo++;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilCampo.add(this.jPaneltodoPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(iXPanelCamposPerfilCampo % 1==0) {
		iXPanelCamposPerfilCampo=0;
		iYPanelCamposPerfilCampo++;
	}
	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilCampo.gridy = iYPanelCamposPerfilCampo;
	this.gridBagConstraintsPerfilCampo.gridx = iXPanelCamposPerfilCampo++;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilCampo.add(this.jPanelingresoPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(iXPanelCamposPerfilCampo % 1==0) {
		iXPanelCamposPerfilCampo=0;
		iYPanelCamposPerfilCampo++;
	}
	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilCampo.gridy = iYPanelCamposPerfilCampo;
	this.gridBagConstraintsPerfilCampo.gridx = iXPanelCamposPerfilCampo++;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilCampo.add(this.jPanelmodificacionPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(iXPanelCamposPerfilCampo % 1==0) {
		iXPanelCamposPerfilCampo=0;
		iYPanelCamposPerfilCampo++;
	}
	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilCampo.gridy = iYPanelCamposPerfilCampo;
	this.gridBagConstraintsPerfilCampo.gridx = iXPanelCamposPerfilCampo++;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilCampo.add(this.jPaneleliminacionPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(iXPanelCamposPerfilCampo % 1==0) {
		iXPanelCamposPerfilCampo=0;
		iYPanelCamposPerfilCampo++;
	}
	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilCampo.gridy = iYPanelCamposPerfilCampo;
	this.gridBagConstraintsPerfilCampo.gridx = iXPanelCamposPerfilCampo++;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilCampo.add(this.jPanelconsultaPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(iXPanelCamposPerfilCampo % 1==0) {
		iXPanelCamposPerfilCampo=0;
		iYPanelCamposPerfilCampo++;
	}
	this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilCampo.gridy = iYPanelCamposPerfilCampo;
	this.gridBagConstraintsPerfilCampo.gridx = iXPanelCamposPerfilCampo++;
	this.gridBagConstraintsPerfilCampo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPerfilCampo.add(this.jPanelestadoPerfilCampo, this.gridBagConstraintsPerfilCampo);



	if(iXPanelCamposPerfilCampo % 1==0) {
		iXPanelCamposPerfilCampo=0;
		iYPanelCamposPerfilCampo++;
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
			
		GridBagLayout gridaBagLayoutAccionesPerfilCampo= new GridBagLayout();
		this.jPanelAccionesPerfilCampo.setLayout(gridaBagLayoutAccionesPerfilCampo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPerfilCampo= new GridBagLayout();
		this.jPanelAccionesFormularioPerfilCampo.setLayout(gridaBagLayoutAccionesFormularioPerfilCampo);
		
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPerfilCampo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPerfilCampo.add(this.jComboBoxTiposAccionesFormularioPerfilCampo, this.gridBagConstraintsPerfilCampo);

		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPerfilCampo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPerfilCampo.add(this.jCheckBoxPostAccionNuevoPerfilCampo, this.gridBagConstraintsPerfilCampo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.perfilcampoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPerfilCampo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPerfilCampo.add(this.jCheckBoxPostAccionSinCerrarPerfilCampo, this.gridBagConstraintsPerfilCampo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.perfilcampoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPerfilCampo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPerfilCampo.add(this.jCheckBoxPostAccionSinMensajePerfilCampo, this.gridBagConstraintsPerfilCampo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilCampo.gridy = 0;
		this.gridBagConstraintsPerfilCampo.gridx = iPosXAccion++;
			
		this.jPanelAccionesPerfilCampo.add(this.jButtonModificarPerfilCampo, this.gridBagConstraintsPerfilCampo);							

		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilCampo.gridy = 0;
		this.gridBagConstraintsPerfilCampo.gridx =iPosXAccion++;
			
		this.jPanelAccionesPerfilCampo.add(this.jButtonEliminarPerfilCampo, this.gridBagConstraintsPerfilCampo);
		
			
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy = 0;		
		this.gridBagConstraintsPerfilCampo.gridx = iPosXAccion++;
		
		this.jPanelAccionesPerfilCampo.add(this.jButtonActualizarPerfilCampo, this.gridBagConstraintsPerfilCampo);


		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy = 0;		
		this.gridBagConstraintsPerfilCampo.gridx = iPosXAccion++;
		
		this.jPanelAccionesPerfilCampo.add(this.jButtonGuardarCambiosPerfilCampo, this.gridBagConstraintsPerfilCampo);	
		
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy = 0;		
		this.gridBagConstraintsPerfilCampo.gridx =iPosXAccion++;
		
		this.jPanelAccionesPerfilCampo.add(this.jButtonCancelarPerfilCampo, this.gridBagConstraintsPerfilCampo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPerfilCampo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPerfilCampo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.perfilcampoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();						
			this.gridBagConstraintsPerfilCampo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPerfilCampo.gridx = 0;		
			//this.gridBagConstraintsPerfilCampo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPerfilCampo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPerfilCampo.gridx =0;
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPerfilCampo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPerfilCampo, this.gridBagConstraintsPerfilCampo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PerfilCampoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePerfilCampo = new PerfilCampoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Perfil Campo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Perfil Campo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Perfil Campo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PerfilCampoModel perfilcampoModel=new PerfilCampoModel(this);
			
			//SI USARA CLASE INTERNA
			//PerfilCampoModel.PerfilCampoFocusTraversalPolicy perfilcampoFocusTraversalPolicy = perfilcampoModel.new PerfilCampoFocusTraversalPolicy(this);
			
			//perfilcampoFocusTraversalPolicy.setperfilcampoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(perfilcampoModel);
			
			
			this.jContentPaneDetallePerfilCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePerfilCampo = new GridBagLayout();	
			this.jContentPaneDetallePerfilCampo.setLayout(gridaBagLayoutDetallePerfilCampo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPerfilCampo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
				this.gridBagConstraintsPerfilCampo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPerfilCampo.gridx = 0;
					
				
				this.jContentPaneDetallePerfilCampo.add(jTtoolBarDetallePerfilCampo, gridBagConstraintsPerfilCampo);								
				
}
			
			this.jScrollPanelDatosEdicionPerfilCampo=   new JScrollPane(jContentPaneDetallePerfilCampo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPerfilCampo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfilCampo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfilCampo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPerfilCampo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPerfilCampo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfilCampo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfilCampo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPerfilCampo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPerfilCampo.gridx = 0;
	        
			this.jContentPaneDetallePerfilCampo.add(jPanelCamposPerfilCampo, gridBagConstraintsPerfilCampo);
			
			
			
			
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
						&& perfilcampoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.perfilcampoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPerfilCampo= new GridBagConstraints();
						this.gridBagConstraintsPerfilCampo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPerfilCampo.gridx = 0;
						this.jContentPaneDetallePerfilCampo.add(this.jTabbedPaneRelacionesPerfilCampo, this.gridBagConstraintsPerfilCampo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPerfilCampo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPerfilCampo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
					this.gridBagConstraintsPerfilCampo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPerfilCampo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPerfilCampo.gridx = 0;
					
				
					this.jContentPaneDetallePerfilCampo.add(jPanelCamposOcultosPerfilCampo, gridBagConstraintsPerfilCampo);
				
					this.jPanelCamposOcultosPerfilCampo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPerfilCampo.gridx = 0;
	        this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePerfilCampo.add(this.jPanelAccionesFormularioPerfilCampo, this.gridBagConstraintsPerfilCampo);							
			
			
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
	        this.gridBagConstraintsPerfilCampo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPerfilCampo.gridx = 0;
	        
			
			this.jContentPaneDetallePerfilCampo.add(this.jPanelAccionesPerfilCampo, this.gridBagConstraintsPerfilCampo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPerfilCampo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPerfilCampo=   new JScrollPane(this.jPanelCamposPerfilCampo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPerfilCampo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfilCampo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfilCampo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPerfilCampo.gridx = 0;
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPerfilCampo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPerfilCampo, this.gridBagConstraintsPerfilCampo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPerfilCampo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPerfilCampo, this.gridBagConstraintsPerfilCampo);			
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPerfilCampo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPerfilCampo, this.gridBagConstraintsPerfilCampo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilCampo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPerfilCampo, this.gridBagConstraintsPerfilCampo);
			
			
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilCampo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPerfilCampo, this.gridBagConstraintsPerfilCampo);
		
			
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPerfilCampo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPerfilCampo, this.gridBagConstraintsPerfilCampo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPerfilCampo;//jContentPane;
		
		return jScrollPanelDatosEdicionPerfilCampo;
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
