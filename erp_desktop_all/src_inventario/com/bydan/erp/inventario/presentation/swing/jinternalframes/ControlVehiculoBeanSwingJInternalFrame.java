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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.inventario.util.ControlVehiculoConstantesFunciones;
import com.bydan.erp.inventario.util.ControlVehiculoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ControlVehiculoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ControlVehiculoBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ControlVehiculoBeanSwingJInternalFrame extends ControlVehiculoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ControlVehiculoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ControlVehiculo> controlvehiculoValidator = new ClassValidator<ControlVehiculo>(ControlVehiculo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ControlVehiculo controlvehiculo;	
	public ControlVehiculo controlvehiculoAux;
	public ControlVehiculo controlvehiculoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ControlVehiculo controlvehiculoTotales;
	public Long idControlVehiculoActual;
	public Long iIdNuevoControlVehiculo=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

		
	
	
	
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoControlVehiculo;
	public Boolean isPermisoNuevoControlVehiculo;
	public Boolean isPermisoActualizarControlVehiculo;
	public Boolean isPermisoActualizarOriginalControlVehiculo;
	public Boolean isPermisoEliminarControlVehiculo;
	public Boolean isPermisoGuardarCambiosControlVehiculo;
	public Boolean isPermisoConsultaControlVehiculo;
	public Boolean isPermisoBusquedaControlVehiculo;
	public Boolean isPermisoReporteControlVehiculo;
	public Boolean isPermisoPaginacionMedioControlVehiculo;
	public Boolean isPermisoPaginacionAltoControlVehiculo;
	public Boolean isPermisoPaginacionTodoControlVehiculo;
	public Boolean isPermisoCopiarControlVehiculo;
	public Boolean isPermisoVerFormControlVehiculo;
	public Boolean isPermisoDuplicarControlVehiculo;
	public Boolean isPermisoOrdenControlVehiculo;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public ControlVehiculoParameterReturnGeneral controlvehiculoReturnGeneral;
	public ControlVehiculoParameterReturnGeneral controlvehiculoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoControlVehiculo=false;
	public Boolean esParaAccionDesdeFormularioControlVehiculo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ControlVehiculoSessionBeanAdditional controlvehiculoSessionBeanAdditional=null;
	
	public ControlVehiculoSessionBeanAdditional getControlVehiculoSessionBeanAdditional() {
		return this.controlvehiculoSessionBeanAdditional;
	}
	
	public void setControlVehiculoSessionBeanAdditional(ControlVehiculoSessionBeanAdditional controlvehiculoSessionBeanAdditional) {
		try {
			this.controlvehiculoSessionBeanAdditional=controlvehiculoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ControlVehiculoBeanSwingJInternalFrameAdditional controlvehiculoBeanSwingJInternalFrameAdditional=null;
	//public class ControlVehiculoBeanSwingJInternalFrame
	
	public ControlVehiculoBeanSwingJInternalFrameAdditional getControlVehiculoBeanSwingJInternalFrameAdditional() {
		return this.controlvehiculoBeanSwingJInternalFrameAdditional;
	}
	
	public void setControlVehiculoBeanSwingJInternalFrameAdditional(ControlVehiculoBeanSwingJInternalFrameAdditional controlvehiculoBeanSwingJInternalFrameAdditional) {
		try {
			this.controlvehiculoBeanSwingJInternalFrameAdditional=controlvehiculoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ControlVehiculoLogic controlvehiculoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ControlVehiculo controlvehiculoBean;
	public ControlVehiculoConstantesFunciones controlvehiculoConstantesFunciones;
	//public ControlVehiculoParameterReturnGeneral controlvehiculoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ControlVehiculo> controlvehiculos;	
	//public List<ControlVehiculo> controlvehiculosEliminados;
	//public List<ControlVehiculo> controlvehiculosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoControlVehiculo=false;
	public Boolean isVisibilidadCeldaDuplicarControlVehiculo=true;
	public Boolean isVisibilidadCeldaCopiarControlVehiculo=true;
	public Boolean isVisibilidadCeldaVerFormControlVehiculo=true;
	public Boolean isVisibilidadCeldaOrdenControlVehiculo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesControlVehiculo=false;
	public Boolean isVisibilidadCeldaModificarControlVehiculo=false;
	public Boolean isVisibilidadCeldaActualizarControlVehiculo=false;
	public Boolean isVisibilidadCeldaEliminarControlVehiculo=false;
	public Boolean isVisibilidadCeldaCancelarControlVehiculo=false;
	public Boolean isVisibilidadCeldaGuardarControlVehiculo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosControlVehiculo=false;	
	
	
	public Boolean isVisibilidadBusquedaPorFechaEntrada=false;
	public Boolean isVisibilidadBusquedaPorFechaSalida=false;
	public Boolean isVisibilidadBusquedaPorNombreConductor=false;
	public Boolean isVisibilidadBusquedaPorNumeroPlaca=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoControlVehiculo() {
		return this.iIdNuevoControlVehiculo;
	}

	public void setiIdNuevoControlVehiculo(Long iIdNuevoControlVehiculo) {
		this.iIdNuevoControlVehiculo = iIdNuevoControlVehiculo;
	}
	
	public Long getidControlVehiculoActual() {
		return this.idControlVehiculoActual;
	}

	public void setidControlVehiculoActual(Long idControlVehiculoActual) {
		this.idControlVehiculoActual = idControlVehiculoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ControlVehiculo getcontrolvehiculo() {
		return this.controlvehiculo;
	}

	public void setcontrolvehiculo(ControlVehiculo controlvehiculo) {
		this.controlvehiculo = controlvehiculo;
	}
	
	public ControlVehiculo getcontrolvehiculoAux() {
		return this.controlvehiculoAux;
	}

	public void setcontrolvehiculoAux(ControlVehiculo controlvehiculoAux) {
		this.controlvehiculoAux = controlvehiculoAux;
	}				
	
	public ControlVehiculo getcontrolvehiculoAnterior() {
		return this.controlvehiculoAnterior;
	}

	public void setcontrolvehiculoAnterior(ControlVehiculo controlvehiculoAnterior) {
		this.controlvehiculoAnterior = controlvehiculoAnterior;
	}	
	
	public ControlVehiculo getcontrolvehiculoTotales() {
		return this.controlvehiculoTotales;
	}

	public void setcontrolvehiculoTotales(ControlVehiculo controlvehiculoTotales) {
		this.controlvehiculoTotales = controlvehiculoTotales;
	}	
	
	public ControlVehiculo getcontrolvehiculoBean() {
		return this.controlvehiculoBean;
	}

	public void setcontrolvehiculoBean(ControlVehiculo controlvehiculoBean) {
		this.controlvehiculoBean = controlvehiculoBean;
	}	
	
	public ControlVehiculoParameterReturnGeneral getcontrolvehiculoReturnGeneral() {
		return this.controlvehiculoReturnGeneral;
	}

	public void setcontrolvehiculoReturnGeneral(ControlVehiculoParameterReturnGeneral controlvehiculoReturnGeneral) {
		this.controlvehiculoReturnGeneral = controlvehiculoReturnGeneral;
	}	
	
	
	public Date fecha_entradaBusquedaPorFechaEntrada=new Date();

	public Date getfecha_entradaBusquedaPorFechaEntrada() {
		return this.fecha_entradaBusquedaPorFechaEntrada;
	}

	public void setfecha_entradaBusquedaPorFechaEntrada(Date fecha_entradaBusquedaPorFechaEntrada) {
		this.fecha_entradaBusquedaPorFechaEntrada = fecha_entradaBusquedaPorFechaEntrada;
	}

	public Date fecha_salidaBusquedaPorFechaSalida=new Date();

	public Date getfecha_salidaBusquedaPorFechaSalida() {
		return this.fecha_salidaBusquedaPorFechaSalida;
	}

	public void setfecha_salidaBusquedaPorFechaSalida(Date fecha_salidaBusquedaPorFechaSalida) {
		this.fecha_salidaBusquedaPorFechaSalida = fecha_salidaBusquedaPorFechaSalida;
	}

	public String nombre_conductorBusquedaPorNombreConductor="";

	public String getnombre_conductorBusquedaPorNombreConductor() {
		return this.nombre_conductorBusquedaPorNombreConductor;
	}

	public void setnombre_conductorBusquedaPorNombreConductor(String nombre_conductorBusquedaPorNombreConductor) {
		this.nombre_conductorBusquedaPorNombreConductor = nombre_conductorBusquedaPorNombreConductor;
	}

	public String numero_placaBusquedaPorNumeroPlaca="";

	public String getnumero_placaBusquedaPorNumeroPlaca() {
		return this.numero_placaBusquedaPorNumeroPlaca;
	}

	public void setnumero_placaBusquedaPorNumeroPlaca(String numero_placaBusquedaPorNumeroPlaca) {
		this.numero_placaBusquedaPorNumeroPlaca = numero_placaBusquedaPorNumeroPlaca;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ControlVehiculoLogic getControlVehiculoLogic()	{		
		return controlvehiculoLogic;
	}

	public void setControlVehiculoLogic(ControlVehiculoLogic controlvehiculoLogic) {
		this.controlvehiculoLogic = controlvehiculoLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoControlVehiculo() {
		return isEsNuevoControlVehiculo;
	}

	public void setIsEsNuevoControlVehiculo(Boolean isEsNuevoControlVehiculo) {
		this.isEsNuevoControlVehiculo = isEsNuevoControlVehiculo;
	}

	public Boolean getEsParaAccionDesdeFormularioControlVehiculo() {
		return esParaAccionDesdeFormularioControlVehiculo;
	}
	
	public void setEsParaAccionDesdeFormularioControlVehiculo(Boolean esParaAccionDesdeFormularioControlVehiculo) {
		this.esParaAccionDesdeFormularioControlVehiculo = esParaAccionDesdeFormularioControlVehiculo;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.controlvehiculoSessionBean==null) {
				this.controlvehiculoSessionBean=new ControlVehiculoSessionBean();
			}

			if(!this.controlvehiculoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(controlvehiculoSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.controlvehiculo!=null) {
						this.controlvehiculo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
						this.jInternalFrameDetalleFormControlVehiculo.jComboBoxid_empresaControlVehiculo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaControlVehiculo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
						if(this.jInternalFrameDetalleFormControlVehiculo.jComboBoxid_empresaControlVehiculo.getItemCount()>0) {
							this.jInternalFrameDetalleFormControlVehiculo.jComboBoxid_empresaControlVehiculo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaControlVehiculoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaControlVehiculoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaControlVehiculoGenerico!=null && jComboBoxid_empresaControlVehiculoGenerico.getItemCount()>0) {
					jComboBoxid_empresaControlVehiculoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ControlVehiculo controlvehiculo,JComboBox jComboBoxid_empresaControlVehiculoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaControlVehiculoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormControlVehiculo.jComboBoxid_empresaControlVehiculo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaControlVehiculoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				controlvehiculo.setid_empresa(empresaAux.getId());
				controlvehiculo.setempresa_descripcion(ControlVehiculoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				controlvehiculo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ControlVehiculoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormControlVehiculo!=null) { 
							this.jInternalFrameDetalleFormControlVehiculo.jComboBoxid_empresaControlVehiculo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormControlVehiculo.jComboBoxid_empresaControlVehiculo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormControlVehiculo!=null) { 
					}

					if(!ControlVehiculoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
							this.jInternalFrameDetalleFormControlVehiculo.jComboBoxid_empresaControlVehiculo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
							this.jInternalFrameDetalleFormControlVehiculo.jComboBoxid_empresaControlVehiculo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesControlVehiculo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ControlVehiculoConstantesFunciones.refrescarForeignKeysDescripcionesControlVehiculo(this.controlvehiculoLogic.getControlVehiculos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ControlVehiculoConstantesFunciones.refrescarForeignKeysDescripcionesControlVehiculo(this.controlvehiculos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//controlvehiculoLogic.setControlVehiculos(this.controlvehiculos);
			controlvehiculoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public ControlVehiculoParameterReturnGeneral getControlVehiculoParameterGeneral() {
		return this.controlvehiculoParameterGeneral;
	}
	
	public void setControlVehiculoParameterGeneral(ControlVehiculoParameterReturnGeneral controlvehiculoParameterGeneral) {
		this.controlvehiculoParameterGeneral = controlvehiculoParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoControlVehiculo() {
		return isPermisoTodoControlVehiculo;
	}

	public void setIsPermisoTodoControlVehiculo(Boolean isPermisoTodoControlVehiculo) {
		this.isPermisoTodoControlVehiculo = isPermisoTodoControlVehiculo;
	}

	public Boolean getIsPermisoNuevoControlVehiculo() {
		return isPermisoNuevoControlVehiculo;
	}

	public void setIsPermisoNuevoControlVehiculo(Boolean isPermisoNuevoControlVehiculo) {
		this.isPermisoNuevoControlVehiculo = isPermisoNuevoControlVehiculo;
	}

	public Boolean getIsPermisoActualizarControlVehiculo() {
		return isPermisoActualizarControlVehiculo;
	}

	public void setIsPermisoActualizarControlVehiculo(Boolean isPermisoActualizarControlVehiculo) {
		this.isPermisoActualizarControlVehiculo = isPermisoActualizarControlVehiculo;
	}

	public Boolean getIsPermisoEliminarControlVehiculo() {
		return isPermisoEliminarControlVehiculo;
	}

	public void setIsPermisoEliminarControlVehiculo(Boolean isPermisoEliminarControlVehiculo) {
		this.isPermisoEliminarControlVehiculo = isPermisoEliminarControlVehiculo;
	}

	public Boolean getIsPermisoGuardarCambiosControlVehiculo() {
		return isPermisoGuardarCambiosControlVehiculo;
	}

	public void setIsPermisoGuardarCambiosControlVehiculo(Boolean isPermisoGuardarCambiosControlVehiculo) {
		this.isPermisoGuardarCambiosControlVehiculo = isPermisoGuardarCambiosControlVehiculo;
	}
	
	public Boolean getIsPermisoConsultaControlVehiculo() {
		return isPermisoConsultaControlVehiculo;
	}

	public void setIsPermisoConsultaControlVehiculo(Boolean isPermisoConsultaControlVehiculo) {
		this.isPermisoConsultaControlVehiculo = isPermisoConsultaControlVehiculo;
	}

	public Boolean getIsPermisoBusquedaControlVehiculo() {
		return isPermisoBusquedaControlVehiculo;
	}

	public void setIsPermisoBusquedaControlVehiculo(Boolean isPermisoBusquedaControlVehiculo) {
		this.isPermisoBusquedaControlVehiculo = isPermisoBusquedaControlVehiculo;
	}

	public Boolean getIsPermisoReporteControlVehiculo() {
		return isPermisoReporteControlVehiculo;
	}

	public void setIsPermisoReporteControlVehiculo(Boolean isPermisoReporteControlVehiculo) {
		this.isPermisoReporteControlVehiculo = isPermisoReporteControlVehiculo;
	}
	
	public Boolean getIsPermisoPaginacionMedioControlVehiculo() {
		return isPermisoPaginacionMedioControlVehiculo;
	}

	public void setIsPermisoPaginacionMedioControlVehiculo(Boolean isPermisoPaginacionMedioControlVehiculo) {
		this.isPermisoPaginacionMedioControlVehiculo = isPermisoPaginacionMedioControlVehiculo;
	}
	
	public Boolean getIsPermisoPaginacionTodoControlVehiculo() {
		return isPermisoPaginacionTodoControlVehiculo;
	}

	public void setIsPermisoPaginacionTodoControlVehiculo(Boolean isPermisoPaginacionTodoControlVehiculo) {
		this.isPermisoPaginacionTodoControlVehiculo = isPermisoPaginacionTodoControlVehiculo;
	}
	
	public Boolean getIsPermisoPaginacionAltoControlVehiculo() {
		return isPermisoPaginacionAltoControlVehiculo;
	}

	public void setIsPermisoPaginacionAltoControlVehiculo(Boolean isPermisoPaginacionAltoControlVehiculo) {
		this.isPermisoPaginacionAltoControlVehiculo = isPermisoPaginacionAltoControlVehiculo;
	}
	
	public Boolean getIsPermisoCopiarControlVehiculo() {
		return isPermisoCopiarControlVehiculo;
	}

	public void setIsPermisoCopiarControlVehiculo(Boolean isPermisoCopiarControlVehiculo) {
		this.isPermisoCopiarControlVehiculo = isPermisoCopiarControlVehiculo;
	}
	
	public Boolean getIsPermisoVerFormControlVehiculo() {
		return isPermisoVerFormControlVehiculo;
	}

	public void setIsPermisoVerFormControlVehiculo(Boolean isPermisoVerFormControlVehiculo) {
		this.isPermisoVerFormControlVehiculo = isPermisoVerFormControlVehiculo;
	}
	
	public Boolean getIsPermisoDuplicarControlVehiculo() {
		return isPermisoDuplicarControlVehiculo;
	}

	public void setIsPermisoDuplicarControlVehiculo(Boolean isPermisoDuplicarControlVehiculo) {
		this.isPermisoDuplicarControlVehiculo = isPermisoDuplicarControlVehiculo;
	}
	
	public Boolean getIsPermisoOrdenControlVehiculo() {
		return isPermisoOrdenControlVehiculo;
	}

	public void setIsPermisoOrdenControlVehiculo(Boolean isPermisoOrdenControlVehiculo) {
		this.isPermisoOrdenControlVehiculo = isPermisoOrdenControlVehiculo;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoControlVehiculo() {
		return isVisibilidadCeldaNuevoControlVehiculo;
	}

	public void setIsVisibilidadCeldaNuevoControlVehiculo(Boolean isVisibilidadCeldaNuevoControlVehiculo) {
		this.isVisibilidadCeldaNuevoControlVehiculo = isVisibilidadCeldaNuevoControlVehiculo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarControlVehiculo() {
		return isVisibilidadCeldaDuplicarControlVehiculo;
	}

	public void setIsVisibilidadCeldaDuplicarControlVehiculo(Boolean isVisibilidadCeldaDuplicarControlVehiculo) {
		this.isVisibilidadCeldaDuplicarControlVehiculo = isVisibilidadCeldaDuplicarControlVehiculo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarControlVehiculo() {
		return isVisibilidadCeldaCopiarControlVehiculo;
	}

	public void setIsVisibilidadCeldaCopiarControlVehiculo(Boolean isVisibilidadCeldaCopiarControlVehiculo) {
		this.isVisibilidadCeldaCopiarControlVehiculo = isVisibilidadCeldaCopiarControlVehiculo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormControlVehiculo() {
		return isVisibilidadCeldaVerFormControlVehiculo;
	}

	public void setIsVisibilidadCeldaVerFormControlVehiculo(Boolean isVisibilidadCeldaVerFormControlVehiculo) {
		this.isVisibilidadCeldaVerFormControlVehiculo = isVisibilidadCeldaVerFormControlVehiculo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenControlVehiculo() {
		return isVisibilidadCeldaOrdenControlVehiculo;
	}

	public void setIsVisibilidadCeldaOrdenControlVehiculo(Boolean isVisibilidadCeldaOrdenControlVehiculo) {
		this.isVisibilidadCeldaOrdenControlVehiculo = isVisibilidadCeldaOrdenControlVehiculo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesControlVehiculo() {
		return isVisibilidadCeldaNuevoRelacionesControlVehiculo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesControlVehiculo(Boolean isVisibilidadCeldaNuevoRelacionesControlVehiculo) {
		this.isVisibilidadCeldaNuevoRelacionesControlVehiculo = isVisibilidadCeldaNuevoRelacionesControlVehiculo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarControlVehiculo() {
		return isVisibilidadCeldaModificarControlVehiculo;
	}

	public void setIsVisibilidadCeldaModificarControlVehiculo(Boolean isVisibilidadCeldaModificarControlVehiculo) {
		this.isVisibilidadCeldaModificarControlVehiculo = isVisibilidadCeldaModificarControlVehiculo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarControlVehiculo() {
		return isVisibilidadCeldaActualizarControlVehiculo;
	}

	public void setIsVisibilidadCeldaActualizarControlVehiculo(Boolean isVisibilidadCeldaActualizarControlVehiculo) {
		this.isVisibilidadCeldaActualizarControlVehiculo = isVisibilidadCeldaActualizarControlVehiculo;
	}

	public Boolean getIsVisibilidadCeldaEliminarControlVehiculo() {
		return isVisibilidadCeldaEliminarControlVehiculo;
	}

	public void setIsVisibilidadCeldaEliminarControlVehiculo(Boolean isVisibilidadCeldaEliminarControlVehiculo) {
		this.isVisibilidadCeldaEliminarControlVehiculo = isVisibilidadCeldaEliminarControlVehiculo;
	}

	public Boolean getIsVisibilidadCeldaCancelarControlVehiculo() {
		return isVisibilidadCeldaCancelarControlVehiculo;
	}

	public void setIsVisibilidadCeldaCancelarControlVehiculo(Boolean isVisibilidadCeldaCancelarControlVehiculo) {
		this.isVisibilidadCeldaCancelarControlVehiculo = isVisibilidadCeldaCancelarControlVehiculo;
	}

	public Boolean getIsVisibilidadCeldaGuardarControlVehiculo() {
		return isVisibilidadCeldaGuardarControlVehiculo;
	}

	public void setIsVisibilidadCeldaGuardarControlVehiculo(Boolean isVisibilidadCeldaGuardarControlVehiculo) {
		this.isVisibilidadCeldaGuardarControlVehiculo = isVisibilidadCeldaGuardarControlVehiculo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosControlVehiculo() {
		return isVisibilidadCeldaGuardarCambiosControlVehiculo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosControlVehiculo(Boolean isVisibilidadCeldaGuardarCambiosControlVehiculo) {
		this.isVisibilidadCeldaGuardarCambiosControlVehiculo = isVisibilidadCeldaGuardarCambiosControlVehiculo;
	}
		
	public ControlVehiculoSessionBean getcontrolvehiculoSessionBean() {
		return this.controlvehiculoSessionBean;
	}
	
	public void setcontrolvehiculoSessionBean(ControlVehiculoSessionBean controlvehiculoSessionBean) {
		this.controlvehiculoSessionBean=controlvehiculoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorFechaEntrada() {
		return this.isVisibilidadBusquedaPorFechaEntrada;
	}

	public void setisVisibilidadBusquedaPorFechaEntrada(Boolean isVisibilidadBusquedaPorFechaEntrada) {
		this.isVisibilidadBusquedaPorFechaEntrada=isVisibilidadBusquedaPorFechaEntrada;
	}

	public Boolean getisVisibilidadBusquedaPorFechaSalida() {
		return this.isVisibilidadBusquedaPorFechaSalida;
	}

	public void setisVisibilidadBusquedaPorFechaSalida(Boolean isVisibilidadBusquedaPorFechaSalida) {
		this.isVisibilidadBusquedaPorFechaSalida=isVisibilidadBusquedaPorFechaSalida;
	}

	public Boolean getisVisibilidadBusquedaPorNombreConductor() {
		return this.isVisibilidadBusquedaPorNombreConductor;
	}

	public void setisVisibilidadBusquedaPorNombreConductor(Boolean isVisibilidadBusquedaPorNombreConductor) {
		this.isVisibilidadBusquedaPorNombreConductor=isVisibilidadBusquedaPorNombreConductor;
	}

	public Boolean getisVisibilidadBusquedaPorNumeroPlaca() {
		return this.isVisibilidadBusquedaPorNumeroPlaca;
	}

	public void setisVisibilidadBusquedaPorNumeroPlaca(Boolean isVisibilidadBusquedaPorNumeroPlaca) {
		this.isVisibilidadBusquedaPorNumeroPlaca=isVisibilidadBusquedaPorNumeroPlaca;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(ControlVehiculo controlvehiculo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(controlvehiculo,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(ControlVehiculo controlvehiculo,ControlVehiculo controlvehiculoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalControlVehiculo(controlvehiculo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		controlvehiculoAux.setId(controlvehiculo.getId());
		controlvehiculoAux.setVersionRow(controlvehiculo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessControlVehiculo();
		
			int intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualControlVehiculo(this.controlvehiculo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = controlvehiculoValidator.getInvalidValues(this.controlvehiculo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			controlvehiculoLogic.setDatosCliente(datosCliente);
			controlvehiculoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				controlvehiculoAux=new  ControlVehiculo();
				
				controlvehiculoAux.setIsNew(true);
				controlvehiculoAux.setIsChanged(true);
				
				controlvehiculoAux.setControlVehiculoOriginal(this.controlvehiculo);
				
				controlvehiculoAux.setId(this.controlvehiculo.getId());	
				controlvehiculoAux.setVersionRow(this.controlvehiculo.getVersionRow());	
				controlvehiculoAux.setid_empresa(this.controlvehiculo.getid_empresa());	
				controlvehiculoAux.setnombre_conductor(this.controlvehiculo.getnombre_conductor());	
				controlvehiculoAux.setnumero_placa(this.controlvehiculo.getnumero_placa());	
				controlvehiculoAux.setfecha_entrada(this.controlvehiculo.getfecha_entrada());	
				controlvehiculoAux.setfecha_salida(this.controlvehiculo.getfecha_salida());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.controlvehiculoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.controlvehiculoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(controlvehiculoAux,controlvehiculoLogic.getControlVehiculos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(controlvehiculoAux,controlvehiculos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.controlvehiculoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.controlvehiculoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						controlvehiculoLogic.saveControlVehiculos();//WithConnection
						//controlvehiculoLogic.getSetVersionRowControlVehiculos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.controlvehiculo,controlvehiculoAux);
					
					this.refrescarForeignKeysDescripcionesControlVehiculo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.controlvehiculoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								controlvehiculoLogic.saveControlVehiculoRelaciones(controlvehiculoAux);//WithConnection
								//controlvehiculoLogic.getSetVersionRowControlVehiculos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.controlvehiculo,controlvehiculoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.controlvehiculoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.controlvehiculoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(controlvehiculoAux,controlvehiculoLogic.getControlVehiculos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(controlvehiculoAux,controlvehiculos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.controlvehiculo,controlvehiculoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				controlvehiculoAux=new  ControlVehiculo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado() 
					|| (this.controlvehiculoSessionBean.getEsGuardarRelacionado() && this.controlvehiculo.getId()>=0)) {
						
					controlvehiculoAux.setIsNew(false);
				}
				
				controlvehiculoAux.setIsDeleted(false);
			
				controlvehiculoAux.setId(this.controlvehiculo.getId());	
				controlvehiculoAux.setVersionRow(this.controlvehiculo.getVersionRow());	
				controlvehiculoAux.setid_empresa(this.controlvehiculo.getid_empresa());	
				controlvehiculoAux.setnombre_conductor(this.controlvehiculo.getnombre_conductor());	
				controlvehiculoAux.setnumero_placa(this.controlvehiculo.getnumero_placa());	
				controlvehiculoAux.setfecha_entrada(this.controlvehiculo.getfecha_entrada());	
				controlvehiculoAux.setfecha_salida(this.controlvehiculo.getfecha_salida());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(controlvehiculoAux,controlvehiculoLogic.getControlVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(controlvehiculoAux,controlvehiculos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.controlvehiculoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.controlvehiculoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						controlvehiculoLogic.saveControlVehiculos();//WithConnection
						//controlvehiculoLogic.getSetVersionRowControlVehiculos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.controlvehiculo,controlvehiculoAux);
					
					this.refrescarForeignKeysDescripcionesControlVehiculo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.controlvehiculoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								controlvehiculoLogic.saveControlVehiculoRelaciones(controlvehiculoAux);//WithConnection
								//controlvehiculoLogic.getSetVersionRowControlVehiculos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.controlvehiculo,controlvehiculoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.controlvehiculoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.controlvehiculoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(controlvehiculoAux,controlvehiculoLogic.getControlVehiculos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(controlvehiculoAux,controlvehiculos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.controlvehiculo,controlvehiculoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				controlvehiculoAux=new  ControlVehiculo();
				
				controlvehiculoAux.setIsNew(false);
				controlvehiculoAux.setIsChanged(false);
				
				controlvehiculoAux.setIsDeleted(true);
				
				controlvehiculoAux.setId(this.controlvehiculo.getId());	
				controlvehiculoAux.setVersionRow(this.controlvehiculo.getVersionRow());	
				controlvehiculoAux.setid_empresa(this.controlvehiculo.getid_empresa());	
				controlvehiculoAux.setnombre_conductor(this.controlvehiculo.getnombre_conductor());	
				controlvehiculoAux.setnumero_placa(this.controlvehiculo.getnumero_placa());	
				controlvehiculoAux.setfecha_entrada(this.controlvehiculo.getfecha_entrada());	
				controlvehiculoAux.setfecha_salida(this.controlvehiculo.getfecha_salida());	
				
				if(this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.controlvehiculoAux.getId()>=0) {	
						this.controlvehiculosEliminados.add(controlvehiculoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(controlvehiculoAux,controlvehiculoLogic.getControlVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(controlvehiculoAux,controlvehiculos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.controlvehiculoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.controlvehiculoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						controlvehiculoLogic.saveControlVehiculos();//WithConnection
						//controlvehiculoLogic.getSetVersionRowControlVehiculos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.controlvehiculoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								controlvehiculoLogic.saveControlVehiculoRelaciones(controlvehiculoAux);//WithConnection
								//controlvehiculoLogic.getSetVersionRowControlVehiculos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.controlvehiculoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.controlvehiculoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(controlvehiculoAux,controlvehiculoLogic.getControlVehiculos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(controlvehiculoAux,controlvehiculos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.getControlVehiculos().addAll(this.controlvehiculosEliminados);
					
					controlvehiculoLogic.saveControlVehiculos();//WithConnection
					//controlvehiculoLogic.getSetVersionRowControlVehiculos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesControlVehiculo();
				
				this.controlvehiculosEliminados= new ArrayList<ControlVehiculo>();		
			}
			
			if(this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Control Vehiculo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Control Vehiculo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.controlvehiculo=controlvehiculoAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessControlVehiculo();
      	}
		
	}	
	
	public void actualizarRelaciones(ControlVehiculo controlvehiculoLocal) throws Exception {
		
		if(this.controlvehiculoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ControlVehiculo controlvehiculoLocal) throws Exception {	
		if(this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				controlvehiculoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarControlVehiculoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = controlvehiculoValidator.getInvalidValues(this.controlvehiculo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ControlVehiculo controlvehiculo,List<ControlVehiculo> controlvehiculos) throws Exception {
		try	{		
			ControlVehiculoConstantesFunciones.actualizarLista(controlvehiculo,controlvehiculos,this.controlvehiculoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ControlVehiculo controlvehiculo,List<ControlVehiculo> controlvehiculos) throws Exception {
		try	{			
			ControlVehiculoConstantesFunciones.actualizarSelectedLista(controlvehiculo,controlvehiculos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ControlVehiculo> controlvehiculosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				controlvehiculosLocal=this.controlvehiculoLogic.getControlVehiculos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				controlvehiculosLocal=this.controlvehiculos;
			}
			//ARCHITECTURE
		
			for(ControlVehiculo controlvehiculoLocal:controlvehiculosLocal) {
				if(this.permiteMantenimiento(controlvehiculoLocal) && controlvehiculoLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+ControlVehiculoConstantesFunciones.getControlVehiculoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ControlVehiculoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlVehiculo.jLabelid_empresaControlVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlVehiculoConstantesFunciones.NOMBRECONDUCTOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlVehiculo.jLabelnombre_conductorControlVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlVehiculoConstantesFunciones.NUMEROPLACA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlVehiculo.jLabelnumero_placaControlVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlVehiculoConstantesFunciones.FECHAENTRADA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlVehiculo.jLabelfecha_entradaControlVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlVehiculoConstantesFunciones.FECHASALIDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlVehiculo.jLabelfecha_salidaControlVehiculo,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlVehiculo.jLabelid_empresaControlVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlVehiculo.jLabelnombre_conductorControlVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlVehiculo.jLabelnumero_placaControlVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlVehiculo.jLabelfecha_entradaControlVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlVehiculo.jLabelfecha_salidaControlVehiculo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoControlVehiculo--;	
		
		
		this.controlvehiculoAux=new ControlVehiculo();
		
		this.controlvehiculoAux.setId(this.iIdNuevoControlVehiculo);
		this.controlvehiculoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.controlvehiculoLogic.getControlVehiculos().add(this.controlvehiculoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.controlvehiculos.add(this.controlvehiculoAux);
		}
		//ARCHITECTURE
		
		this.controlvehiculo=this.controlvehiculoAux;
		
		if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioControlVehiculo(this.controlvehiculo);
			this.setVariablesObjetoActualToFormularioForeignKeyControlVehiculo(this.controlvehiculo);
		}
				
		//this.setDefaultControlesControlVehiculo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyControlVehiculo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyControlVehiculo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyControlVehiculo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualControlVehiculo(this.controlvehiculoBean,this.controlvehiculo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ControlVehiculoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.controlvehiculoSessionBean.getConGuardarRelaciones()) {
			classes=ControlVehiculoConstantesFunciones.getClassesRelationshipsOfControlVehiculo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.controlvehiculoReturnGeneral=controlvehiculoLogic.procesarEventosControlVehiculosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.controlvehiculoLogic.getControlVehiculos(),this.controlvehiculo,this.controlvehiculoParameterGeneral,this.isEsNuevoControlVehiculo,classes);//this.controlvehiculoLogic.getControlVehiculo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanControlVehiculo(this.controlvehiculoReturnGeneral,this.controlvehiculoBean,false);
		
		if(this.controlvehiculoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyControlVehiculo(this.controlvehiculoReturnGeneral.getControlVehiculo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioControlVehiculo(this.controlvehiculoReturnGeneral.getControlVehiculo());
		}
		
		if(this.controlvehiculoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioControlVehiculo(this.controlvehiculoReturnGeneral.getControlVehiculo(),classes);//this.controlvehiculoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualControlVehiculo(this.controlvehiculo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyControlVehiculo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyControlVehiculo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ControlVehiculoBeanSwingJInternalFrameAdditional.RecargarFormControlVehiculo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingControlVehiculo(false);
						
			if(controlvehiculoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualControlVehiculo();
			}
			
			this.actualizarVisualTableDatosControlVehiculo();
			
			this.jTableDatosControlVehiculo.setRowSelectionInterval(this.getIndiceNuevoControlVehiculo(), this.getIndiceNuevoControlVehiculo());
			
			this.seleccionarFilaTablaControlVehiculoActual();
						
			this.actualizarEstadoCeldasBotonesControlVehiculo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesControlVehiculo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormControlVehiculo.jTextAreanombre_conductorControlVehiculo.setEnabled(isHabilitar && this.controlvehiculoConstantesFunciones.activarnombre_conductorControlVehiculo);
		this.jInternalFrameDetalleFormControlVehiculo.jTextAreanumero_placaControlVehiculo.setEnabled(isHabilitar && this.controlvehiculoConstantesFunciones.activarnumero_placaControlVehiculo);
		this.jInternalFrameDetalleFormControlVehiculo.jDateChooserfecha_entradaControlVehiculo.setEnabled(isHabilitar && this.controlvehiculoConstantesFunciones.activarfecha_entradaControlVehiculo);
		this.jInternalFrameDetalleFormControlVehiculo.jDateChooserfecha_salidaControlVehiculo.setEnabled(isHabilitar && this.controlvehiculoConstantesFunciones.activarfecha_salidaControlVehiculo);	
		//
		this.jInternalFrameDetalleFormControlVehiculo.jComboBoxid_empresaControlVehiculo.setEnabled(isHabilitar && this.controlvehiculoConstantesFunciones.activarid_empresaControlVehiculo);
	};
	
	public void setDefaultControlesControlVehiculo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoControlVehiculo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.controlvehiculoSessionBean.setConGuardarRelaciones(true);			
			this.controlvehiculoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormControlVehiculo.jTabbedPaneRelacionesControlVehiculo.setVisible(true);
			
					
		} else {
			//this.controlvehiculoSessionBean.setConGuardarRelaciones(false);			
			this.controlvehiculoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormControlVehiculo.jTabbedPaneRelacionesControlVehiculo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoControlVehiculo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ControlVehiculo controlvehiculoAux:this.controlvehiculoLogic.getControlVehiculos()) {
				if(controlvehiculoAux.getId().equals(this.iIdNuevoControlVehiculo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ControlVehiculo controlvehiculoAux:this.controlvehiculos) {
				if(controlvehiculoAux.getId().equals(this.iIdNuevoControlVehiculo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualControlVehiculo(ControlVehiculo controlvehiculo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ControlVehiculo controlvehiculoAux:this.controlvehiculoLogic.getControlVehiculos()) {
				if(controlvehiculoAux.getId().equals(controlvehiculo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ControlVehiculo controlvehiculoAux:this.controlvehiculos) {
				if(controlvehiculoAux.getId().equals(controlvehiculo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalControlVehiculo(ControlVehiculo controlvehiculoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ControlVehiculo controlvehiculoAux:this.controlvehiculoLogic.getControlVehiculos()) {
				if(controlvehiculoAux.getControlVehiculoOriginal().getId().equals(controlvehiculoOriginal.getId())) {
					existe=true;
					controlvehiculoOriginal.setId(controlvehiculoAux.getId());
					controlvehiculoOriginal.setVersionRow(controlvehiculoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ControlVehiculo controlvehiculoAux:this.controlvehiculos) {
				if(controlvehiculoAux.getControlVehiculoOriginal().getId().equals(controlvehiculoOriginal.getId())) {
					existe=true;
					controlvehiculoOriginal.setId(controlvehiculoAux.getId());
					controlvehiculoOriginal.setVersionRow(controlvehiculoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosControlVehiculo(Boolean esParaCancelar) throws Exception {
		controlvehiculosAux=new ArrayList<ControlVehiculo>();
		controlvehiculoAux=new ControlVehiculo();
		
		if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ControlVehiculo controlvehiculoAux:this.controlvehiculoLogic.getControlVehiculos()) {
					if(controlvehiculoAux.getId()<0) {
						controlvehiculosAux.add(controlvehiculoAux);
					}		
				}
				this.iIdNuevoControlVehiculo=0L;
				this.controlvehiculoLogic.getControlVehiculos().removeAll(controlvehiculosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ControlVehiculo controlvehiculoAux:this.controlvehiculos) {
					if(controlvehiculoAux.getId()<0) {
						controlvehiculosAux.add(controlvehiculoAux);
					}		
				}
				this.iIdNuevoControlVehiculo=0L;
				this.controlvehiculos.removeAll(controlvehiculosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoControlVehiculo 
					&& this.controlvehiculoLogic.getControlVehiculos().size()>0
					) {
					controlvehiculoAux=this.controlvehiculoLogic.getControlVehiculos().get(this.controlvehiculoLogic.getControlVehiculos().size() - 1);
				
					if(controlvehiculoAux.getId()<0) {
						this.controlvehiculoLogic.getControlVehiculos().remove(controlvehiculoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoControlVehiculo && this.controlvehiculos.size()>0) {
					controlvehiculoAux=this.controlvehiculos.get(this.controlvehiculos.size() - 1);
				
					if(controlvehiculoAux.getId()<0) {
						this.controlvehiculos.remove(controlvehiculoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoControlVehiculo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(controlvehiculo.getId()<0) {
				this.controlvehiculoLogic.getControlVehiculos().remove(this.controlvehiculo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(controlvehiculo.getId()<0) {
				this.controlvehiculos.remove(this.controlvehiculo);
			}
		}			
	}
	
	public void setEstadosInicialesControlVehiculo(List<ControlVehiculo> controlvehiculosAux) throws Exception {
		ControlVehiculoConstantesFunciones.setEstadosInicialesControlVehiculo(controlvehiculosAux);
	}
	
	public void setEstadosInicialesControlVehiculo(ControlVehiculo controlvehiculoAux) throws Exception {
		ControlVehiculoConstantesFunciones.setEstadosInicialesControlVehiculo(controlvehiculoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarControlVehiculoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesControlVehiculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarControlVehiculoActual()) {
				if(!this.isEsNuevoControlVehiculo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesControlVehiculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoControlVehiculo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarControlVehiculoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Control Vehiculo ?", "MANTENIMIENTO DE Control Vehiculo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesControlVehiculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ControlVehiculo controlvehiculo) throws Exception {
		ControlVehiculoConstantesFunciones.seleccionarAsignar(this.controlvehiculo,controlvehiculo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarControlVehiculo=this.isPermisoActualizarOriginalControlVehiculo;
			
			
			this.seleccionarAsignar(controlvehiculo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ControlVehiculoConstantesFunciones.quitarEspaciosControlVehiculo(this.controlvehiculo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesControlVehiculo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.controlvehiculoSessionBean.setsFuncionBusquedaRapida(this.controlvehiculoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoControlVehiculo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosControlVehiculo(esParaCancelar);				
				this.cancelarNuevoControlVehiculo(esParaCancelar);								
			}
			
			this.controlvehiculo=new ControlVehiculo();
			
			this.inicializarControlVehiculo();
			
			this.actualizarEstadoCeldasBotonesControlVehiculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarControlVehiculo() throws Exception {
		try {
			ControlVehiculoConstantesFunciones.inicializarControlVehiculo(this.controlvehiculo);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.controlvehiculoLogic.getControlVehiculos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteControlVehiculos(String sAccionBusqueda,List<ControlVehiculo> controlvehiculosParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="ControlVehiculo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ControlVehiculoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ControlVehiculoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ControlVehiculo"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Control Vehiculoes");		
		parameters.put("busquedapor", ControlVehiculoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceControlVehiculo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ControlVehiculoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ControlVehiculoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceControlVehiculo=new JRBeanArrayDataSource(ControlVehiculoJInternalFrame.TraerControlVehiculoBeans(controlvehiculosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceControlVehiculo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ControlVehiculoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ControlVehiculoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ControlVehiculoBean.TraerControlVehiculoBeans(controlvehiculosParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteControlVehiculos(sAccionBusqueda,sTipoArchivoReporte,controlvehiculosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalControlVehiculos(sAccionBusqueda,sTipoArchivoReporte,controlvehiculosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoControlVehiculoActionPerformed(null);
					//this.generarExcelReporteControlVehiculos(sAccionBusqueda,sTipoArchivoReporte,controlvehiculosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalControlVehiculos(sAccionBusqueda,sTipoArchivoReporte,controlvehiculosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesControlVehiculos(sAccionBusqueda,sTipoArchivoReporte,controlvehiculosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesControlVehiculos(sAccionBusqueda,sTipoArchivoReporte,controlvehiculosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteControlVehiculos(String sAccionBusqueda,String sTipoArchivoReporte,List<ControlVehiculo> controlvehiculosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"controlvehiculo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ControlVehiculos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderControlVehiculo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ControlVehiculo controlvehiculo : controlvehiculosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ControlVehiculoConstantesFunciones.generarExcelReporteDataControlVehiculo("NORMAL",row,workbook,controlvehiculo,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Control Vehiculo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderControlVehiculo(String sTipo,Row row,Workbook workbook) {
		
		ControlVehiculoConstantesFunciones.generarExcelReporteHeaderControlVehiculo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalControlVehiculos(String sAccionBusqueda,String sTipoArchivoReporte,List<ControlVehiculo> controlvehiculosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"controlvehiculo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ControlVehiculos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ControlVehiculo controlvehiculo : controlvehiculosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ControlVehiculoConstantesFunciones.getControlVehiculoDescripcion(controlvehiculo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlVehiculoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlvehiculo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlvehiculo.getnombre_conductor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlvehiculo.getnumero_placa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlvehiculo.getfecha_entrada());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlvehiculo.getfecha_salida());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Control Vehiculo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesControlVehiculos(String sAccionBusqueda,String sTipoArchivoReporte,List<ControlVehiculo> controlvehiculosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ControlVehiculo> controlvehiculosRespaldo=null;
		
		classes=ControlVehiculoConstantesFunciones.getClassesRelationshipsOfControlVehiculo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.controlvehiculoLogic.setDatosCliente(this.datosCliente);
		this.controlvehiculoLogic.setDatosDeep(this.datosDeep);
		this.controlvehiculoLogic.setIsConDeep(true);
		
		controlvehiculosRespaldo=this.controlvehiculoLogic.getControlVehiculos();
		
		this.controlvehiculoLogic.setControlVehiculos(controlvehiculosParaReportes);	
		this.controlvehiculoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		controlvehiculosParaReportes=this.controlvehiculoLogic.getControlVehiculos();
		this.controlvehiculoLogic.setControlVehiculos(controlvehiculosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"controlvehiculo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ControlVehiculos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderControlVehiculo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ControlVehiculo controlvehiculo : controlvehiculosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderControlVehiculo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ControlVehiculoConstantesFunciones.generarExcelReporteDataControlVehiculo("NORMAL",row,workbook,controlvehiculo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ControlVehiculoConstantesFunciones.getControlVehiculoDescripcion(controlvehiculo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Control Vehiculo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoControlVehiculo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoControlVehiculo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoControlVehiculo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoControlVehiculo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessControlVehiculo() throws Exception {		
		this.startProcessControlVehiculo(true);
	}
	
	public void startProcessControlVehiculo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasControlVehiculo ,this.jPanelParametrosReportesControlVehiculo, this.jScrollPanelDatosControlVehiculo,this.jPanelPaginacionControlVehiculo, this.jScrollPanelDatosEdicionControlVehiculo, this.jPanelAccionesControlVehiculo,this.jPanelAccionesFormularioControlVehiculo,this.jmenuBarControlVehiculo,this.jmenuBarDetalleControlVehiculo,this.jTtoolBarControlVehiculo,this.jTtoolBarDetalleControlVehiculo);		
		
		final JTabbedPane jTabbedPaneBusquedasControlVehiculo=this.jTabbedPaneBusquedasControlVehiculo; 
		
		final JPanel jPanelParametrosReportesControlVehiculo=this.jPanelParametrosReportesControlVehiculo;
		//final JScrollPane jScrollPanelDatosControlVehiculo=this.jScrollPanelDatosControlVehiculo;
		final JTable jTableDatosControlVehiculo=this.jTableDatosControlVehiculo;		
		final JPanel jPanelPaginacionControlVehiculo=this.jPanelPaginacionControlVehiculo;
		//final JScrollPane jScrollPanelDatosEdicionControlVehiculo=this.jScrollPanelDatosEdicionControlVehiculo;
		final JPanel jPanelAccionesControlVehiculo=this.jPanelAccionesControlVehiculo;
		
		JPanel jPanelCamposAuxiliarControlVehiculo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarControlVehiculo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
			jPanelCamposAuxiliarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jPanelCamposControlVehiculo;
			jPanelAccionesFormularioAuxiliarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jPanelAccionesFormularioControlVehiculo;
		}
		
		final JPanel jPanelCamposControlVehiculo=jPanelCamposAuxiliarControlVehiculo;
		final JPanel jPanelAccionesFormularioControlVehiculo=jPanelAccionesFormularioAuxiliarControlVehiculo;
		
		
		final JMenuBar jmenuBarControlVehiculo=this.jmenuBarControlVehiculo;
		final JToolBar jTtoolBarControlVehiculo=this.jTtoolBarControlVehiculo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarControlVehiculo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarControlVehiculo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
			jmenuBarDetalleAuxiliarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jmenuBarDetalleControlVehiculo;
			jTtoolBarDetalleAuxiliarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jTtoolBarDetalleControlVehiculo;
		}
		
		final JMenuBar jmenuBarDetalleControlVehiculo=jmenuBarDetalleAuxiliarControlVehiculo;
		final JToolBar jTtoolBarDetalleControlVehiculo=jTtoolBarDetalleAuxiliarControlVehiculo;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasControlVehiculo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesControlVehiculo;
			processRunnable.jTableDatos=jTableDatosControlVehiculo;
			processRunnable.jPanelCampos=jPanelCamposControlVehiculo;
			processRunnable.jPanelPaginacion=jPanelPaginacionControlVehiculo;
			processRunnable.jPanelAcciones=jPanelAccionesControlVehiculo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioControlVehiculo;
			
			
			processRunnable.jmenuBar=jmenuBarControlVehiculo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleControlVehiculo;
			processRunnable.jTtoolBar=jTtoolBarControlVehiculo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleControlVehiculo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasControlVehiculo ,jPanelParametrosReportesControlVehiculo,jTableDatosControlVehiculo, /*jScrollPanelDatosControlVehiculo,*/jPanelCamposControlVehiculo,jPanelPaginacionControlVehiculo, /*jScrollPanelDatosEdicionControlVehiculo,*/ jPanelAccionesControlVehiculo,jPanelAccionesFormularioControlVehiculo,jmenuBarControlVehiculo,jmenuBarDetalleControlVehiculo,jTtoolBarControlVehiculo,jTtoolBarDetalleControlVehiculo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasControlVehiculo ,jPanelParametrosReportesControlVehiculo, jScrollPanelDatosControlVehiculo,jPanelPaginacionControlVehiculo, jScrollPanelDatosEdicionControlVehiculo, jPanelAccionesControlVehiculo,jPanelAccionesFormularioControlVehiculo,jmenuBarControlVehiculo,jmenuBarDetalleControlVehiculo,jTtoolBarControlVehiculo,jTtoolBarDetalleControlVehiculo);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessControlVehiculo() {// throws Exception 
		this.finishProcessControlVehiculo(true);
	}
	
	public void finishProcessControlVehiculo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasControlVehiculo ,this.jPanelParametrosReportesControlVehiculo, this.jScrollPanelDatosControlVehiculo,this.jPanelPaginacionControlVehiculo, this.jScrollPanelDatosEdicionControlVehiculo, this.jPanelAccionesControlVehiculo,this.jPanelAccionesFormularioControlVehiculo,this.jmenuBarControlVehiculo,this.jmenuBarDetalleControlVehiculo,this.jTtoolBarControlVehiculo,this.jTtoolBarDetalleControlVehiculo);		
		
		final JTabbedPane jTabbedPaneBusquedasControlVehiculo=this.jTabbedPaneBusquedasControlVehiculo; 
		
		final JPanel jPanelParametrosReportesControlVehiculo=this.jPanelParametrosReportesControlVehiculo;
		//final JScrollPane jScrollPanelDatosControlVehiculo=this.jScrollPanelDatosControlVehiculo;
		final JTable jTableDatosControlVehiculo=this.jTableDatosControlVehiculo;		
		final JPanel jPanelPaginacionControlVehiculo=this.jPanelPaginacionControlVehiculo;
		//final JScrollPane jScrollPanelDatosEdicionControlVehiculo=this.jScrollPanelDatosEdicionControlVehiculo;
		final JPanel jPanelAccionesControlVehiculo=this.jPanelAccionesControlVehiculo;
		
		JPanel jPanelCamposAuxiliarControlVehiculo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarControlVehiculo=new JPanel();
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
			jPanelCamposAuxiliarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jPanelCamposControlVehiculo;
			jPanelAccionesFormularioAuxiliarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jPanelAccionesFormularioControlVehiculo;
		}
		
		final JPanel jPanelCamposControlVehiculo=jPanelCamposAuxiliarControlVehiculo;
		final JPanel jPanelAccionesFormularioControlVehiculo=jPanelAccionesFormularioAuxiliarControlVehiculo;
		
		
		final JMenuBar jmenuBarControlVehiculo=this.jmenuBarControlVehiculo;		
		final JToolBar jTtoolBarControlVehiculo=this.jTtoolBarControlVehiculo;
				
		JMenuBar jmenuBarDetalleAuxiliarControlVehiculo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarControlVehiculo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
			jmenuBarDetalleAuxiliarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jmenuBarDetalleControlVehiculo;
			jTtoolBarDetalleAuxiliarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jTtoolBarDetalleControlVehiculo;		
		}
		
		final JMenuBar jmenuBarDetalleControlVehiculo=jmenuBarDetalleAuxiliarControlVehiculo;
		final JToolBar jTtoolBarDetalleControlVehiculo=jTtoolBarDetalleAuxiliarControlVehiculo;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasControlVehiculo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesControlVehiculo;
			processRunnable.jTableDatos=jTableDatosControlVehiculo;
			processRunnable.jPanelCampos=jPanelCamposControlVehiculo;
			processRunnable.jPanelPaginacion=jPanelPaginacionControlVehiculo;
			processRunnable.jPanelAcciones=jPanelAccionesControlVehiculo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioControlVehiculo;
			
			
			processRunnable.jmenuBar=jmenuBarControlVehiculo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleControlVehiculo;
			processRunnable.jTtoolBar=jTtoolBarControlVehiculo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleControlVehiculo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasControlVehiculo ,jPanelParametrosReportesControlVehiculo, jTableDatosControlVehiculo,/*jScrollPanelDatosControlVehiculo,*/jPanelCamposControlVehiculo,jPanelPaginacionControlVehiculo, /*jScrollPanelDatosEdicionControlVehiculo,*/ jPanelAccionesControlVehiculo,jPanelAccionesFormularioControlVehiculo,jmenuBarControlVehiculo,jmenuBarDetalleControlVehiculo,jTtoolBarControlVehiculo,jTtoolBarDetalleControlVehiculo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesControlVehiculo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarControlVehiculo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuControlVehiculo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarControlVehiculo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarControlVehiculo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleControlVehiculo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuControlVehiculo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarControlVehiculo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleControlVehiculo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.controlvehiculoConstantesFunciones.getsFinalQueryControlVehiculo();
		String  finalQueryPaginacionTodos=this.controlvehiculoConstantesFunciones.getsFinalQueryControlVehiculo();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=ControlVehiculoConstantesFunciones.getArrayColumnasGlobalesNoControlVehiculo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ControlVehiculoConstantesFunciones.getArrayColumnasGlobalesControlVehiculo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ControlVehiculoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.controlvehiculosEliminados= new ArrayList<ControlVehiculo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessControlVehiculo();
		
				///*ControlVehiculoSessionBean*/this.controlvehiculoSessionBean=new ControlVehiculoSessionBean();
			
			if(this.controlvehiculoSessionBean==null) {
				this.controlvehiculoSessionBean=new ControlVehiculoSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=ControlVehiculoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ControlVehiculoConstantesFunciones.getClassesForeignKeysOfControlVehiculo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/controlvehiculo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			controlvehiculosAux= new ArrayList<ControlVehiculo>();
			
				
			controlvehiculoLogic.setDatosCliente(this.datosCliente);
			controlvehiculoLogic.setDatosDeep(this.datosDeep);
			controlvehiculoLogic.setIsConDeep(true);
			
			
			controlvehiculoLogic.getControlVehiculoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					controlvehiculoLogic.getTodosControlVehiculos(finalQueryGlobal,pagination);
					
					//controlvehiculoLogic.getTodosControlVehiculosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(controlvehiculoLogic.getControlVehiculos()==null|| controlvehiculoLogic.getControlVehiculos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							controlvehiculosAux= new ArrayList<ControlVehiculo>();
							controlvehiculosAux.addAll(controlvehiculoLogic.getControlVehiculos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							controlvehiculosAux= new ArrayList<ControlVehiculo>();
							controlvehiculosAux.addAll(controlvehiculos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							controlvehiculoLogic.getTodosControlVehiculos(finalQueryGlobal+"",this.pagination);												
							
							//controlvehiculoLogic.getTodosControlVehiculosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteControlVehiculos("Todos",controlvehiculoLogic.getControlVehiculos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							controlvehiculoLogic.setControlVehiculos(new ArrayList<ControlVehiculo>());					
							controlvehiculoLogic.getControlVehiculos().addAll(controlvehiculosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							controlvehiculos=new ArrayList<ControlVehiculo>();
							controlvehiculos.addAll(controlvehiculosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idControlVehiculo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idControlVehiculo=this.idActual;
				
				} else if(this.idControlVehiculoActual!=null && this.idControlVehiculoActual!=0L) {
					idControlVehiculo=idControlVehiculoActual;
				}
				
					
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndicePorId(idControlVehiculo);
				
				this.controlvehiculos=new ArrayList<ControlVehiculo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					controlvehiculoLogic.getEntity(idControlVehiculo);
					
					//controlvehiculoLogic.getEntityWithConnection(idControlVehiculo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					controlvehiculoLogic.setControlVehiculos(new ArrayList<ControlVehiculo>());
					controlvehiculoLogic.getControlVehiculos().add(controlvehiculoLogic.getControlVehiculo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.controlvehiculos=new ArrayList<ControlVehiculo>();
					this.controlvehiculos.add(controlvehiculo);
				}
				
				if(controlvehiculoLogic.getControlVehiculo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorFechaEntrada")) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorFechaEntrada(fecha_entradaBusquedaPorFechaEntrada);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					controlvehiculoLogic.getControlVehiculosBusquedaPorFechaEntrada(finalQueryGlobal,pagination,fecha_entradaBusquedaPorFechaEntrada);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorFechaEntrada(fecha_entradaBusquedaPorFechaEntrada);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorFechaEntrada(fecha_entradaBusquedaPorFechaEntrada);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=controlvehiculoLogic.getControlVehiculos()==null||controlvehiculoLogic.getControlVehiculos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=controlvehiculos==null|| controlvehiculos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						controlvehiculosAux=new ArrayList<ControlVehiculo>();
						controlvehiculosAux.addAll(controlvehiculoLogic.getControlVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							controlvehiculosAux=new ArrayList<ControlVehiculo>();
							controlvehiculosAux.addAll(controlvehiculos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							controlvehiculoLogic.getControlVehiculosBusquedaPorFechaEntrada(finalQueryGlobal,pagination,fecha_entradaBusquedaPorFechaEntrada);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorFechaEntrada(fecha_entradaBusquedaPorFechaEntrada);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorFechaEntrada(fecha_entradaBusquedaPorFechaEntrada);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteControlVehiculos("BusquedaPorFechaEntrada",controlvehiculoLogic.getControlVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteControlVehiculos("BusquedaPorFechaEntrada",controlvehiculos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						controlvehiculoLogic.setControlVehiculos(new ArrayList<ControlVehiculo>());
						controlvehiculoLogic.getControlVehiculos().addAll(controlvehiculosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							controlvehiculos=new ArrayList<ControlVehiculo>();
							controlvehiculos.addAll(controlvehiculosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorFechaSalida")) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorFechaSalida(fecha_salidaBusquedaPorFechaSalida);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					controlvehiculoLogic.getControlVehiculosBusquedaPorFechaSalida(finalQueryGlobal,pagination,fecha_salidaBusquedaPorFechaSalida);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorFechaSalida(fecha_salidaBusquedaPorFechaSalida);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorFechaSalida(fecha_salidaBusquedaPorFechaSalida);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=controlvehiculoLogic.getControlVehiculos()==null||controlvehiculoLogic.getControlVehiculos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=controlvehiculos==null|| controlvehiculos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						controlvehiculosAux=new ArrayList<ControlVehiculo>();
						controlvehiculosAux.addAll(controlvehiculoLogic.getControlVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							controlvehiculosAux=new ArrayList<ControlVehiculo>();
							controlvehiculosAux.addAll(controlvehiculos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							controlvehiculoLogic.getControlVehiculosBusquedaPorFechaSalida(finalQueryGlobal,pagination,fecha_salidaBusquedaPorFechaSalida);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorFechaSalida(fecha_salidaBusquedaPorFechaSalida);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorFechaSalida(fecha_salidaBusquedaPorFechaSalida);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteControlVehiculos("BusquedaPorFechaSalida",controlvehiculoLogic.getControlVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteControlVehiculos("BusquedaPorFechaSalida",controlvehiculos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						controlvehiculoLogic.setControlVehiculos(new ArrayList<ControlVehiculo>());
						controlvehiculoLogic.getControlVehiculos().addAll(controlvehiculosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							controlvehiculos=new ArrayList<ControlVehiculo>();
							controlvehiculos.addAll(controlvehiculosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombreConductor")) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorNombreConductor(nombre_conductorBusquedaPorNombreConductor);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					controlvehiculoLogic.getControlVehiculosBusquedaPorNombreConductor(finalQueryGlobal,pagination,nombre_conductorBusquedaPorNombreConductor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorNombreConductor(nombre_conductorBusquedaPorNombreConductor);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorNombreConductor(nombre_conductorBusquedaPorNombreConductor);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=controlvehiculoLogic.getControlVehiculos()==null||controlvehiculoLogic.getControlVehiculos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=controlvehiculos==null|| controlvehiculos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						controlvehiculosAux=new ArrayList<ControlVehiculo>();
						controlvehiculosAux.addAll(controlvehiculoLogic.getControlVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							controlvehiculosAux=new ArrayList<ControlVehiculo>();
							controlvehiculosAux.addAll(controlvehiculos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							controlvehiculoLogic.getControlVehiculosBusquedaPorNombreConductor(finalQueryGlobal,pagination,nombre_conductorBusquedaPorNombreConductor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorNombreConductor(nombre_conductorBusquedaPorNombreConductor);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorNombreConductor(nombre_conductorBusquedaPorNombreConductor);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteControlVehiculos("BusquedaPorNombreConductor",controlvehiculoLogic.getControlVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteControlVehiculos("BusquedaPorNombreConductor",controlvehiculos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						controlvehiculoLogic.setControlVehiculos(new ArrayList<ControlVehiculo>());
						controlvehiculoLogic.getControlVehiculos().addAll(controlvehiculosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							controlvehiculos=new ArrayList<ControlVehiculo>();
							controlvehiculos.addAll(controlvehiculosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNumeroPlaca")) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorNumeroPlaca(numero_placaBusquedaPorNumeroPlaca);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					controlvehiculoLogic.getControlVehiculosBusquedaPorNumeroPlaca(finalQueryGlobal,pagination,numero_placaBusquedaPorNumeroPlaca);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorNumeroPlaca(numero_placaBusquedaPorNumeroPlaca);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorNumeroPlaca(numero_placaBusquedaPorNumeroPlaca);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=controlvehiculoLogic.getControlVehiculos()==null||controlvehiculoLogic.getControlVehiculos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=controlvehiculos==null|| controlvehiculos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						controlvehiculosAux=new ArrayList<ControlVehiculo>();
						controlvehiculosAux.addAll(controlvehiculoLogic.getControlVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							controlvehiculosAux=new ArrayList<ControlVehiculo>();
							controlvehiculosAux.addAll(controlvehiculos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							controlvehiculoLogic.getControlVehiculosBusquedaPorNumeroPlaca(finalQueryGlobal,pagination,numero_placaBusquedaPorNumeroPlaca);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorNumeroPlaca(numero_placaBusquedaPorNumeroPlaca);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceBusquedaPorNumeroPlaca(numero_placaBusquedaPorNumeroPlaca);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteControlVehiculos("BusquedaPorNumeroPlaca",controlvehiculoLogic.getControlVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteControlVehiculos("BusquedaPorNumeroPlaca",controlvehiculos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						controlvehiculoLogic.setControlVehiculos(new ArrayList<ControlVehiculo>());
						controlvehiculoLogic.getControlVehiculos().addAll(controlvehiculosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							controlvehiculos=new ArrayList<ControlVehiculo>();
							controlvehiculos.addAll(controlvehiculosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					controlvehiculoLogic.getControlVehiculosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=controlvehiculoLogic.getControlVehiculos()==null||controlvehiculoLogic.getControlVehiculos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=controlvehiculos==null|| controlvehiculos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						controlvehiculosAux=new ArrayList<ControlVehiculo>();
						controlvehiculosAux.addAll(controlvehiculoLogic.getControlVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							controlvehiculosAux=new ArrayList<ControlVehiculo>();
							controlvehiculosAux.addAll(controlvehiculos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							controlvehiculoLogic.getControlVehiculosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ControlVehiculoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteControlVehiculos("FK_IdEmpresa",controlvehiculoLogic.getControlVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteControlVehiculos("FK_IdEmpresa",controlvehiculos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						controlvehiculoLogic.setControlVehiculos(new ArrayList<ControlVehiculo>());
						controlvehiculoLogic.getControlVehiculos().addAll(controlvehiculosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							controlvehiculos=new ArrayList<ControlVehiculo>();
							controlvehiculos.addAll(controlvehiculosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesControlVehiculo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessControlVehiculo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=controlvehiculoLogic.getControlVehiculos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=controlvehiculos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=controlvehiculoLogic.getControlVehiculos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=controlvehiculos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ControlVehiculo controlvehiculo) {
		Boolean permite=true;
		
		if(this.controlvehiculo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ControlVehiculoConstantesFunciones.getOrderByListaControlVehiculo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ControlVehiculoConstantesFunciones.getOrderByListaControlVehiculo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ControlVehiculo controlvehiculo:controlvehiculoLogic.getControlVehiculos()) {
				if(controlvehiculo.getsType().equals(Constantes2.S_TOTALES)) {
					controlvehiculoTotales=controlvehiculo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ControlVehiculo controlvehiculo:this.controlvehiculos) {
				if(controlvehiculo.getsType().equals(Constantes2.S_TOTALES)) {
					controlvehiculoTotales=controlvehiculo;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.controlvehiculoAux=new ControlVehiculo();
			this.controlvehiculoAux.setsType(Constantes2.S_TOTALES);
			this.controlvehiculoAux.setIsNew(false);
			this.controlvehiculoAux.setIsChanged(false);
			this.controlvehiculoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ControlVehiculoConstantesFunciones.TotalizarValoresFilaControlVehiculo(this.controlvehiculoLogic.getControlVehiculos(),this.controlvehiculoAux);
				
				this.controlvehiculoLogic.getControlVehiculos().add(this.controlvehiculoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ControlVehiculoConstantesFunciones.TotalizarValoresFilaControlVehiculo(this.controlvehiculos,this.controlvehiculoAux);
				
				this.controlvehiculos.add(this.controlvehiculoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		controlvehiculoTotales=new ControlVehiculo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.controlvehiculoLogic.getControlVehiculos().remove(controlvehiculoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.controlvehiculos.remove(controlvehiculoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		controlvehiculoTotales=new ControlVehiculo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ControlVehiculo controlvehiculo:controlvehiculoLogic.getControlVehiculos()) {
				if(controlvehiculo.getsType().equals(Constantes2.S_TOTALES)) {
					controlvehiculoTotales=controlvehiculo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ControlVehiculoConstantesFunciones.TotalizarValoresFilaControlVehiculo(this.controlvehiculoLogic.getControlVehiculos(),controlvehiculoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ControlVehiculo controlvehiculo:this.controlvehiculos) {
				if(controlvehiculo.getsType().equals(Constantes2.S_TOTALES)) {
					controlvehiculoTotales=controlvehiculo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ControlVehiculoConstantesFunciones.TotalizarValoresFilaControlVehiculo(this.controlvehiculos,controlvehiculoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getControlVehiculosBusquedaPorFechaEntrada()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorFechaEntrada";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getControlVehiculosBusquedaPorFechaSalida()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorFechaSalida";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getControlVehiculosBusquedaPorNombreConductor()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombreConductor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getControlVehiculosBusquedaPorNumeroPlaca()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNumeroPlaca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getControlVehiculosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getControlVehiculosBusquedaPorFechaEntrada(String sFinalQuery,Date fecha_entrada)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					controlvehiculoLogic.getControlVehiculosBusquedaPorFechaEntrada(sFinalQuery,this.pagination,fecha_entrada);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getControlVehiculosBusquedaPorFechaSalida(String sFinalQuery,Date fecha_salida)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					controlvehiculoLogic.getControlVehiculosBusquedaPorFechaSalida(sFinalQuery,this.pagination,fecha_salida);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getControlVehiculosBusquedaPorNombreConductor(String sFinalQuery,String nombre_conductor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					controlvehiculoLogic.getControlVehiculosBusquedaPorNombreConductor(sFinalQuery,this.pagination,nombre_conductor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getControlVehiculosBusquedaPorNumeroPlaca(String sFinalQuery,String numero_placa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					controlvehiculoLogic.getControlVehiculosBusquedaPorNumeroPlaca(sFinalQuery,this.pagination,numero_placa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getControlVehiculosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					controlvehiculoLogic.getControlVehiculosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosControlVehiculo() {
		this.isPermisoTodoControlVehiculo=false;
		this.isPermisoNuevoControlVehiculo=false;
		this.isPermisoActualizarControlVehiculo=false;
		this.isPermisoActualizarOriginalControlVehiculo=false;
		this.isPermisoEliminarControlVehiculo=false;
		this.isPermisoGuardarCambiosControlVehiculo=false;
		this.isPermisoConsultaControlVehiculo=false;
		this.isPermisoBusquedaControlVehiculo=false;
		this.isPermisoReporteControlVehiculo=false;		
		this.isPermisoOrdenControlVehiculo=false;		
		this.isPermisoPaginacionMedioControlVehiculo=false;		
		this.isPermisoPaginacionAltoControlVehiculo=false;
		this.isPermisoPaginacionTodoControlVehiculo=false;
		this.isPermisoCopiarControlVehiculo=false;		
		this.isPermisoVerFormControlVehiculo=false;		
		this.isPermisoDuplicarControlVehiculo=false;		
		this.isPermisoOrdenControlVehiculo=false;		
	}
	
	public void setPermisosUsuarioControlVehiculo(Boolean isPermiso) {
		this.isPermisoTodoControlVehiculo=isPermiso;
		this.isPermisoNuevoControlVehiculo=isPermiso;
		this.isPermisoActualizarControlVehiculo=isPermiso;
		this.isPermisoActualizarOriginalControlVehiculo=isPermiso;
		this.isPermisoEliminarControlVehiculo=isPermiso;
		this.isPermisoGuardarCambiosControlVehiculo=isPermiso;
		this.isPermisoConsultaControlVehiculo=isPermiso;
		this.isPermisoBusquedaControlVehiculo=isPermiso;
		this.isPermisoReporteControlVehiculo=isPermiso;
		this.isPermisoOrdenControlVehiculo=isPermiso;		
		this.isPermisoPaginacionMedioControlVehiculo=isPermiso;		
		this.isPermisoPaginacionAltoControlVehiculo=isPermiso;		
		this.isPermisoPaginacionTodoControlVehiculo=isPermiso;		
		this.isPermisoCopiarControlVehiculo=isPermiso;		
		this.isPermisoVerFormControlVehiculo=isPermiso;		
		this.isPermisoDuplicarControlVehiculo=isPermiso;
		this.isPermisoOrdenControlVehiculo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioControlVehiculo(Boolean isPermiso) {
		//this.isPermisoTodoControlVehiculo=isPermiso;
		this.isPermisoNuevoControlVehiculo=isPermiso;
		this.isPermisoActualizarControlVehiculo=isPermiso;
		this.isPermisoActualizarOriginalControlVehiculo=isPermiso;
		this.isPermisoEliminarControlVehiculo=isPermiso;
		this.isPermisoGuardarCambiosControlVehiculo=isPermiso;
		//this.isPermisoConsultaControlVehiculo=isPermiso;
		//this.isPermisoBusquedaControlVehiculo=isPermiso;
		//this.isPermisoReporteControlVehiculo=isPermiso;
		//this.isPermisoOrdenControlVehiculo=isPermiso;		
		//this.isPermisoPaginacionMedioControlVehiculo=isPermiso;		
		//this.isPermisoPaginacionAltoControlVehiculo=isPermiso;		
		//this.isPermisoPaginacionTodoControlVehiculo=isPermiso;		
		//this.isPermisoCopiarControlVehiculo=isPermiso;		
		//this.isPermisoDuplicarControlVehiculo=isPermiso;
		//this.isPermisoOrdenControlVehiculo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioControlVehiculoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ControlVehiculoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebControlVehiculo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioControlVehiculoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioControlVehiculoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionControlVehiculoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioControlVehiculoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioControlVehiculo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ControlVehiculoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ControlVehiculoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoControlVehiculo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarControlVehiculo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalControlVehiculo=this.isPermisoActualizarControlVehiculo;
			this.isPermisoEliminarControlVehiculo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosControlVehiculo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaControlVehiculo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaControlVehiculo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoControlVehiculo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteControlVehiculo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenControlVehiculo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioControlVehiculo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoControlVehiculo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoControlVehiculo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarControlVehiculo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormControlVehiculo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarControlVehiculo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenControlVehiculo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosControlVehiculo.setToolTipText(this.jTableDatosControlVehiculo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioControlVehiculo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioControlVehiculo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ControlVehiculoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(ControlVehiculoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioControlVehiculo() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyControlVehiculoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyControlVehiculoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ControlVehiculoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyControlVehiculoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyControlVehiculoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ControlVehiculoParameterReturnGeneral controlvehiculoReturnGeneral=new ControlVehiculoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.controlvehiculoConstantesFunciones.cargarid_empresaControlVehiculo)
					 || (this.esRecargarFks && this.controlvehiculoConstantesFunciones.cargarid_empresaControlVehiculo)) {

					if(!this.controlvehiculoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+controlvehiculoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				controlvehiculoReturnGeneral=controlvehiculoLogic.cargarCombosLoteForeignKeyControlVehiculo(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=controlvehiculoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyControlVehiculo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.controlvehiculoSessionBean==null) {
				this.controlvehiculoSessionBean=new ControlVehiculoSessionBean();
			}

			if(!this.controlvehiculoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyControlVehiculo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyControlVehiculo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyControlVehiculo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.controlvehiculo.setfecha_entrada(this.parametroGeneralUsuario.getfecha_sistema());
				this.controlvehiculo.setfecha_salida(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyControlVehiculo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyControlVehiculo(ControlVehiculo controlvehiculo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyControlVehiculo(ControlVehiculo controlvehiculo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyControlVehiculo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyControlVehiculo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyControlVehiculo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyControlVehiculo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroControlVehiculo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyControlVehiculo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyControlVehiculo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyControlVehiculo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormControlVehiculo.jComboBoxid_empresaControlVehiculo!=null && this.jInternalFrameDetalleFormControlVehiculo.jComboBoxid_empresaControlVehiculo.getItemCount()>0) {
				this.jInternalFrameDetalleFormControlVehiculo.jComboBoxid_empresaControlVehiculo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ControlVehiculoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ControlVehiculoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ControlVehiculoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.controlvehiculoSessionBean=new ControlVehiculoSessionBean(); 
		this.controlvehiculoConstantesFunciones=new ControlVehiculoConstantesFunciones(); 
		this.controlvehiculoBean=new ControlVehiculo();//(this.controlvehiculoConstantesFunciones); 		
		this.controlvehiculoReturnGeneral=new ControlVehiculoParameterReturnGeneral(); 
		
		this.controlvehiculoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.controlvehiculoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ControlVehiculoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ControlVehiculoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ControlVehiculoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessControlVehiculo(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.controlvehiculoConstantesFunciones=new ControlVehiculoConstantesFunciones(); 
			this.controlvehiculoBean=new ControlVehiculo();//this.controlvehiculoConstantesFunciones); 			
			this.controlvehiculoReturnGeneral=new ControlVehiculoParameterReturnGeneral(); 
		
			ControlVehiculoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Control Vehiculo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.controlvehiculo=new ControlVehiculo();
			this.controlvehiculos = new ArrayList<ControlVehiculo>();
			this.controlvehiculosAux = new ArrayList<ControlVehiculo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic=new ControlVehiculoLogic();
				this.controlvehiculoLogic.getNewConnexionToDeep("");
			}
			
			//this.controlvehiculoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.controlvehiculoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormControlVehiculo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoControlVehiculo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoControlVehiculo);	
					}
					
					if(this.jInternalFrameImportacionControlVehiculo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionControlVehiculo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByControlVehiculo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByControlVehiculo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormControlVehiculo);
				this.jInternalFrameDetalleFormControlVehiculo.setVisible(false);
				this.jInternalFrameDetalleFormControlVehiculo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoControlVehiculo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoControlVehiculo);
					this.jInternalFrameReporteDinamicoControlVehiculo.setVisible(false);
					this.jInternalFrameReporteDinamicoControlVehiculo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionControlVehiculo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionControlVehiculo);
					this.jInternalFrameImportacionControlVehiculo.setVisible(false);
					this.jInternalFrameImportacionControlVehiculo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByControlVehiculo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByControlVehiculo);
					this.jInternalFrameOrderByControlVehiculo.setVisible(false);
					this.jInternalFrameOrderByControlVehiculo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idControlVehiculoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ControlVehiculoConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.controlvehiculoReturnGeneral=new ControlVehiculoParameterReturnGeneral();
			
			this.controlvehiculoParameterGeneral=new ControlVehiculoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.controlvehiculoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(ControlVehiculoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ControlVehiculoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.controlvehiculoSessionBean.getEsGuardarRelacionado(),this.controlvehiculoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ControlVehiculoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.controlvehiculoSessionBean.getEsGuardarRelacionado(),this.controlvehiculoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoControlVehiculo=false;
			this.isVisibilidadCeldaDuplicarControlVehiculo=true;
			this.isVisibilidadCeldaCopiarControlVehiculo=true;
			this.isVisibilidadCeldaVerFormControlVehiculo=true;
			this.isVisibilidadCeldaOrdenControlVehiculo=true;
			this.isVisibilidadCeldaNuevoRelacionesControlVehiculo=false;
			this.isVisibilidadCeldaModificarControlVehiculo=false;
			this.isVisibilidadCeldaActualizarControlVehiculo=false;
			this.isVisibilidadCeldaEliminarControlVehiculo=false;
			this.isVisibilidadCeldaCancelarControlVehiculo=false;
			this.isVisibilidadCeldaGuardarControlVehiculo=false;
			this.isVisibilidadCeldaGuardarCambiosControlVehiculo=false;
			
			
			this.isVisibilidadBusquedaPorFechaEntrada=true;
			this.isVisibilidadBusquedaPorFechaSalida=true;
			this.isVisibilidadBusquedaPorNombreConductor=true;
			this.isVisibilidadBusquedaPorNumeroPlaca=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesControlVehiculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosControlVehiculo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioControlVehiculo(false);
			
			this.setPermisosUsuarioControlVehiculo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado() 
				|| (this.controlvehiculoSessionBean.getEsGuardarRelacionado() && this.controlvehiculoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioControlVehiculoClasesRelacionadas();
			}
			
			if(this.controlvehiculoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioControlVehiculoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ControlVehiculoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosControlVehiculo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualControlVehiculo();
			}
			
			if(!this.isPermisoBusquedaControlVehiculo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasControlVehiculo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioControlVehiculo,this.isPermisoPaginacionMedioControlVehiculo,this.isPermisoPaginacionTodoControlVehiculo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ControlVehiculoConstantesFunciones.getTiposSeleccionarControlVehiculo());
				
				this.tiposColumnasSelect=ControlVehiculoConstantesFunciones.getTiposSeleccionarControlVehiculo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioControlVehiculo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioControlVehiculo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioControlVehiculo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesControlVehiculo() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				controlvehiculoImplementable= (ControlVehiculoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ControlVehiculoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				controlvehiculoImplementableHome= (ControlVehiculoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ControlVehiculoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.controlvehiculos= new ArrayList<ControlVehiculo>();
			this.controlvehiculosEliminados= new ArrayList<ControlVehiculo>();
						
			this.isEsNuevoControlVehiculo=false;
			this.esParaAccionDesdeFormularioControlVehiculo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyControlVehiculo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroControlVehiculo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ControlVehiculoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ControlVehiculoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesControlVehiculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingControlVehiculo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormControlVehiculo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioControlVehiculo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioControlVehiculo();
			}
			
			ControlVehiculoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasControlVehiculo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasControlVehiculo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasControlVehiculo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessControlVehiculo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ControlVehiculo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectControlVehiculo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesControlVehiculo")) {
				iIndex=this.jInternalFrameDetalleFormControlVehiculo.jTabbedPaneRelacionesControlVehiculo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormControlVehiculo.jTabbedPaneRelacionesControlVehiculo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessControlVehiculo();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyControlVehiculo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyControlVehiculo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyControlVehiculo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyControlVehiculoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyControlVehiculo();
		
		this.cargarCombosFrameForeignKeyControlVehiculo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyControlVehiculo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyControlVehiculo();
		}
	}
	
	
	
	public void jButtonNuevoControlVehiculoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.controlvehiculoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormControlVehiculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			
			
			if(jTableDatosControlVehiculo.getRowCount()>=1) {
				jTableDatosControlVehiculo.removeRowSelectionInterval(0, jTableDatosControlVehiculo.getRowCount()-1);						
			}
			
			this.isEsNuevoControlVehiculo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoControlVehiculo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesControlVehiculo(true);			
			//this.controlvehiculo=new ControlVehiculo();
			//this.controlvehiculo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesControlVehiculo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualControlVehiculo() ;
			
			if(ControlVehiculoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleControlVehiculo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.controlvehiculo);	
			this.actualizarInformacion("INFO_PADRE",false,this.controlvehiculo);				
			
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			
			if(this.controlvehiculoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ControlVehiculo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarControlVehiculoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ControlVehiculo> controlvehiculosSeleccionados=new ArrayList<ControlVehiculo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosControlVehiculo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosControlVehiculo.getSelectedRows().length;			
			}
			
			controlvehiculosSeleccionados=this.getControlVehiculosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoControlVehiculo--;			
				//ControlVehiculo controlvehiculoAux= new ControlVehiculo();			
				//controlvehiculoAux.setId(this.iIdNuevoControlVehiculo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ControlVehiculo controlvehiculoOrigen=new ControlVehiculo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ControlVehiculo controlvehiculoOrigen : controlvehiculosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							controlvehiculoOrigen =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							controlvehiculoOrigen =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaControlVehiculo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.controlvehiculo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosControlVehiculo(controlvehiculoOrigen,this.controlvehiculo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.controlvehiculoLogic.getControlVehiculos().add(this.controlvehiculoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.controlvehiculos.add(this.controlvehiculoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaControlVehiculo(false);
				
				this.jTableDatosControlVehiculo.setRowSelectionInterval(this.getIndiceNuevoControlVehiculo(), this.getIndiceNuevoControlVehiculo());
				
				int iLastRow =  this.jTableDatosControlVehiculo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosControlVehiculo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosControlVehiculo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaControlVehiculo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarControlVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ControlVehiculo> controlvehiculosSeleccionados=new ArrayList<ControlVehiculo>();									
		
			ControlVehiculo controlvehiculoOrigen=new ControlVehiculo();
			ControlVehiculo controlvehiculoDestino=new ControlVehiculo();
				
			controlvehiculosSeleccionados=this.getControlVehiculosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosControlVehiculo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || controlvehiculosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosControlVehiculo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						controlvehiculoOrigen =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						controlvehiculoOrigen =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						controlvehiculoDestino =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						controlvehiculoDestino =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				controlvehiculoOrigen =controlvehiculosSeleccionados.get(0);
				controlvehiculoDestino =controlvehiculosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosControlVehiculo(controlvehiculoOrigen,controlvehiculoDestino,true,false);
				
				controlvehiculoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(controlvehiculoDestino,controlvehiculoLogic.getControlVehiculos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(controlvehiculoDestino,controlvehiculos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaControlVehiculo(false);
				
				//this.jTableDatosControlVehiculo.setRowSelectionInterval(this.getIndiceNuevoControlVehiculo(), this.getIndiceNuevoControlVehiculo());
				
				int iLastRow =  this.jTableDatosControlVehiculo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosControlVehiculo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosControlVehiculo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaControlVehiculo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormControlVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormControlVehiculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormControlVehiculo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarControlVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesControlVehiculo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasControlVehiculo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesControlVehiculo.setVisible(!isVisible);
			this.jPanelPaginacionControlVehiculo.setVisible(!isVisible);
			this.jPanelAccionesControlVehiculo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarControlVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameControlVehiculo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoControlVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoControlVehiculo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionControlVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionControlVehiculo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByControlVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByControlVehiculo();
			
			this.abrirFrameOrderByControlVehiculo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByControlVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByControlVehiculo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleControlVehiculo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormControlVehiculo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormControlVehiculo.isMaximum()) {
					this.jInternalFrameDetalleFormControlVehiculo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormControlVehiculo.setSize(this.jInternalFrameDetalleFormControlVehiculo.iWidthFormulario,this.jInternalFrameDetalleFormControlVehiculo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormControlVehiculo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormControlVehiculo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormControlVehiculo.isMaximum()) {
						this.jInternalFrameDetalleFormControlVehiculo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormControlVehiculo.jContentPaneDetalleControlVehiculo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormControlVehiculo.jTabbedPaneRelacionesControlVehiculo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormControlVehiculo.jContentPaneDetalleControlVehiculo.getWidth(),ControlVehiculoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormControlVehiculo.jTabbedPaneRelacionesControlVehiculo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormControlVehiculo.jContentPaneDetalleControlVehiculo.getWidth(),ControlVehiculoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormControlVehiculo.jTabbedPaneRelacionesControlVehiculo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormControlVehiculo.jContentPaneDetalleControlVehiculo.getWidth(),ControlVehiculoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormControlVehiculo.setVisible(true);
	        this.jInternalFrameDetalleFormControlVehiculo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByControlVehiculo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByControlVehiculo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByControlVehiculo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByControlVehiculo,false,this);
				} else {
					this.jInternalFrameOrderByControlVehiculo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByControlVehiculo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByControlVehiculo);
				this.jInternalFrameOrderByControlVehiculo.setVisible(false);
				this.jInternalFrameOrderByControlVehiculo.setSelected(false);
				
				this.jInternalFrameOrderByControlVehiculo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByControlVehiculo"));
				
				this.inicializarActualizarBindingTablaOrderByControlVehiculo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionControlVehiculo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionControlVehiculo==null) {
				
				this.jInternalFrameImportacionControlVehiculo=new ImportacionJInternalFrame(ControlVehiculoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionControlVehiculo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionControlVehiculo);
				this.jInternalFrameImportacionControlVehiculo.setVisible(false);
				this.jInternalFrameImportacionControlVehiculo.setSelected(false);


				this.jInternalFrameImportacionControlVehiculo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionControlVehiculo"));
				this.jInternalFrameImportacionControlVehiculo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionControlVehiculo"));
				this.jInternalFrameImportacionControlVehiculo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionControlVehiculo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoControlVehiculo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoControlVehiculo==null) {
				this.jInternalFrameReporteDinamicoControlVehiculo=new ReporteDinamicoJInternalFrame(ControlVehiculoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoControlVehiculo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoControlVehiculo);
				this.jInternalFrameReporteDinamicoControlVehiculo.setVisible(false);
				this.jInternalFrameReporteDinamicoControlVehiculo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoControlVehiculo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoControlVehiculo"));
				this.jInternalFrameReporteDinamicoControlVehiculo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoControlVehiculo"));
				this.jInternalFrameReporteDinamicoControlVehiculo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoControlVehiculo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualControlVehiculo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleControlVehiculo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormControlVehiculo);
			
	       	this.jInternalFrameDetalleFormControlVehiculo.setVisible(false);
	        this.jInternalFrameDetalleFormControlVehiculo.setSelected(false);
			
			//this.jInternalFrameDetalleFormControlVehiculo.dispose();
			//this.jInternalFrameDetalleFormControlVehiculo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoControlVehiculo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoControlVehiculo.setVisible(true);
	        this.jInternalFrameReporteDinamicoControlVehiculo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionControlVehiculo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionControlVehiculo.setVisible(true);
	        this.jInternalFrameImportacionControlVehiculo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByControlVehiculo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByControlVehiculo.setVisible(true);
	        this.jInternalFrameOrderByControlVehiculo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByControlVehiculo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByControlVehiculo.setVisible(false);
	        this.jInternalFrameOrderByControlVehiculo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoControlVehiculo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoControlVehiculo.setVisible(false);
	        this.jInternalFrameReporteDinamicoControlVehiculo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionControlVehiculo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionControlVehiculo.setVisible(false);
	        this.jInternalFrameImportacionControlVehiculo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarControlVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarControlVehiculo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarControlVehiculo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesControlVehiculo(true);
			//this.isEsNuevoControlVehiculo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesControlVehiculo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesControlVehiculo(false) ;
			
			if(controlvehiculoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ControlVehiculoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleControlVehiculo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualControlVehiculo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaControlVehiculoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarControlVehiculo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormControlVehiculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesControlVehiculo(true);
			//this.isEsNuevoControlVehiculo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.controlvehiculo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesControlVehiculo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesControlVehiculo(false) ;
			
			if(ControlVehiculoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleControlVehiculo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualControlVehiculo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarControlVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesControlVehiculo(false);
			
			//if(!this.isEsNuevoControlVehiculo) {								
				int intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualControlVehiculo(this.controlvehiculo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
				
			}
			
			if(this.permiteMantenimiento(this.controlvehiculo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoControlVehiculo=true;
					this.inicializarActualizarBindingTablaControlVehiculo(false);
					this.isEsNuevoControlVehiculo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoControlVehiculo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoControlVehiculo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesControlVehiculo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualControlVehiculo(false);
				
				this.habilitarDeshabilitarControlesControlVehiculo(false);
			
												
				
				if(ControlVehiculoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleControlVehiculo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoControlVehiculoActionPerformed(evt,controlvehiculoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualControlVehiculo(this.controlvehiculo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosControlVehiculo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,controlvehiculoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.controlvehiculo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ControlVehiculo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlVehiculo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarControlVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				this.controlvehiculo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				this.controlvehiculo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.controlvehiculo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ControlVehiculoModel) this.jTableDatosControlVehiculo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoControlVehiculo=true;
				this.inicializarActualizarBindingTablaControlVehiculo(false);
				this.isEsNuevoControlVehiculo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesControlVehiculo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualControlVehiculo(false);
				
				this.habilitarDeshabilitarControlesControlVehiculo(false);
				
				
				
				if(ControlVehiculoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleControlVehiculo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarControlVehiculoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosControlVehiculo.getRowCount()>=1) {
				jTableDatosControlVehiculo.removeRowSelectionInterval(0, jTableDatosControlVehiculo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesControlVehiculo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaControlVehiculo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesControlVehiculo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualControlVehiculo(false) ;
			
			this.isEsNuevoControlVehiculo=false;
			
			if(ControlVehiculoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleControlVehiculo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosControlVehiculoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingControlVehiculo(false);
				
				//SI ES MANUAL
				if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualControlVehiculo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosControlVehiculoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoControlVehiculo--;			
			//ControlVehiculo controlvehiculoAux= new ControlVehiculo();			
			//controlvehiculoAux.setId(this.iIdNuevoControlVehiculo);
			
			if(this.jInternalFrameDetalleFormControlVehiculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaControlVehiculo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
			
			this.controlvehiculo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.controlvehiculoLogic.getControlVehiculos().add(this.controlvehiculoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.controlvehiculos.add(this.controlvehiculoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaControlVehiculo(false);
			
			this.jTableDatosControlVehiculo.setRowSelectionInterval(this.getIndiceNuevoControlVehiculo(), this.getIndiceNuevoControlVehiculo());
			
			int iLastRow =  this.jTableDatosControlVehiculo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosControlVehiculo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosControlVehiculo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaControlVehiculo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionControlVehiculoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingControlVehiculo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingControlVehiculo(false);
			
			//SI ES MANUAL
			if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualControlVehiculo();
			}
			
			//this.abrirFrameTreeControlVehiculo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionControlVehiculoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Control VehiculoES ?", "MANTENIMIENTO DE Control Vehiculo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionControlVehiculo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralControlVehiculo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.controlvehiculoReturnGeneral=controlvehiculoLogic.procesarImportacionControlVehiculosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.controlvehiculoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarControlVehiculoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionControlVehiculoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionControlVehiculo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionControlVehiculo.setFileImportacion(this.jInternalFrameImportacionControlVehiculo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionControlVehiculo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionControlVehiculo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionControlVehiculo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionControlVehiculo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoControlVehiculoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ControlVehiculo> controlvehiculosSeleccionados=new ArrayList<ControlVehiculo>();		

		controlvehiculosSeleccionados=this.getControlVehiculosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoControlVehiculo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoControlVehiculo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ControlVehiculoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ControlVehiculoBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteControlVehiculos("Todos",controlvehiculosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Control Vehiculo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoControlVehiculo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoControlVehiculo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ControlVehiculoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreConductor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreConductor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreConductor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreConductor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPlaca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPlaca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPlaca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPlaca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEntrada_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEntrada_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEntrada_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEntrada_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaSalida_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaSalida_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaSalida_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaSalida_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoControlVehiculo.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoControlVehiculo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoControlVehiculo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ControlVehiculoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR:
					sNombreCampoCategoria="nombre_conductor";
					break;

				case ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA:
					sNombreCampoCategoria="numero_placa";
					break;

				case ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA:
					sNombreCampoCategoria="fecha_entrada";
					break;

				case ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA:
					sNombreCampoCategoria="fecha_salida";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoControlVehiculo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ControlVehiculoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR:
					sNombreCampoCategoriaValor="nombre_conductor";
					break;

				case ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA:
					sNombreCampoCategoriaValor="numero_placa";
					break;

				case ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA:
					sNombreCampoCategoriaValor="fecha_entrada";
					break;

				case ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA:
					sNombreCampoCategoriaValor="fecha_salida";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoControlVehiculo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoControlVehiculo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ControlVehiculoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Conductor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_conductor");
					break;

				case ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero_placa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_placa");
					break;

				case ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Entrada",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_entrada");
					break;

				case ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Salida",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_salida");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoControlVehiculoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ControlVehiculo> controlvehiculosSeleccionados=new ArrayList<ControlVehiculo>();		
		
		controlvehiculosSeleccionados=this.getControlVehiculosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"controlvehiculo";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("ControlVehiculos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoControlVehiculo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoControlVehiculo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ControlVehiculoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ControlVehiculo controlvehiculo:controlvehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlvehiculo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR);
					iRow++;

					for(ControlVehiculo controlvehiculo:controlvehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlvehiculo.getnombre_conductor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA);
					iRow++;

					for(ControlVehiculo controlvehiculo:controlvehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlvehiculo.getnumero_placa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA);
					iRow++;

					for(ControlVehiculo controlvehiculo:controlvehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlvehiculo.getfecha_entrada());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA);
					iRow++;

					for(ControlVehiculo controlvehiculo:controlvehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlvehiculo.getfecha_salida());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelControlVehiculo(row);				
			//	iRow++;
			//}				
			
			//for(ControlVehiculo controlvehiculoAux:controlvehiculosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelControlVehiculo(controlvehiculoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Control Vehiculo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingControlVehiculo(false);
			
			//SI ES MANUAL
			if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualControlVehiculo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresControlVehiculoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingControlVehiculo(false);
			
			//SI ES MANUAL
			if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualControlVehiculo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesControlVehiculoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingControlVehiculo(false);
			
			//SI ES MANUAL
			if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualControlVehiculo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaControlVehiculo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosControlVehiculo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosControlVehiculo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosControlVehiculo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosControlVehiculo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosControlVehiculo.setMinimumSize(dimensionMinimum);
		this.jTableDatosControlVehiculo.setMaximumSize(dimensionMaximum);
		this.jTableDatosControlVehiculo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingControlVehiculo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingControlVehiculo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingControlVehiculo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaControlVehiculo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesControlVehiculo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasControlVehiculo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesControlVehiculo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesControlVehiculo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ControlVehiculoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ControlVehiculoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualControlVehiculo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaControlVehiculo();
		
		this.inicializarActualizarBindingBotonesManualControlVehiculo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualControlVehiculo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesControlVehiculo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualControlVehiculo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualControlVehiculo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosControlVehiculo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosControlVehiculo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteControlVehiculo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormControlVehiculo.jCheckBoxPostAccionNuevoControlVehiculo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormControlVehiculo.jCheckBoxPostAccionSinCerrarControlVehiculo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormControlVehiculo.jCheckBoxPostAccionSinMensajeControlVehiculo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosControlVehiculo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosControlVehiculo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteControlVehiculo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
				this.jInternalFrameDetalleFormControlVehiculo.jCheckBoxPostAccionNuevoControlVehiculo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormControlVehiculo.jCheckBoxPostAccionSinCerrarControlVehiculo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormControlVehiculo.jCheckBoxPostAccionSinMensajeControlVehiculo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionControlVehiculo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionControlVehiculo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormControlVehiculo.jComboBoxTiposAccionesFormularioControlVehiculo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesControlVehiculo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoControlVehiculo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoControlVehiculo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesControlVehiculo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesControlVehiculo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarControlVehiculo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesControlVehiculo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoControlVehiculo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoControlVehiculo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesControlVehiculo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralControlVehiculo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesControlVehiculo(Boolean esInicializar) throws Exception {
		try	{	
			if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualControlVehiculo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesControlVehiculo() throws Exception {
		try	{
			if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualControlVehiculo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleControlVehiculo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormControlVehiculo.jComboBoxTiposAccionesFormularioControlVehiculo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormControlVehiculo.jComboBoxTiposAccionesFormularioControlVehiculo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualControlVehiculo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesControlVehiculo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesControlVehiculo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesControlVehiculo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesControlVehiculo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesControlVehiculo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesControlVehiculo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionControlVehiculo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionControlVehiculo.addItem(reporte);
			}
			
			
			if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionControlVehiculo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionControlVehiculo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesControlVehiculo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesControlVehiculo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesControlVehiculo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesControlVehiculo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormControlVehiculo.jComboBoxTiposAccionesFormularioControlVehiculo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormControlVehiculo.jComboBoxTiposAccionesFormularioControlVehiculo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarControlVehiculo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarControlVehiculo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarControlVehiculo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualControlVehiculo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualControlVehiculo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoControlVehiculo!=null) {
				this.jInternalFrameReporteDinamicoControlVehiculo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoControlVehiculo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoControlVehiculo!=null) {
				this.jInternalFrameReporteDinamicoControlVehiculo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoControlVehiculo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoControlVehiculo!=null) {
				
				if(this.jInternalFrameReporteDinamicoControlVehiculo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoControlVehiculo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoControlVehiculo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoControlVehiculo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoControlVehiculo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoControlVehiculo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualControlVehiculo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_entradaBusquedaPorFechaEntrada=new Date(this.jDateChooserfecha_entradaBusquedaPorFechaEntradaControlVehiculo.getDate().getTime());
		this.fecha_salidaBusquedaPorFechaSalida=new Date(this.jDateChooserfecha_salidaBusquedaPorFechaSalidaControlVehiculo.getDate().getTime());
		this.nombre_conductorBusquedaPorNombreConductor=this.jTextAreanombre_conductorBusquedaPorNombreConductorControlVehiculo.getText();
		this.numero_placaBusquedaPorNumeroPlaca=this.jTextAreanumero_placaBusquedaPorNumeroPlacaControlVehiculo.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasControlVehiculo(Boolean esInicializar) throws Exception {				
		if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualControlVehiculo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaControlVehiculo() throws Exception {
		this.inicializarActualizarBindingTablaControlVehiculo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByControlVehiculo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByControlVehiculo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByControlVehiculo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByControlVehiculo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ControlVehiculoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByControlVehiculo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByControlVehiculo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ControlVehiculoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosControlVehiculoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlVehiculoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ControlVehiculoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByControlVehiculo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByControlVehiculo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ControlVehiculoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByControlVehiculo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaControlVehiculo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=controlvehiculoLogic.getControlVehiculos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=controlvehiculos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosControlVehiculo.setModel(new ControlVehiculoModel(this.controlvehiculoLogic.getControlVehiculos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosControlVehiculo.setModel(new ControlVehiculoModel(this.controlvehiculos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByControlVehiculo!=null && this.jInternalFrameOrderByControlVehiculo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByControlVehiculo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosControlVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlVehiculo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ControlVehiculoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO,controlvehiculoConstantesFunciones.resaltarSeleccionarControlVehiculo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO,controlvehiculoConstantesFunciones.resaltarSeleccionarControlVehiculo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosControlVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlVehiculo,ControlVehiculoConstantesFunciones.LABEL_ID));

		if(this.controlvehiculoConstantesFunciones.mostraridControlVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlVehiculoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.controlvehiculoConstantesFunciones.resaltaridControlVehiculo,this.controlvehiculoConstantesFunciones.activaridControlVehiculo,this,true,"idControlVehiculo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlvehiculoConstantesFunciones.resaltaridControlVehiculo,this.controlvehiculoConstantesFunciones.activaridControlVehiculo,this,true,"idControlVehiculo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlVehiculo,ControlVehiculoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.controlvehiculoConstantesFunciones.mostrarid_empresaControlVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlVehiculoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.controlvehiculoConstantesFunciones.resaltarid_empresaControlVehiculo,this,this.controlvehiculoConstantesFunciones.activarid_empresaControlVehiculo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.controlvehiculoConstantesFunciones.resaltarid_empresaControlVehiculo,this,this.controlvehiculoConstantesFunciones.activarid_empresaControlVehiculo,false,"id_empresaControlVehiculo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ControlVehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlVehiculo,ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR));

		if(this.controlvehiculoConstantesFunciones.mostrarnombre_conductorControlVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.controlvehiculoConstantesFunciones.resaltarnombre_conductorControlVehiculo,this.controlvehiculoConstantesFunciones.activarnombre_conductorControlVehiculo,this,true,"nombre_conductorControlVehiculo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlvehiculoConstantesFunciones.resaltarnombre_conductorControlVehiculo,this.controlvehiculoConstantesFunciones.activarnombre_conductorControlVehiculo,this,true,"nombre_conductorControlVehiculo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ControlVehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlVehiculo,ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA));

		if(this.controlvehiculoConstantesFunciones.mostrarnumero_placaControlVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.controlvehiculoConstantesFunciones.resaltarnumero_placaControlVehiculo,this.controlvehiculoConstantesFunciones.activarnumero_placaControlVehiculo,this,true,"numero_placaControlVehiculo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlvehiculoConstantesFunciones.resaltarnumero_placaControlVehiculo,this.controlvehiculoConstantesFunciones.activarnumero_placaControlVehiculo,this,true,"numero_placaControlVehiculo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ControlVehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlVehiculo,ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA));

		if(this.controlvehiculoConstantesFunciones.mostrarfecha_entradaControlVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.controlvehiculoConstantesFunciones.resaltarfecha_entradaControlVehiculo,this.controlvehiculoConstantesFunciones.activarfecha_entradaControlVehiculo,this,true,"fecha_entradaControlVehiculo","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.controlvehiculoConstantesFunciones.resaltarfecha_entradaControlVehiculo,this.controlvehiculoConstantesFunciones.activarfecha_entradaControlVehiculo,this,true,"fecha_entradaControlVehiculo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ControlVehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlVehiculo,ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA));

		if(this.controlvehiculoConstantesFunciones.mostrarfecha_salidaControlVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.controlvehiculoConstantesFunciones.resaltarfecha_salidaControlVehiculo,this.controlvehiculoConstantesFunciones.activarfecha_salidaControlVehiculo,this,true,"fecha_salidaControlVehiculo","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.controlvehiculoConstantesFunciones.resaltarfecha_salidaControlVehiculo,this.controlvehiculoConstantesFunciones.activarfecha_salidaControlVehiculo,this,true,"fecha_salidaControlVehiculo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ControlVehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.controlvehiculoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.controlvehiculoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosControlVehiculo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.controlvehiculoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.controlvehiculoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosControlVehiculo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarControlVehiculo && this.isPermisoGuardarCambiosControlVehiculo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.controlvehiculoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.controlvehiculoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosControlVehiculo.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosControlVehiculo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarControlVehiculo && this.isPermisoGuardarCambiosControlVehiculo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarControlVehiculo && this.isPermisoGuardarCambiosControlVehiculo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosControlVehiculo.moveColumn(this.jTableDatosControlVehiculo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosControlVehiculo.moveColumn(this.jTableDatosControlVehiculo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosControlVehiculo.moveColumn(this.jTableDatosControlVehiculo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosControlVehiculo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosControlVehiculo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosControlVehiculo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ControlVehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosControlVehiculo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosControlVehiculo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ControlVehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ControlVehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosControlVehiculo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosControlVehiculo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosControlVehiculo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=controlvehiculoLogic.getControlVehiculos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=controlvehiculos.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosControlVehiculo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosControlVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosControlVehiculo();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoControlVehiculo=false;
					
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			
				if(this.controlvehiculoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormControlVehiculo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosControlVehiculo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosControlVehiculo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.controlvehiculo.getsType().equals("DUPLICADO")
				   || this.controlvehiculo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoControlVehiculo=true;
				
				} else {
					this.isEsNuevoControlVehiculo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
					if(this.controlvehiculo.getId()>=0 && !this.controlvehiculo.getIsNew()) {						
						this.isEsNuevoControlVehiculo=false;
						
					} else {
						this.isEsNuevoControlVehiculo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoControlVehiculo(esRelaciones);						
				
				this.seleccionarControlVehiculo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.controlvehiculo.getId()<0) {
					this.isEsNuevoControlVehiculo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarControlVehiculo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarControlVehiculo(evt,rowIndex);
				}	
				
				if(this.controlvehiculoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ControlVehiculo: " + this.dDif); 
					}
				}								
				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarControlVehiculo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.controlvehiculo)) {
					if(this.controlvehiculo.getId()>0) {
						this.controlvehiculo.setIsDeleted(true);
						
						this.controlvehiculosEliminados.add(this.controlvehiculo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.controlvehiculoLogic.getControlVehiculos().remove(this.controlvehiculo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.controlvehiculos.remove(this.controlvehiculo);				
					}
					
					
					((ControlVehiculoModel) this.jTableDatosControlVehiculo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaControlVehiculo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarControlVehiculo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoControlVehiculo) {
			
			if(this.jInternalFrameDetalleFormControlVehiculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosControlVehiculo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosControlVehiculo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioControlVehiculo(this.controlvehiculo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.controlvehiculoConstantesFunciones.cargarid_empresaControlVehiculo || this.controlvehiculoConstantesFunciones.event_dependid_empresaControlVehiculo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.controlvehiculo.getid_empresa());
									//this.inicializarActualizarBindingControlVehiculo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(controlvehiculo.getEmpresa()!=null) {
							this.empresasForeignKey.add(controlvehiculo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.controlvehiculo.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesControlVehiculo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesControlVehiculo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualControlVehiculo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoControlVehiculo(ControlVehiculo controlvehiculo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoControlVehiculo(controlvehiculo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoControlVehiculo(ControlVehiculo controlvehiculo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioControlVehiculo(controlvehiculo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyControlVehiculo(controlvehiculo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyControlVehiculo(controlvehiculo);
	}
	
	public void setVariablesObjetoActualToFormularioControlVehiculo(ControlVehiculo controlvehiculo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormControlVehiculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormControlVehiculo.jLabelidControlVehiculo.setText(controlvehiculo.getId().toString());
			this.jInternalFrameDetalleFormControlVehiculo.jTextAreanombre_conductorControlVehiculo.setText(controlvehiculo.getnombre_conductor());
			this.jInternalFrameDetalleFormControlVehiculo.jTextAreanumero_placaControlVehiculo.setText(controlvehiculo.getnumero_placa());
			this.jInternalFrameDetalleFormControlVehiculo.jDateChooserfecha_entradaControlVehiculo.setDate(controlvehiculo.getfecha_entrada());
			this.jInternalFrameDetalleFormControlVehiculo.jDateChooserfecha_salidaControlVehiculo.setDate(controlvehiculo.getfecha_salida());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ControlVehiculo controlvehiculoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,controlvehiculoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ControlVehiculo controlvehiculoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				controlvehiculoLocal=this.controlvehiculo;
			} else {
				controlvehiculoLocal=this.controlvehiculoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(controlvehiculoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoControlVehiculo(controlvehiculoLocal,true);
					
					if(controlvehiculoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(controlvehiculoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(controlvehiculoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoControlVehiculo(ControlVehiculo controlvehiculo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualControlVehiculo(controlvehiculo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(controlvehiculo);
	}
	
	public void setVariablesFormularioToObjetoActualControlVehiculo(ControlVehiculo controlvehiculo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualControlVehiculo(controlvehiculo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualControlVehiculo(ControlVehiculo controlvehiculo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormControlVehiculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormControlVehiculo.jLabelidControlVehiculo.getText()==null || this.jInternalFrameDetalleFormControlVehiculo.jLabelidControlVehiculo.getText()=="" || this.jInternalFrameDetalleFormControlVehiculo.jLabelidControlVehiculo.getText()=="Id") {
				this.jInternalFrameDetalleFormControlVehiculo.jLabelidControlVehiculo.setText("0");
			}

			if(conColumnasBase) {controlvehiculo.setId(Long.parseLong(this.jInternalFrameDetalleFormControlVehiculo.jLabelidControlVehiculo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlVehiculoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlVehiculo.jLabelIdControlVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlvehiculo.setnombre_conductor(this.jInternalFrameDetalleFormControlVehiculo.jTextAreanombre_conductorControlVehiculo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlVehiculo.jLabelnombre_conductorControlVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlvehiculo.setnumero_placa(this.jInternalFrameDetalleFormControlVehiculo.jTextAreanumero_placaControlVehiculo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlVehiculo.jLabelnumero_placaControlVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlvehiculo.setfecha_entrada(this.jInternalFrameDetalleFormControlVehiculo.jDateChooserfecha_entradaControlVehiculo.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlVehiculo.jLabelfecha_entradaControlVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlvehiculo.setfecha_salida(this.jInternalFrameDetalleFormControlVehiculo.jDateChooserfecha_salidaControlVehiculo.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlVehiculo.jLabelfecha_salidaControlVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualControlVehiculo(ControlVehiculo controlvehiculoBean,ControlVehiculo controlvehiculo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosControlVehiculo(ControlVehiculo controlvehiculoOrigen,ControlVehiculo controlvehiculo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && controlvehiculoOrigen.getId()!=null && !controlvehiculoOrigen.getId().equals(0L))) {controlvehiculo.setId(controlvehiculoOrigen.getId());}}
			if(conDefault || (!conDefault && controlvehiculoOrigen.getnombre_conductor()!=null && !controlvehiculoOrigen.getnombre_conductor().equals(""))) {controlvehiculo.setnombre_conductor(controlvehiculoOrigen.getnombre_conductor());}
			if(conDefault || (!conDefault && controlvehiculoOrigen.getnumero_placa()!=null && !controlvehiculoOrigen.getnumero_placa().equals(""))) {controlvehiculo.setnumero_placa(controlvehiculoOrigen.getnumero_placa());}
			if(conDefault || (!conDefault && controlvehiculoOrigen.getfecha_entrada()!=null && !controlvehiculoOrigen.getfecha_entrada().equals(new Date()))) {controlvehiculo.setfecha_entrada(controlvehiculoOrigen.getfecha_entrada());}
			if(conDefault || (!conDefault && controlvehiculoOrigen.getfecha_salida()!=null && !controlvehiculoOrigen.getfecha_salida().equals(new Date()))) {controlvehiculo.setfecha_salida(controlvehiculoOrigen.getfecha_salida());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioControlVehiculo(ControlVehiculo controlvehiculo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormControlVehiculo.jLabelidControlVehiculo.setText(controlvehiculo.getId().toString());
			this.jInternalFrameDetalleFormControlVehiculo.jTextAreanombre_conductorControlVehiculo.setText(controlvehiculo.getnombre_conductor());
			this.jInternalFrameDetalleFormControlVehiculo.jTextAreanumero_placaControlVehiculo.setText(controlvehiculo.getnumero_placa());
			this.jInternalFrameDetalleFormControlVehiculo.jDateChooserfecha_entradaControlVehiculo.setDate(controlvehiculo.getfecha_entrada());
			this.jInternalFrameDetalleFormControlVehiculo.jDateChooserfecha_salidaControlVehiculo.setDate(controlvehiculo.getfecha_salida());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioControlVehiculo(ControlVehiculoBean controlvehiculoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormControlVehiculo.jLabelidControlVehiculo.setText(controlvehiculoBean.getId().toString());
			this.jInternalFrameDetalleFormControlVehiculo.jTextAreanombre_conductorControlVehiculo.setText(controlvehiculoBean.getnombre_conductor());
			this.jInternalFrameDetalleFormControlVehiculo.jTextAreanumero_placaControlVehiculo.setText(controlvehiculoBean.getnumero_placa());
			this.jInternalFrameDetalleFormControlVehiculo.jDateChooserfecha_entradaControlVehiculo.setDate(controlvehiculoBean.getfecha_entrada());
			this.jInternalFrameDetalleFormControlVehiculo.jDateChooserfecha_salidaControlVehiculo.setDate(controlvehiculoBean.getfecha_salida());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanControlVehiculo(ControlVehiculoParameterReturnGeneral controlvehiculoReturnGeneral,ControlVehiculoBean controlvehiculoBean,Boolean conDefault) throws Exception { 
		try {
			ControlVehiculo controlvehiculoLocal=new ControlVehiculo();
			
			controlvehiculoLocal=controlvehiculoReturnGeneral.getControlVehiculo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && controlvehiculoLocal.getId()!=null && !controlvehiculoLocal.getId().equals(0L))) {controlvehiculoBean.setId(controlvehiculoLocal.getId());}}
			if(conDefault || (!conDefault && controlvehiculoLocal.getnombre_conductor()!=null && !controlvehiculoLocal.getnombre_conductor().equals(""))) {controlvehiculoBean.setnombre_conductor(controlvehiculoLocal.getnombre_conductor());}
			if(conDefault || (!conDefault && controlvehiculoLocal.getnumero_placa()!=null && !controlvehiculoLocal.getnumero_placa().equals(""))) {controlvehiculoBean.setnumero_placa(controlvehiculoLocal.getnumero_placa());}
			if(conDefault || (!conDefault && controlvehiculoLocal.getfecha_entrada()!=null && !controlvehiculoLocal.getfecha_entrada().equals(new Date()))) {controlvehiculoBean.setfecha_entrada(controlvehiculoLocal.getfecha_entrada());}
			if(conDefault || (!conDefault && controlvehiculoLocal.getfecha_salida()!=null && !controlvehiculoLocal.getfecha_salida().equals(new Date()))) {controlvehiculoBean.setfecha_salida(controlvehiculoLocal.getfecha_salida());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxControlVehiculoGenerico(Long idControlVehiculoSeleccionado,JComboBox jComboBoxControlVehiculo,List<ControlVehiculo> controlvehiculosLocal)throws Exception {
		try {
			ControlVehiculo  controlvehiculoTemp=null;

			for(ControlVehiculo controlvehiculoAux:controlvehiculosLocal) {
				if(controlvehiculoAux.getId()!=null && controlvehiculoAux.getId().equals(idControlVehiculoSeleccionado)) {
					controlvehiculoTemp=controlvehiculoAux;
					break;
				}
			}

			jComboBoxControlVehiculo.setSelectedItem(controlvehiculoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxControlVehiculoGenerico(JComboBox jComboBoxControlVehiculo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxControlVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxControlVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxControlVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxControlVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxControlVehiculo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxControlVehiculo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxControlVehiculo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxControlVehiculo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxControlVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxControlVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			controlvehiculo=(ControlVehiculo) controlvehiculoLogic.getControlVehiculos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			controlvehiculo =(ControlVehiculo) controlvehiculos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!controlvehiculo.getIsNew() && !controlvehiculo.getIsChanged() && !controlvehiculo.getIsDeleted()) {
				sDescripcion=controlvehiculo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=controlvehiculo.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ControlVehiculo controlvehiculoRow=new ControlVehiculo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			controlvehiculoRow=(ControlVehiculo) controlvehiculoLogic.getControlVehiculos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			controlvehiculoRow=(ControlVehiculo) controlvehiculos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualControlVehiculo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoControlVehiculo.setVisible((this.isVisibilidadCeldaNuevoControlVehiculo && this.isPermisoNuevoControlVehiculo));			
			this.jButtonDuplicarControlVehiculo.setVisible((this.isVisibilidadCeldaDuplicarControlVehiculo && this.isPermisoDuplicarControlVehiculo));			
			this.jButtonCopiarControlVehiculo.setVisible((this.isVisibilidadCeldaCopiarControlVehiculo && this.isPermisoCopiarControlVehiculo));
			this.jButtonVerFormControlVehiculo.setVisible((this.isVisibilidadCeldaVerFormControlVehiculo && this.isPermisoVerFormControlVehiculo));
			
			this.jButtonAbrirOrderByControlVehiculo.setVisible((this.isVisibilidadCeldaOrdenControlVehiculo && this.isPermisoOrdenControlVehiculo));			
			
			this.jButtonNuevoRelacionesControlVehiculo.setVisible((this.isVisibilidadCeldaNuevoRelacionesControlVehiculo && this.isPermisoNuevoControlVehiculo));			
			this.jButtonNuevoGuardarCambiosControlVehiculo.setVisible((this.isVisibilidadCeldaNuevoControlVehiculo && this.isPermisoNuevoControlVehiculo && this.isPermisoGuardarCambiosControlVehiculo));
			
			if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
			this.jInternalFrameDetalleFormControlVehiculo.jButtonModificarControlVehiculo.setVisible((this.isVisibilidadCeldaModificarControlVehiculo && this.isPermisoActualizarControlVehiculo));	
			this.jInternalFrameDetalleFormControlVehiculo.jButtonActualizarControlVehiculo.setVisible((this.isVisibilidadCeldaActualizarControlVehiculo && this.isPermisoActualizarControlVehiculo));	
			this.jInternalFrameDetalleFormControlVehiculo.jButtonEliminarControlVehiculo.setVisible((this.isVisibilidadCeldaEliminarControlVehiculo && this.isPermisoEliminarControlVehiculo));
			this.jInternalFrameDetalleFormControlVehiculo.jButtonCancelarControlVehiculo.setVisible(this.isVisibilidadCeldaCancelarControlVehiculo);							
			this.jInternalFrameDetalleFormControlVehiculo.jButtonGuardarCambiosControlVehiculo.setVisible((this.isVisibilidadCeldaGuardarControlVehiculo && this.isPermisoGuardarCambiosControlVehiculo));			
			
			}
						
			this.jButtonGuardarCambiosTablaControlVehiculo.setVisible((this.isVisibilidadCeldaGuardarCambiosControlVehiculo && this.isPermisoGuardarCambiosControlVehiculo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarControlVehiculo.setVisible((this.isVisibilidadCeldaNuevoControlVehiculo && this.isPermisoNuevoControlVehiculo));						
			this.jButtonDuplicarToolBarControlVehiculo.setVisible((this.isVisibilidadCeldaDuplicarControlVehiculo && this.isPermisoDuplicarControlVehiculo));						
			this.jButtonCopiarToolBarControlVehiculo.setVisible((this.isVisibilidadCeldaCopiarControlVehiculo && this.isPermisoCopiarControlVehiculo));			
			this.jButtonVerFormToolBarControlVehiculo.setVisible((this.isVisibilidadCeldaVerFormControlVehiculo && this.isPermisoVerFormControlVehiculo));			
			this.jButtonAbrirOrderByToolBarControlVehiculo.setVisible((this.isVisibilidadCeldaOrdenControlVehiculo && this.isPermisoOrdenControlVehiculo));
			this.jButtonNuevoRelacionesToolBarControlVehiculo.setVisible((this.isVisibilidadCeldaNuevoRelacionesControlVehiculo && this.isPermisoNuevoControlVehiculo));			
			this.jButtonNuevoGuardarCambiosToolBarControlVehiculo.setVisible((this.isVisibilidadCeldaNuevoControlVehiculo && this.isPermisoNuevoControlVehiculo && this.isPermisoGuardarCambiosControlVehiculo));			
			
			if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
			this.jInternalFrameDetalleFormControlVehiculo.jButtonModificarToolBarControlVehiculo.setVisible((this.isVisibilidadCeldaModificarControlVehiculo && this.isPermisoActualizarControlVehiculo));	
			this.jInternalFrameDetalleFormControlVehiculo.jButtonActualizarToolBarControlVehiculo.setVisible((this.isVisibilidadCeldaActualizarControlVehiculo  && this.isPermisoActualizarControlVehiculo));	
			this.jInternalFrameDetalleFormControlVehiculo.jButtonEliminarToolBarControlVehiculo.setVisible((this.isVisibilidadCeldaEliminarControlVehiculo && this.isPermisoEliminarControlVehiculo));
			this.jInternalFrameDetalleFormControlVehiculo.jButtonCancelarToolBarControlVehiculo.setVisible(this.isVisibilidadCeldaCancelarControlVehiculo);				
			this.jInternalFrameDetalleFormControlVehiculo.jButtonGuardarCambiosToolBarControlVehiculo.setVisible((this.isVisibilidadCeldaGuardarControlVehiculo && this.isPermisoGuardarCambiosControlVehiculo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarControlVehiculo.setVisible((this.isVisibilidadCeldaGuardarCambiosControlVehiculo && this.isPermisoGuardarCambiosControlVehiculo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoControlVehiculo.setVisible((this.isVisibilidadCeldaNuevoControlVehiculo && this.isPermisoNuevoControlVehiculo));			
			this.jMenuItemDuplicarControlVehiculo.setVisible((this.isVisibilidadCeldaDuplicarControlVehiculo && this.isPermisoDuplicarControlVehiculo));			
			this.jMenuItemCopiarControlVehiculo.setVisible((this.isVisibilidadCeldaCopiarControlVehiculo && this.isPermisoCopiarControlVehiculo));			
			this.jMenuItemVerFormControlVehiculo.setVisible((this.isVisibilidadCeldaVerFormControlVehiculo && this.isPermisoVerFormControlVehiculo));			
			this.jMenuItemAbrirOrderByControlVehiculo.setVisible((this.isVisibilidadCeldaOrdenControlVehiculo && this.isPermisoOrdenControlVehiculo));			
			//this.jMenuItemMostrarOcultarControlVehiculo.setVisible((this.isVisibilidadCeldaOrdenControlVehiculo && this.isPermisoOrdenControlVehiculo));
			this.jMenuItemDetalleAbrirOrderByControlVehiculo.setVisible((this.isVisibilidadCeldaOrdenControlVehiculo && this.isPermisoOrdenControlVehiculo));			
			//this.jMenuItemDetalleMostrarOcultarControlVehiculo.setVisible((this.isVisibilidadCeldaOrdenControlVehiculo && this.isPermisoOrdenControlVehiculo));			
			this.jMenuItemNuevoRelacionesControlVehiculo.setVisible((this.isVisibilidadCeldaNuevoRelacionesControlVehiculo && this.isPermisoNuevoControlVehiculo));			
			this.jMenuItemNuevoGuardarCambiosControlVehiculo.setVisible((this.isVisibilidadCeldaNuevoControlVehiculo && this.isPermisoNuevoControlVehiculo && this.isPermisoGuardarCambiosControlVehiculo));									
			
			if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
			this.jInternalFrameDetalleFormControlVehiculo.jMenuItemModificarControlVehiculo.setVisible((this.isVisibilidadCeldaModificarControlVehiculo && this.isPermisoActualizarControlVehiculo));	
			this.jInternalFrameDetalleFormControlVehiculo.jMenuItemActualizarControlVehiculo.setVisible((this.isVisibilidadCeldaActualizarControlVehiculo && this.isPermisoActualizarControlVehiculo));	
			this.jInternalFrameDetalleFormControlVehiculo.jMenuItemEliminarControlVehiculo.setVisible((this.isVisibilidadCeldaEliminarControlVehiculo && this.isPermisoEliminarControlVehiculo));
			this.jInternalFrameDetalleFormControlVehiculo.jMenuItemCancelarControlVehiculo.setVisible(this.isVisibilidadCeldaCancelarControlVehiculo);				
			}
			
			this.jMenuItemGuardarCambiosControlVehiculo.setVisible((this.isVisibilidadCeldaGuardarControlVehiculo && this.isPermisoGuardarCambiosControlVehiculo));						
			this.jMenuItemGuardarCambiosTablaControlVehiculo.setVisible((this.isVisibilidadCeldaGuardarCambiosControlVehiculo && this.isPermisoGuardarCambiosControlVehiculo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoControlVehiculo=this.jButtonNuevoControlVehiculo.isVisible();
			this.isVisibilidadCeldaDuplicarControlVehiculo=this.jButtonDuplicarControlVehiculo.isVisible();
			this.isVisibilidadCeldaCopiarControlVehiculo=this.jButtonCopiarControlVehiculo.isVisible();
			this.isVisibilidadCeldaVerFormControlVehiculo=this.jButtonVerFormControlVehiculo.isVisible();
			
			this.isVisibilidadCeldaOrdenControlVehiculo=this.jButtonAbrirOrderByControlVehiculo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesControlVehiculo=this.jButtonNuevoRelacionesControlVehiculo.isVisible();
			this.isVisibilidadCeldaModificarControlVehiculo=this.jButtonModificarControlVehiculo.isVisible();
			
			if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
			this.isVisibilidadCeldaActualizarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jButtonActualizarControlVehiculo.isVisible();
			this.isVisibilidadCeldaEliminarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jButtonEliminarControlVehiculo.isVisible();
			this.isVisibilidadCeldaCancelarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jButtonCancelarControlVehiculo.isVisible();
			this.isVisibilidadCeldaGuardarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jButtonGuardarCambiosControlVehiculo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosControlVehiculo=this.jButtonGuardarCambiosTablaControlVehiculo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoControlVehiculo=this.jButtonNuevoToolBarControlVehiculo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesControlVehiculo=this.jButtonNuevoRelacionesToolBarControlVehiculo.isVisible();
			
			if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
			this.isVisibilidadCeldaModificarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jButtonModificarToolBarControlVehiculo.isVisible();
			this.isVisibilidadCeldaActualizarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jButtonActualizarToolBarControlVehiculo.isVisible();
			this.isVisibilidadCeldaEliminarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jButtonEliminarToolBarControlVehiculo.isVisible();
			this.isVisibilidadCeldaCancelarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jButtonCancelarToolBarControlVehiculo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarControlVehiculo=this.jButtonGuardarCambiosToolBarControlVehiculo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosControlVehiculo=this.jButtonGuardarCambiosTablaToolBarControlVehiculo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoControlVehiculo=this.jMenuItemNuevoControlVehiculo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesControlVehiculo=this.jMenuItemNuevoRelacionesControlVehiculo.isVisible();
			
			if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
			this.isVisibilidadCeldaModificarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jMenuItemModificarControlVehiculo.isVisible();
			this.isVisibilidadCeldaActualizarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jMenuItemActualizarControlVehiculo.isVisible();
			this.isVisibilidadCeldaEliminarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jMenuItemEliminarControlVehiculo.isVisible();
			this.isVisibilidadCeldaCancelarControlVehiculo=this.jInternalFrameDetalleFormControlVehiculo.jMenuItemCancelarControlVehiculo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarControlVehiculo=this.jMenuItemGuardarCambiosControlVehiculo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosControlVehiculo=this.jMenuItemGuardarCambiosTablaControlVehiculo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesControlVehiculo(Boolean esInicializar) {
		if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.controlvehiculoSessionBean.getConGuardarRelaciones()) {
				//if(this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesControlVehiculo();
			}
			
			this.inicializarActualizarBindingBotonesManualControlVehiculo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualControlVehiculo() {
		this.jButtonNuevoControlVehiculo.setVisible(this.isPermisoNuevoControlVehiculo);			
		this.jButtonDuplicarControlVehiculo.setVisible(this.isPermisoDuplicarControlVehiculo);			
		this.jButtonCopiarControlVehiculo.setVisible(this.isPermisoCopiarControlVehiculo);			
		this.jButtonVerFormControlVehiculo.setVisible(this.isPermisoVerFormControlVehiculo);			
		
		this.jButtonAbrirOrderByControlVehiculo.setVisible(this.isPermisoOrdenControlVehiculo);					
		
		this.jButtonNuevoRelacionesControlVehiculo.setVisible(this.isPermisoNuevoControlVehiculo);			
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlVehiculo.jButtonModificarControlVehiculo.setVisible(this.isPermisoActualizarControlVehiculo);	
			this.jInternalFrameDetalleFormControlVehiculo.jButtonActualizarControlVehiculo.setVisible(this.isPermisoActualizarControlVehiculo);	
			this.jInternalFrameDetalleFormControlVehiculo.jButtonEliminarControlVehiculo.setVisible(this.isPermisoEliminarControlVehiculo);
			this.jInternalFrameDetalleFormControlVehiculo.jButtonCancelarControlVehiculo.setVisible(this.isVisibilidadCeldaCancelarControlVehiculo);						
			this.jInternalFrameDetalleFormControlVehiculo.jButtonGuardarCambiosControlVehiculo.setVisible(this.isPermisoGuardarCambiosControlVehiculo);							
		}
		
		this.jButtonGuardarCambiosTablaControlVehiculo.setVisible(this.isPermisoActualizarControlVehiculo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleControlVehiculo() {
		this.jInternalFrameDetalleFormControlVehiculo.jButtonModificarControlVehiculo.setVisible(this.isPermisoActualizarControlVehiculo);	
		this.jInternalFrameDetalleFormControlVehiculo.jButtonActualizarControlVehiculo.setVisible(this.isPermisoActualizarControlVehiculo);	
		this.jInternalFrameDetalleFormControlVehiculo.jButtonEliminarControlVehiculo.setVisible(this.isPermisoEliminarControlVehiculo);
		this.jInternalFrameDetalleFormControlVehiculo.jButtonCancelarControlVehiculo.setVisible(this.isVisibilidadCeldaCancelarControlVehiculo);							
		this.jInternalFrameDetalleFormControlVehiculo.jButtonGuardarCambiosControlVehiculo.setVisible((this.isVisibilidadCeldaGuardarControlVehiculo && this.isPermisoGuardarCambiosControlVehiculo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosControlVehiculo() {
		if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualControlVehiculo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesControlVehiculo() {
	}
	
	public void jTableDatosControlVehiculoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarControlVehiculo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidControlVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlVehiculo(this.getcontrolvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlvehiculo==null) {
						this.controlvehiculo = new ControlVehiculo();
					}

					this.setVariablesFormularioToObjetoActualControlVehiculo(this.controlvehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
				}

				if(this.controlvehiculo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.controlvehiculo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaControlVehiculoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebControlVehiculo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosControlVehiculo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosControlVehiculo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualControlVehiculo(this.getcontrolvehiculo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.controlvehiculoLogic.getConnexion());

				if(this.controlvehiculo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.controlvehiculo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderControlVehiculo=(TitledBorder)this.jScrollPanelDatosControlVehiculo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderControlVehiculo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaControlVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlVehiculo(this.getcontrolvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlvehiculo==null) {
						this.controlvehiculo = new ControlVehiculo();
					}

					this.setVariablesFormularioToObjetoActualControlVehiculo(this.controlvehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
				}

				if(this.controlvehiculo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.controlvehiculo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_conductorControlVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlVehiculo(this.getcontrolvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlvehiculo==null) {
						this.controlvehiculo = new ControlVehiculo();
					}

					this.setVariablesFormularioToObjetoActualControlVehiculo(this.controlvehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
				}

				if(this.controlvehiculo.getnombre_conductor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_conductor like '%"+this.controlvehiculo.getnombre_conductor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_placaControlVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlVehiculo(this.getcontrolvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlvehiculo==null) {
						this.controlvehiculo = new ControlVehiculo();
					}

					this.setVariablesFormularioToObjetoActualControlVehiculo(this.controlvehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
				}

				if(this.controlvehiculo.getnumero_placa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_placa like '%"+this.controlvehiculo.getnumero_placa()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_entradaControlVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlVehiculo(this.getcontrolvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlvehiculo==null) {
						this.controlvehiculo = new ControlVehiculo();
					}

					this.setVariablesFormularioToObjetoActualControlVehiculo(this.controlvehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
				}

				if(this.controlvehiculo.getfecha_entrada()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_entrada = '"+Funciones2.getStringPostgresDate(this.controlvehiculo.getfecha_entrada())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_salidaControlVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlVehiculo(this.getcontrolvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlvehiculo==null) {
						this.controlvehiculo = new ControlVehiculo();
					}

					this.setVariablesFormularioToObjetoActualControlVehiculo(this.controlvehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);
				}

				if(this.controlvehiculo.getfecha_salida()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_salida = '"+Funciones2.getStringPostgresDate(this.controlvehiculo.getfecha_salida())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorFechaEntradaControlVehiculoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingControlVehiculo(false,false);

			this.getControlVehiculosBusquedaPorFechaEntrada();

			this.inicializarActualizarBindingControlVehiculo(false);

			//if(ControlVehiculoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingControlVehiculo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorFechaSalidaControlVehiculoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingControlVehiculo(false,false);

			this.getControlVehiculosBusquedaPorFechaSalida();

			this.inicializarActualizarBindingControlVehiculo(false);

			//if(ControlVehiculoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingControlVehiculo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreConductorControlVehiculoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingControlVehiculo(false,false);

			this.getControlVehiculosBusquedaPorNombreConductor();

			this.inicializarActualizarBindingControlVehiculo(false);

			//if(ControlVehiculoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingControlVehiculo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNumeroPlacaControlVehiculoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingControlVehiculo(false,false);

			this.getControlVehiculosBusquedaPorNumeroPlaca();

			this.inicializarActualizarBindingControlVehiculo(false);

			//if(ControlVehiculoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingControlVehiculo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaControlVehiculoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingControlVehiculo(false,false);

			this.getControlVehiculosFK_IdEmpresa();

			this.inicializarActualizarBindingControlVehiculo(false);

			//if(ControlVehiculoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingControlVehiculo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlvehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameControlVehiculo() {
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
			this.jInternalFrameDetalleFormControlVehiculo.setVisible(false);	    			
			this.jInternalFrameDetalleFormControlVehiculo.dispose();
			this.jInternalFrameDetalleFormControlVehiculo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoControlVehiculo!=null) {
			this.jInternalFrameReporteDinamicoControlVehiculo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoControlVehiculo.dispose();
			this.jInternalFrameReporteDinamicoControlVehiculo=null;
		}
		
		if(this.jInternalFrameImportacionControlVehiculo!=null) {
			this.jInternalFrameImportacionControlVehiculo.setVisible(false);	    			
			this.jInternalFrameImportacionControlVehiculo.dispose();
			this.jInternalFrameImportacionControlVehiculo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessControlVehiculo();
			
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			
			
			if(sTipo.equals("NuevoControlVehiculo")) {
				jButtonNuevoControlVehiculoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarControlVehiculo")) {
				jButtonDuplicarControlVehiculoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarControlVehiculo")) {
				jButtonCopiarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("VerFormControlVehiculo")) {
				jButtonVerFormControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarControlVehiculo")) {
				jButtonNuevoControlVehiculoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarControlVehiculo")) {
				jButtonDuplicarControlVehiculoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoControlVehiculo")) {
				jButtonNuevoControlVehiculoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarControlVehiculo")) {
				jButtonDuplicarControlVehiculoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesControlVehiculo")) {
				jButtonNuevoControlVehiculoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarControlVehiculo")) {
				jButtonNuevoControlVehiculoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesControlVehiculo")) {
				jButtonNuevoControlVehiculoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarControlVehiculo")) {
				jButtonModificarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarControlVehiculo")) {
				jButtonModificarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarControlVehiculo")) {
				jButtonModificarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarControlVehiculo")) {
				jButtonActualizarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarControlVehiculo")) {
				jButtonActualizarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarControlVehiculo")) {
				jButtonActualizarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("EliminarControlVehiculo")) {
				jButtonEliminarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarControlVehiculo")) {
				jButtonEliminarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarControlVehiculo")) {
				jButtonEliminarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("CancelarControlVehiculo")) {
				jButtonCancelarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarControlVehiculo")) {
				jButtonCancelarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarControlVehiculo")) {
				jButtonCancelarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("CerrarControlVehiculo")) {
				jButtonCerrarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarControlVehiculo")) {
				jButtonCerrarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarControlVehiculo")) {
				jButtonCerrarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarControlVehiculo")) {
				jButtonMostrarOcultarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarControlVehiculo")) {
				jButtonCancelarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosControlVehiculo")) {
				jButtonGuardarCambiosControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarControlVehiculo")) {
				jButtonGuardarCambiosControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarControlVehiculo")) {
				jButtonCopiarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarControlVehiculo")) {
				jButtonVerFormControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosControlVehiculo")) {
				jButtonGuardarCambiosControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarControlVehiculo")) {
				jButtonCopiarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormControlVehiculo")) {
				jButtonVerFormControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaControlVehiculo")) {
				jButtonGuardarCambiosControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarControlVehiculo")) {
				jButtonGuardarCambiosControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaControlVehiculo")) {
				jButtonGuardarCambiosControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionControlVehiculo")) {
				jButtonRecargarInformacionControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarControlVehiculo")) {
				jButtonRecargarInformacionControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionControlVehiculo")) {
				jButtonRecargarInformacionControlVehiculoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresControlVehiculo")) {
				jButtonAnterioresControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarControlVehiculo")) {
				jButtonAnterioresControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreControlVehiculo")) {
				jButtonAnterioresControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesControlVehiculo")) {
				jButtonSiguientesControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarControlVehiculo")) {
				jButtonSiguientesControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesControlVehiculo")) {
				jButtonSiguientesControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByControlVehiculo") || sTipo.equals("MenuItemDetalleAbrirOrderByControlVehiculo")) {
				jButtonAbrirOrderByControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarControlVehiculo") || sTipo.equals("MenuItemDetalleMostrarOcultarControlVehiculo")) {
				jButtonMostrarOcultarControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosControlVehiculo")) {
				jButtonNuevoGuardarCambiosControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarControlVehiculo")) {
				jButtonNuevoGuardarCambiosControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosControlVehiculo")) {
				jButtonNuevoGuardarCambiosControlVehiculoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoControlVehiculo")) {
				jButtonCerrarReporteDinamicoControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoControlVehiculo")) {
				jButtonGenerarReporteDinamicoControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoControlVehiculo")) {
				
				jButtonGenerarExcelReporteDinamicoControlVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionControlVehiculo")) {
				jButtonCerrarImportacionControlVehiculoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionControlVehiculo")) {
				
				jButtonGenerarImportacionControlVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionControlVehiculo")) {
				
				jButtonAbrirImportacionControlVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesControlVehiculo")) {
				jComboBoxTiposAccionesControlVehiculoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesControlVehiculo")) {
				jComboBoxTiposRelacionesControlVehiculoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioControlVehiculo")) {
				jComboBoxTiposAccionesControlVehiculoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarControlVehiculo")) {
				
				jComboBoxTiposSeleccionarControlVehiculoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralControlVehiculo")) {
				jTextFieldValorCampoGeneralControlVehiculoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByControlVehiculo")) {
				jButtonAbrirOrderByControlVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarControlVehiculo")) {
				jButtonAbrirOrderByControlVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByControlVehiculo")) {
				jButtonCerrarOrderByControlVehiculoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idControlVehiculoBusqueda")) {
				this.jButtonidControlVehiculoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaControlVehiculoUpdate")) {
				this.jButtonid_empresaControlVehiculoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaControlVehiculoBusqueda")) {
				this.jButtonid_empresaControlVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_conductorControlVehiculoBusqueda")) {
				this.jButtonnombre_conductorControlVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_placaControlVehiculoBusqueda")) {
				this.jButtonnumero_placaControlVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entradaControlVehiculoBusqueda")) {
				this.jButtonfecha_entradaControlVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_salidaControlVehiculoBusqueda")) {
				this.jButtonfecha_salidaControlVehiculoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorFechaEntradaControlVehiculo")) {
				this.jButtonBusquedaPorFechaEntradaControlVehiculoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorFechaSalidaControlVehiculo")) {
				this.jButtonBusquedaPorFechaSalidaControlVehiculoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreConductorControlVehiculo")) {
				this.jButtonBusquedaPorNombreConductorControlVehiculoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNumeroPlacaControlVehiculo")) {
				this.jButtonBusquedaPorNumeroPlacaControlVehiculoActionPerformed(evt);
			}
			
			;
			
			
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessControlVehiculo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaControlVehiculoActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlvehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlvehiculo);
				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
				
				


				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlVehiculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlVehiculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ControlVehiculo controlvehiculoLocal=null;
			
			if(!this.getEsControlTabla()) {
				controlvehiculoLocal=this.controlvehiculo;
			} else {
				controlvehiculoLocal=this.controlvehiculoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlvehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlvehiculo);
				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
							
				
				


				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlVehiculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlVehiculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaControlVehiculoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoAnterior =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.controlvehiculoAnterior =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaControlVehiculoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlvehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlvehiculo);
				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
								
						
				


				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlVehiculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlVehiculo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlvehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlvehiculo);
				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
								
				
				


				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlVehiculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlVehiculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaControlVehiculoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoAnterior =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.controlvehiculoAnterior =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlvehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlvehiculo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaControlVehiculoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoAnterior =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.controlvehiculoAnterior =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaControlVehiculoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.controlvehiculo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.controlvehiculo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlvehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlvehiculo);
				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
							
				
				


				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlVehiculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlVehiculo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaControlVehiculoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlvehiculoAnterior =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.controlvehiculoAnterior =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaControlVehiculoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.controlvehiculo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.controlvehiculo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlvehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlvehiculo);
				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
								
				
				


				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlVehiculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlVehiculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaControlVehiculoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoAnterior =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.controlvehiculoAnterior =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaControlVehiculoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.controlvehiculo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.controlvehiculo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaControlVehiculoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlvehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlvehiculo);
				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosControlVehiculo")) {
					jCheckBoxSeleccionarTodosControlVehiculoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosControlVehiculo")) {
					jCheckBoxSeleccionadosControlVehiculoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarControlVehiculo")) {
					
				}
				
				


				
				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlVehiculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlVehiculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.controlvehiculo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.controlvehiculo);
				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
												
				
				


				
				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlVehiculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlVehiculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaControlVehiculoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlvehiculoAnterior =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.controlvehiculoAnterior =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaControlVehiculoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlvehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlvehiculo);
				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
				
				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaControlVehiculoActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlvehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlvehiculo);
				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlVehiculo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlVehiculo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlvehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlvehiculo);
				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlVehiculo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlVehiculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaControlVehiculoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlvehiculoAnterior =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.controlvehiculoAnterior =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarControlVehiculo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosControlVehiculoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosControlVehiculo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.controlvehiculo =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.controlvehiculo =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.controlvehiculo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarControlVehiculo")) {
				
				}
				
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarControlVehiculo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosControlVehiculo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarControlVehiculo")) {
			
			}
			
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessControlVehiculo();
			
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			
			if(sTipo.equals("NuevoControlVehiculo")) {
				jButtonNuevoControlVehiculoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarControlVehiculo")) {
				jButtonDuplicarControlVehiculoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarControlVehiculo")) {
				jButtonCopiarControlVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormControlVehiculo")) {
				jButtonVerFormControlVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesControlVehiculo")) {
				jButtonNuevoControlVehiculoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarControlVehiculo")) {
				jButtonModificarControlVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarControlVehiculo")) {
				jButtonActualizarControlVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarControlVehiculo")) {
				jButtonEliminarControlVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaControlVehiculo")) {
				jButtonGuardarCambiosControlVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarControlVehiculo")) {
				jButtonCancelarControlVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarControlVehiculo")) {
				jButtonCerrarControlVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosControlVehiculo")) {
				jButtonGuardarCambiosControlVehiculoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosControlVehiculo")) {
				jButtonNuevoGuardarCambiosControlVehiculoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByControlVehiculo")) {
				jButtonAbrirOrderByControlVehiculoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionControlVehiculo")) {
				jButtonRecargarInformacionControlVehiculoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresControlVehiculo")) {
				jButtonAnterioresControlVehiculoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesControlVehiculo")) {
				jButtonSiguientesControlVehiculoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idControlVehiculoBusqueda")) {
				this.jButtonidControlVehiculoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaControlVehiculoUpdate")) {
				this.jButtonid_empresaControlVehiculoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaControlVehiculoBusqueda")) {
				this.jButtonid_empresaControlVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_conductorControlVehiculoBusqueda")) {
				this.jButtonnombre_conductorControlVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_placaControlVehiculoBusqueda")) {
				this.jButtonnumero_placaControlVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entradaControlVehiculoBusqueda")) {
				this.jButtonfecha_entradaControlVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_salidaControlVehiculoBusqueda")) {
				this.jButtonfecha_salidaControlVehiculoBusquedaActionPerformed(evt);
			}
			
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessControlVehiculo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameControlVehiculo")) {
				closingInternalFrameControlVehiculo();
				
			} else if(sTipo.equals("jButtonCancelarControlVehiculo")) {
				JInternalFrameBase jInternalFrameDetalleFormControlVehiculo = (JInternalFrameBase)evt.getSource();
	            	
	            ControlVehiculoBeanSwingJInternalFrame jInternalFrameParent=(ControlVehiculoBeanSwingJInternalFrame)jInternalFrameDetalleFormControlVehiculo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarControlVehiculoActionPerformed(null);
			}
			
			ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.controlvehiculo,new Object(),this.controlvehiculoParameterGeneral,this.controlvehiculoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormControlVehiculo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormControlVehiculo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormControlVehiculo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.controlvehiculo)) {
			if(!esControlTabla) {
				if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualControlVehiculo(this.controlvehiculo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);			
				}
				
				if(this.controlvehiculoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualControlVehiculo(this.controlvehiculo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.controlvehiculoReturnGeneral=controlvehiculoLogic.procesarEventosControlVehiculosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.controlvehiculoLogic.getControlVehiculos(),this.controlvehiculo,this.controlvehiculoParameterGeneral,this.isEsNuevoControlVehiculo,classes);//this.controlvehiculoLogic.getControlVehiculo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanControlVehiculo(this.controlvehiculoReturnGeneral,this.controlvehiculoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.controlvehiculoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanControlVehiculo(classes,this.controlvehiculoReturnGeneral,this.controlvehiculoBean,false);
					}
						
					if(this.controlvehiculoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyControlVehiculo(this.controlvehiculoReturnGeneral.getControlVehiculo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioControlVehiculo(this.controlvehiculoReturnGeneral.getControlVehiculo());	
					}
						
					if(this.controlvehiculoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioControlVehiculo(this.controlvehiculoReturnGeneral.getControlVehiculo(),classes);//this.controlvehiculoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioControlVehiculo(this.controlvehiculo,classes);//this.controlvehiculoBean);									
				}
			
				if(ControlVehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualControlVehiculo(this.controlvehiculo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysControlVehiculo(this.controlvehiculo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.controlvehiculoAnterior!=null) {
						this.controlvehiculo=this.controlvehiculoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.controlvehiculoReturnGeneral=controlvehiculoLogic.procesarEventosControlVehiculosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.controlvehiculoLogic.getControlVehiculos(),this.controlvehiculo,this.controlvehiculoParameterGeneral,this.isEsNuevoControlVehiculo,classes);//this.controlvehiculoLogic.getControlVehiculo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.controlvehiculoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.controlvehiculoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.controlvehiculoReturnGeneral.getControlVehiculo(),controlvehiculoLogic.getControlVehiculos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.controlvehiculoReturnGeneral.getControlVehiculo(),this.controlvehiculos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosControlVehiculo.repaint();
				
				//((AbstractTableModel) this.jTableDatosControlVehiculo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosControlVehiculo();
			}
		}
	}
	
	public void actualizarVisualTableDatosControlVehiculo() throws Exception {
		
		ControlVehiculoModel controlvehiculoModel=(ControlVehiculoModel)this.jTableDatosControlVehiculo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			controlvehiculoModel.controlvehiculos=this.controlvehiculoLogic.getControlVehiculos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			controlvehiculoModel.controlvehiculos=this.controlvehiculos;
		}
		
		
		((ControlVehiculoModel) this.jTableDatosControlVehiculo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaControlVehiculo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcontrolvehiculoAnterior(),this.controlvehiculoLogic.getControlVehiculos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcontrolvehiculoAnterior(),this.controlvehiculos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosControlVehiculo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioControlVehiculo(ControlVehiculo controlvehiculo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.controlvehiculo,new Object(),generalEntityParameterGeneral,this.controlvehiculoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.controlvehiculoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ControlVehiculoConstantesFunciones.getClassesRelationshipsOfControlVehiculo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ControlVehiculoConstantesFunciones.getClassesRelationshipsFromStringsOfControlVehiculo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormControlVehiculo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ControlVehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.controlvehiculo,new Object(),generalEntityParameterGeneral,this.controlvehiculoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioControlVehiculo(ControlVehiculoBean controlvehiculoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanControlVehiculo(ArrayList<Classe> classes,ControlVehiculoReturnGeneral controlvehiculoReturnGeneral,ControlVehiculoBean controlvehiculoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualControlVehiculo(ControlVehiculo controlvehiculo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.controlvehiculo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormControlVehiculo = new ControlVehiculoDetalleFormJInternalFrame(jDesktopPane,this.controlvehiculoSessionBean.getConGuardarRelaciones(),this.controlvehiculoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormControlVehiculo);
		this.jInternalFrameDetalleFormControlVehiculo.setVisible(false);
		this.jInternalFrameDetalleFormControlVehiculo.setSelected(false);						
		
		this.jInternalFrameDetalleFormControlVehiculo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormControlVehiculo.controlvehiculoLogic=this.controlvehiculoLogic;
		
		this.cargarCombosFrameForeignKeyControlVehiculo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleControlVehiculo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleControlVehiculo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyControlVehiculo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyControlVehiculo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormControlVehiculo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarControlVehiculo"));
		
		this.jInternalFrameDetalleFormControlVehiculo.jButtonModificarControlVehiculo.addActionListener(new ButtonActionListener(this,"ModificarControlVehiculo"));

		
		this.jInternalFrameDetalleFormControlVehiculo.jButtonModificarToolBarControlVehiculo.addActionListener(new ButtonActionListener(this,"ModificarToolBarControlVehiculo"));
					
		this.jInternalFrameDetalleFormControlVehiculo.jMenuItemModificarControlVehiculo.addActionListener(new ButtonActionListener(this,"MenuItemModificarControlVehiculo"));		
		
		
		
		this.jInternalFrameDetalleFormControlVehiculo.jButtonActualizarControlVehiculo.addActionListener (new ButtonActionListener(this,"ActualizarControlVehiculo"));
		
		
		this.jInternalFrameDetalleFormControlVehiculo.jButtonActualizarToolBarControlVehiculo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarControlVehiculo"));
						
		this.jInternalFrameDetalleFormControlVehiculo.jMenuItemActualizarControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarControlVehiculo"));		
		
		
		
		this.jInternalFrameDetalleFormControlVehiculo.jButtonEliminarControlVehiculo.addActionListener (new ButtonActionListener(this,"EliminarControlVehiculo"));
		
		
		this.jInternalFrameDetalleFormControlVehiculo.jButtonEliminarToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"EliminarToolBarControlVehiculo"));
								
		this.jInternalFrameDetalleFormControlVehiculo.jMenuItemEliminarControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarControlVehiculo"));		
		
		
		
		this.jInternalFrameDetalleFormControlVehiculo.jButtonCancelarControlVehiculo.addActionListener (new ButtonActionListener(this,"CancelarControlVehiculo"));
		
		
		this.jInternalFrameDetalleFormControlVehiculo.jButtonCancelarToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"CancelarToolBarControlVehiculo"));
					
		this.jInternalFrameDetalleFormControlVehiculo.jMenuItemCancelarControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarControlVehiculo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormControlVehiculo.jMenuItemDetalleCerrarControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarControlVehiculo"));		
		
		
		
		this.jInternalFrameDetalleFormControlVehiculo.jButtonGuardarCambiosToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarControlVehiculo"));
		
		
		
		this.jInternalFrameDetalleFormControlVehiculo.jButtonGuardarCambiosToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarControlVehiculo"));
		
		
		
		this.jInternalFrameDetalleFormControlVehiculo.jComboBoxTiposAccionesFormularioControlVehiculo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioControlVehiculo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonidControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"idControlVehiculoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormControlVehiculo.jButtonid_empresaControlVehiculoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaControlVehiculoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonid_empresaControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaControlVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonnombre_conductorControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_conductorControlVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonnumero_placaControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_placaControlVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonfecha_entradaControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entradaControlVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonfecha_salidaControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_salidaControlVehiculoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormControlVehiculo.jTabbedPaneRelacionesControlVehiculo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesControlVehiculo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameControlVehiculo"));
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlVehiculo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarControlVehiculo"));
		}
		
		this.jTableDatosControlVehiculo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarControlVehiculo"));
		
		this.jTableDatosControlVehiculo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarControlVehiculo"));
		
		this.jButtonNuevoControlVehiculo.addActionListener(new ButtonActionListener(this,"NuevoControlVehiculo"));
		
		this.jButtonDuplicarControlVehiculo.addActionListener(new ButtonActionListener(this,"DuplicarControlVehiculo"));
		
		this.jButtonCopiarControlVehiculo.addActionListener(new ButtonActionListener(this,"CopiarControlVehiculo"));
		
		this.jButtonVerFormControlVehiculo.addActionListener(new ButtonActionListener(this,"VerFormControlVehiculo"));
		
		
		this.jButtonNuevoToolBarControlVehiculo.addActionListener(new ButtonActionListener(this,"NuevoToolBarControlVehiculo"));
			
		this.jButtonDuplicarToolBarControlVehiculo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarControlVehiculo"));
			
		this.jMenuItemNuevoControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoControlVehiculo"));
			
		this.jMenuItemDuplicarControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarControlVehiculo"));		
		
		
		this.jButtonNuevoRelacionesControlVehiculo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesControlVehiculo"));
		
		
		this.jButtonNuevoRelacionesToolBarControlVehiculo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarControlVehiculo"));
			
		this.jMenuItemNuevoRelacionesControlVehiculo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesControlVehiculo"));		
		
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlVehiculo.jButtonModificarControlVehiculo.addActionListener(new ButtonActionListener(this,"ModificarControlVehiculo"));
		}
		
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlVehiculo.jButtonModificarToolBarControlVehiculo.addActionListener(new ButtonActionListener(this,"ModificarToolBarControlVehiculo"));
			
			this.jInternalFrameDetalleFormControlVehiculo.jMenuItemModificarControlVehiculo.addActionListener(new ButtonActionListener(this,"MenuItemModificarControlVehiculo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormControlVehiculo.jButtonActualizarControlVehiculo.addActionListener (new ButtonActionListener(this,"ActualizarControlVehiculo"));
		}
		
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlVehiculo.jButtonActualizarToolBarControlVehiculo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarControlVehiculo"));
				
			this.jInternalFrameDetalleFormControlVehiculo.jMenuItemActualizarControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarControlVehiculo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlVehiculo.jButtonEliminarControlVehiculo.addActionListener (new ButtonActionListener(this,"EliminarControlVehiculo"));
		}
		
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlVehiculo.jButtonEliminarToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"EliminarToolBarControlVehiculo"));
						
			this.jInternalFrameDetalleFormControlVehiculo.jMenuItemEliminarControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarControlVehiculo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlVehiculo.jButtonCancelarControlVehiculo.addActionListener (new ButtonActionListener(this,"CancelarControlVehiculo"));
		}
		
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlVehiculo.jButtonCancelarToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"CancelarToolBarControlVehiculo"));
			
			this.jInternalFrameDetalleFormControlVehiculo.jMenuItemCancelarControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarControlVehiculo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarControlVehiculo"));		
		
		
		this.jButtonCerrarControlVehiculo.addActionListener (new ButtonActionListener(this,"CerrarControlVehiculo"));
		
		
		this.jButtonCerrarToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"CerrarToolBarControlVehiculo"));
			
		this.jMenuItemCerrarControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarControlVehiculo"));
			
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlVehiculo.jMenuItemDetalleCerrarControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarControlVehiculo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlVehiculo.jButtonGuardarCambiosControlVehiculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosControlVehiculo"));
		}
		
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlVehiculo.jButtonGuardarCambiosToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarControlVehiculo"));
		}
		
		this.jButtonCopiarToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"CopiarToolBarControlVehiculo"));
			
		this.jButtonVerFormToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"VerFormToolBarControlVehiculo"));
		
		this.jMenuItemGuardarCambiosControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosControlVehiculo"));
			
		this.jMenuItemCopiarControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarControlVehiculo"));		
		
		this.jMenuItemVerFormControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormControlVehiculo"));		
		
		
		this.jButtonGuardarCambiosTablaControlVehiculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaControlVehiculo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarControlVehiculo"));
			
		this.jMenuItemGuardarCambiosTablaControlVehiculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaControlVehiculo"));		
		
		
		
		this.jButtonRecargarInformacionControlVehiculo.addActionListener (new ButtonActionListener(this,"RecargarInformacionControlVehiculo"));
					
		this.jButtonRecargarInformacionToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarControlVehiculo"));
		
		this.jMenuItemRecargarInformacionControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionControlVehiculo"));		
		
		
		
		this.jButtonAnterioresControlVehiculo.addActionListener (new ButtonActionListener(this,"AnterioresControlVehiculo"));
		
		
		this.jButtonAnterioresToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarControlVehiculo"));
		
		this.jMenuItemAnterioresControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresControlVehiculo"));		
		
		
		this.jButtonSiguientesControlVehiculo.addActionListener (new ButtonActionListener(this,"SiguientesControlVehiculo"));
		
		
		this.jButtonSiguientesToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarControlVehiculo"));
			
		this.jMenuItemSiguientesControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesControlVehiculo"));
			
		this.jMenuItemAbrirOrderByControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByControlVehiculo"));
			
		this.jMenuItemMostrarOcultarControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarControlVehiculo"));
			
		this.jMenuItemDetalleAbrirOrderByControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByControlVehiculo"));
			
		this.jMenuItemDetalleMostarOcultarControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarControlVehiculo"));		
		
		
		this.jButtonNuevoGuardarCambiosControlVehiculo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosControlVehiculo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarControlVehiculo"));
			
		this.jMenuItemNuevoGuardarCambiosControlVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosControlVehiculo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosControlVehiculo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosControlVehiculo"));

		this.jCheckBoxSeleccionadosControlVehiculo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosControlVehiculo"));
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlVehiculo.jComboBoxTiposAccionesFormularioControlVehiculo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioControlVehiculo"));
		}
		
		
		this.jComboBoxTiposRelacionesControlVehiculo.addActionListener (new ButtonActionListener(this,"TiposRelacionesControlVehiculo"));
			
		this.jComboBoxTiposAccionesControlVehiculo.addActionListener (new ButtonActionListener(this,"TiposAccionesControlVehiculo"));
					
		this.jComboBoxTiposSeleccionarControlVehiculo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarControlVehiculo"));
			
		this.jTextFieldValorCampoGeneralControlVehiculo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralControlVehiculo"));		
		
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonidControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"idControlVehiculoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormControlVehiculo.jButtonid_empresaControlVehiculoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaControlVehiculoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonid_empresaControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaControlVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonnombre_conductorControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_conductorControlVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonnumero_placaControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_placaControlVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonfecha_entradaControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entradaControlVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonfecha_salidaControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_salidaControlVehiculoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorFechaEntradaControlVehiculo.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaEntradaControlVehiculo"));

			this.jButtonBusquedaPorFechaSalidaControlVehiculo.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaSalidaControlVehiculo"));

			this.jButtonBusquedaPorNombreConductorControlVehiculo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreConductorControlVehiculo"));

			this.jButtonBusquedaPorNumeroPlacaControlVehiculo.addActionListener(new ButtonActionListener(this,"BusquedaPorNumeroPlacaControlVehiculo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoControlVehiculo!=null) {
				this.jInternalFrameReporteDinamicoControlVehiculo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoControlVehiculo"));
				this.jInternalFrameReporteDinamicoControlVehiculo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoControlVehiculo"));
				this.jInternalFrameReporteDinamicoControlVehiculo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoControlVehiculo"));
			}
			
			//this.jButtonCerrarReporteDinamicoControlVehiculo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoControlVehiculo"));				
			//this.jButtonGenerarReporteDinamicoControlVehiculo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoControlVehiculo"));
			//this.jButtonGenerarExcelReporteDinamicoControlVehiculo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoControlVehiculo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionControlVehiculo!=null) {
				this.jInternalFrameImportacionControlVehiculo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionControlVehiculo"));
				this.jInternalFrameImportacionControlVehiculo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionControlVehiculo"));
				this.jInternalFrameImportacionControlVehiculo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionControlVehiculo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByControlVehiculo.addActionListener (new ButtonActionListener(this,"AbrirOrderByControlVehiculo"));
			
			this.jButtonAbrirOrderByToolBarControlVehiculo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarControlVehiculo"));			
			
			if(this.jInternalFrameOrderByControlVehiculo!=null) {
				this.jInternalFrameOrderByControlVehiculo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByControlVehiculo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlVehiculo.jTabbedPaneRelacionesControlVehiculo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesControlVehiculo"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameControlVehiculo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormControlVehiculo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormControlVehiculo = (JInternalFrameBase)event.getSource();
	            	
	            ControlVehiculoBeanSwingJInternalFrame jInternalFrameParent=(ControlVehiculoBeanSwingJInternalFrame)jInternalFrameDetalleFormControlVehiculo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarControlVehiculoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosControlVehiculo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosControlVehiculoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosControlVehiculo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosControlVehiculo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoControlVehiculoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoControlVehiculoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoControlVehiculoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoControlVehiculo";
		inputMap = this.jButtonNuevoControlVehiculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoControlVehiculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoControlVehiculoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoControlVehiculoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoControlVehiculoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoControlVehiculoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesControlVehiculo";
		inputMap = this.jButtonNuevoRelacionesControlVehiculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesControlVehiculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoControlVehiculoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarControlVehiculo";
		inputMap = this.jButtonModificarControlVehiculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarControlVehiculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarControlVehiculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarControlVehiculo";
		inputMap = this.jButtonActualizarControlVehiculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarControlVehiculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarControlVehiculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarControlVehiculo";
		inputMap = this.jButtonEliminarControlVehiculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarControlVehiculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarControlVehiculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarControlVehiculo";
		inputMap = this.jButtonCancelarControlVehiculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarControlVehiculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarControlVehiculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarControlVehiculo";
		inputMap = this.jButtonCerrarControlVehiculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarControlVehiculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarControlVehiculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormControlVehiculo.jButtonGuardarCambiosControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosControlVehiculo";
		inputMap = this.jInternalFrameDetalleFormControlVehiculo.jButtonGuardarCambiosControlVehiculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormControlVehiculo.jButtonGuardarCambiosControlVehiculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosControlVehiculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosControlVehiculo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosControlVehiculoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesControlVehiculo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesControlVehiculoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarControlVehiculo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarControlVehiculoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralControlVehiculo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralControlVehiculoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonidControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"idControlVehiculoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormControlVehiculo.jButtonid_empresaControlVehiculoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaControlVehiculoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonid_empresaControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaControlVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonnombre_conductorControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_conductorControlVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonnumero_placaControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_placaControlVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonfecha_entradaControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entradaControlVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlVehiculo.jButtonfecha_salidaControlVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_salidaControlVehiculoBusqueda"));
		
		
		this.jButtonBusquedaPorFechaEntradaControlVehiculo.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaEntradaControlVehiculo"));

		this.jButtonBusquedaPorFechaSalidaControlVehiculo.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaSalidaControlVehiculo"));

		this.jButtonBusquedaPorNombreConductorControlVehiculo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreConductorControlVehiculo"));

		this.jButtonBusquedaPorNumeroPlacaControlVehiculo.addActionListener(new ButtonActionListener(this,"BusquedaPorNumeroPlacaControlVehiculo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionControlVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionControlVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarControlVehiculoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarControlVehiculo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosControlVehiculo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ControlVehiculo controlvehiculoAux:this.controlvehiculoLogic.getControlVehiculos()) {
					controlvehiculoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ControlVehiculo controlvehiculoAux:controlvehiculos) {
					controlvehiculoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosControlVehiculoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingControlVehiculo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ControlVehiculo controlvehiculoAux:this.controlvehiculoLogic.getControlVehiculos()) {
						controlvehiculoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ControlVehiculo controlvehiculoAux:controlvehiculos) {
						controlvehiculoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ControlVehiculo controlvehiculoAux:this.controlvehiculoLogic.getControlVehiculos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ControlVehiculo controlvehiculoAux:controlvehiculos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaControlVehiculo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosControlVehiculo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosControlVehiculo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosControlVehiculo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosControlVehiculoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingControlVehiculo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosControlVehiculo.getSelectedRows();
			
			ControlVehiculo controlvehiculoLocal=new ControlVehiculo();
			
			//this.seleccionarTodosControlVehiculo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					controlvehiculoLocal =(ControlVehiculo) this.controlvehiculoLogic.getControlVehiculos().toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					controlvehiculoLocal =(ControlVehiculo) this.controlvehiculos.toArray()[this.jTableDatosControlVehiculo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				controlvehiculoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ControlVehiculo controlvehiculoAux:this.controlvehiculoLogic.getControlVehiculos()) {
						controlvehiculoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ControlVehiculo controlvehiculoAux:controlvehiculos) {
						controlvehiculoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaControlVehiculo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosControlVehiculo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosControlVehiculo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosControlVehiculo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualControlVehiculoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarControlVehiculoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralControlVehiculoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingControlVehiculo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralControlVehiculo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ControlVehiculo controlvehiculoAux:this.controlvehiculoLogic.getControlVehiculos()) {
				
						if(sTipoSeleccionar.equals(ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR)) {
							existe=true;
							controlvehiculoAux.setnombre_conductor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA)) {
							existe=true;
							controlvehiculoAux.setnumero_placa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA)) {
							existe=true;
							controlvehiculoAux.setfecha_entrada(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA)) {
							existe=true;
							controlvehiculoAux.setfecha_salida(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ControlVehiculo controlvehiculoAux:controlvehiculos) {
					
						if(sTipoSeleccionar.equals(ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR)) {
							existe=true;
							controlvehiculoAux.setnombre_conductor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA)) {
							existe=true;
							controlvehiculoAux.setnumero_placa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA)) {
							existe=true;
							controlvehiculoAux.setfecha_entrada(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA)) {
							existe=true;
							controlvehiculoAux.setfecha_salida(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaControlVehiculo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesControlVehiculoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingControlVehiculo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioControlVehiculo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesControlVehiculo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormControlVehiculo.jComboBoxTiposAccionesFormularioControlVehiculo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteControlVehiculo) {				
					conSplash=true;//false;										
					
					//this.startProcessControlVehiculo(conSplash);
				
					this.generarReporteControlVehiculosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesControlVehiculo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormControlVehiculo.jComboBoxTiposAccionesFormularioControlVehiculo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoControlVehiculosSeleccionados();
				//this.jComboBoxTiposAccionesControlVehiculo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoControlVehiculosSeleccionados(false);
				//this.jComboBoxTiposAccionesControlVehiculo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoControlVehiculosSeleccionados(true);
				//this.jComboBoxTiposAccionesControlVehiculo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessControlVehiculo();
				
				this.exportarControlVehiculosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesControlVehiculo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormControlVehiculo.jComboBoxTiposAccionesFormularioControlVehiculo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionControlVehiculos();
				//this.importarControlVehiculos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesControlVehiculo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormControlVehiculo.jComboBoxTiposAccionesFormularioControlVehiculo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessControlVehiculo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelControlVehiculosSeleccionados();
				//this.jComboBoxTiposAccionesControlVehiculo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Control Vehiculo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessControlVehiculo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoControlVehiculo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyControlVehiculo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Control Vehiculo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesControlVehiculo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormControlVehiculo.jComboBoxTiposAccionesFormularioControlVehiculo.setSelectedIndex(0);					
				}	
			} 			
			else if(ControlVehiculoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteControlVehiculo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessControlVehiculo(conSplash);
					
						//this.actualizarParametrosGeneralControlVehiculo();
						
						this.generarReporteProcesoAccionControlVehiculosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesControlVehiculo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormControlVehiculo.jComboBoxTiposAccionesFormularioControlVehiculo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ControlVehiculoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Control VehiculoES SELECCIONADOS?", "MANTENIMIENTO DE Control Vehiculo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessControlVehiculo();
				
						this.actualizarParametrosGeneralControlVehiculo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.controlvehiculoReturnGeneral=controlvehiculoLogic.procesarAccionControlVehiculosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.controlvehiculoLogic.getControlVehiculos(),this.controlvehiculoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarControlVehiculoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesControlVehiculo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormControlVehiculo.jComboBoxTiposAccionesFormularioControlVehiculo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralControlVehiculo();
					
					ControlVehiculoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarControlVehiculoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesControlVehiculo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormControlVehiculo.jComboBoxTiposAccionesFormularioControlVehiculo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessControlVehiculo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesControlVehiculoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessControlVehiculo();
			
			if(this.jInternalFrameDetalleFormControlVehiculo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ControlVehiculo> controlvehiculosSeleccionados=new ArrayList<ControlVehiculo>();		
			ControlVehiculo controlvehiculo=new ControlVehiculo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingControlVehiculo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesControlVehiculo.getSelectedItem();
			
			
			
			
			controlvehiculosSeleccionados=this.getControlVehiculosSeleccionados(true);
			//this.sTipoAccion;
			
			if(controlvehiculosSeleccionados.size()==1) {
				for(ControlVehiculo controlvehiculoAux:controlvehiculosSeleccionados) {
					controlvehiculo=controlvehiculoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessControlVehiculo();
			
      		//this.finishProcessControlVehiculo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarControlVehiculoReturnGeneral() throws Exception {
		if(this.controlvehiculoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.controlvehiculoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.controlvehiculoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.controlvehiculoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.controlvehiculoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.controlvehiculoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingControlVehiculo(false);
		}
		
		if(this.controlvehiculoReturnGeneral.getConRetornoLista() || this.controlvehiculoReturnGeneral.getConRetornoObjeto()) {
			if(this.controlvehiculoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.controlvehiculoLogic.setControlVehiculos(this.controlvehiculoReturnGeneral.getControlVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.controlvehiculoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.controlvehiculoLogic.setControlVehiculo(this.controlvehiculoReturnGeneral.getControlVehiculo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingControlVehiculo(false);
		}
	}
	
	public void actualizarParametrosGeneralControlVehiculo() throws Exception {
		
		
	}
	
	public ArrayList<ControlVehiculo> getControlVehiculosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ControlVehiculo> controlvehiculosSeleccionados=new ArrayList<ControlVehiculo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioControlVehiculo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ControlVehiculo controlvehiculoAux:controlvehiculoLogic.getControlVehiculos()) {
					if(controlvehiculoAux.getIsSelected()) {
						controlvehiculosSeleccionados.add(controlvehiculoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ControlVehiculo controlvehiculoAux:this.controlvehiculos) {
					if(controlvehiculoAux.getIsSelected()) {
						controlvehiculosSeleccionados.add(controlvehiculoAux);				
					}
				}
			}
			
			if(controlvehiculosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						controlvehiculosSeleccionados.addAll(this.controlvehiculoLogic.getControlVehiculos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						controlvehiculosSeleccionados.addAll(this.controlvehiculos);				
					}
				}
			}
		} else {
			controlvehiculosSeleccionados.add(this.controlvehiculo);
		}
		
		return controlvehiculosSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteControlVehiculosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalControlVehiculosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoControlVehiculosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoControlVehiculosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoControlVehiculosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Control Vehiculo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesControlVehiculosSeleccionados() throws Exception {
		ArrayList<ControlVehiculo> controlvehiculosSeleccionados=new ArrayList<ControlVehiculo>();		
		
		controlvehiculosSeleccionados=this.getControlVehiculosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteControlVehiculos("Todos",controlvehiculosSeleccionados);
		
	}	
	
	public void generarReporteNormalControlVehiculosSeleccionados() throws Exception {
		ArrayList<ControlVehiculo> controlvehiculosSeleccionados=new ArrayList<ControlVehiculo>();		
		
		controlvehiculosSeleccionados=this.getControlVehiculosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteControlVehiculos("Todos",controlvehiculosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionControlVehiculosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ControlVehiculo> controlvehiculosSeleccionados=new ArrayList<ControlVehiculo>();
		
		controlvehiculosSeleccionados=this.getControlVehiculosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteControlVehiculos("Todos",controlvehiculosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoControlVehiculosSeleccionados() throws Exception {
		ArrayList<ControlVehiculo> controlvehiculosSeleccionados=new ArrayList<ControlVehiculo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoControlVehiculo();
		
		
		controlvehiculosSeleccionados=this.getControlVehiculosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoControlVehiculo();
		
		
		//this.generarReporteControlVehiculos("Todos",controlvehiculosSeleccionados ,controlvehiculoImplementable,controlvehiculoImplementableHome);
	}
	
	public void mostrarImportacionControlVehiculos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionControlVehiculo();
		
		this.abrirFrameImportacionControlVehiculo();		
		
			
		//this.generarReporteControlVehiculos("Todos",controlvehiculosSeleccionados ,controlvehiculoImplementable,controlvehiculoImplementableHome);
	}
	
	public void importarControlVehiculos() throws Exception {		
	
	}
	
	public void exportarControlVehiculosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelControlVehiculosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoControlVehiculosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlControlVehiculosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Control Vehiculo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoControlVehiculosSeleccionados() throws Exception {
		ArrayList<ControlVehiculo> controlvehiculosSeleccionados=new ArrayList<ControlVehiculo>();		
		
		controlvehiculosSeleccionados=this.getControlVehiculosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"controlvehiculo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarControlVehiculo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ControlVehiculo controlvehiculoAux:controlvehiculosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarControlVehiculo(controlvehiculoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//controlvehiculoAux.setsDetalleGeneralEntityReporte(controlvehiculoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Control Vehiculo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarControlVehiculo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ControlVehiculoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlVehiculoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlVehiculoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarControlVehiculo(ControlVehiculo controlvehiculo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=controlvehiculo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=controlvehiculo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlvehiculo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlvehiculo.getnombre_conductor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlvehiculo.getnumero_placa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlvehiculo.getfecha_entrada().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlvehiculo.getfecha_salida().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelControlVehiculosSeleccionados() throws Exception {
		ArrayList<ControlVehiculo> controlvehiculosSeleccionados=new ArrayList<ControlVehiculo>();		
		
		controlvehiculosSeleccionados=this.getControlVehiculosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"controlvehiculo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ControlVehiculos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelControlVehiculo(row);				
				iRow++;
			}				
			
			for(ControlVehiculo controlvehiculoAux:controlvehiculosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelControlVehiculo(controlvehiculoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Control Vehiculo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlControlVehiculosSeleccionados() throws Exception {
		ArrayList<ControlVehiculo> controlvehiculosSeleccionados=new ArrayList<ControlVehiculo>();		
		
		controlvehiculosSeleccionados=this.getControlVehiculosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"controlvehiculo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("controlvehiculos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("controlvehiculo");
			//elementRoot.appendChild(element);
		
			for(ControlVehiculo controlvehiculoAux:controlvehiculosSeleccionados) {
				element = document.createElement("controlvehiculo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlControlVehiculo(controlvehiculoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Control Vehiculo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelControlVehiculo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelControlVehiculo(ControlVehiculo controlvehiculo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(controlvehiculo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(controlvehiculo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(controlvehiculo.getnombre_conductor());
		cell = row.createCell(iColumn++);cell.setCellValue(controlvehiculo.getnumero_placa());
		cell = row.createCell(iColumn++);cell.setCellValue(controlvehiculo.getfecha_entrada());
		cell = row.createCell(iColumn++);cell.setCellValue(controlvehiculo.getfecha_salida());				
	}
	
	public void setFilaDatosExportarXmlControlVehiculo(ControlVehiculo controlvehiculo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ControlVehiculoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(controlvehiculo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ControlVehiculoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(controlvehiculo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ControlVehiculoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(controlvehiculo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre_conductor = document.createElement(ControlVehiculoConstantesFunciones.NOMBRECONDUCTOR);
		elementnombre_conductor.appendChild(document.createTextNode(controlvehiculo.getnombre_conductor().trim()));
		element.appendChild(elementnombre_conductor);

		Element elementnumero_placa = document.createElement(ControlVehiculoConstantesFunciones.NUMEROPLACA);
		elementnumero_placa.appendChild(document.createTextNode(controlvehiculo.getnumero_placa().trim()));
		element.appendChild(elementnumero_placa);

		Element elementfecha_entrada = document.createElement(ControlVehiculoConstantesFunciones.FECHAENTRADA);
		elementfecha_entrada.appendChild(document.createTextNode(controlvehiculo.getfecha_entrada().toString().trim()));
		element.appendChild(elementfecha_entrada);

		Element elementfecha_salida = document.createElement(ControlVehiculoConstantesFunciones.FECHASALIDA);
		elementfecha_salida.appendChild(document.createTextNode(controlvehiculo.getfecha_salida().toString().trim()));
		element.appendChild(elementfecha_salida);
	}
	
	public void generarReporteGroupGenericoControlVehiculosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ControlVehiculo> controlvehiculosSeleccionados=new ArrayList<ControlVehiculo>();
		
		controlvehiculosSeleccionados=this.getControlVehiculosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoControlVehiculo(controlvehiculosSeleccionados);
		
		this.generarReporteControlVehiculos("Todos",controlvehiculosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoControlVehiculo(ArrayList<ControlVehiculo> controlvehiculosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ControlVehiculo controlvehiculoAux:controlvehiculosSeleccionados) {
				controlvehiculoAux.setsDetalleGeneralEntityReporte(controlvehiculoAux.toString());
			
				if(sTipoSeleccionar.equals(ControlVehiculoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					controlvehiculoAux.setsDescripcionGeneralEntityReporte1(controlvehiculoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR)) {
					existe=true;
					controlvehiculoAux.setsDescripcionGeneralEntityReporte1(controlvehiculoAux.getnombre_conductor());
				}
				 else if(sTipoSeleccionar.equals(ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA)) {
					existe=true;
					controlvehiculoAux.setsDescripcionGeneralEntityReporte1(controlvehiculoAux.getnumero_placa());
				}
				 else if(sTipoSeleccionar.equals(ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA)) {
					existe=true;
					controlvehiculoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(controlvehiculoAux.getfecha_entrada()));
				}
				 else if(sTipoSeleccionar.equals(ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA)) {
					existe=true;
					controlvehiculoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(controlvehiculoAux.getfecha_salida()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlVehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesControlVehiculo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoControlVehiculo=true;
				this.isVisibilidadCeldaNuevoRelacionesControlVehiculo=true;
				this.isVisibilidadCeldaGuardarCambiosControlVehiculo=true;
			}
			
			this.isVisibilidadCeldaModificarControlVehiculo=false;
			this.isVisibilidadCeldaActualizarControlVehiculo=false;
			this.isVisibilidadCeldaEliminarControlVehiculo=false;
			this.isVisibilidadCeldaCancelarControlVehiculo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarControlVehiculo=true;
				} else {
					this.isVisibilidadCeldaGuardarControlVehiculo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoControlVehiculo=false;
			this.isVisibilidadCeldaNuevoRelacionesControlVehiculo=false;
			this.isVisibilidadCeldaGuardarCambiosControlVehiculo=false;
			this.isVisibilidadCeldaModificarControlVehiculo=false;
			this.isVisibilidadCeldaActualizarControlVehiculo=true;
			this.isVisibilidadCeldaEliminarControlVehiculo=false;
			this.isVisibilidadCeldaCancelarControlVehiculo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarControlVehiculo=true;
				} else {
					this.isVisibilidadCeldaGuardarControlVehiculo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoControlVehiculo=false;
			this.isVisibilidadCeldaNuevoRelacionesControlVehiculo=false;
			this.isVisibilidadCeldaGuardarCambiosControlVehiculo=false;
			this.isVisibilidadCeldaModificarControlVehiculo=false;
			this.isVisibilidadCeldaActualizarControlVehiculo=true;
			this.isVisibilidadCeldaEliminarControlVehiculo=true;
			this.isVisibilidadCeldaCancelarControlVehiculo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarControlVehiculo=true;
				} else {
					this.isVisibilidadCeldaGuardarControlVehiculo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoControlVehiculo=false;
			this.isVisibilidadCeldaNuevoRelacionesControlVehiculo=false;
			this.isVisibilidadCeldaGuardarCambiosControlVehiculo=false;
			this.isVisibilidadCeldaModificarControlVehiculo=false;
			this.isVisibilidadCeldaActualizarControlVehiculo=true;
			this.isVisibilidadCeldaEliminarControlVehiculo=false;
			this.isVisibilidadCeldaCancelarControlVehiculo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarControlVehiculo=false;
				} else {
					this.isVisibilidadCeldaGuardarControlVehiculo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoControlVehiculo=true;
			this.isVisibilidadCeldaNuevoRelacionesControlVehiculo=true;
			this.isVisibilidadCeldaGuardarCambiosControlVehiculo=true;
			this.isVisibilidadCeldaModificarControlVehiculo=false;
			this.isVisibilidadCeldaActualizarControlVehiculo=false;
			this.isVisibilidadCeldaEliminarControlVehiculo=false;
			this.isVisibilidadCeldaCancelarControlVehiculo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarControlVehiculo=true;
				} else {
					this.isVisibilidadCeldaGuardarControlVehiculo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoControlVehiculo=false;
			this.isVisibilidadCeldaNuevoRelacionesControlVehiculo=false;
			this.isVisibilidadCeldaGuardarCambiosControlVehiculo=false;
			this.isVisibilidadCeldaActualizarControlVehiculo=false;
			this.isVisibilidadCeldaEliminarControlVehiculo=false;
			this.isVisibilidadCeldaCancelarControlVehiculo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarControlVehiculo=false;
				} else {
					this.isVisibilidadCeldaGuardarControlVehiculo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoControlVehiculo=false;
			this.isVisibilidadCeldaNuevoRelacionesControlVehiculo=false;
			this.isVisibilidadCeldaGuardarCambiosControlVehiculo=false;
			this.isVisibilidadCeldaModificarControlVehiculo=true;
			this.isVisibilidadCeldaActualizarControlVehiculo=false;
			this.isVisibilidadCeldaEliminarControlVehiculo=false;
			this.isVisibilidadCeldaCancelarControlVehiculo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarControlVehiculo=false;
				} else {
					this.isVisibilidadCeldaGuardarControlVehiculo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ControlVehiculoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoControlVehiculo=true;
			this.isVisibilidadCeldaNuevoRelacionesControlVehiculo=true;
			this.isVisibilidadCeldaGuardarCambiosControlVehiculo=true;
		} else {
			this.actualizarEstadoPanelsControlVehiculo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarControlVehiculo=false;
			//this.isVisibilidadCeldaVerFormControlVehiculo=false;
			this.isVisibilidadCeldaDuplicarControlVehiculo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!controlvehiculoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesControlVehiculo=false;
		} else {
			this.isVisibilidadCeldaNuevoControlVehiculo=false;
			this.isVisibilidadCeldaGuardarCambiosControlVehiculo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(controlvehiculoSessionBean.getEsGuardarRelacionado()) {
			if(!controlvehiculoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesControlVehiculo=false;												
			}
			
			this.jButtonCerrarControlVehiculo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesControlVehiculo=false;
		}
		
		if(!this.permiteMantenimiento(this.controlvehiculo)) {
			this.isVisibilidadCeldaActualizarControlVehiculo=false;
			this.isVisibilidadCeldaEliminarControlVehiculo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesControlVehiculo() {
	}
	
	public void actualizarEstadoPanelsControlVehiculo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionControlVehiculo!=null) {
				this.jScrollPanelDatosEdicionControlVehiculo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasControlVehiculo!=null) {
				this.jTabbedPaneBusquedasControlVehiculo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosControlVehiculo!=null) {
				this.jScrollPanelDatosControlVehiculo.setVisible(true);
			}
			
			if(this.jPanelPaginacionControlVehiculo!=null) {
				this.jPanelPaginacionControlVehiculo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesControlVehiculo!=null) {
				this.jPanelParametrosReportesControlVehiculo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionControlVehiculo!=null) {
				this.jScrollPanelDatosEdicionControlVehiculo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasControlVehiculo!=null) {
				this.jTabbedPaneBusquedasControlVehiculo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosControlVehiculo!=null) {
				this.jScrollPanelDatosControlVehiculo.setVisible(false);
			}
			
			if(this.jPanelPaginacionControlVehiculo!=null) {
				this.jPanelPaginacionControlVehiculo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesControlVehiculo!=null) {
				this.jPanelParametrosReportesControlVehiculo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionControlVehiculo!=null) {
				this.jScrollPanelDatosEdicionControlVehiculo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasControlVehiculo!=null) {
				this.jTabbedPaneBusquedasControlVehiculo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosControlVehiculo!=null) {
				this.jScrollPanelDatosControlVehiculo.setVisible(false);
			}
			
			if(this.jPanelPaginacionControlVehiculo!=null) {
				this.jPanelPaginacionControlVehiculo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesControlVehiculo!=null) {
				this.jPanelParametrosReportesControlVehiculo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionControlVehiculo!=null) {
				this.jScrollPanelDatosEdicionControlVehiculo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasControlVehiculo!=null) {
				this.jTabbedPaneBusquedasControlVehiculo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosControlVehiculo!=null) {
				this.jScrollPanelDatosControlVehiculo.setVisible(false);
			}
			
			if(this.jPanelPaginacionControlVehiculo!=null) {
				this.jPanelPaginacionControlVehiculo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesControlVehiculo!=null) {
				this.jPanelParametrosReportesControlVehiculo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionControlVehiculo!=null) {
				this.jScrollPanelDatosEdicionControlVehiculo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasControlVehiculo!=null) {
				this.jTabbedPaneBusquedasControlVehiculo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosControlVehiculo!=null) {
				this.jScrollPanelDatosControlVehiculo.setVisible(true);
			}
			
			if(this.jPanelPaginacionControlVehiculo!=null) {
				this.jPanelPaginacionControlVehiculo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesControlVehiculo!=null) {
				this.jPanelParametrosReportesControlVehiculo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionControlVehiculo!=null) {
				this.jScrollPanelDatosEdicionControlVehiculo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasControlVehiculo!=null) {
				this.jTabbedPaneBusquedasControlVehiculo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosControlVehiculo!=null) {
				this.jScrollPanelDatosControlVehiculo.setVisible(true);
			}
			
			if(this.jPanelPaginacionControlVehiculo!=null) {
				this.jPanelPaginacionControlVehiculo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesControlVehiculo!=null) {
				this.jPanelParametrosReportesControlVehiculo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionControlVehiculo!=null) {
				this.jScrollPanelDatosEdicionControlVehiculo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasControlVehiculo!=null) {
				this.jTabbedPaneBusquedasControlVehiculo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosControlVehiculo!=null) {
				this.jScrollPanelDatosControlVehiculo.setVisible(true);
			}
			
			if(this.jPanelPaginacionControlVehiculo!=null) {
				this.jPanelPaginacionControlVehiculo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesControlVehiculo!=null) {
				this.jPanelParametrosReportesControlVehiculo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasControlVehiculo!=null) {
					this.jTabbedPaneBusquedasControlVehiculo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesControlVehiculo!=null) {
				this.jPanelParametrosReportesControlVehiculo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasControlVehiculo!=null) {
				this.jTabbedPaneBusquedasControlVehiculo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesControlVehiculo!=null) {
				this.jPanelParametrosReportesControlVehiculo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorFechaEntrada=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorFechaEntrada) {this.jTabbedPaneBusquedasControlVehiculo.remove(jPanelBusquedaPorFechaEntradaControlVehiculo);}

			this.isVisibilidadBusquedaPorFechaSalida=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorFechaSalida) {this.jTabbedPaneBusquedasControlVehiculo.remove(jPanelBusquedaPorFechaSalidaControlVehiculo);}

			this.isVisibilidadBusquedaPorNombreConductor=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombreConductor) {this.jTabbedPaneBusquedasControlVehiculo.remove(jPanelBusquedaPorNombreConductorControlVehiculo);}

			this.isVisibilidadBusquedaPorNumeroPlaca=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNumeroPlaca) {this.jTabbedPaneBusquedasControlVehiculo.remove(jPanelBusquedaPorNumeroPlacaControlVehiculo);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ControlVehiculoSessionBean controlvehiculoSessionBean=new ControlVehiculoSessionBean();
		
		if(this.controlvehiculoSessionBean==null) {
			this.controlvehiculoSessionBean=new ControlVehiculoSessionBean();
		}
		
		this.controlvehiculoSessionBean.setsUltimaBusquedaControlVehiculo(this.getsAccionBusqueda());
		this.controlvehiculoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.controlvehiculoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorFechaEntrada")) {
			controlvehiculoSessionBean.setfecha_entrada(this.getfecha_entradaBusquedaPorFechaEntrada());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorFechaSalida")) {
			controlvehiculoSessionBean.setfecha_salida(this.getfecha_salidaBusquedaPorFechaSalida());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombreConductor")) {
			controlvehiculoSessionBean.setnombre_conductor(this.getnombre_conductorBusquedaPorNombreConductor());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNumeroPlaca")) {
			controlvehiculoSessionBean.setnumero_placa(this.getnumero_placaBusquedaPorNumeroPlaca());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			controlvehiculoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ControlVehiculoSessionBean controlvehiculoSessionBean=new ControlVehiculoSessionBean();
		
		if(this.controlvehiculoSessionBean==null) {
			this.controlvehiculoSessionBean=new ControlVehiculoSessionBean();
		}
		
		if(this.controlvehiculoSessionBean.getsUltimaBusquedaControlVehiculo()!=null&&!this.controlvehiculoSessionBean.getsUltimaBusquedaControlVehiculo().equals("")) {
			this.setsAccionBusqueda(controlvehiculoSessionBean.getsUltimaBusquedaControlVehiculo());
			this.setiNumeroPaginacion(controlvehiculoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(controlvehiculoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorFechaEntrada")) {
				this.setfecha_entradaBusquedaPorFechaEntrada(controlvehiculoSessionBean.getfecha_entrada());
				controlvehiculoSessionBean.setfecha_entrada(new Date());
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorFechaSalida")) {
				this.setfecha_salidaBusquedaPorFechaSalida(controlvehiculoSessionBean.getfecha_salida());
				controlvehiculoSessionBean.setfecha_salida(new Date());
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombreConductor")) {
				this.setnombre_conductorBusquedaPorNombreConductor(controlvehiculoSessionBean.getnombre_conductor());
				controlvehiculoSessionBean.setnombre_conductor("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNumeroPlaca")) {
				this.setnumero_placaBusquedaPorNumeroPlaca(controlvehiculoSessionBean.getnumero_placa());
				controlvehiculoSessionBean.setnumero_placa("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(controlvehiculoSessionBean.getid_empresa());
				controlvehiculoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.controlvehiculoSessionBean.setsUltimaBusquedaControlVehiculo("");
		this.controlvehiculoSessionBean.setiNumeroPaginacion(ControlVehiculoConstantesFunciones.INUMEROPAGINACION);
		this.controlvehiculoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaControlVehiculo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioControlVehiculo() {
		this.updateBorderResaltarBusquedasFormularioControlVehiculo();
		this.updateVisibilidadBusquedasFormularioControlVehiculo();
		this.updateHabilitarBusquedasFormularioControlVehiculo();
	}
	
	public void updateBorderResaltarBusquedasFormularioControlVehiculo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasControlVehiculo.getComponents().length>0) {
	

		if(this.controlvehiculoConstantesFunciones.resaltarBusquedaPorFechaEntradaControlVehiculo!=null) {
			index= this.jTabbedPaneBusquedasControlVehiculo.indexOfComponent(this.jPanelBusquedaPorFechaEntradaControlVehiculo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasControlVehiculo.getComponent(index);
				jPanel.setBorder(this.controlvehiculoConstantesFunciones.resaltarBusquedaPorFechaEntradaControlVehiculo);
			}
		}

		if(this.controlvehiculoConstantesFunciones.resaltarBusquedaPorFechaSalidaControlVehiculo!=null) {
			index= this.jTabbedPaneBusquedasControlVehiculo.indexOfComponent(this.jPanelBusquedaPorFechaSalidaControlVehiculo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasControlVehiculo.getComponent(index);
				jPanel.setBorder(this.controlvehiculoConstantesFunciones.resaltarBusquedaPorFechaSalidaControlVehiculo);
			}
		}

		if(this.controlvehiculoConstantesFunciones.resaltarBusquedaPorNombreConductorControlVehiculo!=null) {
			index= this.jTabbedPaneBusquedasControlVehiculo.indexOfComponent(this.jPanelBusquedaPorNombreConductorControlVehiculo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasControlVehiculo.getComponent(index);
				jPanel.setBorder(this.controlvehiculoConstantesFunciones.resaltarBusquedaPorNombreConductorControlVehiculo);
			}
		}

		if(this.controlvehiculoConstantesFunciones.resaltarBusquedaPorNumeroPlacaControlVehiculo!=null) {
			index= this.jTabbedPaneBusquedasControlVehiculo.indexOfComponent(this.jPanelBusquedaPorNumeroPlacaControlVehiculo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasControlVehiculo.getComponent(index);
				jPanel.setBorder(this.controlvehiculoConstantesFunciones.resaltarBusquedaPorNumeroPlacaControlVehiculo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioControlVehiculo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasControlVehiculo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasControlVehiculo.indexOfComponent(this.jPanelBusquedaPorFechaEntradaControlVehiculo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasControlVehiculo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.controlvehiculoConstantesFunciones.mostrarBusquedaPorFechaEntradaControlVehiculo);
			if(!this.controlvehiculoConstantesFunciones.mostrarBusquedaPorFechaEntradaControlVehiculo && index>-1) {
				this.jTabbedPaneBusquedasControlVehiculo.remove(index);
			}

			index= this.jTabbedPaneBusquedasControlVehiculo.indexOfComponent(this.jPanelBusquedaPorFechaSalidaControlVehiculo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasControlVehiculo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.controlvehiculoConstantesFunciones.mostrarBusquedaPorFechaSalidaControlVehiculo);
			if(!this.controlvehiculoConstantesFunciones.mostrarBusquedaPorFechaSalidaControlVehiculo && index>-1) {
				this.jTabbedPaneBusquedasControlVehiculo.remove(index);
			}

			index= this.jTabbedPaneBusquedasControlVehiculo.indexOfComponent(this.jPanelBusquedaPorNombreConductorControlVehiculo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasControlVehiculo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.controlvehiculoConstantesFunciones.mostrarBusquedaPorNombreConductorControlVehiculo);
			if(!this.controlvehiculoConstantesFunciones.mostrarBusquedaPorNombreConductorControlVehiculo && index>-1) {
				this.jTabbedPaneBusquedasControlVehiculo.remove(index);
			}

			index= this.jTabbedPaneBusquedasControlVehiculo.indexOfComponent(this.jPanelBusquedaPorNumeroPlacaControlVehiculo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasControlVehiculo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.controlvehiculoConstantesFunciones.mostrarBusquedaPorNumeroPlacaControlVehiculo);
			if(!this.controlvehiculoConstantesFunciones.mostrarBusquedaPorNumeroPlacaControlVehiculo && index>-1) {
				this.jTabbedPaneBusquedasControlVehiculo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioControlVehiculo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasControlVehiculo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasControlVehiculo.indexOfComponent(this.jPanelBusquedaPorFechaEntradaControlVehiculo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasControlVehiculo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.controlvehiculoConstantesFunciones.activarBusquedaPorFechaEntradaControlVehiculo);
				this.jTabbedPaneBusquedasControlVehiculo.setEnabledAt(index,this.controlvehiculoConstantesFunciones.activarBusquedaPorFechaEntradaControlVehiculo);
			}

			index= this.jTabbedPaneBusquedasControlVehiculo.indexOfComponent(this.jPanelBusquedaPorFechaSalidaControlVehiculo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasControlVehiculo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.controlvehiculoConstantesFunciones.activarBusquedaPorFechaSalidaControlVehiculo);
				this.jTabbedPaneBusquedasControlVehiculo.setEnabledAt(index,this.controlvehiculoConstantesFunciones.activarBusquedaPorFechaSalidaControlVehiculo);
			}

			index= this.jTabbedPaneBusquedasControlVehiculo.indexOfComponent(this.jPanelBusquedaPorNombreConductorControlVehiculo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasControlVehiculo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.controlvehiculoConstantesFunciones.activarBusquedaPorNombreConductorControlVehiculo);
				this.jTabbedPaneBusquedasControlVehiculo.setEnabledAt(index,this.controlvehiculoConstantesFunciones.activarBusquedaPorNombreConductorControlVehiculo);
			}

			index= this.jTabbedPaneBusquedasControlVehiculo.indexOfComponent(this.jPanelBusquedaPorNumeroPlacaControlVehiculo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasControlVehiculo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.controlvehiculoConstantesFunciones.activarBusquedaPorNumeroPlacaControlVehiculo);
				this.jTabbedPaneBusquedasControlVehiculo.setEnabledAt(index,this.controlvehiculoConstantesFunciones.activarBusquedaPorNumeroPlacaControlVehiculo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaControlVehiculo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorFechaEntrada")) {
			index= this.jTabbedPaneBusquedasControlVehiculo.indexOfComponent(this.jPanelBusquedaPorFechaEntradaControlVehiculo);

			this.jTabbedPaneBusquedasControlVehiculo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasControlVehiculo.getComponent(index);

			this.controlvehiculoConstantesFunciones.setResaltarBusquedaPorFechaEntradaControlVehiculo(resaltar);

			jPanel.setBorder(this.controlvehiculoConstantesFunciones.resaltarBusquedaPorFechaEntradaControlVehiculo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorFechaSalida")) {
			index= this.jTabbedPaneBusquedasControlVehiculo.indexOfComponent(this.jPanelBusquedaPorFechaSalidaControlVehiculo);

			this.jTabbedPaneBusquedasControlVehiculo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasControlVehiculo.getComponent(index);

			this.controlvehiculoConstantesFunciones.setResaltarBusquedaPorFechaSalidaControlVehiculo(resaltar);

			jPanel.setBorder(this.controlvehiculoConstantesFunciones.resaltarBusquedaPorFechaSalidaControlVehiculo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombreConductor")) {
			index= this.jTabbedPaneBusquedasControlVehiculo.indexOfComponent(this.jPanelBusquedaPorNombreConductorControlVehiculo);

			this.jTabbedPaneBusquedasControlVehiculo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasControlVehiculo.getComponent(index);

			this.controlvehiculoConstantesFunciones.setResaltarBusquedaPorNombreConductorControlVehiculo(resaltar);

			jPanel.setBorder(this.controlvehiculoConstantesFunciones.resaltarBusquedaPorNombreConductorControlVehiculo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNumeroPlaca")) {
			index= this.jTabbedPaneBusquedasControlVehiculo.indexOfComponent(this.jPanelBusquedaPorNumeroPlacaControlVehiculo);

			this.jTabbedPaneBusquedasControlVehiculo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasControlVehiculo.getComponent(index);

			this.controlvehiculoConstantesFunciones.setResaltarBusquedaPorNumeroPlacaControlVehiculo(resaltar);

			jPanel.setBorder(this.controlvehiculoConstantesFunciones.resaltarBusquedaPorNumeroPlacaControlVehiculo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarControlVehiculo.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioControlVehiculo() throws Exception {

		if(this.jInternalFrameDetalleFormControlVehiculo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioControlVehiculo();
		this.updateVisibilidadResaltarControlesFormularioControlVehiculo();
		this.updateHabilitarResaltarControlesFormularioControlVehiculo();
		
	}
	
	public void updateBorderResaltarControlesFormularioControlVehiculo() throws Exception {
		if(this.jInternalFrameDetalleFormControlVehiculo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.controlvehiculoConstantesFunciones.resaltaridControlVehiculo!=null && this.jInternalFrameDetalleFormControlVehiculo!=null) {this.jInternalFrameDetalleFormControlVehiculo.jLabelidControlVehiculo.setBorder(this.controlvehiculoConstantesFunciones.resaltaridControlVehiculo);}
		if(this.controlvehiculoConstantesFunciones.resaltarid_empresaControlVehiculo!=null && this.jInternalFrameDetalleFormControlVehiculo!=null) {this.jInternalFrameDetalleFormControlVehiculo.jComboBoxid_empresaControlVehiculo.setBorder(this.controlvehiculoConstantesFunciones.resaltarid_empresaControlVehiculo);}
		if(this.controlvehiculoConstantesFunciones.resaltarnombre_conductorControlVehiculo!=null && this.jInternalFrameDetalleFormControlVehiculo!=null) {this.jInternalFrameDetalleFormControlVehiculo.jTextAreanombre_conductorControlVehiculo.setBorder(this.controlvehiculoConstantesFunciones.resaltarnombre_conductorControlVehiculo);}
		if(this.controlvehiculoConstantesFunciones.resaltarnumero_placaControlVehiculo!=null && this.jInternalFrameDetalleFormControlVehiculo!=null) {this.jInternalFrameDetalleFormControlVehiculo.jTextAreanumero_placaControlVehiculo.setBorder(this.controlvehiculoConstantesFunciones.resaltarnumero_placaControlVehiculo);}
		if(this.controlvehiculoConstantesFunciones.resaltarfecha_entradaControlVehiculo!=null && this.jInternalFrameDetalleFormControlVehiculo!=null) {this.jInternalFrameDetalleFormControlVehiculo.jDateChooserfecha_entradaControlVehiculo.setBorder(this.controlvehiculoConstantesFunciones.resaltarfecha_entradaControlVehiculo);}
		if(this.controlvehiculoConstantesFunciones.resaltarfecha_salidaControlVehiculo!=null && this.jInternalFrameDetalleFormControlVehiculo!=null) {this.jInternalFrameDetalleFormControlVehiculo.jDateChooserfecha_salidaControlVehiculo.setBorder(this.controlvehiculoConstantesFunciones.resaltarfecha_salidaControlVehiculo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioControlVehiculo() throws Exception {		
		if(this.jInternalFrameDetalleFormControlVehiculo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
	
		//this.jInternalFrameDetalleFormControlVehiculo.jLabelidControlVehiculo.setVisible(this.controlvehiculoConstantesFunciones.mostraridControlVehiculo);
		this.jInternalFrameDetalleFormControlVehiculo.jPanelidControlVehiculo.setVisible(this.controlvehiculoConstantesFunciones.mostraridControlVehiculo);
		//this.jInternalFrameDetalleFormControlVehiculo.jComboBoxid_empresaControlVehiculo.setVisible(this.controlvehiculoConstantesFunciones.mostrarid_empresaControlVehiculo);
		this.jInternalFrameDetalleFormControlVehiculo.jPanelid_empresaControlVehiculo.setVisible(this.controlvehiculoConstantesFunciones.mostrarid_empresaControlVehiculo);
		//this.jInternalFrameDetalleFormControlVehiculo.jTextAreanombre_conductorControlVehiculo.setVisible(this.controlvehiculoConstantesFunciones.mostrarnombre_conductorControlVehiculo);
		this.jInternalFrameDetalleFormControlVehiculo.jPanelnombre_conductorControlVehiculo.setVisible(this.controlvehiculoConstantesFunciones.mostrarnombre_conductorControlVehiculo);
		//this.jInternalFrameDetalleFormControlVehiculo.jTextAreanumero_placaControlVehiculo.setVisible(this.controlvehiculoConstantesFunciones.mostrarnumero_placaControlVehiculo);
		this.jInternalFrameDetalleFormControlVehiculo.jPanelnumero_placaControlVehiculo.setVisible(this.controlvehiculoConstantesFunciones.mostrarnumero_placaControlVehiculo);
		//this.jInternalFrameDetalleFormControlVehiculo.jDateChooserfecha_entradaControlVehiculo.setVisible(this.controlvehiculoConstantesFunciones.mostrarfecha_entradaControlVehiculo);
		this.jInternalFrameDetalleFormControlVehiculo.jPanelfecha_entradaControlVehiculo.setVisible(this.controlvehiculoConstantesFunciones.mostrarfecha_entradaControlVehiculo);
		//this.jInternalFrameDetalleFormControlVehiculo.jDateChooserfecha_salidaControlVehiculo.setVisible(this.controlvehiculoConstantesFunciones.mostrarfecha_salidaControlVehiculo);
		this.jInternalFrameDetalleFormControlVehiculo.jPanelfecha_salidaControlVehiculo.setVisible(this.controlvehiculoConstantesFunciones.mostrarfecha_salidaControlVehiculo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioControlVehiculo() throws Exception {
		if(this.jInternalFrameDetalleFormControlVehiculo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormControlVehiculo!=null) {
	
		this.jInternalFrameDetalleFormControlVehiculo.jLabelidControlVehiculo.setEnabled(this.controlvehiculoConstantesFunciones.activaridControlVehiculo);
		this.jInternalFrameDetalleFormControlVehiculo.jComboBoxid_empresaControlVehiculo.setEnabled(this.controlvehiculoConstantesFunciones.activarid_empresaControlVehiculo);
		this.jInternalFrameDetalleFormControlVehiculo.jTextAreanombre_conductorControlVehiculo.setEnabled(this.controlvehiculoConstantesFunciones.activarnombre_conductorControlVehiculo);
		this.jInternalFrameDetalleFormControlVehiculo.jTextAreanumero_placaControlVehiculo.setEnabled(this.controlvehiculoConstantesFunciones.activarnumero_placaControlVehiculo);
		this.jInternalFrameDetalleFormControlVehiculo.jDateChooserfecha_entradaControlVehiculo.setEnabled(this.controlvehiculoConstantesFunciones.activarfecha_entradaControlVehiculo);
		this.jInternalFrameDetalleFormControlVehiculo.jDateChooserfecha_salidaControlVehiculo.setEnabled(this.controlvehiculoConstantesFunciones.activarfecha_salidaControlVehiculo);
		}
	}
	
		
}