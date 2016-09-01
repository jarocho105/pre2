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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.NovedadConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class NovedadDetalleFormJInternalFrame extends NovedadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleNovedad;
	
	protected JMenuBar jmenuBarDetalleNovedad;
	
	protected JMenu jmenuDetalleNovedad;
	protected JMenu jmenuDetalleArchivoNovedad;
	protected JMenu jmenuDetalleAccionesNovedad;
	protected JMenu jmenuDetalleDatosNovedad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleNovedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNovedad;	
	protected GridBagConstraints gridBagConstraintsNovedad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected NovedadBeanSwingJInternalFrameAdditional jInternalFrameDetalleNovedad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public NovedadSessionBean novedadSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;	
	
	public NovedadLogic novedadLogic;
	
	public JScrollPane jScrollPanelDatosNovedad;
	public JScrollPane jScrollPanelDatosEdicionNovedad;
	public JScrollPane jScrollPanelDatosGeneralNovedad;
	
	protected JPanel jPanelCamposNovedad;    
	protected JPanel jPanelCamposOcultosNovedad;    	
	protected JPanel jPanelAccionesNovedad;
	protected JPanel jPanelAccionesFormularioNovedad;
    
	
	
	protected Integer iXPanelCamposNovedad=0;
	protected Integer iYPanelCamposNovedad=0;
	
	protected Integer iXPanelCamposOcultosNovedad=0;
	protected Integer iYPanelCamposOcultosNovedad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoNovedad;
	public JButton jButtonModificarNovedad;
	public JButton jButtonActualizarNovedad;
    public JButton jButtonEliminarNovedad;
	public JButton jButtonCancelarNovedad;
    public JButton jButtonGuardarCambiosNovedad;
	public JButton jButtonGuardarCambiosTablaNovedad;
	protected JButton jButtonCerrarNovedad;
	
	
	protected JButton jButtonProcesarInformacionNovedad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoNovedad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarNovedad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeNovedad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNovedad;
	protected JButton jButtonModificarToolBarNovedad;
	protected JButton jButtonActualizarToolBarNovedad;
    protected JButton jButtonEliminarToolBarNovedad;
	protected JButton jButtonCancelarToolBarNovedad;
    protected JButton jButtonGuardarCambiosToolBarNovedad;
	protected JButton jButtonGuardarCambiosTablaToolBarNovedad;
	protected JButton jButtonMostrarOcultarTablaToolBarNovedad;
	protected JButton jButtonCerrarToolBarNovedad;
	
	protected JButton jButtonProcesarInformacionToolBarNovedad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNovedad;
	protected JMenuItem jMenuItemModificarNovedad;
	protected JMenuItem jMenuItemActualizarNovedad;
    protected JMenuItem jMenuItemEliminarNovedad;
	protected JMenuItem jMenuItemCancelarNovedad;
    protected JMenuItem jMenuItemGuardarCambiosNovedad;
	protected JMenuItem jMenuItemGuardarCambiosTablaNovedad;
	protected JMenuItem jMenuItemCerrarNovedad;
	protected JMenuItem jMenuItemDetalleCerrarNovedad;
	protected JMenuItem jMenuItemDetalleMostarOcultarNovedad;
	
	protected JMenuItem jMenuItemProcesarInformacionNovedad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNovedad;
	protected JMenuItem jMenuItemMostrarOcultarNovedad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNovedad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNovedad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNovedad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioNovedad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidNovedad;
	public JLabel jLabelIdNovedad;
	public JLabel jLabelidNovedad;
	public JButton jButtonidNovedadBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionNovedad;
	public JLabel jLabeldescripcionNovedad;
	public JTextArea jTextAreadescripcionNovedad;
	public JScrollPane jscrollPanedescripcionNovedad;
	public JButton jButtondescripcionNovedadBusqueda= new JButtonMe();

	public JPanel jPanelaccion_tomadaNovedad;
	public JLabel jLabelaccion_tomadaNovedad;
	public JTextArea jTextAreaaccion_tomadaNovedad;
	public JScrollPane jscrollPaneaccion_tomadaNovedad;
	public JButton jButtonaccion_tomadaNovedadBusqueda= new JButtonMe();

	public JPanel jPanelfeha_atencionNovedad;
	public JLabel jLabelfeha_atencionNovedad;
	//public JFormattedTextField jDateChooserfeha_atencionNovedad;

	public JDateChooser jDateChooserfeha_atencionNovedad;
	public JButton jButtonfeha_atencionNovedadBusqueda= new JButtonMe();

	public JPanel jPanelhora_atencionNovedad;
	public JLabel jLabelhora_atencionNovedad;
	public JSpinner jSpinnerhora_atencionNovedad= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_atencionNovedadBusqueda= new JButtonMe();

	public JPanel jPanelemailNovedad;
	public JLabel jLabelemailNovedad;
	public JTextField jTextFieldemailNovedad;
	public JButton jButtonemailNovedadBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoNovedad;
	public JLabel jLabelesta_activoNovedad;
	public JCheckBox jCheckBoxesta_activoNovedad;
	public JButton jButtonesta_activoNovedadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaNovedad;
	public JLabel jLabelid_empresaNovedad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaNovedad;
	public JButton jButtonid_empresaNovedad= new JButtonMe();
	public JButton jButtonid_empresaNovedadUpdate= new JButtonMe();
	public JButton jButtonid_empresaNovedadBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalNovedad;
	public JLabel jLabelid_sucursalNovedad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalNovedad;
	public JButton jButtonid_sucursalNovedad= new JButtonMe();
	public JButton jButtonid_sucursalNovedadUpdate= new JButtonMe();
	public JButton jButtonid_sucursalNovedadBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioNovedad;
	public JLabel jLabelid_usuarioNovedad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioNovedad;
	public JButton jButtonid_usuarioNovedad= new JButtonMe();
	public JButton jButtonid_usuarioNovedadUpdate= new JButtonMe();
	public JButton jButtonid_usuarioNovedadBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteNovedad;
	public JLabel jLabelid_clienteNovedad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteNovedad;
	public JButton jButtonid_clienteNovedad= new JButtonMe();
	public JButton jButtonid_clienteNovedadUpdate= new JButtonMe();
	public JButton jButtonid_clienteNovedadBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoNovedad;
	public JLabel jLabelid_empleadoNovedad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoNovedad;
	public JButton jButtonid_empleadoNovedad= new JButtonMe();
	public JButton jButtonid_empleadoNovedadUpdate= new JButtonMe();
	public JButton jButtonid_empleadoNovedadBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesNovedad;
	
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
	public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public NovedadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposNovedad=new JPanel();
				this.jPanelAccionesFormularioNovedad=new JPanel();
				this.jmenuBarDetalleNovedad=new JMenuBar();
				this.jTtoolBarDetalleNovedad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Novedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public NovedadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Novedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Novedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Novedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Novedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarNovedad() {
		return this.jButtonActualizarToolBarNovedad;
	}
	
	public JButton getjButtonEliminarToolBarNovedad() {
		return this.jButtonEliminarToolBarNovedad;
	}
	
	public JButton getjButtonCancelarToolBarNovedad() {
		return this.jButtonCancelarToolBarNovedad;
	}		
	
	public JButton getjButtonProcesarInformacionNovedad() {
		return this.jButtonProcesarInformacionNovedad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNovedad)	{
		this.jButtonProcesarInformacionNovedad = jButtonProcesarInformacionNovedad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNovedad() {
		return this.jComboBoxTiposAccionesNovedad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNovedad(
			JComboBox jComboBoxTiposRelacionesNovedad) {
		this.jComboBoxTiposRelacionesNovedad = jComboBoxTiposRelacionesNovedad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNovedad(
			JComboBox jComboBoxTiposAccionesNovedad) {
		this.jComboBoxTiposAccionesNovedad = jComboBoxTiposAccionesNovedad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioNovedad() {
		return this.jComboBoxTiposAccionesFormularioNovedad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioNovedad(
			JComboBox jComboBoxTiposAccionesFormularioNovedad) {
		this.jComboBoxTiposAccionesFormularioNovedad = jComboBoxTiposAccionesFormularioNovedad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.novedadSessionBean=new NovedadSessionBean();
		
		this.novedadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.novedadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.novedadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NovedadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NovedadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NovedadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Novedad MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
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
	
		NovedadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNovedad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarNovedad=new JButtonMe();
				this.jButtonModificarToolBarNovedad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarNovedad,this.jTtoolBarDetalleNovedad,
							"actualizar","actualizar","Actualizar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarNovedad,this.jTtoolBarDetalleNovedad,
							"eliminar","eliminar","Eliminar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarNovedad,this.jTtoolBarDetalleNovedad,
							"cancelar","cancelar","Cancelar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarNovedad,this.jTtoolBarDetalleNovedad,
							"guardarcambios","guardarcambios","Guardar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarNovedad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarNovedad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarNovedad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleNovedad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleNovedad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoNovedad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesNovedad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosNovedad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNovedad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNovedad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNovedad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarNovedad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarNovedad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarNovedad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarNovedad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarNovedad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarNovedad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarNovedad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarNovedad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarNovedad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarNovedad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarNovedad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarNovedad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosNovedad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNovedad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNovedad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNovedad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNovedad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNovedad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarNovedad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarNovedad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarNovedad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNovedad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNovedad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNovedad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNovedad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNovedad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNovedad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoNovedad.add(this.jMenuItemDetalleCerrarNovedad);
		
		this.jmenuDetalleAccionesNovedad.add(this.jMenuItemActualizarNovedad);
		this.jmenuDetalleAccionesNovedad.add(this.jMenuItemEliminarNovedad);
		this.jmenuDetalleAccionesNovedad.add(this.jMenuItemCancelarNovedad);		
		
		//this.jmenuDetalleDatosNovedad.add(this.jMenuItemDetalleAbrirOrderByNovedad);				
		this.jmenuDetalleDatosNovedad.add(this.jMenuItemDetalleMostarOcultarNovedad);				
				
		//this.jmenuDetalleAccionesNovedad.add(this.jMenuItemGuardarCambiosNovedad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleNovedad.add(this.jmenuDetalleArchivoNovedad);		
		this.jmenuBarDetalleNovedad.add(this.jmenuDetalleAccionesNovedad);		
		this.jmenuBarDetalleNovedad.add(this.jmenuDetalleDatosNovedad);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleNovedad);				
	}
	
	
	public void inicializarElementosCamposNovedad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdNovedad = new JLabelMe();
		jLabelIdNovedad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidNovedad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidNovedad.setToolTipText(NovedadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutNovedad= new GridBagLayout();

		this.jPanelidNovedad.setLayout(this.gridaBagLayoutNovedad);

		jLabelidNovedad = new JLabel();
		jLabelidNovedad.setText("Id");

		jLabelidNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionNovedad = new JLabelMe();
		this.jLabeldescripcionNovedad.setText(""+NovedadConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionNovedad.setToolTipText("Descripcion");
		this.jLabeldescripcionNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionNovedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionNovedad.setToolTipText(NovedadConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutNovedad = new GridBagLayout();
		this.jPaneldescripcionNovedad.setLayout(this.gridaBagLayoutNovedad);


		jTextAreadescripcionNovedad= new JTextAreaMe();
		jTextAreadescripcionNovedad.setEnabled(false);
		jTextAreadescripcionNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNovedad.setLineWrap(true);
		jTextAreadescripcionNovedad.setWrapStyleWord(true);
		jTextAreadescripcionNovedad.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionNovedad.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionNovedad = new JScrollPane(jTextAreadescripcionNovedad);
		jscrollPanedescripcionNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionNovedadBusqueda= new JButtonMe();
		this.jButtondescripcionNovedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionNovedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionNovedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionNovedadBusqueda.setText("U");
		this.jButtondescripcionNovedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionNovedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionNovedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionNovedadBusqueda"));

		if(this.novedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionNovedadBusqueda.setVisible(false);		}


					
		this.jLabelaccion_tomadaNovedad = new JLabelMe();
		this.jLabelaccion_tomadaNovedad.setText(""+NovedadConstantesFunciones.LABEL_ACCIONTOMADA+" : *");
		this.jLabelaccion_tomadaNovedad.setToolTipText("Accion Tomada");
		this.jLabelaccion_tomadaNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaccion_tomadaNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaccion_tomadaNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelaccion_tomadaNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelaccion_tomadaNovedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelaccion_tomadaNovedad.setToolTipText(NovedadConstantesFunciones.LABEL_ACCIONTOMADA);
		this.gridaBagLayoutNovedad = new GridBagLayout();
		this.jPanelaccion_tomadaNovedad.setLayout(this.gridaBagLayoutNovedad);


		jTextAreaaccion_tomadaNovedad= new JTextAreaMe();
		jTextAreaaccion_tomadaNovedad.setEnabled(false);
		jTextAreaaccion_tomadaNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaaccion_tomadaNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaaccion_tomadaNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaaccion_tomadaNovedad.setLineWrap(true);
		jTextAreaaccion_tomadaNovedad.setWrapStyleWord(true);
		jTextAreaaccion_tomadaNovedad.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaaccion_tomadaNovedad.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaaccion_tomadaNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneaccion_tomadaNovedad = new JScrollPane(jTextAreaaccion_tomadaNovedad);
		jscrollPaneaccion_tomadaNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneaccion_tomadaNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneaccion_tomadaNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonaccion_tomadaNovedadBusqueda= new JButtonMe();
		this.jButtonaccion_tomadaNovedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaccion_tomadaNovedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaccion_tomadaNovedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonaccion_tomadaNovedadBusqueda.setText("U");
		this.jButtonaccion_tomadaNovedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonaccion_tomadaNovedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonaccion_tomadaNovedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaaccion_tomadaNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaaccion_tomadaNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"accion_tomadaNovedadBusqueda"));

		if(this.novedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonaccion_tomadaNovedadBusqueda.setVisible(false);		}


					
		this.jLabelfeha_atencionNovedad = new JLabelMe();
		this.jLabelfeha_atencionNovedad.setText(""+NovedadConstantesFunciones.LABEL_FEHAATENCION+" : *");
		this.jLabelfeha_atencionNovedad.setToolTipText("Feha Atencion");
		this.jLabelfeha_atencionNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfeha_atencionNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfeha_atencionNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfeha_atencionNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfeha_atencionNovedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfeha_atencionNovedad.setToolTipText(NovedadConstantesFunciones.LABEL_FEHAATENCION);
		this.gridaBagLayoutNovedad = new GridBagLayout();
		this.jPanelfeha_atencionNovedad.setLayout(this.gridaBagLayoutNovedad);


		//jFormattedTextFieldfeha_atencionNovedad= new JFormattedTextFieldMe();

		jDateChooserfeha_atencionNovedad= new JDateChooser();
		jDateChooserfeha_atencionNovedad.setEnabled(false);
		jDateChooserfeha_atencionNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfeha_atencionNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfeha_atencionNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfeha_atencionNovedad,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfeha_atencionNovedad.setDate(new Date());
		jDateChooserfeha_atencionNovedad.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfeha_atencionNovedad.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfeha_atencionNovedadBusqueda= new JButtonMe();
		this.jButtonfeha_atencionNovedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfeha_atencionNovedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfeha_atencionNovedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfeha_atencionNovedadBusqueda.setText("U");
		this.jButtonfeha_atencionNovedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfeha_atencionNovedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfeha_atencionNovedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfeha_atencionNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfeha_atencionNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"feha_atencionNovedadBusqueda"));

		if(this.novedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfeha_atencionNovedadBusqueda.setVisible(false);		}


					
		this.jLabelhora_atencionNovedad = new JLabelMe();
		this.jLabelhora_atencionNovedad.setText(""+NovedadConstantesFunciones.LABEL_HORAATENCION+" : *");
		this.jLabelhora_atencionNovedad.setToolTipText("Hora Atencion");
		this.jLabelhora_atencionNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_atencionNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_atencionNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_atencionNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_atencionNovedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_atencionNovedad.setToolTipText(NovedadConstantesFunciones.LABEL_HORAATENCION);
		this.gridaBagLayoutNovedad = new GridBagLayout();
		this.jPanelhora_atencionNovedad.setLayout(this.gridaBagLayoutNovedad);


		//jFormattedTextFieldhora_atencionNovedad= new JFormattedTextFieldMe();

		jSpinnerhora_atencionNovedad= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_atencionNovedad.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_atencionNovedad = new JSpinner.DateEditor(jSpinnerhora_atencionNovedad, "HH:mm:ss");

		jSpinnerhora_atencionNovedad.setEditor(timeEditorhora_atencionNovedad);

		jSpinnerhora_atencionNovedad.setValue(new Date());

		jSpinnerhora_atencionNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_atencionNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_atencionNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_atencionNovedad,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_atencionNovedad.setValue(new Date());
		//jSpinnerhora_atencionNovedad.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_atencionNovedad.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_atencionNovedadBusqueda= new JButtonMe();
		this.jButtonhora_atencionNovedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_atencionNovedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_atencionNovedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_atencionNovedadBusqueda.setText("U");
		this.jButtonhora_atencionNovedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_atencionNovedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_atencionNovedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_atencionNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_atencionNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_atencionNovedadBusqueda"));

		if(this.novedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_atencionNovedadBusqueda.setVisible(false);		}


					
		this.jLabelemailNovedad = new JLabelMe();
		this.jLabelemailNovedad.setText(""+NovedadConstantesFunciones.LABEL_EMAIL+" : *");
		this.jLabelemailNovedad.setToolTipText("Email");
		this.jLabelemailNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelemailNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelemailNovedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelemailNovedad.setToolTipText(NovedadConstantesFunciones.LABEL_EMAIL);
		this.gridaBagLayoutNovedad = new GridBagLayout();
		this.jPanelemailNovedad.setLayout(this.gridaBagLayoutNovedad);


		jTextFieldemailNovedad= new JTextFieldMe();

		jTextFieldemailNovedad.setEnabled(false);
		jTextFieldemailNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldemailNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldemailNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldemailNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonemailNovedadBusqueda= new JButtonMe();
		this.jButtonemailNovedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailNovedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailNovedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonemailNovedadBusqueda.setText("U");
		this.jButtonemailNovedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonemailNovedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonemailNovedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldemailNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldemailNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"emailNovedadBusqueda"));

		if(this.novedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonemailNovedadBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoNovedad = new JLabelMe();
		this.jLabelesta_activoNovedad.setText(""+NovedadConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoNovedad.setToolTipText("Esta Activo");
		this.jLabelesta_activoNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoNovedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoNovedad.setToolTipText(NovedadConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutNovedad = new GridBagLayout();
		this.jPanelesta_activoNovedad.setLayout(this.gridaBagLayoutNovedad);


		jCheckBoxesta_activoNovedad= new JCheckBoxMe();
		jCheckBoxesta_activoNovedad.setEnabled(false);

		jCheckBoxesta_activoNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoNovedadBusqueda= new JButtonMe();
		this.jButtonesta_activoNovedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoNovedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoNovedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoNovedadBusqueda.setText("U");
		this.jButtonesta_activoNovedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoNovedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoNovedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoNovedadBusqueda"));

		if(this.novedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoNovedadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysNovedad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaNovedad = new JLabelMe();
		this.jLabelid_empresaNovedad.setText(""+NovedadConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaNovedad.setToolTipText("Empresa");
		this.jLabelid_empresaNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaNovedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaNovedad.setToolTipText(NovedadConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutNovedad = new GridBagLayout();
		this.jPanelid_empresaNovedad.setLayout(this.gridaBagLayoutNovedad);


		jComboBoxid_empresaNovedad= new JComboBoxMe();
		jComboBoxid_empresaNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaNovedad,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaNovedad.setEnabled(false);

		this.jButtonid_empresaNovedad= new JButtonMe();
		this.jButtonid_empresaNovedad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNovedad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNovedad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNovedad.setText("Buscar");
		this.jButtonid_empresaNovedad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaNovedad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNovedad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNovedad"));

		this.jButtonid_empresaNovedadBusqueda= new JButtonMe();
		this.jButtonid_empresaNovedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNovedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNovedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNovedadBusqueda.setText("U");
		this.jButtonid_empresaNovedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaNovedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNovedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNovedadBusqueda"));

		if(this.novedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaNovedadBusqueda.setVisible(false);		}

		this.jButtonid_empresaNovedadUpdate= new JButtonMe();
		this.jButtonid_empresaNovedadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNovedadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNovedadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNovedadUpdate.setText("U");
		this.jButtonid_empresaNovedadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaNovedadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNovedadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNovedadUpdate"));



					
		this.jLabelid_sucursalNovedad = new JLabelMe();
		this.jLabelid_sucursalNovedad.setText(""+NovedadConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalNovedad.setToolTipText("Sucursal");
		this.jLabelid_sucursalNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalNovedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalNovedad.setToolTipText(NovedadConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutNovedad = new GridBagLayout();
		this.jPanelid_sucursalNovedad.setLayout(this.gridaBagLayoutNovedad);


		jComboBoxid_sucursalNovedad= new JComboBoxMe();
		jComboBoxid_sucursalNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalNovedad,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalNovedad.setEnabled(false);

		this.jButtonid_sucursalNovedad= new JButtonMe();
		this.jButtonid_sucursalNovedad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNovedad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNovedad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNovedad.setText("Buscar");
		this.jButtonid_sucursalNovedad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalNovedad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNovedad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNovedad"));

		this.jButtonid_sucursalNovedadBusqueda= new JButtonMe();
		this.jButtonid_sucursalNovedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNovedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNovedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalNovedadBusqueda.setText("U");
		this.jButtonid_sucursalNovedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalNovedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNovedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNovedadBusqueda"));

		if(this.novedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalNovedadBusqueda.setVisible(false);		}

		this.jButtonid_sucursalNovedadUpdate= new JButtonMe();
		this.jButtonid_sucursalNovedadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNovedadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNovedadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalNovedadUpdate.setText("U");
		this.jButtonid_sucursalNovedadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalNovedadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNovedadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNovedadUpdate"));



					
		this.jLabelid_usuarioNovedad = new JLabelMe();
		this.jLabelid_usuarioNovedad.setText(""+NovedadConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioNovedad.setToolTipText("Usuario");
		this.jLabelid_usuarioNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioNovedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioNovedad.setToolTipText(NovedadConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutNovedad = new GridBagLayout();
		this.jPanelid_usuarioNovedad.setLayout(this.gridaBagLayoutNovedad);


		jComboBoxid_usuarioNovedad= new JComboBoxMe();
		jComboBoxid_usuarioNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioNovedad,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioNovedad.setEnabled(false);

		this.jButtonid_usuarioNovedad= new JButtonMe();
		this.jButtonid_usuarioNovedad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioNovedad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioNovedad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioNovedad.setText("Buscar");
		this.jButtonid_usuarioNovedad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioNovedad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioNovedad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioNovedad"));

		this.jButtonid_usuarioNovedadBusqueda= new JButtonMe();
		this.jButtonid_usuarioNovedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioNovedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioNovedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioNovedadBusqueda.setText("U");
		this.jButtonid_usuarioNovedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioNovedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioNovedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioNovedadBusqueda"));

		if(this.novedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioNovedadBusqueda.setVisible(false);		}

		this.jButtonid_usuarioNovedadUpdate= new JButtonMe();
		this.jButtonid_usuarioNovedadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioNovedadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioNovedadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioNovedadUpdate.setText("U");
		this.jButtonid_usuarioNovedadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioNovedadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioNovedadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioNovedadUpdate"));



					
		this.jLabelid_clienteNovedad = new JLabelMe();
		this.jLabelid_clienteNovedad.setText(""+NovedadConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteNovedad.setToolTipText("Cliente");
		this.jLabelid_clienteNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteNovedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteNovedad.setToolTipText(NovedadConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutNovedad = new GridBagLayout();
		this.jPanelid_clienteNovedad.setLayout(this.gridaBagLayoutNovedad);


		jComboBoxid_clienteNovedad= new JComboBoxMe();
		jComboBoxid_clienteNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteNovedad= new JButtonMe();
		this.jButtonid_clienteNovedad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteNovedad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteNovedad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteNovedad.setText("Buscar");
		this.jButtonid_clienteNovedad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteNovedad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteNovedad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteNovedad"));

		this.jButtonid_clienteNovedadBusqueda= new JButtonMe();
		this.jButtonid_clienteNovedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNovedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNovedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteNovedadBusqueda.setText("U");
		this.jButtonid_clienteNovedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteNovedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteNovedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteNovedadBusqueda"));

		if(this.novedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteNovedadBusqueda.setVisible(false);		}

		this.jButtonid_clienteNovedadUpdate= new JButtonMe();
		this.jButtonid_clienteNovedadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNovedadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNovedadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteNovedadUpdate.setText("U");
		this.jButtonid_clienteNovedadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteNovedadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteNovedadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteNovedadUpdate"));



					
		this.jLabelid_empleadoNovedad = new JLabelMe();
		this.jLabelid_empleadoNovedad.setText(""+NovedadConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoNovedad.setToolTipText("Responsable");
		this.jLabelid_empleadoNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoNovedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoNovedad.setToolTipText(NovedadConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutNovedad = new GridBagLayout();
		this.jPanelid_empleadoNovedad.setLayout(this.gridaBagLayoutNovedad);


		jComboBoxid_empleadoNovedad= new JComboBoxMe();
		jComboBoxid_empleadoNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoNovedad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoNovedad= new JButtonMe();
		this.jButtonid_empleadoNovedad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoNovedad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoNovedad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoNovedad.setText("Buscar");
		this.jButtonid_empleadoNovedad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoNovedad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoNovedad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoNovedad"));

		this.jButtonid_empleadoNovedadBusqueda= new JButtonMe();
		this.jButtonid_empleadoNovedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoNovedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoNovedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoNovedadBusqueda.setText("U");
		this.jButtonid_empleadoNovedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoNovedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoNovedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoNovedadBusqueda"));

		if(this.novedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoNovedadBusqueda.setVisible(false);		}

		this.jButtonid_empleadoNovedadUpdate= new JButtonMe();
		this.jButtonid_empleadoNovedadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoNovedadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoNovedadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoNovedadUpdate.setText("U");
		this.jButtonid_empleadoNovedadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoNovedadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoNovedadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoNovedadUpdate"));



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
		//this.jInternalFrameDetalleNovedad = new NovedadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Novedad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNovedad= new GridBagLayout();
		

		
		String sToolTipNovedad="";
		sToolTipNovedad=NovedadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNovedad+="(Cartera.Novedad)";
		}
		
		if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
			sToolTipNovedad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoNovedad = new JButtonMe();
		this.jButtonModificarNovedad = new JButtonMe();
        this.jButtonActualizarNovedad = new JButtonMe();
        this.jButtonEliminarNovedad = new JButtonMe();
        this.jButtonCancelarNovedad = new JButtonMe();
        this.jButtonGuardarCambiosNovedad = new JButtonMe();
		this.jButtonGuardarCambiosTablaNovedad = new JButtonMe();
		this.jButtonCerrarNovedad = new JButtonMe();
		
		this.jScrollPanelDatosNovedad = new JScrollPane();   
        this.jScrollPanelDatosEdicionNovedad = new JScrollPane();
		this.jScrollPanelDatosGeneralNovedad = new JScrollPane();
				
		
		
		this.jPanelCamposNovedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosNovedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesNovedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioNovedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Novedad";
		
		if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedades" + this.sPath));
		} else {
			this.jScrollPanelDatosNovedad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposNovedad.setName("jPanelCamposNovedad"); 

		this.jPanelCamposOcultosNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosNovedad.setName("jPanelCamposOcultosNovedad"); 

        this.jPanelAccionesNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNovedad.setToolTipText("Acciones");
        this.jPanelAccionesNovedad.setName("Acciones"); 

		this.jPanelAccionesFormularioNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioNovedad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioNovedad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionNovedad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNovedad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNovedad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposNovedad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosNovedad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioNovedad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoNovedad.setText("Nuevo");
		this.jButtonModificarNovedad.setText("Editar");
        this.jButtonActualizarNovedad.setText("Actualizar");
        this.jButtonEliminarNovedad.setText("Eliminar");
        this.jButtonCancelarNovedad.setText("Cancelar");
        this.jButtonGuardarCambiosNovedad.setText("Guardar");
		this.jButtonGuardarCambiosTablaNovedad.setText("Guardar");
		this.jButtonCerrarNovedad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNovedad,"nuevo_button","Nuevo",this.novedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarNovedad,"modificar_button","Editar",this.novedadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarNovedad,"actualizar_button","Actualizar",this.novedadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarNovedad,"eliminar_button","Eliminar",this.novedadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarNovedad,"cancelar_button","Cancelar",this.novedadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosNovedad,"guardarcambios_button","Guardar",this.novedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNovedad,"guardarcambiostabla_button","Guardar",this.novedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNovedad,"cerrar_button","Salir",this.novedadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarNovedad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarNovedad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarNovedad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoNovedad.setToolTipText("Nuevo"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarNovedad.setToolTipText("Editar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarNovedad.setToolTipText("Actualizar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarNovedad.setToolTipText("Eliminar)"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarNovedad.setToolTipText("Cancelar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosNovedad.setToolTipText("Guardar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaNovedad.setToolTipText("Guardar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNovedad.setToolTipText("Salir"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNovedad";
		inputMap = this.jButtonNuevoNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNovedad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNovedad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarNovedad";
		inputMap = this.jButtonActualizarNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarNovedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarNovedad"));
		
		//ELIMINAR
		sMapKey = "EliminarNovedad";
		inputMap = this.jButtonEliminarNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarNovedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarNovedad"));
		
		//CANCELAR	
		sMapKey = "CancelarNovedad";
		inputMap = this.jButtonCancelarNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarNovedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarNovedad"));
		
		//CERRAR		
		sMapKey = "CerrarNovedad";
		inputMap = this.jButtonCerrarNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNovedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNovedad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNovedad";
		inputMap = this.jButtonGuardarCambiosTablaNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNovedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNovedad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoNovedad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoNovedad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoNovedad.setToolTipText("Nuevo Novedad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoNovedad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarNovedad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarNovedad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarNovedad.setToolTipText("Sin Cerrar Ventana Novedad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarNovedad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeNovedad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeNovedad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeNovedad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeNovedad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesNovedad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNovedad.setText("Accion");
		this.jComboBoxTiposAccionesNovedad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioNovedad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioNovedad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioNovedad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesNovedad = new JLabelMe();
		
		this.jLabelAccionesNovedad.setText("Acciones");		
		this.jLabelAccionesNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposNovedad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysNovedad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesNovedad=new JTabbedPane();
		this.jTabbedPaneRelacionesNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesNovedad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesNovedad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNovedad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNovedad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioNovedad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNovedad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNovedad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioNovedad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposNovedad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosNovedad = new GridBagLayout();
		
		this.jPanelCamposNovedad.setLayout(gridaBagLayoutCamposNovedad);
		this.jPanelCamposOcultosNovedad.setLayout(gridaBagLayoutCamposOcultosNovedad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 0;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidNovedad.add(jLabelIdNovedad, this.gridBagConstraintsNovedad);



	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 1;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidNovedad.add(jLabelidNovedad, this.gridBagConstraintsNovedad);


	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 0;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaNovedad.add(jLabelid_empresaNovedad, this.gridBagConstraintsNovedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 2;
		this.gridBagConstraintsNovedad.ipadx = 0;
		this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNovedad.add(jButtonid_empresaNovedadBusqueda, this.gridBagConstraintsNovedad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 3;
		this.gridBagConstraintsNovedad.ipadx = 0;
		this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNovedad.add(jButtonid_empresaNovedadUpdate, this.gridBagConstraintsNovedad);
	}

	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 1;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaNovedad.add(jComboBoxid_empresaNovedad, this.gridBagConstraintsNovedad);


	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 0;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalNovedad.add(jLabelid_sucursalNovedad, this.gridBagConstraintsNovedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 2;
		this.gridBagConstraintsNovedad.ipadx = 0;
		this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalNovedad.add(jButtonid_sucursalNovedadBusqueda, this.gridBagConstraintsNovedad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 3;
		this.gridBagConstraintsNovedad.ipadx = 0;
		this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalNovedad.add(jButtonid_sucursalNovedadUpdate, this.gridBagConstraintsNovedad);
	}

	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 1;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalNovedad.add(jComboBoxid_sucursalNovedad, this.gridBagConstraintsNovedad);


	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 0;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioNovedad.add(jLabelid_usuarioNovedad, this.gridBagConstraintsNovedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 2;
		this.gridBagConstraintsNovedad.ipadx = 0;
		this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioNovedad.add(jButtonid_usuarioNovedadBusqueda, this.gridBagConstraintsNovedad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 3;
		this.gridBagConstraintsNovedad.ipadx = 0;
		this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioNovedad.add(jButtonid_usuarioNovedadUpdate, this.gridBagConstraintsNovedad);
	}

	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 1;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioNovedad.add(jComboBoxid_usuarioNovedad, this.gridBagConstraintsNovedad);


	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 0;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteNovedad.add(jLabelid_clienteNovedad, this.gridBagConstraintsNovedad);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNovedad = new GridBagConstraints();
	//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 2;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteNovedad.add(jButtonid_clienteNovedad, this.gridBagConstraintsNovedad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 3;
		this.gridBagConstraintsNovedad.ipadx = 0;
		this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteNovedad.add(jButtonid_clienteNovedadBusqueda, this.gridBagConstraintsNovedad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 4;
		this.gridBagConstraintsNovedad.ipadx = 0;
		this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteNovedad.add(jButtonid_clienteNovedadUpdate, this.gridBagConstraintsNovedad);
	}

	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 1;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteNovedad.add(jComboBoxid_clienteNovedad, this.gridBagConstraintsNovedad);


	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 0;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionNovedad.add(jLabeldescripcionNovedad, this.gridBagConstraintsNovedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 2;
		this.gridBagConstraintsNovedad.ipadx = 0;
		this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionNovedad.add(jButtondescripcionNovedadBusqueda, this.gridBagConstraintsNovedad);
	}

	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 1;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionNovedad.add(jscrollPanedescripcionNovedad, this.gridBagConstraintsNovedad);


	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 0;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelaccion_tomadaNovedad.add(jLabelaccion_tomadaNovedad, this.gridBagConstraintsNovedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 2;
		this.gridBagConstraintsNovedad.ipadx = 0;
		this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelaccion_tomadaNovedad.add(jButtonaccion_tomadaNovedadBusqueda, this.gridBagConstraintsNovedad);
	}

	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 1;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelaccion_tomadaNovedad.add(jscrollPaneaccion_tomadaNovedad, this.gridBagConstraintsNovedad);


	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 0;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfeha_atencionNovedad.add(jLabelfeha_atencionNovedad, this.gridBagConstraintsNovedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 2;
		this.gridBagConstraintsNovedad.ipadx = 0;
		this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelfeha_atencionNovedad.add(jButtonfeha_atencionNovedadBusqueda, this.gridBagConstraintsNovedad);
	}

	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 1;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfeha_atencionNovedad.add(jDateChooserfeha_atencionNovedad, this.gridBagConstraintsNovedad);


	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 0;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_atencionNovedad.add(jLabelhora_atencionNovedad, this.gridBagConstraintsNovedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 2;
		this.gridBagConstraintsNovedad.ipadx = 0;
		this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_atencionNovedad.add(jButtonhora_atencionNovedadBusqueda, this.gridBagConstraintsNovedad);
	}

	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 1;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_atencionNovedad.add(jSpinnerhora_atencionNovedad, this.gridBagConstraintsNovedad);


	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 0;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoNovedad.add(jLabelid_empleadoNovedad, this.gridBagConstraintsNovedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 2;
		this.gridBagConstraintsNovedad.ipadx = 0;
		this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoNovedad.add(jButtonid_empleadoNovedadBusqueda, this.gridBagConstraintsNovedad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 3;
		this.gridBagConstraintsNovedad.ipadx = 0;
		this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoNovedad.add(jButtonid_empleadoNovedadUpdate, this.gridBagConstraintsNovedad);
	}

	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 1;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoNovedad.add(jComboBoxid_empleadoNovedad, this.gridBagConstraintsNovedad);


	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 0;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelemailNovedad.add(jLabelemailNovedad, this.gridBagConstraintsNovedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 2;
		this.gridBagConstraintsNovedad.ipadx = 0;
		this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelemailNovedad.add(jButtonemailNovedadBusqueda, this.gridBagConstraintsNovedad);
	}

	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 1;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelemailNovedad.add(jTextFieldemailNovedad, this.gridBagConstraintsNovedad);


	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 0;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoNovedad.add(jLabelesta_activoNovedad, this.gridBagConstraintsNovedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 2;
		this.gridBagConstraintsNovedad.ipadx = 0;
		this.gridBagConstraintsNovedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoNovedad.add(jButtonesta_activoNovedadBusqueda, this.gridBagConstraintsNovedad);
	}

	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedad.gridy = 0;
	this.gridBagConstraintsNovedad.gridx = 1;
	this.gridBagConstraintsNovedad.ipadx = 0;
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoNovedad.add(jCheckBoxesta_activoNovedad, this.gridBagConstraintsNovedad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedad.gridy = iYPanelCamposNovedad;
	this.gridBagConstraintsNovedad.gridx = iXPanelCamposNovedad++;
	this.gridBagConstraintsNovedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedad.add(this.jPanelidNovedad, this.gridBagConstraintsNovedad);



	if(iXPanelCamposNovedad % 1==0) {
		iXPanelCamposNovedad=0;
		iYPanelCamposNovedad++;
	}
	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedad.gridy = iYPanelCamposNovedad;
	this.gridBagConstraintsNovedad.gridx = iXPanelCamposNovedad++;
	this.gridBagConstraintsNovedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedad.add(this.jPanelid_clienteNovedad, this.gridBagConstraintsNovedad);



	if(iXPanelCamposNovedad % 1==0) {
		iXPanelCamposNovedad=0;
		iYPanelCamposNovedad++;
	}
	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedad.gridy = iYPanelCamposNovedad;
	this.gridBagConstraintsNovedad.gridx = iXPanelCamposNovedad++;
	this.gridBagConstraintsNovedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedad.add(this.jPaneldescripcionNovedad, this.gridBagConstraintsNovedad);



	if(iXPanelCamposNovedad % 1==0) {
		iXPanelCamposNovedad=0;
		iYPanelCamposNovedad++;
	}
	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedad.gridy = iYPanelCamposNovedad;
	this.gridBagConstraintsNovedad.gridx = iXPanelCamposNovedad++;
	this.gridBagConstraintsNovedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedad.add(this.jPanelaccion_tomadaNovedad, this.gridBagConstraintsNovedad);



	if(iXPanelCamposNovedad % 1==0) {
		iXPanelCamposNovedad=0;
		iYPanelCamposNovedad++;
	}
	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedad.gridy = iYPanelCamposNovedad;
	this.gridBagConstraintsNovedad.gridx = iXPanelCamposNovedad++;
	this.gridBagConstraintsNovedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedad.add(this.jPanelfeha_atencionNovedad, this.gridBagConstraintsNovedad);



	if(iXPanelCamposNovedad % 1==0) {
		iXPanelCamposNovedad=0;
		iYPanelCamposNovedad++;
	}
	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedad.gridy = iYPanelCamposNovedad;
	this.gridBagConstraintsNovedad.gridx = iXPanelCamposNovedad++;
	this.gridBagConstraintsNovedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedad.add(this.jPanelhora_atencionNovedad, this.gridBagConstraintsNovedad);



	if(iXPanelCamposNovedad % 1==0) {
		iXPanelCamposNovedad=0;
		iYPanelCamposNovedad++;
	}
	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedad.gridy = iYPanelCamposNovedad;
	this.gridBagConstraintsNovedad.gridx = iXPanelCamposNovedad++;
	this.gridBagConstraintsNovedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedad.add(this.jPanelid_empleadoNovedad, this.gridBagConstraintsNovedad);



	if(iXPanelCamposNovedad % 1==0) {
		iXPanelCamposNovedad=0;
		iYPanelCamposNovedad++;
	}
	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedad.gridy = iYPanelCamposNovedad;
	this.gridBagConstraintsNovedad.gridx = iXPanelCamposNovedad++;
	this.gridBagConstraintsNovedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedad.add(this.jPanelemailNovedad, this.gridBagConstraintsNovedad);



	if(iXPanelCamposNovedad % 1==0) {
		iXPanelCamposNovedad=0;
		iYPanelCamposNovedad++;
	}
	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedad.gridy = iYPanelCamposNovedad;
	this.gridBagConstraintsNovedad.gridx = iXPanelCamposNovedad++;
	this.gridBagConstraintsNovedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedad.add(this.jPanelesta_activoNovedad, this.gridBagConstraintsNovedad);



	if(iXPanelCamposNovedad % 1==0) {
		iXPanelCamposNovedad=0;
		iYPanelCamposNovedad++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedad.gridy = iYPanelCamposOcultosNovedad;
	this.gridBagConstraintsNovedad.gridx = iXPanelCamposOcultosNovedad++;
	this.gridBagConstraintsNovedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNovedad.add(this.jPanelid_empresaNovedad, this.gridBagConstraintsNovedad);



	if(iXPanelCamposOcultosNovedad % 1==0) {
		iXPanelCamposOcultosNovedad=0;
		iYPanelCamposOcultosNovedad++;
	}
	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedad.gridy = iYPanelCamposOcultosNovedad;
	this.gridBagConstraintsNovedad.gridx = iXPanelCamposOcultosNovedad++;
	this.gridBagConstraintsNovedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNovedad.add(this.jPanelid_sucursalNovedad, this.gridBagConstraintsNovedad);



	if(iXPanelCamposOcultosNovedad % 1==0) {
		iXPanelCamposOcultosNovedad=0;
		iYPanelCamposOcultosNovedad++;
	}
	this.gridBagConstraintsNovedad = new GridBagConstraints();
	this.gridBagConstraintsNovedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedad.gridy = iYPanelCamposOcultosNovedad;
	this.gridBagConstraintsNovedad.gridx = iXPanelCamposOcultosNovedad++;
	this.gridBagConstraintsNovedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNovedad.add(this.jPanelid_usuarioNovedad, this.gridBagConstraintsNovedad);



	if(iXPanelCamposOcultosNovedad % 1==0) {
		iXPanelCamposOcultosNovedad=0;
		iYPanelCamposOcultosNovedad++;
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
			
		GridBagLayout gridaBagLayoutAccionesNovedad= new GridBagLayout();
		this.jPanelAccionesNovedad.setLayout(gridaBagLayoutAccionesNovedad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioNovedad= new GridBagLayout();
		this.jPanelAccionesFormularioNovedad.setLayout(gridaBagLayoutAccionesFormularioNovedad);
		
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNovedad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNovedad.add(this.jComboBoxTiposAccionesFormularioNovedad, this.gridBagConstraintsNovedad);

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNovedad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNovedad.add(this.jCheckBoxPostAccionNuevoNovedad, this.gridBagConstraintsNovedad);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.novedadSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNovedad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNovedad.add(this.jCheckBoxPostAccionSinCerrarNovedad, this.gridBagConstraintsNovedad);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.novedadSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.novedadSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNovedad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNovedad.add(this.jCheckBoxPostAccionSinMensajeNovedad, this.gridBagConstraintsNovedad);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = iPosXAccion++;
			
		this.jPanelAccionesNovedad.add(this.jButtonModificarNovedad, this.gridBagConstraintsNovedad);							

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx =iPosXAccion++;
			
		this.jPanelAccionesNovedad.add(this.jButtonEliminarNovedad, this.gridBagConstraintsNovedad);
		
			
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy = 0;		
		this.gridBagConstraintsNovedad.gridx = iPosXAccion++;
		
		this.jPanelAccionesNovedad.add(this.jButtonActualizarNovedad, this.gridBagConstraintsNovedad);


		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy = 0;		
		this.gridBagConstraintsNovedad.gridx = iPosXAccion++;
		
		this.jPanelAccionesNovedad.add(this.jButtonGuardarCambiosNovedad, this.gridBagConstraintsNovedad);	
		
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy = 0;		
		this.gridBagConstraintsNovedad.gridx =iPosXAccion++;
		
		this.jPanelAccionesNovedad.add(this.jButtonCancelarNovedad, this.gridBagConstraintsNovedad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNovedad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNovedad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.novedadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNovedad = new GridBagConstraints();						
			this.gridBagConstraintsNovedad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNovedad.gridx = 0;		
			//this.gridBagConstraintsNovedad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNovedad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNovedad.gridx =0;
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNovedad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNovedad, this.gridBagConstraintsNovedad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(NovedadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleNovedad = new NovedadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Novedad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Novedad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Novedad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			NovedadModel novedadModel=new NovedadModel(this);
			
			//SI USARA CLASE INTERNA
			//NovedadModel.NovedadFocusTraversalPolicy novedadFocusTraversalPolicy = novedadModel.new NovedadFocusTraversalPolicy(this);
			
			//novedadFocusTraversalPolicy.setnovedadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(novedadModel);
			
			
			this.jContentPaneDetalleNovedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleNovedad = new GridBagLayout();	
			this.jContentPaneDetalleNovedad.setLayout(gridaBagLayoutDetalleNovedad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNovedad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsNovedad = new GridBagConstraints();
				this.gridBagConstraintsNovedad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsNovedad.gridx = 0;
					
				
				this.jContentPaneDetalleNovedad.add(jTtoolBarDetalleNovedad, gridBagConstraintsNovedad);								
				
}
			
			this.jScrollPanelDatosEdicionNovedad=   new JScrollPane(jContentPaneDetalleNovedad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNovedad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNovedad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNovedad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralNovedad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNovedad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNovedad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNovedad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsNovedad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsNovedad.gridx = 0;
	        
			this.jContentPaneDetalleNovedad.add(jPanelCamposNovedad, gridBagConstraintsNovedad);
			
			
			
			
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
						&& novedadSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.novedadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsNovedad= new GridBagConstraints();
						this.gridBagConstraintsNovedad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsNovedad.gridx = 0;
						this.jContentPaneDetalleNovedad.add(this.jTabbedPaneRelacionesNovedad, this.gridBagConstraintsNovedad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNovedad.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosNovedad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsNovedad = new GridBagConstraints();
					this.gridBagConstraintsNovedad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsNovedad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsNovedad.gridx = 0;
					
				
					this.jContentPaneDetalleNovedad.add(jPanelCamposOcultosNovedad, gridBagConstraintsNovedad);
				
					this.jPanelCamposOcultosNovedad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsNovedad.gridx = 0;
	        this.gridBagConstraintsNovedad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleNovedad.add(this.jPanelAccionesFormularioNovedad, this.gridBagConstraintsNovedad);							
			
			
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
	        this.gridBagConstraintsNovedad.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsNovedad.gridx = 0;
	        
			
			this.jContentPaneDetalleNovedad.add(this.jPanelAccionesNovedad, this.gridBagConstraintsNovedad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionNovedad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionNovedad=   new JScrollPane(this.jPanelCamposNovedad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNovedad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNovedad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNovedad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsNovedad.gridx = 0;
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsNovedad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionNovedad, this.gridBagConstraintsNovedad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNovedad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioNovedad, this.gridBagConstraintsNovedad);			
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNovedad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesNovedad, this.gridBagConstraintsNovedad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNovedad, this.gridBagConstraintsNovedad);
			
			
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNovedad, this.gridBagConstraintsNovedad);
		
			
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNovedad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNovedad, this.gridBagConstraintsNovedad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralNovedad;//jContentPane;
		
		return jScrollPanelDatosEdicionNovedad;
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
