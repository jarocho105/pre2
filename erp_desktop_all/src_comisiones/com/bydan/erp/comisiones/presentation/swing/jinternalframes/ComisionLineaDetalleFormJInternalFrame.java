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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.ComisionLineaConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class ComisionLineaDetalleFormJInternalFrame extends ComisionLineaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleComisionLinea;
	
	protected JMenuBar jmenuBarDetalleComisionLinea;
	
	protected JMenu jmenuDetalleComisionLinea;
	protected JMenu jmenuDetalleArchivoComisionLinea;
	protected JMenu jmenuDetalleAccionesComisionLinea;
	protected JMenu jmenuDetalleDatosComisionLinea;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleComisionLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComisionLinea;	
	protected GridBagConstraints gridBagConstraintsComisionLinea;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ComisionLineaBeanSwingJInternalFrameAdditional jInternalFrameDetalleComisionLinea;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_comisionconfig="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected EstadoComisionBeanSwingJInternalFrame estadocomisionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocomision="";
	
	public ComisionLineaSessionBean comisionlineaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ComisionConfigSessionBean comisionconfigSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public LineaSessionBean lineaSessionBean;
	public EstadoComisionSessionBean estadocomisionSessionBean;	
	
	public ComisionLineaLogic comisionlineaLogic;
	
	public JScrollPane jScrollPanelDatosComisionLinea;
	public JScrollPane jScrollPanelDatosEdicionComisionLinea;
	public JScrollPane jScrollPanelDatosGeneralComisionLinea;
	
	protected JPanel jPanelCamposComisionLinea;    
	protected JPanel jPanelCamposOcultosComisionLinea;    	
	protected JPanel jPanelAccionesComisionLinea;
	protected JPanel jPanelAccionesFormularioComisionLinea;
    
	
	
	protected Integer iXPanelCamposComisionLinea=0;
	protected Integer iYPanelCamposComisionLinea=0;
	
	protected Integer iXPanelCamposOcultosComisionLinea=0;
	protected Integer iYPanelCamposOcultosComisionLinea=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoComisionLinea;
	public JButton jButtonModificarComisionLinea;
	public JButton jButtonActualizarComisionLinea;
    public JButton jButtonEliminarComisionLinea;
	public JButton jButtonCancelarComisionLinea;
    public JButton jButtonGuardarCambiosComisionLinea;
	public JButton jButtonGuardarCambiosTablaComisionLinea;
	protected JButton jButtonCerrarComisionLinea;
	
	
	protected JButton jButtonProcesarInformacionComisionLinea;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoComisionLinea;
	protected JCheckBox jCheckBoxPostAccionSinCerrarComisionLinea;
	protected JCheckBox jCheckBoxPostAccionSinMensajeComisionLinea;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComisionLinea;
	protected JButton jButtonModificarToolBarComisionLinea;
	protected JButton jButtonActualizarToolBarComisionLinea;
    protected JButton jButtonEliminarToolBarComisionLinea;
	protected JButton jButtonCancelarToolBarComisionLinea;
    protected JButton jButtonGuardarCambiosToolBarComisionLinea;
	protected JButton jButtonGuardarCambiosTablaToolBarComisionLinea;
	protected JButton jButtonMostrarOcultarTablaToolBarComisionLinea;
	protected JButton jButtonCerrarToolBarComisionLinea;
	
	protected JButton jButtonProcesarInformacionToolBarComisionLinea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComisionLinea;
	protected JMenuItem jMenuItemModificarComisionLinea;
	protected JMenuItem jMenuItemActualizarComisionLinea;
    protected JMenuItem jMenuItemEliminarComisionLinea;
	protected JMenuItem jMenuItemCancelarComisionLinea;
    protected JMenuItem jMenuItemGuardarCambiosComisionLinea;
	protected JMenuItem jMenuItemGuardarCambiosTablaComisionLinea;
	protected JMenuItem jMenuItemCerrarComisionLinea;
	protected JMenuItem jMenuItemDetalleCerrarComisionLinea;
	protected JMenuItem jMenuItemDetalleMostarOcultarComisionLinea;
	
	protected JMenuItem jMenuItemProcesarInformacionComisionLinea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComisionLinea;
	protected JMenuItem jMenuItemMostrarOcultarComisionLinea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComisionLinea;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComisionLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComisionLinea;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioComisionLinea;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidComisionLinea;
	public JLabel jLabelIdComisionLinea;
	public JLabel jLabelidComisionLinea;
	public JButton jButtonidComisionLineaBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeComisionLinea;
	public JLabel jLabelporcentajeComisionLinea;
	public JTextField jTextFieldporcentajeComisionLinea;
	public JButton jButtonporcentajeComisionLineaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionComisionLinea;
	public JLabel jLabeldescripcionComisionLinea;
	public JTextArea jTextAreadescripcionComisionLinea;
	public JScrollPane jscrollPanedescripcionComisionLinea;
	public JButton jButtondescripcionComisionLineaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaComisionLinea;
	public JLabel jLabelid_empresaComisionLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaComisionLinea;
	public JButton jButtonid_empresaComisionLinea= new JButtonMe();
	public JButton jButtonid_empresaComisionLineaUpdate= new JButtonMe();
	public JButton jButtonid_empresaComisionLineaBusqueda= new JButtonMe();

	public JPanel jPanelid_comision_configComisionLinea;
	public JLabel jLabelid_comision_configComisionLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_comision_configComisionLinea;
	public JButton jButtonid_comision_configComisionLinea= new JButtonMe();
	public JButton jButtonid_comision_configComisionLineaUpdate= new JButtonMe();
	public JButton jButtonid_comision_configComisionLineaBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorComisionLinea;
	public JLabel jLabelid_vendedorComisionLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorComisionLinea;
	public JButton jButtonid_vendedorComisionLinea= new JButtonMe();
	public JButton jButtonid_vendedorComisionLineaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorComisionLineaBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorComisionLineaArbol= new JButtonMe();

	public JPanel jPanelid_lineaComisionLinea;
	public JLabel jLabelid_lineaComisionLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaComisionLinea;
	public JButton jButtonid_lineaComisionLinea= new JButtonMe();
	public JButton jButtonid_lineaComisionLineaUpdate= new JButtonMe();
	public JButton jButtonid_lineaComisionLineaBusqueda= new JButtonMe();
	public JButton jButtonid_lineaComisionLineaArbol= new JButtonMe();

	public JPanel jPanelid_estado_comisionComisionLinea;
	public JLabel jLabelid_estado_comisionComisionLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_comisionComisionLinea;
	public JButton jButtonid_estado_comisionComisionLinea= new JButtonMe();
	public JButton jButtonid_estado_comisionComisionLineaUpdate= new JButtonMe();
	public JButton jButtonid_estado_comisionComisionLineaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesComisionLinea;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ComisionLineaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposComisionLinea=new JPanel();
				this.jPanelAccionesFormularioComisionLinea=new JPanel();
				this.jmenuBarDetalleComisionLinea=new JMenuBar();
				this.jTtoolBarDetalleComisionLinea=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionLineaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ComisionLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ComisionLineaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ComisionLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionLineaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionLineaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionLineaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComisionLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarComisionLinea() {
		return this.jButtonActualizarToolBarComisionLinea;
	}
	
	public JButton getjButtonEliminarToolBarComisionLinea() {
		return this.jButtonEliminarToolBarComisionLinea;
	}
	
	public JButton getjButtonCancelarToolBarComisionLinea() {
		return this.jButtonCancelarToolBarComisionLinea;
	}		
	
	public JButton getjButtonProcesarInformacionComisionLinea() {
		return this.jButtonProcesarInformacionComisionLinea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComisionLinea)	{
		this.jButtonProcesarInformacionComisionLinea = jButtonProcesarInformacionComisionLinea;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComisionLinea() {
		return this.jComboBoxTiposAccionesComisionLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComisionLinea(
			JComboBox jComboBoxTiposRelacionesComisionLinea) {
		this.jComboBoxTiposRelacionesComisionLinea = jComboBoxTiposRelacionesComisionLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComisionLinea(
			JComboBox jComboBoxTiposAccionesComisionLinea) {
		this.jComboBoxTiposAccionesComisionLinea = jComboBoxTiposAccionesComisionLinea;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioComisionLinea() {
		return this.jComboBoxTiposAccionesFormularioComisionLinea;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioComisionLinea(
			JComboBox jComboBoxTiposAccionesFormularioComisionLinea) {
		this.jComboBoxTiposAccionesFormularioComisionLinea = jComboBoxTiposAccionesFormularioComisionLinea;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.comisionlineaSessionBean=new ComisionLineaSessionBean();
		
		this.comisionlineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionlineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comisionlineaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComisionLineaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComisionLineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComisionLineaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comision Linea MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
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
	
		ComisionLineaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleComisionLinea= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarComisionLinea=new JButtonMe();
				this.jButtonModificarToolBarComisionLinea=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarComisionLinea,this.jTtoolBarDetalleComisionLinea,
							"actualizar","actualizar","Actualizar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarComisionLinea,this.jTtoolBarDetalleComisionLinea,
							"eliminar","eliminar","Eliminar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarComisionLinea,this.jTtoolBarDetalleComisionLinea,
							"cancelar","cancelar","Cancelar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarComisionLinea,this.jTtoolBarDetalleComisionLinea,
							"guardarcambios","guardarcambios","Guardar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleComisionLinea=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleComisionLinea=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoComisionLinea=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesComisionLinea=new JMenuMe("Acciones");
		this.jmenuDetalleDatosComisionLinea=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComisionLinea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComisionLinea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComisionLinea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarComisionLinea= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarComisionLinea.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarComisionLinea,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarComisionLinea= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarComisionLinea.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarComisionLinea,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarComisionLinea= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarComisionLinea.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarComisionLinea,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarComisionLinea= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarComisionLinea.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarComisionLinea,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosComisionLinea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComisionLinea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComisionLinea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComisionLinea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComisionLinea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComisionLinea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarComisionLinea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarComisionLinea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarComisionLinea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComisionLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComisionLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComisionLinea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComisionLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComisionLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComisionLinea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoComisionLinea.add(this.jMenuItemDetalleCerrarComisionLinea);
		
		this.jmenuDetalleAccionesComisionLinea.add(this.jMenuItemActualizarComisionLinea);
		this.jmenuDetalleAccionesComisionLinea.add(this.jMenuItemEliminarComisionLinea);
		this.jmenuDetalleAccionesComisionLinea.add(this.jMenuItemCancelarComisionLinea);		
		
		//this.jmenuDetalleDatosComisionLinea.add(this.jMenuItemDetalleAbrirOrderByComisionLinea);				
		this.jmenuDetalleDatosComisionLinea.add(this.jMenuItemDetalleMostarOcultarComisionLinea);				
				
		//this.jmenuDetalleAccionesComisionLinea.add(this.jMenuItemGuardarCambiosComisionLinea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleComisionLinea.add(this.jmenuDetalleArchivoComisionLinea);		
		this.jmenuBarDetalleComisionLinea.add(this.jmenuDetalleAccionesComisionLinea);		
		this.jmenuBarDetalleComisionLinea.add(this.jmenuDetalleDatosComisionLinea);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleComisionLinea);				
	}
	
	
	public void inicializarElementosCamposComisionLinea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdComisionLinea = new JLabelMe();
		jLabelIdComisionLinea.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidComisionLinea = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidComisionLinea.setToolTipText(ComisionLineaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutComisionLinea= new GridBagLayout();

		this.jPanelidComisionLinea.setLayout(this.gridaBagLayoutComisionLinea);

		jLabelidComisionLinea = new JLabel();
		jLabelidComisionLinea.setText("Id");

		jLabelidComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeComisionLinea = new JLabelMe();
		this.jLabelporcentajeComisionLinea.setText(""+ComisionLineaConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeComisionLinea.setToolTipText("Porcentaje");
		this.jLabelporcentajeComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeComisionLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeComisionLinea.setToolTipText(ComisionLineaConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutComisionLinea = new GridBagLayout();
		this.jPanelporcentajeComisionLinea.setLayout(this.gridaBagLayoutComisionLinea);


		jTextFieldporcentajeComisionLinea= new JTextFieldMe();
		jTextFieldporcentajeComisionLinea.setEnabled(false);
		jTextFieldporcentajeComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeComisionLinea.setText("0.0");

		this.jButtonporcentajeComisionLineaBusqueda= new JButtonMe();
		this.jButtonporcentajeComisionLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeComisionLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeComisionLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeComisionLineaBusqueda.setText("U");
		this.jButtonporcentajeComisionLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeComisionLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeComisionLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeComisionLineaBusqueda"));

		if(this.comisionlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeComisionLineaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionComisionLinea = new JLabelMe();
		this.jLabeldescripcionComisionLinea.setText(""+ComisionLineaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionComisionLinea.setToolTipText("Descripcion");
		this.jLabeldescripcionComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionComisionLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionComisionLinea.setToolTipText(ComisionLineaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutComisionLinea = new GridBagLayout();
		this.jPaneldescripcionComisionLinea.setLayout(this.gridaBagLayoutComisionLinea);


		jTextAreadescripcionComisionLinea= new JTextAreaMe();
		jTextAreadescripcionComisionLinea.setEnabled(false);
		jTextAreadescripcionComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComisionLinea.setLineWrap(true);
		jTextAreadescripcionComisionLinea.setWrapStyleWord(true);
		jTextAreadescripcionComisionLinea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionComisionLinea.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionComisionLinea = new JScrollPane(jTextAreadescripcionComisionLinea);
		jscrollPanedescripcionComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionComisionLineaBusqueda= new JButtonMe();
		this.jButtondescripcionComisionLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionComisionLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionComisionLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionComisionLineaBusqueda.setText("U");
		this.jButtondescripcionComisionLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionComisionLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionComisionLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionComisionLineaBusqueda"));

		if(this.comisionlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionComisionLineaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysComisionLinea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaComisionLinea = new JLabelMe();
		this.jLabelid_empresaComisionLinea.setText(""+ComisionLineaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaComisionLinea.setToolTipText("Empresa");
		this.jLabelid_empresaComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaComisionLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaComisionLinea.setToolTipText(ComisionLineaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutComisionLinea = new GridBagLayout();
		this.jPanelid_empresaComisionLinea.setLayout(this.gridaBagLayoutComisionLinea);


		jComboBoxid_empresaComisionLinea= new JComboBoxMe();
		jComboBoxid_empresaComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaComisionLinea.setEnabled(false);

		this.jButtonid_empresaComisionLinea= new JButtonMe();
		this.jButtonid_empresaComisionLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionLinea.setText("Buscar");
		this.jButtonid_empresaComisionLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaComisionLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionLinea"));

		this.jButtonid_empresaComisionLineaBusqueda= new JButtonMe();
		this.jButtonid_empresaComisionLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComisionLineaBusqueda.setText("U");
		this.jButtonid_empresaComisionLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaComisionLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionLineaBusqueda"));

		if(this.comisionlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaComisionLineaBusqueda.setVisible(false);		}

		this.jButtonid_empresaComisionLineaUpdate= new JButtonMe();
		this.jButtonid_empresaComisionLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComisionLineaUpdate.setText("U");
		this.jButtonid_empresaComisionLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaComisionLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionLineaUpdate"));



					
		this.jLabelid_comision_configComisionLinea = new JLabelMe();
		this.jLabelid_comision_configComisionLinea.setText(""+ComisionLineaConstantesFunciones.LABEL_IDCOMISIONCONFIG+" : *");
		this.jLabelid_comision_configComisionLinea.setToolTipText("Configuracion");
		this.jLabelid_comision_configComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_comision_configComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_comision_configComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_comision_configComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_comision_configComisionLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_comision_configComisionLinea.setToolTipText(ComisionLineaConstantesFunciones.LABEL_IDCOMISIONCONFIG);
		this.gridaBagLayoutComisionLinea = new GridBagLayout();
		this.jPanelid_comision_configComisionLinea.setLayout(this.gridaBagLayoutComisionLinea);


		jComboBoxid_comision_configComisionLinea= new JComboBoxMe();
		jComboBoxid_comision_configComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_comision_configComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_comision_configComisionLinea= new JButtonMe();
		this.jButtonid_comision_configComisionLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_comision_configComisionLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_comision_configComisionLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_comision_configComisionLinea.setText("Buscar");
		this.jButtonid_comision_configComisionLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_comision_configComisionLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_comision_configComisionLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_comision_configComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_comision_configComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_comision_configComisionLinea"));

		this.jButtonid_comision_configComisionLineaBusqueda= new JButtonMe();
		this.jButtonid_comision_configComisionLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_comision_configComisionLineaBusqueda.setText("U");
		this.jButtonid_comision_configComisionLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_comision_configComisionLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_comision_configComisionLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_comision_configComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_comision_configComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_comision_configComisionLineaBusqueda"));

		if(this.comisionlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_comision_configComisionLineaBusqueda.setVisible(false);		}

		this.jButtonid_comision_configComisionLineaUpdate= new JButtonMe();
		this.jButtonid_comision_configComisionLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_comision_configComisionLineaUpdate.setText("U");
		this.jButtonid_comision_configComisionLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_comision_configComisionLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_comision_configComisionLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_comision_configComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_comision_configComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_comision_configComisionLineaUpdate"));



					
		this.jLabelid_vendedorComisionLinea = new JLabelMe();
		this.jLabelid_vendedorComisionLinea.setText(""+ComisionLineaConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorComisionLinea.setToolTipText("Vendedor");
		this.jLabelid_vendedorComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorComisionLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorComisionLinea.setToolTipText(ComisionLineaConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutComisionLinea = new GridBagLayout();
		this.jPanelid_vendedorComisionLinea.setLayout(this.gridaBagLayoutComisionLinea);


		jComboBoxid_vendedorComisionLinea= new JComboBoxMe();
		jComboBoxid_vendedorComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorComisionLinea= new JButtonMe();
		this.jButtonid_vendedorComisionLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComisionLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComisionLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComisionLinea.setText("Buscar");
		this.jButtonid_vendedorComisionLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorComisionLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionLinea"));

		this.jButtonid_vendedorComisionLineaBusqueda= new JButtonMe();
		this.jButtonid_vendedorComisionLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorComisionLineaBusqueda.setText("U");
		this.jButtonid_vendedorComisionLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorComisionLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionLineaBusqueda"));

		if(this.comisionlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorComisionLineaBusqueda.setVisible(false);		}

		this.jButtonid_vendedorComisionLineaUpdate= new JButtonMe();
		this.jButtonid_vendedorComisionLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorComisionLineaUpdate.setText("U");
		this.jButtonid_vendedorComisionLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorComisionLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionLineaUpdate"));


		jButtonid_vendedorComisionLineaArbol= new JButtonMe();
		jButtonid_vendedorComisionLineaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorComisionLineaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorComisionLineaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorComisionLineaArbol.setText("Arbol");
		jButtonid_vendedorComisionLineaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorComisionLineaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionLineaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionLineaArbol"));



					
		this.jLabelid_lineaComisionLinea = new JLabelMe();
		this.jLabelid_lineaComisionLinea.setText(""+ComisionLineaConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaComisionLinea.setToolTipText("Linea");
		this.jLabelid_lineaComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaComisionLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaComisionLinea.setToolTipText(ComisionLineaConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutComisionLinea = new GridBagLayout();
		this.jPanelid_lineaComisionLinea.setLayout(this.gridaBagLayoutComisionLinea);


		jComboBoxid_lineaComisionLinea= new JComboBoxMe();
		jComboBoxid_lineaComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaComisionLinea= new JButtonMe();
		this.jButtonid_lineaComisionLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaComisionLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaComisionLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaComisionLinea.setText("Buscar");
		this.jButtonid_lineaComisionLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaComisionLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaComisionLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaComisionLinea"));

		this.jButtonid_lineaComisionLineaBusqueda= new JButtonMe();
		this.jButtonid_lineaComisionLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaComisionLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaComisionLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaComisionLineaBusqueda.setText("U");
		this.jButtonid_lineaComisionLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaComisionLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaComisionLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaComisionLineaBusqueda"));

		if(this.comisionlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaComisionLineaBusqueda.setVisible(false);		}

		this.jButtonid_lineaComisionLineaUpdate= new JButtonMe();
		this.jButtonid_lineaComisionLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaComisionLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaComisionLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaComisionLineaUpdate.setText("U");
		this.jButtonid_lineaComisionLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaComisionLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaComisionLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaComisionLineaUpdate"));


		jButtonid_lineaComisionLineaArbol= new JButtonMe();
		jButtonid_lineaComisionLineaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaComisionLineaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaComisionLineaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaComisionLineaArbol.setText("Arbol");
		jButtonid_lineaComisionLineaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_lineaComisionLineaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaComisionLineaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_lineaComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaComisionLineaArbol"));



					
		this.jLabelid_estado_comisionComisionLinea = new JLabelMe();
		this.jLabelid_estado_comisionComisionLinea.setText(""+ComisionLineaConstantesFunciones.LABEL_IDESTADOCOMISION+" : *");
		this.jLabelid_estado_comisionComisionLinea.setToolTipText("Estado");
		this.jLabelid_estado_comisionComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_comisionComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_comisionComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_comisionComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_comisionComisionLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_comisionComisionLinea.setToolTipText(ComisionLineaConstantesFunciones.LABEL_IDESTADOCOMISION);
		this.gridaBagLayoutComisionLinea = new GridBagLayout();
		this.jPanelid_estado_comisionComisionLinea.setLayout(this.gridaBagLayoutComisionLinea);


		jComboBoxid_estado_comisionComisionLinea= new JComboBoxMe();
		jComboBoxid_estado_comisionComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_comisionComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_comisionComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_comisionComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_comisionComisionLinea= new JButtonMe();
		this.jButtonid_estado_comisionComisionLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_comisionComisionLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_comisionComisionLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_comisionComisionLinea.setText("Buscar");
		this.jButtonid_estado_comisionComisionLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_comisionComisionLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_comisionComisionLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_comisionComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_comisionComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_comisionComisionLinea"));

		this.jButtonid_estado_comisionComisionLineaBusqueda= new JButtonMe();
		this.jButtonid_estado_comisionComisionLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_comisionComisionLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_comisionComisionLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_comisionComisionLineaBusqueda.setText("U");
		this.jButtonid_estado_comisionComisionLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_comisionComisionLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_comisionComisionLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_comisionComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_comisionComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_comisionComisionLineaBusqueda"));

		if(this.comisionlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_comisionComisionLineaBusqueda.setVisible(false);		}

		this.jButtonid_estado_comisionComisionLineaUpdate= new JButtonMe();
		this.jButtonid_estado_comisionComisionLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_comisionComisionLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_comisionComisionLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_comisionComisionLineaUpdate.setText("U");
		this.jButtonid_estado_comisionComisionLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_comisionComisionLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_comisionComisionLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_comisionComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_comisionComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_comisionComisionLineaUpdate"));



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
		//this.jInternalFrameDetalleComisionLinea = new ComisionLineaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Comision Linea DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComisionLinea= new GridBagLayout();
		

		
		String sToolTipComisionLinea="";
		sToolTipComisionLinea=ComisionLineaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComisionLinea+="(Comisiones.ComisionLinea)";
		}
		
		if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
			sToolTipComisionLinea+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoComisionLinea = new JButtonMe();
		this.jButtonModificarComisionLinea = new JButtonMe();
        this.jButtonActualizarComisionLinea = new JButtonMe();
        this.jButtonEliminarComisionLinea = new JButtonMe();
        this.jButtonCancelarComisionLinea = new JButtonMe();
        this.jButtonGuardarCambiosComisionLinea = new JButtonMe();
		this.jButtonGuardarCambiosTablaComisionLinea = new JButtonMe();
		this.jButtonCerrarComisionLinea = new JButtonMe();
		
		this.jScrollPanelDatosComisionLinea = new JScrollPane();   
        this.jScrollPanelDatosEdicionComisionLinea = new JScrollPane();
		this.jScrollPanelDatosGeneralComisionLinea = new JScrollPane();
				
		
		
		this.jPanelCamposComisionLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosComisionLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesComisionLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioComisionLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Comision Linea";
		
		if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Lineas" + this.sPath));
		} else {
			this.jScrollPanelDatosComisionLinea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposComisionLinea.setName("jPanelCamposComisionLinea"); 

		this.jPanelCamposOcultosComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosComisionLinea.setName("jPanelCamposOcultosComisionLinea"); 

        this.jPanelAccionesComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComisionLinea.setToolTipText("Acciones");
        this.jPanelAccionesComisionLinea.setName("Acciones"); 

		this.jPanelAccionesFormularioComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioComisionLinea.setToolTipText("Acciones");
        this.jPanelAccionesFormularioComisionLinea.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoComisionLinea.setText("Nuevo");
		this.jButtonModificarComisionLinea.setText("Editar");
        this.jButtonActualizarComisionLinea.setText("Actualizar");
        this.jButtonEliminarComisionLinea.setText("Eliminar");
        this.jButtonCancelarComisionLinea.setText("Cancelar");
        this.jButtonGuardarCambiosComisionLinea.setText("Guardar");
		this.jButtonGuardarCambiosTablaComisionLinea.setText("Guardar");
		this.jButtonCerrarComisionLinea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComisionLinea,"nuevo_button","Nuevo",this.comisionlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarComisionLinea,"modificar_button","Editar",this.comisionlineaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarComisionLinea,"actualizar_button","Actualizar",this.comisionlineaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarComisionLinea,"eliminar_button","Eliminar",this.comisionlineaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarComisionLinea,"cancelar_button","Cancelar",this.comisionlineaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosComisionLinea,"guardarcambios_button","Guardar",this.comisionlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComisionLinea,"guardarcambiostabla_button","Guardar",this.comisionlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComisionLinea,"cerrar_button","Salir",this.comisionlineaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoComisionLinea.setToolTipText("Nuevo"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarComisionLinea.setToolTipText("Editar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarComisionLinea.setToolTipText("Actualizar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarComisionLinea.setToolTipText("Eliminar)"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarComisionLinea.setToolTipText("Cancelar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosComisionLinea.setToolTipText("Guardar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaComisionLinea.setToolTipText("Guardar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComisionLinea.setToolTipText("Salir"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComisionLinea";
		inputMap = this.jButtonNuevoComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComisionLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComisionLinea"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarComisionLinea";
		inputMap = this.jButtonActualizarComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarComisionLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarComisionLinea"));
		
		//ELIMINAR
		sMapKey = "EliminarComisionLinea";
		inputMap = this.jButtonEliminarComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarComisionLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarComisionLinea"));
		
		//CANCELAR	
		sMapKey = "CancelarComisionLinea";
		inputMap = this.jButtonCancelarComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarComisionLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarComisionLinea"));
		
		//CERRAR		
		sMapKey = "CerrarComisionLinea";
		inputMap = this.jButtonCerrarComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComisionLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComisionLinea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComisionLinea";
		inputMap = this.jButtonGuardarCambiosTablaComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComisionLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComisionLinea"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoComisionLinea = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoComisionLinea.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoComisionLinea.setToolTipText("Nuevo ComisionLinea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarComisionLinea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarComisionLinea.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarComisionLinea.setToolTipText("Sin Cerrar Ventana ComisionLinea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeComisionLinea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeComisionLinea.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeComisionLinea.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesComisionLinea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComisionLinea.setText("Accion");
		this.jComboBoxTiposAccionesComisionLinea.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioComisionLinea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioComisionLinea.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioComisionLinea.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesComisionLinea = new JLabelMe();
		
		this.jLabelAccionesComisionLinea.setText("Acciones");		
		this.jLabelAccionesComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposComisionLinea();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysComisionLinea();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesComisionLinea=new JTabbedPane();
		this.jTabbedPaneRelacionesComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesComisionLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesComisionLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioComisionLinea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComisionLinea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComisionLinea.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposComisionLinea = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosComisionLinea = new GridBagLayout();
		
		this.jPanelCamposComisionLinea.setLayout(gridaBagLayoutCamposComisionLinea);
		this.jPanelCamposOcultosComisionLinea.setLayout(gridaBagLayoutCamposOcultosComisionLinea);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 0;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidComisionLinea.add(jLabelIdComisionLinea, this.gridBagConstraintsComisionLinea);



	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 1;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidComisionLinea.add(jLabelidComisionLinea, this.gridBagConstraintsComisionLinea);


	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 0;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaComisionLinea.add(jLabelid_empresaComisionLinea, this.gridBagConstraintsComisionLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		//this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = 0;
		this.gridBagConstraintsComisionLinea.gridx = 2;
		this.gridBagConstraintsComisionLinea.ipadx = 0;
		this.gridBagConstraintsComisionLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComisionLinea.add(jButtonid_empresaComisionLineaBusqueda, this.gridBagConstraintsComisionLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		//this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = 0;
		this.gridBagConstraintsComisionLinea.gridx = 3;
		this.gridBagConstraintsComisionLinea.ipadx = 0;
		this.gridBagConstraintsComisionLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComisionLinea.add(jButtonid_empresaComisionLineaUpdate, this.gridBagConstraintsComisionLinea);
	}

	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 1;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaComisionLinea.add(jComboBoxid_empresaComisionLinea, this.gridBagConstraintsComisionLinea);


	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 0;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_comision_configComisionLinea.add(jLabelid_comision_configComisionLinea, this.gridBagConstraintsComisionLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		//this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = 0;
		this.gridBagConstraintsComisionLinea.gridx = 2;
		this.gridBagConstraintsComisionLinea.ipadx = 0;
		this.gridBagConstraintsComisionLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_comision_configComisionLinea.add(jButtonid_comision_configComisionLineaBusqueda, this.gridBagConstraintsComisionLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		//this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = 0;
		this.gridBagConstraintsComisionLinea.gridx = 3;
		this.gridBagConstraintsComisionLinea.ipadx = 0;
		this.gridBagConstraintsComisionLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_comision_configComisionLinea.add(jButtonid_comision_configComisionLineaUpdate, this.gridBagConstraintsComisionLinea);
	}

	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 1;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_comision_configComisionLinea.add(jComboBoxid_comision_configComisionLinea, this.gridBagConstraintsComisionLinea);


	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 0;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorComisionLinea.add(jLabelid_vendedorComisionLinea, this.gridBagConstraintsComisionLinea);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	//this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 2;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorComisionLinea.add(jButtonid_vendedorComisionLinea, this.gridBagConstraintsComisionLinea);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	//this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 3;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorComisionLinea.add(jButtonid_vendedorComisionLineaArbol, this.gridBagConstraintsComisionLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		//this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = 0;
		this.gridBagConstraintsComisionLinea.gridx = 4;
		this.gridBagConstraintsComisionLinea.ipadx = 0;
		this.gridBagConstraintsComisionLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorComisionLinea.add(jButtonid_vendedorComisionLineaBusqueda, this.gridBagConstraintsComisionLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		//this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = 0;
		this.gridBagConstraintsComisionLinea.gridx = 5;
		this.gridBagConstraintsComisionLinea.ipadx = 0;
		this.gridBagConstraintsComisionLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorComisionLinea.add(jButtonid_vendedorComisionLineaUpdate, this.gridBagConstraintsComisionLinea);
	}

	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 1;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorComisionLinea.add(jComboBoxid_vendedorComisionLinea, this.gridBagConstraintsComisionLinea);


	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 0;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaComisionLinea.add(jLabelid_lineaComisionLinea, this.gridBagConstraintsComisionLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		//this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = 0;
		this.gridBagConstraintsComisionLinea.gridx = 2;
		this.gridBagConstraintsComisionLinea.ipadx = 0;
		this.gridBagConstraintsComisionLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaComisionLinea.add(jButtonid_lineaComisionLineaBusqueda, this.gridBagConstraintsComisionLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		//this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = 0;
		this.gridBagConstraintsComisionLinea.gridx = 3;
		this.gridBagConstraintsComisionLinea.ipadx = 0;
		this.gridBagConstraintsComisionLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaComisionLinea.add(jButtonid_lineaComisionLineaUpdate, this.gridBagConstraintsComisionLinea);
	}

	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 1;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaComisionLinea.add(jComboBoxid_lineaComisionLinea, this.gridBagConstraintsComisionLinea);


	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 0;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_comisionComisionLinea.add(jLabelid_estado_comisionComisionLinea, this.gridBagConstraintsComisionLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		//this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = 0;
		this.gridBagConstraintsComisionLinea.gridx = 2;
		this.gridBagConstraintsComisionLinea.ipadx = 0;
		this.gridBagConstraintsComisionLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_comisionComisionLinea.add(jButtonid_estado_comisionComisionLineaBusqueda, this.gridBagConstraintsComisionLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		//this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = 0;
		this.gridBagConstraintsComisionLinea.gridx = 3;
		this.gridBagConstraintsComisionLinea.ipadx = 0;
		this.gridBagConstraintsComisionLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_comisionComisionLinea.add(jButtonid_estado_comisionComisionLineaUpdate, this.gridBagConstraintsComisionLinea);
	}

	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 1;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_comisionComisionLinea.add(jComboBoxid_estado_comisionComisionLinea, this.gridBagConstraintsComisionLinea);


	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 0;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeComisionLinea.add(jLabelporcentajeComisionLinea, this.gridBagConstraintsComisionLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		//this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = 0;
		this.gridBagConstraintsComisionLinea.gridx = 2;
		this.gridBagConstraintsComisionLinea.ipadx = 0;
		this.gridBagConstraintsComisionLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeComisionLinea.add(jButtonporcentajeComisionLineaBusqueda, this.gridBagConstraintsComisionLinea);
	}

	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 1;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeComisionLinea.add(jTextFieldporcentajeComisionLinea, this.gridBagConstraintsComisionLinea);


	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 0;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionComisionLinea.add(jLabeldescripcionComisionLinea, this.gridBagConstraintsComisionLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		//this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = 0;
		this.gridBagConstraintsComisionLinea.gridx = 2;
		this.gridBagConstraintsComisionLinea.ipadx = 0;
		this.gridBagConstraintsComisionLinea.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionComisionLinea.add(jButtondescripcionComisionLineaBusqueda, this.gridBagConstraintsComisionLinea);
	}

	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionLinea.gridy = 0;
	this.gridBagConstraintsComisionLinea.gridx = 1;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionComisionLinea.add(jscrollPanedescripcionComisionLinea, this.gridBagConstraintsComisionLinea);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionLinea.gridy = iYPanelCamposComisionLinea;
	this.gridBagConstraintsComisionLinea.gridx = iXPanelCamposComisionLinea++;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionLinea.add(this.jPanelidComisionLinea, this.gridBagConstraintsComisionLinea);



	if(iXPanelCamposComisionLinea % 1==0) {
		iXPanelCamposComisionLinea=0;
		iYPanelCamposComisionLinea++;
	}
	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionLinea.gridy = iYPanelCamposComisionLinea;
	this.gridBagConstraintsComisionLinea.gridx = iXPanelCamposComisionLinea++;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionLinea.add(this.jPanelid_comision_configComisionLinea, this.gridBagConstraintsComisionLinea);



	if(iXPanelCamposComisionLinea % 1==0) {
		iXPanelCamposComisionLinea=0;
		iYPanelCamposComisionLinea++;
	}
	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionLinea.gridy = iYPanelCamposComisionLinea;
	this.gridBagConstraintsComisionLinea.gridx = iXPanelCamposComisionLinea++;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionLinea.add(this.jPanelid_vendedorComisionLinea, this.gridBagConstraintsComisionLinea);



	if(iXPanelCamposComisionLinea % 1==0) {
		iXPanelCamposComisionLinea=0;
		iYPanelCamposComisionLinea++;
	}
	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionLinea.gridy = iYPanelCamposComisionLinea;
	this.gridBagConstraintsComisionLinea.gridx = iXPanelCamposComisionLinea++;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionLinea.add(this.jPanelid_lineaComisionLinea, this.gridBagConstraintsComisionLinea);



	if(iXPanelCamposComisionLinea % 1==0) {
		iXPanelCamposComisionLinea=0;
		iYPanelCamposComisionLinea++;
	}
	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionLinea.gridy = iYPanelCamposComisionLinea;
	this.gridBagConstraintsComisionLinea.gridx = iXPanelCamposComisionLinea++;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionLinea.add(this.jPanelid_estado_comisionComisionLinea, this.gridBagConstraintsComisionLinea);



	if(iXPanelCamposComisionLinea % 1==0) {
		iXPanelCamposComisionLinea=0;
		iYPanelCamposComisionLinea++;
	}
	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionLinea.gridy = iYPanelCamposComisionLinea;
	this.gridBagConstraintsComisionLinea.gridx = iXPanelCamposComisionLinea++;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionLinea.add(this.jPanelporcentajeComisionLinea, this.gridBagConstraintsComisionLinea);



	if(iXPanelCamposComisionLinea % 1==0) {
		iXPanelCamposComisionLinea=0;
		iYPanelCamposComisionLinea++;
	}
	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionLinea.gridy = iYPanelCamposComisionLinea;
	this.gridBagConstraintsComisionLinea.gridx = iXPanelCamposComisionLinea++;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionLinea.add(this.jPaneldescripcionComisionLinea, this.gridBagConstraintsComisionLinea);



	if(iXPanelCamposComisionLinea % 1==0) {
		iXPanelCamposComisionLinea=0;
		iYPanelCamposComisionLinea++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionLinea.gridy = iYPanelCamposOcultosComisionLinea;
	this.gridBagConstraintsComisionLinea.gridx = iXPanelCamposOcultosComisionLinea++;
	this.gridBagConstraintsComisionLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComisionLinea.add(this.jPanelid_empresaComisionLinea, this.gridBagConstraintsComisionLinea);



	if(iXPanelCamposOcultosComisionLinea % 1==0) {
		iXPanelCamposOcultosComisionLinea=0;
		iYPanelCamposOcultosComisionLinea++;
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
			
		GridBagLayout gridaBagLayoutAccionesComisionLinea= new GridBagLayout();
		this.jPanelAccionesComisionLinea.setLayout(gridaBagLayoutAccionesComisionLinea);
		
		GridBagLayout gridaBagLayoutAccionesFormularioComisionLinea= new GridBagLayout();
		this.jPanelAccionesFormularioComisionLinea.setLayout(gridaBagLayoutAccionesFormularioComisionLinea);
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComisionLinea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComisionLinea.add(this.jComboBoxTiposAccionesFormularioComisionLinea, this.gridBagConstraintsComisionLinea);

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComisionLinea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComisionLinea.add(this.jCheckBoxPostAccionNuevoComisionLinea, this.gridBagConstraintsComisionLinea);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.comisionlineaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsComisionLinea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioComisionLinea.add(this.jCheckBoxPostAccionSinCerrarComisionLinea, this.gridBagConstraintsComisionLinea);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.comisionlineaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsComisionLinea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioComisionLinea.add(this.jCheckBoxPostAccionSinMensajeComisionLinea, this.gridBagConstraintsComisionLinea);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionLinea.gridy = 0;
		this.gridBagConstraintsComisionLinea.gridx = iPosXAccion++;
			
		this.jPanelAccionesComisionLinea.add(this.jButtonModificarComisionLinea, this.gridBagConstraintsComisionLinea);							

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionLinea.gridy = 0;
		this.gridBagConstraintsComisionLinea.gridx =iPosXAccion++;
			
		this.jPanelAccionesComisionLinea.add(this.jButtonEliminarComisionLinea, this.gridBagConstraintsComisionLinea);
		
			
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy = 0;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXAccion++;
		
		this.jPanelAccionesComisionLinea.add(this.jButtonActualizarComisionLinea, this.gridBagConstraintsComisionLinea);


		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy = 0;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXAccion++;
		
		this.jPanelAccionesComisionLinea.add(this.jButtonGuardarCambiosComisionLinea, this.gridBagConstraintsComisionLinea);	
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy = 0;		
		this.gridBagConstraintsComisionLinea.gridx =iPosXAccion++;
		
		this.jPanelAccionesComisionLinea.add(this.jButtonCancelarComisionLinea, this.gridBagConstraintsComisionLinea);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComisionLinea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComisionLinea);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comisionlineaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();						
			this.gridBagConstraintsComisionLinea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionLinea.gridx = 0;		
			//this.gridBagConstraintsComisionLinea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComisionLinea.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComisionLinea.gridx =0;
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComisionLinea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComisionLinea, this.gridBagConstraintsComisionLinea);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ComisionLineaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleComisionLinea = new ComisionLineaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Comision Linea DATOS");
			
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
			
	        //this.setTitle("[FOR] - Comision Linea DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comision Linea Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ComisionLineaModel comisionlineaModel=new ComisionLineaModel(this);
			
			//SI USARA CLASE INTERNA
			//ComisionLineaModel.ComisionLineaFocusTraversalPolicy comisionlineaFocusTraversalPolicy = comisionlineaModel.new ComisionLineaFocusTraversalPolicy(this);
			
			//comisionlineaFocusTraversalPolicy.setcomisionlineaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(comisionlineaModel);
			
			
			this.jContentPaneDetalleComisionLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleComisionLinea = new GridBagLayout();	
			this.jContentPaneDetalleComisionLinea.setLayout(gridaBagLayoutDetalleComisionLinea);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComisionLinea = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsComisionLinea = new GridBagConstraints();
				this.gridBagConstraintsComisionLinea.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsComisionLinea.gridx = 0;
					
				
				this.jContentPaneDetalleComisionLinea.add(jTtoolBarDetalleComisionLinea, gridBagConstraintsComisionLinea);								
				
}
			
			this.jScrollPanelDatosEdicionComisionLinea=   new JScrollPane(jContentPaneDetalleComisionLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComisionLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralComisionLinea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComisionLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			
			
	        this.gridBagConstraintsComisionLinea.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsComisionLinea.gridx = 0;
	        
			this.jContentPaneDetalleComisionLinea.add(jPanelCamposComisionLinea, gridBagConstraintsComisionLinea);
			
			
			
			
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
						&& comisionlineaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.comisionlineaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsComisionLinea= new GridBagConstraints();
						this.gridBagConstraintsComisionLinea.gridy = iGridyRelaciones++;
						this.gridBagConstraintsComisionLinea.gridx = 0;
						this.jContentPaneDetalleComisionLinea.add(this.jTabbedPaneRelacionesComisionLinea, this.gridBagConstraintsComisionLinea);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesComisionLinea.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosComisionLinea.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsComisionLinea = new GridBagConstraints();
					this.gridBagConstraintsComisionLinea.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsComisionLinea.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsComisionLinea.gridx = 0;
					
				
					this.jContentPaneDetalleComisionLinea.add(jPanelCamposOcultosComisionLinea, gridBagConstraintsComisionLinea);
				
					this.jPanelCamposOcultosComisionLinea.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsComisionLinea.gridx = 0;
	        this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleComisionLinea.add(this.jPanelAccionesFormularioComisionLinea, this.gridBagConstraintsComisionLinea);							
			
			
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
	        this.gridBagConstraintsComisionLinea.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsComisionLinea.gridx = 0;
	        
			
			this.jContentPaneDetalleComisionLinea.add(this.jPanelAccionesComisionLinea, this.gridBagConstraintsComisionLinea);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionComisionLinea);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionComisionLinea=   new JScrollPane(this.jPanelCamposComisionLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComisionLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsComisionLinea.gridx = 0;
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsComisionLinea.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionComisionLinea, this.gridBagConstraintsComisionLinea);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComisionLinea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioComisionLinea, this.gridBagConstraintsComisionLinea);			
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComisionLinea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesComisionLinea, this.gridBagConstraintsComisionLinea);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComisionLinea, this.gridBagConstraintsComisionLinea);
			
			
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComisionLinea, this.gridBagConstraintsComisionLinea);
		
			
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComisionLinea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComisionLinea, this.gridBagConstraintsComisionLinea);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralComisionLinea;//jContentPane;
		
		return jScrollPanelDatosEdicionComisionLinea;
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
