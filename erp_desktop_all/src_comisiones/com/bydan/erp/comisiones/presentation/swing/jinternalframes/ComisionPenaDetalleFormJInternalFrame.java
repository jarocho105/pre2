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

import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.comisiones.util.ComisionPenaConstantesFunciones;

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
public class ComisionPenaDetalleFormJInternalFrame extends ComisionPenaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleComisionPena;
	
	protected JMenuBar jmenuBarDetalleComisionPena;
	
	protected JMenu jmenuDetalleComisionPena;
	protected JMenu jmenuDetalleArchivoComisionPena;
	protected JMenu jmenuDetalleAccionesComisionPena;
	protected JMenu jmenuDetalleDatosComisionPena;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleComisionPena = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComisionPena;	
	protected GridBagConstraints gridBagConstraintsComisionPena;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ComisionPenaBeanSwingJInternalFrameAdditional jInternalFrameDetalleComisionPena;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_comisionconfig="";
	
	public ComisionPenaSessionBean comisionpenaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ComisionConfigSessionBean comisionconfigSessionBean;	
	
	public ComisionPenaLogic comisionpenaLogic;
	
	public JScrollPane jScrollPanelDatosComisionPena;
	public JScrollPane jScrollPanelDatosEdicionComisionPena;
	public JScrollPane jScrollPanelDatosGeneralComisionPena;
	
	protected JPanel jPanelCamposComisionPena;    
	protected JPanel jPanelCamposOcultosComisionPena;    	
	protected JPanel jPanelAccionesComisionPena;
	protected JPanel jPanelAccionesFormularioComisionPena;
    
	
	
	protected Integer iXPanelCamposComisionPena=0;
	protected Integer iYPanelCamposComisionPena=0;
	
	protected Integer iXPanelCamposOcultosComisionPena=0;
	protected Integer iYPanelCamposOcultosComisionPena=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoComisionPena;
	public JButton jButtonModificarComisionPena;
	public JButton jButtonActualizarComisionPena;
    public JButton jButtonEliminarComisionPena;
	public JButton jButtonCancelarComisionPena;
    public JButton jButtonGuardarCambiosComisionPena;
	public JButton jButtonGuardarCambiosTablaComisionPena;
	protected JButton jButtonCerrarComisionPena;
	
	
	protected JButton jButtonProcesarInformacionComisionPena;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoComisionPena;
	protected JCheckBox jCheckBoxPostAccionSinCerrarComisionPena;
	protected JCheckBox jCheckBoxPostAccionSinMensajeComisionPena;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComisionPena;
	protected JButton jButtonModificarToolBarComisionPena;
	protected JButton jButtonActualizarToolBarComisionPena;
    protected JButton jButtonEliminarToolBarComisionPena;
	protected JButton jButtonCancelarToolBarComisionPena;
    protected JButton jButtonGuardarCambiosToolBarComisionPena;
	protected JButton jButtonGuardarCambiosTablaToolBarComisionPena;
	protected JButton jButtonMostrarOcultarTablaToolBarComisionPena;
	protected JButton jButtonCerrarToolBarComisionPena;
	
	protected JButton jButtonProcesarInformacionToolBarComisionPena;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComisionPena;
	protected JMenuItem jMenuItemModificarComisionPena;
	protected JMenuItem jMenuItemActualizarComisionPena;
    protected JMenuItem jMenuItemEliminarComisionPena;
	protected JMenuItem jMenuItemCancelarComisionPena;
    protected JMenuItem jMenuItemGuardarCambiosComisionPena;
	protected JMenuItem jMenuItemGuardarCambiosTablaComisionPena;
	protected JMenuItem jMenuItemCerrarComisionPena;
	protected JMenuItem jMenuItemDetalleCerrarComisionPena;
	protected JMenuItem jMenuItemDetalleMostarOcultarComisionPena;
	
	protected JMenuItem jMenuItemProcesarInformacionComisionPena;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComisionPena;
	protected JMenuItem jMenuItemMostrarOcultarComisionPena;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComisionPena;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComisionPena;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComisionPena;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioComisionPena;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidComisionPena;
	public JLabel jLabelIdComisionPena;
	public JLabel jLabelidComisionPena;
	public JButton jButtonidComisionPenaBusqueda= new JButtonMe();

	public JPanel jPanelnum_dias_inicioComisionPena;
	public JLabel jLabelnum_dias_inicioComisionPena;
	public JTextField jTextFieldnum_dias_inicioComisionPena;
	public JButton jButtonnum_dias_inicioComisionPenaBusqueda= new JButtonMe();

	public JPanel jPanelnum_dias_finComisionPena;
	public JLabel jLabelnum_dias_finComisionPena;
	public JTextField jTextFieldnum_dias_finComisionPena;
	public JButton jButtonnum_dias_finComisionPenaBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeComisionPena;
	public JLabel jLabelporcentajeComisionPena;
	public JTextField jTextFieldporcentajeComisionPena;
	public JButton jButtonporcentajeComisionPenaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionComisionPena;
	public JLabel jLabeldescripcionComisionPena;
	public JTextArea jTextAreadescripcionComisionPena;
	public JScrollPane jscrollPanedescripcionComisionPena;
	public JButton jButtondescripcionComisionPenaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaComisionPena;
	public JLabel jLabelid_empresaComisionPena;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaComisionPena;
	public JButton jButtonid_empresaComisionPena= new JButtonMe();
	public JButton jButtonid_empresaComisionPenaUpdate= new JButtonMe();
	public JButton jButtonid_empresaComisionPenaBusqueda= new JButtonMe();

	public JPanel jPanelid_comision_configComisionPena;
	public JLabel jLabelid_comision_configComisionPena;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_comision_configComisionPena;
	public JButton jButtonid_comision_configComisionPena= new JButtonMe();
	public JButton jButtonid_comision_configComisionPenaUpdate= new JButtonMe();
	public JButton jButtonid_comision_configComisionPenaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesComisionPena;
	
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
	
	public ComisionPenaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposComisionPena=new JPanel();
				this.jPanelAccionesFormularioComisionPena=new JPanel();
				this.jmenuBarDetalleComisionPena=new JMenuBar();
				this.jTtoolBarDetalleComisionPena=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionPenaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ComisionPena No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ComisionPenaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ComisionPena No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionPenaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionPena No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionPenaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionPena No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionPenaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComisionPena No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarComisionPena() {
		return this.jButtonActualizarToolBarComisionPena;
	}
	
	public JButton getjButtonEliminarToolBarComisionPena() {
		return this.jButtonEliminarToolBarComisionPena;
	}
	
	public JButton getjButtonCancelarToolBarComisionPena() {
		return this.jButtonCancelarToolBarComisionPena;
	}		
	
	public JButton getjButtonProcesarInformacionComisionPena() {
		return this.jButtonProcesarInformacionComisionPena;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComisionPena)	{
		this.jButtonProcesarInformacionComisionPena = jButtonProcesarInformacionComisionPena;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComisionPena() {
		return this.jComboBoxTiposAccionesComisionPena;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComisionPena(
			JComboBox jComboBoxTiposRelacionesComisionPena) {
		this.jComboBoxTiposRelacionesComisionPena = jComboBoxTiposRelacionesComisionPena;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComisionPena(
			JComboBox jComboBoxTiposAccionesComisionPena) {
		this.jComboBoxTiposAccionesComisionPena = jComboBoxTiposAccionesComisionPena;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioComisionPena() {
		return this.jComboBoxTiposAccionesFormularioComisionPena;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioComisionPena(
			JComboBox jComboBoxTiposAccionesFormularioComisionPena) {
		this.jComboBoxTiposAccionesFormularioComisionPena = jComboBoxTiposAccionesFormularioComisionPena;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.comisionpenaSessionBean=new ComisionPenaSessionBean();
		
		this.comisionpenaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionpenaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comisionpenaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComisionPenaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComisionPenaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComisionPenaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Penalidad Comision MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
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
	
		ComisionPenaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleComisionPena= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarComisionPena=new JButtonMe();
				this.jButtonModificarToolBarComisionPena=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarComisionPena,this.jTtoolBarDetalleComisionPena,
							"actualizar","actualizar","Actualizar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarComisionPena,this.jTtoolBarDetalleComisionPena,
							"eliminar","eliminar","Eliminar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarComisionPena,this.jTtoolBarDetalleComisionPena,
							"cancelar","cancelar","Cancelar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarComisionPena,this.jTtoolBarDetalleComisionPena,
							"guardarcambios","guardarcambios","Guardar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleComisionPena=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleComisionPena=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoComisionPena=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesComisionPena=new JMenuMe("Acciones");
		this.jmenuDetalleDatosComisionPena=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComisionPena= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComisionPena.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComisionPena,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarComisionPena= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarComisionPena.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarComisionPena,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarComisionPena= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarComisionPena.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarComisionPena,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarComisionPena= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarComisionPena.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarComisionPena,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarComisionPena= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarComisionPena.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarComisionPena,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosComisionPena= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComisionPena.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComisionPena,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComisionPena= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComisionPena.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComisionPena,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarComisionPena= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarComisionPena.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarComisionPena,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComisionPena= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComisionPena.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComisionPena,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComisionPena= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComisionPena.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComisionPena,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoComisionPena.add(this.jMenuItemDetalleCerrarComisionPena);
		
		this.jmenuDetalleAccionesComisionPena.add(this.jMenuItemActualizarComisionPena);
		this.jmenuDetalleAccionesComisionPena.add(this.jMenuItemEliminarComisionPena);
		this.jmenuDetalleAccionesComisionPena.add(this.jMenuItemCancelarComisionPena);		
		
		//this.jmenuDetalleDatosComisionPena.add(this.jMenuItemDetalleAbrirOrderByComisionPena);				
		this.jmenuDetalleDatosComisionPena.add(this.jMenuItemDetalleMostarOcultarComisionPena);				
				
		//this.jmenuDetalleAccionesComisionPena.add(this.jMenuItemGuardarCambiosComisionPena);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleComisionPena.add(this.jmenuDetalleArchivoComisionPena);		
		this.jmenuBarDetalleComisionPena.add(this.jmenuDetalleAccionesComisionPena);		
		this.jmenuBarDetalleComisionPena.add(this.jmenuDetalleDatosComisionPena);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleComisionPena);				
	}
	
	
	public void inicializarElementosCamposComisionPena() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdComisionPena = new JLabelMe();
		jLabelIdComisionPena.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidComisionPena = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidComisionPena.setToolTipText(ComisionPenaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutComisionPena= new GridBagLayout();

		this.jPanelidComisionPena.setLayout(this.gridaBagLayoutComisionPena);

		jLabelidComisionPena = new JLabel();
		jLabelidComisionPena.setText("Id");

		jLabelidComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnum_dias_inicioComisionPena = new JLabelMe();
		this.jLabelnum_dias_inicioComisionPena.setText(""+ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO+" : *");
		this.jLabelnum_dias_inicioComisionPena.setToolTipText("Num Dias Inicio");
		this.jLabelnum_dias_inicioComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnum_dias_inicioComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnum_dias_inicioComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnum_dias_inicioComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnum_dias_inicioComisionPena=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnum_dias_inicioComisionPena.setToolTipText(ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO);
		this.gridaBagLayoutComisionPena = new GridBagLayout();
		this.jPanelnum_dias_inicioComisionPena.setLayout(this.gridaBagLayoutComisionPena);


		jTextFieldnum_dias_inicioComisionPena= new JTextFieldMe();
		jTextFieldnum_dias_inicioComisionPena.setEnabled(false);
		jTextFieldnum_dias_inicioComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnum_dias_inicioComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnum_dias_inicioComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnum_dias_inicioComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnum_dias_inicioComisionPena.setText("0");

		this.jButtonnum_dias_inicioComisionPenaBusqueda= new JButtonMe();
		this.jButtonnum_dias_inicioComisionPenaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnum_dias_inicioComisionPenaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnum_dias_inicioComisionPenaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnum_dias_inicioComisionPenaBusqueda.setText("U");
		this.jButtonnum_dias_inicioComisionPenaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnum_dias_inicioComisionPenaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnum_dias_inicioComisionPenaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnum_dias_inicioComisionPena.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnum_dias_inicioComisionPena.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"num_dias_inicioComisionPenaBusqueda"));

		if(this.comisionpenaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnum_dias_inicioComisionPenaBusqueda.setVisible(false);		}


					
		this.jLabelnum_dias_finComisionPena = new JLabelMe();
		this.jLabelnum_dias_finComisionPena.setText(""+ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN+" : *");
		this.jLabelnum_dias_finComisionPena.setToolTipText("Num Dias Fin");
		this.jLabelnum_dias_finComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnum_dias_finComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnum_dias_finComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnum_dias_finComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnum_dias_finComisionPena=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnum_dias_finComisionPena.setToolTipText(ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN);
		this.gridaBagLayoutComisionPena = new GridBagLayout();
		this.jPanelnum_dias_finComisionPena.setLayout(this.gridaBagLayoutComisionPena);


		jTextFieldnum_dias_finComisionPena= new JTextFieldMe();
		jTextFieldnum_dias_finComisionPena.setEnabled(false);
		jTextFieldnum_dias_finComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnum_dias_finComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnum_dias_finComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnum_dias_finComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnum_dias_finComisionPena.setText("0");

		this.jButtonnum_dias_finComisionPenaBusqueda= new JButtonMe();
		this.jButtonnum_dias_finComisionPenaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnum_dias_finComisionPenaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnum_dias_finComisionPenaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnum_dias_finComisionPenaBusqueda.setText("U");
		this.jButtonnum_dias_finComisionPenaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnum_dias_finComisionPenaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnum_dias_finComisionPenaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnum_dias_finComisionPena.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnum_dias_finComisionPena.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"num_dias_finComisionPenaBusqueda"));

		if(this.comisionpenaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnum_dias_finComisionPenaBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeComisionPena = new JLabelMe();
		this.jLabelporcentajeComisionPena.setText(""+ComisionPenaConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeComisionPena.setToolTipText("Porcentaje");
		this.jLabelporcentajeComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeComisionPena=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeComisionPena.setToolTipText(ComisionPenaConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutComisionPena = new GridBagLayout();
		this.jPanelporcentajeComisionPena.setLayout(this.gridaBagLayoutComisionPena);


		jTextFieldporcentajeComisionPena= new JTextFieldMe();
		jTextFieldporcentajeComisionPena.setEnabled(false);
		jTextFieldporcentajeComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeComisionPena.setText("0.0");

		this.jButtonporcentajeComisionPenaBusqueda= new JButtonMe();
		this.jButtonporcentajeComisionPenaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeComisionPenaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeComisionPenaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeComisionPenaBusqueda.setText("U");
		this.jButtonporcentajeComisionPenaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeComisionPenaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeComisionPenaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeComisionPena.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeComisionPena.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeComisionPenaBusqueda"));

		if(this.comisionpenaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeComisionPenaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionComisionPena = new JLabelMe();
		this.jLabeldescripcionComisionPena.setText(""+ComisionPenaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionComisionPena.setToolTipText("Descripcion");
		this.jLabeldescripcionComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionComisionPena=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionComisionPena.setToolTipText(ComisionPenaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutComisionPena = new GridBagLayout();
		this.jPaneldescripcionComisionPena.setLayout(this.gridaBagLayoutComisionPena);


		jTextAreadescripcionComisionPena= new JTextAreaMe();
		jTextAreadescripcionComisionPena.setEnabled(false);
		jTextAreadescripcionComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComisionPena.setLineWrap(true);
		jTextAreadescripcionComisionPena.setWrapStyleWord(true);
		jTextAreadescripcionComisionPena.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionComisionPena.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionComisionPena = new JScrollPane(jTextAreadescripcionComisionPena);
		jscrollPanedescripcionComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionComisionPenaBusqueda= new JButtonMe();
		this.jButtondescripcionComisionPenaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionComisionPenaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionComisionPenaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionComisionPenaBusqueda.setText("U");
		this.jButtondescripcionComisionPenaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionComisionPenaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionComisionPenaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionComisionPena.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionComisionPena.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionComisionPenaBusqueda"));

		if(this.comisionpenaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionComisionPenaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysComisionPena() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaComisionPena = new JLabelMe();
		this.jLabelid_empresaComisionPena.setText(""+ComisionPenaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaComisionPena.setToolTipText("Empresa");
		this.jLabelid_empresaComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaComisionPena=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaComisionPena.setToolTipText(ComisionPenaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutComisionPena = new GridBagLayout();
		this.jPanelid_empresaComisionPena.setLayout(this.gridaBagLayoutComisionPena);


		jComboBoxid_empresaComisionPena= new JComboBoxMe();
		jComboBoxid_empresaComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaComisionPena.setEnabled(false);

		this.jButtonid_empresaComisionPena= new JButtonMe();
		this.jButtonid_empresaComisionPena.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionPena.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionPena.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionPena.setText("Buscar");
		this.jButtonid_empresaComisionPena.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaComisionPena.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionPena,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaComisionPena.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionPena.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionPena"));

		this.jButtonid_empresaComisionPenaBusqueda= new JButtonMe();
		this.jButtonid_empresaComisionPenaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionPenaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionPenaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComisionPenaBusqueda.setText("U");
		this.jButtonid_empresaComisionPenaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaComisionPenaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionPenaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaComisionPena.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionPena.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionPenaBusqueda"));

		if(this.comisionpenaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaComisionPenaBusqueda.setVisible(false);		}

		this.jButtonid_empresaComisionPenaUpdate= new JButtonMe();
		this.jButtonid_empresaComisionPenaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionPenaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionPenaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComisionPenaUpdate.setText("U");
		this.jButtonid_empresaComisionPenaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaComisionPenaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionPenaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaComisionPena.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionPena.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionPenaUpdate"));



					
		this.jLabelid_comision_configComisionPena = new JLabelMe();
		this.jLabelid_comision_configComisionPena.setText(""+ComisionPenaConstantesFunciones.LABEL_IDCOMISIONCONFIG+" : *");
		this.jLabelid_comision_configComisionPena.setToolTipText("Configuracion");
		this.jLabelid_comision_configComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_comision_configComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_comision_configComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_comision_configComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_comision_configComisionPena=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_comision_configComisionPena.setToolTipText(ComisionPenaConstantesFunciones.LABEL_IDCOMISIONCONFIG);
		this.gridaBagLayoutComisionPena = new GridBagLayout();
		this.jPanelid_comision_configComisionPena.setLayout(this.gridaBagLayoutComisionPena);


		jComboBoxid_comision_configComisionPena= new JComboBoxMe();
		jComboBoxid_comision_configComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_comision_configComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_comision_configComisionPena= new JButtonMe();
		this.jButtonid_comision_configComisionPena.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_comision_configComisionPena.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_comision_configComisionPena.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_comision_configComisionPena.setText("Buscar");
		this.jButtonid_comision_configComisionPena.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_comision_configComisionPena.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_comision_configComisionPena,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_comision_configComisionPena.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_comision_configComisionPena.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_comision_configComisionPena"));

		this.jButtonid_comision_configComisionPenaBusqueda= new JButtonMe();
		this.jButtonid_comision_configComisionPenaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionPenaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionPenaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_comision_configComisionPenaBusqueda.setText("U");
		this.jButtonid_comision_configComisionPenaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_comision_configComisionPenaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_comision_configComisionPenaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_comision_configComisionPena.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_comision_configComisionPena.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_comision_configComisionPenaBusqueda"));

		if(this.comisionpenaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_comision_configComisionPenaBusqueda.setVisible(false);		}

		this.jButtonid_comision_configComisionPenaUpdate= new JButtonMe();
		this.jButtonid_comision_configComisionPenaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionPenaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionPenaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_comision_configComisionPenaUpdate.setText("U");
		this.jButtonid_comision_configComisionPenaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_comision_configComisionPenaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_comision_configComisionPenaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_comision_configComisionPena.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_comision_configComisionPena.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_comision_configComisionPenaUpdate"));



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
		//this.jInternalFrameDetalleComisionPena = new ComisionPenaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Penalidad Comision DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComisionPena= new GridBagLayout();
		

		
		String sToolTipComisionPena="";
		sToolTipComisionPena=ComisionPenaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComisionPena+="(Comisiones.ComisionPena)";
		}
		
		if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
			sToolTipComisionPena+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoComisionPena = new JButtonMe();
		this.jButtonModificarComisionPena = new JButtonMe();
        this.jButtonActualizarComisionPena = new JButtonMe();
        this.jButtonEliminarComisionPena = new JButtonMe();
        this.jButtonCancelarComisionPena = new JButtonMe();
        this.jButtonGuardarCambiosComisionPena = new JButtonMe();
		this.jButtonGuardarCambiosTablaComisionPena = new JButtonMe();
		this.jButtonCerrarComisionPena = new JButtonMe();
		
		this.jScrollPanelDatosComisionPena = new JScrollPane();   
        this.jScrollPanelDatosEdicionComisionPena = new JScrollPane();
		this.jScrollPanelDatosGeneralComisionPena = new JScrollPane();
				
		
		
		this.jPanelCamposComisionPena = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosComisionPena = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesComisionPena = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioComisionPena = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Penalidad Comision";
		
		if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Penalidad Comisions" + this.sPath));
		} else {
			this.jScrollPanelDatosComisionPena.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposComisionPena.setName("jPanelCamposComisionPena"); 

		this.jPanelCamposOcultosComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosComisionPena.setName("jPanelCamposOcultosComisionPena"); 

        this.jPanelAccionesComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComisionPena.setToolTipText("Acciones");
        this.jPanelAccionesComisionPena.setName("Acciones"); 

		this.jPanelAccionesFormularioComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioComisionPena.setToolTipText("Acciones");
        this.jPanelAccionesFormularioComisionPena.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoComisionPena.setText("Nuevo");
		this.jButtonModificarComisionPena.setText("Editar");
        this.jButtonActualizarComisionPena.setText("Actualizar");
        this.jButtonEliminarComisionPena.setText("Eliminar");
        this.jButtonCancelarComisionPena.setText("Cancelar");
        this.jButtonGuardarCambiosComisionPena.setText("Guardar");
		this.jButtonGuardarCambiosTablaComisionPena.setText("Guardar");
		this.jButtonCerrarComisionPena.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComisionPena,"nuevo_button","Nuevo",this.comisionpenaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarComisionPena,"modificar_button","Editar",this.comisionpenaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarComisionPena,"actualizar_button","Actualizar",this.comisionpenaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarComisionPena,"eliminar_button","Eliminar",this.comisionpenaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarComisionPena,"cancelar_button","Cancelar",this.comisionpenaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosComisionPena,"guardarcambios_button","Guardar",this.comisionpenaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComisionPena,"guardarcambiostabla_button","Guardar",this.comisionpenaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComisionPena,"cerrar_button","Salir",this.comisionpenaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoComisionPena.setToolTipText("Nuevo"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarComisionPena.setToolTipText("Editar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarComisionPena.setToolTipText("Actualizar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarComisionPena.setToolTipText("Eliminar)"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarComisionPena.setToolTipText("Cancelar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosComisionPena.setToolTipText("Guardar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaComisionPena.setToolTipText("Guardar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComisionPena.setToolTipText("Salir"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComisionPena";
		inputMap = this.jButtonNuevoComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComisionPena.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComisionPena"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarComisionPena";
		inputMap = this.jButtonActualizarComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarComisionPena.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarComisionPena"));
		
		//ELIMINAR
		sMapKey = "EliminarComisionPena";
		inputMap = this.jButtonEliminarComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarComisionPena.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarComisionPena"));
		
		//CANCELAR	
		sMapKey = "CancelarComisionPena";
		inputMap = this.jButtonCancelarComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarComisionPena.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarComisionPena"));
		
		//CERRAR		
		sMapKey = "CerrarComisionPena";
		inputMap = this.jButtonCerrarComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComisionPena.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComisionPena"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComisionPena";
		inputMap = this.jButtonGuardarCambiosTablaComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComisionPena.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComisionPena"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoComisionPena = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoComisionPena.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoComisionPena.setToolTipText("Nuevo ComisionPena");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarComisionPena = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarComisionPena.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarComisionPena.setToolTipText("Sin Cerrar Ventana ComisionPena");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeComisionPena = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeComisionPena.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeComisionPena.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesComisionPena = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComisionPena.setText("Accion");
		this.jComboBoxTiposAccionesComisionPena.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioComisionPena = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioComisionPena.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioComisionPena.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesComisionPena = new JLabelMe();
		
		this.jLabelAccionesComisionPena.setText("Acciones");		
		this.jLabelAccionesComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposComisionPena();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysComisionPena();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesComisionPena=new JTabbedPane();
		this.jTabbedPaneRelacionesComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesComisionPena,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesComisionPena.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionPena.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionPena.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioComisionPena.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComisionPena.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComisionPena.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposComisionPena = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosComisionPena = new GridBagLayout();
		
		this.jPanelCamposComisionPena.setLayout(gridaBagLayoutCamposComisionPena);
		this.jPanelCamposOcultosComisionPena.setLayout(gridaBagLayoutCamposOcultosComisionPena);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionPena.gridy = 0;
	this.gridBagConstraintsComisionPena.gridx = 0;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidComisionPena.add(jLabelIdComisionPena, this.gridBagConstraintsComisionPena);



	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionPena.gridy = 0;
	this.gridBagConstraintsComisionPena.gridx = 1;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidComisionPena.add(jLabelidComisionPena, this.gridBagConstraintsComisionPena);


	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionPena.gridy = 0;
	this.gridBagConstraintsComisionPena.gridx = 0;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaComisionPena.add(jLabelid_empresaComisionPena, this.gridBagConstraintsComisionPena);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		//this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = 0;
		this.gridBagConstraintsComisionPena.gridx = 2;
		this.gridBagConstraintsComisionPena.ipadx = 0;
		this.gridBagConstraintsComisionPena.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComisionPena.add(jButtonid_empresaComisionPenaBusqueda, this.gridBagConstraintsComisionPena);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		//this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = 0;
		this.gridBagConstraintsComisionPena.gridx = 3;
		this.gridBagConstraintsComisionPena.ipadx = 0;
		this.gridBagConstraintsComisionPena.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComisionPena.add(jButtonid_empresaComisionPenaUpdate, this.gridBagConstraintsComisionPena);
	}

	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionPena.gridy = 0;
	this.gridBagConstraintsComisionPena.gridx = 1;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaComisionPena.add(jComboBoxid_empresaComisionPena, this.gridBagConstraintsComisionPena);


	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionPena.gridy = 0;
	this.gridBagConstraintsComisionPena.gridx = 0;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_comision_configComisionPena.add(jLabelid_comision_configComisionPena, this.gridBagConstraintsComisionPena);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		//this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = 0;
		this.gridBagConstraintsComisionPena.gridx = 2;
		this.gridBagConstraintsComisionPena.ipadx = 0;
		this.gridBagConstraintsComisionPena.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_comision_configComisionPena.add(jButtonid_comision_configComisionPenaBusqueda, this.gridBagConstraintsComisionPena);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		//this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = 0;
		this.gridBagConstraintsComisionPena.gridx = 3;
		this.gridBagConstraintsComisionPena.ipadx = 0;
		this.gridBagConstraintsComisionPena.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_comision_configComisionPena.add(jButtonid_comision_configComisionPenaUpdate, this.gridBagConstraintsComisionPena);
	}

	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionPena.gridy = 0;
	this.gridBagConstraintsComisionPena.gridx = 1;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_comision_configComisionPena.add(jComboBoxid_comision_configComisionPena, this.gridBagConstraintsComisionPena);


	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionPena.gridy = 0;
	this.gridBagConstraintsComisionPena.gridx = 0;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnum_dias_inicioComisionPena.add(jLabelnum_dias_inicioComisionPena, this.gridBagConstraintsComisionPena);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		//this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = 0;
		this.gridBagConstraintsComisionPena.gridx = 2;
		this.gridBagConstraintsComisionPena.ipadx = 0;
		this.gridBagConstraintsComisionPena.insets = new Insets(0, 0, 0, 0);
		this.jPanelnum_dias_inicioComisionPena.add(jButtonnum_dias_inicioComisionPenaBusqueda, this.gridBagConstraintsComisionPena);
	}

	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionPena.gridy = 0;
	this.gridBagConstraintsComisionPena.gridx = 1;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnum_dias_inicioComisionPena.add(jTextFieldnum_dias_inicioComisionPena, this.gridBagConstraintsComisionPena);


	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionPena.gridy = 0;
	this.gridBagConstraintsComisionPena.gridx = 0;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnum_dias_finComisionPena.add(jLabelnum_dias_finComisionPena, this.gridBagConstraintsComisionPena);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		//this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = 0;
		this.gridBagConstraintsComisionPena.gridx = 2;
		this.gridBagConstraintsComisionPena.ipadx = 0;
		this.gridBagConstraintsComisionPena.insets = new Insets(0, 0, 0, 0);
		this.jPanelnum_dias_finComisionPena.add(jButtonnum_dias_finComisionPenaBusqueda, this.gridBagConstraintsComisionPena);
	}

	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionPena.gridy = 0;
	this.gridBagConstraintsComisionPena.gridx = 1;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnum_dias_finComisionPena.add(jTextFieldnum_dias_finComisionPena, this.gridBagConstraintsComisionPena);


	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionPena.gridy = 0;
	this.gridBagConstraintsComisionPena.gridx = 0;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeComisionPena.add(jLabelporcentajeComisionPena, this.gridBagConstraintsComisionPena);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		//this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = 0;
		this.gridBagConstraintsComisionPena.gridx = 2;
		this.gridBagConstraintsComisionPena.ipadx = 0;
		this.gridBagConstraintsComisionPena.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeComisionPena.add(jButtonporcentajeComisionPenaBusqueda, this.gridBagConstraintsComisionPena);
	}

	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionPena.gridy = 0;
	this.gridBagConstraintsComisionPena.gridx = 1;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeComisionPena.add(jTextFieldporcentajeComisionPena, this.gridBagConstraintsComisionPena);


	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionPena.gridy = 0;
	this.gridBagConstraintsComisionPena.gridx = 0;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionComisionPena.add(jLabeldescripcionComisionPena, this.gridBagConstraintsComisionPena);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		//this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = 0;
		this.gridBagConstraintsComisionPena.gridx = 2;
		this.gridBagConstraintsComisionPena.ipadx = 0;
		this.gridBagConstraintsComisionPena.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionComisionPena.add(jButtondescripcionComisionPenaBusqueda, this.gridBagConstraintsComisionPena);
	}

	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionPena.gridy = 0;
	this.gridBagConstraintsComisionPena.gridx = 1;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionComisionPena.add(jscrollPanedescripcionComisionPena, this.gridBagConstraintsComisionPena);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionPena.gridy = iYPanelCamposComisionPena;
	this.gridBagConstraintsComisionPena.gridx = iXPanelCamposComisionPena++;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionPena.add(this.jPanelidComisionPena, this.gridBagConstraintsComisionPena);



	if(iXPanelCamposComisionPena % 1==0) {
		iXPanelCamposComisionPena=0;
		iYPanelCamposComisionPena++;
	}
	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionPena.gridy = iYPanelCamposComisionPena;
	this.gridBagConstraintsComisionPena.gridx = iXPanelCamposComisionPena++;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionPena.add(this.jPanelid_comision_configComisionPena, this.gridBagConstraintsComisionPena);



	if(iXPanelCamposComisionPena % 1==0) {
		iXPanelCamposComisionPena=0;
		iYPanelCamposComisionPena++;
	}
	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionPena.gridy = iYPanelCamposComisionPena;
	this.gridBagConstraintsComisionPena.gridx = iXPanelCamposComisionPena++;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionPena.add(this.jPanelnum_dias_inicioComisionPena, this.gridBagConstraintsComisionPena);



	if(iXPanelCamposComisionPena % 1==0) {
		iXPanelCamposComisionPena=0;
		iYPanelCamposComisionPena++;
	}
	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionPena.gridy = iYPanelCamposComisionPena;
	this.gridBagConstraintsComisionPena.gridx = iXPanelCamposComisionPena++;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionPena.add(this.jPanelnum_dias_finComisionPena, this.gridBagConstraintsComisionPena);



	if(iXPanelCamposComisionPena % 1==0) {
		iXPanelCamposComisionPena=0;
		iYPanelCamposComisionPena++;
	}
	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionPena.gridy = iYPanelCamposComisionPena;
	this.gridBagConstraintsComisionPena.gridx = iXPanelCamposComisionPena++;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionPena.add(this.jPanelporcentajeComisionPena, this.gridBagConstraintsComisionPena);



	if(iXPanelCamposComisionPena % 1==0) {
		iXPanelCamposComisionPena=0;
		iYPanelCamposComisionPena++;
	}
	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionPena.gridy = iYPanelCamposComisionPena;
	this.gridBagConstraintsComisionPena.gridx = iXPanelCamposComisionPena++;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionPena.add(this.jPaneldescripcionComisionPena, this.gridBagConstraintsComisionPena);



	if(iXPanelCamposComisionPena % 1==0) {
		iXPanelCamposComisionPena=0;
		iYPanelCamposComisionPena++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsComisionPena = new GridBagConstraints();
	this.gridBagConstraintsComisionPena.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionPena.gridy = iYPanelCamposOcultosComisionPena;
	this.gridBagConstraintsComisionPena.gridx = iXPanelCamposOcultosComisionPena++;
	this.gridBagConstraintsComisionPena.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionPena.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComisionPena.add(this.jPanelid_empresaComisionPena, this.gridBagConstraintsComisionPena);



	if(iXPanelCamposOcultosComisionPena % 1==0) {
		iXPanelCamposOcultosComisionPena=0;
		iYPanelCamposOcultosComisionPena++;
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
			
		GridBagLayout gridaBagLayoutAccionesComisionPena= new GridBagLayout();
		this.jPanelAccionesComisionPena.setLayout(gridaBagLayoutAccionesComisionPena);
		
		GridBagLayout gridaBagLayoutAccionesFormularioComisionPena= new GridBagLayout();
		this.jPanelAccionesFormularioComisionPena.setLayout(gridaBagLayoutAccionesFormularioComisionPena);
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComisionPena.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComisionPena.add(this.jComboBoxTiposAccionesFormularioComisionPena, this.gridBagConstraintsComisionPena);

		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComisionPena.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComisionPena.add(this.jCheckBoxPostAccionNuevoComisionPena, this.gridBagConstraintsComisionPena);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.comisionpenaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsComisionPena.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioComisionPena.add(this.jCheckBoxPostAccionSinCerrarComisionPena, this.gridBagConstraintsComisionPena);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.comisionpenaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsComisionPena.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioComisionPena.add(this.jCheckBoxPostAccionSinMensajeComisionPena, this.gridBagConstraintsComisionPena);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionPena.gridy = 0;
		this.gridBagConstraintsComisionPena.gridx = iPosXAccion++;
			
		this.jPanelAccionesComisionPena.add(this.jButtonModificarComisionPena, this.gridBagConstraintsComisionPena);							

		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionPena.gridy = 0;
		this.gridBagConstraintsComisionPena.gridx =iPosXAccion++;
			
		this.jPanelAccionesComisionPena.add(this.jButtonEliminarComisionPena, this.gridBagConstraintsComisionPena);
		
			
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy = 0;		
		this.gridBagConstraintsComisionPena.gridx = iPosXAccion++;
		
		this.jPanelAccionesComisionPena.add(this.jButtonActualizarComisionPena, this.gridBagConstraintsComisionPena);


		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy = 0;		
		this.gridBagConstraintsComisionPena.gridx = iPosXAccion++;
		
		this.jPanelAccionesComisionPena.add(this.jButtonGuardarCambiosComisionPena, this.gridBagConstraintsComisionPena);	
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy = 0;		
		this.gridBagConstraintsComisionPena.gridx =iPosXAccion++;
		
		this.jPanelAccionesComisionPena.add(this.jButtonCancelarComisionPena, this.gridBagConstraintsComisionPena);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComisionPena = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComisionPena);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comisionpenaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComisionPena = new GridBagConstraints();						
			this.gridBagConstraintsComisionPena.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionPena.gridx = 0;		
			//this.gridBagConstraintsComisionPena.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComisionPena.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComisionPena.gridx =0;
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComisionPena.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComisionPena, this.gridBagConstraintsComisionPena);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ComisionPenaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleComisionPena = new ComisionPenaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Penalidad Comision DATOS");
			
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
			
	        //this.setTitle("[FOR] - Penalidad Comision DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Penalidad Comision Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ComisionPenaModel comisionpenaModel=new ComisionPenaModel(this);
			
			//SI USARA CLASE INTERNA
			//ComisionPenaModel.ComisionPenaFocusTraversalPolicy comisionpenaFocusTraversalPolicy = comisionpenaModel.new ComisionPenaFocusTraversalPolicy(this);
			
			//comisionpenaFocusTraversalPolicy.setcomisionpenaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(comisionpenaModel);
			
			
			this.jContentPaneDetalleComisionPena = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleComisionPena = new GridBagLayout();	
			this.jContentPaneDetalleComisionPena.setLayout(gridaBagLayoutDetalleComisionPena);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComisionPena = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsComisionPena = new GridBagConstraints();
				this.gridBagConstraintsComisionPena.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsComisionPena.gridx = 0;
					
				
				this.jContentPaneDetalleComisionPena.add(jTtoolBarDetalleComisionPena, gridBagConstraintsComisionPena);								
				
}
			
			this.jScrollPanelDatosEdicionComisionPena=   new JScrollPane(jContentPaneDetalleComisionPena,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComisionPena.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionPena.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionPena.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralComisionPena=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComisionPena.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionPena.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionPena.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			
			
	        this.gridBagConstraintsComisionPena.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsComisionPena.gridx = 0;
	        
			this.jContentPaneDetalleComisionPena.add(jPanelCamposComisionPena, gridBagConstraintsComisionPena);
			
			
			
			
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
						&& comisionpenaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.comisionpenaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsComisionPena= new GridBagConstraints();
						this.gridBagConstraintsComisionPena.gridy = iGridyRelaciones++;
						this.gridBagConstraintsComisionPena.gridx = 0;
						this.jContentPaneDetalleComisionPena.add(this.jTabbedPaneRelacionesComisionPena, this.gridBagConstraintsComisionPena);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesComisionPena.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosComisionPena.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsComisionPena = new GridBagConstraints();
					this.gridBagConstraintsComisionPena.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsComisionPena.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsComisionPena.gridx = 0;
					
				
					this.jContentPaneDetalleComisionPena.add(jPanelCamposOcultosComisionPena, gridBagConstraintsComisionPena);
				
					this.jPanelCamposOcultosComisionPena.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsComisionPena.gridx = 0;
	        this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleComisionPena.add(this.jPanelAccionesFormularioComisionPena, this.gridBagConstraintsComisionPena);							
			
			
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
	        this.gridBagConstraintsComisionPena.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsComisionPena.gridx = 0;
	        
			
			this.jContentPaneDetalleComisionPena.add(this.jPanelAccionesComisionPena, this.gridBagConstraintsComisionPena);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionComisionPena);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionComisionPena=   new JScrollPane(this.jPanelCamposComisionPena,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComisionPena.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionPena.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionPena.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsComisionPena.gridx = 0;
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsComisionPena.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionComisionPena, this.gridBagConstraintsComisionPena);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComisionPena.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioComisionPena, this.gridBagConstraintsComisionPena);			
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComisionPena.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesComisionPena, this.gridBagConstraintsComisionPena);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionPena.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComisionPena, this.gridBagConstraintsComisionPena);
			
			
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionPena.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComisionPena, this.gridBagConstraintsComisionPena);
		
			
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComisionPena.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComisionPena, this.gridBagConstraintsComisionPena);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralComisionPena;//jContentPane;
		
		return jScrollPanelDatosEdicionComisionPena;
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
