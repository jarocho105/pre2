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
import com.bydan.erp.nomina.util.FuncionEstrucConstantesFunciones;

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
public class FuncionEstrucDetalleFormJInternalFrame extends FuncionEstrucBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFuncionEstruc;
	
	protected JMenuBar jmenuBarDetalleFuncionEstruc;
	
	protected JMenu jmenuDetalleFuncionEstruc;
	protected JMenu jmenuDetalleArchivoFuncionEstruc;
	protected JMenu jmenuDetalleAccionesFuncionEstruc;
	protected JMenu jmenuDetalleDatosFuncionEstruc;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFuncionEstruc = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFuncionEstruc;	
	protected GridBagConstraints gridBagConstraintsFuncionEstruc;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FuncionEstrucBeanSwingJInternalFrameAdditional jInternalFrameDetalleFuncionEstruc;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected FuncionBeanSwingJInternalFrame funcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_funcion="";
	
	public FuncionEstrucSessionBean funcionestrucSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public FuncionSessionBean funcionSessionBean;	
	
	public FuncionEstrucLogic funcionestrucLogic;
	
	public JScrollPane jScrollPanelDatosFuncionEstruc;
	public JScrollPane jScrollPanelDatosEdicionFuncionEstruc;
	public JScrollPane jScrollPanelDatosGeneralFuncionEstruc;
	
	protected JPanel jPanelCamposFuncionEstruc;    
	protected JPanel jPanelCamposOcultosFuncionEstruc;    	
	protected JPanel jPanelAccionesFuncionEstruc;
	protected JPanel jPanelAccionesFormularioFuncionEstruc;
    
	
	
	protected Integer iXPanelCamposFuncionEstruc=0;
	protected Integer iYPanelCamposFuncionEstruc=0;
	
	protected Integer iXPanelCamposOcultosFuncionEstruc=0;
	protected Integer iYPanelCamposOcultosFuncionEstruc=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFuncionEstruc;
	public JButton jButtonModificarFuncionEstruc;
	public JButton jButtonActualizarFuncionEstruc;
    public JButton jButtonEliminarFuncionEstruc;
	public JButton jButtonCancelarFuncionEstruc;
    public JButton jButtonGuardarCambiosFuncionEstruc;
	public JButton jButtonGuardarCambiosTablaFuncionEstruc;
	protected JButton jButtonCerrarFuncionEstruc;
	
	
	protected JButton jButtonProcesarInformacionFuncionEstruc;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFuncionEstruc;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFuncionEstruc;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFuncionEstruc;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFuncionEstruc;
	protected JButton jButtonModificarToolBarFuncionEstruc;
	protected JButton jButtonActualizarToolBarFuncionEstruc;
    protected JButton jButtonEliminarToolBarFuncionEstruc;
	protected JButton jButtonCancelarToolBarFuncionEstruc;
    protected JButton jButtonGuardarCambiosToolBarFuncionEstruc;
	protected JButton jButtonGuardarCambiosTablaToolBarFuncionEstruc;
	protected JButton jButtonMostrarOcultarTablaToolBarFuncionEstruc;
	protected JButton jButtonCerrarToolBarFuncionEstruc;
	
	protected JButton jButtonProcesarInformacionToolBarFuncionEstruc;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFuncionEstruc;
	protected JMenuItem jMenuItemModificarFuncionEstruc;
	protected JMenuItem jMenuItemActualizarFuncionEstruc;
    protected JMenuItem jMenuItemEliminarFuncionEstruc;
	protected JMenuItem jMenuItemCancelarFuncionEstruc;
    protected JMenuItem jMenuItemGuardarCambiosFuncionEstruc;
	protected JMenuItem jMenuItemGuardarCambiosTablaFuncionEstruc;
	protected JMenuItem jMenuItemCerrarFuncionEstruc;
	protected JMenuItem jMenuItemDetalleCerrarFuncionEstruc;
	protected JMenuItem jMenuItemDetalleMostarOcultarFuncionEstruc;
	
	protected JMenuItem jMenuItemProcesarInformacionFuncionEstruc;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFuncionEstruc;
	protected JMenuItem jMenuItemMostrarOcultarFuncionEstruc;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFuncionEstruc;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFuncionEstruc;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFuncionEstruc;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFuncionEstruc;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFuncionEstruc;
	public JLabel jLabelIdFuncionEstruc;
	public JLabel jLabelidFuncionEstruc;
	public JButton jButtonidFuncionEstrucBusqueda= new JButtonMe();

	public JPanel jPanelnombreFuncionEstruc;
	public JLabel jLabelnombreFuncionEstruc;
	public JTextArea jTextAreanombreFuncionEstruc;
	public JScrollPane jscrollPanenombreFuncionEstruc;
	public JButton jButtonnombreFuncionEstrucBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionFuncionEstruc;
	public JLabel jLabeldescripcionFuncionEstruc;
	public JTextArea jTextAreadescripcionFuncionEstruc;
	public JScrollPane jscrollPanedescripcionFuncionEstruc;
	public JButton jButtondescripcionFuncionEstrucBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFuncionEstruc;
	public JLabel jLabelid_empresaFuncionEstruc;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFuncionEstruc;
	public JButton jButtonid_empresaFuncionEstruc= new JButtonMe();
	public JButton jButtonid_empresaFuncionEstrucUpdate= new JButtonMe();
	public JButton jButtonid_empresaFuncionEstrucBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalFuncionEstruc;
	public JLabel jLabelid_sucursalFuncionEstruc;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFuncionEstruc;
	public JButton jButtonid_sucursalFuncionEstruc= new JButtonMe();
	public JButton jButtonid_sucursalFuncionEstrucUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFuncionEstrucBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraFuncionEstruc;
	public JLabel jLabelid_estructuraFuncionEstruc;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFuncionEstruc;
	public JButton jButtonid_estructuraFuncionEstruc= new JButtonMe();
	public JButton jButtonid_estructuraFuncionEstrucUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFuncionEstrucBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFuncionEstrucArbol= new JButtonMe();

	public JPanel jPanelid_funcionFuncionEstruc;
	public JLabel jLabelid_funcionFuncionEstruc;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_funcionFuncionEstruc;
	public JButton jButtonid_funcionFuncionEstruc= new JButtonMe();
	public JButton jButtonid_funcionFuncionEstrucUpdate= new JButtonMe();
	public JButton jButtonid_funcionFuncionEstrucBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFuncionEstruc;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FuncionEstrucDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFuncionEstruc=new JPanel();
				this.jPanelAccionesFormularioFuncionEstruc=new JPanel();
				this.jmenuBarDetalleFuncionEstruc=new JMenuBar();
				this.jTtoolBarDetalleFuncionEstruc=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FuncionEstrucDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FuncionEstruc No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FuncionEstrucDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FuncionEstruc No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FuncionEstrucDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FuncionEstruc No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FuncionEstrucDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FuncionEstruc No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FuncionEstrucDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FuncionEstruc No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFuncionEstruc() {
		return this.jButtonActualizarToolBarFuncionEstruc;
	}
	
	public JButton getjButtonEliminarToolBarFuncionEstruc() {
		return this.jButtonEliminarToolBarFuncionEstruc;
	}
	
	public JButton getjButtonCancelarToolBarFuncionEstruc() {
		return this.jButtonCancelarToolBarFuncionEstruc;
	}		
	
	public JButton getjButtonProcesarInformacionFuncionEstruc() {
		return this.jButtonProcesarInformacionFuncionEstruc;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFuncionEstruc)	{
		this.jButtonProcesarInformacionFuncionEstruc = jButtonProcesarInformacionFuncionEstruc;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFuncionEstruc() {
		return this.jComboBoxTiposAccionesFuncionEstruc;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFuncionEstruc(
			JComboBox jComboBoxTiposRelacionesFuncionEstruc) {
		this.jComboBoxTiposRelacionesFuncionEstruc = jComboBoxTiposRelacionesFuncionEstruc;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFuncionEstruc(
			JComboBox jComboBoxTiposAccionesFuncionEstruc) {
		this.jComboBoxTiposAccionesFuncionEstruc = jComboBoxTiposAccionesFuncionEstruc;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFuncionEstruc() {
		return this.jComboBoxTiposAccionesFormularioFuncionEstruc;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFuncionEstruc(
			JComboBox jComboBoxTiposAccionesFormularioFuncionEstruc) {
		this.jComboBoxTiposAccionesFormularioFuncionEstruc = jComboBoxTiposAccionesFormularioFuncionEstruc;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.funcionestrucSessionBean=new FuncionEstrucSessionBean();
		
		this.funcionestrucSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.funcionestrucSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.funcionestrucSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FuncionEstrucJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FuncionEstrucJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FuncionEstrucJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Funcion Estruc MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
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
	
		FuncionEstrucJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFuncionEstruc= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFuncionEstruc=new JButtonMe();
				this.jButtonModificarToolBarFuncionEstruc=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFuncionEstruc,this.jTtoolBarDetalleFuncionEstruc,
							"actualizar","actualizar","Actualizar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFuncionEstruc,this.jTtoolBarDetalleFuncionEstruc,
							"eliminar","eliminar","Eliminar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFuncionEstruc,this.jTtoolBarDetalleFuncionEstruc,
							"cancelar","cancelar","Cancelar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFuncionEstruc,this.jTtoolBarDetalleFuncionEstruc,
							"guardarcambios","guardarcambios","Guardar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFuncionEstruc=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFuncionEstruc=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFuncionEstruc=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFuncionEstruc=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFuncionEstruc=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFuncionEstruc= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFuncionEstruc.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFuncionEstruc,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFuncionEstruc= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFuncionEstruc.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFuncionEstruc,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFuncionEstruc= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFuncionEstruc.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFuncionEstruc,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFuncionEstruc= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFuncionEstruc.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFuncionEstruc,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFuncionEstruc= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFuncionEstruc.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFuncionEstruc,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFuncionEstruc= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFuncionEstruc.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFuncionEstruc,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFuncionEstruc= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFuncionEstruc.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFuncionEstruc,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFuncionEstruc= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFuncionEstruc.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFuncionEstruc,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFuncionEstruc= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFuncionEstruc.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFuncionEstruc,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFuncionEstruc= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFuncionEstruc.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFuncionEstruc,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFuncionEstruc.add(this.jMenuItemDetalleCerrarFuncionEstruc);
		
		this.jmenuDetalleAccionesFuncionEstruc.add(this.jMenuItemActualizarFuncionEstruc);
		this.jmenuDetalleAccionesFuncionEstruc.add(this.jMenuItemEliminarFuncionEstruc);
		this.jmenuDetalleAccionesFuncionEstruc.add(this.jMenuItemCancelarFuncionEstruc);		
		
		//this.jmenuDetalleDatosFuncionEstruc.add(this.jMenuItemDetalleAbrirOrderByFuncionEstruc);				
		this.jmenuDetalleDatosFuncionEstruc.add(this.jMenuItemDetalleMostarOcultarFuncionEstruc);				
				
		//this.jmenuDetalleAccionesFuncionEstruc.add(this.jMenuItemGuardarCambiosFuncionEstruc);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFuncionEstruc.add(this.jmenuDetalleArchivoFuncionEstruc);		
		this.jmenuBarDetalleFuncionEstruc.add(this.jmenuDetalleAccionesFuncionEstruc);		
		this.jmenuBarDetalleFuncionEstruc.add(this.jmenuDetalleDatosFuncionEstruc);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFuncionEstruc);				
	}
	
	
	public void inicializarElementosCamposFuncionEstruc() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFuncionEstruc = new JLabelMe();
		jLabelIdFuncionEstruc.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFuncionEstruc = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFuncionEstruc.setToolTipText(FuncionEstrucConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFuncionEstruc= new GridBagLayout();

		this.jPanelidFuncionEstruc.setLayout(this.gridaBagLayoutFuncionEstruc);

		jLabelidFuncionEstruc = new JLabel();
		jLabelidFuncionEstruc.setText("Id");

		jLabelidFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreFuncionEstruc = new JLabelMe();
		this.jLabelnombreFuncionEstruc.setText(""+FuncionEstrucConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreFuncionEstruc.setToolTipText("Nombre");
		this.jLabelnombreFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreFuncionEstruc=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreFuncionEstruc.setToolTipText(FuncionEstrucConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutFuncionEstruc = new GridBagLayout();
		this.jPanelnombreFuncionEstruc.setLayout(this.gridaBagLayoutFuncionEstruc);


		jTextAreanombreFuncionEstruc= new JTextAreaMe();
		jTextAreanombreFuncionEstruc.setEnabled(false);
		jTextAreanombreFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFuncionEstruc.setLineWrap(true);
		jTextAreanombreFuncionEstruc.setWrapStyleWord(true);
		jTextAreanombreFuncionEstruc.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreFuncionEstruc.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreFuncionEstruc = new JScrollPane(jTextAreanombreFuncionEstruc);
		jscrollPanenombreFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreFuncionEstrucBusqueda= new JButtonMe();
		this.jButtonnombreFuncionEstrucBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreFuncionEstrucBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreFuncionEstrucBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreFuncionEstrucBusqueda.setText("U");
		this.jButtonnombreFuncionEstrucBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreFuncionEstrucBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreFuncionEstrucBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreFuncionEstrucBusqueda"));

		if(this.funcionestrucSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreFuncionEstrucBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionFuncionEstruc = new JLabelMe();
		this.jLabeldescripcionFuncionEstruc.setText(""+FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionFuncionEstruc.setToolTipText("Descripcion");
		this.jLabeldescripcionFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionFuncionEstruc=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionFuncionEstruc.setToolTipText(FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutFuncionEstruc = new GridBagLayout();
		this.jPaneldescripcionFuncionEstruc.setLayout(this.gridaBagLayoutFuncionEstruc);


		jTextAreadescripcionFuncionEstruc= new JTextAreaMe();
		jTextAreadescripcionFuncionEstruc.setEnabled(false);
		jTextAreadescripcionFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFuncionEstruc.setLineWrap(true);
		jTextAreadescripcionFuncionEstruc.setWrapStyleWord(true);
		jTextAreadescripcionFuncionEstruc.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionFuncionEstruc.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionFuncionEstruc = new JScrollPane(jTextAreadescripcionFuncionEstruc);
		jscrollPanedescripcionFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionFuncionEstrucBusqueda= new JButtonMe();
		this.jButtondescripcionFuncionEstrucBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionFuncionEstrucBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionFuncionEstrucBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionFuncionEstrucBusqueda.setText("U");
		this.jButtondescripcionFuncionEstrucBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionFuncionEstrucBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionFuncionEstrucBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionFuncionEstrucBusqueda"));

		if(this.funcionestrucSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionFuncionEstrucBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFuncionEstruc() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFuncionEstruc = new JLabelMe();
		this.jLabelid_empresaFuncionEstruc.setText(""+FuncionEstrucConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFuncionEstruc.setToolTipText("Empresa");
		this.jLabelid_empresaFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFuncionEstruc=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFuncionEstruc.setToolTipText(FuncionEstrucConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFuncionEstruc = new GridBagLayout();
		this.jPanelid_empresaFuncionEstruc.setLayout(this.gridaBagLayoutFuncionEstruc);


		jComboBoxid_empresaFuncionEstruc= new JComboBoxMe();
		jComboBoxid_empresaFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFuncionEstruc.setEnabled(false);

		this.jButtonid_empresaFuncionEstruc= new JButtonMe();
		this.jButtonid_empresaFuncionEstruc.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFuncionEstruc.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFuncionEstruc.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFuncionEstruc.setText("Buscar");
		this.jButtonid_empresaFuncionEstruc.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFuncionEstruc.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFuncionEstruc,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFuncionEstruc"));

		this.jButtonid_empresaFuncionEstrucBusqueda= new JButtonMe();
		this.jButtonid_empresaFuncionEstrucBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFuncionEstrucBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFuncionEstrucBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFuncionEstrucBusqueda.setText("U");
		this.jButtonid_empresaFuncionEstrucBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFuncionEstrucBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFuncionEstrucBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFuncionEstrucBusqueda"));

		if(this.funcionestrucSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFuncionEstrucBusqueda.setVisible(false);		}

		this.jButtonid_empresaFuncionEstrucUpdate= new JButtonMe();
		this.jButtonid_empresaFuncionEstrucUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFuncionEstrucUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFuncionEstrucUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFuncionEstrucUpdate.setText("U");
		this.jButtonid_empresaFuncionEstrucUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFuncionEstrucUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFuncionEstrucUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFuncionEstrucUpdate"));



					
		this.jLabelid_sucursalFuncionEstruc = new JLabelMe();
		this.jLabelid_sucursalFuncionEstruc.setText(""+FuncionEstrucConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalFuncionEstruc.setToolTipText("Sucursal");
		this.jLabelid_sucursalFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalFuncionEstruc=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalFuncionEstruc.setToolTipText(FuncionEstrucConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutFuncionEstruc = new GridBagLayout();
		this.jPanelid_sucursalFuncionEstruc.setLayout(this.gridaBagLayoutFuncionEstruc);


		jComboBoxid_sucursalFuncionEstruc= new JComboBoxMe();
		jComboBoxid_sucursalFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalFuncionEstruc.setEnabled(false);

		this.jButtonid_sucursalFuncionEstruc= new JButtonMe();
		this.jButtonid_sucursalFuncionEstruc.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFuncionEstruc.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFuncionEstruc.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFuncionEstruc.setText("Buscar");
		this.jButtonid_sucursalFuncionEstruc.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalFuncionEstruc.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFuncionEstruc,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFuncionEstruc"));

		this.jButtonid_sucursalFuncionEstrucBusqueda= new JButtonMe();
		this.jButtonid_sucursalFuncionEstrucBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFuncionEstrucBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFuncionEstrucBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFuncionEstrucBusqueda.setText("U");
		this.jButtonid_sucursalFuncionEstrucBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalFuncionEstrucBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFuncionEstrucBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFuncionEstrucBusqueda"));

		if(this.funcionestrucSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalFuncionEstrucBusqueda.setVisible(false);		}

		this.jButtonid_sucursalFuncionEstrucUpdate= new JButtonMe();
		this.jButtonid_sucursalFuncionEstrucUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFuncionEstrucUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFuncionEstrucUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFuncionEstrucUpdate.setText("U");
		this.jButtonid_sucursalFuncionEstrucUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalFuncionEstrucUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFuncionEstrucUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFuncionEstrucUpdate"));



					
		this.jLabelid_estructuraFuncionEstruc = new JLabelMe();
		this.jLabelid_estructuraFuncionEstruc.setText(""+FuncionEstrucConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraFuncionEstruc.setToolTipText("Estructura");
		this.jLabelid_estructuraFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraFuncionEstruc=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraFuncionEstruc.setToolTipText(FuncionEstrucConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutFuncionEstruc = new GridBagLayout();
		this.jPanelid_estructuraFuncionEstruc.setLayout(this.gridaBagLayoutFuncionEstruc);


		jComboBoxid_estructuraFuncionEstruc= new JComboBoxMe();
		jComboBoxid_estructuraFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraFuncionEstruc= new JButtonMe();
		this.jButtonid_estructuraFuncionEstruc.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraFuncionEstruc.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraFuncionEstruc.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraFuncionEstruc.setText("Buscar");
		this.jButtonid_estructuraFuncionEstruc.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraFuncionEstruc.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraFuncionEstruc,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraFuncionEstruc"));

		this.jButtonid_estructuraFuncionEstrucBusqueda= new JButtonMe();
		this.jButtonid_estructuraFuncionEstrucBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraFuncionEstrucBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraFuncionEstrucBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraFuncionEstrucBusqueda.setText("U");
		this.jButtonid_estructuraFuncionEstrucBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraFuncionEstrucBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraFuncionEstrucBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraFuncionEstrucBusqueda"));

		if(this.funcionestrucSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraFuncionEstrucBusqueda.setVisible(false);		}

		this.jButtonid_estructuraFuncionEstrucUpdate= new JButtonMe();
		this.jButtonid_estructuraFuncionEstrucUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraFuncionEstrucUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraFuncionEstrucUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraFuncionEstrucUpdate.setText("U");
		this.jButtonid_estructuraFuncionEstrucUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraFuncionEstrucUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraFuncionEstrucUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraFuncionEstrucUpdate"));


		jButtonid_estructuraFuncionEstrucArbol= new JButtonMe();
		jButtonid_estructuraFuncionEstrucArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraFuncionEstrucArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraFuncionEstrucArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraFuncionEstrucArbol.setText("Arbol");
		jButtonid_estructuraFuncionEstrucArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraFuncionEstrucArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraFuncionEstrucArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraFuncionEstrucArbol"));



					
		this.jLabelid_funcionFuncionEstruc = new JLabelMe();
		this.jLabelid_funcionFuncionEstruc.setText(""+FuncionEstrucConstantesFunciones.LABEL_IDFUNCION+" : *");
		this.jLabelid_funcionFuncionEstruc.setToolTipText("Funcion");
		this.jLabelid_funcionFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_funcionFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_funcionFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_funcionFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_funcionFuncionEstruc=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_funcionFuncionEstruc.setToolTipText(FuncionEstrucConstantesFunciones.LABEL_IDFUNCION);
		this.gridaBagLayoutFuncionEstruc = new GridBagLayout();
		this.jPanelid_funcionFuncionEstruc.setLayout(this.gridaBagLayoutFuncionEstruc);


		jComboBoxid_funcionFuncionEstruc= new JComboBoxMe();
		jComboBoxid_funcionFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_funcionFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_funcionFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_funcionFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_funcionFuncionEstruc= new JButtonMe();
		this.jButtonid_funcionFuncionEstruc.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_funcionFuncionEstruc.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_funcionFuncionEstruc.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_funcionFuncionEstruc.setText("Buscar");
		this.jButtonid_funcionFuncionEstruc.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_funcionFuncionEstruc.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_funcionFuncionEstruc,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_funcionFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_funcionFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_funcionFuncionEstruc"));

		this.jButtonid_funcionFuncionEstrucBusqueda= new JButtonMe();
		this.jButtonid_funcionFuncionEstrucBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_funcionFuncionEstrucBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_funcionFuncionEstrucBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_funcionFuncionEstrucBusqueda.setText("U");
		this.jButtonid_funcionFuncionEstrucBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_funcionFuncionEstrucBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_funcionFuncionEstrucBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_funcionFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_funcionFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_funcionFuncionEstrucBusqueda"));

		if(this.funcionestrucSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_funcionFuncionEstrucBusqueda.setVisible(false);		}

		this.jButtonid_funcionFuncionEstrucUpdate= new JButtonMe();
		this.jButtonid_funcionFuncionEstrucUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_funcionFuncionEstrucUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_funcionFuncionEstrucUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_funcionFuncionEstrucUpdate.setText("U");
		this.jButtonid_funcionFuncionEstrucUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_funcionFuncionEstrucUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_funcionFuncionEstrucUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_funcionFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_funcionFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_funcionFuncionEstrucUpdate"));



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
		//this.jInternalFrameDetalleFuncionEstruc = new FuncionEstrucBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Funcion Estruc DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFuncionEstruc= new GridBagLayout();
		

		
		String sToolTipFuncionEstruc="";
		sToolTipFuncionEstruc=FuncionEstrucConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFuncionEstruc+="(Nomina.FuncionEstruc)";
		}
		
		if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
			sToolTipFuncionEstruc+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFuncionEstruc = new JButtonMe();
		this.jButtonModificarFuncionEstruc = new JButtonMe();
        this.jButtonActualizarFuncionEstruc = new JButtonMe();
        this.jButtonEliminarFuncionEstruc = new JButtonMe();
        this.jButtonCancelarFuncionEstruc = new JButtonMe();
        this.jButtonGuardarCambiosFuncionEstruc = new JButtonMe();
		this.jButtonGuardarCambiosTablaFuncionEstruc = new JButtonMe();
		this.jButtonCerrarFuncionEstruc = new JButtonMe();
		
		this.jScrollPanelDatosFuncionEstruc = new JScrollPane();   
        this.jScrollPanelDatosEdicionFuncionEstruc = new JScrollPane();
		this.jScrollPanelDatosGeneralFuncionEstruc = new JScrollPane();
				
		
		
		this.jPanelCamposFuncionEstruc = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFuncionEstruc = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFuncionEstruc = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFuncionEstruc = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Funcion Estruc";
		
		if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Funcion Estruces" + this.sPath));
		} else {
			this.jScrollPanelDatosFuncionEstruc.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFuncionEstruc.setName("jPanelCamposFuncionEstruc"); 

		this.jPanelCamposOcultosFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFuncionEstruc.setName("jPanelCamposOcultosFuncionEstruc"); 

        this.jPanelAccionesFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFuncionEstruc.setToolTipText("Acciones");
        this.jPanelAccionesFuncionEstruc.setName("Acciones"); 

		this.jPanelAccionesFormularioFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFuncionEstruc.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFuncionEstruc.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFuncionEstruc.setText("Nuevo");
		this.jButtonModificarFuncionEstruc.setText("Editar");
        this.jButtonActualizarFuncionEstruc.setText("Actualizar");
        this.jButtonEliminarFuncionEstruc.setText("Eliminar");
        this.jButtonCancelarFuncionEstruc.setText("Cancelar");
        this.jButtonGuardarCambiosFuncionEstruc.setText("Guardar");
		this.jButtonGuardarCambiosTablaFuncionEstruc.setText("Guardar");
		this.jButtonCerrarFuncionEstruc.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFuncionEstruc,"nuevo_button","Nuevo",this.funcionestrucSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFuncionEstruc,"modificar_button","Editar",this.funcionestrucSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFuncionEstruc,"actualizar_button","Actualizar",this.funcionestrucSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFuncionEstruc,"eliminar_button","Eliminar",this.funcionestrucSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFuncionEstruc,"cancelar_button","Cancelar",this.funcionestrucSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFuncionEstruc,"guardarcambios_button","Guardar",this.funcionestrucSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFuncionEstruc,"guardarcambiostabla_button","Guardar",this.funcionestrucSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFuncionEstruc,"cerrar_button","Salir",this.funcionestrucSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFuncionEstruc.setToolTipText("Nuevo"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFuncionEstruc.setToolTipText("Editar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFuncionEstruc.setToolTipText("Actualizar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFuncionEstruc.setToolTipText("Eliminar)"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFuncionEstruc.setToolTipText("Cancelar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFuncionEstruc.setToolTipText("Guardar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFuncionEstruc.setToolTipText("Guardar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFuncionEstruc.setToolTipText("Salir"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFuncionEstruc";
		inputMap = this.jButtonNuevoFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFuncionEstruc.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFuncionEstruc"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFuncionEstruc";
		inputMap = this.jButtonActualizarFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFuncionEstruc.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFuncionEstruc"));
		
		//ELIMINAR
		sMapKey = "EliminarFuncionEstruc";
		inputMap = this.jButtonEliminarFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFuncionEstruc.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFuncionEstruc"));
		
		//CANCELAR	
		sMapKey = "CancelarFuncionEstruc";
		inputMap = this.jButtonCancelarFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFuncionEstruc.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFuncionEstruc"));
		
		//CERRAR		
		sMapKey = "CerrarFuncionEstruc";
		inputMap = this.jButtonCerrarFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFuncionEstruc.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFuncionEstruc"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFuncionEstruc";
		inputMap = this.jButtonGuardarCambiosTablaFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFuncionEstruc.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFuncionEstruc"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFuncionEstruc = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFuncionEstruc.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFuncionEstruc.setToolTipText("Nuevo FuncionEstruc");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFuncionEstruc = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFuncionEstruc.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFuncionEstruc.setToolTipText("Sin Cerrar Ventana FuncionEstruc");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFuncionEstruc = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFuncionEstruc.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFuncionEstruc.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFuncionEstruc = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFuncionEstruc.setText("Accion");
		this.jComboBoxTiposAccionesFuncionEstruc.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFuncionEstruc = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFuncionEstruc.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFuncionEstruc.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFuncionEstruc = new JLabelMe();
		
		this.jLabelAccionesFuncionEstruc.setText("Acciones");		
		this.jLabelAccionesFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFuncionEstruc();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFuncionEstruc();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFuncionEstruc=new JTabbedPane();
		this.jTabbedPaneRelacionesFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFuncionEstruc,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFuncionEstruc.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFuncionEstruc.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFuncionEstruc.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFuncionEstruc.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFuncionEstruc.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFuncionEstruc.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFuncionEstruc = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFuncionEstruc = new GridBagLayout();
		
		this.jPanelCamposFuncionEstruc.setLayout(gridaBagLayoutCamposFuncionEstruc);
		this.jPanelCamposOcultosFuncionEstruc.setLayout(gridaBagLayoutCamposOcultosFuncionEstruc);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncionEstruc.gridy = 0;
	this.gridBagConstraintsFuncionEstruc.gridx = 0;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFuncionEstruc.add(jLabelIdFuncionEstruc, this.gridBagConstraintsFuncionEstruc);



	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncionEstruc.gridy = 0;
	this.gridBagConstraintsFuncionEstruc.gridx = 1;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFuncionEstruc.add(jLabelidFuncionEstruc, this.gridBagConstraintsFuncionEstruc);


	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncionEstruc.gridy = 0;
	this.gridBagConstraintsFuncionEstruc.gridx = 0;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFuncionEstruc.add(jLabelid_empresaFuncionEstruc, this.gridBagConstraintsFuncionEstruc);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		//this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncionEstruc.gridy = 0;
		this.gridBagConstraintsFuncionEstruc.gridx = 2;
		this.gridBagConstraintsFuncionEstruc.ipadx = 0;
		this.gridBagConstraintsFuncionEstruc.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFuncionEstruc.add(jButtonid_empresaFuncionEstrucBusqueda, this.gridBagConstraintsFuncionEstruc);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		//this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncionEstruc.gridy = 0;
		this.gridBagConstraintsFuncionEstruc.gridx = 3;
		this.gridBagConstraintsFuncionEstruc.ipadx = 0;
		this.gridBagConstraintsFuncionEstruc.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFuncionEstruc.add(jButtonid_empresaFuncionEstrucUpdate, this.gridBagConstraintsFuncionEstruc);
	}

	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncionEstruc.gridy = 0;
	this.gridBagConstraintsFuncionEstruc.gridx = 1;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFuncionEstruc.add(jComboBoxid_empresaFuncionEstruc, this.gridBagConstraintsFuncionEstruc);


	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncionEstruc.gridy = 0;
	this.gridBagConstraintsFuncionEstruc.gridx = 0;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalFuncionEstruc.add(jLabelid_sucursalFuncionEstruc, this.gridBagConstraintsFuncionEstruc);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		//this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncionEstruc.gridy = 0;
		this.gridBagConstraintsFuncionEstruc.gridx = 2;
		this.gridBagConstraintsFuncionEstruc.ipadx = 0;
		this.gridBagConstraintsFuncionEstruc.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFuncionEstruc.add(jButtonid_sucursalFuncionEstrucBusqueda, this.gridBagConstraintsFuncionEstruc);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		//this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncionEstruc.gridy = 0;
		this.gridBagConstraintsFuncionEstruc.gridx = 3;
		this.gridBagConstraintsFuncionEstruc.ipadx = 0;
		this.gridBagConstraintsFuncionEstruc.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFuncionEstruc.add(jButtonid_sucursalFuncionEstrucUpdate, this.gridBagConstraintsFuncionEstruc);
	}

	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncionEstruc.gridy = 0;
	this.gridBagConstraintsFuncionEstruc.gridx = 1;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalFuncionEstruc.add(jComboBoxid_sucursalFuncionEstruc, this.gridBagConstraintsFuncionEstruc);


	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncionEstruc.gridy = 0;
	this.gridBagConstraintsFuncionEstruc.gridx = 0;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraFuncionEstruc.add(jLabelid_estructuraFuncionEstruc, this.gridBagConstraintsFuncionEstruc);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		//this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncionEstruc.gridy = 0;
		this.gridBagConstraintsFuncionEstruc.gridx = 2;
		this.gridBagConstraintsFuncionEstruc.ipadx = 0;
		this.gridBagConstraintsFuncionEstruc.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraFuncionEstruc.add(jButtonid_estructuraFuncionEstrucBusqueda, this.gridBagConstraintsFuncionEstruc);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		//this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncionEstruc.gridy = 0;
		this.gridBagConstraintsFuncionEstruc.gridx = 3;
		this.gridBagConstraintsFuncionEstruc.ipadx = 0;
		this.gridBagConstraintsFuncionEstruc.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraFuncionEstruc.add(jButtonid_estructuraFuncionEstrucUpdate, this.gridBagConstraintsFuncionEstruc);
	}

	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncionEstruc.gridy = 0;
	this.gridBagConstraintsFuncionEstruc.gridx = 1;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraFuncionEstruc.add(jComboBoxid_estructuraFuncionEstruc, this.gridBagConstraintsFuncionEstruc);


	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncionEstruc.gridy = 0;
	this.gridBagConstraintsFuncionEstruc.gridx = 0;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_funcionFuncionEstruc.add(jLabelid_funcionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		//this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncionEstruc.gridy = 0;
		this.gridBagConstraintsFuncionEstruc.gridx = 2;
		this.gridBagConstraintsFuncionEstruc.ipadx = 0;
		this.gridBagConstraintsFuncionEstruc.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_funcionFuncionEstruc.add(jButtonid_funcionFuncionEstrucBusqueda, this.gridBagConstraintsFuncionEstruc);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		//this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncionEstruc.gridy = 0;
		this.gridBagConstraintsFuncionEstruc.gridx = 3;
		this.gridBagConstraintsFuncionEstruc.ipadx = 0;
		this.gridBagConstraintsFuncionEstruc.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_funcionFuncionEstruc.add(jButtonid_funcionFuncionEstrucUpdate, this.gridBagConstraintsFuncionEstruc);
	}

	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncionEstruc.gridy = 0;
	this.gridBagConstraintsFuncionEstruc.gridx = 1;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_funcionFuncionEstruc.add(jComboBoxid_funcionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);


	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncionEstruc.gridy = 0;
	this.gridBagConstraintsFuncionEstruc.gridx = 0;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreFuncionEstruc.add(jLabelnombreFuncionEstruc, this.gridBagConstraintsFuncionEstruc);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		//this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncionEstruc.gridy = 0;
		this.gridBagConstraintsFuncionEstruc.gridx = 2;
		this.gridBagConstraintsFuncionEstruc.ipadx = 0;
		this.gridBagConstraintsFuncionEstruc.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreFuncionEstruc.add(jButtonnombreFuncionEstrucBusqueda, this.gridBagConstraintsFuncionEstruc);
	}

	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncionEstruc.gridy = 0;
	this.gridBagConstraintsFuncionEstruc.gridx = 1;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreFuncionEstruc.add(jscrollPanenombreFuncionEstruc, this.gridBagConstraintsFuncionEstruc);


	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncionEstruc.gridy = 0;
	this.gridBagConstraintsFuncionEstruc.gridx = 0;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionFuncionEstruc.add(jLabeldescripcionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		//this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncionEstruc.gridy = 0;
		this.gridBagConstraintsFuncionEstruc.gridx = 2;
		this.gridBagConstraintsFuncionEstruc.ipadx = 0;
		this.gridBagConstraintsFuncionEstruc.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionFuncionEstruc.add(jButtondescripcionFuncionEstrucBusqueda, this.gridBagConstraintsFuncionEstruc);
	}

	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncionEstruc.gridy = 0;
	this.gridBagConstraintsFuncionEstruc.gridx = 1;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionFuncionEstruc.add(jscrollPanedescripcionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFuncionEstruc.gridy = iYPanelCamposFuncionEstruc;
	this.gridBagConstraintsFuncionEstruc.gridx = iXPanelCamposFuncionEstruc++;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFuncionEstruc.add(this.jPanelidFuncionEstruc, this.gridBagConstraintsFuncionEstruc);



	if(iXPanelCamposFuncionEstruc % 1==0) {
		iXPanelCamposFuncionEstruc=0;
		iYPanelCamposFuncionEstruc++;
	}
	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFuncionEstruc.gridy = iYPanelCamposFuncionEstruc;
	this.gridBagConstraintsFuncionEstruc.gridx = iXPanelCamposFuncionEstruc++;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFuncionEstruc.add(this.jPanelid_estructuraFuncionEstruc, this.gridBagConstraintsFuncionEstruc);



	if(iXPanelCamposFuncionEstruc % 1==0) {
		iXPanelCamposFuncionEstruc=0;
		iYPanelCamposFuncionEstruc++;
	}
	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFuncionEstruc.gridy = iYPanelCamposFuncionEstruc;
	this.gridBagConstraintsFuncionEstruc.gridx = iXPanelCamposFuncionEstruc++;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFuncionEstruc.add(this.jPanelid_funcionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);



	if(iXPanelCamposFuncionEstruc % 1==0) {
		iXPanelCamposFuncionEstruc=0;
		iYPanelCamposFuncionEstruc++;
	}
	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFuncionEstruc.gridy = iYPanelCamposFuncionEstruc;
	this.gridBagConstraintsFuncionEstruc.gridx = iXPanelCamposFuncionEstruc++;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFuncionEstruc.add(this.jPanelnombreFuncionEstruc, this.gridBagConstraintsFuncionEstruc);



	if(iXPanelCamposFuncionEstruc % 1==0) {
		iXPanelCamposFuncionEstruc=0;
		iYPanelCamposFuncionEstruc++;
	}
	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFuncionEstruc.gridy = iYPanelCamposFuncionEstruc;
	this.gridBagConstraintsFuncionEstruc.gridx = iXPanelCamposFuncionEstruc++;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFuncionEstruc.add(this.jPaneldescripcionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);



	if(iXPanelCamposFuncionEstruc % 1==0) {
		iXPanelCamposFuncionEstruc=0;
		iYPanelCamposFuncionEstruc++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFuncionEstruc.gridy = iYPanelCamposOcultosFuncionEstruc;
	this.gridBagConstraintsFuncionEstruc.gridx = iXPanelCamposOcultosFuncionEstruc++;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFuncionEstruc.add(this.jPanelid_empresaFuncionEstruc, this.gridBagConstraintsFuncionEstruc);



	if(iXPanelCamposOcultosFuncionEstruc % 1==0) {
		iXPanelCamposOcultosFuncionEstruc=0;
		iYPanelCamposOcultosFuncionEstruc++;
	}
	this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFuncionEstruc.gridy = iYPanelCamposOcultosFuncionEstruc;
	this.gridBagConstraintsFuncionEstruc.gridx = iXPanelCamposOcultosFuncionEstruc++;
	this.gridBagConstraintsFuncionEstruc.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFuncionEstruc.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFuncionEstruc.add(this.jPanelid_sucursalFuncionEstruc, this.gridBagConstraintsFuncionEstruc);



	if(iXPanelCamposOcultosFuncionEstruc % 1==0) {
		iXPanelCamposOcultosFuncionEstruc=0;
		iYPanelCamposOcultosFuncionEstruc++;
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
			
		GridBagLayout gridaBagLayoutAccionesFuncionEstruc= new GridBagLayout();
		this.jPanelAccionesFuncionEstruc.setLayout(gridaBagLayoutAccionesFuncionEstruc);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFuncionEstruc= new GridBagLayout();
		this.jPanelAccionesFormularioFuncionEstruc.setLayout(gridaBagLayoutAccionesFormularioFuncionEstruc);
		
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFuncionEstruc.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFuncionEstruc.add(this.jComboBoxTiposAccionesFormularioFuncionEstruc, this.gridBagConstraintsFuncionEstruc);

		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFuncionEstruc.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFuncionEstruc.add(this.jCheckBoxPostAccionNuevoFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.funcionestrucSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFuncionEstruc.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFuncionEstruc.add(this.jCheckBoxPostAccionSinCerrarFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.funcionestrucSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFuncionEstruc.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFuncionEstruc.add(this.jCheckBoxPostAccionSinMensajeFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncionEstruc.gridy = 0;
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXAccion++;
			
		this.jPanelAccionesFuncionEstruc.add(this.jButtonModificarFuncionEstruc, this.gridBagConstraintsFuncionEstruc);							

		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncionEstruc.gridy = 0;
		this.gridBagConstraintsFuncionEstruc.gridx =iPosXAccion++;
			
		this.jPanelAccionesFuncionEstruc.add(this.jButtonEliminarFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		
			
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy = 0;		
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXAccion++;
		
		this.jPanelAccionesFuncionEstruc.add(this.jButtonActualizarFuncionEstruc, this.gridBagConstraintsFuncionEstruc);


		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy = 0;		
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXAccion++;
		
		this.jPanelAccionesFuncionEstruc.add(this.jButtonGuardarCambiosFuncionEstruc, this.gridBagConstraintsFuncionEstruc);	
		
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy = 0;		
		this.gridBagConstraintsFuncionEstruc.gridx =iPosXAccion++;
		
		this.jPanelAccionesFuncionEstruc.add(this.jButtonCancelarFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFuncionEstruc = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFuncionEstruc);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.funcionestrucSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();						
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFuncionEstruc.gridx = 0;		
			//this.gridBagConstraintsFuncionEstruc.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFuncionEstruc.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFuncionEstruc.gridx =0;
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFuncionEstruc.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FuncionEstrucJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFuncionEstruc = new FuncionEstrucBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Funcion Estruc DATOS");
			
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
			
	        //this.setTitle("[FOR] - Funcion Estruc DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Funcion Estruc Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FuncionEstrucModel funcionestrucModel=new FuncionEstrucModel(this);
			
			//SI USARA CLASE INTERNA
			//FuncionEstrucModel.FuncionEstrucFocusTraversalPolicy funcionestrucFocusTraversalPolicy = funcionestrucModel.new FuncionEstrucFocusTraversalPolicy(this);
			
			//funcionestrucFocusTraversalPolicy.setfuncionestrucJInternalFrame(this);
			
			this.setFocusTraversalPolicy(funcionestrucModel);
			
			
			this.jContentPaneDetalleFuncionEstruc = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFuncionEstruc = new GridBagLayout();	
			this.jContentPaneDetalleFuncionEstruc.setLayout(gridaBagLayoutDetalleFuncionEstruc);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFuncionEstruc = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
				this.gridBagConstraintsFuncionEstruc.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFuncionEstruc.gridx = 0;
					
				
				this.jContentPaneDetalleFuncionEstruc.add(jTtoolBarDetalleFuncionEstruc, gridBagConstraintsFuncionEstruc);								
				
}
			
			this.jScrollPanelDatosEdicionFuncionEstruc=   new JScrollPane(jContentPaneDetalleFuncionEstruc,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFuncionEstruc.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFuncionEstruc.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFuncionEstruc.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFuncionEstruc=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFuncionEstruc.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFuncionEstruc.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFuncionEstruc.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFuncionEstruc.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFuncionEstruc.gridx = 0;
	        
			this.jContentPaneDetalleFuncionEstruc.add(jPanelCamposFuncionEstruc, gridBagConstraintsFuncionEstruc);
			
			
			
			
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
						&& funcionestrucSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.funcionestrucSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFuncionEstruc= new GridBagConstraints();
						this.gridBagConstraintsFuncionEstruc.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFuncionEstruc.gridx = 0;
						this.jContentPaneDetalleFuncionEstruc.add(this.jTabbedPaneRelacionesFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFuncionEstruc.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFuncionEstruc.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
					this.gridBagConstraintsFuncionEstruc.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFuncionEstruc.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFuncionEstruc.gridx = 0;
					
				
					this.jContentPaneDetalleFuncionEstruc.add(jPanelCamposOcultosFuncionEstruc, gridBagConstraintsFuncionEstruc);
				
					this.jPanelCamposOcultosFuncionEstruc.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFuncionEstruc.gridx = 0;
	        this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFuncionEstruc.add(this.jPanelAccionesFormularioFuncionEstruc, this.gridBagConstraintsFuncionEstruc);							
			
			
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
	        this.gridBagConstraintsFuncionEstruc.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFuncionEstruc.gridx = 0;
	        
			
			this.jContentPaneDetalleFuncionEstruc.add(this.jPanelAccionesFuncionEstruc, this.gridBagConstraintsFuncionEstruc);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFuncionEstruc);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFuncionEstruc=   new JScrollPane(this.jPanelCamposFuncionEstruc,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFuncionEstruc.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFuncionEstruc.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFuncionEstruc.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFuncionEstruc.gridx = 0;
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFuncionEstruc.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFuncionEstruc.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFuncionEstruc, this.gridBagConstraintsFuncionEstruc);			
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFuncionEstruc.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFuncionEstruc, this.gridBagConstraintsFuncionEstruc);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFuncionEstruc.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
			
			
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFuncionEstruc.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		
			
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFuncionEstruc.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFuncionEstruc;//jContentPane;
		
		return jScrollPanelDatosEdicionFuncionEstruc;
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
