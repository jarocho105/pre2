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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TipoParamFactuSecuenciaTrabajoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TipoParamFactuSecuenciaTrabajoDetalleFormJInternalFrame extends TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo;
	
	protected JMenuBar jmenuBarDetalleTipoParamFactuSecuenciaTrabajo;
	
	protected JMenu jmenuDetalleTipoParamFactuSecuenciaTrabajo;
	protected JMenu jmenuDetalleArchivoTipoParamFactuSecuenciaTrabajo;
	protected JMenu jmenuDetalleAccionesTipoParamFactuSecuenciaTrabajo;
	protected JMenu jmenuDetalleDatosTipoParamFactuSecuenciaTrabajo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoParamFactuSecuenciaTrabajo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoParamFactuSecuenciaTrabajo;	
	protected GridBagConstraints gridBagConstraintsTipoParamFactuSecuenciaTrabajo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoParamFactuSecuenciaTrabajo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoParamFactuSecuenciaTrabajoSessionBean tipoparamfactusecuenciatrabajoSessionBean;
	
	
	
		
	
	public TipoParamFactuSecuenciaTrabajoLogic tipoparamfactusecuenciatrabajoLogic;
	
	public JScrollPane jScrollPanelDatosTipoParamFactuSecuenciaTrabajo;
	public JScrollPane jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo;
	public JScrollPane jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo;
	
	protected JPanel jPanelCamposTipoParamFactuSecuenciaTrabajo;    
	protected JPanel jPanelCamposOcultosTipoParamFactuSecuenciaTrabajo;    	
	protected JPanel jPanelAccionesTipoParamFactuSecuenciaTrabajo;
	protected JPanel jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo;
    
	
	
	protected Integer iXPanelCamposTipoParamFactuSecuenciaTrabajo=0;
	protected Integer iYPanelCamposTipoParamFactuSecuenciaTrabajo=0;
	
	protected Integer iXPanelCamposOcultosTipoParamFactuSecuenciaTrabajo=0;
	protected Integer iYPanelCamposOcultosTipoParamFactuSecuenciaTrabajo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoParamFactuSecuenciaTrabajo;
	public JButton jButtonModificarTipoParamFactuSecuenciaTrabajo;
	public JButton jButtonActualizarTipoParamFactuSecuenciaTrabajo;
    public JButton jButtonEliminarTipoParamFactuSecuenciaTrabajo;
	public JButton jButtonCancelarTipoParamFactuSecuenciaTrabajo;
    public JButton jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajo;
	public JButton jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonCerrarTipoParamFactuSecuenciaTrabajo;
	
	
	protected JButton jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoParamFactuSecuenciaTrabajo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoParamFactuSecuenciaTrabajo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoParamFactuSecuenciaTrabajo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonModificarToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonActualizarToolBarTipoParamFactuSecuenciaTrabajo;
    protected JButton jButtonEliminarToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonCancelarToolBarTipoParamFactuSecuenciaTrabajo;
    protected JButton jButtonGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoParamFactuSecuenciaTrabajo;
	protected JButton jButtonCerrarToolBarTipoParamFactuSecuenciaTrabajo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoParamFactuSecuenciaTrabajo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemModificarTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemActualizarTipoParamFactuSecuenciaTrabajo;
    protected JMenuItem jMenuItemEliminarTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemCancelarTipoParamFactuSecuenciaTrabajo;
    protected JMenuItem jMenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemCerrarTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemDetalleCerrarTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoParamFactuSecuenciaTrabajo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo;
	protected JMenuItem jMenuItemMostrarOcultarTipoParamFactuSecuenciaTrabajo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoParamFactuSecuenciaTrabajo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoParamFactuSecuenciaTrabajo;
	public JLabel jLabelIdTipoParamFactuSecuenciaTrabajo;
	public JTextFieldMe jTextFieldidTipoParamFactuSecuenciaTrabajo;
	public JButton jButtonidTipoParamFactuSecuenciaTrabajoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoParamFactuSecuenciaTrabajo;
	public JLabel jLabelnombreTipoParamFactuSecuenciaTrabajo;
	public JTextArea jTextAreanombreTipoParamFactuSecuenciaTrabajo;
	public JScrollPane jscrollPanenombreTipoParamFactuSecuenciaTrabajo;
	public JButton jButtonnombreTipoParamFactuSecuenciaTrabajoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo;
	
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
	
	public TipoParamFactuSecuenciaTrabajoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoParamFactuSecuenciaTrabajo=new JPanel();
				this.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo=new JPanel();
				this.jmenuBarDetalleTipoParamFactuSecuenciaTrabajo=new JMenuBar();
				this.jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuSecuenciaTrabajoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoParamFactuSecuenciaTrabajo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoParamFactuSecuenciaTrabajoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoParamFactuSecuenciaTrabajo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuSecuenciaTrabajoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParamFactuSecuenciaTrabajo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuSecuenciaTrabajoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParamFactuSecuenciaTrabajo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuSecuenciaTrabajoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoParamFactuSecuenciaTrabajo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoParamFactuSecuenciaTrabajo() {
		return this.jButtonActualizarToolBarTipoParamFactuSecuenciaTrabajo;
	}
	
	public JButton getjButtonEliminarToolBarTipoParamFactuSecuenciaTrabajo() {
		return this.jButtonEliminarToolBarTipoParamFactuSecuenciaTrabajo;
	}
	
	public JButton getjButtonCancelarToolBarTipoParamFactuSecuenciaTrabajo() {
		return this.jButtonCancelarToolBarTipoParamFactuSecuenciaTrabajo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo() {
		return this.jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo)	{
		this.jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo = jButtonProcesarInformacionTipoParamFactuSecuenciaTrabajo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo() {
		return this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo(
			JComboBox jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo) {
		this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo = jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo(
			JComboBox jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo) {
		this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo = jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo() {
		return this.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo(
			JComboBox jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo) {
		this.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo = jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoparamfactusecuenciatrabajoSessionBean=new TipoParamFactuSecuenciaTrabajoSessionBean();
		
		this.tipoparamfactusecuenciatrabajoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparamfactusecuenciatrabajoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoParamFactuSecuenciaTrabajoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoParamFactuSecuenciaTrabajoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoParamFactuSecuenciaTrabajoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Secuencia Trabajo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoParamFactuSecuenciaTrabajoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoParamFactuSecuenciaTrabajo=new JButtonMe();
				this.jButtonModificarToolBarTipoParamFactuSecuenciaTrabajo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo,
							"actualizar","actualizar","Actualizar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo,
							"eliminar","eliminar","Eliminar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo,
							"cancelar","cancelar","Cancelar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoParamFactuSecuenciaTrabajo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoParamFactuSecuenciaTrabajo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoParamFactuSecuenciaTrabajo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoParamFactuSecuenciaTrabajo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoParamFactuSecuenciaTrabajo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoParamFactuSecuenciaTrabajo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoParamFactuSecuenciaTrabajo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoParamFactuSecuenciaTrabajo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoParamFactuSecuenciaTrabajo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoParamFactuSecuenciaTrabajo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoParamFactuSecuenciaTrabajo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoParamFactuSecuenciaTrabajo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoParamFactuSecuenciaTrabajo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoParamFactuSecuenciaTrabajo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoParamFactuSecuenciaTrabajo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoParamFactuSecuenciaTrabajo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoParamFactuSecuenciaTrabajo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoParamFactuSecuenciaTrabajo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoParamFactuSecuenciaTrabajo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoParamFactuSecuenciaTrabajo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoParamFactuSecuenciaTrabajo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoParamFactuSecuenciaTrabajo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoParamFactuSecuenciaTrabajo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoParamFactuSecuenciaTrabajo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoParamFactuSecuenciaTrabajo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoParamFactuSecuenciaTrabajo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoParamFactuSecuenciaTrabajo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoParamFactuSecuenciaTrabajo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoParamFactuSecuenciaTrabajo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoParamFactuSecuenciaTrabajo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoParamFactuSecuenciaTrabajo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoParamFactuSecuenciaTrabajo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoParamFactuSecuenciaTrabajo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoParamFactuSecuenciaTrabajo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoParamFactuSecuenciaTrabajo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemDetalleCerrarTipoParamFactuSecuenciaTrabajo);
		
		this.jmenuDetalleAccionesTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemActualizarTipoParamFactuSecuenciaTrabajo);
		this.jmenuDetalleAccionesTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemEliminarTipoParamFactuSecuenciaTrabajo);
		this.jmenuDetalleAccionesTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemCancelarTipoParamFactuSecuenciaTrabajo);		
		
		//this.jmenuDetalleDatosTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemDetalleAbrirOrderByTipoParamFactuSecuenciaTrabajo);				
		this.jmenuDetalleDatosTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemDetalleMostarOcultarTipoParamFactuSecuenciaTrabajo);				
				
		//this.jmenuDetalleAccionesTipoParamFactuSecuenciaTrabajo.add(this.jMenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoParamFactuSecuenciaTrabajo.add(this.jmenuDetalleArchivoTipoParamFactuSecuenciaTrabajo);		
		this.jmenuBarDetalleTipoParamFactuSecuenciaTrabajo.add(this.jmenuDetalleAccionesTipoParamFactuSecuenciaTrabajo);		
		this.jmenuBarDetalleTipoParamFactuSecuenciaTrabajo.add(this.jmenuDetalleDatosTipoParamFactuSecuenciaTrabajo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoParamFactuSecuenciaTrabajo);				
	}
	
	
	public void inicializarElementosCamposTipoParamFactuSecuenciaTrabajo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoParamFactuSecuenciaTrabajo = new JLabelMe();
		jLabelIdTipoParamFactuSecuenciaTrabajo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoParamFactuSecuenciaTrabajo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoParamFactuSecuenciaTrabajo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoParamFactuSecuenciaTrabajo.setToolTipText(TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoParamFactuSecuenciaTrabajo= new GridBagLayout();

		this.jPanelidTipoParamFactuSecuenciaTrabajo.setLayout(this.gridaBagLayoutTipoParamFactuSecuenciaTrabajo);

		jTextFieldidTipoParamFactuSecuenciaTrabajo = new JTextFieldMe();
		jTextFieldidTipoParamFactuSecuenciaTrabajo.setText("Id");

		jTextFieldidTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoParamFactuSecuenciaTrabajo = new JLabelMe();
		this.jLabelnombreTipoParamFactuSecuenciaTrabajo.setText(""+TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoParamFactuSecuenciaTrabajo.setToolTipText("Nombre");
		this.jLabelnombreTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoParamFactuSecuenciaTrabajo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoParamFactuSecuenciaTrabajo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoParamFactuSecuenciaTrabajo.setToolTipText(TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoParamFactuSecuenciaTrabajo = new GridBagLayout();
		this.jPanelnombreTipoParamFactuSecuenciaTrabajo.setLayout(this.gridaBagLayoutTipoParamFactuSecuenciaTrabajo);


		jTextAreanombreTipoParamFactuSecuenciaTrabajo= new JTextAreaMe();
		jTextAreanombreTipoParamFactuSecuenciaTrabajo.setEnabled(false);
		jTextAreanombreTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParamFactuSecuenciaTrabajo.setLineWrap(true);
		jTextAreanombreTipoParamFactuSecuenciaTrabajo.setWrapStyleWord(true);
		jTextAreanombreTipoParamFactuSecuenciaTrabajo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoParamFactuSecuenciaTrabajo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoParamFactuSecuenciaTrabajo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoParamFactuSecuenciaTrabajo = new JScrollPane(jTextAreanombreTipoParamFactuSecuenciaTrabajo);
		jscrollPanenombreTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));

		this.jButtonnombreTipoParamFactuSecuenciaTrabajoBusqueda= new JButtonMe();
		this.jButtonnombreTipoParamFactuSecuenciaTrabajoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoParamFactuSecuenciaTrabajoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoParamFactuSecuenciaTrabajoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoParamFactuSecuenciaTrabajoBusqueda.setText("U");
		this.jButtonnombreTipoParamFactuSecuenciaTrabajoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoParamFactuSecuenciaTrabajoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoParamFactuSecuenciaTrabajoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoParamFactuSecuenciaTrabajo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoParamFactuSecuenciaTrabajo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoParamFactuSecuenciaTrabajoBusqueda"));

		if(this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoParamFactuSecuenciaTrabajoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoParamFactuSecuenciaTrabajo() {
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
		//this.jInternalFrameDetalleTipoParamFactuSecuenciaTrabajo = new TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Secuencia Trabajo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoParamFactuSecuenciaTrabajo= new GridBagLayout();
		

		
		String sToolTipTipoParamFactuSecuenciaTrabajo="";
		sToolTipTipoParamFactuSecuenciaTrabajo=TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoParamFactuSecuenciaTrabajo+="(Facturacion.TipoParamFactuSecuenciaTrabajo)";
		}
		
		if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoParamFactuSecuenciaTrabajo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonModificarTipoParamFactuSecuenciaTrabajo = new JButtonMe();
        this.jButtonActualizarTipoParamFactuSecuenciaTrabajo = new JButtonMe();
        this.jButtonEliminarTipoParamFactuSecuenciaTrabajo = new JButtonMe();
        this.jButtonCancelarTipoParamFactuSecuenciaTrabajo = new JButtonMe();
        this.jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		this.jButtonCerrarTipoParamFactuSecuenciaTrabajo = new JButtonMe();
		
		this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoParamFactuSecuenciaTrabajo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoParamFactuSecuenciaTrabajo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoParamFactuSecuenciaTrabajo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Secuencia Trabajo";
		
		if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Secuencia Trabajos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoParamFactuSecuenciaTrabajo.setName("jPanelCamposTipoParamFactuSecuenciaTrabajo"); 

		this.jPanelCamposOcultosTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoParamFactuSecuenciaTrabajo.setName("jPanelCamposOcultosTipoParamFactuSecuenciaTrabajo"); 

        this.jPanelAccionesTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoParamFactuSecuenciaTrabajo.setToolTipText("Acciones");
        this.jPanelAccionesTipoParamFactuSecuenciaTrabajo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoParamFactuSecuenciaTrabajo.setText("Nuevo");
		this.jButtonModificarTipoParamFactuSecuenciaTrabajo.setText("Editar");
        this.jButtonActualizarTipoParamFactuSecuenciaTrabajo.setText("Actualizar");
        this.jButtonEliminarTipoParamFactuSecuenciaTrabajo.setText("Eliminar");
        this.jButtonCancelarTipoParamFactuSecuenciaTrabajo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.setText("Guardar");
		this.jButtonCerrarTipoParamFactuSecuenciaTrabajo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoParamFactuSecuenciaTrabajo,"nuevo_button","Nuevo",this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoParamFactuSecuenciaTrabajo,"modificar_button","Editar",this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoParamFactuSecuenciaTrabajo,"actualizar_button","Actualizar",this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoParamFactuSecuenciaTrabajo,"eliminar_button","Eliminar",this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoParamFactuSecuenciaTrabajo,"cancelar_button","Cancelar",this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajo,"guardarcambios_button","Guardar",this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo,"guardarcambiostabla_button","Guardar",this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoParamFactuSecuenciaTrabajo,"cerrar_button","Salir",this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoParamFactuSecuenciaTrabajo.setToolTipText("Nuevo"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoParamFactuSecuenciaTrabajo.setToolTipText("Editar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoParamFactuSecuenciaTrabajo.setToolTipText("Actualizar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoParamFactuSecuenciaTrabajo.setToolTipText("Eliminar)"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoParamFactuSecuenciaTrabajo.setToolTipText("Cancelar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajo.setToolTipText("Guardar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.setToolTipText("Guardar"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoParamFactuSecuenciaTrabajo.setToolTipText("Salir"+" "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonNuevoTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoParamFactuSecuenciaTrabajo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonActualizarTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoParamFactuSecuenciaTrabajo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonEliminarTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoParamFactuSecuenciaTrabajo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonCancelarTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoParamFactuSecuenciaTrabajo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonCerrarTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoParamFactuSecuenciaTrabajo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoParamFactuSecuenciaTrabajo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoParamFactuSecuenciaTrabajo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoParamFactuSecuenciaTrabajo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoParamFactuSecuenciaTrabajo.setToolTipText("Nuevo TipoParamFactuSecuenciaTrabajo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoParamFactuSecuenciaTrabajo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoParamFactuSecuenciaTrabajo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoParamFactuSecuenciaTrabajo.setToolTipText("Sin Cerrar Ventana TipoParamFactuSecuenciaTrabajo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoParamFactuSecuenciaTrabajo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoParamFactuSecuenciaTrabajo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoParamFactuSecuenciaTrabajo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setText("Accion");
		this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoParamFactuSecuenciaTrabajo = new JLabelMe();
		
		this.jLabelAccionesTipoParamFactuSecuenciaTrabajo.setText("Acciones");		
		this.jLabelAccionesTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoParamFactuSecuenciaTrabajo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoParamFactuSecuenciaTrabajo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoParamFactuSecuenciaTrabajo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoParamFactuSecuenciaTrabajo = new GridBagLayout();
		
		this.jPanelCamposTipoParamFactuSecuenciaTrabajo.setLayout(gridaBagLayoutCamposTipoParamFactuSecuenciaTrabajo);
		this.jPanelCamposOcultosTipoParamFactuSecuenciaTrabajo.setLayout(gridaBagLayoutCamposOcultosTipoParamFactuSecuenciaTrabajo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.ipadx = 0;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoParamFactuSecuenciaTrabajo.add(jLabelIdTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);



	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 1;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.ipadx = 0;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoParamFactuSecuenciaTrabajo.add(jTextFieldidTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);


	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.ipadx = 0;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoParamFactuSecuenciaTrabajo.add(jLabelnombreTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		//this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 2;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.ipadx = 0;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoParamFactuSecuenciaTrabajo.add(jButtonnombreTipoParamFactuSecuenciaTrabajoBusqueda, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
	}

	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 1;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.ipadx = 0;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoParamFactuSecuenciaTrabajo.add(jscrollPanenombreTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iYPanelCamposTipoParamFactuSecuenciaTrabajo;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iXPanelCamposTipoParamFactuSecuenciaTrabajo++;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoParamFactuSecuenciaTrabajo.add(this.jPanelidTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);



	if(iXPanelCamposTipoParamFactuSecuenciaTrabajo % 1==0) {
		iXPanelCamposTipoParamFactuSecuenciaTrabajo=0;
		iYPanelCamposTipoParamFactuSecuenciaTrabajo++;
	}
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iYPanelCamposTipoParamFactuSecuenciaTrabajo;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iXPanelCamposTipoParamFactuSecuenciaTrabajo++;
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoParamFactuSecuenciaTrabajo.add(this.jPanelnombreTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);



	if(iXPanelCamposTipoParamFactuSecuenciaTrabajo % 1==0) {
		iXPanelCamposTipoParamFactuSecuenciaTrabajo=0;
		iYPanelCamposTipoParamFactuSecuenciaTrabajo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoParamFactuSecuenciaTrabajo= new GridBagLayout();
		this.jPanelAccionesTipoParamFactuSecuenciaTrabajo.setLayout(gridaBagLayoutAccionesTipoParamFactuSecuenciaTrabajo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoParamFactuSecuenciaTrabajo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo.setLayout(gridaBagLayoutAccionesFormularioTipoParamFactuSecuenciaTrabajo);
		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo.add(this.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);

		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo.add(this.jCheckBoxPostAccionNuevoTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo.add(this.jCheckBoxPostAccionSinCerrarTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoparamfactusecuenciatrabajoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo.add(this.jCheckBoxPostAccionSinMensajeTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoParamFactuSecuenciaTrabajo.add(this.jButtonModificarTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);							

		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoParamFactuSecuenciaTrabajo.add(this.jButtonEliminarTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		
			
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoParamFactuSecuenciaTrabajo.add(this.jButtonActualizarTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);


		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoParamFactuSecuenciaTrabajo.add(this.jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);	
		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = 0;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoParamFactuSecuenciaTrabajo.add(this.jButtonCancelarTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoParamFactuSecuenciaTrabajo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoParamFactuSecuenciaTrabajo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();						
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;		
			//this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx =0;
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoParamFactuSecuenciaTrabajoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoParamFactuSecuenciaTrabajo = new TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Secuencia Trabajo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Secuencia Trabajo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Secuencia Trabajo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoParamFactuSecuenciaTrabajoModel tipoparamfactusecuenciatrabajoModel=new TipoParamFactuSecuenciaTrabajoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoParamFactuSecuenciaTrabajoModel.TipoParamFactuSecuenciaTrabajoFocusTraversalPolicy tipoparamfactusecuenciatrabajoFocusTraversalPolicy = tipoparamfactusecuenciatrabajoModel.new TipoParamFactuSecuenciaTrabajoFocusTraversalPolicy(this);
			
			//tipoparamfactusecuenciatrabajoFocusTraversalPolicy.settipoparamfactusecuenciatrabajoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoparamfactusecuenciatrabajoModel);
			
			
			this.jContentPaneDetalleTipoParamFactuSecuenciaTrabajo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoParamFactuSecuenciaTrabajo = new GridBagLayout();	
			this.jContentPaneDetalleTipoParamFactuSecuenciaTrabajo.setLayout(gridaBagLayoutDetalleTipoParamFactuSecuenciaTrabajo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoParamFactuSecuenciaTrabajo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
				this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoParamFactuSecuenciaTrabajo.add(jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo, gridBagConstraintsTipoParamFactuSecuenciaTrabajo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo=   new JScrollPane(jContentPaneDetalleTipoParamFactuSecuenciaTrabajo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
	        
			this.jContentPaneDetalleTipoParamFactuSecuenciaTrabajo.add(jPanelCamposTipoParamFactuSecuenciaTrabajo, gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
			
			
			
			
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
						&& tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo= new GridBagConstraints();
						this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
						this.jContentPaneDetalleTipoParamFactuSecuenciaTrabajo.add(this.jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoParamFactuSecuenciaTrabajo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoParamFactuSecuenciaTrabajo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
					this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoParamFactuSecuenciaTrabajo.add(jPanelCamposOcultosTipoParamFactuSecuenciaTrabajo, gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
				
					this.jPanelCamposOcultosTipoParamFactuSecuenciaTrabajo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
	        this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoParamFactuSecuenciaTrabajo.add(this.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);							
			
			
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
	        this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoParamFactuSecuenciaTrabajo.add(this.jPanelAccionesTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo=   new JScrollPane(this.jPanelCamposTipoParamFactuSecuenciaTrabajo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);			
			
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
			
			
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		
			
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoParamFactuSecuenciaTrabajo, this.gridBagConstraintsTipoParamFactuSecuenciaTrabajo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoParamFactuSecuenciaTrabajo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo;
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
