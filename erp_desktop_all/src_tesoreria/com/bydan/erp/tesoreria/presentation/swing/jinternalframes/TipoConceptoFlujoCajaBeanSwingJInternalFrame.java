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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




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

import com.bydan.erp.tesoreria.util.TipoConceptoFlujoCajaConstantesFunciones;
import com.bydan.erp.tesoreria.util.TipoConceptoFlujoCajaParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.TipoConceptoFlujoCajaParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.TipoConceptoFlujoCajaBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
public class TipoConceptoFlujoCajaBeanSwingJInternalFrame extends TipoConceptoFlujoCajaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoConceptoFlujoCajaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoConceptoFlujoCaja> tipoconceptoflujocajaValidator = new ClassValidator<TipoConceptoFlujoCaja>(TipoConceptoFlujoCaja.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoConceptoFlujoCaja tipoconceptoflujocaja;	
	public TipoConceptoFlujoCaja tipoconceptoflujocajaAux;
	public TipoConceptoFlujoCaja tipoconceptoflujocajaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoConceptoFlujoCaja tipoconceptoflujocajaTotales;
	public Long idTipoConceptoFlujoCajaActual;
	public Long iIdNuevoTipoConceptoFlujoCaja=0L;
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
	
	public Boolean isPermisoTodoTipoConceptoFlujoCaja;
	public Boolean isPermisoNuevoTipoConceptoFlujoCaja;
	public Boolean isPermisoActualizarTipoConceptoFlujoCaja;
	public Boolean isPermisoActualizarOriginalTipoConceptoFlujoCaja;
	public Boolean isPermisoEliminarTipoConceptoFlujoCaja;
	public Boolean isPermisoGuardarCambiosTipoConceptoFlujoCaja;
	public Boolean isPermisoConsultaTipoConceptoFlujoCaja;
	public Boolean isPermisoBusquedaTipoConceptoFlujoCaja;
	public Boolean isPermisoReporteTipoConceptoFlujoCaja;
	public Boolean isPermisoPaginacionMedioTipoConceptoFlujoCaja;
	public Boolean isPermisoPaginacionAltoTipoConceptoFlujoCaja;
	public Boolean isPermisoPaginacionTodoTipoConceptoFlujoCaja;
	public Boolean isPermisoCopiarTipoConceptoFlujoCaja;
	public Boolean isPermisoVerFormTipoConceptoFlujoCaja;
	public Boolean isPermisoDuplicarTipoConceptoFlujoCaja;
	public Boolean isPermisoOrdenTipoConceptoFlujoCaja;
	
	
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
	
	public TipoConceptoFlujoCajaParameterReturnGeneral tipoconceptoflujocajaReturnGeneral;
	public TipoConceptoFlujoCajaParameterReturnGeneral tipoconceptoflujocajaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoConceptoFlujoCaja=false;
	public Boolean esParaAccionDesdeFormularioTipoConceptoFlujoCaja=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoConceptoFlujoCajaLogic tipoconceptoflujocajaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoConceptoFlujoCaja tipoconceptoflujocajaBean;
	public TipoConceptoFlujoCajaConstantesFunciones tipoconceptoflujocajaConstantesFunciones;
	//public TipoConceptoFlujoCajaParameterReturnGeneral tipoconceptoflujocajaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoConceptoFlujoCaja> tipoconceptoflujocajas;	
	//public List<TipoConceptoFlujoCaja> tipoconceptoflujocajasEliminados;
	//public List<TipoConceptoFlujoCaja> tipoconceptoflujocajasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoConceptoFlujoCaja=false;
	public Boolean isVisibilidadCeldaDuplicarTipoConceptoFlujoCaja=true;
	public Boolean isVisibilidadCeldaCopiarTipoConceptoFlujoCaja=true;
	public Boolean isVisibilidadCeldaVerFormTipoConceptoFlujoCaja=true;
	public Boolean isVisibilidadCeldaOrdenTipoConceptoFlujoCaja=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja=false;
	public Boolean isVisibilidadCeldaModificarTipoConceptoFlujoCaja=false;
	public Boolean isVisibilidadCeldaActualizarTipoConceptoFlujoCaja=false;
	public Boolean isVisibilidadCeldaEliminarTipoConceptoFlujoCaja=false;
	public Boolean isVisibilidadCeldaCancelarTipoConceptoFlujoCaja=false;
	public Boolean isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorId=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoConceptoFlujoCaja() {
		return this.iIdNuevoTipoConceptoFlujoCaja;
	}

	public void setiIdNuevoTipoConceptoFlujoCaja(Long iIdNuevoTipoConceptoFlujoCaja) {
		this.iIdNuevoTipoConceptoFlujoCaja = iIdNuevoTipoConceptoFlujoCaja;
	}
	
	public Long getidTipoConceptoFlujoCajaActual() {
		return this.idTipoConceptoFlujoCajaActual;
	}

	public void setidTipoConceptoFlujoCajaActual(Long idTipoConceptoFlujoCajaActual) {
		this.idTipoConceptoFlujoCajaActual = idTipoConceptoFlujoCajaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoConceptoFlujoCaja gettipoconceptoflujocaja() {
		return this.tipoconceptoflujocaja;
	}

	public void settipoconceptoflujocaja(TipoConceptoFlujoCaja tipoconceptoflujocaja) {
		this.tipoconceptoflujocaja = tipoconceptoflujocaja;
	}
	
	public TipoConceptoFlujoCaja gettipoconceptoflujocajaAux() {
		return this.tipoconceptoflujocajaAux;
	}

	public void settipoconceptoflujocajaAux(TipoConceptoFlujoCaja tipoconceptoflujocajaAux) {
		this.tipoconceptoflujocajaAux = tipoconceptoflujocajaAux;
	}				
	
	public TipoConceptoFlujoCaja gettipoconceptoflujocajaAnterior() {
		return this.tipoconceptoflujocajaAnterior;
	}

	public void settipoconceptoflujocajaAnterior(TipoConceptoFlujoCaja tipoconceptoflujocajaAnterior) {
		this.tipoconceptoflujocajaAnterior = tipoconceptoflujocajaAnterior;
	}	
	
	public TipoConceptoFlujoCaja gettipoconceptoflujocajaTotales() {
		return this.tipoconceptoflujocajaTotales;
	}

	public void settipoconceptoflujocajaTotales(TipoConceptoFlujoCaja tipoconceptoflujocajaTotales) {
		this.tipoconceptoflujocajaTotales = tipoconceptoflujocajaTotales;
	}	
	
	public TipoConceptoFlujoCaja gettipoconceptoflujocajaBean() {
		return this.tipoconceptoflujocajaBean;
	}

	public void settipoconceptoflujocajaBean(TipoConceptoFlujoCaja tipoconceptoflujocajaBean) {
		this.tipoconceptoflujocajaBean = tipoconceptoflujocajaBean;
	}	
	
	public TipoConceptoFlujoCajaParameterReturnGeneral gettipoconceptoflujocajaReturnGeneral() {
		return this.tipoconceptoflujocajaReturnGeneral;
	}

	public void settipoconceptoflujocajaReturnGeneral(TipoConceptoFlujoCajaParameterReturnGeneral tipoconceptoflujocajaReturnGeneral) {
		this.tipoconceptoflujocajaReturnGeneral = tipoconceptoflujocajaReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public Long idBusquedaPorId=0L;

	public Long getidBusquedaPorId() {
		return this.idBusquedaPorId;
	}

	public void setidBusquedaPorId(Long idBusquedaPorId) {
		this.idBusquedaPorId = idBusquedaPorId;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
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
	
	
	public TipoConceptoFlujoCajaLogic getTipoConceptoFlujoCajaLogic()	{		
		return tipoconceptoflujocajaLogic;
	}

	public void setTipoConceptoFlujoCajaLogic(TipoConceptoFlujoCajaLogic tipoconceptoflujocajaLogic) {
		this.tipoconceptoflujocajaLogic = tipoconceptoflujocajaLogic;
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
	
	public Boolean getIsEsNuevoTipoConceptoFlujoCaja() {
		return isEsNuevoTipoConceptoFlujoCaja;
	}

	public void setIsEsNuevoTipoConceptoFlujoCaja(Boolean isEsNuevoTipoConceptoFlujoCaja) {
		this.isEsNuevoTipoConceptoFlujoCaja = isEsNuevoTipoConceptoFlujoCaja;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoConceptoFlujoCaja() {
		return esParaAccionDesdeFormularioTipoConceptoFlujoCaja;
	}
	
	public void setEsParaAccionDesdeFormularioTipoConceptoFlujoCaja(Boolean esParaAccionDesdeFormularioTipoConceptoFlujoCaja) {
		this.esParaAccionDesdeFormularioTipoConceptoFlujoCaja = esParaAccionDesdeFormularioTipoConceptoFlujoCaja;
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

			if(this.tipoconceptoflujocajaSessionBean==null) {
				this.tipoconceptoflujocajaSessionBean=new TipoConceptoFlujoCajaSessionBean();
			}

			if(!this.tipoconceptoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoconceptoflujocajaSessionBean.getlidEmpresaActual());
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

					if(this.tipoconceptoflujocaja!=null) {
						this.tipoconceptoflujocaja.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
						this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxid_empresaTipoConceptoFlujoCaja.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoConceptoFlujoCaja.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxid_empresaTipoConceptoFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxid_empresaTipoConceptoFlujoCaja.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoConceptoFlujoCajaGenerico)throws Exception
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
				jComboBoxid_empresaTipoConceptoFlujoCajaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoConceptoFlujoCajaGenerico!=null && jComboBoxid_empresaTipoConceptoFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoConceptoFlujoCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoConceptoFlujoCaja tipoconceptoflujocaja,JComboBox jComboBoxid_empresaTipoConceptoFlujoCajaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoConceptoFlujoCajaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxid_empresaTipoConceptoFlujoCaja.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoConceptoFlujoCajaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoconceptoflujocaja.setid_empresa(empresaAux.getId());
				tipoconceptoflujocaja.setempresa_descripcion(TipoConceptoFlujoCajaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoconceptoflujocaja.setEmpresa(empresaAux);			}
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

					if(!TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxid_empresaTipoConceptoFlujoCaja.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxid_empresaTipoConceptoFlujoCaja.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { 
					}

					if(!TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
							this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxid_empresaTipoConceptoFlujoCaja.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
							this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxid_empresaTipoConceptoFlujoCaja.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoConceptoFlujoCaja() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoConceptoFlujoCajaConstantesFunciones.refrescarForeignKeysDescripcionesTipoConceptoFlujoCaja(this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoConceptoFlujoCajaConstantesFunciones.refrescarForeignKeysDescripcionesTipoConceptoFlujoCaja(this.tipoconceptoflujocajas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoconceptoflujocajaLogic.setTipoConceptoFlujoCajas(this.tipoconceptoflujocajas);
			tipoconceptoflujocajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoConceptoFlujoCajaParameterReturnGeneral getTipoConceptoFlujoCajaParameterGeneral() {
		return this.tipoconceptoflujocajaParameterGeneral;
	}
	
	public void setTipoConceptoFlujoCajaParameterGeneral(TipoConceptoFlujoCajaParameterReturnGeneral tipoconceptoflujocajaParameterGeneral) {
		this.tipoconceptoflujocajaParameterGeneral = tipoconceptoflujocajaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoConceptoFlujoCaja() {
		return isPermisoTodoTipoConceptoFlujoCaja;
	}

	public void setIsPermisoTodoTipoConceptoFlujoCaja(Boolean isPermisoTodoTipoConceptoFlujoCaja) {
		this.isPermisoTodoTipoConceptoFlujoCaja = isPermisoTodoTipoConceptoFlujoCaja;
	}

	public Boolean getIsPermisoNuevoTipoConceptoFlujoCaja() {
		return isPermisoNuevoTipoConceptoFlujoCaja;
	}

	public void setIsPermisoNuevoTipoConceptoFlujoCaja(Boolean isPermisoNuevoTipoConceptoFlujoCaja) {
		this.isPermisoNuevoTipoConceptoFlujoCaja = isPermisoNuevoTipoConceptoFlujoCaja;
	}

	public Boolean getIsPermisoActualizarTipoConceptoFlujoCaja() {
		return isPermisoActualizarTipoConceptoFlujoCaja;
	}

	public void setIsPermisoActualizarTipoConceptoFlujoCaja(Boolean isPermisoActualizarTipoConceptoFlujoCaja) {
		this.isPermisoActualizarTipoConceptoFlujoCaja = isPermisoActualizarTipoConceptoFlujoCaja;
	}

	public Boolean getIsPermisoEliminarTipoConceptoFlujoCaja() {
		return isPermisoEliminarTipoConceptoFlujoCaja;
	}

	public void setIsPermisoEliminarTipoConceptoFlujoCaja(Boolean isPermisoEliminarTipoConceptoFlujoCaja) {
		this.isPermisoEliminarTipoConceptoFlujoCaja = isPermisoEliminarTipoConceptoFlujoCaja;
	}

	public Boolean getIsPermisoGuardarCambiosTipoConceptoFlujoCaja() {
		return isPermisoGuardarCambiosTipoConceptoFlujoCaja;
	}

	public void setIsPermisoGuardarCambiosTipoConceptoFlujoCaja(Boolean isPermisoGuardarCambiosTipoConceptoFlujoCaja) {
		this.isPermisoGuardarCambiosTipoConceptoFlujoCaja = isPermisoGuardarCambiosTipoConceptoFlujoCaja;
	}
	
	public Boolean getIsPermisoConsultaTipoConceptoFlujoCaja() {
		return isPermisoConsultaTipoConceptoFlujoCaja;
	}

	public void setIsPermisoConsultaTipoConceptoFlujoCaja(Boolean isPermisoConsultaTipoConceptoFlujoCaja) {
		this.isPermisoConsultaTipoConceptoFlujoCaja = isPermisoConsultaTipoConceptoFlujoCaja;
	}

	public Boolean getIsPermisoBusquedaTipoConceptoFlujoCaja() {
		return isPermisoBusquedaTipoConceptoFlujoCaja;
	}

	public void setIsPermisoBusquedaTipoConceptoFlujoCaja(Boolean isPermisoBusquedaTipoConceptoFlujoCaja) {
		this.isPermisoBusquedaTipoConceptoFlujoCaja = isPermisoBusquedaTipoConceptoFlujoCaja;
	}

	public Boolean getIsPermisoReporteTipoConceptoFlujoCaja() {
		return isPermisoReporteTipoConceptoFlujoCaja;
	}

	public void setIsPermisoReporteTipoConceptoFlujoCaja(Boolean isPermisoReporteTipoConceptoFlujoCaja) {
		this.isPermisoReporteTipoConceptoFlujoCaja = isPermisoReporteTipoConceptoFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoConceptoFlujoCaja() {
		return isPermisoPaginacionMedioTipoConceptoFlujoCaja;
	}

	public void setIsPermisoPaginacionMedioTipoConceptoFlujoCaja(Boolean isPermisoPaginacionMedioTipoConceptoFlujoCaja) {
		this.isPermisoPaginacionMedioTipoConceptoFlujoCaja = isPermisoPaginacionMedioTipoConceptoFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoConceptoFlujoCaja() {
		return isPermisoPaginacionTodoTipoConceptoFlujoCaja;
	}

	public void setIsPermisoPaginacionTodoTipoConceptoFlujoCaja(Boolean isPermisoPaginacionTodoTipoConceptoFlujoCaja) {
		this.isPermisoPaginacionTodoTipoConceptoFlujoCaja = isPermisoPaginacionTodoTipoConceptoFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoConceptoFlujoCaja() {
		return isPermisoPaginacionAltoTipoConceptoFlujoCaja;
	}

	public void setIsPermisoPaginacionAltoTipoConceptoFlujoCaja(Boolean isPermisoPaginacionAltoTipoConceptoFlujoCaja) {
		this.isPermisoPaginacionAltoTipoConceptoFlujoCaja = isPermisoPaginacionAltoTipoConceptoFlujoCaja;
	}
	
	public Boolean getIsPermisoCopiarTipoConceptoFlujoCaja() {
		return isPermisoCopiarTipoConceptoFlujoCaja;
	}

	public void setIsPermisoCopiarTipoConceptoFlujoCaja(Boolean isPermisoCopiarTipoConceptoFlujoCaja) {
		this.isPermisoCopiarTipoConceptoFlujoCaja = isPermisoCopiarTipoConceptoFlujoCaja;
	}
	
	public Boolean getIsPermisoVerFormTipoConceptoFlujoCaja() {
		return isPermisoVerFormTipoConceptoFlujoCaja;
	}

	public void setIsPermisoVerFormTipoConceptoFlujoCaja(Boolean isPermisoVerFormTipoConceptoFlujoCaja) {
		this.isPermisoVerFormTipoConceptoFlujoCaja = isPermisoVerFormTipoConceptoFlujoCaja;
	}
	
	public Boolean getIsPermisoDuplicarTipoConceptoFlujoCaja() {
		return isPermisoDuplicarTipoConceptoFlujoCaja;
	}

	public void setIsPermisoDuplicarTipoConceptoFlujoCaja(Boolean isPermisoDuplicarTipoConceptoFlujoCaja) {
		this.isPermisoDuplicarTipoConceptoFlujoCaja = isPermisoDuplicarTipoConceptoFlujoCaja;
	}
	
	public Boolean getIsPermisoOrdenTipoConceptoFlujoCaja() {
		return isPermisoOrdenTipoConceptoFlujoCaja;
	}

	public void setIsPermisoOrdenTipoConceptoFlujoCaja(Boolean isPermisoOrdenTipoConceptoFlujoCaja) {
		this.isPermisoOrdenTipoConceptoFlujoCaja = isPermisoOrdenTipoConceptoFlujoCaja;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoConceptoFlujoCaja() {
		return isVisibilidadCeldaNuevoTipoConceptoFlujoCaja;
	}

	public void setIsVisibilidadCeldaNuevoTipoConceptoFlujoCaja(Boolean isVisibilidadCeldaNuevoTipoConceptoFlujoCaja) {
		this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja = isVisibilidadCeldaNuevoTipoConceptoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoConceptoFlujoCaja() {
		return isVisibilidadCeldaDuplicarTipoConceptoFlujoCaja;
	}

	public void setIsVisibilidadCeldaDuplicarTipoConceptoFlujoCaja(Boolean isVisibilidadCeldaDuplicarTipoConceptoFlujoCaja) {
		this.isVisibilidadCeldaDuplicarTipoConceptoFlujoCaja = isVisibilidadCeldaDuplicarTipoConceptoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoConceptoFlujoCaja() {
		return isVisibilidadCeldaCopiarTipoConceptoFlujoCaja;
	}

	public void setIsVisibilidadCeldaCopiarTipoConceptoFlujoCaja(Boolean isVisibilidadCeldaCopiarTipoConceptoFlujoCaja) {
		this.isVisibilidadCeldaCopiarTipoConceptoFlujoCaja = isVisibilidadCeldaCopiarTipoConceptoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoConceptoFlujoCaja() {
		return isVisibilidadCeldaVerFormTipoConceptoFlujoCaja;
	}

	public void setIsVisibilidadCeldaVerFormTipoConceptoFlujoCaja(Boolean isVisibilidadCeldaVerFormTipoConceptoFlujoCaja) {
		this.isVisibilidadCeldaVerFormTipoConceptoFlujoCaja = isVisibilidadCeldaVerFormTipoConceptoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoConceptoFlujoCaja() {
		return isVisibilidadCeldaOrdenTipoConceptoFlujoCaja;
	}

	public void setIsVisibilidadCeldaOrdenTipoConceptoFlujoCaja(Boolean isVisibilidadCeldaOrdenTipoConceptoFlujoCaja) {
		this.isVisibilidadCeldaOrdenTipoConceptoFlujoCaja = isVisibilidadCeldaOrdenTipoConceptoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja() {
		return isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja(Boolean isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja) {
		this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja = isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoConceptoFlujoCaja() {
		return isVisibilidadCeldaModificarTipoConceptoFlujoCaja;
	}

	public void setIsVisibilidadCeldaModificarTipoConceptoFlujoCaja(Boolean isVisibilidadCeldaModificarTipoConceptoFlujoCaja) {
		this.isVisibilidadCeldaModificarTipoConceptoFlujoCaja = isVisibilidadCeldaModificarTipoConceptoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoConceptoFlujoCaja() {
		return isVisibilidadCeldaActualizarTipoConceptoFlujoCaja;
	}

	public void setIsVisibilidadCeldaActualizarTipoConceptoFlujoCaja(Boolean isVisibilidadCeldaActualizarTipoConceptoFlujoCaja) {
		this.isVisibilidadCeldaActualizarTipoConceptoFlujoCaja = isVisibilidadCeldaActualizarTipoConceptoFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoConceptoFlujoCaja() {
		return isVisibilidadCeldaEliminarTipoConceptoFlujoCaja;
	}

	public void setIsVisibilidadCeldaEliminarTipoConceptoFlujoCaja(Boolean isVisibilidadCeldaEliminarTipoConceptoFlujoCaja) {
		this.isVisibilidadCeldaEliminarTipoConceptoFlujoCaja = isVisibilidadCeldaEliminarTipoConceptoFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoConceptoFlujoCaja() {
		return isVisibilidadCeldaCancelarTipoConceptoFlujoCaja;
	}

	public void setIsVisibilidadCeldaCancelarTipoConceptoFlujoCaja(Boolean isVisibilidadCeldaCancelarTipoConceptoFlujoCaja) {
		this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja = isVisibilidadCeldaCancelarTipoConceptoFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoConceptoFlujoCaja() {
		return isVisibilidadCeldaGuardarTipoConceptoFlujoCaja;
	}

	public void setIsVisibilidadCeldaGuardarTipoConceptoFlujoCaja(Boolean isVisibilidadCeldaGuardarTipoConceptoFlujoCaja) {
		this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja = isVisibilidadCeldaGuardarTipoConceptoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja() {
		return isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja(Boolean isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja) {
		this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja = isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja;
	}
		
	public TipoConceptoFlujoCajaSessionBean gettipoconceptoflujocajaSessionBean() {
		return this.tipoconceptoflujocajaSessionBean;
	}
	
	public void settipoconceptoflujocajaSessionBean(TipoConceptoFlujoCajaSessionBean tipoconceptoflujocajaSessionBean) {
		this.tipoconceptoflujocajaSessionBean=tipoconceptoflujocajaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorId() {
		return this.isVisibilidadBusquedaPorId;
	}

	public void setisVisibilidadBusquedaPorId(Boolean isVisibilidadBusquedaPorId) {
		this.isVisibilidadBusquedaPorId=isVisibilidadBusquedaPorId;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocaja)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoconceptoflujocaja,null);
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
	
	public void bugActualizarReferenciaActual(TipoConceptoFlujoCaja tipoconceptoflujocaja,TipoConceptoFlujoCaja tipoconceptoflujocajaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoConceptoFlujoCaja(tipoconceptoflujocaja);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoconceptoflujocajaAux.setId(tipoconceptoflujocaja.getId());
		tipoconceptoflujocajaAux.setVersionRow(tipoconceptoflujocaja.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoConceptoFlujoCaja();
		
			int intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(this.tipoconceptoflujocaja,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoconceptoflujocajaValidator.getInvalidValues(this.tipoconceptoflujocaja);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoconceptoflujocajaLogic.setDatosCliente(datosCliente);
			tipoconceptoflujocajaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoconceptoflujocajaAux=new  TipoConceptoFlujoCaja();
				
				tipoconceptoflujocajaAux.setIsNew(true);
				tipoconceptoflujocajaAux.setIsChanged(true);
				
				tipoconceptoflujocajaAux.setTipoConceptoFlujoCajaOriginal(this.tipoconceptoflujocaja);
				
				tipoconceptoflujocajaAux.setId(this.tipoconceptoflujocaja.getId());	
				tipoconceptoflujocajaAux.setVersionRow(this.tipoconceptoflujocaja.getVersionRow());	
				tipoconceptoflujocajaAux.setid_empresa(this.tipoconceptoflujocaja.getid_empresa());	
				tipoconceptoflujocajaAux.setcodigo(this.tipoconceptoflujocaja.getcodigo());	
				tipoconceptoflujocajaAux.setnombre(this.tipoconceptoflujocaja.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoconceptoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoconceptoflujocajaAux,tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoconceptoflujocajaAux,tipoconceptoflujocajas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoconceptoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconceptoflujocajaLogic.saveTipoConceptoFlujoCajas();//WithConnection
						//tipoconceptoflujocajaLogic.getSetVersionRowTipoConceptoFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoconceptoflujocaja,tipoconceptoflujocajaAux);
					
					this.refrescarForeignKeysDescripcionesTipoConceptoFlujoCaja();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoconceptoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoconceptoflujocajaAux=new  TipoConceptoFlujoCaja();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado() && this.tipoconceptoflujocaja.getId()>=0)) {
						
					tipoconceptoflujocajaAux.setIsNew(false);
				}
				
				tipoconceptoflujocajaAux.setIsDeleted(false);
			
				tipoconceptoflujocajaAux.setId(this.tipoconceptoflujocaja.getId());	
				tipoconceptoflujocajaAux.setVersionRow(this.tipoconceptoflujocaja.getVersionRow());	
				tipoconceptoflujocajaAux.setid_empresa(this.tipoconceptoflujocaja.getid_empresa());	
				tipoconceptoflujocajaAux.setcodigo(this.tipoconceptoflujocaja.getcodigo());	
				tipoconceptoflujocajaAux.setnombre(this.tipoconceptoflujocaja.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoconceptoflujocajaAux,tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoconceptoflujocajaAux,tipoconceptoflujocajas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoconceptoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconceptoflujocajaLogic.saveTipoConceptoFlujoCajas();//WithConnection
						//tipoconceptoflujocajaLogic.getSetVersionRowTipoConceptoFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoconceptoflujocaja,tipoconceptoflujocajaAux);
					
					this.refrescarForeignKeysDescripcionesTipoConceptoFlujoCaja();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoconceptoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoconceptoflujocajaAux=new  TipoConceptoFlujoCaja();
				
				tipoconceptoflujocajaAux.setIsNew(false);
				tipoconceptoflujocajaAux.setIsChanged(false);
				
				tipoconceptoflujocajaAux.setIsDeleted(true);
				
				tipoconceptoflujocajaAux.setId(this.tipoconceptoflujocaja.getId());	
				tipoconceptoflujocajaAux.setVersionRow(this.tipoconceptoflujocaja.getVersionRow());	
				tipoconceptoflujocajaAux.setid_empresa(this.tipoconceptoflujocaja.getid_empresa());	
				tipoconceptoflujocajaAux.setcodigo(this.tipoconceptoflujocaja.getcodigo());	
				tipoconceptoflujocajaAux.setnombre(this.tipoconceptoflujocaja.getnombre());	
				
				if(this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoconceptoflujocajaAux.getId()>=0) {	
						this.tipoconceptoflujocajasEliminados.add(tipoconceptoflujocajaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoconceptoflujocajaAux,tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoconceptoflujocajaAux,tipoconceptoflujocajas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoconceptoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconceptoflujocajaLogic.saveTipoConceptoFlujoCajas();//WithConnection
						//tipoconceptoflujocajaLogic.getSetVersionRowTipoConceptoFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoconceptoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoconceptoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoconceptoflujocajaAux,tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoconceptoflujocajaAux,tipoconceptoflujocajas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().addAll(this.tipoconceptoflujocajasEliminados);
					
					tipoconceptoflujocajaLogic.saveTipoConceptoFlujoCajas();//WithConnection
					//tipoconceptoflujocajaLogic.getSetVersionRowTipoConceptoFlujoCajas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoConceptoFlujoCaja();
				
				this.tipoconceptoflujocajasEliminados= new ArrayList<TipoConceptoFlujoCaja>();		
			}
			
			if(this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Concepto Flujo Caja GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Concepto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoconceptoflujocaja=tipoconceptoflujocajaAux;
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
      		//this.finishProcessTipoConceptoFlujoCaja();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoConceptoFlujoCaja tipoconceptoflujocajaLocal) throws Exception {
		
		if(this.tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoConceptoFlujoCaja tipoconceptoflujocajaLocal) throws Exception {	
		if(this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoconceptoflujocajaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoConceptoFlujoCajaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoconceptoflujocajaValidator.getInvalidValues(this.tipoconceptoflujocaja);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoConceptoFlujoCaja tipoconceptoflujocaja,List<TipoConceptoFlujoCaja> tipoconceptoflujocajas) throws Exception {
		try	{		
			TipoConceptoFlujoCajaConstantesFunciones.actualizarLista(tipoconceptoflujocaja,tipoconceptoflujocajas,this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoConceptoFlujoCaja tipoconceptoflujocaja,List<TipoConceptoFlujoCaja> tipoconceptoflujocajas) throws Exception {
		try	{			
			TipoConceptoFlujoCajaConstantesFunciones.actualizarSelectedLista(tipoconceptoflujocaja,tipoconceptoflujocajas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoConceptoFlujoCaja> tipoconceptoflujocajasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoconceptoflujocajasLocal=this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoconceptoflujocajasLocal=this.tipoconceptoflujocajas;
			}
			//ARCHITECTURE
		
			for(TipoConceptoFlujoCaja tipoconceptoflujocajaLocal:tipoconceptoflujocajasLocal) {
				if(this.permiteMantenimiento(tipoconceptoflujocajaLocal) && tipoconceptoflujocajaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoConceptoFlujoCajaConstantesFunciones.getTipoConceptoFlujoCajaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoConceptoFlujoCajaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelid_empresaTipoConceptoFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoConceptoFlujoCajaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelcodigoTipoConceptoFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoConceptoFlujoCajaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelnombreTipoConceptoFlujoCaja,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelid_empresaTipoConceptoFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelcodigoTipoConceptoFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelnombreTipoConceptoFlujoCaja,"");
		
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
		this.iIdNuevoTipoConceptoFlujoCaja--;	
		
		
		this.tipoconceptoflujocajaAux=new TipoConceptoFlujoCaja();
		
		this.tipoconceptoflujocajaAux.setId(this.iIdNuevoTipoConceptoFlujoCaja);
		this.tipoconceptoflujocajaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().add(this.tipoconceptoflujocajaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoconceptoflujocajas.add(this.tipoconceptoflujocajaAux);
		}
		//ARCHITECTURE
		
		this.tipoconceptoflujocaja=this.tipoconceptoflujocajaAux;
		
		if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
		}
				
		//this.setDefaultControlesTipoConceptoFlujoCaja();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoConceptoFlujoCaja();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoConceptoFlujoCaja();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoConceptoFlujoCaja();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoConceptoFlujoCaja(this.tipoconceptoflujocajaBean,this.tipoconceptoflujocaja,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()) {
			classes=TipoConceptoFlujoCajaConstantesFunciones.getClassesRelationshipsOfTipoConceptoFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoconceptoflujocajaReturnGeneral=tipoconceptoflujocajaLogic.procesarEventosTipoConceptoFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas(),this.tipoconceptoflujocaja,this.tipoconceptoflujocajaParameterGeneral,this.isEsNuevoTipoConceptoFlujoCaja,classes);//this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCaja()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoConceptoFlujoCaja(this.tipoconceptoflujocajaReturnGeneral,this.tipoconceptoflujocajaBean,false);
		
		if(this.tipoconceptoflujocajaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoConceptoFlujoCaja(this.tipoconceptoflujocajaReturnGeneral.getTipoConceptoFlujoCaja());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoConceptoFlujoCaja(this.tipoconceptoflujocajaReturnGeneral.getTipoConceptoFlujoCaja());
		}
		
		if(this.tipoconceptoflujocajaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoConceptoFlujoCaja(this.tipoconceptoflujocajaReturnGeneral.getTipoConceptoFlujoCaja(),classes);//this.tipoconceptoflujocajaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(this.tipoconceptoflujocaja,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoConceptoFlujoCaja();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoConceptoFlujoCaja();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false);
						
			if(tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoConceptoFlujoCaja();
			}
			
			this.actualizarVisualTableDatosTipoConceptoFlujoCaja();
			
			this.jTableDatosTipoConceptoFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoTipoConceptoFlujoCaja(), this.getIndiceNuevoTipoConceptoFlujoCaja());
			
			this.seleccionarFilaTablaTipoConceptoFlujoCajaActual();
						
			this.actualizarEstadoCeldasBotonesTipoConceptoFlujoCaja("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoConceptoFlujoCaja(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTextFieldcodigoTipoConceptoFlujoCaja.setEnabled(isHabilitar && this.tipoconceptoflujocajaConstantesFunciones.activarcodigoTipoConceptoFlujoCaja);
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTextAreanombreTipoConceptoFlujoCaja.setEnabled(isHabilitar && this.tipoconceptoflujocajaConstantesFunciones.activarnombreTipoConceptoFlujoCaja);	
		//
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxid_empresaTipoConceptoFlujoCaja.setEnabled(isHabilitar && this.tipoconceptoflujocajaConstantesFunciones.activarid_empresaTipoConceptoFlujoCaja);
	};
	
	public void setDefaultControlesTipoConceptoFlujoCaja() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoConceptoFlujoCaja(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoconceptoflujocajaSessionBean.setConGuardarRelaciones(true);			
			this.tipoconceptoflujocajaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTabbedPaneRelacionesTipoConceptoFlujoCaja.setVisible(true);
			
					
		} else {
			//this.tipoconceptoflujocajaSessionBean.setConGuardarRelaciones(false);			
			this.tipoconceptoflujocajaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTabbedPaneRelacionesTipoConceptoFlujoCaja.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoConceptoFlujoCaja() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()) {
				if(tipoconceptoflujocajaAux.getId().equals(this.iIdNuevoTipoConceptoFlujoCaja)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:this.tipoconceptoflujocajas) {
				if(tipoconceptoflujocajaAux.getId().equals(this.iIdNuevoTipoConceptoFlujoCaja)) {
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
	
	public int getIndiceActualTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocaja,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()) {
				if(tipoconceptoflujocajaAux.getId().equals(tipoconceptoflujocaja.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:this.tipoconceptoflujocajas) {
				if(tipoconceptoflujocajaAux.getId().equals(tipoconceptoflujocaja.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocajaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()) {
				if(tipoconceptoflujocajaAux.getTipoConceptoFlujoCajaOriginal().getId().equals(tipoconceptoflujocajaOriginal.getId())) {
					existe=true;
					tipoconceptoflujocajaOriginal.setId(tipoconceptoflujocajaAux.getId());
					tipoconceptoflujocajaOriginal.setVersionRow(tipoconceptoflujocajaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:this.tipoconceptoflujocajas) {
				if(tipoconceptoflujocajaAux.getTipoConceptoFlujoCajaOriginal().getId().equals(tipoconceptoflujocajaOriginal.getId())) {
					existe=true;
					tipoconceptoflujocajaOriginal.setId(tipoconceptoflujocajaAux.getId());
					tipoconceptoflujocajaOriginal.setVersionRow(tipoconceptoflujocajaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoConceptoFlujoCaja(Boolean esParaCancelar) throws Exception {
		tipoconceptoflujocajasAux=new ArrayList<TipoConceptoFlujoCaja>();
		tipoconceptoflujocajaAux=new TipoConceptoFlujoCaja();
		
		if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()) {
					if(tipoconceptoflujocajaAux.getId()<0) {
						tipoconceptoflujocajasAux.add(tipoconceptoflujocajaAux);
					}		
				}
				this.iIdNuevoTipoConceptoFlujoCaja=0L;
				this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().removeAll(tipoconceptoflujocajasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:this.tipoconceptoflujocajas) {
					if(tipoconceptoflujocajaAux.getId()<0) {
						tipoconceptoflujocajasAux.add(tipoconceptoflujocajaAux);
					}		
				}
				this.iIdNuevoTipoConceptoFlujoCaja=0L;
				this.tipoconceptoflujocajas.removeAll(tipoconceptoflujocajasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoConceptoFlujoCaja 
					&& this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().size()>0
					) {
					tipoconceptoflujocajaAux=this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().get(this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().size() - 1);
				
					if(tipoconceptoflujocajaAux.getId()<0) {
						this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().remove(tipoconceptoflujocajaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoConceptoFlujoCaja && this.tipoconceptoflujocajas.size()>0) {
					tipoconceptoflujocajaAux=this.tipoconceptoflujocajas.get(this.tipoconceptoflujocajas.size() - 1);
				
					if(tipoconceptoflujocajaAux.getId()<0) {
						this.tipoconceptoflujocajas.remove(tipoconceptoflujocajaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoConceptoFlujoCaja(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoconceptoflujocaja.getId()<0) {
				this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().remove(this.tipoconceptoflujocaja);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoconceptoflujocaja.getId()<0) {
				this.tipoconceptoflujocajas.remove(this.tipoconceptoflujocaja);
			}
		}			
	}
	
	public void setEstadosInicialesTipoConceptoFlujoCaja(List<TipoConceptoFlujoCaja> tipoconceptoflujocajasAux) throws Exception {
		TipoConceptoFlujoCajaConstantesFunciones.setEstadosInicialesTipoConceptoFlujoCaja(tipoconceptoflujocajasAux);
	}
	
	public void setEstadosInicialesTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocajaAux) throws Exception {
		TipoConceptoFlujoCajaConstantesFunciones.setEstadosInicialesTipoConceptoFlujoCaja(tipoconceptoflujocajaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoConceptoFlujoCajaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoConceptoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoConceptoFlujoCajaActual()) {
				if(!this.isEsNuevoTipoConceptoFlujoCaja) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoConceptoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoConceptoFlujoCaja=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoConceptoFlujoCajaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Concepto Flujo Caja ?", "MANTENIMIENTO DE Tipo Concepto Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoConceptoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoConceptoFlujoCaja tipoconceptoflujocaja) throws Exception {
		TipoConceptoFlujoCajaConstantesFunciones.seleccionarAsignar(this.tipoconceptoflujocaja,tipoconceptoflujocaja);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoConceptoFlujoCaja=this.isPermisoActualizarOriginalTipoConceptoFlujoCaja;
			
			
			this.seleccionarAsignar(tipoconceptoflujocaja);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoConceptoFlujoCajaConstantesFunciones.quitarEspaciosTipoConceptoFlujoCaja(this.tipoconceptoflujocaja,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoConceptoFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoconceptoflujocajaSessionBean.setsFuncionBusquedaRapida(this.tipoconceptoflujocajaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoConceptoFlujoCaja) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoConceptoFlujoCaja(esParaCancelar);				
				this.cancelarNuevoTipoConceptoFlujoCaja(esParaCancelar);								
			}
			
			this.tipoconceptoflujocaja=new TipoConceptoFlujoCaja();
			
			this.inicializarTipoConceptoFlujoCaja();
			
			this.actualizarEstadoCeldasBotonesTipoConceptoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoConceptoFlujoCaja() throws Exception {
		try {
			TipoConceptoFlujoCajaConstantesFunciones.inicializarTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoConceptoFlujoCajas(String sAccionBusqueda,List<TipoConceptoFlujoCaja> tipoconceptoflujocajasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoConceptoFlujoCaja"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoConceptoFlujoCajaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoConceptoFlujoCajaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoConceptoFlujoCaja"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Concepto Flujo Cajas");		
		parameters.put("busquedapor", TipoConceptoFlujoCajaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoConceptoFlujoCaja=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoConceptoFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoConceptoFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoConceptoFlujoCaja=new JRBeanArrayDataSource(TipoConceptoFlujoCajaJInternalFrame.TraerTipoConceptoFlujoCajaBeans(tipoconceptoflujocajasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoConceptoFlujoCaja);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoConceptoFlujoCajaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoConceptoFlujoCajaBean.TraerTipoConceptoFlujoCajaBeans(tipoconceptoflujocajasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoConceptoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipoconceptoflujocajasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoConceptoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipoconceptoflujocajasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoConceptoFlujoCajaActionPerformed(null);
					//this.generarExcelReporteTipoConceptoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipoconceptoflujocajasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoConceptoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipoconceptoflujocajasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoConceptoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipoconceptoflujocajasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoConceptoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipoconceptoflujocajasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoConceptoFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoConceptoFlujoCaja> tipoconceptoflujocajasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconceptoflujocaja";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoConceptoFlujoCajas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoConceptoFlujoCaja("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoConceptoFlujoCaja tipoconceptoflujocaja : tipoconceptoflujocajasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoConceptoFlujoCajaConstantesFunciones.generarExcelReporteDataTipoConceptoFlujoCaja("NORMAL",row,workbook,tipoconceptoflujocaja,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Concepto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoConceptoFlujoCaja(String sTipo,Row row,Workbook workbook) {
		
		TipoConceptoFlujoCajaConstantesFunciones.generarExcelReporteHeaderTipoConceptoFlujoCaja(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoConceptoFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoConceptoFlujoCaja> tipoconceptoflujocajasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconceptoflujocaja_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoConceptoFlujoCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoConceptoFlujoCaja tipoconceptoflujocaja : tipoconceptoflujocajasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoConceptoFlujoCajaConstantesFunciones.getTipoConceptoFlujoCajaDescripcion(tipoconceptoflujocaja));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoConceptoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoConceptoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoconceptoflujocaja.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoconceptoflujocaja.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoconceptoflujocaja.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Concepto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoConceptoFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoConceptoFlujoCaja> tipoconceptoflujocajasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoConceptoFlujoCaja> tipoconceptoflujocajasRespaldo=null;
		
		classes=TipoConceptoFlujoCajaConstantesFunciones.getClassesRelationshipsOfTipoConceptoFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoconceptoflujocajaLogic.setDatosCliente(this.datosCliente);
		this.tipoconceptoflujocajaLogic.setDatosDeep(this.datosDeep);
		this.tipoconceptoflujocajaLogic.setIsConDeep(true);
		
		tipoconceptoflujocajasRespaldo=this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas();
		
		this.tipoconceptoflujocajaLogic.setTipoConceptoFlujoCajas(tipoconceptoflujocajasParaReportes);	
		this.tipoconceptoflujocajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoconceptoflujocajasParaReportes=this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas();
		this.tipoconceptoflujocajaLogic.setTipoConceptoFlujoCajas(tipoconceptoflujocajasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconceptoflujocaja_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoConceptoFlujoCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoConceptoFlujoCaja("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoConceptoFlujoCaja tipoconceptoflujocaja : tipoconceptoflujocajasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoConceptoFlujoCaja("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoConceptoFlujoCajaConstantesFunciones.generarExcelReporteDataTipoConceptoFlujoCaja("NORMAL",row,workbook,tipoconceptoflujocaja,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoConceptoFlujoCajaConstantesFunciones.getTipoConceptoFlujoCajaDescripcion(tipoconceptoflujocaja));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Concepto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoConceptoFlujoCaja() throws Exception {		
		this.startProcessTipoConceptoFlujoCaja(true);
	}
	
	public void startProcessTipoConceptoFlujoCaja(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoConceptoFlujoCaja ,this.jPanelParametrosReportesTipoConceptoFlujoCaja, this.jScrollPanelDatosTipoConceptoFlujoCaja,this.jPanelPaginacionTipoConceptoFlujoCaja, this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja, this.jPanelAccionesTipoConceptoFlujoCaja,this.jPanelAccionesFormularioTipoConceptoFlujoCaja,this.jmenuBarTipoConceptoFlujoCaja,this.jmenuBarDetalleTipoConceptoFlujoCaja,this.jTtoolBarTipoConceptoFlujoCaja,this.jTtoolBarDetalleTipoConceptoFlujoCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoConceptoFlujoCaja=this.jTabbedPaneBusquedasTipoConceptoFlujoCaja; 
		
		final JPanel jPanelParametrosReportesTipoConceptoFlujoCaja=this.jPanelParametrosReportesTipoConceptoFlujoCaja;
		//final JScrollPane jScrollPanelDatosTipoConceptoFlujoCaja=this.jScrollPanelDatosTipoConceptoFlujoCaja;
		final JTable jTableDatosTipoConceptoFlujoCaja=this.jTableDatosTipoConceptoFlujoCaja;		
		final JPanel jPanelPaginacionTipoConceptoFlujoCaja=this.jPanelPaginacionTipoConceptoFlujoCaja;
		//final JScrollPane jScrollPanelDatosEdicionTipoConceptoFlujoCaja=this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja;
		final JPanel jPanelAccionesTipoConceptoFlujoCaja=this.jPanelAccionesTipoConceptoFlujoCaja;
		
		JPanel jPanelCamposAuxiliarTipoConceptoFlujoCaja=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoConceptoFlujoCaja=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
			jPanelCamposAuxiliarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jPanelCamposTipoConceptoFlujoCaja;
			jPanelAccionesFormularioAuxiliarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jPanelAccionesFormularioTipoConceptoFlujoCaja;
		}
		
		final JPanel jPanelCamposTipoConceptoFlujoCaja=jPanelCamposAuxiliarTipoConceptoFlujoCaja;
		final JPanel jPanelAccionesFormularioTipoConceptoFlujoCaja=jPanelAccionesFormularioAuxiliarTipoConceptoFlujoCaja;
		
		
		final JMenuBar jmenuBarTipoConceptoFlujoCaja=this.jmenuBarTipoConceptoFlujoCaja;
		final JToolBar jTtoolBarTipoConceptoFlujoCaja=this.jTtoolBarTipoConceptoFlujoCaja;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoConceptoFlujoCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoConceptoFlujoCaja=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
			jmenuBarDetalleAuxiliarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jmenuBarDetalleTipoConceptoFlujoCaja;
			jTtoolBarDetalleAuxiliarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTtoolBarDetalleTipoConceptoFlujoCaja;
		}
		
		final JMenuBar jmenuBarDetalleTipoConceptoFlujoCaja=jmenuBarDetalleAuxiliarTipoConceptoFlujoCaja;
		final JToolBar jTtoolBarDetalleTipoConceptoFlujoCaja=jTtoolBarDetalleAuxiliarTipoConceptoFlujoCaja;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoConceptoFlujoCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoConceptoFlujoCaja;
			processRunnable.jTableDatos=jTableDatosTipoConceptoFlujoCaja;
			processRunnable.jPanelCampos=jPanelCamposTipoConceptoFlujoCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoConceptoFlujoCaja;
			processRunnable.jPanelAcciones=jPanelAccionesTipoConceptoFlujoCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoConceptoFlujoCaja;
			
			
			processRunnable.jmenuBar=jmenuBarTipoConceptoFlujoCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoConceptoFlujoCaja;
			processRunnable.jTtoolBar=jTtoolBarTipoConceptoFlujoCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoConceptoFlujoCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoConceptoFlujoCaja ,jPanelParametrosReportesTipoConceptoFlujoCaja,jTableDatosTipoConceptoFlujoCaja, /*jScrollPanelDatosTipoConceptoFlujoCaja,*/jPanelCamposTipoConceptoFlujoCaja,jPanelPaginacionTipoConceptoFlujoCaja, /*jScrollPanelDatosEdicionTipoConceptoFlujoCaja,*/ jPanelAccionesTipoConceptoFlujoCaja,jPanelAccionesFormularioTipoConceptoFlujoCaja,jmenuBarTipoConceptoFlujoCaja,jmenuBarDetalleTipoConceptoFlujoCaja,jTtoolBarTipoConceptoFlujoCaja,jTtoolBarDetalleTipoConceptoFlujoCaja);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoConceptoFlujoCaja ,jPanelParametrosReportesTipoConceptoFlujoCaja, jScrollPanelDatosTipoConceptoFlujoCaja,jPanelPaginacionTipoConceptoFlujoCaja, jScrollPanelDatosEdicionTipoConceptoFlujoCaja, jPanelAccionesTipoConceptoFlujoCaja,jPanelAccionesFormularioTipoConceptoFlujoCaja,jmenuBarTipoConceptoFlujoCaja,jmenuBarDetalleTipoConceptoFlujoCaja,jTtoolBarTipoConceptoFlujoCaja,jTtoolBarDetalleTipoConceptoFlujoCaja);
						
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
	
	public void finishProcessTipoConceptoFlujoCaja() {// throws Exception 
		this.finishProcessTipoConceptoFlujoCaja(true);
	}
	
	public void finishProcessTipoConceptoFlujoCaja(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoConceptoFlujoCaja ,this.jPanelParametrosReportesTipoConceptoFlujoCaja, this.jScrollPanelDatosTipoConceptoFlujoCaja,this.jPanelPaginacionTipoConceptoFlujoCaja, this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja, this.jPanelAccionesTipoConceptoFlujoCaja,this.jPanelAccionesFormularioTipoConceptoFlujoCaja,this.jmenuBarTipoConceptoFlujoCaja,this.jmenuBarDetalleTipoConceptoFlujoCaja,this.jTtoolBarTipoConceptoFlujoCaja,this.jTtoolBarDetalleTipoConceptoFlujoCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoConceptoFlujoCaja=this.jTabbedPaneBusquedasTipoConceptoFlujoCaja; 
		
		final JPanel jPanelParametrosReportesTipoConceptoFlujoCaja=this.jPanelParametrosReportesTipoConceptoFlujoCaja;
		//final JScrollPane jScrollPanelDatosTipoConceptoFlujoCaja=this.jScrollPanelDatosTipoConceptoFlujoCaja;
		final JTable jTableDatosTipoConceptoFlujoCaja=this.jTableDatosTipoConceptoFlujoCaja;		
		final JPanel jPanelPaginacionTipoConceptoFlujoCaja=this.jPanelPaginacionTipoConceptoFlujoCaja;
		//final JScrollPane jScrollPanelDatosEdicionTipoConceptoFlujoCaja=this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja;
		final JPanel jPanelAccionesTipoConceptoFlujoCaja=this.jPanelAccionesTipoConceptoFlujoCaja;
		
		JPanel jPanelCamposAuxiliarTipoConceptoFlujoCaja=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoConceptoFlujoCaja=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
			jPanelCamposAuxiliarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jPanelCamposTipoConceptoFlujoCaja;
			jPanelAccionesFormularioAuxiliarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jPanelAccionesFormularioTipoConceptoFlujoCaja;
		}
		
		final JPanel jPanelCamposTipoConceptoFlujoCaja=jPanelCamposAuxiliarTipoConceptoFlujoCaja;
		final JPanel jPanelAccionesFormularioTipoConceptoFlujoCaja=jPanelAccionesFormularioAuxiliarTipoConceptoFlujoCaja;
		
		
		final JMenuBar jmenuBarTipoConceptoFlujoCaja=this.jmenuBarTipoConceptoFlujoCaja;		
		final JToolBar jTtoolBarTipoConceptoFlujoCaja=this.jTtoolBarTipoConceptoFlujoCaja;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoConceptoFlujoCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoConceptoFlujoCaja=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
			jmenuBarDetalleAuxiliarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jmenuBarDetalleTipoConceptoFlujoCaja;
			jTtoolBarDetalleAuxiliarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTtoolBarDetalleTipoConceptoFlujoCaja;		
		}
		
		final JMenuBar jmenuBarDetalleTipoConceptoFlujoCaja=jmenuBarDetalleAuxiliarTipoConceptoFlujoCaja;
		final JToolBar jTtoolBarDetalleTipoConceptoFlujoCaja=jTtoolBarDetalleAuxiliarTipoConceptoFlujoCaja;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoConceptoFlujoCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoConceptoFlujoCaja;
			processRunnable.jTableDatos=jTableDatosTipoConceptoFlujoCaja;
			processRunnable.jPanelCampos=jPanelCamposTipoConceptoFlujoCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoConceptoFlujoCaja;
			processRunnable.jPanelAcciones=jPanelAccionesTipoConceptoFlujoCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoConceptoFlujoCaja;
			
			
			processRunnable.jmenuBar=jmenuBarTipoConceptoFlujoCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoConceptoFlujoCaja;
			processRunnable.jTtoolBar=jTtoolBarTipoConceptoFlujoCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoConceptoFlujoCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoConceptoFlujoCaja ,jPanelParametrosReportesTipoConceptoFlujoCaja, jTableDatosTipoConceptoFlujoCaja,/*jScrollPanelDatosTipoConceptoFlujoCaja,*/jPanelCamposTipoConceptoFlujoCaja,jPanelPaginacionTipoConceptoFlujoCaja, /*jScrollPanelDatosEdicionTipoConceptoFlujoCaja,*/ jPanelAccionesTipoConceptoFlujoCaja,jPanelAccionesFormularioTipoConceptoFlujoCaja,jmenuBarTipoConceptoFlujoCaja,jmenuBarDetalleTipoConceptoFlujoCaja,jTtoolBarTipoConceptoFlujoCaja,jTtoolBarDetalleTipoConceptoFlujoCaja));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoConceptoFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoConceptoFlujoCaja(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoConceptoFlujoCaja(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoConceptoFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoConceptoFlujoCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoConceptoFlujoCaja,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoConceptoFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoConceptoFlujoCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoConceptoFlujoCaja,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoconceptoflujocajaConstantesFunciones.getsFinalQueryTipoConceptoFlujoCaja();
		String  finalQueryPaginacionTodos=this.tipoconceptoflujocajaConstantesFunciones.getsFinalQueryTipoConceptoFlujoCaja();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoConceptoFlujoCajaConstantesFunciones.getArrayColumnasGlobalesNoTipoConceptoFlujoCaja(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoConceptoFlujoCajaConstantesFunciones.getArrayColumnasGlobalesTipoConceptoFlujoCaja(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoConceptoFlujoCajaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoconceptoflujocajasEliminados= new ArrayList<TipoConceptoFlujoCaja>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoConceptoFlujoCaja();
		
				///*TipoConceptoFlujoCajaSessionBean*/this.tipoconceptoflujocajaSessionBean=new TipoConceptoFlujoCajaSessionBean();
			
			if(this.tipoconceptoflujocajaSessionBean==null) {
				this.tipoconceptoflujocajaSessionBean=new TipoConceptoFlujoCajaSessionBean();
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
					this.iNumeroPaginacion=TipoConceptoFlujoCajaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoConceptoFlujoCajaConstantesFunciones.getClassesForeignKeysOfTipoConceptoFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoconceptoflujocaja."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoconceptoflujocajasAux= new ArrayList<TipoConceptoFlujoCaja>();
			
				
			tipoconceptoflujocajaLogic.setDatosCliente(this.datosCliente);
			tipoconceptoflujocajaLogic.setDatosDeep(this.datosDeep);
			tipoconceptoflujocajaLogic.setIsConDeep(true);
			
			
			tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoconceptoflujocajaLogic.getTodosTipoConceptoFlujoCajas(finalQueryGlobal,pagination);
					
					//tipoconceptoflujocajaLogic.getTodosTipoConceptoFlujoCajasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()==null|| tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoconceptoflujocajasAux= new ArrayList<TipoConceptoFlujoCaja>();
							tipoconceptoflujocajasAux.addAll(tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconceptoflujocajasAux= new ArrayList<TipoConceptoFlujoCaja>();
							tipoconceptoflujocajasAux.addAll(tipoconceptoflujocajas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoconceptoflujocajaLogic.getTodosTipoConceptoFlujoCajas(finalQueryGlobal+"",this.pagination);												
							
							//tipoconceptoflujocajaLogic.getTodosTipoConceptoFlujoCajasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoConceptoFlujoCajas("Todos",tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoconceptoflujocajaLogic.setTipoConceptoFlujoCajas(new ArrayList<TipoConceptoFlujoCaja>());					
							tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().addAll(tipoconceptoflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconceptoflujocajas=new ArrayList<TipoConceptoFlujoCaja>();
							tipoconceptoflujocajas.addAll(tipoconceptoflujocajasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoConceptoFlujoCaja=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoConceptoFlujoCaja=this.idActual;
				
				} else if(this.idTipoConceptoFlujoCajaActual!=null && this.idTipoConceptoFlujoCajaActual!=0L) {
					idTipoConceptoFlujoCaja=idTipoConceptoFlujoCajaActual;
				}
				
					
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndicePorId(idTipoConceptoFlujoCaja);
				
				this.tipoconceptoflujocajas=new ArrayList<TipoConceptoFlujoCaja>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoconceptoflujocajaLogic.getEntity(idTipoConceptoFlujoCaja);
					
					//tipoconceptoflujocajaLogic.getEntityWithConnection(idTipoConceptoFlujoCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconceptoflujocajaLogic.setTipoConceptoFlujoCajas(new ArrayList<TipoConceptoFlujoCaja>());
					tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().add(tipoconceptoflujocajaLogic.getTipoConceptoFlujoCaja());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoconceptoflujocajas=new ArrayList<TipoConceptoFlujoCaja>();
					this.tipoconceptoflujocajas.add(tipoconceptoflujocaja);
				}
				
				if(tipoconceptoflujocajaLogic.getTipoConceptoFlujoCaja()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()==null||tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoconceptoflujocajas==null|| tipoconceptoflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconceptoflujocajasAux=new ArrayList<TipoConceptoFlujoCaja>();
						tipoconceptoflujocajasAux.addAll(tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconceptoflujocajasAux=new ArrayList<TipoConceptoFlujoCaja>();
							tipoconceptoflujocajasAux.addAll(tipoconceptoflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoConceptoFlujoCajas("BusquedaPorCodigo",tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoConceptoFlujoCajas("BusquedaPorCodigo",tipoconceptoflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconceptoflujocajaLogic.setTipoConceptoFlujoCajas(new ArrayList<TipoConceptoFlujoCaja>());
						tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().addAll(tipoconceptoflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconceptoflujocajas=new ArrayList<TipoConceptoFlujoCaja>();
							tipoconceptoflujocajas.addAll(tipoconceptoflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorId")) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajasBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()==null||tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoconceptoflujocajas==null|| tipoconceptoflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconceptoflujocajasAux=new ArrayList<TipoConceptoFlujoCaja>();
						tipoconceptoflujocajasAux.addAll(tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconceptoflujocajasAux=new ArrayList<TipoConceptoFlujoCaja>();
							tipoconceptoflujocajasAux.addAll(tipoconceptoflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajasBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoConceptoFlujoCajas("BusquedaPorId",tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoConceptoFlujoCajas("BusquedaPorId",tipoconceptoflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconceptoflujocajaLogic.setTipoConceptoFlujoCajas(new ArrayList<TipoConceptoFlujoCaja>());
						tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().addAll(tipoconceptoflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconceptoflujocajas=new ArrayList<TipoConceptoFlujoCaja>();
							tipoconceptoflujocajas.addAll(tipoconceptoflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()==null||tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoconceptoflujocajas==null|| tipoconceptoflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconceptoflujocajasAux=new ArrayList<TipoConceptoFlujoCaja>();
						tipoconceptoflujocajasAux.addAll(tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconceptoflujocajasAux=new ArrayList<TipoConceptoFlujoCaja>();
							tipoconceptoflujocajasAux.addAll(tipoconceptoflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoConceptoFlujoCajas("BusquedaPorNombre",tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoConceptoFlujoCajas("BusquedaPorNombre",tipoconceptoflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconceptoflujocajaLogic.setTipoConceptoFlujoCajas(new ArrayList<TipoConceptoFlujoCaja>());
						tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().addAll(tipoconceptoflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconceptoflujocajas=new ArrayList<TipoConceptoFlujoCaja>();
							tipoconceptoflujocajas.addAll(tipoconceptoflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()==null||tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoconceptoflujocajas==null|| tipoconceptoflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconceptoflujocajasAux=new ArrayList<TipoConceptoFlujoCaja>();
						tipoconceptoflujocajasAux.addAll(tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconceptoflujocajasAux=new ArrayList<TipoConceptoFlujoCaja>();
							tipoconceptoflujocajasAux.addAll(tipoconceptoflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoConceptoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoConceptoFlujoCajas("FK_IdEmpresa",tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoConceptoFlujoCajas("FK_IdEmpresa",tipoconceptoflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconceptoflujocajaLogic.setTipoConceptoFlujoCajas(new ArrayList<TipoConceptoFlujoCaja>());
						tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().addAll(tipoconceptoflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconceptoflujocajas=new ArrayList<TipoConceptoFlujoCaja>();
							tipoconceptoflujocajas.addAll(tipoconceptoflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoConceptoFlujoCaja();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoConceptoFlujoCaja();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoconceptoflujocajas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoconceptoflujocajas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoConceptoFlujoCaja tipoconceptoflujocaja) {
		Boolean permite=true;
		
		if(this.tipoconceptoflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoConceptoFlujoCajaConstantesFunciones.getOrderByListaTipoConceptoFlujoCaja();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoConceptoFlujoCajaConstantesFunciones.getOrderByListaTipoConceptoFlujoCaja();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConceptoFlujoCaja tipoconceptoflujocaja:tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()) {
				if(tipoconceptoflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					tipoconceptoflujocajaTotales=tipoconceptoflujocaja;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConceptoFlujoCaja tipoconceptoflujocaja:this.tipoconceptoflujocajas) {
				if(tipoconceptoflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					tipoconceptoflujocajaTotales=tipoconceptoflujocaja;
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
			this.tipoconceptoflujocajaAux=new TipoConceptoFlujoCaja();
			this.tipoconceptoflujocajaAux.setsType(Constantes2.S_TOTALES);
			this.tipoconceptoflujocajaAux.setIsNew(false);
			this.tipoconceptoflujocajaAux.setIsChanged(false);
			this.tipoconceptoflujocajaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoConceptoFlujoCajaConstantesFunciones.TotalizarValoresFilaTipoConceptoFlujoCaja(this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas(),this.tipoconceptoflujocajaAux);
				
				this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().add(this.tipoconceptoflujocajaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoConceptoFlujoCajaConstantesFunciones.TotalizarValoresFilaTipoConceptoFlujoCaja(this.tipoconceptoflujocajas,this.tipoconceptoflujocajaAux);
				
				this.tipoconceptoflujocajas.add(this.tipoconceptoflujocajaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoconceptoflujocajaTotales=new TipoConceptoFlujoCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().remove(tipoconceptoflujocajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoconceptoflujocajas.remove(tipoconceptoflujocajaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoconceptoflujocajaTotales=new TipoConceptoFlujoCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConceptoFlujoCaja tipoconceptoflujocaja:tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()) {
				if(tipoconceptoflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					tipoconceptoflujocajaTotales=tipoconceptoflujocaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoConceptoFlujoCajaConstantesFunciones.TotalizarValoresFilaTipoConceptoFlujoCaja(this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas(),tipoconceptoflujocajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConceptoFlujoCaja tipoconceptoflujocaja:this.tipoconceptoflujocajas) {
				if(tipoconceptoflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					tipoconceptoflujocajaTotales=tipoconceptoflujocaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoConceptoFlujoCajaConstantesFunciones.TotalizarValoresFilaTipoConceptoFlujoCaja(this.tipoconceptoflujocajas,tipoconceptoflujocajaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoConceptoFlujoCajasBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoConceptoFlujoCajasBusquedaPorId()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorId";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoConceptoFlujoCajasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoConceptoFlujoCajasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoConceptoFlujoCajasBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajasBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoConceptoFlujoCajasBusquedaPorId(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajasBusquedaPorId(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoConceptoFlujoCajasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoConceptoFlujoCajasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoConceptoFlujoCaja() {
		this.isPermisoTodoTipoConceptoFlujoCaja=false;
		this.isPermisoNuevoTipoConceptoFlujoCaja=false;
		this.isPermisoActualizarTipoConceptoFlujoCaja=false;
		this.isPermisoActualizarOriginalTipoConceptoFlujoCaja=false;
		this.isPermisoEliminarTipoConceptoFlujoCaja=false;
		this.isPermisoGuardarCambiosTipoConceptoFlujoCaja=false;
		this.isPermisoConsultaTipoConceptoFlujoCaja=false;
		this.isPermisoBusquedaTipoConceptoFlujoCaja=false;
		this.isPermisoReporteTipoConceptoFlujoCaja=false;		
		this.isPermisoOrdenTipoConceptoFlujoCaja=false;		
		this.isPermisoPaginacionMedioTipoConceptoFlujoCaja=false;		
		this.isPermisoPaginacionAltoTipoConceptoFlujoCaja=false;
		this.isPermisoPaginacionTodoTipoConceptoFlujoCaja=false;
		this.isPermisoCopiarTipoConceptoFlujoCaja=false;		
		this.isPermisoVerFormTipoConceptoFlujoCaja=false;		
		this.isPermisoDuplicarTipoConceptoFlujoCaja=false;		
		this.isPermisoOrdenTipoConceptoFlujoCaja=false;		
	}
	
	public void setPermisosUsuarioTipoConceptoFlujoCaja(Boolean isPermiso) {
		this.isPermisoTodoTipoConceptoFlujoCaja=isPermiso;
		this.isPermisoNuevoTipoConceptoFlujoCaja=isPermiso;
		this.isPermisoActualizarTipoConceptoFlujoCaja=isPermiso;
		this.isPermisoActualizarOriginalTipoConceptoFlujoCaja=isPermiso;
		this.isPermisoEliminarTipoConceptoFlujoCaja=isPermiso;
		this.isPermisoGuardarCambiosTipoConceptoFlujoCaja=isPermiso;
		this.isPermisoConsultaTipoConceptoFlujoCaja=isPermiso;
		this.isPermisoBusquedaTipoConceptoFlujoCaja=isPermiso;
		this.isPermisoReporteTipoConceptoFlujoCaja=isPermiso;
		this.isPermisoOrdenTipoConceptoFlujoCaja=isPermiso;		
		this.isPermisoPaginacionMedioTipoConceptoFlujoCaja=isPermiso;		
		this.isPermisoPaginacionAltoTipoConceptoFlujoCaja=isPermiso;		
		this.isPermisoPaginacionTodoTipoConceptoFlujoCaja=isPermiso;		
		this.isPermisoCopiarTipoConceptoFlujoCaja=isPermiso;		
		this.isPermisoVerFormTipoConceptoFlujoCaja=isPermiso;		
		this.isPermisoDuplicarTipoConceptoFlujoCaja=isPermiso;
		this.isPermisoOrdenTipoConceptoFlujoCaja=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoConceptoFlujoCaja(Boolean isPermiso) {
		//this.isPermisoTodoTipoConceptoFlujoCaja=isPermiso;
		this.isPermisoNuevoTipoConceptoFlujoCaja=isPermiso;
		this.isPermisoActualizarTipoConceptoFlujoCaja=isPermiso;
		this.isPermisoActualizarOriginalTipoConceptoFlujoCaja=isPermiso;
		this.isPermisoEliminarTipoConceptoFlujoCaja=isPermiso;
		this.isPermisoGuardarCambiosTipoConceptoFlujoCaja=isPermiso;
		//this.isPermisoConsultaTipoConceptoFlujoCaja=isPermiso;
		//this.isPermisoBusquedaTipoConceptoFlujoCaja=isPermiso;
		//this.isPermisoReporteTipoConceptoFlujoCaja=isPermiso;
		//this.isPermisoOrdenTipoConceptoFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionMedioTipoConceptoFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionAltoTipoConceptoFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionTodoTipoConceptoFlujoCaja=isPermiso;		
		//this.isPermisoCopiarTipoConceptoFlujoCaja=isPermiso;		
		//this.isPermisoDuplicarTipoConceptoFlujoCaja=isPermiso;
		//this.isPermisoOrdenTipoConceptoFlujoCaja=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoConceptoFlujoCajaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoConceptoFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoConceptoFlujoCaja(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoConceptoFlujoCajaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoConceptoFlujoCajaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoConceptoFlujoCajaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoConceptoFlujoCajaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoConceptoFlujoCaja() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoConceptoFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoConceptoFlujoCajaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoConceptoFlujoCaja=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoConceptoFlujoCaja=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoConceptoFlujoCaja=this.isPermisoActualizarTipoConceptoFlujoCaja;
			this.isPermisoEliminarTipoConceptoFlujoCaja=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoConceptoFlujoCaja=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoConceptoFlujoCaja=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoConceptoFlujoCaja=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoConceptoFlujoCaja=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoConceptoFlujoCaja=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoConceptoFlujoCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoConceptoFlujoCaja=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoConceptoFlujoCaja=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoConceptoFlujoCaja=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoConceptoFlujoCaja=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoConceptoFlujoCaja=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoConceptoFlujoCaja=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoConceptoFlujoCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoConceptoFlujoCaja.setToolTipText(this.jTableDatosTipoConceptoFlujoCaja.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoConceptoFlujoCaja(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoConceptoFlujoCaja(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoConceptoFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoConceptoFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoConceptoFlujoCaja() throws Exception {
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
	public void inicializarCombosForeignKeyTipoConceptoFlujoCajaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoConceptoFlujoCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoConceptoFlujoCajaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoConceptoFlujoCajaListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoConceptoFlujoCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoConceptoFlujoCajaParameterReturnGeneral tipoconceptoflujocajaReturnGeneral=new TipoConceptoFlujoCajaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoconceptoflujocajaConstantesFunciones.cargarid_empresaTipoConceptoFlujoCaja)
					 || (this.esRecargarFks && this.tipoconceptoflujocajaConstantesFunciones.cargarid_empresaTipoConceptoFlujoCaja)) {

					if(!this.tipoconceptoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoconceptoflujocajaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoconceptoflujocajaReturnGeneral=tipoconceptoflujocajaLogic.cargarCombosLoteForeignKeyTipoConceptoFlujoCaja(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoconceptoflujocajaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoConceptoFlujoCaja()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoconceptoflujocajaSessionBean==null) {
				this.tipoconceptoflujocajaSessionBean=new TipoConceptoFlujoCajaSessionBean();
			}

			if(!this.tipoconceptoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoConceptoFlujoCaja()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoConceptoFlujoCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoConceptoFlujoCaja()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoConceptoFlujoCaja();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocaja)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocaja,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoConceptoFlujoCaja()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoConceptoFlujoCaja()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoConceptoFlujoCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoConceptoFlujoCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoConceptoFlujoCaja()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoConceptoFlujoCaja()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoConceptoFlujoCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoConceptoFlujoCaja()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxid_empresaTipoConceptoFlujoCaja!=null && this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxid_empresaTipoConceptoFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxid_empresaTipoConceptoFlujoCaja.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoConceptoFlujoCajaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoConceptoFlujoCajaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoConceptoFlujoCajaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoconceptoflujocajaSessionBean=new TipoConceptoFlujoCajaSessionBean(); 
		this.tipoconceptoflujocajaConstantesFunciones=new TipoConceptoFlujoCajaConstantesFunciones(); 
		this.tipoconceptoflujocajaBean=new TipoConceptoFlujoCaja();//(this.tipoconceptoflujocajaConstantesFunciones); 		
		this.tipoconceptoflujocajaReturnGeneral=new TipoConceptoFlujoCajaParameterReturnGeneral(); 
		
		this.tipoconceptoflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoconceptoflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoConceptoFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoConceptoFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoConceptoFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoConceptoFlujoCaja(true);
			
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
			
			this.tipoconceptoflujocajaConstantesFunciones=new TipoConceptoFlujoCajaConstantesFunciones(); 
			this.tipoconceptoflujocajaBean=new TipoConceptoFlujoCaja();//this.tipoconceptoflujocajaConstantesFunciones); 			
			this.tipoconceptoflujocajaReturnGeneral=new TipoConceptoFlujoCajaParameterReturnGeneral(); 
		
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Concepto Flujo Caja Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoconceptoflujocaja=new TipoConceptoFlujoCaja();
			this.tipoconceptoflujocajas = new ArrayList<TipoConceptoFlujoCaja>();
			this.tipoconceptoflujocajasAux = new ArrayList<TipoConceptoFlujoCaja>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic=new TipoConceptoFlujoCajaLogic();
				this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoconceptoflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoconceptoflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoConceptoFlujoCaja);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja);	
					}
					
					if(this.jInternalFrameImportacionTipoConceptoFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoConceptoFlujoCaja);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoConceptoFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoConceptoFlujoCaja);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja);
				this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.setVisible(false);
				this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja);
					this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoConceptoFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoConceptoFlujoCaja);
					this.jInternalFrameImportacionTipoConceptoFlujoCaja.setVisible(false);
					this.jInternalFrameImportacionTipoConceptoFlujoCaja.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoConceptoFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoConceptoFlujoCaja);
					this.jInternalFrameOrderByTipoConceptoFlujoCaja.setVisible(false);
					this.jInternalFrameOrderByTipoConceptoFlujoCaja.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoConceptoFlujoCajaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoConceptoFlujoCajaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoconceptoflujocajaReturnGeneral=new TipoConceptoFlujoCajaParameterReturnGeneral();
			
			this.tipoconceptoflujocajaParameterGeneral=new TipoConceptoFlujoCajaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoconceptoflujocajaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoConceptoFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoConceptoFlujoCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado(),this.tipoconceptoflujocajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoConceptoFlujoCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado(),this.tipoconceptoflujocajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaDuplicarTipoConceptoFlujoCaja=true;
			this.isVisibilidadCeldaCopiarTipoConceptoFlujoCaja=true;
			this.isVisibilidadCeldaVerFormTipoConceptoFlujoCaja=true;
			this.isVisibilidadCeldaOrdenTipoConceptoFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaModificarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorId=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoConceptoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoConceptoFlujoCaja();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoConceptoFlujoCaja(false);
			
			this.setPermisosUsuarioTipoConceptoFlujoCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado() && this.tipoconceptoflujocajaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoConceptoFlujoCajaClasesRelacionadas();
			}
			
			if(this.tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoConceptoFlujoCajaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoConceptoFlujoCaja();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoConceptoFlujoCaja();
			}
			
			if(!this.isPermisoBusquedaTipoConceptoFlujoCaja) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoConceptoFlujoCaja,this.isPermisoPaginacionMedioTipoConceptoFlujoCaja,this.isPermisoPaginacionTodoTipoConceptoFlujoCaja);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoConceptoFlujoCajaConstantesFunciones.getTiposSeleccionarTipoConceptoFlujoCaja());
				
				this.tiposColumnasSelect=TipoConceptoFlujoCajaConstantesFunciones.getTiposSeleccionarTipoConceptoFlujoCaja(true);
				
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
			//if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoConceptoFlujoCaja();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoConceptoFlujoCaja(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoConceptoFlujoCaja(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoConceptoFlujoCaja() ;
			
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
				tipoconceptoflujocajaImplementable= (TipoConceptoFlujoCajaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoConceptoFlujoCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoconceptoflujocajaImplementableHome= (TipoConceptoFlujoCajaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoConceptoFlujoCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoconceptoflujocajas= new ArrayList<TipoConceptoFlujoCaja>();
			this.tipoconceptoflujocajasEliminados= new ArrayList<TipoConceptoFlujoCaja>();
						
			this.isEsNuevoTipoConceptoFlujoCaja=false;
			this.esParaAccionDesdeFormularioTipoConceptoFlujoCaja=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoConceptoFlujoCaja(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoConceptoFlujoCaja();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoConceptoFlujoCajaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoConceptoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoConceptoFlujoCaja();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoConceptoFlujoCaja();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoConceptoFlujoCaja(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoConceptoFlujoCaja: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoConceptoFlujoCaja() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoConceptoFlujoCaja")) {
				iIndex=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTabbedPaneRelacionesTipoConceptoFlujoCaja.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTabbedPaneRelacionesTipoConceptoFlujoCaja.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoConceptoFlujoCaja();	
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
	
	public void cargarCombosForeignKeyTipoConceptoFlujoCaja(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoConceptoFlujoCaja(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoConceptoFlujoCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoConceptoFlujoCajaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoConceptoFlujoCaja();
		
		this.cargarCombosFrameForeignKeyTipoConceptoFlujoCaja();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoConceptoFlujoCaja();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoConceptoFlujoCaja();
		}
	}
	
	
	
	public void jButtonNuevoTipoConceptoFlujoCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			
			
			if(jTableDatosTipoConceptoFlujoCaja.getRowCount()>=1) {
				jTableDatosTipoConceptoFlujoCaja.removeRowSelectionInterval(0, jTableDatosTipoConceptoFlujoCaja.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoConceptoFlujoCaja=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoConceptoFlujoCaja(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoConceptoFlujoCaja(true);			
			//this.tipoconceptoflujocaja=new TipoConceptoFlujoCaja();
			//this.tipoconceptoflujocaja.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoConceptoFlujoCaja(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoConceptoFlujoCaja() ;
			
			if(TipoConceptoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoConceptoFlujoCaja(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoconceptoflujocaja);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoconceptoflujocaja);				
			
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			
			if(this.tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoConceptoFlujoCaja: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoConceptoFlujoCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoConceptoFlujoCaja> tipoconceptoflujocajasSeleccionados=new ArrayList<TipoConceptoFlujoCaja>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoConceptoFlujoCaja.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoConceptoFlujoCaja.getSelectedRows().length;			
			}
			
			tipoconceptoflujocajasSeleccionados=this.getTipoConceptoFlujoCajasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoConceptoFlujoCaja--;			
				//TipoConceptoFlujoCaja tipoconceptoflujocajaAux= new TipoConceptoFlujoCaja();			
				//tipoconceptoflujocajaAux.setId(this.iIdNuevoTipoConceptoFlujoCaja);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoConceptoFlujoCaja tipoconceptoflujocajaOrigen=new TipoConceptoFlujoCaja();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoConceptoFlujoCaja tipoconceptoflujocajaOrigen : tipoconceptoflujocajasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoconceptoflujocajaOrigen =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconceptoflujocajaOrigen =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoConceptoFlujoCaja();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoconceptoflujocaja.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoConceptoFlujoCaja(tipoconceptoflujocajaOrigen,this.tipoconceptoflujocaja,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().add(this.tipoconceptoflujocajaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoconceptoflujocajas.add(this.tipoconceptoflujocajaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja(false);
				
				this.jTableDatosTipoConceptoFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoTipoConceptoFlujoCaja(), this.getIndiceNuevoTipoConceptoFlujoCaja());
				
				int iLastRow =  this.jTableDatosTipoConceptoFlujoCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoConceptoFlujoCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoConceptoFlujoCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoConceptoFlujoCaja> tipoconceptoflujocajasSeleccionados=new ArrayList<TipoConceptoFlujoCaja>();									
		
			TipoConceptoFlujoCaja tipoconceptoflujocajaOrigen=new TipoConceptoFlujoCaja();
			TipoConceptoFlujoCaja tipoconceptoflujocajaDestino=new TipoConceptoFlujoCaja();
				
			tipoconceptoflujocajasSeleccionados=this.getTipoConceptoFlujoCajasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoConceptoFlujoCaja.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoconceptoflujocajasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoConceptoFlujoCaja.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconceptoflujocajaOrigen =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoconceptoflujocajaOrigen =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconceptoflujocajaDestino =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoconceptoflujocajaDestino =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoconceptoflujocajaOrigen =tipoconceptoflujocajasSeleccionados.get(0);
				tipoconceptoflujocajaDestino =tipoconceptoflujocajasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoConceptoFlujoCaja(tipoconceptoflujocajaOrigen,tipoconceptoflujocajaDestino,true,false);
				
				tipoconceptoflujocajaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoconceptoflujocajaDestino,tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoconceptoflujocajaDestino,tipoconceptoflujocajas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja(false);
				
				//this.jTableDatosTipoConceptoFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoTipoConceptoFlujoCaja(), this.getIndiceNuevoTipoConceptoFlujoCaja());
				
				int iLastRow =  this.jTableDatosTipoConceptoFlujoCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoConceptoFlujoCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoConceptoFlujoCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoConceptoFlujoCaja.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoConceptoFlujoCaja.setVisible(!isVisible);
			this.jPanelPaginacionTipoConceptoFlujoCaja.setVisible(!isVisible);
			this.jPanelAccionesTipoConceptoFlujoCaja.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoConceptoFlujoCaja();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoConceptoFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoConceptoFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoConceptoFlujoCaja();
			
			this.abrirFrameOrderByTipoConceptoFlujoCaja();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoConceptoFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoConceptoFlujoCaja(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoConceptoFlujoCaja);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.isMaximum()) {
					this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.setSize(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.iWidthFormulario,this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.isMaximum()) {
						this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jContentPaneDetalleTipoConceptoFlujoCaja.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTabbedPaneRelacionesTipoConceptoFlujoCaja.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jContentPaneDetalleTipoConceptoFlujoCaja.getWidth(),TipoConceptoFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTabbedPaneRelacionesTipoConceptoFlujoCaja.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jContentPaneDetalleTipoConceptoFlujoCaja.getWidth(),TipoConceptoFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTabbedPaneRelacionesTipoConceptoFlujoCaja.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jContentPaneDetalleTipoConceptoFlujoCaja.getWidth(),TipoConceptoFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.setVisible(true);
	        this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoConceptoFlujoCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoConceptoFlujoCaja==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoConceptoFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoConceptoFlujoCaja,false,this);
				} else {
					this.jInternalFrameOrderByTipoConceptoFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoConceptoFlujoCaja,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoConceptoFlujoCaja);
				this.jInternalFrameOrderByTipoConceptoFlujoCaja.setVisible(false);
				this.jInternalFrameOrderByTipoConceptoFlujoCaja.setSelected(false);
				
				this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoConceptoFlujoCaja"));
				
				this.inicializarActualizarBindingTablaOrderByTipoConceptoFlujoCaja();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoConceptoFlujoCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoConceptoFlujoCaja==null) {
				
				this.jInternalFrameImportacionTipoConceptoFlujoCaja=new ImportacionJInternalFrame(TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoConceptoFlujoCaja);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoConceptoFlujoCaja);
				this.jInternalFrameImportacionTipoConceptoFlujoCaja.setVisible(false);
				this.jInternalFrameImportacionTipoConceptoFlujoCaja.setSelected(false);


				this.jInternalFrameImportacionTipoConceptoFlujoCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoConceptoFlujoCaja"));
				this.jInternalFrameImportacionTipoConceptoFlujoCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoConceptoFlujoCaja"));
				this.jInternalFrameImportacionTipoConceptoFlujoCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoConceptoFlujoCaja"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoConceptoFlujoCaja() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja==null) {
				this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja=new ReporteDinamicoJInternalFrame(TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja);
				this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoConceptoFlujoCaja"));
				this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoConceptoFlujoCaja"));
				this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoConceptoFlujoCaja"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoConceptoFlujoCaja();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoConceptoFlujoCaja() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoConceptoFlujoCaja);
			
	       	this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.setVisible(false);
	        this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.dispose();
			//this.jInternalFrameDetalleFormTipoConceptoFlujoCaja=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoConceptoFlujoCaja() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoConceptoFlujoCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoConceptoFlujoCaja.setVisible(true);
	        this.jInternalFrameImportacionTipoConceptoFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoConceptoFlujoCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.setVisible(true);
	        this.jInternalFrameOrderByTipoConceptoFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoConceptoFlujoCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoConceptoFlujoCaja.setVisible(false);
	        this.jInternalFrameOrderByTipoConceptoFlujoCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoConceptoFlujoCaja() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoConceptoFlujoCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoConceptoFlujoCaja.setVisible(false);
	        this.jInternalFrameImportacionTipoConceptoFlujoCaja.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoConceptoFlujoCaja(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoConceptoFlujoCaja(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoConceptoFlujoCaja(true);
			//this.isEsNuevoTipoConceptoFlujoCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoConceptoFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoConceptoFlujoCaja(false) ;
			
			if(tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoConceptoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoConceptoFlujoCaja(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoConceptoFlujoCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoConceptoFlujoCajaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoConceptoFlujoCaja(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoConceptoFlujoCaja(true);
			//this.isEsNuevoTipoConceptoFlujoCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoconceptoflujocaja.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoConceptoFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoConceptoFlujoCaja(false) ;
			
			if(TipoConceptoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoConceptoFlujoCaja(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoConceptoFlujoCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoConceptoFlujoCaja(false);
			
			//if(!this.isEsNuevoTipoConceptoFlujoCaja) {								
				int intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(this.tipoconceptoflujocaja,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
				
			}
			
			if(this.permiteMantenimiento(this.tipoconceptoflujocaja)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoConceptoFlujoCaja=true;
					this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja(false);
					this.isEsNuevoTipoConceptoFlujoCaja=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoConceptoFlujoCaja=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoConceptoFlujoCaja=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoConceptoFlujoCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoConceptoFlujoCaja(false);
				
				this.habilitarDeshabilitarControlesTipoConceptoFlujoCaja(false);
			
												
				
				if(TipoConceptoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoConceptoFlujoCaja();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,tipoconceptoflujocajaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoConceptoFlujoCaja(this.tipoconceptoflujocaja,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoConceptoFlujoCaja.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoconceptoflujocajaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoconceptoflujocaja.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoConceptoFlujoCaja.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConceptoFlujoCaja.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				this.tipoconceptoflujocaja.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				this.tipoconceptoflujocaja.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoconceptoflujocaja)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoConceptoFlujoCajaModel) this.jTableDatosTipoConceptoFlujoCaja.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoConceptoFlujoCaja=true;
				this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja(false);
				this.isEsNuevoTipoConceptoFlujoCaja=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoConceptoFlujoCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoConceptoFlujoCaja(false);
				
				this.habilitarDeshabilitarControlesTipoConceptoFlujoCaja(false);
				
				
				
				if(TipoConceptoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoConceptoFlujoCaja();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoConceptoFlujoCaja.getRowCount()>=1) {
				jTableDatosTipoConceptoFlujoCaja.removeRowSelectionInterval(0, jTableDatosTipoConceptoFlujoCaja.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoConceptoFlujoCaja(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoConceptoFlujoCaja(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoConceptoFlujoCaja(false) ;
			
			this.isEsNuevoTipoConceptoFlujoCaja=false;
			
			if(TipoConceptoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoConceptoFlujoCaja();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoConceptoFlujoCaja(false);
				
				//SI ES MANUAL
				if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoConceptoFlujoCaja();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoConceptoFlujoCaja--;			
			//TipoConceptoFlujoCaja tipoconceptoflujocajaAux= new TipoConceptoFlujoCaja();			
			//tipoconceptoflujocajaAux.setId(this.iIdNuevoTipoConceptoFlujoCaja);
			
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoConceptoFlujoCaja();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
			
			this.tipoconceptoflujocaja.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().add(this.tipoconceptoflujocajaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoconceptoflujocajas.add(this.tipoconceptoflujocajaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja(false);
			
			this.jTableDatosTipoConceptoFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoTipoConceptoFlujoCaja(), this.getIndiceNuevoTipoConceptoFlujoCaja());
			
			int iLastRow =  this.jTableDatosTipoConceptoFlujoCaja.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoConceptoFlujoCaja.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoConceptoFlujoCaja.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false);
			
			//SI ES MANUAL
			if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoConceptoFlujoCaja();
			}
			
			//this.abrirFrameTreeTipoConceptoFlujoCaja();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Concepto Flujo CajaS ?", "MANTENIMIENTO DE Tipo Concepto Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoConceptoFlujoCaja.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoConceptoFlujoCaja();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoconceptoflujocajaReturnGeneral=tipoconceptoflujocajaLogic.procesarImportacionTipoConceptoFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoconceptoflujocajaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoConceptoFlujoCajaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoConceptoFlujoCaja.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoConceptoFlujoCaja.setFileImportacion(this.jInternalFrameImportacionTipoConceptoFlujoCaja.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoConceptoFlujoCaja.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoConceptoFlujoCaja.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoConceptoFlujoCaja.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoConceptoFlujoCaja.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoConceptoFlujoCaja> tipoconceptoflujocajasSeleccionados=new ArrayList<TipoConceptoFlujoCaja>();		

		tipoconceptoflujocajasSeleccionados=this.getTipoConceptoFlujoCajasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoConceptoFlujoCajaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoConceptoFlujoCajaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoConceptoFlujoCajas("Todos",tipoconceptoflujocajasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Concepto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoConceptoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoConceptoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoConceptoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoConceptoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoConceptoFlujoCaja> tipoconceptoflujocajasSeleccionados=new ArrayList<TipoConceptoFlujoCaja>();		
		
		tipoconceptoflujocajasSeleccionados=this.getTipoConceptoFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconceptoflujocaja";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoConceptoFlujoCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoConceptoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoConceptoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoConceptoFlujoCaja tipoconceptoflujocaja:tipoconceptoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoconceptoflujocaja.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoConceptoFlujoCaja tipoconceptoflujocaja:tipoconceptoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoconceptoflujocaja.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoConceptoFlujoCaja tipoconceptoflujocaja:tipoconceptoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoconceptoflujocaja.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoConceptoFlujoCaja(row);				
			//	iRow++;
			//}				
			
			//for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:tipoconceptoflujocajasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoConceptoFlujoCaja(tipoconceptoflujocajaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Concepto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false);
			
			//SI ES MANUAL
			if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoConceptoFlujoCaja();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false);
			
			//SI ES MANUAL
			if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoConceptoFlujoCaja();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false);
			
			//SI ES MANUAL
			if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoConceptoFlujoCaja();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoConceptoFlujoCaja() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoConceptoFlujoCaja.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoConceptoFlujoCaja.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoConceptoFlujoCaja.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoConceptoFlujoCaja.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoConceptoFlujoCaja.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoConceptoFlujoCaja.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoConceptoFlujoCaja.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoConceptoFlujoCaja(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoConceptoFlujoCaja(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoConceptoFlujoCaja(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoConceptoFlujoCaja(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoConceptoFlujoCaja(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoConceptoFlujoCaja(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoConceptoFlujoCaja(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoConceptoFlujoCaja() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja();
		
		this.inicializarActualizarBindingBotonesManualTipoConceptoFlujoCaja(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoConceptoFlujoCaja();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoConceptoFlujoCaja() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoConceptoFlujoCaja(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoConceptoFlujoCaja(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoConceptoFlujoCaja.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoConceptoFlujoCaja.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jCheckBoxPostAccionNuevoTipoConceptoFlujoCaja.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jCheckBoxPostAccionSinCerrarTipoConceptoFlujoCaja.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jCheckBoxPostAccionSinMensajeTipoConceptoFlujoCaja.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoConceptoFlujoCaja.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoConceptoFlujoCaja.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
				this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jCheckBoxPostAccionNuevoTipoConceptoFlujoCaja.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jCheckBoxPostAccionSinCerrarTipoConceptoFlujoCaja.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jCheckBoxPostAccionSinMensajeTipoConceptoFlujoCaja.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoConceptoFlujoCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoConceptoFlujoCaja.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoConceptoFlujoCaja.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoConceptoFlujoCaja.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoConceptoFlujoCaja(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoConceptoFlujoCaja(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoConceptoFlujoCaja() throws Exception {
		try	{
			if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoConceptoFlujoCaja();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoConceptoFlujoCaja() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoConceptoFlujoCaja() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoConceptoFlujoCaja.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoConceptoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoConceptoFlujoCaja.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoConceptoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoConceptoFlujoCaja.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja.addItem(reporte);
			}
			
			
			if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoConceptoFlujoCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoConceptoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoConceptoFlujoCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoConceptoFlujoCaja();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoConceptoFlujoCaja() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoConceptoFlujoCaja()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoConceptoFlujoCaja.getText();
		//this.idBusquedaPorId=Long.parseLong(this.jLabelidTipoConceptoFlujoCajaBusquedaPorId.getText());
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoConceptoFlujoCaja.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoConceptoFlujoCaja(Boolean esInicializar) throws Exception {				
		if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoConceptoFlujoCaja();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoConceptoFlujoCaja() throws Exception {
		this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoConceptoFlujoCaja() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoConceptoFlujoCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoConceptoFlujoCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoConceptoFlujoCajaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConceptoFlujoCajaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoConceptoFlujoCajaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoConceptoFlujoCajaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoConceptoFlujoCaja(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoconceptoflujocajas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoConceptoFlujoCaja.setModel(new TipoConceptoFlujoCajaModel(this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoConceptoFlujoCaja.setModel(new TipoConceptoFlujoCajaModel(this.tipoconceptoflujocajas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoConceptoFlujoCaja!=null && this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoConceptoFlujoCaja();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoConceptoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConceptoFlujoCaja,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoConceptoFlujoCajaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,tipoconceptoflujocajaConstantesFunciones.resaltarSeleccionarTipoConceptoFlujoCaja,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoConceptoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,tipoconceptoflujocajaConstantesFunciones.resaltarSeleccionarTipoConceptoFlujoCaja,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoConceptoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConceptoFlujoCaja,TipoConceptoFlujoCajaConstantesFunciones.LABEL_ID));

		if(this.tipoconceptoflujocajaConstantesFunciones.mostraridTipoConceptoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoConceptoFlujoCajaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoconceptoflujocajaConstantesFunciones.resaltaridTipoConceptoFlujoCaja,this.tipoconceptoflujocajaConstantesFunciones.activaridTipoConceptoFlujoCaja,this,true,"idTipoConceptoFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoconceptoflujocajaConstantesFunciones.resaltaridTipoConceptoFlujoCaja,this.tipoconceptoflujocajaConstantesFunciones.activaridTipoConceptoFlujoCaja,this,true,"idTipoConceptoFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoConceptoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConceptoFlujoCaja,TipoConceptoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoconceptoflujocajaConstantesFunciones.mostrarid_empresaTipoConceptoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoConceptoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoconceptoflujocajaConstantesFunciones.resaltarid_empresaTipoConceptoFlujoCaja,this,this.tipoconceptoflujocajaConstantesFunciones.activarid_empresaTipoConceptoFlujoCaja));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoconceptoflujocajaConstantesFunciones.resaltarid_empresaTipoConceptoFlujoCaja,this,this.tipoconceptoflujocajaConstantesFunciones.activarid_empresaTipoConceptoFlujoCaja,false,"id_empresaTipoConceptoFlujoCaja","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoConceptoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoConceptoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConceptoFlujoCaja,TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO));

		if(this.tipoconceptoflujocajaConstantesFunciones.mostrarcodigoTipoConceptoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoconceptoflujocajaConstantesFunciones.resaltarcodigoTipoConceptoFlujoCaja,this.tipoconceptoflujocajaConstantesFunciones.activarcodigoTipoConceptoFlujoCaja,this,true,"codigoTipoConceptoFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoconceptoflujocajaConstantesFunciones.resaltarcodigoTipoConceptoFlujoCaja,this.tipoconceptoflujocajaConstantesFunciones.activarcodigoTipoConceptoFlujoCaja,this,true,"codigoTipoConceptoFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoConceptoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoConceptoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConceptoFlujoCaja,TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoconceptoflujocajaConstantesFunciones.mostrarnombreTipoConceptoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoconceptoflujocajaConstantesFunciones.resaltarnombreTipoConceptoFlujoCaja,this.tipoconceptoflujocajaConstantesFunciones.activarnombreTipoConceptoFlujoCaja,this,true,"nombreTipoConceptoFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoconceptoflujocajaConstantesFunciones.resaltarnombreTipoConceptoFlujoCaja,this.tipoconceptoflujocajaConstantesFunciones.activarnombreTipoConceptoFlujoCaja,this,true,"nombreTipoConceptoFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoConceptoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoConceptoFlujoCaja.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoConceptoFlujoCaja.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoConceptoFlujoCaja && this.isPermisoGuardarCambiosTipoConceptoFlujoCaja) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoConceptoFlujoCaja.addColumn(tableColumn);
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
			
			this.jTableDatosTipoConceptoFlujoCaja.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoConceptoFlujoCaja && this.isPermisoGuardarCambiosTipoConceptoFlujoCaja) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoConceptoFlujoCaja && this.isPermisoGuardarCambiosTipoConceptoFlujoCaja) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoConceptoFlujoCaja.moveColumn(this.jTableDatosTipoConceptoFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoConceptoFlujoCaja.moveColumn(this.jTableDatosTipoConceptoFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoConceptoFlujoCaja.moveColumn(this.jTableDatosTipoConceptoFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoConceptoFlujoCaja.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoConceptoFlujoCaja.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoConceptoFlujoCaja,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoConceptoFlujoCaja.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoConceptoFlujoCaja.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoConceptoFlujoCaja.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoConceptoFlujoCaja.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoConceptoFlujoCaja.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoconceptoflujocajas.size()-1;
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
		//this.jTableDatosTipoConceptoFlujoCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoConceptoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoConceptoFlujoCaja();
			
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
				
				//this.isEsNuevoTipoConceptoFlujoCaja=false;
					
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			
				if(this.tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoConceptoFlujoCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoconceptoflujocaja.getsType().equals("DUPLICADO")
				   || this.tipoconceptoflujocaja.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoConceptoFlujoCaja=true;
				
				} else {
					this.isEsNuevoTipoConceptoFlujoCaja=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoconceptoflujocaja.getId()>=0 && !this.tipoconceptoflujocaja.getIsNew()) {						
						this.isEsNuevoTipoConceptoFlujoCaja=false;
						
					} else {
						this.isEsNuevoTipoConceptoFlujoCaja=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoConceptoFlujoCaja(esRelaciones);						
				
				this.seleccionarTipoConceptoFlujoCaja(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoconceptoflujocaja.getId()<0) {
					this.isEsNuevoTipoConceptoFlujoCaja=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoConceptoFlujoCaja(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoConceptoFlujoCaja(evt,rowIndex);
				}	
				
				if(this.tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoConceptoFlujoCaja: " + this.dDif); 
					}
				}								
				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoConceptoFlujoCaja(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoconceptoflujocaja)) {
					if(this.tipoconceptoflujocaja.getId()>0) {
						this.tipoconceptoflujocaja.setIsDeleted(true);
						
						this.tipoconceptoflujocajasEliminados.add(this.tipoconceptoflujocaja);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().remove(this.tipoconceptoflujocaja);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoconceptoflujocajas.remove(this.tipoconceptoflujocaja);				
					}
					
					
					((TipoConceptoFlujoCajaModel) this.jTableDatosTipoConceptoFlujoCaja.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoConceptoFlujoCaja(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoConceptoFlujoCaja) {
			
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoConceptoFlujoCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoconceptoflujocajaConstantesFunciones.cargarid_empresaTipoConceptoFlujoCaja || this.tipoconceptoflujocajaConstantesFunciones.event_dependid_empresaTipoConceptoFlujoCaja) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoconceptoflujocaja.getid_empresa());
									//this.inicializarActualizarBindingTipoConceptoFlujoCaja(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoconceptoflujocaja.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoconceptoflujocaja.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoconceptoflujocaja.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoConceptoFlujoCaja("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoConceptoFlujoCaja(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoConceptoFlujoCaja() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocaja) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoConceptoFlujoCaja(tipoconceptoflujocaja,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocaja,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoConceptoFlujoCaja(tipoconceptoflujocaja);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoConceptoFlujoCaja(tipoconceptoflujocaja,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoConceptoFlujoCaja(tipoconceptoflujocaja);
	}
	
	public void setVariablesObjetoActualToFormularioTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocaja) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelidTipoConceptoFlujoCaja.setText(tipoconceptoflujocaja.getId().toString());
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTextFieldcodigoTipoConceptoFlujoCaja.setText(tipoconceptoflujocaja.getcodigo());
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTextAreanombreTipoConceptoFlujoCaja.setText(tipoconceptoflujocaja.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoConceptoFlujoCaja tipoconceptoflujocajaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoconceptoflujocajaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoConceptoFlujoCaja tipoconceptoflujocajaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoconceptoflujocajaLocal=this.tipoconceptoflujocaja;
			} else {
				tipoconceptoflujocajaLocal=this.tipoconceptoflujocajaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoconceptoflujocajaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoConceptoFlujoCaja(tipoconceptoflujocajaLocal,true);
					
					if(tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoconceptoflujocajaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoconceptoflujocajaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(tipoconceptoflujocaja,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(tipoconceptoflujocaja);
	}
	
	public void setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(tipoconceptoflujocaja,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocaja,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelidTipoConceptoFlujoCaja.getText()==null || this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelidTipoConceptoFlujoCaja.getText()=="" || this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelidTipoConceptoFlujoCaja.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelidTipoConceptoFlujoCaja.setText("0");
			}

			if(conColumnasBase) {tipoconceptoflujocaja.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelidTipoConceptoFlujoCaja.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoConceptoFlujoCajaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelIdTipoConceptoFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoconceptoflujocaja.setcodigo(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTextFieldcodigoTipoConceptoFlujoCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelcodigoTipoConceptoFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoconceptoflujocaja.setnombre(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTextAreanombreTipoConceptoFlujoCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelnombreTipoConceptoFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocajaBean,TipoConceptoFlujoCaja tipoconceptoflujocaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocajaOrigen,TipoConceptoFlujoCaja tipoconceptoflujocaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoconceptoflujocajaOrigen.getId()!=null && !tipoconceptoflujocajaOrigen.getId().equals(0L))) {tipoconceptoflujocaja.setId(tipoconceptoflujocajaOrigen.getId());}}
			if(conDefault || (!conDefault && tipoconceptoflujocajaOrigen.getcodigo()!=null && !tipoconceptoflujocajaOrigen.getcodigo().equals(""))) {tipoconceptoflujocaja.setcodigo(tipoconceptoflujocajaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoconceptoflujocajaOrigen.getnombre()!=null && !tipoconceptoflujocajaOrigen.getnombre().equals(""))) {tipoconceptoflujocaja.setnombre(tipoconceptoflujocajaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocaja) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelidTipoConceptoFlujoCaja.setText(tipoconceptoflujocaja.getId().toString());
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTextFieldcodigoTipoConceptoFlujoCaja.setText(tipoconceptoflujocaja.getcodigo());
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTextAreanombreTipoConceptoFlujoCaja.setText(tipoconceptoflujocaja.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoConceptoFlujoCaja(TipoConceptoFlujoCajaBean tipoconceptoflujocajaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelidTipoConceptoFlujoCaja.setText(tipoconceptoflujocajaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTextFieldcodigoTipoConceptoFlujoCaja.setText(tipoconceptoflujocajaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTextAreanombreTipoConceptoFlujoCaja.setText(tipoconceptoflujocajaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoConceptoFlujoCaja(TipoConceptoFlujoCajaParameterReturnGeneral tipoconceptoflujocajaReturnGeneral,TipoConceptoFlujoCajaBean tipoconceptoflujocajaBean,Boolean conDefault) throws Exception { 
		try {
			TipoConceptoFlujoCaja tipoconceptoflujocajaLocal=new TipoConceptoFlujoCaja();
			
			tipoconceptoflujocajaLocal=tipoconceptoflujocajaReturnGeneral.getTipoConceptoFlujoCaja();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoconceptoflujocajaLocal.getId()!=null && !tipoconceptoflujocajaLocal.getId().equals(0L))) {tipoconceptoflujocajaBean.setId(tipoconceptoflujocajaLocal.getId());}}
			if(conDefault || (!conDefault && tipoconceptoflujocajaLocal.getcodigo()!=null && !tipoconceptoflujocajaLocal.getcodigo().equals(""))) {tipoconceptoflujocajaBean.setcodigo(tipoconceptoflujocajaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoconceptoflujocajaLocal.getnombre()!=null && !tipoconceptoflujocajaLocal.getnombre().equals(""))) {tipoconceptoflujocajaBean.setnombre(tipoconceptoflujocajaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoConceptoFlujoCajaGenerico(Long idTipoConceptoFlujoCajaSeleccionado,JComboBox jComboBoxTipoConceptoFlujoCaja,List<TipoConceptoFlujoCaja> tipoconceptoflujocajasLocal)throws Exception {
		try {
			TipoConceptoFlujoCaja  tipoconceptoflujocajaTemp=null;

			for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:tipoconceptoflujocajasLocal) {
				if(tipoconceptoflujocajaAux.getId()!=null && tipoconceptoflujocajaAux.getId().equals(idTipoConceptoFlujoCajaSeleccionado)) {
					tipoconceptoflujocajaTemp=tipoconceptoflujocajaAux;
					break;
				}
			}

			jComboBoxTipoConceptoFlujoCaja.setSelectedItem(tipoconceptoflujocajaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoConceptoFlujoCajaGenerico(JComboBox jComboBoxTipoConceptoFlujoCaja,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoConceptoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoConceptoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoConceptoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoConceptoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoConceptoFlujoCaja.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoConceptoFlujoCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoConceptoFlujoCaja.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoConceptoFlujoCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoConceptoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoConceptoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoconceptoflujocaja=(TipoConceptoFlujoCaja) tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoconceptoflujocaja =(TipoConceptoFlujoCaja) tipoconceptoflujocajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoconceptoflujocaja.getIsNew() && !tipoconceptoflujocaja.getIsChanged() && !tipoconceptoflujocaja.getIsDeleted()) {
				sDescripcion=tipoconceptoflujocaja.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoconceptoflujocaja.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoConceptoFlujoCaja tipoconceptoflujocajaRow=new TipoConceptoFlujoCaja();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoconceptoflujocajaRow=(TipoConceptoFlujoCaja) tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoconceptoflujocajaRow=(TipoConceptoFlujoCaja) tipoconceptoflujocajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoConceptoFlujoCaja(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja && this.isPermisoNuevoTipoConceptoFlujoCaja));			
			this.jButtonDuplicarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarTipoConceptoFlujoCaja && this.isPermisoDuplicarTipoConceptoFlujoCaja));			
			this.jButtonCopiarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarTipoConceptoFlujoCaja && this.isPermisoCopiarTipoConceptoFlujoCaja));
			this.jButtonVerFormTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormTipoConceptoFlujoCaja && this.isPermisoVerFormTipoConceptoFlujoCaja));
			
			this.jButtonAbrirOrderByTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoConceptoFlujoCaja && this.isPermisoOrdenTipoConceptoFlujoCaja));			
			
			this.jButtonNuevoRelacionesTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja && this.isPermisoNuevoTipoConceptoFlujoCaja));			
			this.jButtonNuevoGuardarCambiosTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja && this.isPermisoNuevoTipoConceptoFlujoCaja && this.isPermisoGuardarCambiosTipoConceptoFlujoCaja));
			
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonModificarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaModificarTipoConceptoFlujoCaja && this.isPermisoActualizarTipoConceptoFlujoCaja));	
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonActualizarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarTipoConceptoFlujoCaja && this.isPermisoActualizarTipoConceptoFlujoCaja));	
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonEliminarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarTipoConceptoFlujoCaja && this.isPermisoEliminarTipoConceptoFlujoCaja));
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonCancelarTipoConceptoFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja);							
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonGuardarCambiosTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja && this.isPermisoGuardarCambiosTipoConceptoFlujoCaja));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja && this.isPermisoGuardarCambiosTipoConceptoFlujoCaja));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja && this.isPermisoNuevoTipoConceptoFlujoCaja));						
			this.jButtonDuplicarToolBarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarTipoConceptoFlujoCaja && this.isPermisoDuplicarTipoConceptoFlujoCaja));						
			this.jButtonCopiarToolBarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarTipoConceptoFlujoCaja && this.isPermisoCopiarTipoConceptoFlujoCaja));			
			this.jButtonVerFormToolBarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormTipoConceptoFlujoCaja && this.isPermisoVerFormTipoConceptoFlujoCaja));			
			this.jButtonAbrirOrderByToolBarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoConceptoFlujoCaja && this.isPermisoOrdenTipoConceptoFlujoCaja));
			this.jButtonNuevoRelacionesToolBarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja && this.isPermisoNuevoTipoConceptoFlujoCaja));			
			this.jButtonNuevoGuardarCambiosToolBarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja && this.isPermisoNuevoTipoConceptoFlujoCaja && this.isPermisoGuardarCambiosTipoConceptoFlujoCaja));			
			
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonModificarToolBarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaModificarTipoConceptoFlujoCaja && this.isPermisoActualizarTipoConceptoFlujoCaja));	
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonActualizarToolBarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarTipoConceptoFlujoCaja  && this.isPermisoActualizarTipoConceptoFlujoCaja));	
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonEliminarToolBarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarTipoConceptoFlujoCaja && this.isPermisoEliminarTipoConceptoFlujoCaja));
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonCancelarToolBarTipoConceptoFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja);				
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonGuardarCambiosToolBarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja && this.isPermisoGuardarCambiosTipoConceptoFlujoCaja));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja && this.isPermisoGuardarCambiosTipoConceptoFlujoCaja));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja && this.isPermisoNuevoTipoConceptoFlujoCaja));			
			this.jMenuItemDuplicarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarTipoConceptoFlujoCaja && this.isPermisoDuplicarTipoConceptoFlujoCaja));			
			this.jMenuItemCopiarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarTipoConceptoFlujoCaja && this.isPermisoCopiarTipoConceptoFlujoCaja));			
			this.jMenuItemVerFormTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormTipoConceptoFlujoCaja && this.isPermisoVerFormTipoConceptoFlujoCaja));			
			this.jMenuItemAbrirOrderByTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoConceptoFlujoCaja && this.isPermisoOrdenTipoConceptoFlujoCaja));			
			//this.jMenuItemMostrarOcultarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoConceptoFlujoCaja && this.isPermisoOrdenTipoConceptoFlujoCaja));
			this.jMenuItemDetalleAbrirOrderByTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoConceptoFlujoCaja && this.isPermisoOrdenTipoConceptoFlujoCaja));			
			//this.jMenuItemDetalleMostrarOcultarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoConceptoFlujoCaja && this.isPermisoOrdenTipoConceptoFlujoCaja));			
			this.jMenuItemNuevoRelacionesTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja && this.isPermisoNuevoTipoConceptoFlujoCaja));			
			this.jMenuItemNuevoGuardarCambiosTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja && this.isPermisoNuevoTipoConceptoFlujoCaja && this.isPermisoGuardarCambiosTipoConceptoFlujoCaja));									
			
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemModificarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaModificarTipoConceptoFlujoCaja && this.isPermisoActualizarTipoConceptoFlujoCaja));	
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemActualizarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarTipoConceptoFlujoCaja && this.isPermisoActualizarTipoConceptoFlujoCaja));	
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemEliminarTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarTipoConceptoFlujoCaja && this.isPermisoEliminarTipoConceptoFlujoCaja));
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemCancelarTipoConceptoFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja);				
			}
			
			this.jMenuItemGuardarCambiosTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja && this.isPermisoGuardarCambiosTipoConceptoFlujoCaja));						
			this.jMenuItemGuardarCambiosTablaTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja && this.isPermisoGuardarCambiosTipoConceptoFlujoCaja));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja=this.jButtonNuevoTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaDuplicarTipoConceptoFlujoCaja=this.jButtonDuplicarTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaCopiarTipoConceptoFlujoCaja=this.jButtonCopiarTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaVerFormTipoConceptoFlujoCaja=this.jButtonVerFormTipoConceptoFlujoCaja.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoConceptoFlujoCaja=this.jButtonAbrirOrderByTipoConceptoFlujoCaja.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja=this.jButtonNuevoRelacionesTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaModificarTipoConceptoFlujoCaja=this.jButtonModificarTipoConceptoFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
			this.isVisibilidadCeldaActualizarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonActualizarTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonEliminarTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonCancelarTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonGuardarCambiosTipoConceptoFlujoCaja.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja=this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja=this.jButtonNuevoToolBarTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja=this.jButtonNuevoRelacionesToolBarTipoConceptoFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
			this.isVisibilidadCeldaModificarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonModificarToolBarTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaActualizarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonActualizarToolBarTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonEliminarToolBarTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonCancelarToolBarTipoConceptoFlujoCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=this.jButtonGuardarCambiosToolBarTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja=this.jButtonGuardarCambiosTablaToolBarTipoConceptoFlujoCaja.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja=this.jMenuItemNuevoTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja=this.jMenuItemNuevoRelacionesTipoConceptoFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
			this.isVisibilidadCeldaModificarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemModificarTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaActualizarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemActualizarTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemEliminarTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja=this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemCancelarTipoConceptoFlujoCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=this.jMenuItemGuardarCambiosTipoConceptoFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja=this.jMenuItemGuardarCambiosTablaTipoConceptoFlujoCaja.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoConceptoFlujoCaja(Boolean esInicializar) {
		if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoConceptoFlujoCaja();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoConceptoFlujoCaja(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoConceptoFlujoCaja() {
		this.jButtonNuevoTipoConceptoFlujoCaja.setVisible(this.isPermisoNuevoTipoConceptoFlujoCaja);			
		this.jButtonDuplicarTipoConceptoFlujoCaja.setVisible(this.isPermisoDuplicarTipoConceptoFlujoCaja);			
		this.jButtonCopiarTipoConceptoFlujoCaja.setVisible(this.isPermisoCopiarTipoConceptoFlujoCaja);			
		this.jButtonVerFormTipoConceptoFlujoCaja.setVisible(this.isPermisoVerFormTipoConceptoFlujoCaja);			
		
		this.jButtonAbrirOrderByTipoConceptoFlujoCaja.setVisible(this.isPermisoOrdenTipoConceptoFlujoCaja);					
		
		this.jButtonNuevoRelacionesTipoConceptoFlujoCaja.setVisible(this.isPermisoNuevoTipoConceptoFlujoCaja);			
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonModificarTipoConceptoFlujoCaja.setVisible(this.isPermisoActualizarTipoConceptoFlujoCaja);	
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonActualizarTipoConceptoFlujoCaja.setVisible(this.isPermisoActualizarTipoConceptoFlujoCaja);	
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonEliminarTipoConceptoFlujoCaja.setVisible(this.isPermisoEliminarTipoConceptoFlujoCaja);
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonCancelarTipoConceptoFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja);						
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonGuardarCambiosTipoConceptoFlujoCaja.setVisible(this.isPermisoGuardarCambiosTipoConceptoFlujoCaja);							
		}
		
		this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja.setVisible(this.isPermisoActualizarTipoConceptoFlujoCaja);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoConceptoFlujoCaja() {
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonModificarTipoConceptoFlujoCaja.setVisible(this.isPermisoActualizarTipoConceptoFlujoCaja);	
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonActualizarTipoConceptoFlujoCaja.setVisible(this.isPermisoActualizarTipoConceptoFlujoCaja);	
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonEliminarTipoConceptoFlujoCaja.setVisible(this.isPermisoEliminarTipoConceptoFlujoCaja);
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonCancelarTipoConceptoFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja);							
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonGuardarCambiosTipoConceptoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja && this.isPermisoGuardarCambiosTipoConceptoFlujoCaja));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoConceptoFlujoCaja() {
		if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoConceptoFlujoCaja();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoConceptoFlujoCaja() {
	}
	
	public void jTableDatosTipoConceptoFlujoCajaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoConceptoFlujoCaja(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoConceptoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(this.gettipoconceptoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoconceptoflujocaja==null) {
						this.tipoconceptoflujocaja = new TipoConceptoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(this.tipoconceptoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
				}

				if(this.tipoconceptoflujocaja.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoconceptoflujocaja.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoConceptoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoConceptoFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoConceptoFlujoCaja(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoConceptoFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoConceptoFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(this.gettipoconceptoflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoconceptoflujocajaLogic.getConnexion());

				if(this.tipoconceptoflujocaja.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoconceptoflujocaja.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoConceptoFlujoCaja=(TitledBorder)this.jScrollPanelDatosTipoConceptoFlujoCaja.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoConceptoFlujoCaja.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoConceptoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(this.gettipoconceptoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoconceptoflujocaja==null) {
						this.tipoconceptoflujocaja = new TipoConceptoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(this.tipoconceptoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
				}

				if(this.tipoconceptoflujocaja.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoconceptoflujocaja.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoConceptoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoConceptoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(this.gettipoconceptoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoconceptoflujocaja==null) {
						this.tipoconceptoflujocaja = new TipoConceptoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(this.tipoconceptoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
				}

				if(this.tipoconceptoflujocaja.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoconceptoflujocaja.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoConceptoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoConceptoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(this.gettipoconceptoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoconceptoflujocaja==null) {
						this.tipoconceptoflujocaja = new TipoConceptoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(this.tipoconceptoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);
				}

				if(this.tipoconceptoflujocaja.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoconceptoflujocaja.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoConceptoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false,false);

			this.getTipoConceptoFlujoCajasBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false);

			//if(TipoConceptoFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoConceptoFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorIdTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false,false);

			this.getTipoConceptoFlujoCajasBusquedaPorId();

			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false);

			//if(TipoConceptoFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoConceptoFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false,false);

			this.getTipoConceptoFlujoCajasBusquedaPorNombre();

			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false);

			//if(TipoConceptoFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoConceptoFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoConceptoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false,false);

			this.getTipoConceptoFlujoCajasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false);

			//if(TipoConceptoFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoConceptoFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconceptoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoConceptoFlujoCaja() {
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.dispose();
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja!=null) {
			this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.dispose();
			this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja=null;
		}
		
		if(this.jInternalFrameImportacionTipoConceptoFlujoCaja!=null) {
			this.jInternalFrameImportacionTipoConceptoFlujoCaja.setVisible(false);	    			
			this.jInternalFrameImportacionTipoConceptoFlujoCaja.dispose();
			this.jInternalFrameImportacionTipoConceptoFlujoCaja=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoConceptoFlujoCaja();
			
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoConceptoFlujoCaja")) {
				jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoConceptoFlujoCaja")) {
				jButtonDuplicarTipoConceptoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoConceptoFlujoCaja")) {
				jButtonCopiarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoConceptoFlujoCaja")) {
				jButtonVerFormTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoConceptoFlujoCaja")) {
				jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoConceptoFlujoCaja")) {
				jButtonDuplicarTipoConceptoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoConceptoFlujoCaja")) {
				jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoConceptoFlujoCaja")) {
				jButtonDuplicarTipoConceptoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoConceptoFlujoCaja")) {
				jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoConceptoFlujoCaja")) {
				jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoConceptoFlujoCaja")) {
				jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoConceptoFlujoCaja")) {
				jButtonModificarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoConceptoFlujoCaja")) {
				jButtonModificarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoConceptoFlujoCaja")) {
				jButtonModificarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoConceptoFlujoCaja")) {
				jButtonActualizarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoConceptoFlujoCaja")) {
				jButtonActualizarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoConceptoFlujoCaja")) {
				jButtonActualizarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoConceptoFlujoCaja")) {
				jButtonEliminarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoConceptoFlujoCaja")) {
				jButtonEliminarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoConceptoFlujoCaja")) {
				jButtonEliminarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoConceptoFlujoCaja")) {
				jButtonCancelarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoConceptoFlujoCaja")) {
				jButtonCancelarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoConceptoFlujoCaja")) {
				jButtonCancelarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoConceptoFlujoCaja")) {
				jButtonCerrarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoConceptoFlujoCaja")) {
				jButtonCerrarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoConceptoFlujoCaja")) {
				jButtonCerrarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoConceptoFlujoCaja")) {
				jButtonMostrarOcultarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoConceptoFlujoCaja")) {
				jButtonCancelarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoConceptoFlujoCaja")) {
				jButtonGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoConceptoFlujoCaja")) {
				jButtonGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoConceptoFlujoCaja")) {
				jButtonCopiarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoConceptoFlujoCaja")) {
				jButtonVerFormTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoConceptoFlujoCaja")) {
				jButtonGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoConceptoFlujoCaja")) {
				jButtonCopiarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoConceptoFlujoCaja")) {
				jButtonVerFormTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoConceptoFlujoCaja")) {
				jButtonGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoConceptoFlujoCaja")) {
				jButtonGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoConceptoFlujoCaja")) {
				jButtonGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoConceptoFlujoCaja")) {
				jButtonRecargarInformacionTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoConceptoFlujoCaja")) {
				jButtonRecargarInformacionTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoConceptoFlujoCaja")) {
				jButtonRecargarInformacionTipoConceptoFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoConceptoFlujoCaja")) {
				jButtonAnterioresTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoConceptoFlujoCaja")) {
				jButtonAnterioresTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoConceptoFlujoCaja")) {
				jButtonAnterioresTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoConceptoFlujoCaja")) {
				jButtonSiguientesTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoConceptoFlujoCaja")) {
				jButtonSiguientesTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoConceptoFlujoCaja")) {
				jButtonSiguientesTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoConceptoFlujoCaja") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoConceptoFlujoCaja")) {
				jButtonAbrirOrderByTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoConceptoFlujoCaja") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoConceptoFlujoCaja")) {
				jButtonMostrarOcultarTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoConceptoFlujoCaja")) {
				jButtonNuevoGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoConceptoFlujoCaja")) {
				jButtonNuevoGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoConceptoFlujoCaja")) {
				jButtonNuevoGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoConceptoFlujoCaja")) {
				jButtonCerrarReporteDinamicoTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoConceptoFlujoCaja")) {
				jButtonGenerarReporteDinamicoTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoConceptoFlujoCaja")) {
				
				jButtonGenerarExcelReporteDinamicoTipoConceptoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoConceptoFlujoCaja")) {
				jButtonCerrarImportacionTipoConceptoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoConceptoFlujoCaja")) {
				
				jButtonGenerarImportacionTipoConceptoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoConceptoFlujoCaja")) {
				
				jButtonAbrirImportacionTipoConceptoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoConceptoFlujoCaja")) {
				jComboBoxTiposAccionesTipoConceptoFlujoCajaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoConceptoFlujoCaja")) {
				jComboBoxTiposRelacionesTipoConceptoFlujoCajaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoConceptoFlujoCaja")) {
				jComboBoxTiposAccionesTipoConceptoFlujoCajaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoConceptoFlujoCaja")) {
				
				jComboBoxTiposSeleccionarTipoConceptoFlujoCajaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoConceptoFlujoCaja")) {
				jTextFieldValorCampoGeneralTipoConceptoFlujoCajaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoConceptoFlujoCaja")) {
				jButtonAbrirOrderByTipoConceptoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoConceptoFlujoCaja")) {
				jButtonAbrirOrderByTipoConceptoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoConceptoFlujoCaja")) {
				jButtonCerrarOrderByTipoConceptoFlujoCajaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoConceptoFlujoCajaBusqueda")) {
				this.jButtonidTipoConceptoFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoConceptoFlujoCajaUpdate")) {
				this.jButtonid_empresaTipoConceptoFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoConceptoFlujoCajaBusqueda")) {
				this.jButtonid_empresaTipoConceptoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoConceptoFlujoCajaBusqueda")) {
				this.jButtoncodigoTipoConceptoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoConceptoFlujoCajaBusqueda")) {
				this.jButtonnombreTipoConceptoFlujoCajaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoConceptoFlujoCaja")) {
				this.jButtonBusquedaPorCodigoTipoConceptoFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorIdTipoConceptoFlujoCaja")) {
				this.jButtonBusquedaPorIdTipoConceptoFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoConceptoFlujoCaja")) {
				this.jButtonBusquedaPorNombreTipoConceptoFlujoCajaActionPerformed(evt);
			}
			
			;
			
			
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoConceptoFlujoCaja();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConceptoFlujoCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconceptoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconceptoflujocaja);
				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
				
				


				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConceptoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConceptoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoConceptoFlujoCaja tipoconceptoflujocajaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoconceptoflujocajaLocal=this.tipoconceptoflujocaja;
			} else {
				tipoconceptoflujocajaLocal=this.tipoconceptoflujocajaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconceptoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconceptoflujocaja);
				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
							
				
				


				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConceptoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConceptoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConceptoFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaAnterior =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconceptoflujocajaAnterior =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			
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
			
			


			
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConceptoFlujoCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconceptoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconceptoflujocaja);
				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
								
						
				


				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConceptoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConceptoFlujoCaja.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconceptoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconceptoflujocaja);
				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
								
				
				


				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConceptoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConceptoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConceptoFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaAnterior =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconceptoflujocajaAnterior =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconceptoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconceptoflujocaja);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConceptoFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaAnterior =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconceptoflujocajaAnterior =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConceptoFlujoCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconceptoflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoconceptoflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconceptoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconceptoflujocaja);
				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
							
				
				


				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConceptoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConceptoFlujoCaja.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConceptoFlujoCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconceptoflujocajaAnterior =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoconceptoflujocajaAnterior =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			
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
			
			


			
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConceptoFlujoCajaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconceptoflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoconceptoflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconceptoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconceptoflujocaja);
				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
								
				
				


				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConceptoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConceptoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConceptoFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaAnterior =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconceptoflujocajaAnterior =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConceptoFlujoCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconceptoflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoconceptoflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConceptoFlujoCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconceptoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconceptoflujocaja);
				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoConceptoFlujoCaja")) {
					jCheckBoxSeleccionarTodosTipoConceptoFlujoCajaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoConceptoFlujoCaja")) {
					jCheckBoxSeleccionadosTipoConceptoFlujoCajaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoConceptoFlujoCaja")) {
					
				}
				
				


				
				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConceptoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConceptoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconceptoflujocaja);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoconceptoflujocaja);
				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
												
				
				


				
				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConceptoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConceptoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConceptoFlujoCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconceptoflujocajaAnterior =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoconceptoflujocajaAnterior =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConceptoFlujoCajaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconceptoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconceptoflujocaja);
				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
				
				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
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
			
			


			
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConceptoFlujoCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconceptoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconceptoflujocaja);
				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConceptoFlujoCaja.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConceptoFlujoCaja.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconceptoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconceptoflujocaja);
				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
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
				
				


				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConceptoFlujoCaja.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConceptoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConceptoFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconceptoflujocajaAnterior =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconceptoflujocajaAnterior =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoConceptoFlujoCaja")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoConceptoFlujoCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoConceptoFlujoCaja.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoconceptoflujocaja =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoconceptoflujocaja);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoConceptoFlujoCaja")) {
				
				}
				
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoConceptoFlujoCaja")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoConceptoFlujoCaja.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoConceptoFlujoCaja")) {
			
			}
			
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoConceptoFlujoCaja();
			
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoConceptoFlujoCaja")) {
				jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoConceptoFlujoCaja")) {
				jButtonDuplicarTipoConceptoFlujoCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoConceptoFlujoCaja")) {
				jButtonCopiarTipoConceptoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoConceptoFlujoCaja")) {
				jButtonVerFormTipoConceptoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoConceptoFlujoCaja")) {
				jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoConceptoFlujoCaja")) {
				jButtonModificarTipoConceptoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoConceptoFlujoCaja")) {
				jButtonActualizarTipoConceptoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoConceptoFlujoCaja")) {
				jButtonEliminarTipoConceptoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoConceptoFlujoCaja")) {
				jButtonGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoConceptoFlujoCaja")) {
				jButtonCancelarTipoConceptoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoConceptoFlujoCaja")) {
				jButtonCerrarTipoConceptoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoConceptoFlujoCaja")) {
				jButtonGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoConceptoFlujoCaja")) {
				jButtonNuevoGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoConceptoFlujoCaja")) {
				jButtonAbrirOrderByTipoConceptoFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoConceptoFlujoCaja")) {
				jButtonRecargarInformacionTipoConceptoFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoConceptoFlujoCaja")) {
				jButtonAnterioresTipoConceptoFlujoCajaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoConceptoFlujoCaja")) {
				jButtonSiguientesTipoConceptoFlujoCajaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoConceptoFlujoCajaBusqueda")) {
				this.jButtonidTipoConceptoFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoConceptoFlujoCajaUpdate")) {
				this.jButtonid_empresaTipoConceptoFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoConceptoFlujoCajaBusqueda")) {
				this.jButtonid_empresaTipoConceptoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoConceptoFlujoCajaBusqueda")) {
				this.jButtoncodigoTipoConceptoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoConceptoFlujoCajaBusqueda")) {
				this.jButtonnombreTipoConceptoFlujoCajaBusquedaActionPerformed(evt);
			}
			
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoConceptoFlujoCaja();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoConceptoFlujoCaja")) {
				closingInternalFrameTipoConceptoFlujoCaja();
				
			} else if(sTipo.equals("jButtonCancelarTipoConceptoFlujoCaja")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoConceptoFlujoCaja = (JInternalFrameBase)evt.getSource();
	            	
	            TipoConceptoFlujoCajaBeanSwingJInternalFrame jInternalFrameParent=(TipoConceptoFlujoCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoConceptoFlujoCaja.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoConceptoFlujoCajaActionPerformed(null);
			}
			
			TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoconceptoflujocaja,new Object(),this.tipoconceptoflujocajaParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoConceptoFlujoCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoConceptoFlujoCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoConceptoFlujoCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoconceptoflujocaja)) {
			if(!esControlTabla) {
				if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(this.tipoconceptoflujocaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);			
				}
				
				if(this.tipoconceptoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoConceptoFlujoCaja(this.tipoconceptoflujocaja,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoconceptoflujocajaReturnGeneral=tipoconceptoflujocajaLogic.procesarEventosTipoConceptoFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas(),this.tipoconceptoflujocaja,this.tipoconceptoflujocajaParameterGeneral,this.isEsNuevoTipoConceptoFlujoCaja,classes);//this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCaja()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoConceptoFlujoCaja(this.tipoconceptoflujocajaReturnGeneral,this.tipoconceptoflujocajaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoconceptoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoConceptoFlujoCaja(classes,this.tipoconceptoflujocajaReturnGeneral,this.tipoconceptoflujocajaBean,false);
					}
						
					if(this.tipoconceptoflujocajaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoConceptoFlujoCaja(this.tipoconceptoflujocajaReturnGeneral.getTipoConceptoFlujoCaja());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoConceptoFlujoCaja(this.tipoconceptoflujocajaReturnGeneral.getTipoConceptoFlujoCaja());	
					}
						
					if(this.tipoconceptoflujocajaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoConceptoFlujoCaja(this.tipoconceptoflujocajaReturnGeneral.getTipoConceptoFlujoCaja(),classes);//this.tipoconceptoflujocajaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoConceptoFlujoCaja(this.tipoconceptoflujocaja,classes);//this.tipoconceptoflujocajaBean);									
				}
			
				if(TipoConceptoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoConceptoFlujoCaja(this.tipoconceptoflujocaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConceptoFlujoCaja(this.tipoconceptoflujocaja);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoconceptoflujocajaAnterior!=null) {
						this.tipoconceptoflujocaja=this.tipoconceptoflujocajaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoconceptoflujocajaReturnGeneral=tipoconceptoflujocajaLogic.procesarEventosTipoConceptoFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas(),this.tipoconceptoflujocaja,this.tipoconceptoflujocajaParameterGeneral,this.isEsNuevoTipoConceptoFlujoCaja,classes);//this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCaja()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoconceptoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoconceptoflujocajaReturnGeneral.getTipoConceptoFlujoCaja(),tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoconceptoflujocajaReturnGeneral.getTipoConceptoFlujoCaja(),this.tipoconceptoflujocajas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoConceptoFlujoCaja.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoConceptoFlujoCaja.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoConceptoFlujoCaja();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoConceptoFlujoCaja() throws Exception {
		
		TipoConceptoFlujoCajaModel tipoconceptoflujocajaModel=(TipoConceptoFlujoCajaModel)this.jTableDatosTipoConceptoFlujoCaja.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoconceptoflujocajaModel.tipoconceptoflujocajas=this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoconceptoflujocajaModel.tipoconceptoflujocajas=this.tipoconceptoflujocajas;
		}
		
		
		((TipoConceptoFlujoCajaModel) this.jTableDatosTipoConceptoFlujoCaja.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoConceptoFlujoCaja() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoconceptoflujocajaAnterior(),this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoconceptoflujocajaAnterior(),this.tipoconceptoflujocajas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoConceptoFlujoCaja();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocaja,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
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
										
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoconceptoflujocaja,new Object(),generalEntityParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoConceptoFlujoCajaConstantesFunciones.getClassesRelationshipsOfTipoConceptoFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoConceptoFlujoCajaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoConceptoFlujoCaja(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoConceptoFlujoCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoConceptoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoconceptoflujocaja,new Object(),generalEntityParameterGeneral,this.tipoconceptoflujocajaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoConceptoFlujoCaja(TipoConceptoFlujoCajaBean tipoconceptoflujocajaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoConceptoFlujoCaja(ArrayList<Classe> classes,TipoConceptoFlujoCajaReturnGeneral tipoconceptoflujocajaReturnGeneral,TipoConceptoFlujoCajaBean tipoconceptoflujocajaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocaja,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoconceptoflujocaja)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja = new TipoConceptoFlujoCajaDetalleFormJInternalFrame(jDesktopPane,this.tipoconceptoflujocajaSessionBean.getConGuardarRelaciones(),this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja);
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.setVisible(false);
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.tipoconceptoflujocajaLogic=this.tipoconceptoflujocajaLogic;
		
		this.cargarCombosFrameForeignKeyTipoConceptoFlujoCaja("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoConceptoFlujoCaja();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoConceptoFlujoCaja();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoConceptoFlujoCaja("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoConceptoFlujoCaja();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoConceptoFlujoCaja"));
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonModificarTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarTipoConceptoFlujoCaja"));

		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonModificarToolBarTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoConceptoFlujoCaja"));
					
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemModificarTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoConceptoFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonActualizarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"ActualizarTipoConceptoFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonActualizarToolBarTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoConceptoFlujoCaja"));
						
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemActualizarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoConceptoFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonEliminarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarTipoConceptoFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonEliminarToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoConceptoFlujoCaja"));
								
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemEliminarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoConceptoFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonCancelarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarTipoConceptoFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonCancelarToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoConceptoFlujoCaja"));
					
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemCancelarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoConceptoFlujoCaja"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemDetalleCerrarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoConceptoFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonGuardarCambiosToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoConceptoFlujoCaja"));
		
		
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonGuardarCambiosToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoConceptoFlujoCaja"));
		
		
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoConceptoFlujoCaja"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonidTipoConceptoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoConceptoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonid_empresaTipoConceptoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoConceptoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonid_empresaTipoConceptoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoConceptoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtoncodigoTipoConceptoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoConceptoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonnombreTipoConceptoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoConceptoFlujoCajaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTabbedPaneRelacionesTipoConceptoFlujoCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoConceptoFlujoCaja"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoConceptoFlujoCaja"));
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoConceptoFlujoCaja"));
		}
		
		this.jTableDatosTipoConceptoFlujoCaja.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoConceptoFlujoCaja"));
		
		this.jTableDatosTipoConceptoFlujoCaja.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoConceptoFlujoCaja"));
		
		this.jButtonNuevoTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoTipoConceptoFlujoCaja"));
		
		this.jButtonDuplicarTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"DuplicarTipoConceptoFlujoCaja"));
		
		this.jButtonCopiarTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"CopiarTipoConceptoFlujoCaja"));
		
		this.jButtonVerFormTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"VerFormTipoConceptoFlujoCaja"));
		
		
		this.jButtonNuevoToolBarTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoConceptoFlujoCaja"));
			
		this.jButtonDuplicarToolBarTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoConceptoFlujoCaja"));
			
		this.jMenuItemNuevoTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoConceptoFlujoCaja"));
			
		this.jMenuItemDuplicarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoConceptoFlujoCaja"));		
		
		
		this.jButtonNuevoRelacionesTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoConceptoFlujoCaja"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoConceptoFlujoCaja"));
			
		this.jMenuItemNuevoRelacionesTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoConceptoFlujoCaja"));		
		
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonModificarTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarTipoConceptoFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonModificarToolBarTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoConceptoFlujoCaja"));
			
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemModificarTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoConceptoFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonActualizarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"ActualizarTipoConceptoFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonActualizarToolBarTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoConceptoFlujoCaja"));
				
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemActualizarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoConceptoFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonEliminarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarTipoConceptoFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonEliminarToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoConceptoFlujoCaja"));
						
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemEliminarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoConceptoFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonCancelarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarTipoConceptoFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonCancelarToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoConceptoFlujoCaja"));
			
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemCancelarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoConceptoFlujoCaja"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoConceptoFlujoCaja"));		
		
		
		this.jButtonCerrarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarTipoConceptoFlujoCaja"));
		
		
		this.jButtonCerrarToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoConceptoFlujoCaja"));
			
		this.jMenuItemCerrarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoConceptoFlujoCaja"));
			
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jMenuItemDetalleCerrarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoConceptoFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonGuardarCambiosTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoConceptoFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonGuardarCambiosToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoConceptoFlujoCaja"));
		}
		
		this.jButtonCopiarToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoConceptoFlujoCaja"));
			
		this.jButtonVerFormToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoConceptoFlujoCaja"));
		
		this.jMenuItemGuardarCambiosTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoConceptoFlujoCaja"));
			
		this.jMenuItemCopiarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoConceptoFlujoCaja"));		
		
		this.jMenuItemVerFormTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoConceptoFlujoCaja"));		
		
		
		this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoConceptoFlujoCaja"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoConceptoFlujoCaja"));
			
		this.jMenuItemGuardarCambiosTablaTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoConceptoFlujoCaja"));		
		
		
		
		this.jButtonRecargarInformacionTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoConceptoFlujoCaja"));
					
		this.jButtonRecargarInformacionToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoConceptoFlujoCaja"));
		
		this.jMenuItemRecargarInformacionTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoConceptoFlujoCaja"));		
		
		
		
		this.jButtonAnterioresTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"AnterioresTipoConceptoFlujoCaja"));
		
		
		this.jButtonAnterioresToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoConceptoFlujoCaja"));
		
		this.jMenuItemAnterioresTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoConceptoFlujoCaja"));		
		
		
		this.jButtonSiguientesTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"SiguientesTipoConceptoFlujoCaja"));
		
		
		this.jButtonSiguientesToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoConceptoFlujoCaja"));
			
		this.jMenuItemSiguientesTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoConceptoFlujoCaja"));
			
		this.jMenuItemAbrirOrderByTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoConceptoFlujoCaja"));
			
		this.jMenuItemMostrarOcultarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoConceptoFlujoCaja"));
			
		this.jMenuItemDetalleAbrirOrderByTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoConceptoFlujoCaja"));
			
		this.jMenuItemDetalleMostarOcultarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoConceptoFlujoCaja"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoConceptoFlujoCaja"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoConceptoFlujoCaja"));
			
		this.jMenuItemNuevoGuardarCambiosTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoConceptoFlujoCaja"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoConceptoFlujoCaja"));

		this.jCheckBoxSeleccionadosTipoConceptoFlujoCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoConceptoFlujoCaja"));
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoConceptoFlujoCaja"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoConceptoFlujoCaja"));
			
		this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoConceptoFlujoCaja"));
					
		this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoConceptoFlujoCaja"));
			
		this.jTextFieldValorCampoGeneralTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoConceptoFlujoCaja"));		
		
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonidTipoConceptoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoConceptoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonid_empresaTipoConceptoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoConceptoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonid_empresaTipoConceptoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoConceptoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtoncodigoTipoConceptoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoConceptoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonnombreTipoConceptoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoConceptoFlujoCajaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoConceptoFlujoCaja"));

			this.jButtonBusquedaPorIdTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoConceptoFlujoCaja"));

			this.jButtonBusquedaPorNombreTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoConceptoFlujoCaja"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoConceptoFlujoCaja"));
				this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoConceptoFlujoCaja"));
				this.jInternalFrameReporteDinamicoTipoConceptoFlujoCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoConceptoFlujoCaja"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoConceptoFlujoCaja"));				
			//this.jButtonGenerarReporteDinamicoTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoConceptoFlujoCaja"));
			//this.jButtonGenerarExcelReporteDinamicoTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoConceptoFlujoCaja"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoConceptoFlujoCaja!=null) {
				this.jInternalFrameImportacionTipoConceptoFlujoCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoConceptoFlujoCaja"));
				this.jInternalFrameImportacionTipoConceptoFlujoCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoConceptoFlujoCaja"));
				this.jInternalFrameImportacionTipoConceptoFlujoCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoConceptoFlujoCaja"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoConceptoFlujoCaja"));
			
			this.jButtonAbrirOrderByToolBarTipoConceptoFlujoCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoConceptoFlujoCaja"));			
			
			if(this.jInternalFrameOrderByTipoConceptoFlujoCaja!=null) {
				this.jInternalFrameOrderByTipoConceptoFlujoCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoConceptoFlujoCaja"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTabbedPaneRelacionesTipoConceptoFlujoCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoConceptoFlujoCaja"));
		
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
            		closingInternalFrameTipoConceptoFlujoCaja();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoConceptoFlujoCaja = (JInternalFrameBase)event.getSource();
	            	
	            TipoConceptoFlujoCajaBeanSwingJInternalFrame jInternalFrameParent=(TipoConceptoFlujoCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoConceptoFlujoCaja.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoConceptoFlujoCajaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoConceptoFlujoCaja.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoConceptoFlujoCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoConceptoFlujoCaja.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoConceptoFlujoCaja.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoConceptoFlujoCaja";
		inputMap = this.jButtonNuevoTipoConceptoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoConceptoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoConceptoFlujoCaja";
		inputMap = this.jButtonNuevoRelacionesTipoConceptoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoConceptoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoConceptoFlujoCajaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoConceptoFlujoCaja";
		inputMap = this.jButtonModificarTipoConceptoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoConceptoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoConceptoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoConceptoFlujoCaja";
		inputMap = this.jButtonActualizarTipoConceptoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoConceptoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoConceptoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoConceptoFlujoCaja";
		inputMap = this.jButtonEliminarTipoConceptoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoConceptoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoConceptoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoConceptoFlujoCaja";
		inputMap = this.jButtonCancelarTipoConceptoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoConceptoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoConceptoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoConceptoFlujoCaja";
		inputMap = this.jButtonCerrarTipoConceptoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoConceptoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoConceptoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonGuardarCambiosTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoConceptoFlujoCaja";
		inputMap = this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonGuardarCambiosTipoConceptoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonGuardarCambiosTipoConceptoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoConceptoFlujoCaja.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoConceptoFlujoCajaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoConceptoFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoConceptoFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoConceptoFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoConceptoFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonidTipoConceptoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoConceptoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonid_empresaTipoConceptoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoConceptoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonid_empresaTipoConceptoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoConceptoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtoncodigoTipoConceptoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoConceptoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jButtonnombreTipoConceptoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoConceptoFlujoCajaBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoConceptoFlujoCaja"));

		this.jButtonBusquedaPorIdTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoConceptoFlujoCaja"));

		this.jButtonBusquedaPorNombreTipoConceptoFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoConceptoFlujoCaja"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoConceptoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoConceptoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoConceptoFlujoCajaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoConceptoFlujoCaja.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoConceptoFlujoCaja(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()) {
					tipoconceptoflujocajaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:tipoconceptoflujocajas) {
					tipoconceptoflujocajaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoConceptoFlujoCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()) {
						tipoconceptoflujocajaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:tipoconceptoflujocajas) {
						tipoconceptoflujocajaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:tipoconceptoflujocajas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoConceptoFlujoCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoConceptoFlujoCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoConceptoFlujoCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoConceptoFlujoCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoConceptoFlujoCaja.getSelectedRows();
			
			TipoConceptoFlujoCaja tipoconceptoflujocajaLocal=new TipoConceptoFlujoCaja();
			
			//this.seleccionarTodosTipoConceptoFlujoCaja(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconceptoflujocajaLocal =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas().toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoconceptoflujocajaLocal =(TipoConceptoFlujoCaja) this.tipoconceptoflujocajas.toArray()[this.jTableDatosTipoConceptoFlujoCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoconceptoflujocajaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()) {
						tipoconceptoflujocajaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:tipoconceptoflujocajas) {
						tipoconceptoflujocajaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoConceptoFlujoCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoConceptoFlujoCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoConceptoFlujoCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoConceptoFlujoCajaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoConceptoFlujoCajaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoConceptoFlujoCajaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoConceptoFlujoCaja.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()) {
				
						if(sTipoSeleccionar.equals(TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoconceptoflujocajaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoconceptoflujocajaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:tipoconceptoflujocajas) {
					
						if(sTipoSeleccionar.equals(TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoconceptoflujocajaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoconceptoflujocajaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoConceptoFlujoCajaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoConceptoFlujoCaja=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoConceptoFlujoCaja) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoConceptoFlujoCaja(conSplash);
				
					this.generarReporteTipoConceptoFlujoCajasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoConceptoFlujoCajasSeleccionados();
				//this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoConceptoFlujoCajasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoConceptoFlujoCajasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoConceptoFlujoCaja();
				
				this.exportarTipoConceptoFlujoCajasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoConceptoFlujoCajas();
				//this.importarTipoConceptoFlujoCajas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoConceptoFlujoCaja();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoConceptoFlujoCajasSeleccionados();
				//this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Concepto Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoConceptoFlujoCaja();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoConceptoFlujoCaja)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoConceptoFlujoCaja(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Concepto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoConceptoFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxTiposAccionesFormularioTipoConceptoFlujoCaja.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoConceptoFlujoCaja();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoConceptoFlujoCaja(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoConceptoFlujoCajaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoConceptoFlujoCaja();
			
			if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoConceptoFlujoCaja> tipoconceptoflujocajasSeleccionados=new ArrayList<TipoConceptoFlujoCaja>();		
			TipoConceptoFlujoCaja tipoconceptoflujocaja=new TipoConceptoFlujoCaja();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoConceptoFlujoCaja.getSelectedItem();
			
			
			
			
			tipoconceptoflujocajasSeleccionados=this.getTipoConceptoFlujoCajasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoconceptoflujocajasSeleccionados.size()==1) {
				for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:tipoconceptoflujocajasSeleccionados) {
					tipoconceptoflujocaja=tipoconceptoflujocajaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoConceptoFlujoCaja();
			
      		//this.finishProcessTipoConceptoFlujoCaja(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoConceptoFlujoCajaReturnGeneral() throws Exception {
		if(this.tipoconceptoflujocajaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoconceptoflujocajaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoconceptoflujocajaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoconceptoflujocajaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoconceptoflujocajaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoconceptoflujocajaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false);
		}
		
		if(this.tipoconceptoflujocajaReturnGeneral.getConRetornoLista() || this.tipoconceptoflujocajaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoconceptoflujocajaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoconceptoflujocajaLogic.setTipoConceptoFlujoCajas(this.tipoconceptoflujocajaReturnGeneral.getTipoConceptoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoconceptoflujocajaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoconceptoflujocajaLogic.setTipoConceptoFlujoCaja(this.tipoconceptoflujocajaReturnGeneral.getTipoConceptoFlujoCaja());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoConceptoFlujoCaja(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoConceptoFlujoCaja() throws Exception {
		
		
	}
	
	public ArrayList<TipoConceptoFlujoCaja> getTipoConceptoFlujoCajasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoConceptoFlujoCaja> tipoconceptoflujocajasSeleccionados=new ArrayList<TipoConceptoFlujoCaja>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoConceptoFlujoCaja) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas()) {
					if(tipoconceptoflujocajaAux.getIsSelected()) {
						tipoconceptoflujocajasSeleccionados.add(tipoconceptoflujocajaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:this.tipoconceptoflujocajas) {
					if(tipoconceptoflujocajaAux.getIsSelected()) {
						tipoconceptoflujocajasSeleccionados.add(tipoconceptoflujocajaAux);				
					}
				}
			}
			
			if(tipoconceptoflujocajasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoconceptoflujocajasSeleccionados.addAll(this.tipoconceptoflujocajaLogic.getTipoConceptoFlujoCajas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoconceptoflujocajasSeleccionados.addAll(this.tipoconceptoflujocajas);				
					}
				}
			}
		} else {
			tipoconceptoflujocajasSeleccionados.add(this.tipoconceptoflujocaja);
		}
		
		return tipoconceptoflujocajasSeleccionados;
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
	
	public void generarReporteTipoConceptoFlujoCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoConceptoFlujoCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoConceptoFlujoCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoConceptoFlujoCajasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoConceptoFlujoCajasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Concepto Flujo Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoConceptoFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoConceptoFlujoCaja> tipoconceptoflujocajasSeleccionados=new ArrayList<TipoConceptoFlujoCaja>();		
		
		tipoconceptoflujocajasSeleccionados=this.getTipoConceptoFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoConceptoFlujoCajas("Todos",tipoconceptoflujocajasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoConceptoFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoConceptoFlujoCaja> tipoconceptoflujocajasSeleccionados=new ArrayList<TipoConceptoFlujoCaja>();		
		
		tipoconceptoflujocajasSeleccionados=this.getTipoConceptoFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoConceptoFlujoCajas("Todos",tipoconceptoflujocajasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoConceptoFlujoCajasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoConceptoFlujoCaja> tipoconceptoflujocajasSeleccionados=new ArrayList<TipoConceptoFlujoCaja>();
		
		tipoconceptoflujocajasSeleccionados=this.getTipoConceptoFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoConceptoFlujoCajas("Todos",tipoconceptoflujocajasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoConceptoFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoConceptoFlujoCaja> tipoconceptoflujocajasSeleccionados=new ArrayList<TipoConceptoFlujoCaja>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoConceptoFlujoCaja();
		
		
		tipoconceptoflujocajasSeleccionados=this.getTipoConceptoFlujoCajasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoConceptoFlujoCaja();
		
		
		//this.generarReporteTipoConceptoFlujoCajas("Todos",tipoconceptoflujocajasSeleccionados ,tipoconceptoflujocajaImplementable,tipoconceptoflujocajaImplementableHome);
	}
	
	public void mostrarImportacionTipoConceptoFlujoCajas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoConceptoFlujoCaja();
		
		this.abrirFrameImportacionTipoConceptoFlujoCaja();		
		
			
		//this.generarReporteTipoConceptoFlujoCajas("Todos",tipoconceptoflujocajasSeleccionados ,tipoconceptoflujocajaImplementable,tipoconceptoflujocajaImplementableHome);
	}
	
	public void importarTipoConceptoFlujoCajas() throws Exception {		
	
	}
	
	public void exportarTipoConceptoFlujoCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoConceptoFlujoCajasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoConceptoFlujoCajasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoConceptoFlujoCajasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Concepto Flujo Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoConceptoFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoConceptoFlujoCaja> tipoconceptoflujocajasSeleccionados=new ArrayList<TipoConceptoFlujoCaja>();		
		
		tipoconceptoflujocajasSeleccionados=this.getTipoConceptoFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconceptoflujocaja."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoConceptoFlujoCaja(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:tipoconceptoflujocajasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoConceptoFlujoCaja(tipoconceptoflujocajaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoconceptoflujocajaAux.setsDetalleGeneralEntityReporte(tipoconceptoflujocajaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Concepto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoConceptoFlujoCaja(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoConceptoFlujoCajaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoConceptoFlujoCajaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoConceptoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocaja,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoconceptoflujocaja.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoconceptoflujocaja.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoconceptoflujocaja.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoconceptoflujocaja.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoconceptoflujocaja.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoConceptoFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoConceptoFlujoCaja> tipoconceptoflujocajasSeleccionados=new ArrayList<TipoConceptoFlujoCaja>();		
		
		tipoconceptoflujocajasSeleccionados=this.getTipoConceptoFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconceptoflujocaja.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoConceptoFlujoCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoConceptoFlujoCaja(row);				
				iRow++;
			}				
			
			for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:tipoconceptoflujocajasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoConceptoFlujoCaja(tipoconceptoflujocajaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Concepto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoConceptoFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoConceptoFlujoCaja> tipoconceptoflujocajasSeleccionados=new ArrayList<TipoConceptoFlujoCaja>();		
		
		tipoconceptoflujocajasSeleccionados=this.getTipoConceptoFlujoCajasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconceptoflujocaja.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoconceptoflujocajas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoconceptoflujocaja");
			//elementRoot.appendChild(element);
		
			for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:tipoconceptoflujocajasSeleccionados) {
				element = document.createElement("tipoconceptoflujocaja");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoConceptoFlujoCaja(tipoconceptoflujocajaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Concepto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoConceptoFlujoCaja(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoConceptoFlujoCajaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoConceptoFlujoCajaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoConceptoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocaja,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoconceptoflujocaja.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoconceptoflujocaja.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoconceptoflujocaja.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoconceptoflujocaja.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoConceptoFlujoCaja(TipoConceptoFlujoCaja tipoconceptoflujocaja,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoConceptoFlujoCajaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoconceptoflujocaja.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoConceptoFlujoCajaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoconceptoflujocaja.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoConceptoFlujoCajaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoconceptoflujocaja.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoConceptoFlujoCajaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoconceptoflujocaja.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoConceptoFlujoCajaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoconceptoflujocaja.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoConceptoFlujoCajasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoConceptoFlujoCaja> tipoconceptoflujocajasSeleccionados=new ArrayList<TipoConceptoFlujoCaja>();
		
		tipoconceptoflujocajasSeleccionados=this.getTipoConceptoFlujoCajasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoConceptoFlujoCaja(tipoconceptoflujocajasSeleccionados);
		
		this.generarReporteTipoConceptoFlujoCajas("Todos",tipoconceptoflujocajasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoConceptoFlujoCaja(ArrayList<TipoConceptoFlujoCaja> tipoconceptoflujocajasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoConceptoFlujoCaja tipoconceptoflujocajaAux:tipoconceptoflujocajasSeleccionados) {
				tipoconceptoflujocajaAux.setsDetalleGeneralEntityReporte(tipoconceptoflujocajaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoConceptoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoconceptoflujocajaAux.setsDescripcionGeneralEntityReporte1(tipoconceptoflujocajaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoConceptoFlujoCajaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoconceptoflujocajaAux.setsDescripcionGeneralEntityReporte1(tipoconceptoflujocajaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoConceptoFlujoCajaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoconceptoflujocajaAux.setsDescripcionGeneralEntityReporte1(tipoconceptoflujocajaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoConceptoFlujoCaja(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja=true;
				this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja=true;
			}
			
			this.isVisibilidadCeldaModificarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaModificarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoConceptoFlujoCaja=true;
			this.isVisibilidadCeldaEliminarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaModificarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoConceptoFlujoCaja=true;
			this.isVisibilidadCeldaEliminarTipoConceptoFlujoCaja=true;
			this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaModificarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoConceptoFlujoCaja=true;
			this.isVisibilidadCeldaEliminarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja=true;
			this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja=true;
			this.isVisibilidadCeldaModificarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaModificarTipoConceptoFlujoCaja=true;
			this.isVisibilidadCeldaActualizarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoConceptoFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoConceptoFlujoCaja=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoConceptoFlujoCajaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja=true;
			this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja=true;
		} else {
			this.actualizarEstadoPanelsTipoConceptoFlujoCaja(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoConceptoFlujoCaja=false;
			//this.isVisibilidadCeldaVerFormTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaDuplicarTipoConceptoFlujoCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConceptoFlujoCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(!tipoconceptoflujocajaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja=false;												
			}
			
			this.jButtonCerrarTipoConceptoFlujoCaja.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoConceptoFlujoCaja=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoconceptoflujocaja)) {
			this.isVisibilidadCeldaActualizarTipoConceptoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoConceptoFlujoCaja=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoConceptoFlujoCaja() {
	}
	
	public void actualizarEstadoPanelsTipoConceptoFlujoCaja(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoConceptoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoConceptoFlujoCaja!=null) {
				this.jScrollPanelDatosTipoConceptoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoConceptoFlujoCaja!=null) {
				this.jPanelPaginacionTipoConceptoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoConceptoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoConceptoFlujoCaja.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoConceptoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoConceptoFlujoCaja!=null) {
				this.jScrollPanelDatosTipoConceptoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoConceptoFlujoCaja!=null) {
				this.jPanelPaginacionTipoConceptoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoConceptoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoConceptoFlujoCaja.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoConceptoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoConceptoFlujoCaja!=null) {
				this.jScrollPanelDatosTipoConceptoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoConceptoFlujoCaja!=null) {
				this.jPanelPaginacionTipoConceptoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoConceptoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoConceptoFlujoCaja.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoConceptoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoConceptoFlujoCaja!=null) {
				this.jScrollPanelDatosTipoConceptoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoConceptoFlujoCaja!=null) {
				this.jPanelPaginacionTipoConceptoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoConceptoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoConceptoFlujoCaja.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoConceptoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoConceptoFlujoCaja!=null) {
				this.jScrollPanelDatosTipoConceptoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoConceptoFlujoCaja!=null) {
				this.jPanelPaginacionTipoConceptoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoConceptoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoConceptoFlujoCaja.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoConceptoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoConceptoFlujoCaja!=null) {
				this.jScrollPanelDatosTipoConceptoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoConceptoFlujoCaja!=null) {
				this.jPanelPaginacionTipoConceptoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoConceptoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoConceptoFlujoCaja.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoConceptoFlujoCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoConceptoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoConceptoFlujoCaja!=null) {
				this.jScrollPanelDatosTipoConceptoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoConceptoFlujoCaja!=null) {
				this.jPanelPaginacionTipoConceptoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoConceptoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoConceptoFlujoCaja.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoConceptoFlujoCaja!=null) {
					this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoConceptoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoConceptoFlujoCaja.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoconceptoflujocajaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoConceptoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoConceptoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoConceptoFlujoCaja.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.remove(jPanelBusquedaPorCodigoTipoConceptoFlujoCaja);}

			this.isVisibilidadBusquedaPorId=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorId) {this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.remove(jPanelBusquedaPorIdTipoConceptoFlujoCaja);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.remove(jPanelBusquedaPorNombreTipoConceptoFlujoCaja);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoConceptoFlujoCajaSessionBean tipoconceptoflujocajaSessionBean=new TipoConceptoFlujoCajaSessionBean();
		
		if(this.tipoconceptoflujocajaSessionBean==null) {
			this.tipoconceptoflujocajaSessionBean=new TipoConceptoFlujoCajaSessionBean();
		}
		
		this.tipoconceptoflujocajaSessionBean.setsUltimaBusquedaTipoConceptoFlujoCaja(this.getsAccionBusqueda());
		this.tipoconceptoflujocajaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoconceptoflujocajaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipoconceptoflujocajaSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
			tipoconceptoflujocajaSessionBean.setid(this.getidBusquedaPorId());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipoconceptoflujocajaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoconceptoflujocajaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoConceptoFlujoCajaSessionBean tipoconceptoflujocajaSessionBean=new TipoConceptoFlujoCajaSessionBean();
		
		if(this.tipoconceptoflujocajaSessionBean==null) {
			this.tipoconceptoflujocajaSessionBean=new TipoConceptoFlujoCajaSessionBean();
		}
		
		if(this.tipoconceptoflujocajaSessionBean.getsUltimaBusquedaTipoConceptoFlujoCaja()!=null&&!this.tipoconceptoflujocajaSessionBean.getsUltimaBusquedaTipoConceptoFlujoCaja().equals("")) {
			this.setsAccionBusqueda(tipoconceptoflujocajaSessionBean.getsUltimaBusquedaTipoConceptoFlujoCaja());
			this.setiNumeroPaginacion(tipoconceptoflujocajaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoconceptoflujocajaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipoconceptoflujocajaSessionBean.getcodigo());
				tipoconceptoflujocajaSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
				this.setidBusquedaPorId(tipoconceptoflujocajaSessionBean.getid());
				tipoconceptoflujocajaSessionBean.setid(0L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipoconceptoflujocajaSessionBean.getnombre());
				tipoconceptoflujocajaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoconceptoflujocajaSessionBean.getid_empresa());
				tipoconceptoflujocajaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoconceptoflujocajaSessionBean.setsUltimaBusquedaTipoConceptoFlujoCaja("");
		this.tipoconceptoflujocajaSessionBean.setiNumeroPaginacion(TipoConceptoFlujoCajaConstantesFunciones.INUMEROPAGINACION);
		this.tipoconceptoflujocajaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoConceptoFlujoCaja(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoConceptoFlujoCaja() {
		this.updateBorderResaltarBusquedasFormularioTipoConceptoFlujoCaja();
		this.updateVisibilidadBusquedasFormularioTipoConceptoFlujoCaja();
		this.updateHabilitarBusquedasFormularioTipoConceptoFlujoCaja();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoConceptoFlujoCaja() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.getComponents().length>0) {
	

		if(this.tipoconceptoflujocajaConstantesFunciones.resaltarBusquedaPorCodigoTipoConceptoFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorCodigoTipoConceptoFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.getComponent(index);
				jPanel.setBorder(this.tipoconceptoflujocajaConstantesFunciones.resaltarBusquedaPorCodigoTipoConceptoFlujoCaja);
			}
		}

		if(this.tipoconceptoflujocajaConstantesFunciones.resaltarBusquedaPorIdTipoConceptoFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorIdTipoConceptoFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.getComponent(index);
				jPanel.setBorder(this.tipoconceptoflujocajaConstantesFunciones.resaltarBusquedaPorIdTipoConceptoFlujoCaja);
			}
		}

		if(this.tipoconceptoflujocajaConstantesFunciones.resaltarBusquedaPorNombreTipoConceptoFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreTipoConceptoFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.getComponent(index);
				jPanel.setBorder(this.tipoconceptoflujocajaConstantesFunciones.resaltarBusquedaPorNombreTipoConceptoFlujoCaja);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoConceptoFlujoCaja() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorCodigoTipoConceptoFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoconceptoflujocajaConstantesFunciones.mostrarBusquedaPorCodigoTipoConceptoFlujoCaja);
			if(!this.tipoconceptoflujocajaConstantesFunciones.mostrarBusquedaPorCodigoTipoConceptoFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorIdTipoConceptoFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoconceptoflujocajaConstantesFunciones.mostrarBusquedaPorIdTipoConceptoFlujoCaja);
			if(!this.tipoconceptoflujocajaConstantesFunciones.mostrarBusquedaPorIdTipoConceptoFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreTipoConceptoFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoconceptoflujocajaConstantesFunciones.mostrarBusquedaPorNombreTipoConceptoFlujoCaja);
			if(!this.tipoconceptoflujocajaConstantesFunciones.mostrarBusquedaPorNombreTipoConceptoFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoConceptoFlujoCaja() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorCodigoTipoConceptoFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoconceptoflujocajaConstantesFunciones.activarBusquedaPorCodigoTipoConceptoFlujoCaja);
				this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setEnabledAt(index,this.tipoconceptoflujocajaConstantesFunciones.activarBusquedaPorCodigoTipoConceptoFlujoCaja);
			}

			index= this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorIdTipoConceptoFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoconceptoflujocajaConstantesFunciones.activarBusquedaPorIdTipoConceptoFlujoCaja);
				this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setEnabledAt(index,this.tipoconceptoflujocajaConstantesFunciones.activarBusquedaPorIdTipoConceptoFlujoCaja);
			}

			index= this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreTipoConceptoFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoconceptoflujocajaConstantesFunciones.activarBusquedaPorNombreTipoConceptoFlujoCaja);
				this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setEnabledAt(index,this.tipoconceptoflujocajaConstantesFunciones.activarBusquedaPorNombreTipoConceptoFlujoCaja);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoConceptoFlujoCaja(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorCodigoTipoConceptoFlujoCaja);

			this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.getComponent(index);

			this.tipoconceptoflujocajaConstantesFunciones.setResaltarBusquedaPorCodigoTipoConceptoFlujoCaja(resaltar);

			jPanel.setBorder(this.tipoconceptoflujocajaConstantesFunciones.resaltarBusquedaPorCodigoTipoConceptoFlujoCaja);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorId")) {
			index= this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorIdTipoConceptoFlujoCaja);

			this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.getComponent(index);

			this.tipoconceptoflujocajaConstantesFunciones.setResaltarBusquedaPorIdTipoConceptoFlujoCaja(resaltar);

			jPanel.setBorder(this.tipoconceptoflujocajaConstantesFunciones.resaltarBusquedaPorIdTipoConceptoFlujoCaja);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreTipoConceptoFlujoCaja);

			this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConceptoFlujoCaja.getComponent(index);

			this.tipoconceptoflujocajaConstantesFunciones.setResaltarBusquedaPorNombreTipoConceptoFlujoCaja(resaltar);

			jPanel.setBorder(this.tipoconceptoflujocajaConstantesFunciones.resaltarBusquedaPorNombreTipoConceptoFlujoCaja);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoConceptoFlujoCaja.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoConceptoFlujoCaja() throws Exception {

		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoConceptoFlujoCaja();
		this.updateVisibilidadResaltarControlesFormularioTipoConceptoFlujoCaja();
		this.updateHabilitarResaltarControlesFormularioTipoConceptoFlujoCaja();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoConceptoFlujoCaja() throws Exception {
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoconceptoflujocajaConstantesFunciones.resaltaridTipoConceptoFlujoCaja!=null && this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelidTipoConceptoFlujoCaja.setBorder(this.tipoconceptoflujocajaConstantesFunciones.resaltaridTipoConceptoFlujoCaja);}
		if(this.tipoconceptoflujocajaConstantesFunciones.resaltarid_empresaTipoConceptoFlujoCaja!=null && this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxid_empresaTipoConceptoFlujoCaja.setBorder(this.tipoconceptoflujocajaConstantesFunciones.resaltarid_empresaTipoConceptoFlujoCaja);}
		if(this.tipoconceptoflujocajaConstantesFunciones.resaltarcodigoTipoConceptoFlujoCaja!=null && this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTextFieldcodigoTipoConceptoFlujoCaja.setBorder(this.tipoconceptoflujocajaConstantesFunciones.resaltarcodigoTipoConceptoFlujoCaja);}
		if(this.tipoconceptoflujocajaConstantesFunciones.resaltarnombreTipoConceptoFlujoCaja!=null && this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTextAreanombreTipoConceptoFlujoCaja.setBorder(this.tipoconceptoflujocajaConstantesFunciones.resaltarnombreTipoConceptoFlujoCaja);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoConceptoFlujoCaja() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
	
		//this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelidTipoConceptoFlujoCaja.setVisible(this.tipoconceptoflujocajaConstantesFunciones.mostraridTipoConceptoFlujoCaja);
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jPanelidTipoConceptoFlujoCaja.setVisible(this.tipoconceptoflujocajaConstantesFunciones.mostraridTipoConceptoFlujoCaja);
		//this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxid_empresaTipoConceptoFlujoCaja.setVisible(this.tipoconceptoflujocajaConstantesFunciones.mostrarid_empresaTipoConceptoFlujoCaja);
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jPanelid_empresaTipoConceptoFlujoCaja.setVisible(this.tipoconceptoflujocajaConstantesFunciones.mostrarid_empresaTipoConceptoFlujoCaja);
		//this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTextFieldcodigoTipoConceptoFlujoCaja.setVisible(this.tipoconceptoflujocajaConstantesFunciones.mostrarcodigoTipoConceptoFlujoCaja);
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jPanelcodigoTipoConceptoFlujoCaja.setVisible(this.tipoconceptoflujocajaConstantesFunciones.mostrarcodigoTipoConceptoFlujoCaja);
		//this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTextAreanombreTipoConceptoFlujoCaja.setVisible(this.tipoconceptoflujocajaConstantesFunciones.mostrarnombreTipoConceptoFlujoCaja);
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jPanelnombreTipoConceptoFlujoCaja.setVisible(this.tipoconceptoflujocajaConstantesFunciones.mostrarnombreTipoConceptoFlujoCaja);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoConceptoFlujoCaja() throws Exception {
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoConceptoFlujoCaja!=null) {
	
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jLabelidTipoConceptoFlujoCaja.setEnabled(this.tipoconceptoflujocajaConstantesFunciones.activaridTipoConceptoFlujoCaja);
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jComboBoxid_empresaTipoConceptoFlujoCaja.setEnabled(this.tipoconceptoflujocajaConstantesFunciones.activarid_empresaTipoConceptoFlujoCaja);
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTextFieldcodigoTipoConceptoFlujoCaja.setEnabled(this.tipoconceptoflujocajaConstantesFunciones.activarcodigoTipoConceptoFlujoCaja);
		this.jInternalFrameDetalleFormTipoConceptoFlujoCaja.jTextAreanombreTipoConceptoFlujoCaja.setEnabled(this.tipoconceptoflujocajaConstantesFunciones.activarnombreTipoConceptoFlujoCaja);
		}
	}
	
		
}