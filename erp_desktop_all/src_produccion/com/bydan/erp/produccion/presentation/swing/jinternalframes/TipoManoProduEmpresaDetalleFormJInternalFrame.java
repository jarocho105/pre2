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
import com.bydan.erp.produccion.util.TipoManoProduEmpresaConstantesFunciones;

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
public class TipoManoProduEmpresaDetalleFormJInternalFrame extends TipoManoProduEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoManoProduEmpresa;
	
	protected JMenuBar jmenuBarDetalleTipoManoProduEmpresa;
	
	protected JMenu jmenuDetalleTipoManoProduEmpresa;
	protected JMenu jmenuDetalleArchivoTipoManoProduEmpresa;
	protected JMenu jmenuDetalleAccionesTipoManoProduEmpresa;
	protected JMenu jmenuDetalleDatosTipoManoProduEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoManoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoManoProduEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoManoProduEmpresa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoManoProduEmpresaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoManoProduEmpresa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoManoProduEmpresaSessionBean tipomanoproduempresaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoManoProduEmpresaLogic tipomanoproduempresaLogic;
	
	public JScrollPane jScrollPanelDatosTipoManoProduEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoManoProduEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoManoProduEmpresa;
	
	protected JPanel jPanelCamposTipoManoProduEmpresa;    
	protected JPanel jPanelCamposOcultosTipoManoProduEmpresa;    	
	protected JPanel jPanelAccionesTipoManoProduEmpresa;
	protected JPanel jPanelAccionesFormularioTipoManoProduEmpresa;
    
	
	
	protected Integer iXPanelCamposTipoManoProduEmpresa=0;
	protected Integer iYPanelCamposTipoManoProduEmpresa=0;
	
	protected Integer iXPanelCamposOcultosTipoManoProduEmpresa=0;
	protected Integer iYPanelCamposOcultosTipoManoProduEmpresa=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoManoProduEmpresa;
	public JButton jButtonModificarTipoManoProduEmpresa;
	public JButton jButtonActualizarTipoManoProduEmpresa;
    public JButton jButtonEliminarTipoManoProduEmpresa;
	public JButton jButtonCancelarTipoManoProduEmpresa;
    public JButton jButtonGuardarCambiosTipoManoProduEmpresa;
	public JButton jButtonGuardarCambiosTablaTipoManoProduEmpresa;
	protected JButton jButtonCerrarTipoManoProduEmpresa;
	
	
	protected JButton jButtonProcesarInformacionTipoManoProduEmpresa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoManoProduEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoManoProduEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoManoProduEmpresa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoManoProduEmpresa;
	protected JButton jButtonModificarToolBarTipoManoProduEmpresa;
	protected JButton jButtonActualizarToolBarTipoManoProduEmpresa;
    protected JButton jButtonEliminarToolBarTipoManoProduEmpresa;
	protected JButton jButtonCancelarToolBarTipoManoProduEmpresa;
    protected JButton jButtonGuardarCambiosToolBarTipoManoProduEmpresa;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoManoProduEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoManoProduEmpresa;
	protected JButton jButtonCerrarToolBarTipoManoProduEmpresa;
	
	protected JButton jButtonProcesarInformacionToolBarTipoManoProduEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoManoProduEmpresa;
	protected JMenuItem jMenuItemModificarTipoManoProduEmpresa;
	protected JMenuItem jMenuItemActualizarTipoManoProduEmpresa;
    protected JMenuItem jMenuItemEliminarTipoManoProduEmpresa;
	protected JMenuItem jMenuItemCancelarTipoManoProduEmpresa;
    protected JMenuItem jMenuItemGuardarCambiosTipoManoProduEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoManoProduEmpresa;
	protected JMenuItem jMenuItemCerrarTipoManoProduEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoManoProduEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoManoProduEmpresa;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoManoProduEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoManoProduEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoManoProduEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoManoProduEmpresa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoManoProduEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoManoProduEmpresa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoManoProduEmpresa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoManoProduEmpresa;
	public JLabel jLabelIdTipoManoProduEmpresa;
	public JLabel jLabelidTipoManoProduEmpresa;
	public JButton jButtonidTipoManoProduEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoManoProduEmpresa;
	public JLabel jLabelnombreTipoManoProduEmpresa;
	public JTextArea jTextAreanombreTipoManoProduEmpresa;
	public JScrollPane jscrollPanenombreTipoManoProduEmpresa;
	public JButton jButtonnombreTipoManoProduEmpresaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoManoProduEmpresa;
	public JLabel jLabeldescripcionTipoManoProduEmpresa;
	public JTextArea jTextAreadescripcionTipoManoProduEmpresa;
	public JScrollPane jscrollPanedescripcionTipoManoProduEmpresa;
	public JButton jButtondescripcionTipoManoProduEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoManoProduEmpresa;
	public JLabel jLabelid_empresaTipoManoProduEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoManoProduEmpresa;
	public JButton jButtonid_empresaTipoManoProduEmpresa= new JButtonMe();
	public JButton jButtonid_empresaTipoManoProduEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoManoProduEmpresaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoManoProduEmpresa;
	
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
	
	public TipoManoProduEmpresaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoManoProduEmpresa=new JPanel();
				this.jPanelAccionesFormularioTipoManoProduEmpresa=new JPanel();
				this.jmenuBarDetalleTipoManoProduEmpresa=new JMenuBar();
				this.jTtoolBarDetalleTipoManoProduEmpresa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoManoProduEmpresaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoManoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoManoProduEmpresaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoManoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoManoProduEmpresaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoManoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoManoProduEmpresaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoManoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoManoProduEmpresaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoManoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoManoProduEmpresa() {
		return this.jButtonActualizarToolBarTipoManoProduEmpresa;
	}
	
	public JButton getjButtonEliminarToolBarTipoManoProduEmpresa() {
		return this.jButtonEliminarToolBarTipoManoProduEmpresa;
	}
	
	public JButton getjButtonCancelarToolBarTipoManoProduEmpresa() {
		return this.jButtonCancelarToolBarTipoManoProduEmpresa;
	}		
	
	public JButton getjButtonProcesarInformacionTipoManoProduEmpresa() {
		return this.jButtonProcesarInformacionTipoManoProduEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoManoProduEmpresa)	{
		this.jButtonProcesarInformacionTipoManoProduEmpresa = jButtonProcesarInformacionTipoManoProduEmpresa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoManoProduEmpresa() {
		return this.jComboBoxTiposAccionesTipoManoProduEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoManoProduEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoManoProduEmpresa) {
		this.jComboBoxTiposRelacionesTipoManoProduEmpresa = jComboBoxTiposRelacionesTipoManoProduEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoManoProduEmpresa(
			JComboBox jComboBoxTiposAccionesTipoManoProduEmpresa) {
		this.jComboBoxTiposAccionesTipoManoProduEmpresa = jComboBoxTiposAccionesTipoManoProduEmpresa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoManoProduEmpresa() {
		return this.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoManoProduEmpresa(
			JComboBox jComboBoxTiposAccionesFormularioTipoManoProduEmpresa) {
		this.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa = jComboBoxTiposAccionesFormularioTipoManoProduEmpresa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipomanoproduempresaSessionBean=new TipoManoProduEmpresaSessionBean();
		
		this.tipomanoproduempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomanoproduempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoManoProduEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoManoProduEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoManoProduEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Mano Obra Produccion Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoManoProduEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoManoProduEmpresa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoManoProduEmpresa=new JButtonMe();
				this.jButtonModificarToolBarTipoManoProduEmpresa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoManoProduEmpresa,this.jTtoolBarDetalleTipoManoProduEmpresa,
							"actualizar","actualizar","Actualizar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoManoProduEmpresa,this.jTtoolBarDetalleTipoManoProduEmpresa,
							"eliminar","eliminar","Eliminar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoManoProduEmpresa,this.jTtoolBarDetalleTipoManoProduEmpresa,
							"cancelar","cancelar","Cancelar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoManoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoManoProduEmpresa,this.jTtoolBarDetalleTipoManoProduEmpresa,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoManoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoManoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoManoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoManoProduEmpresa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoManoProduEmpresa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoManoProduEmpresa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoManoProduEmpresa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoManoProduEmpresa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoManoProduEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoManoProduEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoManoProduEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoManoProduEmpresa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoManoProduEmpresa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoManoProduEmpresa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoManoProduEmpresa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoManoProduEmpresa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoManoProduEmpresa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoManoProduEmpresa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoManoProduEmpresa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoManoProduEmpresa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoManoProduEmpresa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoManoProduEmpresa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoManoProduEmpresa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoManoProduEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoManoProduEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoManoProduEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoManoProduEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoManoProduEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoManoProduEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoManoProduEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoManoProduEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoManoProduEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoManoProduEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoManoProduEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoManoProduEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoManoProduEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoManoProduEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoManoProduEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoManoProduEmpresa.add(this.jMenuItemDetalleCerrarTipoManoProduEmpresa);
		
		this.jmenuDetalleAccionesTipoManoProduEmpresa.add(this.jMenuItemActualizarTipoManoProduEmpresa);
		this.jmenuDetalleAccionesTipoManoProduEmpresa.add(this.jMenuItemEliminarTipoManoProduEmpresa);
		this.jmenuDetalleAccionesTipoManoProduEmpresa.add(this.jMenuItemCancelarTipoManoProduEmpresa);		
		
		//this.jmenuDetalleDatosTipoManoProduEmpresa.add(this.jMenuItemDetalleAbrirOrderByTipoManoProduEmpresa);				
		this.jmenuDetalleDatosTipoManoProduEmpresa.add(this.jMenuItemDetalleMostarOcultarTipoManoProduEmpresa);				
				
		//this.jmenuDetalleAccionesTipoManoProduEmpresa.add(this.jMenuItemGuardarCambiosTipoManoProduEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoManoProduEmpresa.add(this.jmenuDetalleArchivoTipoManoProduEmpresa);		
		this.jmenuBarDetalleTipoManoProduEmpresa.add(this.jmenuDetalleAccionesTipoManoProduEmpresa);		
		this.jmenuBarDetalleTipoManoProduEmpresa.add(this.jmenuDetalleDatosTipoManoProduEmpresa);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoManoProduEmpresa);				
	}
	
	
	public void inicializarElementosCamposTipoManoProduEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoManoProduEmpresa = new JLabelMe();
		jLabelIdTipoManoProduEmpresa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoManoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoManoProduEmpresa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoManoProduEmpresa.setToolTipText(TipoManoProduEmpresaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoManoProduEmpresa= new GridBagLayout();

		this.jPanelidTipoManoProduEmpresa.setLayout(this.gridaBagLayoutTipoManoProduEmpresa);

		jLabelidTipoManoProduEmpresa = new JLabel();
		jLabelidTipoManoProduEmpresa.setText("Id");

		jLabelidTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoManoProduEmpresa = new JLabelMe();
		this.jLabelnombreTipoManoProduEmpresa.setText(""+TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoManoProduEmpresa.setToolTipText("Nombre");
		this.jLabelnombreTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoManoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoManoProduEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoManoProduEmpresa.setToolTipText(TipoManoProduEmpresaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoManoProduEmpresa = new GridBagLayout();
		this.jPanelnombreTipoManoProduEmpresa.setLayout(this.gridaBagLayoutTipoManoProduEmpresa);


		jTextAreanombreTipoManoProduEmpresa= new JTextAreaMe();
		jTextAreanombreTipoManoProduEmpresa.setEnabled(false);
		jTextAreanombreTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoManoProduEmpresa.setLineWrap(true);
		jTextAreanombreTipoManoProduEmpresa.setWrapStyleWord(true);
		jTextAreanombreTipoManoProduEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoManoProduEmpresa.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoManoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoManoProduEmpresa = new JScrollPane(jTextAreanombreTipoManoProduEmpresa);
		jscrollPanenombreTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoManoProduEmpresaBusqueda= new JButtonMe();
		this.jButtonnombreTipoManoProduEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoManoProduEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoManoProduEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoManoProduEmpresaBusqueda.setText("U");
		this.jButtonnombreTipoManoProduEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoManoProduEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoManoProduEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoManoProduEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoManoProduEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoManoProduEmpresaBusqueda"));

		if(this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoManoProduEmpresaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoManoProduEmpresa = new JLabelMe();
		this.jLabeldescripcionTipoManoProduEmpresa.setText(""+TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionTipoManoProduEmpresa.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoManoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoManoProduEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoManoProduEmpresa.setToolTipText(TipoManoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoManoProduEmpresa = new GridBagLayout();
		this.jPaneldescripcionTipoManoProduEmpresa.setLayout(this.gridaBagLayoutTipoManoProduEmpresa);


		jTextAreadescripcionTipoManoProduEmpresa= new JTextAreaMe();
		jTextAreadescripcionTipoManoProduEmpresa.setEnabled(false);
		jTextAreadescripcionTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoManoProduEmpresa.setLineWrap(true);
		jTextAreadescripcionTipoManoProduEmpresa.setWrapStyleWord(true);
		jTextAreadescripcionTipoManoProduEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoManoProduEmpresa.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoManoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoManoProduEmpresa = new JScrollPane(jTextAreadescripcionTipoManoProduEmpresa);
		jscrollPanedescripcionTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoManoProduEmpresaBusqueda= new JButtonMe();
		this.jButtondescripcionTipoManoProduEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoManoProduEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoManoProduEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoManoProduEmpresaBusqueda.setText("U");
		this.jButtondescripcionTipoManoProduEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoManoProduEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoManoProduEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoManoProduEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoManoProduEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoManoProduEmpresaBusqueda"));

		if(this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoManoProduEmpresaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoManoProduEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoManoProduEmpresa = new JLabelMe();
		this.jLabelid_empresaTipoManoProduEmpresa.setText(""+TipoManoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoManoProduEmpresa.setToolTipText("Empresa");
		this.jLabelid_empresaTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoManoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoManoProduEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoManoProduEmpresa.setToolTipText(TipoManoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoManoProduEmpresa = new GridBagLayout();
		this.jPanelid_empresaTipoManoProduEmpresa.setLayout(this.gridaBagLayoutTipoManoProduEmpresa);


		jComboBoxid_empresaTipoManoProduEmpresa= new JComboBoxMe();
		jComboBoxid_empresaTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoManoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoManoProduEmpresa.setEnabled(false);

		this.jButtonid_empresaTipoManoProduEmpresa= new JButtonMe();
		this.jButtonid_empresaTipoManoProduEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoManoProduEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoManoProduEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoManoProduEmpresa.setText("Buscar");
		this.jButtonid_empresaTipoManoProduEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoManoProduEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoManoProduEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoManoProduEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoManoProduEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoManoProduEmpresa"));

		this.jButtonid_empresaTipoManoProduEmpresaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoManoProduEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoManoProduEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoManoProduEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoManoProduEmpresaBusqueda.setText("U");
		this.jButtonid_empresaTipoManoProduEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoManoProduEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoManoProduEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoManoProduEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoManoProduEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoManoProduEmpresaBusqueda"));

		if(this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoManoProduEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoManoProduEmpresaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoManoProduEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoManoProduEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoManoProduEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoManoProduEmpresaUpdate.setText("U");
		this.jButtonid_empresaTipoManoProduEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoManoProduEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoManoProduEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoManoProduEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoManoProduEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoManoProduEmpresaUpdate"));



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
		//this.jInternalFrameDetalleTipoManoProduEmpresa = new TipoManoProduEmpresaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Mano Obra Produccion Empresa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoManoProduEmpresa= new GridBagLayout();
		

		
		String sToolTipTipoManoProduEmpresa="";
		sToolTipTipoManoProduEmpresa=TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoManoProduEmpresa+="(Produccion.TipoManoProduEmpresa)";
		}
		
		if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoManoProduEmpresa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoManoProduEmpresa = new JButtonMe();
		this.jButtonModificarTipoManoProduEmpresa = new JButtonMe();
        this.jButtonActualizarTipoManoProduEmpresa = new JButtonMe();
        this.jButtonEliminarTipoManoProduEmpresa = new JButtonMe();
        this.jButtonCancelarTipoManoProduEmpresa = new JButtonMe();
        this.jButtonGuardarCambiosTipoManoProduEmpresa = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoManoProduEmpresa = new JButtonMe();
		this.jButtonCerrarTipoManoProduEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoManoProduEmpresa = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoManoProduEmpresa = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoManoProduEmpresa = new JScrollPane();
				
		
		
		this.jPanelCamposTipoManoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoManoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoManoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoManoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Mano Obra Produccion Empresa";
		
		if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mano Obra Produccion Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoManoProduEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoManoProduEmpresa.setName("jPanelCamposTipoManoProduEmpresa"); 

		this.jPanelCamposOcultosTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoManoProduEmpresa.setName("jPanelCamposOcultosTipoManoProduEmpresa"); 

        this.jPanelAccionesTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoManoProduEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoManoProduEmpresa.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoManoProduEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoManoProduEmpresa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoManoProduEmpresa.setText("Nuevo");
		this.jButtonModificarTipoManoProduEmpresa.setText("Editar");
        this.jButtonActualizarTipoManoProduEmpresa.setText("Actualizar");
        this.jButtonEliminarTipoManoProduEmpresa.setText("Eliminar");
        this.jButtonCancelarTipoManoProduEmpresa.setText("Cancelar");
        this.jButtonGuardarCambiosTipoManoProduEmpresa.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoManoProduEmpresa.setText("Guardar");
		this.jButtonCerrarTipoManoProduEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoManoProduEmpresa,"nuevo_button","Nuevo",this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoManoProduEmpresa,"modificar_button","Editar",this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoManoProduEmpresa,"actualizar_button","Actualizar",this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoManoProduEmpresa,"eliminar_button","Eliminar",this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoManoProduEmpresa,"cancelar_button","Cancelar",this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoManoProduEmpresa,"guardarcambios_button","Guardar",this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoManoProduEmpresa,"guardarcambiostabla_button","Guardar",this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoManoProduEmpresa,"cerrar_button","Salir",this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoManoProduEmpresa.setToolTipText("Nuevo"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoManoProduEmpresa.setToolTipText("Editar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoManoProduEmpresa.setToolTipText("Actualizar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoManoProduEmpresa.setToolTipText("Eliminar)"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoManoProduEmpresa.setToolTipText("Cancelar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoManoProduEmpresa.setToolTipText("Guardar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoManoProduEmpresa.setToolTipText("Guardar"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoManoProduEmpresa.setToolTipText("Salir"+" "+TipoManoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoManoProduEmpresa";
		inputMap = this.jButtonNuevoTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoManoProduEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoManoProduEmpresa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoManoProduEmpresa";
		inputMap = this.jButtonActualizarTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoManoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoManoProduEmpresa"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoManoProduEmpresa";
		inputMap = this.jButtonEliminarTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoManoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoManoProduEmpresa"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoManoProduEmpresa";
		inputMap = this.jButtonCancelarTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoManoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoManoProduEmpresa"));
		
		//CERRAR		
		sMapKey = "CerrarTipoManoProduEmpresa";
		inputMap = this.jButtonCerrarTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoManoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoManoProduEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoManoProduEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoManoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoManoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoManoProduEmpresa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoManoProduEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoManoProduEmpresa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoManoProduEmpresa.setToolTipText("Nuevo TipoManoProduEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoManoProduEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoManoProduEmpresa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoManoProduEmpresa.setToolTipText("Sin Cerrar Ventana TipoManoProduEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoManoProduEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoManoProduEmpresa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoManoProduEmpresa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoManoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoManoProduEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoManoProduEmpresa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoManoProduEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoManoProduEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoManoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoManoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoManoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoManoProduEmpresa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoManoProduEmpresa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoManoProduEmpresa=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoManoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoManoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoManoProduEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoManoProduEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoManoProduEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoManoProduEmpresa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoManoProduEmpresa = new GridBagLayout();
		
		this.jPanelCamposTipoManoProduEmpresa.setLayout(gridaBagLayoutCamposTipoManoProduEmpresa);
		this.jPanelCamposOcultosTipoManoProduEmpresa.setLayout(gridaBagLayoutCamposOcultosTipoManoProduEmpresa);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoManoProduEmpresa.add(jLabelIdTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);



	this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.gridx = 1;
	this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoManoProduEmpresa.add(jLabelidTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);


	this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoManoProduEmpresa.add(jLabelid_empresaTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = 2;
		this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoManoProduEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoManoProduEmpresa.add(jButtonid_empresaTipoManoProduEmpresaBusqueda, this.gridBagConstraintsTipoManoProduEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = 3;
		this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoManoProduEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoManoProduEmpresa.add(jButtonid_empresaTipoManoProduEmpresaUpdate, this.gridBagConstraintsTipoManoProduEmpresa);
	}

	this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.gridx = 1;
	this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoManoProduEmpresa.add(jComboBoxid_empresaTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);


	this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoManoProduEmpresa.add(jLabelnombreTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = 2;
		this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoManoProduEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoManoProduEmpresa.add(jButtonnombreTipoManoProduEmpresaBusqueda, this.gridBagConstraintsTipoManoProduEmpresa);
	}

	this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.gridx = 1;
	this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoManoProduEmpresa.add(jscrollPanenombreTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);


	this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoManoProduEmpresa.add(jLabeldescripcionTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = 2;
		this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoManoProduEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoManoProduEmpresa.add(jButtondescripcionTipoManoProduEmpresaBusqueda, this.gridBagConstraintsTipoManoProduEmpresa);
	}

	this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.gridx = 1;
	this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoManoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoManoProduEmpresa.add(jscrollPanedescripcionTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoManoProduEmpresa.gridy = iYPanelCamposTipoManoProduEmpresa;
	this.gridBagConstraintsTipoManoProduEmpresa.gridx = iXPanelCamposTipoManoProduEmpresa++;
	this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoManoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoManoProduEmpresa.add(this.jPanelidTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);



	if(iXPanelCamposTipoManoProduEmpresa % 1==0) {
		iXPanelCamposTipoManoProduEmpresa=0;
		iYPanelCamposTipoManoProduEmpresa++;
	}
	this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoManoProduEmpresa.gridy = iYPanelCamposTipoManoProduEmpresa;
	this.gridBagConstraintsTipoManoProduEmpresa.gridx = iXPanelCamposTipoManoProduEmpresa++;
	this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoManoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoManoProduEmpresa.add(this.jPanelnombreTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);



	if(iXPanelCamposTipoManoProduEmpresa % 1==0) {
		iXPanelCamposTipoManoProduEmpresa=0;
		iYPanelCamposTipoManoProduEmpresa++;
	}
	this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoManoProduEmpresa.gridy = iYPanelCamposTipoManoProduEmpresa;
	this.gridBagConstraintsTipoManoProduEmpresa.gridx = iXPanelCamposTipoManoProduEmpresa++;
	this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoManoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoManoProduEmpresa.add(this.jPaneldescripcionTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);



	if(iXPanelCamposTipoManoProduEmpresa % 1==0) {
		iXPanelCamposTipoManoProduEmpresa=0;
		iYPanelCamposTipoManoProduEmpresa++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoManoProduEmpresa.gridy = iYPanelCamposOcultosTipoManoProduEmpresa;
	this.gridBagConstraintsTipoManoProduEmpresa.gridx = iXPanelCamposOcultosTipoManoProduEmpresa++;
	this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoManoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoManoProduEmpresa.add(this.jPanelid_empresaTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);



	if(iXPanelCamposOcultosTipoManoProduEmpresa % 1==0) {
		iXPanelCamposOcultosTipoManoProduEmpresa=0;
		iYPanelCamposOcultosTipoManoProduEmpresa++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoManoProduEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoManoProduEmpresa.setLayout(gridaBagLayoutAccionesTipoManoProduEmpresa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoManoProduEmpresa= new GridBagLayout();
		this.jPanelAccionesFormularioTipoManoProduEmpresa.setLayout(gridaBagLayoutAccionesFormularioTipoManoProduEmpresa);
		
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoManoProduEmpresa.add(this.jComboBoxTiposAccionesFormularioTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);

		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoManoProduEmpresa.add(this.jCheckBoxPostAccionNuevoTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipomanoproduempresaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoManoProduEmpresa.add(this.jCheckBoxPostAccionSinCerrarTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipomanoproduempresaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoManoProduEmpresa.add(this.jCheckBoxPostAccionSinMensajeTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoManoProduEmpresa.add(this.jButtonModificarTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);							

		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoManoProduEmpresa.add(this.jButtonEliminarTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		
			
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoManoProduEmpresa.add(this.jButtonActualizarTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);


		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoManoProduEmpresa.add(this.jButtonGuardarCambiosTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);	
		
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoManoProduEmpresa.add(this.jButtonCancelarTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoManoProduEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoManoProduEmpresa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomanoproduempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoManoProduEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoManoProduEmpresa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoManoProduEmpresa.gridx =0;
		this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoManoProduEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoManoProduEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoManoProduEmpresa = new TipoManoProduEmpresaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Mano Obra Produccion Empresa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Mano Obra Produccion Empresa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Mano Obra Produccion Empresa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoManoProduEmpresaModel tipomanoproduempresaModel=new TipoManoProduEmpresaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoManoProduEmpresaModel.TipoManoProduEmpresaFocusTraversalPolicy tipomanoproduempresaFocusTraversalPolicy = tipomanoproduempresaModel.new TipoManoProduEmpresaFocusTraversalPolicy(this);
			
			//tipomanoproduempresaFocusTraversalPolicy.settipomanoproduempresaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipomanoproduempresaModel);
			
			
			this.jContentPaneDetalleTipoManoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoManoProduEmpresa = new GridBagLayout();	
			this.jContentPaneDetalleTipoManoProduEmpresa.setLayout(gridaBagLayoutDetalleTipoManoProduEmpresa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoManoProduEmpresa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
					
				
				this.jContentPaneDetalleTipoManoProduEmpresa.add(jTtoolBarDetalleTipoManoProduEmpresa, gridBagConstraintsTipoManoProduEmpresa);								
				
}
			
			this.jScrollPanelDatosEdicionTipoManoProduEmpresa=   new JScrollPane(jContentPaneDetalleTipoManoProduEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoManoProduEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoManoProduEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoManoProduEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoManoProduEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoManoProduEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoManoProduEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoManoProduEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
	        
			this.jContentPaneDetalleTipoManoProduEmpresa.add(jPanelCamposTipoManoProduEmpresa, gridBagConstraintsTipoManoProduEmpresa);
			
			
			
			
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
						&& tipomanoproduempresaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipomanoproduempresaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoManoProduEmpresa= new GridBagConstraints();
						this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
						this.jContentPaneDetalleTipoManoProduEmpresa.add(this.jTabbedPaneRelacionesTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoManoProduEmpresa.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoManoProduEmpresa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
					this.gridBagConstraintsTipoManoProduEmpresa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
					
				
					this.jContentPaneDetalleTipoManoProduEmpresa.add(jPanelCamposOcultosTipoManoProduEmpresa, gridBagConstraintsTipoManoProduEmpresa);
				
					this.jPanelCamposOcultosTipoManoProduEmpresa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
	        this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoManoProduEmpresa.add(this.jPanelAccionesFormularioTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);							
			
			
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
	        this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoManoProduEmpresa.add(this.jPanelAccionesTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoManoProduEmpresa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoManoProduEmpresa=   new JScrollPane(this.jPanelCamposTipoManoProduEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoManoProduEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoManoProduEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoManoProduEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
			this.gridBagConstraintsTipoManoProduEmpresa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoManoProduEmpresa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoManoProduEmpresa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);			
			
			this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoManoProduEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
			
			
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		
			
		this.gridBagConstraintsTipoManoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoManoProduEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoManoProduEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoManoProduEmpresa, this.gridBagConstraintsTipoManoProduEmpresa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoManoProduEmpresa;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoManoProduEmpresa;
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
