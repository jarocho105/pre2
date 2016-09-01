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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;




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

import com.bydan.erp.puntoventa.util.FormulaConstantesFunciones;
import com.bydan.erp.puntoventa.util.FormulaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.FormulaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.FormulaBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class FormulaBeanSwingJInternalFrame extends FormulaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FormulaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Formula> formulaValidator = new ClassValidator<Formula>(Formula.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Formula formula;	
	public Formula formulaAux;
	public Formula formulaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Formula formulaTotales;
	public Long idFormulaActual;
	public Long iIdNuevoFormula=0L;
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

	public String sFinalQueryComboTipoFormula="";

	public List<TipoFormula> tipoformulasForeignKey;

	public List<TipoFormula> gettipoformulasForeignKey() {
		return tipoformulasForeignKey;
	}

	public void settipoformulasForeignKey(List<TipoFormula> tipoformulasForeignKey) {
		this.tipoformulasForeignKey = tipoformulasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoFormula tipoformulaForeignKey;

	public TipoFormula gettipoformulaForeignKey() {
		return tipoformulaForeignKey;
	}

	public void settipoformulaForeignKey(TipoFormula tipoformulaForeignKey) {
		this.tipoformulaForeignKey = tipoformulaForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosTarjetaCredito=false;

	public Boolean getIsTienePermisosTarjetaCredito() {
		return isTienePermisosTarjetaCredito;
	}

	public void setIsTienePermisosTarjetaCredito(Boolean isTienePermisosTarjetaCredito) {
		this.isTienePermisosTarjetaCredito= isTienePermisosTarjetaCredito;
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
	
	public Boolean isPermisoTodoFormula;
	public Boolean isPermisoNuevoFormula;
	public Boolean isPermisoActualizarFormula;
	public Boolean isPermisoActualizarOriginalFormula;
	public Boolean isPermisoEliminarFormula;
	public Boolean isPermisoGuardarCambiosFormula;
	public Boolean isPermisoConsultaFormula;
	public Boolean isPermisoBusquedaFormula;
	public Boolean isPermisoReporteFormula;
	public Boolean isPermisoPaginacionMedioFormula;
	public Boolean isPermisoPaginacionAltoFormula;
	public Boolean isPermisoPaginacionTodoFormula;
	public Boolean isPermisoCopiarFormula;
	public Boolean isPermisoVerFormFormula;
	public Boolean isPermisoDuplicarFormula;
	public Boolean isPermisoOrdenFormula;
	
	
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
	
	public FormulaParameterReturnGeneral formulaReturnGeneral;
	public FormulaParameterReturnGeneral formulaParameterGeneral;
	
	

	public TarjetaCreditoLogic tarjetacreditoComisionLogic=null;

	public TarjetaCreditoLogic getTarjetaCreditoComisionLogic() {
		return tarjetacreditoComisionLogic;
	}

	public void setTarjetaCreditoComisionLogic(TarjetaCreditoLogic tarjetacreditoComisionLogic) {
		this.tarjetacreditoComisionLogic = tarjetacreditoComisionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFormula=false;
	public Boolean esParaAccionDesdeFormularioFormula=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FormulaSessionBeanAdditional formulaSessionBeanAdditional=null;
	
	public FormulaSessionBeanAdditional getFormulaSessionBeanAdditional() {
		return this.formulaSessionBeanAdditional;
	}
	
	public void setFormulaSessionBeanAdditional(FormulaSessionBeanAdditional formulaSessionBeanAdditional) {
		try {
			this.formulaSessionBeanAdditional=formulaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FormulaBeanSwingJInternalFrameAdditional formulaBeanSwingJInternalFrameAdditional=null;
	//public class FormulaBeanSwingJInternalFrame
	
	public FormulaBeanSwingJInternalFrameAdditional getFormulaBeanSwingJInternalFrameAdditional() {
		return this.formulaBeanSwingJInternalFrameAdditional;
	}
	
	public void setFormulaBeanSwingJInternalFrameAdditional(FormulaBeanSwingJInternalFrameAdditional formulaBeanSwingJInternalFrameAdditional) {
		try {
			this.formulaBeanSwingJInternalFrameAdditional=formulaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FormulaLogic formulaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Formula formulaBean;
	public FormulaConstantesFunciones formulaConstantesFunciones;
	//public FormulaParameterReturnGeneral formulaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoFormulaLogic tipoformulaLogic;
	
	//PARAMETROS
	
	
	//public List<Formula> formulas;	
	//public List<Formula> formulasEliminados;
	//public List<Formula> formulasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFormula=false;
	public Boolean isVisibilidadCeldaDuplicarFormula=true;
	public Boolean isVisibilidadCeldaCopiarFormula=true;
	public Boolean isVisibilidadCeldaVerFormFormula=true;
	public Boolean isVisibilidadCeldaOrdenFormula=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFormula=false;
	public Boolean isVisibilidadCeldaModificarFormula=false;
	public Boolean isVisibilidadCeldaActualizarFormula=false;
	public Boolean isVisibilidadCeldaEliminarFormula=false;
	public Boolean isVisibilidadCeldaCancelarFormula=false;
	public Boolean isVisibilidadCeldaGuardarFormula=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFormula=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoFormula=false;
	
	public Long getiIdNuevoFormula() {
		return this.iIdNuevoFormula;
	}

	public void setiIdNuevoFormula(Long iIdNuevoFormula) {
		this.iIdNuevoFormula = iIdNuevoFormula;
	}
	
	public Long getidFormulaActual() {
		return this.idFormulaActual;
	}

	public void setidFormulaActual(Long idFormulaActual) {
		this.idFormulaActual = idFormulaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Formula getformula() {
		return this.formula;
	}

	public void setformula(Formula formula) {
		this.formula = formula;
	}
	
	public Formula getformulaAux() {
		return this.formulaAux;
	}

	public void setformulaAux(Formula formulaAux) {
		this.formulaAux = formulaAux;
	}				
	
	public Formula getformulaAnterior() {
		return this.formulaAnterior;
	}

	public void setformulaAnterior(Formula formulaAnterior) {
		this.formulaAnterior = formulaAnterior;
	}	
	
	public Formula getformulaTotales() {
		return this.formulaTotales;
	}

	public void setformulaTotales(Formula formulaTotales) {
		this.formulaTotales = formulaTotales;
	}	
	
	public Formula getformulaBean() {
		return this.formulaBean;
	}

	public void setformulaBean(Formula formulaBean) {
		this.formulaBean = formulaBean;
	}	
	
	public FormulaParameterReturnGeneral getformulaReturnGeneral() {
		return this.formulaReturnGeneral;
	}

	public void setformulaReturnGeneral(FormulaParameterReturnGeneral formulaReturnGeneral) {
		this.formulaReturnGeneral = formulaReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_tipo_formulaFK_IdTipoFormula=-1L;

	public Long getid_tipo_formulaFK_IdTipoFormula() {
		return this.id_tipo_formulaFK_IdTipoFormula;
	}

	public void setid_tipo_formulaFK_IdTipoFormula(Long id_tipo_formulaFK_IdTipoFormula) {
		this.id_tipo_formulaFK_IdTipoFormula = id_tipo_formulaFK_IdTipoFormula;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FormulaLogic getFormulaLogic()	{		
		return formulaLogic;
	}

	public void setFormulaLogic(FormulaLogic formulaLogic) {
		this.formulaLogic = formulaLogic;
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
	
	public Boolean getIsEsNuevoFormula() {
		return isEsNuevoFormula;
	}

	public void setIsEsNuevoFormula(Boolean isEsNuevoFormula) {
		this.isEsNuevoFormula = isEsNuevoFormula;
	}

	public Boolean getEsParaAccionDesdeFormularioFormula() {
		return esParaAccionDesdeFormularioFormula;
	}
	
	public void setEsParaAccionDesdeFormularioFormula(Boolean esParaAccionDesdeFormularioFormula) {
		this.esParaAccionDesdeFormularioFormula = esParaAccionDesdeFormularioFormula;
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

			if(this.formulaSessionBean==null) {
				this.formulaSessionBean=new FormulaSessionBean();
			}

			if(!this.formulaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(formulaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTipoFormulasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoformulasForeignKey=new ArrayList<TipoFormula>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoFormulaLogic tipoformulaLogic=new TipoFormulaLogic();

			//tipoformulaLogic.getTipoFormulaDataAccess().setIsForForeingKeyData(true);

			if(this.formulaSessionBean==null) {
				this.formulaSessionBean=new FormulaSessionBean();
			}

			if(!this.formulaSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormula()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoformulaLogic.getTipoFormulaDataAccess().setIsForForeingKeyData(true);

					tipoformulaLogic.getTodosTipoFormulasWithConnection(sFinalQuery,new Pagination());

					this.tipoformulasForeignKey=tipoformulaLogic.getTipoFormulas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoFormula(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformulaLogic.getEntityWithConnection(formulaSessionBean.getlidTipoFormulaActual());
					this.tipoformulasForeignKey.add(tipoformulaLogic.getTipoFormula());
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

					if(this.formula!=null) {
						this.formula.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFormula!=null) {
						this.jInternalFrameDetalleFormFormula.jComboBoxid_empresaFormula.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFormula.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFormula!=null) {
						if(this.jInternalFrameDetalleFormFormula.jComboBoxid_empresaFormula.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormula.jComboBoxid_empresaFormula.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFormulaGenerico)throws Exception
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
				jComboBoxid_empresaFormulaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFormulaGenerico!=null && jComboBoxid_empresaFormulaGenerico.getItemCount()>0) {
					jComboBoxid_empresaFormulaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoFormulaForeignKey(Long idTipoFormulaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoFormula  tipoformulaTemp=null;

			for(TipoFormula tipoformulaAux:tipoformulasForeignKey) {
				if(tipoformulaAux.getId()!=null && tipoformulaAux.getId().equals(idTipoFormulaSeleccionado)) {
					tipoformulaTemp=tipoformulaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoformulaTemp!=null) {

					if(this.formula!=null) {
						this.formula.setTipoFormula(tipoformulaTemp);
					}

					if(this.jInternalFrameDetalleFormFormula!=null) {
						this.jInternalFrameDetalleFormFormula.jComboBoxid_tipo_formulaFormula.setSelectedItem(tipoformulaTemp);
					}
				} else {
					//jComboBoxid_tipo_formulaFormula.setSelectedItem(tipoformulaTemp);
					if(this.jInternalFrameDetalleFormFormula!=null) {
						if(this.jInternalFrameDetalleFormFormula.jComboBoxid_tipo_formulaFormula.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormula.jComboBoxid_tipo_formulaFormula.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoFormula") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoformulaTemp!=null && jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula!=null) {
						jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula.setSelectedItem(tipoformulaTemp);
					} else {
						if(jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula!=null) {
							//jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula.setSelectedItem(tipoformulaTemp);
							if(jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula.getItemCount()>0) {
								jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoFormulaForeignKeyDescripcion(Long idTipoFormulaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoFormula  tipoformulaTemp=null;

			for(TipoFormula tipoformulaAux:tipoformulasForeignKey) {
				if(tipoformulaAux.getId()!=null && tipoformulaAux.getId().equals(idTipoFormulaSeleccionado)) {
					tipoformulaTemp=tipoformulaAux;
					break;
				}
			}


			sDescripcion=TipoFormulaConstantesFunciones.getTipoFormulaDescripcion(tipoformulaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoFormulaForeignKeyGenerico(Long idTipoFormulaSeleccionado,JComboBox jComboBoxid_tipo_formulaFormulaGenerico)throws Exception
	{
		try
		{
			TipoFormula  tipoformulaTemp=null;

			for(TipoFormula tipoformulaAux:tipoformulasForeignKey) {
				if(tipoformulaAux.getId()!=null && tipoformulaAux.getId().equals(idTipoFormulaSeleccionado)) {
					tipoformulaTemp=tipoformulaAux;
					break;
				}
			}

			if(tipoformulaTemp!=null) {
				jComboBoxid_tipo_formulaFormulaGenerico.setSelectedItem(tipoformulaTemp);
			} else {
				if(jComboBoxid_tipo_formulaFormulaGenerico!=null && jComboBoxid_tipo_formulaFormulaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_formulaFormulaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Formula formula,JComboBox jComboBoxid_empresaFormulaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFormulaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFormula.jComboBoxid_empresaFormula.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFormulaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				formula.setid_empresa(empresaAux.getId());
				formula.setempresa_descripcion(FormulaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				formula.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoFormulaForeignKey(Formula formula,JComboBox jComboBoxid_tipo_formulaFormulaGenerico)throws Exception
	{
		try
		{
			TipoFormula  tipoformulaAux=new TipoFormula();

			if(jComboBoxid_tipo_formulaFormulaGenerico==null) {
				tipoformulaAux=(TipoFormula)this.jInternalFrameDetalleFormFormula.jComboBoxid_tipo_formulaFormula.getSelectedItem();
			} else {
				tipoformulaAux=(TipoFormula)jComboBoxid_tipo_formulaFormulaGenerico.getSelectedItem();
			}

			if(tipoformulaAux!=null && tipoformulaAux.getId()!=null) {
				formula.setid_tipo_formula(tipoformulaAux.getId());
				formula.settipoformula_descripcion(FormulaConstantesFunciones.getTipoFormulaDescripcion(tipoformulaAux));
				formula.setTipoFormula(tipoformulaAux);			}
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

					if(!FormulaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormula!=null) { 
							this.jInternalFrameDetalleFormFormula.jComboBoxid_empresaFormula.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFormula.jComboBoxid_empresaFormula.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormula!=null) { 
					}

					if(!FormulaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoFormulasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoFormula=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormulaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormula!=null) { 
							this.jInternalFrameDetalleFormFormula.jComboBoxid_tipo_formulaFormula.removeAllItems();

							for(TipoFormula tipoformula:this.tipoformulasForeignKey) {
								this.jInternalFrameDetalleFormFormula.jComboBoxid_tipo_formulaFormula.addItem(tipoformula);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormula!=null) { 
					}

					if(!FormulaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoFormula") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormulaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula.removeAllItems();

							for(TipoFormula tipoformula:this.tipoformulasForeignKey) {
								this.jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula.addItem(tipoformula);
							}
						}

						if(!FormulaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormula!=null) {
							this.jInternalFrameDetalleFormFormula.jComboBoxid_empresaFormula.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormula!=null) {
							this.jInternalFrameDetalleFormFormula.jComboBoxid_empresaFormula.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoFormulaForeignKey(TipoFormula tipoformula,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormula!=null) {
							this.jInternalFrameDetalleFormFormula.jComboBoxid_tipo_formulaFormula.setSelectedItem(tipoformula);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormula!=null) {
							this.jInternalFrameDetalleFormFormula.jComboBoxid_tipo_formulaFormula.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula.setSelectedItem(tipoformula);
						} else {
							this.jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesFormula() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FormulaConstantesFunciones.refrescarForeignKeysDescripcionesFormula(this.formulaLogic.getFormulas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FormulaConstantesFunciones.refrescarForeignKeysDescripcionesFormula(this.formulas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoFormula.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//formulaLogic.setFormulas(this.formulas);
			formulaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FormulaParameterReturnGeneral getFormulaParameterGeneral() {
		return this.formulaParameterGeneral;
	}
	
	public void setFormulaParameterGeneral(FormulaParameterReturnGeneral formulaParameterGeneral) {
		this.formulaParameterGeneral = formulaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFormula() {
		return isPermisoTodoFormula;
	}

	public void setIsPermisoTodoFormula(Boolean isPermisoTodoFormula) {
		this.isPermisoTodoFormula = isPermisoTodoFormula;
	}

	public Boolean getIsPermisoNuevoFormula() {
		return isPermisoNuevoFormula;
	}

	public void setIsPermisoNuevoFormula(Boolean isPermisoNuevoFormula) {
		this.isPermisoNuevoFormula = isPermisoNuevoFormula;
	}

	public Boolean getIsPermisoActualizarFormula() {
		return isPermisoActualizarFormula;
	}

	public void setIsPermisoActualizarFormula(Boolean isPermisoActualizarFormula) {
		this.isPermisoActualizarFormula = isPermisoActualizarFormula;
	}

	public Boolean getIsPermisoEliminarFormula() {
		return isPermisoEliminarFormula;
	}

	public void setIsPermisoEliminarFormula(Boolean isPermisoEliminarFormula) {
		this.isPermisoEliminarFormula = isPermisoEliminarFormula;
	}

	public Boolean getIsPermisoGuardarCambiosFormula() {
		return isPermisoGuardarCambiosFormula;
	}

	public void setIsPermisoGuardarCambiosFormula(Boolean isPermisoGuardarCambiosFormula) {
		this.isPermisoGuardarCambiosFormula = isPermisoGuardarCambiosFormula;
	}
	
	public Boolean getIsPermisoConsultaFormula() {
		return isPermisoConsultaFormula;
	}

	public void setIsPermisoConsultaFormula(Boolean isPermisoConsultaFormula) {
		this.isPermisoConsultaFormula = isPermisoConsultaFormula;
	}

	public Boolean getIsPermisoBusquedaFormula() {
		return isPermisoBusquedaFormula;
	}

	public void setIsPermisoBusquedaFormula(Boolean isPermisoBusquedaFormula) {
		this.isPermisoBusquedaFormula = isPermisoBusquedaFormula;
	}

	public Boolean getIsPermisoReporteFormula() {
		return isPermisoReporteFormula;
	}

	public void setIsPermisoReporteFormula(Boolean isPermisoReporteFormula) {
		this.isPermisoReporteFormula = isPermisoReporteFormula;
	}
	
	public Boolean getIsPermisoPaginacionMedioFormula() {
		return isPermisoPaginacionMedioFormula;
	}

	public void setIsPermisoPaginacionMedioFormula(Boolean isPermisoPaginacionMedioFormula) {
		this.isPermisoPaginacionMedioFormula = isPermisoPaginacionMedioFormula;
	}
	
	public Boolean getIsPermisoPaginacionTodoFormula() {
		return isPermisoPaginacionTodoFormula;
	}

	public void setIsPermisoPaginacionTodoFormula(Boolean isPermisoPaginacionTodoFormula) {
		this.isPermisoPaginacionTodoFormula = isPermisoPaginacionTodoFormula;
	}
	
	public Boolean getIsPermisoPaginacionAltoFormula() {
		return isPermisoPaginacionAltoFormula;
	}

	public void setIsPermisoPaginacionAltoFormula(Boolean isPermisoPaginacionAltoFormula) {
		this.isPermisoPaginacionAltoFormula = isPermisoPaginacionAltoFormula;
	}
	
	public Boolean getIsPermisoCopiarFormula() {
		return isPermisoCopiarFormula;
	}

	public void setIsPermisoCopiarFormula(Boolean isPermisoCopiarFormula) {
		this.isPermisoCopiarFormula = isPermisoCopiarFormula;
	}
	
	public Boolean getIsPermisoVerFormFormula() {
		return isPermisoVerFormFormula;
	}

	public void setIsPermisoVerFormFormula(Boolean isPermisoVerFormFormula) {
		this.isPermisoVerFormFormula = isPermisoVerFormFormula;
	}
	
	public Boolean getIsPermisoDuplicarFormula() {
		return isPermisoDuplicarFormula;
	}

	public void setIsPermisoDuplicarFormula(Boolean isPermisoDuplicarFormula) {
		this.isPermisoDuplicarFormula = isPermisoDuplicarFormula;
	}
	
	public Boolean getIsPermisoOrdenFormula() {
		return isPermisoOrdenFormula;
	}

	public void setIsPermisoOrdenFormula(Boolean isPermisoOrdenFormula) {
		this.isPermisoOrdenFormula = isPermisoOrdenFormula;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFormula() {
		return isVisibilidadCeldaNuevoFormula;
	}

	public void setIsVisibilidadCeldaNuevoFormula(Boolean isVisibilidadCeldaNuevoFormula) {
		this.isVisibilidadCeldaNuevoFormula = isVisibilidadCeldaNuevoFormula;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFormula() {
		return isVisibilidadCeldaDuplicarFormula;
	}

	public void setIsVisibilidadCeldaDuplicarFormula(Boolean isVisibilidadCeldaDuplicarFormula) {
		this.isVisibilidadCeldaDuplicarFormula = isVisibilidadCeldaDuplicarFormula;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFormula() {
		return isVisibilidadCeldaCopiarFormula;
	}

	public void setIsVisibilidadCeldaCopiarFormula(Boolean isVisibilidadCeldaCopiarFormula) {
		this.isVisibilidadCeldaCopiarFormula = isVisibilidadCeldaCopiarFormula;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFormula() {
		return isVisibilidadCeldaVerFormFormula;
	}

	public void setIsVisibilidadCeldaVerFormFormula(Boolean isVisibilidadCeldaVerFormFormula) {
		this.isVisibilidadCeldaVerFormFormula = isVisibilidadCeldaVerFormFormula;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFormula() {
		return isVisibilidadCeldaOrdenFormula;
	}

	public void setIsVisibilidadCeldaOrdenFormula(Boolean isVisibilidadCeldaOrdenFormula) {
		this.isVisibilidadCeldaOrdenFormula = isVisibilidadCeldaOrdenFormula;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFormula() {
		return isVisibilidadCeldaNuevoRelacionesFormula;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFormula(Boolean isVisibilidadCeldaNuevoRelacionesFormula) {
		this.isVisibilidadCeldaNuevoRelacionesFormula = isVisibilidadCeldaNuevoRelacionesFormula;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFormula() {
		return isVisibilidadCeldaModificarFormula;
	}

	public void setIsVisibilidadCeldaModificarFormula(Boolean isVisibilidadCeldaModificarFormula) {
		this.isVisibilidadCeldaModificarFormula = isVisibilidadCeldaModificarFormula;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFormula() {
		return isVisibilidadCeldaActualizarFormula;
	}

	public void setIsVisibilidadCeldaActualizarFormula(Boolean isVisibilidadCeldaActualizarFormula) {
		this.isVisibilidadCeldaActualizarFormula = isVisibilidadCeldaActualizarFormula;
	}

	public Boolean getIsVisibilidadCeldaEliminarFormula() {
		return isVisibilidadCeldaEliminarFormula;
	}

	public void setIsVisibilidadCeldaEliminarFormula(Boolean isVisibilidadCeldaEliminarFormula) {
		this.isVisibilidadCeldaEliminarFormula = isVisibilidadCeldaEliminarFormula;
	}

	public Boolean getIsVisibilidadCeldaCancelarFormula() {
		return isVisibilidadCeldaCancelarFormula;
	}

	public void setIsVisibilidadCeldaCancelarFormula(Boolean isVisibilidadCeldaCancelarFormula) {
		this.isVisibilidadCeldaCancelarFormula = isVisibilidadCeldaCancelarFormula;
	}

	public Boolean getIsVisibilidadCeldaGuardarFormula() {
		return isVisibilidadCeldaGuardarFormula;
	}

	public void setIsVisibilidadCeldaGuardarFormula(Boolean isVisibilidadCeldaGuardarFormula) {
		this.isVisibilidadCeldaGuardarFormula = isVisibilidadCeldaGuardarFormula;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFormula() {
		return isVisibilidadCeldaGuardarCambiosFormula;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFormula(Boolean isVisibilidadCeldaGuardarCambiosFormula) {
		this.isVisibilidadCeldaGuardarCambiosFormula = isVisibilidadCeldaGuardarCambiosFormula;
	}
		
	public FormulaSessionBean getformulaSessionBean() {
		return this.formulaSessionBean;
	}
	
	public void setformulaSessionBean(FormulaSessionBean formulaSessionBean) {
		this.formulaSessionBean=formulaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoFormula() {
		return this.isVisibilidadFK_IdTipoFormula;
	}

	public void setisVisibilidadFK_IdTipoFormula(Boolean isVisibilidadFK_IdTipoFormula) {
		this.isVisibilidadFK_IdTipoFormula=isVisibilidadFK_IdTipoFormula;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFormula(Formula formula)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(formula,null);
				this.setActualParaGuardarTipoFormulaForeignKey(formula,null);
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
	
	public void bugActualizarReferenciaActual(Formula formula,Formula formulaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFormula(formula);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		formulaAux.setId(formula.getId());
		formulaAux.setVersionRow(formula.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFormula();
		
			int intSelectedRow = this.jTableDatosFormula.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFormula(this.formula,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = formulaValidator.getInvalidValues(this.formula);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			formulaLogic.setDatosCliente(datosCliente);
			formulaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				formulaAux=new  Formula();
				
				formulaAux.setIsNew(true);
				formulaAux.setIsChanged(true);
				
				formulaAux.setFormulaOriginal(this.formula);
				
				formulaAux.setId(this.formula.getId());	
				formulaAux.setVersionRow(this.formula.getVersionRow());	
				formulaAux.setid_empresa(this.formula.getid_empresa());	
				formulaAux.setid_tipo_formula(this.formula.getid_tipo_formula());	
				formulaAux.setcodigo(this.formula.getcodigo());	
				formulaAux.setnombre(this.formula.getnombre());	
				formulaAux.setalias(this.formula.getalias());	
				formulaAux.setvalor(this.formula.getvalor());	
				formulaAux.setformula1(this.formula.getformula1());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formulaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formulaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(formulaAux,formulaLogic.getFormulas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formulaAux,formulas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.formulaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formulaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formulaLogic.saveFormulas();//WithConnection
						//formulaLogic.getSetVersionRowFormulas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formula,formulaAux);
					
					this.refrescarForeignKeysDescripcionesFormula();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formulaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos().addAll(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos.addAll(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formulaLogic.saveFormulaRelaciones(formulaAux,this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());//WithConnection
								//formulaLogic.getSetVersionRowFormulas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formula,formulaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.setTarjetaCreditos(new ArrayList<TarjetaCredito>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos= new ArrayList<TarjetaCredito>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();}
							formulaAux.setTarjetaCreditoComisions(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formulaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.formulaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formulaAux,formulaLogic.getFormulas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formulaAux,formulas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formula,formulaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				formulaAux=new  Formula();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.formulaSessionBean.getEsGuardarRelacionado() 
					|| (this.formulaSessionBean.getEsGuardarRelacionado() && this.formula.getId()>=0)) {
						
					formulaAux.setIsNew(false);
				}
				
				formulaAux.setIsDeleted(false);
			
				formulaAux.setId(this.formula.getId());	
				formulaAux.setVersionRow(this.formula.getVersionRow());	
				formulaAux.setid_empresa(this.formula.getid_empresa());	
				formulaAux.setid_tipo_formula(this.formula.getid_tipo_formula());	
				formulaAux.setcodigo(this.formula.getcodigo());	
				formulaAux.setnombre(this.formula.getnombre());	
				formulaAux.setalias(this.formula.getalias());	
				formulaAux.setvalor(this.formula.getvalor());	
				formulaAux.setformula1(this.formula.getformula1());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formulaAux,formulaLogic.getFormulas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formulaAux,formulas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.formulaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formulaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formulaLogic.saveFormulas();//WithConnection
						//formulaLogic.getSetVersionRowFormulas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formula,formulaAux);
					
					this.refrescarForeignKeysDescripcionesFormula();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formulaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos().addAll(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos.addAll(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formulaLogic.saveFormulaRelaciones(formulaAux,this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());//WithConnection
								//formulaLogic.getSetVersionRowFormulas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formula,formulaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.setTarjetaCreditos(new ArrayList<TarjetaCredito>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos= new ArrayList<TarjetaCredito>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();}
							formulaAux.setTarjetaCreditoComisions(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formulaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.formulaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formulaAux,formulaLogic.getFormulas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formulaAux,formulas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formula,formulaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				formulaAux=new  Formula();
				
				formulaAux.setIsNew(false);
				formulaAux.setIsChanged(false);
				
				formulaAux.setIsDeleted(true);
				
				formulaAux.setId(this.formula.getId());	
				formulaAux.setVersionRow(this.formula.getVersionRow());	
				formulaAux.setid_empresa(this.formula.getid_empresa());	
				formulaAux.setid_tipo_formula(this.formula.getid_tipo_formula());	
				formulaAux.setcodigo(this.formula.getcodigo());	
				formulaAux.setnombre(this.formula.getnombre());	
				formulaAux.setalias(this.formula.getalias());	
				formulaAux.setvalor(this.formula.getvalor());	
				formulaAux.setformula1(this.formula.getformula1());	
				
				if(this.formulaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.formulaAux.getId()>=0) {	
						this.formulasEliminados.add(formulaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(formulaAux,formulaLogic.getFormulas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formulaAux,formulas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.formulaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formulaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formulaLogic.saveFormulas();//WithConnection
						//formulaLogic.getSetVersionRowFormulas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formulaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos().addAll(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos.addAll(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formulaLogic.saveFormulaRelaciones(formulaAux,this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());//WithConnection
								//formulaLogic.getSetVersionRowFormulas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.setTarjetaCreditos(new ArrayList<TarjetaCredito>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos= new ArrayList<TarjetaCredito>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();}
							formulaAux.setTarjetaCreditoComisions(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.formulaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.formulaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(formulaAux,formulaLogic.getFormulas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(formulaAux,formulas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.getFormulas().addAll(this.formulasEliminados);
					
					formulaLogic.saveFormulas();//WithConnection
					//formulaLogic.getSetVersionRowFormulas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesFormula();
				
				this.formulasEliminados= new ArrayList<Formula>();		
			}
			
			if(this.formulaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Formula GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Formula",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.formula=formulaAux;
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
      		//this.finishProcessFormula();
      	}
		
	}	
	
	public void actualizarRelaciones(Formula formulaLocal) throws Exception {
		
		if(this.formulaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				formulaLocal.setTarjetaCreditoComisions(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());
			
			} else {
			
				formulaLocal.setTarjetaCreditoComisions(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Formula formulaLocal) throws Exception {	
		if(this.formulaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				formulaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoFormulaDetalleFormJInternalFrame.class)) {
				TipoFormulaBeanSwingJInternalFrame tipoformulaBeanSwingJInternalFrameLocal=(TipoFormulaBeanSwingJInternalFrame) ((TipoFormulaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoformulaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoFormula(tipoformulaBeanSwingJInternalFrameLocal.gettipoformula(),true);
				tipoformulaBeanSwingJInternalFrameLocal.actualizarLista(tipoformulaBeanSwingJInternalFrameLocal.tipoformula,this.tipoformulasForeignKey);

				tipoformulaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoformulaBeanSwingJInternalFrameLocal.tipoformula);

				formulaLocal.setTipoFormula(tipoformulaBeanSwingJInternalFrameLocal.tipoformula);

				this.addItemDefectoCombosForeignKeyTipoFormula();
				this.cargarCombosFrameTipoFormulasForeignKey("Formulario");
				this.setActualTipoFormulaForeignKey(tipoformulaBeanSwingJInternalFrameLocal.tipoformula.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFormulaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFormula.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = formulaValidator.getInvalidValues(this.formula);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Formula formula,List<Formula> formulas) throws Exception {
		try	{		
			FormulaConstantesFunciones.actualizarLista(formula,formulas,this.formulaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Formula formula,List<Formula> formulas) throws Exception {
		try	{			
			FormulaConstantesFunciones.actualizarSelectedLista(formula,formulas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Formula> formulasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				formulasLocal=this.formulaLogic.getFormulas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				formulasLocal=this.formulas;
			}
			//ARCHITECTURE
		
			for(Formula formulaLocal:formulasLocal) {
				if(this.permiteMantenimiento(formulaLocal) && formulaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FormulaConstantesFunciones.getFormulaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FormulaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormula.jLabelid_empresaFormula,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormulaConstantesFunciones.IDTIPOFORMULA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormula.jLabelid_tipo_formulaFormula,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormulaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormula.jLabelcodigoFormula,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormulaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormula.jLabelnombreFormula,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormulaConstantesFunciones.ALIAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormula.jLabelaliasFormula,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormulaConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormula.jLabelvalorFormula,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormulaConstantesFunciones.FORMULA1)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormula.jLabelformula1Formula,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFormula!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormula.jLabelid_empresaFormula,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormula.jLabelid_tipo_formulaFormula,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormula.jLabelcodigoFormula,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormula.jLabelnombreFormula,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormula.jLabelaliasFormula,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormula.jLabelvalorFormula,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormula.jLabelformula1Formula,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("TarjetaCredito")) {
			if(this.formula==null) {
				this.formula= new Formula();
			}

			if(this.formulaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoFormula
				this.setVariablesFormularioToObjetoActualFormula(this.formula,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);

				this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.gettarjetacredito().setFormulaComision(this.formula);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoFormula--;	
		
		
		this.formulaAux=new Formula();
		
		this.formulaAux.setId(this.iIdNuevoFormula);
		this.formulaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formulaLogic.getFormulas().add(this.formulaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.formulas.add(this.formulaAux);
		}
		//ARCHITECTURE
		
		this.formula=this.formulaAux;
		
		if(FormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFormula(this.formula);
			this.setVariablesObjetoActualToFormularioForeignKeyFormula(this.formula);
		}
				
		//this.setDefaultControlesFormula();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFormula();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFormula();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormula();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormula(this.formulaBean,this.formula,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(FormulaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.formulaSessionBean.getConGuardarRelaciones()) {
			classes=FormulaConstantesFunciones.getClassesRelationshipsOfFormula(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.formulaReturnGeneral=formulaLogic.procesarEventosFormulasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formulaLogic.getFormulas(),this.formula,this.formulaParameterGeneral,this.isEsNuevoFormula,classes);//this.formulaLogic.getFormula()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFormula(this.formulaReturnGeneral,this.formulaBean,false);
		
		if(this.formulaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFormula(this.formulaReturnGeneral.getFormula());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFormula(this.formulaReturnGeneral.getFormula());
		}
		
		if(this.formulaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFormula(this.formulaReturnGeneral.getFormula(),classes);//this.formulaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFormula(this.formula,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFormula();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFormula();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormulaBeanSwingJInternalFrameAdditional.RecargarFormFormula(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFormula(false);
						
			if(formulaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.getEsGuardarRelacionado() && TarjetaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTarjetaCreditoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(FormulaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormula();
			}
			
			this.actualizarVisualTableDatosFormula();
			
			this.jTableDatosFormula.setRowSelectionInterval(this.getIndiceNuevoFormula(), this.getIndiceNuevoFormula());
			
			this.seleccionarFilaTablaFormulaActual();
						
			this.actualizarEstadoCeldasBotonesFormula("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFormula(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFormula.jTextFieldcodigoFormula.setEnabled(isHabilitar && this.formulaConstantesFunciones.activarcodigoFormula);
		this.jInternalFrameDetalleFormFormula.jTextAreanombreFormula.setEnabled(isHabilitar && this.formulaConstantesFunciones.activarnombreFormula);
		this.jInternalFrameDetalleFormFormula.jTextFieldaliasFormula.setEnabled(isHabilitar && this.formulaConstantesFunciones.activaraliasFormula);
		this.jInternalFrameDetalleFormFormula.jTextFieldvalorFormula.setEnabled(isHabilitar && this.formulaConstantesFunciones.activarvalorFormula);
		this.jInternalFrameDetalleFormFormula.jTextAreaformula1Formula.setEnabled(isHabilitar && this.formulaConstantesFunciones.activarformula1Formula);	
		//
		this.jInternalFrameDetalleFormFormula.jComboBoxid_empresaFormula.setEnabled(isHabilitar && this.formulaConstantesFunciones.activarid_empresaFormula);
		this.jInternalFrameDetalleFormFormula.jComboBoxid_tipo_formulaFormula.setEnabled(isHabilitar && this.formulaConstantesFunciones.activarid_tipo_formulaFormula);
	};
	
	public void setDefaultControlesFormula() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFormula(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.formulaSessionBean.setConGuardarRelaciones(true);			
			this.formulaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFormula.jTabbedPaneRelacionesFormula.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.formulaSessionBean.setConGuardarRelaciones(false);			
			this.formulaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFormula.jTabbedPaneRelacionesFormula.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoFormula() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Formula formulaAux:this.formulaLogic.getFormulas()) {
				if(formulaAux.getId().equals(this.iIdNuevoFormula)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Formula formulaAux:this.formulas) {
				if(formulaAux.getId().equals(this.iIdNuevoFormula)) {
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
	
	public int getIndiceActualFormula(Formula formula,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Formula formulaAux:this.formulaLogic.getFormulas()) {
				if(formulaAux.getId().equals(formula.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Formula formulaAux:this.formulas) {
				if(formulaAux.getId().equals(formula.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFormula(Formula formulaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Formula formulaAux:this.formulaLogic.getFormulas()) {
				if(formulaAux.getFormulaOriginal().getId().equals(formulaOriginal.getId())) {
					existe=true;
					formulaOriginal.setId(formulaAux.getId());
					formulaOriginal.setVersionRow(formulaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Formula formulaAux:this.formulas) {
				if(formulaAux.getFormulaOriginal().getId().equals(formulaOriginal.getId())) {
					existe=true;
					formulaOriginal.setId(formulaAux.getId());
					formulaOriginal.setVersionRow(formulaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFormula(Boolean esParaCancelar) throws Exception {
		formulasAux=new ArrayList<Formula>();
		formulaAux=new Formula();
		
		if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Formula formulaAux:this.formulaLogic.getFormulas()) {
					if(formulaAux.getId()<0) {
						formulasAux.add(formulaAux);
					}		
				}
				this.iIdNuevoFormula=0L;
				this.formulaLogic.getFormulas().removeAll(formulasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Formula formulaAux:this.formulas) {
					if(formulaAux.getId()<0) {
						formulasAux.add(formulaAux);
					}		
				}
				this.iIdNuevoFormula=0L;
				this.formulas.removeAll(formulasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFormula 
					&& this.formulaLogic.getFormulas().size()>0
					) {
					formulaAux=this.formulaLogic.getFormulas().get(this.formulaLogic.getFormulas().size() - 1);
				
					if(formulaAux.getId()<0) {
						this.formulaLogic.getFormulas().remove(formulaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFormula && this.formulas.size()>0) {
					formulaAux=this.formulas.get(this.formulas.size() - 1);
				
					if(formulaAux.getId()<0) {
						this.formulas.remove(formulaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFormula(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(formula.getId()<0) {
				this.formulaLogic.getFormulas().remove(this.formula);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(formula.getId()<0) {
				this.formulas.remove(this.formula);
			}
		}			
	}
	
	public void setEstadosInicialesFormula(List<Formula> formulasAux) throws Exception {
		FormulaConstantesFunciones.setEstadosInicialesFormula(formulasAux);
	}
	
	public void setEstadosInicialesFormula(Formula formulaAux) throws Exception {
		FormulaConstantesFunciones.setEstadosInicialesFormula(formulaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFormulaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFormula("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFormulaActual()) {
				if(!this.isEsNuevoFormula) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFormula("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFormula=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFormulaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Formula ?", "MANTENIMIENTO DE Formula", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFormula("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Formula formula) throws Exception {
		FormulaConstantesFunciones.seleccionarAsignar(this.formula,formula);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFormula=this.isPermisoActualizarOriginalFormula;
			
			
			this.seleccionarAsignar(formula);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormulaConstantesFunciones.quitarEspaciosFormula(this.formula,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFormula("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.formulaSessionBean.setsFuncionBusquedaRapida(this.formulaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFormula) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFormula(esParaCancelar);				
				this.cancelarNuevoFormula(esParaCancelar);								
			}
			
			this.formula=new Formula();
			
			this.inicializarFormula();
			
			this.actualizarEstadoCeldasBotonesFormula("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFormula() throws Exception {
		try {
			FormulaConstantesFunciones.inicializarFormula(this.formula);
			
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
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.formulaLogic.getFormulas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFormulas(String sAccionBusqueda,List<Formula> formulasParaReportes) throws Exception {
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
					sPathReporteFinal="Formula"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FormulaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FormulaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Formula"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Formulas");		
		parameters.put("busquedapor", FormulaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(TarjetaCredito.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					FormulaLogic formulaLogicAuxiliar=new FormulaLogic();
					formulaLogicAuxiliar.setDatosCliente(formulaLogic.getDatosCliente());				
					formulaLogicAuxiliar.setFormulas(formulasParaReportes);
					
					formulaLogicAuxiliar.cargarRelacionesLoteForeignKeyFormulaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					formulasParaReportes=formulaLogicAuxiliar.getFormulas();
					
					//formulaLogic.getNewConnexionToDeep();
					
					//for (Formula formula:formulasParaReportes) {
					//	formulaLogic.deepLoad(formula, false, DeepLoadType.INCLUDE, classes);
					//}						
					//formulaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//formulaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileTarjetaCredito = AuxiliarReportes.class.getResourceAsStream("TarjetaCreditoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_tarjetacredito", reportFileTarjetaCredito);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFormula=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FormulaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FormulaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFormula=new JRBeanArrayDataSource(FormulaJInternalFrame.TraerFormulaBeans(formulasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFormula);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FormulaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FormulaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FormulaBean.TraerFormulaBeans(formulasParaReportes).toArray()));
							
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
				this.generarExcelReporteFormulas(sAccionBusqueda,sTipoArchivoReporte,formulasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFormulas(sAccionBusqueda,sTipoArchivoReporte,formulasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFormulaActionPerformed(null);
					//this.generarExcelReporteFormulas(sAccionBusqueda,sTipoArchivoReporte,formulasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFormulas(sAccionBusqueda,sTipoArchivoReporte,formulasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFormulas(sAccionBusqueda,sTipoArchivoReporte,formulasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFormulas(sAccionBusqueda,sTipoArchivoReporte,formulasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFormulas(String sAccionBusqueda,String sTipoArchivoReporte,List<Formula> formulasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formula";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Formulas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormula("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Formula formula : formulasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FormulaConstantesFunciones.generarExcelReporteDataFormula("NORMAL",row,workbook,formula,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formula",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFormula(String sTipo,Row row,Workbook workbook) {
		
		FormulaConstantesFunciones.generarExcelReporteHeaderFormula(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFormulas(String sAccionBusqueda,String sTipoArchivoReporte,List<Formula> formulasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formula_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Formulas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Formula formula : formulasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FormulaConstantesFunciones.getFormulaDescripcion(formula));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormulaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormulaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formula.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormulaConstantesFunciones.LABEL_IDTIPOFORMULA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormulaConstantesFunciones.LABEL_IDTIPOFORMULA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formula.gettipoformula_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormulaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormulaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formula.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormulaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormulaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formula.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormulaConstantesFunciones.LABEL_ALIAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormulaConstantesFunciones.LABEL_ALIAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formula.getalias());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormulaConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormulaConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formula.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormulaConstantesFunciones.LABEL_FORMULA1))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormulaConstantesFunciones.LABEL_FORMULA1);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formula.getformula1());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formula",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFormulas(String sAccionBusqueda,String sTipoArchivoReporte,List<Formula> formulasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Formula> formulasRespaldo=null;
		
		classes=FormulaConstantesFunciones.getClassesRelationshipsOfFormula(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.formulaLogic.setDatosCliente(this.datosCliente);
		this.formulaLogic.setDatosDeep(this.datosDeep);
		this.formulaLogic.setIsConDeep(true);
		
		formulasRespaldo=this.formulaLogic.getFormulas();
		
		this.formulaLogic.setFormulas(formulasParaReportes);	
		this.formulaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		formulasParaReportes=this.formulaLogic.getFormulas();
		this.formulaLogic.setFormulas(formulasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formula_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Formulas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormula("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Formula formula : formulasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFormula("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FormulaConstantesFunciones.generarExcelReporteDataFormula("NORMAL",row,workbook,formula,cellStyleDataAux);
		
			
			


				//TarjetaCredito
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO))) {

				if(formula.getTarjetaCreditoComisions()!=null && formula.getTarjetaCreditoComisions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TarjetaCreditoConstantesFunciones.generarExcelReporteHeaderTarjetaCredito("RELACIONADO",row,workbook);
				}

				if(formula.getTarjetaCreditoComisions()!=null) {
					i2=0;
					for(TarjetaCredito tarjetacredito : formula.getTarjetaCreditoComisions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TarjetaCreditoConstantesFunciones.generarExcelReporteDataTarjetaCredito("RELACIONADO",row,workbook,tarjetacredito,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FormulaConstantesFunciones.getFormulaDescripcion(formula));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formula",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormula.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormula.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormula.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormula.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFormula() throws Exception {		
		this.startProcessFormula(true);
	}
	
	public void startProcessFormula(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFormula ,this.jPanelParametrosReportesFormula, this.jScrollPanelDatosFormula,this.jPanelPaginacionFormula, this.jScrollPanelDatosEdicionFormula, this.jPanelAccionesFormula,this.jPanelAccionesFormularioFormula,this.jmenuBarFormula,this.jmenuBarDetalleFormula,this.jTtoolBarFormula,this.jTtoolBarDetalleFormula);		
		
		final JTabbedPane jTabbedPaneBusquedasFormula=this.jTabbedPaneBusquedasFormula; 
		
		final JPanel jPanelParametrosReportesFormula=this.jPanelParametrosReportesFormula;
		//final JScrollPane jScrollPanelDatosFormula=this.jScrollPanelDatosFormula;
		final JTable jTableDatosFormula=this.jTableDatosFormula;		
		final JPanel jPanelPaginacionFormula=this.jPanelPaginacionFormula;
		//final JScrollPane jScrollPanelDatosEdicionFormula=this.jScrollPanelDatosEdicionFormula;
		final JPanel jPanelAccionesFormula=this.jPanelAccionesFormula;
		
		JPanel jPanelCamposAuxiliarFormula=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFormula=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFormula!=null) {
			jPanelCamposAuxiliarFormula=this.jInternalFrameDetalleFormFormula.jPanelCamposFormula;
			jPanelAccionesFormularioAuxiliarFormula=this.jInternalFrameDetalleFormFormula.jPanelAccionesFormularioFormula;
		}
		
		final JPanel jPanelCamposFormula=jPanelCamposAuxiliarFormula;
		final JPanel jPanelAccionesFormularioFormula=jPanelAccionesFormularioAuxiliarFormula;
		
		
		final JMenuBar jmenuBarFormula=this.jmenuBarFormula;
		final JToolBar jTtoolBarFormula=this.jTtoolBarFormula;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFormula=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormula=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFormula!=null) {
			jmenuBarDetalleAuxiliarFormula=this.jInternalFrameDetalleFormFormula.jmenuBarDetalleFormula;
			jTtoolBarDetalleAuxiliarFormula=this.jInternalFrameDetalleFormFormula.jTtoolBarDetalleFormula;
		}
		
		final JMenuBar jmenuBarDetalleFormula=jmenuBarDetalleAuxiliarFormula;
		final JToolBar jTtoolBarDetalleFormula=jTtoolBarDetalleAuxiliarFormula;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormula;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormula;
			processRunnable.jTableDatos=jTableDatosFormula;
			processRunnable.jPanelCampos=jPanelCamposFormula;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormula;
			processRunnable.jPanelAcciones=jPanelAccionesFormula;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormula;
			
			
			processRunnable.jmenuBar=jmenuBarFormula;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormula;
			processRunnable.jTtoolBar=jTtoolBarFormula;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormula;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormula ,jPanelParametrosReportesFormula,jTableDatosFormula, /*jScrollPanelDatosFormula,*/jPanelCamposFormula,jPanelPaginacionFormula, /*jScrollPanelDatosEdicionFormula,*/ jPanelAccionesFormula,jPanelAccionesFormularioFormula,jmenuBarFormula,jmenuBarDetalleFormula,jTtoolBarFormula,jTtoolBarDetalleFormula);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormula ,jPanelParametrosReportesFormula, jScrollPanelDatosFormula,jPanelPaginacionFormula, jScrollPanelDatosEdicionFormula, jPanelAccionesFormula,jPanelAccionesFormularioFormula,jmenuBarFormula,jmenuBarDetalleFormula,jTtoolBarFormula,jTtoolBarDetalleFormula);
						
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
	
	public void finishProcessFormula() {// throws Exception 
		this.finishProcessFormula(true);
	}
	
	public void finishProcessFormula(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFormula ,this.jPanelParametrosReportesFormula, this.jScrollPanelDatosFormula,this.jPanelPaginacionFormula, this.jScrollPanelDatosEdicionFormula, this.jPanelAccionesFormula,this.jPanelAccionesFormularioFormula,this.jmenuBarFormula,this.jmenuBarDetalleFormula,this.jTtoolBarFormula,this.jTtoolBarDetalleFormula);		
		
		final JTabbedPane jTabbedPaneBusquedasFormula=this.jTabbedPaneBusquedasFormula; 
		
		final JPanel jPanelParametrosReportesFormula=this.jPanelParametrosReportesFormula;
		//final JScrollPane jScrollPanelDatosFormula=this.jScrollPanelDatosFormula;
		final JTable jTableDatosFormula=this.jTableDatosFormula;		
		final JPanel jPanelPaginacionFormula=this.jPanelPaginacionFormula;
		//final JScrollPane jScrollPanelDatosEdicionFormula=this.jScrollPanelDatosEdicionFormula;
		final JPanel jPanelAccionesFormula=this.jPanelAccionesFormula;
		
		JPanel jPanelCamposAuxiliarFormula=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFormula=new JPanel();
		
		if(this.jInternalFrameDetalleFormFormula!=null) {
			jPanelCamposAuxiliarFormula=this.jInternalFrameDetalleFormFormula.jPanelCamposFormula;
			jPanelAccionesFormularioAuxiliarFormula=this.jInternalFrameDetalleFormFormula.jPanelAccionesFormularioFormula;
		}
		
		final JPanel jPanelCamposFormula=jPanelCamposAuxiliarFormula;
		final JPanel jPanelAccionesFormularioFormula=jPanelAccionesFormularioAuxiliarFormula;
		
		
		final JMenuBar jmenuBarFormula=this.jmenuBarFormula;		
		final JToolBar jTtoolBarFormula=this.jTtoolBarFormula;
				
		JMenuBar jmenuBarDetalleAuxiliarFormula=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormula=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFormula!=null) {
			jmenuBarDetalleAuxiliarFormula=this.jInternalFrameDetalleFormFormula.jmenuBarDetalleFormula;
			jTtoolBarDetalleAuxiliarFormula=this.jInternalFrameDetalleFormFormula.jTtoolBarDetalleFormula;		
		}
		
		final JMenuBar jmenuBarDetalleFormula=jmenuBarDetalleAuxiliarFormula;
		final JToolBar jTtoolBarDetalleFormula=jTtoolBarDetalleAuxiliarFormula;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormula;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormula;
			processRunnable.jTableDatos=jTableDatosFormula;
			processRunnable.jPanelCampos=jPanelCamposFormula;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormula;
			processRunnable.jPanelAcciones=jPanelAccionesFormula;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormula;
			
			
			processRunnable.jmenuBar=jmenuBarFormula;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormula;
			processRunnable.jTtoolBar=jTtoolBarFormula;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormula;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFormula ,jPanelParametrosReportesFormula, jTableDatosFormula,/*jScrollPanelDatosFormula,*/jPanelCamposFormula,jPanelPaginacionFormula, /*jScrollPanelDatosEdicionFormula,*/ jPanelAccionesFormula,jPanelAccionesFormularioFormula,jmenuBarFormula,jmenuBarDetalleFormula,jTtoolBarFormula,jTtoolBarDetalleFormula));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFormula(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFormula(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFormula(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFormula(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFormula,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFormula,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFormula(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFormula,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFormula,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.formulaConstantesFunciones.getsFinalQueryFormula();
		String  finalQueryPaginacionTodos=this.formulaConstantesFunciones.getsFinalQueryFormula();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FormulaConstantesFunciones.getArrayColumnasGlobalesNoFormula(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FormulaConstantesFunciones.getArrayColumnasGlobalesFormula(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FormulaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.formulasEliminados= new ArrayList<Formula>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFormula();
		
				///*FormulaSessionBean*/this.formulaSessionBean=new FormulaSessionBean();
			
			if(this.formulaSessionBean==null) {
				this.formulaSessionBean=new FormulaSessionBean();
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
					this.iNumeroPaginacion=FormulaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FormulaConstantesFunciones.getClassesForeignKeysOfFormula(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/formula."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			formulasAux= new ArrayList<Formula>();
			
				
			formulaLogic.setDatosCliente(this.datosCliente);
			formulaLogic.setDatosDeep(this.datosDeep);
			formulaLogic.setIsConDeep(true);
			
			
			formulaLogic.getFormulaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					formulaLogic.getTodosFormulas(finalQueryGlobal,pagination);
					
					//formulaLogic.getTodosFormulasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(formulaLogic.getFormulas()==null|| formulaLogic.getFormulas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formulasAux= new ArrayList<Formula>();
							formulasAux.addAll(formulaLogic.getFormulas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulasAux= new ArrayList<Formula>();
							formulasAux.addAll(formulas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formulaLogic.getTodosFormulas(finalQueryGlobal+"",this.pagination);												
							
							//formulaLogic.getTodosFormulasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFormulas("Todos",formulaLogic.getFormulas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formulaLogic.setFormulas(new ArrayList<Formula>());					
							formulaLogic.getFormulas().addAll(formulasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulas=new ArrayList<Formula>();
							formulas.addAll(formulasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFormula=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFormula=this.idActual;
				
				} else if(this.idFormulaActual!=null && this.idFormulaActual!=0L) {
					idFormula=idFormulaActual;
				}
				
					
				this.sDetalleReporte=FormulaConstantesFunciones.getDetalleIndicePorId(idFormula);
				
				this.formulas=new ArrayList<Formula>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					formulaLogic.getEntity(idFormula);
					
					//formulaLogic.getEntityWithConnection(idFormula);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulaLogic.setFormulas(new ArrayList<Formula>());
					formulaLogic.getFormulas().add(formulaLogic.getFormula());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formulas=new ArrayList<Formula>();
					this.formulas.add(formula);
				}
				
				if(formulaLogic.getFormula()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=FormulaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formulaLogic.getFormulasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormulaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormulaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formulaLogic.getFormulas()==null||formulaLogic.getFormulas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formulas==null|| formulas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formulasAux=new ArrayList<Formula>();
						formulasAux.addAll(formulaLogic.getFormulas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulasAux=new ArrayList<Formula>();
							formulasAux.addAll(formulas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formulaLogic.getFormulasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormulaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormulaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormulas("FK_IdEmpresa",formulaLogic.getFormulas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormulas("FK_IdEmpresa",formulas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formulaLogic.setFormulas(new ArrayList<Formula>());
						formulaLogic.getFormulas().addAll(formulasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulas=new ArrayList<Formula>();
							formulas.addAll(formulasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoFormula")) {
				this.sDetalleReporte=FormulaConstantesFunciones.getDetalleIndiceFK_IdTipoFormula(id_tipo_formulaFK_IdTipoFormula);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formulaLogic.getFormulasFK_IdTipoFormula(finalQueryGlobal,pagination,id_tipo_formulaFK_IdTipoFormula);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormulaConstantesFunciones.getDetalleIndiceFK_IdTipoFormula(id_tipo_formulaFK_IdTipoFormula);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormulaConstantesFunciones.getDetalleIndiceFK_IdTipoFormula(id_tipo_formulaFK_IdTipoFormula);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formulaLogic.getFormulas()==null||formulaLogic.getFormulas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formulas==null|| formulas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formulasAux=new ArrayList<Formula>();
						formulasAux.addAll(formulaLogic.getFormulas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulasAux=new ArrayList<Formula>();
							formulasAux.addAll(formulas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formulaLogic.getFormulasFK_IdTipoFormula(finalQueryGlobal,pagination,id_tipo_formulaFK_IdTipoFormula);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormulaConstantesFunciones.getDetalleIndiceFK_IdTipoFormula(id_tipo_formulaFK_IdTipoFormula);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormulaConstantesFunciones.getDetalleIndiceFK_IdTipoFormula(id_tipo_formulaFK_IdTipoFormula);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormulas("FK_IdTipoFormula",formulaLogic.getFormulas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormulas("FK_IdTipoFormula",formulas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formulaLogic.setFormulas(new ArrayList<Formula>());
						formulaLogic.getFormulas().addAll(formulasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulas=new ArrayList<Formula>();
							formulas.addAll(formulasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFormula();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFormula();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formulaLogic.getFormulas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formulas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formulaLogic.getFormulas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formulas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Formula formula) {
		Boolean permite=true;
		
		if(this.formula.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FormulaConstantesFunciones.getOrderByListaFormula();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FormulaConstantesFunciones.getOrderByListaFormula();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Formula formula:formulaLogic.getFormulas()) {
				if(formula.getsType().equals(Constantes2.S_TOTALES)) {
					formulaTotales=formula;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Formula formula:this.formulas) {
				if(formula.getsType().equals(Constantes2.S_TOTALES)) {
					formulaTotales=formula;
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
			this.formulaAux=new Formula();
			this.formulaAux.setsType(Constantes2.S_TOTALES);
			this.formulaAux.setIsNew(false);
			this.formulaAux.setIsChanged(false);
			this.formulaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FormulaConstantesFunciones.TotalizarValoresFilaFormula(this.formulaLogic.getFormulas(),this.formulaAux);
				
				this.formulaLogic.getFormulas().add(this.formulaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FormulaConstantesFunciones.TotalizarValoresFilaFormula(this.formulas,this.formulaAux);
				
				this.formulas.add(this.formulaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		formulaTotales=new Formula();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formulaLogic.getFormulas().remove(formulaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formulas.remove(formulaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		formulaTotales=new Formula();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Formula formula:formulaLogic.getFormulas()) {
				if(formula.getsType().equals(Constantes2.S_TOTALES)) {
					formulaTotales=formula;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormulaConstantesFunciones.TotalizarValoresFilaFormula(this.formulaLogic.getFormulas(),formulaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Formula formula:this.formulas) {
				if(formula.getsType().equals(Constantes2.S_TOTALES)) {
					formulaTotales=formula;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormulaConstantesFunciones.TotalizarValoresFilaFormula(this.formulas,formulaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFormulasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormulasFK_IdTipoFormula()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoFormula";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFormulasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulaLogic.getFormulasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormulasFK_IdTipoFormula(String sFinalQuery,Long id_tipo_formula)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulaLogic.getFormulasFK_IdTipoFormula(sFinalQuery,this.pagination,id_tipo_formula);
				
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
	
	public void inicializarPermisosFormula() {
		this.isPermisoTodoFormula=false;
		this.isPermisoNuevoFormula=false;
		this.isPermisoActualizarFormula=false;
		this.isPermisoActualizarOriginalFormula=false;
		this.isPermisoEliminarFormula=false;
		this.isPermisoGuardarCambiosFormula=false;
		this.isPermisoConsultaFormula=false;
		this.isPermisoBusquedaFormula=false;
		this.isPermisoReporteFormula=false;		
		this.isPermisoOrdenFormula=false;		
		this.isPermisoPaginacionMedioFormula=false;		
		this.isPermisoPaginacionAltoFormula=false;
		this.isPermisoPaginacionTodoFormula=false;
		this.isPermisoCopiarFormula=false;		
		this.isPermisoVerFormFormula=false;		
		this.isPermisoDuplicarFormula=false;		
		this.isPermisoOrdenFormula=false;		
	}
	
	public void setPermisosUsuarioFormula(Boolean isPermiso) {
		this.isPermisoTodoFormula=isPermiso;
		this.isPermisoNuevoFormula=isPermiso;
		this.isPermisoActualizarFormula=isPermiso;
		this.isPermisoActualizarOriginalFormula=isPermiso;
		this.isPermisoEliminarFormula=isPermiso;
		this.isPermisoGuardarCambiosFormula=isPermiso;
		this.isPermisoConsultaFormula=isPermiso;
		this.isPermisoBusquedaFormula=isPermiso;
		this.isPermisoReporteFormula=isPermiso;
		this.isPermisoOrdenFormula=isPermiso;		
		this.isPermisoPaginacionMedioFormula=isPermiso;		
		this.isPermisoPaginacionAltoFormula=isPermiso;		
		this.isPermisoPaginacionTodoFormula=isPermiso;		
		this.isPermisoCopiarFormula=isPermiso;		
		this.isPermisoVerFormFormula=isPermiso;		
		this.isPermisoDuplicarFormula=isPermiso;
		this.isPermisoOrdenFormula=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFormula(Boolean isPermiso) {
		//this.isPermisoTodoFormula=isPermiso;
		this.isPermisoNuevoFormula=isPermiso;
		this.isPermisoActualizarFormula=isPermiso;
		this.isPermisoActualizarOriginalFormula=isPermiso;
		this.isPermisoEliminarFormula=isPermiso;
		this.isPermisoGuardarCambiosFormula=isPermiso;
		//this.isPermisoConsultaFormula=isPermiso;
		//this.isPermisoBusquedaFormula=isPermiso;
		//this.isPermisoReporteFormula=isPermiso;
		//this.isPermisoOrdenFormula=isPermiso;		
		//this.isPermisoPaginacionMedioFormula=isPermiso;		
		//this.isPermisoPaginacionAltoFormula=isPermiso;		
		//this.isPermisoPaginacionTodoFormula=isPermiso;		
		//this.isPermisoCopiarFormula=isPermiso;		
		//this.isPermisoDuplicarFormula=isPermiso;
		//this.isPermisoOrdenFormula=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFormulaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(TarjetaCreditoConstantesFunciones.SNOMBREOPCION);
		
		if(FormulaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosTarjetaCredito=false;
		this.isTienePermisosTarjetaCredito=this.verificarGetPermisosUsuarioOpcionFormulaClaseRelacionada(this.opcionsRelacionadas,TarjetaCreditoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebFormula(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFormulaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosTarjetaCredito=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioFormulaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFormulaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFormulaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosTarjetaCredito && this.jInternalFrameDetalleFormFormula!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFormula.jTabbedPaneRelacionesFormula.remove(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioFormula() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FormulaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.formulaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FormulaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFormula=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFormula=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFormula=this.isPermisoActualizarFormula;
			this.isPermisoEliminarFormula=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFormula=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFormula=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFormula=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFormula=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFormula=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormula=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFormula=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFormula=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFormula=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFormula=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFormula=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFormula=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormula=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.formulaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFormula.setToolTipText(this.jTableDatosFormula.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFormula(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFormula(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FormulaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FormulaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFormula() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosTarjetaCredito && this.formulaConstantesFunciones.mostrarTarjetaCreditoFormula && !FormulaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Tarjeta Credito");
			reporte.setsDescripcion("Tarjeta Credito");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyFormulaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipoformulasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFormulaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FormulaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFormulaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoFormulaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoFormulaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoformulasForeignKey==null||this.tipoformulasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoFormulaConstantesFunciones.getArrayColumnasGlobalesTipoFormula(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFormulaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoFormulaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoFormulasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyFormulaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			FormulaParameterReturnGeneral formulaReturnGeneral=new FormulaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.formulaConstantesFunciones.cargarid_empresaFormula)
					 || (this.esRecargarFks && this.formulaConstantesFunciones.cargarid_empresaFormula)) {

					if(!this.formulaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+formulaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoFormula="";

				if(((this.tipoformulasForeignKey==null||this.tipoformulasForeignKey.size()<=0) && this.formulaConstantesFunciones.cargarid_tipo_formulaFormula)
					 || (this.esRecargarFks && this.formulaConstantesFunciones.cargarid_tipo_formulaFormula)) {

					if(!this.formulaSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormula()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoFormulaConstantesFunciones.getArrayColumnasGlobalesTipoFormula(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoFormula=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFormulaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoFormula=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoFormula, "");
						finalQueryGlobalTipoFormula+=TipoFormulaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoFormulasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoFormula=" WHERE " + ConstantesSql.ID + "="+formulaSessionBean.getlidTipoFormulaActual();
					}
				} else {
					finalQueryGlobalTipoFormula="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				formulaReturnGeneral=formulaLogic.cargarCombosLoteForeignKeyFormula(finalQueryGlobalEmpresa,finalQueryGlobalTipoFormula);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=formulaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoFormula.equals("NONE")) {
				this.tipoformulasForeignKey=formulaReturnGeneral.gettipoformulasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFormula()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoFormula();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.formulaSessionBean==null) {
				this.formulaSessionBean=new FormulaSessionBean();
			}

			if(!this.formulaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoFormula()throws Exception {
		try {

			if(!this.formulaSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormula()) {
				TipoFormula tipoformula=new TipoFormula();
				TipoFormulaConstantesFunciones.setTipoFormulaDescripcion(tipoformula,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoformula.setId(null);

				if(!TipoFormulaConstantesFunciones.ExisteEnLista(this.tipoformulasForeignKey,tipoformula,true)) {

					this.tipoformulasForeignKey.add(0,tipoformula);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyFormula()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFormula(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFormula()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormula();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFormula(Formula formula)throws Exception {	
		try {
			
			this.setActualTipoFormulaForeignKey(formula.getid_tipo_formula(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFormula(Formula formula,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFormula()throws Exception {	
		try {
			
			this.setActualTipoFormulaForeignKey(this.formulaConstantesFunciones.getid_tipo_formula(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFormula()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFormula()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFormula()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFormula()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFormula()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoFormulasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFormula(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoFormulasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFormula()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFormula.jComboBoxid_empresaFormula!=null && this.jInternalFrameDetalleFormFormula.jComboBoxid_empresaFormula.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormula.jComboBoxid_empresaFormula.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormula.jComboBoxid_tipo_formulaFormula!=null && this.jInternalFrameDetalleFormFormula.jComboBoxid_tipo_formulaFormula.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormula.jComboBoxid_tipo_formulaFormula.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public FormulaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FormulaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FormulaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.formulaSessionBean=new FormulaSessionBean(); 
		this.formulaConstantesFunciones=new FormulaConstantesFunciones(); 
		this.formulaBean=new Formula();//(this.formulaConstantesFunciones); 		
		this.formulaReturnGeneral=new FormulaParameterReturnGeneral(); 
		
		this.formulaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formulaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FormulaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FormulaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FormulaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFormula(true);
			
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
			
			this.formulaConstantesFunciones=new FormulaConstantesFunciones(); 
			this.formulaBean=new Formula();//this.formulaConstantesFunciones); 			
			this.formulaReturnGeneral=new FormulaParameterReturnGeneral(); 
		
			FormulaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formula Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.formula=new Formula();
			this.formulas = new ArrayList<Formula>();
			this.formulasAux = new ArrayList<Formula>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic=new FormulaLogic();
				this.formulaLogic.getNewConnexionToDeep("");
			}
			
			//this.formulaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.formulaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFormula);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFormula!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormula);	
					}
					
					if(this.jInternalFrameImportacionFormula!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormula);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFormula!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFormula);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFormula!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFormula);
				this.jInternalFrameDetalleFormFormula.setVisible(false);
				this.jInternalFrameDetalleFormFormula.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFormula!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormula);
					this.jInternalFrameReporteDinamicoFormula.setVisible(false);
					this.jInternalFrameReporteDinamicoFormula.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFormula!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFormula);
					this.jInternalFrameImportacionFormula.setVisible(false);
					this.jInternalFrameImportacionFormula.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFormula!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFormula);
					this.jInternalFrameOrderByFormula.setVisible(false);
					this.jInternalFrameOrderByFormula.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFormulaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FormulaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.formulaReturnGeneral=new FormulaParameterReturnGeneral();
			
			this.formulaParameterGeneral=new FormulaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.formulaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FormulaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.formulaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(TarjetaCreditoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormulaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formulaSessionBean.getEsGuardarRelacionado(),this.formulaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormulaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formulaSessionBean.getEsGuardarRelacionado(),this.formulaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFormula=false;
			this.isVisibilidadCeldaDuplicarFormula=true;
			this.isVisibilidadCeldaCopiarFormula=true;
			this.isVisibilidadCeldaVerFormFormula=true;
			this.isVisibilidadCeldaOrdenFormula=true;
			this.isVisibilidadCeldaNuevoRelacionesFormula=false;
			this.isVisibilidadCeldaModificarFormula=false;
			this.isVisibilidadCeldaActualizarFormula=false;
			this.isVisibilidadCeldaEliminarFormula=false;
			this.isVisibilidadCeldaCancelarFormula=false;
			this.isVisibilidadCeldaGuardarFormula=false;
			this.isVisibilidadCeldaGuardarCambiosFormula=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoFormula=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFormula("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFormula();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFormula(false);
			
			this.setPermisosUsuarioFormula();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formulaSessionBean.getEsGuardarRelacionado() 
				|| (this.formulaSessionBean.getEsGuardarRelacionado() && this.formulaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFormulaClasesRelacionadas();
			}
			
			if(this.formulaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFormulaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FormulaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFormula();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFormula();
			}
			
			if(!this.isPermisoBusquedaFormula) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFormula.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formulaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFormula,this.isPermisoPaginacionMedioFormula,this.isPermisoPaginacionTodoFormula);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FormulaConstantesFunciones.getTiposSeleccionarFormula());
				
				this.tiposColumnasSelect=FormulaConstantesFunciones.getTiposSeleccionarFormula(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectFormula();				
				//this.tiposRelacionesSelect=FormulaConstantesFunciones.getTiposRelacionesFormula(true);
				
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
			//if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFormula();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioFormula(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioFormula(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFormula() ;
			
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
			
			
			this.tarjetacreditoComisionLogic=new TarjetaCreditoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.tipoformulaLogic=new TipoFormulaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				formulaImplementable= (FormulaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormulaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				formulaImplementableHome= (FormulaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormulaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.formulas= new ArrayList<Formula>();
			this.formulasEliminados= new ArrayList<Formula>();
						
			this.isEsNuevoFormula=false;
			this.esParaAccionDesdeFormularioFormula=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipoformulasForeignKey=new ArrayList<TipoFormula>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFormula(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFormula();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FormulaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FormulaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFormula("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFormula(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFormula!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFormula();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFormula();
			}
			
			FormulaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFormula.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFormula.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFormula.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFormula(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Formula: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFormula() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFormula")) {
				iIndex=this.jInternalFrameDetalleFormFormula.jTabbedPaneRelacionesFormula.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFormula.jTabbedPaneRelacionesFormula.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFormula.getSelectedRow();	
				
				

				if(sTitle.equals("Tarjeta Creditos")) {
					if(!TarjetaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessFormula();

						this.cargarParteTabPanelRelacionadaTarjetaCredito(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFormula();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaTarjetaCredito(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormFormula.cargarSessionConBeanSwingJInternalFrameTarjetaCredito(false,true,iIndex);
		this.jButtonTarjetaCreditoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTarjetaCredito();

		//this.jTabbedPaneRelacionesFormula.updateUI();
		//this.jTabbedPaneRelacionesFormula.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesFormula.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("TarjetaCredito")) {
				int row=this.jTableDatosFormula.getSelectedRow();
				jButtonTarjetaCreditoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Tarjeta Credito")) {

					if(this.isTienePermisosTarjetaCredito && this.formulaConstantesFunciones.mostrarTarjetaCreditoFormula && !FormulaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Tarjeta Creditos"+"("+TarjetaCreditoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Tarjeta Creditos");

						if(formulaConstantesFunciones.resaltarTarjetaCreditoFormula!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(formulaConstantesFunciones.resaltarTarjetaCreditoFormula);
						}

						jmenuItem.setEnabled(this.formulaConstantesFunciones.activarTarjetaCreditoFormula);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TarjetaCredito"));

						

						this.jInternalFrameDetalleFormFormula.jmenuDetalleFormula.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyFormula(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFormula(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFormula(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFormulaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFormula();
		
		this.cargarCombosFrameForeignKeyFormula();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFormula();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFormula();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoFormula(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoFormulaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoFormula();
				this.cargarCombosFrameTipoFormulasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoFormula(this.tipoformulasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoFormulaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.formulaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFormula==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
			
			
			if(jTableDatosFormula.getRowCount()>=1) {
				jTableDatosFormula.removeRowSelectionInterval(0, jTableDatosFormula.getRowCount()-1);						
			}
			
			this.isEsNuevoFormula=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFormula(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFormula(true);			
			//this.formula=new Formula();
			//this.formula.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormula(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormula() ;
			
			if(FormulaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormula(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.formula);	
			this.actualizarInformacion("INFO_PADRE",false,this.formula);				
			
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
			
			if(this.formulaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Formula: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFormulaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Formula> formulasSeleccionados=new ArrayList<Formula>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFormula.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFormula.getSelectedRows().length;			
			}
			
			formulasSeleccionados=this.getFormulasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFormula--;			
				//Formula formulaAux= new Formula();			
				//formulaAux.setId(this.iIdNuevoFormula);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Formula formulaOrigen=new Formula();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Formula formulaOrigen : formulasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFormula.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							formulaOrigen =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulaOrigen =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFormula();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.formula.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFormula(formulaOrigen,this.formula,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formulaLogic.getFormulas().add(this.formulaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formulas.add(this.formulaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFormula(false);
				
				this.jTableDatosFormula.setRowSelectionInterval(this.getIndiceNuevoFormula(), this.getIndiceNuevoFormula());
				
				int iLastRow =  this.jTableDatosFormula.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormula.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormula.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormula(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Formula> formulasSeleccionados=new ArrayList<Formula>();									
		
			Formula formulaOrigen=new Formula();
			Formula formulaDestino=new Formula();
				
			formulasSeleccionados=this.getFormulasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFormula.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || formulasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFormula.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formulaOrigen =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formulaOrigen =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formulaDestino =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formulaDestino =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				formulaOrigen =formulasSeleccionados.get(0);
				formulaDestino =formulasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFormula(formulaOrigen,formulaDestino,true,false);
				
				formulaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formulaDestino,formulaLogic.getFormulas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formulaDestino,formulas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFormula(false);
				
				//this.jTableDatosFormula.setRowSelectionInterval(this.getIndiceNuevoFormula(), this.getIndiceNuevoFormula());
				
				int iLastRow =  this.jTableDatosFormula.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormula.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormula.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormula(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormula==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFormula.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFormula.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFormula.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFormula.setVisible(!isVisible);
			this.jPanelPaginacionFormula.setVisible(!isVisible);
			this.jPanelAccionesFormula.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFormula();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFormula();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFormula();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFormula();
			
			this.abrirFrameOrderByFormula();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFormula();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFormula(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormula);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFormula.isMaximum()) {
					this.jInternalFrameDetalleFormFormula.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFormula.setSize(this.jInternalFrameDetalleFormFormula.iWidthFormulario,this.jInternalFrameDetalleFormFormula.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFormula.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFormula.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFormula.isMaximum()) {
						this.jInternalFrameDetalleFormFormula.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFormula.jContentPaneDetalleFormula.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFormula.jTabbedPaneRelacionesFormula.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFormula.jContentPaneDetalleFormula.getWidth(),FormulaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormula.jTabbedPaneRelacionesFormula.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFormula.jContentPaneDetalleFormula.getWidth(),FormulaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormula.jTabbedPaneRelacionesFormula.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFormula.jContentPaneDetalleFormula.getWidth(),FormulaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(TarjetaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTarjetaCredito();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFormula.setVisible(true);
	        this.jInternalFrameDetalleFormFormula.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFormula() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFormula==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFormula=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormula,false,this);
				} else {
					this.jInternalFrameOrderByFormula=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormula,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFormula);
				this.jInternalFrameOrderByFormula.setVisible(false);
				this.jInternalFrameOrderByFormula.setSelected(false);
				
				this.jInternalFrameOrderByFormula.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormula"));
				
				this.inicializarActualizarBindingTablaOrderByFormula();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFormula() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFormula==null) {
				
				this.jInternalFrameImportacionFormula=new ImportacionJInternalFrame(FormulaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormula);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFormula);
				this.jInternalFrameImportacionFormula.setVisible(false);
				this.jInternalFrameImportacionFormula.setSelected(false);


				this.jInternalFrameImportacionFormula.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormula"));
				this.jInternalFrameImportacionFormula.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormula"));
				this.jInternalFrameImportacionFormula.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormula"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFormula() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFormula==null) {
				this.jInternalFrameReporteDinamicoFormula=new ReporteDinamicoJInternalFrame(FormulaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormula);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormula);
				this.jInternalFrameReporteDinamicoFormula.setVisible(false);
				this.jInternalFrameReporteDinamicoFormula.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFormula.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormula"));
				this.jInternalFrameReporteDinamicoFormula.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormula"));
				this.jInternalFrameReporteDinamicoFormula.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormula"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormula();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaTarjetaCredito() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormFormula.jContentPaneDetalleFormula.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleFormula() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormula);
			
	       	this.jInternalFrameDetalleFormFormula.setVisible(false);
	        this.jInternalFrameDetalleFormFormula.setSelected(false);
			
			//this.jInternalFrameDetalleFormFormula.dispose();
			//this.jInternalFrameDetalleFormFormula=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFormula() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFormula.setVisible(true);
	        this.jInternalFrameReporteDinamicoFormula.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFormula() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFormula.setVisible(true);
	        this.jInternalFrameImportacionFormula.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFormula() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFormula.setVisible(true);
	        this.jInternalFrameOrderByFormula.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFormula() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFormula.setVisible(false);
	        this.jInternalFrameOrderByFormula.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFormula() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFormula.setVisible(false);
	        this.jInternalFrameReporteDinamicoFormula.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFormula() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFormula.setVisible(false);
	        this.jInternalFrameImportacionFormula.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFormula(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFormula(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormula.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFormula(true);
			//this.isEsNuevoFormula=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFormula("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormula(false) ;
			
			if(formulaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.getEsGuardarRelacionado() && TarjetaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTarjetaCreditoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(FormulaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormula(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormula(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFormulaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFormula.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFormula(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormula==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormula.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFormula(true);
			//this.isEsNuevoFormula=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.formula.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFormula("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFormula(false) ;
			
			if(FormulaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormula(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormula(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoFormula(List<TipoFormula> tipoformulasForeignKey)throws Exception{
		TableColumn tableColumnTipoFormula=this.jTableDatosFormula.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormula,FormulaConstantesFunciones.LABEL_IDTIPOFORMULA));
		TableCellEditor tableCellEditorTipoFormula =tableColumnTipoFormula.getCellEditor();

		TipoFormulaTableCell tipoformulaTableCellFk=(TipoFormulaTableCell)tableCellEditorTipoFormula;

		if(tipoformulaTableCellFk!=null) {
			tipoformulaTableCellFk.settipoformulasForeignKey(tipoformulasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormula.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoformulaTableCellFk.setRowActual(intSelectedRow);
			//tipoformulaTableCellFk.settipoformulasForeignKeyActual(tipoformulasForeignKey);
		//}


		if(tipoformulaTableCellFk!=null) {
			tipoformulaTableCellFk.RecargarTipoFormulasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFormula(false);
			
			//if(!this.isEsNuevoFormula) {								
				int intSelectedRow = this.jTableDatosFormula.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFormula(this.formula,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
				
			}
			
			if(this.permiteMantenimiento(this.formula)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.formulaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFormula=true;
					this.inicializarActualizarBindingTablaFormula(false);
					this.isEsNuevoFormula=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFormula=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFormula=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormula(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormula(false);
				
				this.habilitarDeshabilitarControlesFormula(false);
			
												
				
				if(FormulaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFormula();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFormulaActionPerformed(evt,formulaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFormula(this.formula,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFormula.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,formulaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.formula.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Formula.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formula.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFormula.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				this.formula.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				this.formula.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.formula)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.formulaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FormulaModel) this.jTableDatosFormula.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFormula=true;
				this.inicializarActualizarBindingTablaFormula(false);
				this.isEsNuevoFormula=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormula(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormula(false);
				
				this.habilitarDeshabilitarControlesFormula(false);
				
				
				
				if(FormulaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFormula();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFormulaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFormula.getRowCount()>=1) {
				jTableDatosFormula.removeRowSelectionInterval(0, jTableDatosFormula.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFormula(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFormula(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormula(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormula(false) ;
			
			this.isEsNuevoFormula=false;
			
			if(FormulaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFormula();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFormulaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFormula(false);
				
				//SI ES MANUAL
				if(FormulaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFormula();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFormulaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFormula--;			
			//Formula formulaAux= new Formula();			
			//formulaAux.setId(this.iIdNuevoFormula);
			
			if(this.jInternalFrameDetalleFormFormula==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFormula();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
			
			this.formula.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.formulaLogic.getFormulas().add(this.formulaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.formulas.add(this.formulaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFormula(false);
			
			this.jTableDatosFormula.setRowSelectionInterval(this.getIndiceNuevoFormula(), this.getIndiceNuevoFormula());
			
			int iLastRow =  this.jTableDatosFormula.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFormula.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFormula.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFormula(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFormulaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFormula(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormula(false);
			
			//SI ES MANUAL
			if(FormulaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormula();
			}
			
			//this.abrirFrameTreeFormula();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFormulaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE FormulaS ?", "MANTENIMIENTO DE Formula", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFormula.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFormula();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.formulaReturnGeneral=formulaLogic.procesarImportacionFormulasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.formulaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFormulaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFormulaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFormula.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFormula.setFileImportacion(this.jInternalFrameImportacionFormula.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFormula.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFormula.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFormula.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFormula.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFormulaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Formula> formulasSeleccionados=new ArrayList<Formula>();		

		formulasSeleccionados=this.getFormulasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormula.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormula.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FormulaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FormulaBaseDesign.jrxml";
			
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
			
			this.generarReporteFormulas("Todos",formulasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formula",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFormula.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormula.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormulaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormulaConstantesFunciones.LABEL_IDTIPOFORMULA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoFormula_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoFormula_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoFormula_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoFormula_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormulaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormulaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormulaConstantesFunciones.LABEL_ALIAS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ias_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ias_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ias_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ias_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormulaConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormulaConstantesFunciones.LABEL_FORMULA1:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rmula1_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rmula1_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rmula1_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rmula1_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFormula.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFormula.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFormula.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FormulaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case FormulaConstantesFunciones.LABEL_IDTIPOFORMULA:
					sNombreCampoCategoria="id_tipo_formula";
					break;

				case FormulaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case FormulaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case FormulaConstantesFunciones.LABEL_ALIAS:
					sNombreCampoCategoria="alias";
					break;

				case FormulaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case FormulaConstantesFunciones.LABEL_FORMULA1:
					sNombreCampoCategoria="formula1";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFormula.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FormulaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case FormulaConstantesFunciones.LABEL_IDTIPOFORMULA:
					sNombreCampoCategoriaValor="id_tipo_formula";
					break;

				case FormulaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case FormulaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case FormulaConstantesFunciones.LABEL_ALIAS:
					sNombreCampoCategoriaValor="alias";
					break;

				case FormulaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case FormulaConstantesFunciones.LABEL_FORMULA1:
					sNombreCampoCategoriaValor="formula1";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFormula.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormula.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormulaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case FormulaConstantesFunciones.LABEL_IDTIPOFORMULA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Formula",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_formula");
					break;

				case FormulaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case FormulaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case FormulaConstantesFunciones.LABEL_ALIAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Alias",sNombreCampoCategoria,sNombreCampoCategoriaValor,"alias");
					break;

				case FormulaConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case FormulaConstantesFunciones.LABEL_FORMULA1:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formula1",sNombreCampoCategoria,sNombreCampoCategoriaValor,"formula1");
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
	
	public void jButtonGenerarExcelReporteDinamicoFormulaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Formula> formulasSeleccionados=new ArrayList<Formula>();		
		
		formulasSeleccionados=this.getFormulasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formula";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Formulas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFormula.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFormula.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FormulaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormulaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Formula formula:formulasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formula.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormulaConstantesFunciones.LABEL_IDTIPOFORMULA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormulaConstantesFunciones.LABEL_IDTIPOFORMULA);
					iRow++;

					for(Formula formula:formulasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formula.gettipoformula_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormulaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormulaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Formula formula:formulasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formula.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormulaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormulaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Formula formula:formulasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formula.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormulaConstantesFunciones.LABEL_ALIAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormulaConstantesFunciones.LABEL_ALIAS);
					iRow++;

					for(Formula formula:formulasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formula.getalias());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormulaConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormulaConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(Formula formula:formulasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formula.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormulaConstantesFunciones.LABEL_FORMULA1:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormulaConstantesFunciones.LABEL_FORMULA1);
					iRow++;

					for(Formula formula:formulasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formula.getformula1());
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
			//	this.getFilaCabeceraExportarExcelFormula(row);				
			//	iRow++;
			//}				
			
			//for(Formula formulaAux:formulasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFormula(formulaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formula",JOptionPane.INFORMATION_MESSAGE);
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
				this.formulaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormula(false);
			
			//SI ES MANUAL
			if(FormulaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormula();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFormulaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormula(false);
			
			//SI ES MANUAL
			if(FormulaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormula();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFormulaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormula(false);
			
			//SI ES MANUAL
			if(FormulaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormula();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFormula() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFormula.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFormula.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFormula.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFormula.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFormula.setMinimumSize(dimensionMinimum);
		this.jTableDatosFormula.setMaximumSize(dimensionMaximum);
		this.jTableDatosFormula.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFormula(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFormula(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFormula(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFormula(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFormula(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFormula(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormula(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFormula(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FormulaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FormulaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFormula() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFormula();
		
		this.inicializarActualizarBindingBotonesManualFormula(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFormula();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormula() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFormula(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFormula(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFormula.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFormula.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFormula.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFormula!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFormula.jCheckBoxPostAccionNuevoFormula.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFormula.jCheckBoxPostAccionSinCerrarFormula.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFormula.jCheckBoxPostAccionSinMensajeFormula.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFormula.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFormula.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFormula.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFormula!=null) {
				this.jInternalFrameDetalleFormFormula.jCheckBoxPostAccionNuevoFormula.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFormula.jCheckBoxPostAccionSinCerrarFormula.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFormula.jCheckBoxPostAccionSinMensajeFormula.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFormula.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFormula.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFormula!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFormula.jComboBoxTiposAccionesFormularioFormula.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFormula.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFormula!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormula.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFormula.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFormula.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFormula.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFormula.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFormula!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormula.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFormula.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFormula.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFormula(Boolean esInicializar) throws Exception {
		try	{	
			if(FormulaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFormula(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFormula() throws Exception {
		try	{
			if(FormulaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormula();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormula() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFormula.jComboBoxTiposAccionesFormularioFormula.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFormula.jComboBoxTiposAccionesFormularioFormula.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormula() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFormula.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFormula.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFormula.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFormula.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFormula.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFormula.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFormula.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFormula.addItem(reporte);
			}
			
			
			if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFormula.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFormula.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFormula.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFormula.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFormula.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFormula.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFormula.jComboBoxTiposAccionesFormularioFormula.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFormula.jComboBoxTiposAccionesFormularioFormula.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFormula.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFormula.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFormula.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormula();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormula() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormula!=null) {
				this.jInternalFrameReporteDinamicoFormula.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormula.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormula!=null) {
				this.jInternalFrameReporteDinamicoFormula.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormula.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFormula!=null) {
				
				if(this.jInternalFrameReporteDinamicoFormula.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormula.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormula.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFormula.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormula.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormula.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoFormula.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFormula.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=FormulaConstantesFunciones.getTiposSeleccionarFormula(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFormula.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoFormula.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoFormula.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=FormulaConstantesFunciones.getTiposSeleccionarFormula(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFormula.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoFormula.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFormula.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=FormulaConstantesFunciones.getTiposSeleccionarFormula(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormula.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoFormula.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoFormula.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoFormula.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFormula()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula.getSelectedItem()!=null){this.id_tipo_formulaFK_IdTipoFormula=((TipoFormula)this.jComboBoxid_tipo_formulaFK_IdTipoFormulaFormula.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFormula(Boolean esInicializar) throws Exception {				
		if(FormulaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFormula();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFormula() throws Exception {
		this.inicializarActualizarBindingTablaFormula(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFormula() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFormula.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFormula.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormula.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FormulaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFormula.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormula.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FormulaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFormulaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormulaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FormulaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFormula.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormula.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FormulaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFormula.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFormula(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=formulaLogic.getFormulas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=formulas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFormula.setModel(new FormulaModel(this.formulaLogic.getFormulas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFormula.setModel(new FormulaModel(this.formulas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFormula!=null && this.jInternalFrameOrderByFormula.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFormula();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFormula.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormula,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FormulaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FormulaConstantesFunciones.SCLASSWEBTITULO,formulaConstantesFunciones.resaltarSeleccionarFormula,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FormulaConstantesFunciones.SCLASSWEBTITULO,formulaConstantesFunciones.resaltarSeleccionarFormula,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFormula.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormula,FormulaConstantesFunciones.LABEL_ID));

		if(this.formulaConstantesFunciones.mostraridFormula && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormulaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formulaConstantesFunciones.resaltaridFormula,this.formulaConstantesFunciones.activaridFormula,iSizeTabla,this,true,"idFormula","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formulaConstantesFunciones.resaltaridFormula,this.formulaConstantesFunciones.activaridFormula,this,true,"idFormula","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormula.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormula,FormulaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.formulaConstantesFunciones.mostrarid_empresaFormula && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormulaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.formulaConstantesFunciones.resaltarid_empresaFormula,this,this.formulaConstantesFunciones.activarid_empresaFormula,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.formulaConstantesFunciones.resaltarid_empresaFormula,this,this.formulaConstantesFunciones.activarid_empresaFormula,false,"id_empresaFormula","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormulaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormula.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormula,FormulaConstantesFunciones.LABEL_IDTIPOFORMULA));

		if(this.formulaConstantesFunciones.mostrarid_tipo_formulaFormula && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormulaConstantesFunciones.LABEL_IDTIPOFORMULA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoFormulaTableCell(this.tipoformulasForeignKey,this.formulaConstantesFunciones.resaltarid_tipo_formulaFormula,this,this.formulaConstantesFunciones.activarid_tipo_formulaFormula,iSizeTabla));
			tableColumn.setCellEditor(new TipoFormulaTableCell(this.tipoformulasForeignKey,this.formulaConstantesFunciones.resaltarid_tipo_formulaFormula,this,this.formulaConstantesFunciones.activarid_tipo_formulaFormula,true,"id_tipo_formulaFormula","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormulaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormula.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormula,FormulaConstantesFunciones.LABEL_CODIGO));

		if(this.formulaConstantesFunciones.mostrarcodigoFormula && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormulaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.formulaConstantesFunciones.resaltarcodigoFormula,this.formulaConstantesFunciones.activarcodigoFormula,iSizeTabla,this,true,"codigoFormula","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formulaConstantesFunciones.resaltarcodigoFormula,this.formulaConstantesFunciones.activarcodigoFormula,this,true,"codigoFormula","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormulaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormula.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormula,FormulaConstantesFunciones.LABEL_NOMBRE));

		if(this.formulaConstantesFunciones.mostrarnombreFormula && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormulaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.formulaConstantesFunciones.resaltarnombreFormula,this.formulaConstantesFunciones.activarnombreFormula,iSizeTabla,this,true,"nombreFormula","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formulaConstantesFunciones.resaltarnombreFormula,this.formulaConstantesFunciones.activarnombreFormula,this,true,"nombreFormula","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormulaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormula.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormula,FormulaConstantesFunciones.LABEL_ALIAS));

		if(this.formulaConstantesFunciones.mostraraliasFormula && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormulaConstantesFunciones.LABEL_ALIAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.formulaConstantesFunciones.resaltaraliasFormula,this.formulaConstantesFunciones.activaraliasFormula,iSizeTabla,this,true,"aliasFormula","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formulaConstantesFunciones.resaltaraliasFormula,this.formulaConstantesFunciones.activaraliasFormula,this,true,"aliasFormula","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormulaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormula.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormula,FormulaConstantesFunciones.LABEL_VALOR));

		if(this.formulaConstantesFunciones.mostrarvalorFormula && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormulaConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formulaConstantesFunciones.resaltarvalorFormula,this.formulaConstantesFunciones.activarvalorFormula,iSizeTabla,this,true,"valorFormula","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formulaConstantesFunciones.resaltarvalorFormula,this.formulaConstantesFunciones.activarvalorFormula,this,true,"valorFormula","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FormulaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormula.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormula,FormulaConstantesFunciones.LABEL_FORMULA1));

		if(this.formulaConstantesFunciones.mostrarformula1Formula && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormulaConstantesFunciones.LABEL_FORMULA1,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.formulaConstantesFunciones.resaltarformula1Formula,this.formulaConstantesFunciones.activarformula1Formula,iSizeTabla,this,true,"formula1Formula","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formulaConstantesFunciones.resaltarformula1Formula,this.formulaConstantesFunciones.activarformula1Formula,this,true,"formula1Formula","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormulaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.formulaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosTarjetaCredito && this.formulaConstantesFunciones.mostrarTarjetaCreditoFormula && !FormulaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Tarjeta Creditos");
				tableColumn.setHeaderValue("Tarjeta Creditos");
				tableColumn.setCellRenderer(new TarjetaCreditoTableCell(formulaConstantesFunciones.resaltarTarjetaCreditoFormula,this,this.formulaConstantesFunciones.activarTarjetaCreditoFormula));
				tableColumn.setCellEditor(new TarjetaCreditoTableCell(formulaConstantesFunciones.resaltarTarjetaCreditoFormula,this,this.formulaConstantesFunciones.activarTarjetaCreditoFormula));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosFormula.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formulaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formulaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormula.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formulaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formulaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormula.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFormula && this.isPermisoGuardarCambiosFormula) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.formulaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.formulaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFormula.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.formulaSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosFormula.addColumn(tableColumn);
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
			
			this.jTableDatosFormula.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormula && this.isPermisoGuardarCambiosFormula) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.formulaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormula && this.isPermisoGuardarCambiosFormula) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFormula.moveColumn(this.jTableDatosFormula.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFormula.moveColumn(this.jTableDatosFormula.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.formulaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosFormula.moveColumn(this.jTableDatosFormula.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFormula.moveColumn(this.jTableDatosFormula.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFormula.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFormula.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFormula,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFormula.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFormula.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFormula.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFormula.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFormula.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=formulaLogic.getFormulas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=formulas.size()-1;
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
		//this.jTableDatosFormula.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFormula.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFormula();
			
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
				
				//this.isEsNuevoFormula=false;
					
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
			
				if(this.formulaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFormula==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormula.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormula.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.formula.getsType().equals("DUPLICADO")
				   || this.formula.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFormula=true;
				
				} else {
					this.isEsNuevoFormula=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
					if(this.formula.getId()>=0 && !this.formula.getIsNew()) {						
						this.isEsNuevoFormula=false;
						
					} else {
						this.isEsNuevoFormula=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFormula(esRelaciones);						
				
				this.seleccionarFormula(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.formula.getId()<0) {
					this.isEsNuevoFormula=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFormula(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFormula(evt,rowIndex);
				}	
				
				if(this.formulaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Formula: " + this.dDif); 
					}
				}								
				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFormula(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.formula)) {
					if(this.formula.getId()>0) {
						this.formula.setIsDeleted(true);
						
						this.formulasEliminados.add(this.formula);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formulaLogic.getFormulas().remove(this.formula);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formulas.remove(this.formula);				
					}
					
					
					((FormulaModel) this.jTableDatosFormula.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFormula(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFormula(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFormula) {
			
			if(this.jInternalFrameDetalleFormFormula==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormula.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormula.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFormula(this.formula);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.formulaConstantesFunciones.cargarid_empresaFormula || this.formulaConstantesFunciones.event_dependid_empresaFormula) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.formula.getid_empresa());
									//this.inicializarActualizarBindingFormula(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(formula.getEmpresa()!=null) {
							this.empresasForeignKey.add(formula.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.formula.getid_empresa(),false,"Formulario");

					//TipoFormula
					if(!this.formulaConstantesFunciones.cargarid_tipo_formulaFormula || this.formulaConstantesFunciones.event_dependid_tipo_formulaFormula) {
						//this.cargarCombosTipoFormulasForeignKeyLista(" where id="+this.formula.getid_tipo_formula());
									//this.inicializarActualizarBindingFormula(false,false);
						this.tipoformulasForeignKey=new ArrayList<TipoFormula>();

						if(formula.getTipoFormula()!=null) {
							this.tipoformulasForeignKey.add(formula.getTipoFormula());
						}

						this.addItemDefectoCombosForeignKeyTipoFormula();
						this.cargarCombosFrameTipoFormulasForeignKey("Todos");
					}
					this.setActualTipoFormulaForeignKey(this.formula.getid_tipo_formula(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFormula("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFormula(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormula() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormula(Formula formula) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFormula(formula,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormula(Formula formula,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFormula(formula);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFormula(formula,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFormula(formula);
	}
	
	public void setVariablesObjetoActualToFormularioFormula(Formula formula) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFormula==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFormula.jLabelidFormula.setText(formula.getId().toString());
			this.jInternalFrameDetalleFormFormula.jTextFieldcodigoFormula.setText(formula.getcodigo());
			this.jInternalFrameDetalleFormFormula.jTextAreanombreFormula.setText(formula.getnombre());
			this.jInternalFrameDetalleFormFormula.jTextFieldaliasFormula.setText(formula.getalias());
			this.jInternalFrameDetalleFormFormula.jTextFieldvalorFormula.setText(formula.getvalor().toString());
			this.jInternalFrameDetalleFormFormula.jTextAreaformula1Formula.setText(formula.getformula1());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Formula formulaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,formulaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Formula formulaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				formulaLocal=this.formula;
			} else {
				formulaLocal=this.formulaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(formulaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFormula(formulaLocal,true);
					
					if(formulaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(formulaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.formulaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(formulaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFormula(Formula formula,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormula(formula,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFormula(formula);
	}
	
	public void setVariablesFormularioToObjetoActualFormula(Formula formula,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormula(formula,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFormula(Formula formula,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFormula==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFormula.jLabelidFormula.getText()==null || this.jInternalFrameDetalleFormFormula.jLabelidFormula.getText()=="" || this.jInternalFrameDetalleFormFormula.jLabelidFormula.getText()=="Id") {
				this.jInternalFrameDetalleFormFormula.jLabelidFormula.setText("0");
			}

			if(conColumnasBase) {formula.setId(Long.parseLong(this.jInternalFrameDetalleFormFormula.jLabelidFormula.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormulaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormula.jLabelIdFormula,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formula.setcodigo(this.jInternalFrameDetalleFormFormula.jTextFieldcodigoFormula.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormulaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormula.jLabelcodigoFormula,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formula.setnombre(this.jInternalFrameDetalleFormFormula.jTextAreanombreFormula.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormulaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormula.jLabelnombreFormula,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formula.setalias(this.jInternalFrameDetalleFormFormula.jTextFieldaliasFormula.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormulaConstantesFunciones.LABEL_ALIAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormula.jLabelaliasFormula,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formula.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormFormula.jTextFieldvalorFormula.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormulaConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormula.jLabelvalorFormula,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formula.setformula1(this.jInternalFrameDetalleFormFormula.jTextAreaformula1Formula.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormulaConstantesFunciones.LABEL_FORMULA1+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormula.jLabelformula1Formula,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormula(Formula formulaBean,Formula formula,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && formulaBean.getid_tipo_formula()!=null && !formulaBean.getid_tipo_formula().equals(-1L))) {formula.setid_tipo_formula(formulaBean.getid_tipo_formula());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFormula(Formula formulaOrigen,Formula formula,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formulaOrigen.getId()!=null && !formulaOrigen.getId().equals(0L))) {formula.setId(formulaOrigen.getId());}}
			if(conDefault || (!conDefault && formulaOrigen.getid_tipo_formula()!=null && !formulaOrigen.getid_tipo_formula().equals(-1L))) {formula.setid_tipo_formula(formulaOrigen.getid_tipo_formula());}
			if(conDefault || (!conDefault && formulaOrigen.getcodigo()!=null && !formulaOrigen.getcodigo().equals(""))) {formula.setcodigo(formulaOrigen.getcodigo());}
			if(conDefault || (!conDefault && formulaOrigen.getnombre()!=null && !formulaOrigen.getnombre().equals(""))) {formula.setnombre(formulaOrigen.getnombre());}
			if(conDefault || (!conDefault && formulaOrigen.getalias()!=null && !formulaOrigen.getalias().equals(""))) {formula.setalias(formulaOrigen.getalias());}
			if(conDefault || (!conDefault && formulaOrigen.getvalor()!=null && !formulaOrigen.getvalor().equals(0.0))) {formula.setvalor(formulaOrigen.getvalor());}
			if(conDefault || (!conDefault && formulaOrigen.getformula1()!=null && !formulaOrigen.getformula1().equals(""))) {formula.setformula1(formulaOrigen.getformula1());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormula(Formula formula) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormula.jLabelidFormula.setText(formula.getId().toString());
			this.jInternalFrameDetalleFormFormula.jTextFieldcodigoFormula.setText(formula.getcodigo());
			this.jInternalFrameDetalleFormFormula.jTextAreanombreFormula.setText(formula.getnombre());
			this.jInternalFrameDetalleFormFormula.jTextFieldaliasFormula.setText(formula.getalias());
			this.jInternalFrameDetalleFormFormula.jTextFieldvalorFormula.setText(formula.getvalor().toString());
			this.jInternalFrameDetalleFormFormula.jTextAreaformula1Formula.setText(formula.getformula1());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormula(FormulaBean formulaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormula.jLabelidFormula.setText(formulaBean.getId().toString());
			this.jInternalFrameDetalleFormFormula.jTextFieldcodigoFormula.setText(formulaBean.getcodigo());
			this.jInternalFrameDetalleFormFormula.jTextAreanombreFormula.setText(formulaBean.getnombre());
			this.jInternalFrameDetalleFormFormula.jTextFieldaliasFormula.setText(formulaBean.getalias());
			this.jInternalFrameDetalleFormFormula.jTextFieldvalorFormula.setText(formulaBean.getvalor().toString());
			this.jInternalFrameDetalleFormFormula.jTextAreaformula1Formula.setText(formulaBean.getformula1());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFormula(FormulaParameterReturnGeneral formulaReturnGeneral,FormulaBean formulaBean,Boolean conDefault) throws Exception { 
		try {
			Formula formulaLocal=new Formula();
			
			formulaLocal=formulaReturnGeneral.getFormula();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formulaLocal.getId()!=null && !formulaLocal.getId().equals(0L))) {formulaBean.setId(formulaLocal.getId());}}
			if(conDefault || (!conDefault && formulaLocal.getid_tipo_formula()!=null && !formulaLocal.getid_tipo_formula().equals(-1L))) {formulaBean.setid_tipo_formula(formulaLocal.getid_tipo_formula());}
			if(conDefault || (!conDefault && formulaLocal.getcodigo()!=null && !formulaLocal.getcodigo().equals(""))) {formulaBean.setcodigo(formulaLocal.getcodigo());}
			if(conDefault || (!conDefault && formulaLocal.getnombre()!=null && !formulaLocal.getnombre().equals(""))) {formulaBean.setnombre(formulaLocal.getnombre());}
			if(conDefault || (!conDefault && formulaLocal.getalias()!=null && !formulaLocal.getalias().equals(""))) {formulaBean.setalias(formulaLocal.getalias());}
			if(conDefault || (!conDefault && formulaLocal.getvalor()!=null && !formulaLocal.getvalor().equals(0.0))) {formulaBean.setvalor(formulaLocal.getvalor());}
			if(conDefault || (!conDefault && formulaLocal.getformula1()!=null && !formulaLocal.getformula1().equals(""))) {formulaBean.setformula1(formulaLocal.getformula1());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFormulaGenerico(Long idFormulaSeleccionado,JComboBox jComboBoxFormula,List<Formula> formulasLocal)throws Exception {
		try {
			Formula  formulaTemp=null;

			for(Formula formulaAux:formulasLocal) {
				if(formulaAux.getId()!=null && formulaAux.getId().equals(idFormulaSeleccionado)) {
					formulaTemp=formulaAux;
					break;
				}
			}

			jComboBoxFormula.setSelectedItem(formulaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFormulaGenerico(JComboBox jComboBoxFormula,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormula.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFormula.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormula.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFormula.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("TarjetaCredito")) {
			jButtonTarjetaCreditoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formula=(Formula) formulaLogic.getFormulas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formula =(Formula) formulas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!formula.getIsNew() && !formula.getIsChanged() && !formula.getIsDeleted()) {
				sDescripcion=formula.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=formula.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoFormula")) {
			//sDescripcion=this.getActualTipoFormulaForeignKeyDescripcion((Long)value);
			if(!formula.getIsNew() && !formula.getIsChanged() && !formula.getIsDeleted()) {
				sDescripcion=formula.gettipoformula_descripcion();
			} else {
				//sDescripcion=this.getActualTipoFormulaForeignKeyDescripcion((Long)value);
				sDescripcion=formula.gettipoformula_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Formula formulaRow=new Formula();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formulaRow=(Formula) formulaLogic.getFormulas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formulaRow=(Formula) formulas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonTarjetaCreditoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Formula formula) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormFormula==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formula = (Formula)this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.formula = (Formula)this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(formula!=null) {
						this.formula = formula;
					} else {
						this.formula = new Formula();
					}
				}

				if(this.isTienePermisosTarjetaCredito && this.permiteMantenimiento(this.formula)) {
					TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFramePopup=new TarjetaCreditoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						tarjetacreditoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFramePopup;
					} else {
						tarjetacreditoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame;
					}

					List<Formula> formulas=new ArrayList<Formula>();
					formulas.add(this.formula);
					if(!esRelacionado) {
						//tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setConGuardarRelaciones(false);
						//tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					tarjetacreditoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormFormula.cargarTarjetaCreditoBeanSwingJInternalFrame(formulas,this.formula,tarjetacreditoBeanSwingJInternalFrame,/*conInicializar,*/tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.getConGuardarRelaciones(),tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.getEsGuardarRelacionado());
					tarjetacreditoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						tarjetacreditoBeanSwingJInternalFrame.actualizarEstadoPanelsTarjetaCredito("no_relacionado");

						tarjetacreditoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TarjetaCreditoConstantesFunciones.ITAMANIOFILATABLA + (TarjetaCreditoConstantesFunciones.ITAMANIOFILATABLA/2));

						tarjetacreditoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderFormula=(TitledBorder)this.jScrollPanelDatosFormula.getBorder();
						TitledBorder titledBorderTarjetaCredito=(TitledBorder)tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.getBorder();

						titledBorderTarjetaCredito.setTitle(titledBorderFormula.getTitle() + " -> Tarjeta Credito");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,tarjetacreditoBeanSwingJInternalFrame);
						}

						tarjetacreditoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(tarjetacreditoBeanSwingJInternalFrame);

						tarjetacreditoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.formulaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Tarjeta Credito",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFormula(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFormula.setVisible((this.isVisibilidadCeldaNuevoFormula && this.isPermisoNuevoFormula));			
			this.jButtonDuplicarFormula.setVisible((this.isVisibilidadCeldaDuplicarFormula && this.isPermisoDuplicarFormula));			
			this.jButtonCopiarFormula.setVisible((this.isVisibilidadCeldaCopiarFormula && this.isPermisoCopiarFormula));
			this.jButtonVerFormFormula.setVisible((this.isVisibilidadCeldaVerFormFormula && this.isPermisoVerFormFormula));
			
			this.jButtonAbrirOrderByFormula.setVisible((this.isVisibilidadCeldaOrdenFormula && this.isPermisoOrdenFormula));			
			
			this.jButtonNuevoRelacionesFormula.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormula && this.isPermisoNuevoFormula));			
			this.jButtonNuevoGuardarCambiosFormula.setVisible((this.isVisibilidadCeldaNuevoFormula && this.isPermisoNuevoFormula && this.isPermisoGuardarCambiosFormula));
			
			if(this.jInternalFrameDetalleFormFormula!=null) {
			this.jInternalFrameDetalleFormFormula.jButtonModificarFormula.setVisible((this.isVisibilidadCeldaModificarFormula && this.isPermisoActualizarFormula));	
			this.jInternalFrameDetalleFormFormula.jButtonActualizarFormula.setVisible((this.isVisibilidadCeldaActualizarFormula && this.isPermisoActualizarFormula));	
			this.jInternalFrameDetalleFormFormula.jButtonEliminarFormula.setVisible((this.isVisibilidadCeldaEliminarFormula && this.isPermisoEliminarFormula));
			this.jInternalFrameDetalleFormFormula.jButtonCancelarFormula.setVisible(this.isVisibilidadCeldaCancelarFormula);							
			this.jInternalFrameDetalleFormFormula.jButtonGuardarCambiosFormula.setVisible((this.isVisibilidadCeldaGuardarFormula && this.isPermisoGuardarCambiosFormula));			
			
			}
						
			this.jButtonGuardarCambiosTablaFormula.setVisible((this.isVisibilidadCeldaGuardarCambiosFormula && this.isPermisoGuardarCambiosFormula));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFormula.setVisible((this.isVisibilidadCeldaNuevoFormula && this.isPermisoNuevoFormula));						
			this.jButtonDuplicarToolBarFormula.setVisible((this.isVisibilidadCeldaDuplicarFormula && this.isPermisoDuplicarFormula));						
			this.jButtonCopiarToolBarFormula.setVisible((this.isVisibilidadCeldaCopiarFormula && this.isPermisoCopiarFormula));			
			this.jButtonVerFormToolBarFormula.setVisible((this.isVisibilidadCeldaVerFormFormula && this.isPermisoVerFormFormula));			
			this.jButtonAbrirOrderByToolBarFormula.setVisible((this.isVisibilidadCeldaOrdenFormula && this.isPermisoOrdenFormula));
			this.jButtonNuevoRelacionesToolBarFormula.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormula && this.isPermisoNuevoFormula));			
			this.jButtonNuevoGuardarCambiosToolBarFormula.setVisible((this.isVisibilidadCeldaNuevoFormula && this.isPermisoNuevoFormula && this.isPermisoGuardarCambiosFormula));			
			
			if(this.jInternalFrameDetalleFormFormula!=null) {
			this.jInternalFrameDetalleFormFormula.jButtonModificarToolBarFormula.setVisible((this.isVisibilidadCeldaModificarFormula && this.isPermisoActualizarFormula));	
			this.jInternalFrameDetalleFormFormula.jButtonActualizarToolBarFormula.setVisible((this.isVisibilidadCeldaActualizarFormula  && this.isPermisoActualizarFormula));	
			this.jInternalFrameDetalleFormFormula.jButtonEliminarToolBarFormula.setVisible((this.isVisibilidadCeldaEliminarFormula && this.isPermisoEliminarFormula));
			this.jInternalFrameDetalleFormFormula.jButtonCancelarToolBarFormula.setVisible(this.isVisibilidadCeldaCancelarFormula);				
			this.jInternalFrameDetalleFormFormula.jButtonGuardarCambiosToolBarFormula.setVisible((this.isVisibilidadCeldaGuardarFormula && this.isPermisoGuardarCambiosFormula));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFormula.setVisible((this.isVisibilidadCeldaGuardarCambiosFormula && this.isPermisoGuardarCambiosFormula));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFormula.setVisible((this.isVisibilidadCeldaNuevoFormula && this.isPermisoNuevoFormula));			
			this.jMenuItemDuplicarFormula.setVisible((this.isVisibilidadCeldaDuplicarFormula && this.isPermisoDuplicarFormula));			
			this.jMenuItemCopiarFormula.setVisible((this.isVisibilidadCeldaCopiarFormula && this.isPermisoCopiarFormula));			
			this.jMenuItemVerFormFormula.setVisible((this.isVisibilidadCeldaVerFormFormula && this.isPermisoVerFormFormula));			
			this.jMenuItemAbrirOrderByFormula.setVisible((this.isVisibilidadCeldaOrdenFormula && this.isPermisoOrdenFormula));			
			//this.jMenuItemMostrarOcultarFormula.setVisible((this.isVisibilidadCeldaOrdenFormula && this.isPermisoOrdenFormula));
			this.jMenuItemDetalleAbrirOrderByFormula.setVisible((this.isVisibilidadCeldaOrdenFormula && this.isPermisoOrdenFormula));			
			//this.jMenuItemDetalleMostrarOcultarFormula.setVisible((this.isVisibilidadCeldaOrdenFormula && this.isPermisoOrdenFormula));			
			this.jMenuItemNuevoRelacionesFormula.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormula && this.isPermisoNuevoFormula));			
			this.jMenuItemNuevoGuardarCambiosFormula.setVisible((this.isVisibilidadCeldaNuevoFormula && this.isPermisoNuevoFormula && this.isPermisoGuardarCambiosFormula));									
			
			if(this.jInternalFrameDetalleFormFormula!=null) {
			this.jInternalFrameDetalleFormFormula.jMenuItemModificarFormula.setVisible((this.isVisibilidadCeldaModificarFormula && this.isPermisoActualizarFormula));	
			this.jInternalFrameDetalleFormFormula.jMenuItemActualizarFormula.setVisible((this.isVisibilidadCeldaActualizarFormula && this.isPermisoActualizarFormula));	
			this.jInternalFrameDetalleFormFormula.jMenuItemEliminarFormula.setVisible((this.isVisibilidadCeldaEliminarFormula && this.isPermisoEliminarFormula));
			this.jInternalFrameDetalleFormFormula.jMenuItemCancelarFormula.setVisible(this.isVisibilidadCeldaCancelarFormula);				
			}
			
			this.jMenuItemGuardarCambiosFormula.setVisible((this.isVisibilidadCeldaGuardarFormula && this.isPermisoGuardarCambiosFormula));						
			this.jMenuItemGuardarCambiosTablaFormula.setVisible((this.isVisibilidadCeldaGuardarCambiosFormula && this.isPermisoGuardarCambiosFormula));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFormula=this.jButtonNuevoFormula.isVisible();
			this.isVisibilidadCeldaDuplicarFormula=this.jButtonDuplicarFormula.isVisible();
			this.isVisibilidadCeldaCopiarFormula=this.jButtonCopiarFormula.isVisible();
			this.isVisibilidadCeldaVerFormFormula=this.jButtonVerFormFormula.isVisible();
			
			this.isVisibilidadCeldaOrdenFormula=this.jButtonAbrirOrderByFormula.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFormula=this.jButtonNuevoRelacionesFormula.isVisible();
			this.isVisibilidadCeldaModificarFormula=this.jButtonModificarFormula.isVisible();
			
			if(this.jInternalFrameDetalleFormFormula!=null) {
			this.isVisibilidadCeldaActualizarFormula=this.jInternalFrameDetalleFormFormula.jButtonActualizarFormula.isVisible();
			this.isVisibilidadCeldaEliminarFormula=this.jInternalFrameDetalleFormFormula.jButtonEliminarFormula.isVisible();
			this.isVisibilidadCeldaCancelarFormula=this.jInternalFrameDetalleFormFormula.jButtonCancelarFormula.isVisible();
			this.isVisibilidadCeldaGuardarFormula=this.jInternalFrameDetalleFormFormula.jButtonGuardarCambiosFormula.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFormula=this.jButtonGuardarCambiosTablaFormula.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFormula=this.jButtonNuevoToolBarFormula.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormula=this.jButtonNuevoRelacionesToolBarFormula.isVisible();
			
			if(this.jInternalFrameDetalleFormFormula!=null) {
			this.isVisibilidadCeldaModificarFormula=this.jInternalFrameDetalleFormFormula.jButtonModificarToolBarFormula.isVisible();
			this.isVisibilidadCeldaActualizarFormula=this.jInternalFrameDetalleFormFormula.jButtonActualizarToolBarFormula.isVisible();
			this.isVisibilidadCeldaEliminarFormula=this.jInternalFrameDetalleFormFormula.jButtonEliminarToolBarFormula.isVisible();
			this.isVisibilidadCeldaCancelarFormula=this.jInternalFrameDetalleFormFormula.jButtonCancelarToolBarFormula.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormula=this.jButtonGuardarCambiosToolBarFormula.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormula=this.jButtonGuardarCambiosTablaToolBarFormula.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFormula=this.jMenuItemNuevoFormula.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormula=this.jMenuItemNuevoRelacionesFormula.isVisible();
			
			if(this.jInternalFrameDetalleFormFormula!=null) {
			this.isVisibilidadCeldaModificarFormula=this.jInternalFrameDetalleFormFormula.jMenuItemModificarFormula.isVisible();
			this.isVisibilidadCeldaActualizarFormula=this.jInternalFrameDetalleFormFormula.jMenuItemActualizarFormula.isVisible();
			this.isVisibilidadCeldaEliminarFormula=this.jInternalFrameDetalleFormFormula.jMenuItemEliminarFormula.isVisible();
			this.isVisibilidadCeldaCancelarFormula=this.jInternalFrameDetalleFormFormula.jMenuItemCancelarFormula.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormula=this.jMenuItemGuardarCambiosFormula.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormula=this.jMenuItemGuardarCambiosTablaFormula.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFormula(Boolean esInicializar) {
		if(FormulaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.formulaSessionBean.getConGuardarRelaciones()) {
				//if(this.formulaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFormula();
			}
			
			this.inicializarActualizarBindingBotonesManualFormula(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFormula() {
		this.jButtonNuevoFormula.setVisible(this.isPermisoNuevoFormula);			
		this.jButtonDuplicarFormula.setVisible(this.isPermisoDuplicarFormula);			
		this.jButtonCopiarFormula.setVisible(this.isPermisoCopiarFormula);			
		this.jButtonVerFormFormula.setVisible(this.isPermisoVerFormFormula);			
		
		this.jButtonAbrirOrderByFormula.setVisible(this.isPermisoOrdenFormula);					
		
		this.jButtonNuevoRelacionesFormula.setVisible(this.isPermisoNuevoFormula);			
		
		if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormula.jButtonModificarFormula.setVisible(this.isPermisoActualizarFormula);	
			this.jInternalFrameDetalleFormFormula.jButtonActualizarFormula.setVisible(this.isPermisoActualizarFormula);	
			this.jInternalFrameDetalleFormFormula.jButtonEliminarFormula.setVisible(this.isPermisoEliminarFormula);
			this.jInternalFrameDetalleFormFormula.jButtonCancelarFormula.setVisible(this.isVisibilidadCeldaCancelarFormula);						
			this.jInternalFrameDetalleFormFormula.jButtonGuardarCambiosFormula.setVisible(this.isPermisoGuardarCambiosFormula);							
		}
		
		this.jButtonGuardarCambiosTablaFormula.setVisible(this.isPermisoActualizarFormula);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFormula() {
		this.jInternalFrameDetalleFormFormula.jButtonModificarFormula.setVisible(this.isPermisoActualizarFormula);	
		this.jInternalFrameDetalleFormFormula.jButtonActualizarFormula.setVisible(this.isPermisoActualizarFormula);	
		this.jInternalFrameDetalleFormFormula.jButtonEliminarFormula.setVisible(this.isPermisoEliminarFormula);
		this.jInternalFrameDetalleFormFormula.jButtonCancelarFormula.setVisible(this.isVisibilidadCeldaCancelarFormula);							
		this.jInternalFrameDetalleFormFormula.jButtonGuardarCambiosFormula.setVisible((this.isVisibilidadCeldaGuardarFormula && this.isPermisoGuardarCambiosFormula));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFormula() {
		if(FormulaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFormula();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFormula() {
	}
	
	public void jTableDatosFormulaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFormula(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFormulaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormula.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormula(this.getformula(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formula==null) {
						this.formula = new Formula();
					}

					this.setVariablesFormularioToObjetoActualFormula(this.formula,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
				}

				if(this.formula.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.formula.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormula(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFormulaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFormula(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormula.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormula.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormula.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormula(this.getformula(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.formulaLogic.getConnexion());

				if(this.formula.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.formula.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormula=(TitledBorder)this.jScrollPanelDatosFormula.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFormula.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFormulaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormula.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormula(this.getformula(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formula==null) {
						this.formula = new Formula();
					}

					this.setVariablesFormularioToObjetoActualFormula(this.formula,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
				}

				if(this.formula.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.formula.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormula(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_formulaFormulaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoformula=true;

			idTienePermisotipoformula=this.tienePermisosUsuarioEnPaginaWebFormula(TipoFormulaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoformula) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormula.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormula.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormula.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormula(this.getformula(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);

				this.tipoformulaBeanSwingJInternalFrame=new TipoFormulaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoformulaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoformulaBeanSwingJInternalFrame.getTipoFormulaLogic().setConnexion(this.formulaLogic.getConnexion());

				if(this.formula.getid_tipo_formula()!=null) {
					this.tipoformulaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoformulaBeanSwingJInternalFrame.setIdActual(this.formula.getid_tipo_formula());
					this.tipoformulaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoformulaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoformulaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFormula();
				}

				JInternalFrameBase jinternalFrame =this.tipoformulaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormula=(TitledBorder)this.jScrollPanelDatosFormula.getBorder();
				TitledBorder titledBordertipoformula=(TitledBorder)this.tipoformulaBeanSwingJInternalFrame.jScrollPanelDatosTipoFormula.getBorder();

				titledBordertipoformula.setTitle(titledBorderFormula.getTitle() + " -> Tipo Formula");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_formulaFormulaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormula.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormula(this.getformula(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formula==null) {
						this.formula = new Formula();
					}

					this.setVariablesFormularioToObjetoActualFormula(this.formula,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
				}

				if(this.formula.getid_tipo_formula()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_formula = "+this.formula.getid_tipo_formula().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormula(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoFormulaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormula.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormula(this.getformula(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formula==null) {
						this.formula = new Formula();
					}

					this.setVariablesFormularioToObjetoActualFormula(this.formula,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
				}

				if(this.formula.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.formula.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormula(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreFormulaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormula.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormula(this.getformula(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formula==null) {
						this.formula = new Formula();
					}

					this.setVariablesFormularioToObjetoActualFormula(this.formula,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
				}

				if(this.formula.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.formula.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormula(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonaliasFormulaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormula.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormula(this.getformula(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formula==null) {
						this.formula = new Formula();
					}

					this.setVariablesFormularioToObjetoActualFormula(this.formula,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
				}

				if(this.formula.getalias()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where alias like '%"+this.formula.getalias()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormula(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorFormulaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormula.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormula(this.getformula(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formula==null) {
						this.formula = new Formula();
					}

					this.setVariablesFormularioToObjetoActualFormula(this.formula,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
				}

				if(this.formula.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.formula.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormula(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonformula1FormulaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormula.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormula(this.getformula(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formula==null) {
						this.formula = new Formula();
					}

					this.setVariablesFormularioToObjetoActualFormula(this.formula,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);
				}

				if(this.formula.getformula1()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where formula1 like '%"+this.formula.getformula1()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormula(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaFormulaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormula(false,false);

			this.getFormulasFK_IdEmpresa();

			this.inicializarActualizarBindingFormula(false);

			//if(FormulaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormula(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoFormulaFormulaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormula(false,false);

			this.getFormulasFK_IdTipoFormula();

			this.inicializarActualizarBindingFormula(false);

			//if(FormulaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormula(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFormula() {
		if(this.jInternalFrameDetalleFormFormula!=null) {
		

		if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormFormula!=null) {
			this.jInternalFrameDetalleFormFormula.setVisible(false);	    			
			this.jInternalFrameDetalleFormFormula.dispose();
			this.jInternalFrameDetalleFormFormula=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFormula!=null) {
			this.jInternalFrameReporteDinamicoFormula.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFormula.dispose();
			this.jInternalFrameReporteDinamicoFormula=null;
		}
		
		if(this.jInternalFrameImportacionFormula!=null) {
			this.jInternalFrameImportacionFormula.setVisible(false);	    			
			this.jInternalFrameImportacionFormula.dispose();
			this.jInternalFrameImportacionFormula=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFormula();
			
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
			
			
			if(sTipo.equals("NuevoFormula")) {
				jButtonNuevoFormulaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFormula")) {
				jButtonDuplicarFormulaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFormula")) {
				jButtonCopiarFormulaActionPerformed(evt);
			} else if(sTipo.equals("VerFormFormula")) {
				jButtonVerFormFormulaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFormula")) {
				jButtonNuevoFormulaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFormula")) {
				jButtonDuplicarFormulaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFormula")) {
				jButtonNuevoFormulaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFormula")) {
				jButtonDuplicarFormulaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFormula")) {
				jButtonNuevoFormulaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFormula")) {
				jButtonNuevoFormulaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFormula")) {
				jButtonNuevoFormulaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFormula")) {
				jButtonModificarFormulaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFormula")) {
				jButtonModificarFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFormula")) {
				jButtonModificarFormulaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFormula")) {
				jButtonActualizarFormulaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFormula")) {
				jButtonActualizarFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFormula")) {
				jButtonActualizarFormulaActionPerformed(evt);
			} else if(sTipo.equals("EliminarFormula")) {
				jButtonEliminarFormulaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFormula")) {
				jButtonEliminarFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFormula")) {
				jButtonEliminarFormulaActionPerformed(evt);
			} else if(sTipo.equals("CancelarFormula")) {
				jButtonCancelarFormulaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFormula")) {
				jButtonCancelarFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFormula")) {
				jButtonCancelarFormulaActionPerformed(evt);
			} else if(sTipo.equals("CerrarFormula")) {
				jButtonCerrarFormulaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFormula")) {
				jButtonCerrarFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFormula")) {
				jButtonCerrarFormulaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFormula")) {
				jButtonMostrarOcultarFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFormula")) {
				jButtonCancelarFormulaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFormula")) {
				jButtonGuardarCambiosFormulaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFormula")) {
				jButtonGuardarCambiosFormulaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFormula")) {
				jButtonCopiarFormulaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFormula")) {
				jButtonVerFormFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFormula")) {
				jButtonGuardarCambiosFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFormula")) {
				jButtonCopiarFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFormula")) {
				jButtonVerFormFormulaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFormula")) {
				jButtonGuardarCambiosFormulaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFormula")) {
				jButtonGuardarCambiosFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFormula")) {
				jButtonGuardarCambiosFormulaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFormula")) {
				jButtonRecargarInformacionFormulaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFormula")) {
				jButtonRecargarInformacionFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFormula")) {
				jButtonRecargarInformacionFormulaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFormula")) {
				jButtonAnterioresFormulaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFormula")) {
				jButtonAnterioresFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFormula")) {
				jButtonAnterioresFormulaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFormula")) {
				jButtonSiguientesFormulaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFormula")) {
				jButtonSiguientesFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFormula")) {
				jButtonSiguientesFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFormula") || sTipo.equals("MenuItemDetalleAbrirOrderByFormula")) {
				jButtonAbrirOrderByFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFormula") || sTipo.equals("MenuItemDetalleMostrarOcultarFormula")) {
				jButtonMostrarOcultarFormulaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFormula")) {
				jButtonNuevoGuardarCambiosFormulaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFormula")) {
				jButtonNuevoGuardarCambiosFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFormula")) {
				jButtonNuevoGuardarCambiosFormulaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFormula")) {
				jButtonCerrarReporteDinamicoFormulaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFormula")) {
				jButtonGenerarReporteDinamicoFormulaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFormula")) {
				
				jButtonGenerarExcelReporteDinamicoFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFormula")) {
				jButtonCerrarImportacionFormulaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFormula")) {
				
				jButtonGenerarImportacionFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFormula")) {
				
				jButtonAbrirImportacionFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFormula")) {
				jComboBoxTiposAccionesFormulaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFormula")) {
				jComboBoxTiposRelacionesFormulaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFormula")) {
				jComboBoxTiposAccionesFormulaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFormula")) {
				
				jComboBoxTiposSeleccionarFormulaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFormula")) {
				jTextFieldValorCampoGeneralFormulaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFormula")) {
				jButtonAbrirOrderByFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFormula")) {
				jButtonAbrirOrderByFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFormula")) {
				jButtonCerrarOrderByFormulaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormulaBusqueda")) {
				this.jButtonidFormulaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormulaUpdate")) {
				this.jButtonid_empresaFormulaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormulaBusqueda")) {
				this.jButtonid_empresaFormulaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_formulaFormulaUpdate")) {
				this.jButtonid_tipo_formulaFormulaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_formulaFormulaBusqueda")) {
				this.jButtonid_tipo_formulaFormulaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoFormulaBusqueda")) {
				this.jButtoncodigoFormulaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreFormulaBusqueda")) {
				this.jButtonnombreFormulaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("aliasFormulaBusqueda")) {
				this.jButtonaliasFormulaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorFormulaBusqueda")) {
				this.jButtonvalorFormulaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("formula1FormulaBusqueda")) {
				this.jButtonformula1FormulaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoFormulaFormula")) {
				this.jButtonFK_IdTipoFormulaFormulaActionPerformed(evt);
			}
			
			;
			
			
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFormula();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormulaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formula);
				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
				
				


				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formula.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formula.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Formula formulaLocal=null;
			
			if(!this.getEsControlTabla()) {
				formulaLocal=this.formula;
			} else {
				formulaLocal=this.formulaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formula);
				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
							
				
				


				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formula.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formula.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormulaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormula.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaAnterior =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulaAnterior =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
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
			
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
			
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
			
			


			
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormulaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formula);
				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
								
						
				


				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formula.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formula.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formula);
				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
								
				
				


				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formula.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formula.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormulaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormula.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaAnterior =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulaAnterior =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formula);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormulaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormula.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaAnterior =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulaAnterior =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormulaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formula);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formula);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formula);
				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
							
				
				


				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formula.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formula.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormulaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormula.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulaAnterior =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formulaAnterior =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
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
			
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
			
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
			
			


			
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormulaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formula);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formula);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formula);
				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
								
				
				


				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formula.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formula.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormulaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormula.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaAnterior =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulaAnterior =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormulaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formula);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formula);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormulaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formula);
				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFormula")) {
					jCheckBoxSeleccionarTodosFormulaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFormula")) {
					jCheckBoxSeleccionadosFormulaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFormula")) {
					
				}
				
				


				
				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formula.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formula.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.formula);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.formula);
				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
												
				
				


				
				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formula.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formula.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormulaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormula.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulaAnterior =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formulaAnterior =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormulaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formula);
				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
				
				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
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
			
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
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
			
			


			
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormulaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formula);
				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formula.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formula.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formula);
				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
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
				
				


				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formula.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formula.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormulaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormula.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulaAnterior =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulaAnterior =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFormula")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFormulaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFormula.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.formula =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.formula =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.formula);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFormula")) {
				
				}
				
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFormula")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFormula.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFormula")) {
			
			}
			
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFormula();
			
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
			
			if(sTipo.equals("NuevoFormula")) {
				jButtonNuevoFormulaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFormula")) {
				jButtonDuplicarFormulaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFormula")) {
				jButtonCopiarFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFormula")) {
				jButtonVerFormFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFormula")) {
				jButtonNuevoFormulaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFormula")) {
				jButtonModificarFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFormula")) {
				jButtonActualizarFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFormula")) {
				jButtonEliminarFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFormula")) {
				jButtonGuardarCambiosFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFormula")) {
				jButtonCancelarFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFormula")) {
				jButtonCerrarFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFormula")) {
				jButtonGuardarCambiosFormulaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFormula")) {
				jButtonNuevoGuardarCambiosFormulaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFormula")) {
				jButtonAbrirOrderByFormulaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFormula")) {
				jButtonRecargarInformacionFormulaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFormula")) {
				jButtonAnterioresFormulaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFormula")) {
				jButtonSiguientesFormulaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormulaBusqueda")) {
				this.jButtonidFormulaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormulaUpdate")) {
				this.jButtonid_empresaFormulaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormulaBusqueda")) {
				this.jButtonid_empresaFormulaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_formulaFormulaUpdate")) {
				this.jButtonid_tipo_formulaFormulaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_formulaFormulaBusqueda")) {
				this.jButtonid_tipo_formulaFormulaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoFormulaBusqueda")) {
				this.jButtoncodigoFormulaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreFormulaBusqueda")) {
				this.jButtonnombreFormulaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("aliasFormulaBusqueda")) {
				this.jButtonaliasFormulaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorFormulaBusqueda")) {
				this.jButtonvalorFormulaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("formula1FormulaBusqueda")) {
				this.jButtonformula1FormulaBusquedaActionPerformed(evt);
			}
			
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFormula();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFormula")) {
				closingInternalFrameFormula();
				
			} else if(sTipo.equals("jButtonCancelarFormula")) {
				JInternalFrameBase jInternalFrameDetalleFormFormula = (JInternalFrameBase)evt.getSource();
	            	
	            FormulaBeanSwingJInternalFrame jInternalFrameParent=(FormulaBeanSwingJInternalFrame)jInternalFrameDetalleFormFormula.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFormulaActionPerformed(null);
			}
			
			FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formula,new Object(),this.formulaParameterGeneral,this.formulaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFormula(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFormula(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFormula(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.formula)) {
			if(!esControlTabla) {
				if(FormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFormula(this.formula,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);			
				}
				
				if(this.formulaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFormula(this.formula,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formulaReturnGeneral=formulaLogic.procesarEventosFormulasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formulaLogic.getFormulas(),this.formula,this.formulaParameterGeneral,this.isEsNuevoFormula,classes);//this.formulaLogic.getFormula()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFormula(this.formulaReturnGeneral,this.formulaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.formulaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFormula(classes,this.formulaReturnGeneral,this.formulaBean,false);
					}
						
					if(this.formulaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFormula(this.formulaReturnGeneral.getFormula());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFormula(this.formulaReturnGeneral.getFormula());	
					}
						
					if(this.formulaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFormula(this.formulaReturnGeneral.getFormula(),classes);//this.formulaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFormula(this.formula,classes);//this.formulaBean);									
				}
			
				if(FormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFormula(this.formula,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormula(this.formula);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.formulaAnterior!=null) {
						this.formula=this.formulaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formulaReturnGeneral=formulaLogic.procesarEventosFormulasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formulaLogic.getFormulas(),this.formula,this.formulaParameterGeneral,this.isEsNuevoFormula,classes);//this.formulaLogic.getFormula()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formulaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formulaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.formulaReturnGeneral.getFormula(),formulaLogic.getFormulas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.formulaReturnGeneral.getFormula(),this.formulas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFormula.repaint();
				
				//((AbstractTableModel) this.jTableDatosFormula.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFormula();
			}
		}
	}
	
	public void actualizarVisualTableDatosFormula() throws Exception {
		
		FormulaModel formulaModel=(FormulaModel)this.jTableDatosFormula.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formulaModel.formulas=this.formulaLogic.getFormulas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			formulaModel.formulas=this.formulas;
		}
		
		
		((FormulaModel) this.jTableDatosFormula.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFormula() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getformulaAnterior(),this.formulaLogic.getFormulas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getformulaAnterior(),this.formulas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFormula();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFormula(Formula formula,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TarjetaCredito.class)) {
					this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.setTarjetaCreditos(formula.getTarjetaCreditoComisions());
					this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCredito(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
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
										
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formula,new Object(),generalEntityParameterGeneral,this.formulaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.formulaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FormulaConstantesFunciones.getClassesRelationshipsOfFormula(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FormulaConstantesFunciones.getClassesRelationshipsFromStringsOfFormula(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFormula(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formula,new Object(),generalEntityParameterGeneral,this.formulaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFormula(FormulaBean formulaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TarjetaCredito.class)) {
					this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.setTarjetaCreditos(formula.getTarjetaCreditoComisions());
					this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCredito(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFormula(ArrayList<Classe> classes,FormulaReturnGeneral formulaReturnGeneral,FormulaBean formulaBean,Boolean conDefault) throws Exception {
		
			this.formulaBean.setTarjetaCreditos(formulaReturnGeneral.getFormula().getTarjetaCreditos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFormula(Formula formula,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(TarjetaCredito.class)) {
					formula.setTarjetaCreditoComisions(this.jInternalFrameDetalleFormFormula.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.formula)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFormula = new FormulaDetalleFormJInternalFrame(jDesktopPane,this.formulaSessionBean.getConGuardarRelaciones(),this.formulaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFormula);
		this.jInternalFrameDetalleFormFormula.setVisible(false);
		this.jInternalFrameDetalleFormFormula.setSelected(false);						
		
		this.jInternalFrameDetalleFormFormula.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFormula.formulaLogic=this.formulaLogic;
		
		this.cargarCombosFrameForeignKeyFormula("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFormula();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormula();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFormula("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFormula();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFormula.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormula"));
		
		this.jInternalFrameDetalleFormFormula.jButtonModificarFormula.addActionListener(new ButtonActionListener(this,"ModificarFormula"));

		
		this.jInternalFrameDetalleFormFormula.jButtonModificarToolBarFormula.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormula"));
					
		this.jInternalFrameDetalleFormFormula.jMenuItemModificarFormula.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormula"));		
		
		
		
		this.jInternalFrameDetalleFormFormula.jButtonActualizarFormula.addActionListener (new ButtonActionListener(this,"ActualizarFormula"));
		
		
		this.jInternalFrameDetalleFormFormula.jButtonActualizarToolBarFormula.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormula"));
						
		this.jInternalFrameDetalleFormFormula.jMenuItemActualizarFormula.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormula"));		
		
		
		
		this.jInternalFrameDetalleFormFormula.jButtonEliminarFormula.addActionListener (new ButtonActionListener(this,"EliminarFormula"));
		
		
		this.jInternalFrameDetalleFormFormula.jButtonEliminarToolBarFormula.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormula"));
								
		this.jInternalFrameDetalleFormFormula.jMenuItemEliminarFormula.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormula"));		
		
		
		
		this.jInternalFrameDetalleFormFormula.jButtonCancelarFormula.addActionListener (new ButtonActionListener(this,"CancelarFormula"));
		
		
		this.jInternalFrameDetalleFormFormula.jButtonCancelarToolBarFormula.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormula"));
					
		this.jInternalFrameDetalleFormFormula.jMenuItemCancelarFormula.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormula"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFormula.jMenuItemDetalleCerrarFormula.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormula"));		
		
		
		
		this.jInternalFrameDetalleFormFormula.jButtonGuardarCambiosToolBarFormula.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormula"));
		
		
		
		this.jInternalFrameDetalleFormFormula.jButtonGuardarCambiosToolBarFormula.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormula"));
		
		
		
		this.jInternalFrameDetalleFormFormula.jComboBoxTiposAccionesFormularioFormula.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormula"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonidFormulaBusqueda.addActionListener(new ButtonActionListener(this,"idFormulaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormula.jButtonid_empresaFormulaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormulaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonid_empresaFormulaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormulaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormula.jButtonid_tipo_formulaFormulaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_formulaFormulaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonid_tipo_formulaFormulaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_formulaFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtoncodigoFormulaBusqueda.addActionListener(new ButtonActionListener(this,"codigoFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonnombreFormulaBusqueda.addActionListener(new ButtonActionListener(this,"nombreFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonaliasFormulaBusqueda.addActionListener(new ButtonActionListener(this,"aliasFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonvalorFormulaBusqueda.addActionListener(new ButtonActionListener(this,"valorFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonformula1FormulaBusqueda.addActionListener(new ButtonActionListener(this,"formula1FormulaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFormula.jTabbedPaneRelacionesFormula.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormula"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFormula"));
		
		if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormula.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormula"));
		}
		
		this.jTableDatosFormula.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFormula"));
		
		this.jTableDatosFormula.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFormula"));
		
		this.jButtonNuevoFormula.addActionListener(new ButtonActionListener(this,"NuevoFormula"));
		
		this.jButtonDuplicarFormula.addActionListener(new ButtonActionListener(this,"DuplicarFormula"));
		
		this.jButtonCopiarFormula.addActionListener(new ButtonActionListener(this,"CopiarFormula"));
		
		this.jButtonVerFormFormula.addActionListener(new ButtonActionListener(this,"VerFormFormula"));
		
		
		this.jButtonNuevoToolBarFormula.addActionListener(new ButtonActionListener(this,"NuevoToolBarFormula"));
			
		this.jButtonDuplicarToolBarFormula.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFormula"));
			
		this.jMenuItemNuevoFormula.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFormula"));
			
		this.jMenuItemDuplicarFormula.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFormula"));		
		
		
		this.jButtonNuevoRelacionesFormula.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFormula"));
		
		
		this.jButtonNuevoRelacionesToolBarFormula.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFormula"));
			
		this.jMenuItemNuevoRelacionesFormula.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFormula"));		
		
		
		if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormula.jButtonModificarFormula.addActionListener(new ButtonActionListener(this,"ModificarFormula"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormula.jButtonModificarToolBarFormula.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormula"));
			
			this.jInternalFrameDetalleFormFormula.jMenuItemModificarFormula.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormula"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFormula.jButtonActualizarFormula.addActionListener (new ButtonActionListener(this,"ActualizarFormula"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormula.jButtonActualizarToolBarFormula.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormula"));
				
			this.jInternalFrameDetalleFormFormula.jMenuItemActualizarFormula.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormula"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormula.jButtonEliminarFormula.addActionListener (new ButtonActionListener(this,"EliminarFormula"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormula.jButtonEliminarToolBarFormula.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormula"));
						
			this.jInternalFrameDetalleFormFormula.jMenuItemEliminarFormula.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormula"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormula.jButtonCancelarFormula.addActionListener (new ButtonActionListener(this,"CancelarFormula"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormula.jButtonCancelarToolBarFormula.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormula"));
			
			this.jInternalFrameDetalleFormFormula.jMenuItemCancelarFormula.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormula"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFormula.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFormula"));		
		
		
		this.jButtonCerrarFormula.addActionListener (new ButtonActionListener(this,"CerrarFormula"));
		
		
		this.jButtonCerrarToolBarFormula.addActionListener (new ButtonActionListener(this,"CerrarToolBarFormula"));
			
		this.jMenuItemCerrarFormula.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFormula"));
			
		if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormula.jMenuItemDetalleCerrarFormula.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormula"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormula.jButtonGuardarCambiosFormula.addActionListener (new ButtonActionListener(this,"GuardarCambiosFormula"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormula.jButtonGuardarCambiosToolBarFormula.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormula"));
		}
		
		this.jButtonCopiarToolBarFormula.addActionListener (new ButtonActionListener(this,"CopiarToolBarFormula"));
			
		this.jButtonVerFormToolBarFormula.addActionListener (new ButtonActionListener(this,"VerFormToolBarFormula"));
		
		this.jMenuItemGuardarCambiosFormula.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFormula"));
			
		this.jMenuItemCopiarFormula.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFormula"));		
		
		this.jMenuItemVerFormFormula.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFormula"));		
		
		
		this.jButtonGuardarCambiosTablaFormula.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormula"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFormula.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFormula"));
			
		this.jMenuItemGuardarCambiosTablaFormula.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormula"));		
		
		
		
		this.jButtonRecargarInformacionFormula.addActionListener (new ButtonActionListener(this,"RecargarInformacionFormula"));
					
		this.jButtonRecargarInformacionToolBarFormula.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFormula"));
		
		this.jMenuItemRecargarInformacionFormula.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFormula"));		
		
		
		
		this.jButtonAnterioresFormula.addActionListener (new ButtonActionListener(this,"AnterioresFormula"));
		
		
		this.jButtonAnterioresToolBarFormula.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFormula"));
		
		this.jMenuItemAnterioresFormula.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFormula"));		
		
		
		this.jButtonSiguientesFormula.addActionListener (new ButtonActionListener(this,"SiguientesFormula"));
		
		
		this.jButtonSiguientesToolBarFormula.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFormula"));
			
		this.jMenuItemSiguientesFormula.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFormula"));
			
		this.jMenuItemAbrirOrderByFormula.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFormula"));
			
		this.jMenuItemMostrarOcultarFormula.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFormula"));
			
		this.jMenuItemDetalleAbrirOrderByFormula.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFormula"));
			
		this.jMenuItemDetalleMostarOcultarFormula.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFormula"));		
		
		
		this.jButtonNuevoGuardarCambiosFormula.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFormula"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormula.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFormula"));
			
		this.jMenuItemNuevoGuardarCambiosFormula.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFormula"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFormula.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFormula"));

		this.jCheckBoxSeleccionadosFormula.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFormula"));
		
		if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormula.jComboBoxTiposAccionesFormularioFormula.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormula"));
		}
		
		
		this.jComboBoxTiposRelacionesFormula.addActionListener (new ButtonActionListener(this,"TiposRelacionesFormula"));
			
		this.jComboBoxTiposAccionesFormula.addActionListener (new ButtonActionListener(this,"TiposAccionesFormula"));
					
		this.jComboBoxTiposSeleccionarFormula.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFormula"));
			
		this.jTextFieldValorCampoGeneralFormula.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFormula"));		
		
		
		if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonidFormulaBusqueda.addActionListener(new ButtonActionListener(this,"idFormulaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormula.jButtonid_empresaFormulaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormulaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonid_empresaFormulaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormulaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormula.jButtonid_tipo_formulaFormulaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_formulaFormulaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonid_tipo_formulaFormulaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_formulaFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtoncodigoFormulaBusqueda.addActionListener(new ButtonActionListener(this,"codigoFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonnombreFormulaBusqueda.addActionListener(new ButtonActionListener(this,"nombreFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonaliasFormulaBusqueda.addActionListener(new ButtonActionListener(this,"aliasFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonvalorFormulaBusqueda.addActionListener(new ButtonActionListener(this,"valorFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonformula1FormulaBusqueda.addActionListener(new ButtonActionListener(this,"formula1FormulaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoFormulaFormula.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormulaFormula"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFormula!=null) {
				this.jInternalFrameReporteDinamicoFormula.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormula"));
				this.jInternalFrameReporteDinamicoFormula.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormula"));
				this.jInternalFrameReporteDinamicoFormula.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormula"));
			}
			
			//this.jButtonCerrarReporteDinamicoFormula.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormula"));				
			//this.jButtonGenerarReporteDinamicoFormula.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormula"));
			//this.jButtonGenerarExcelReporteDinamicoFormula.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormula"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFormula!=null) {
				this.jInternalFrameImportacionFormula.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormula"));
				this.jInternalFrameImportacionFormula.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormula"));
				this.jInternalFrameImportacionFormula.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormula"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFormula.addActionListener (new ButtonActionListener(this,"AbrirOrderByFormula"));
			
			this.jButtonAbrirOrderByToolBarFormula.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFormula"));			
			
			if(this.jInternalFrameOrderByFormula!=null) {
				this.jInternalFrameOrderByFormula.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormula"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormula.jTabbedPaneRelacionesFormula.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormula"));
		
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
            		closingInternalFrameFormula();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFormula.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFormula = (JInternalFrameBase)event.getSource();
	            	
	            FormulaBeanSwingJInternalFrame jInternalFrameParent=(FormulaBeanSwingJInternalFrame)jInternalFrameDetalleFormFormula.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFormulaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFormula.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFormulaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFormula.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFormula.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormulaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormulaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormulaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFormula";
		inputMap = this.jButtonNuevoFormula.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFormula.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormulaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormulaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormulaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormulaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFormula";
		inputMap = this.jButtonNuevoRelacionesFormula.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFormula.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormulaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFormula";
		inputMap = this.jButtonModificarFormula.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFormula.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFormulaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFormula";
		inputMap = this.jButtonActualizarFormula.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFormula.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFormulaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFormula";
		inputMap = this.jButtonEliminarFormula.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFormula.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFormulaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFormula";
		inputMap = this.jButtonCancelarFormula.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFormula.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFormulaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFormula";
		inputMap = this.jButtonCerrarFormula.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFormula.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFormulaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFormula.jButtonGuardarCambiosFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFormula";
		inputMap = this.jInternalFrameDetalleFormFormula.jButtonGuardarCambiosFormula.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFormula.jButtonGuardarCambiosFormula.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFormulaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFormula.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFormulaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFormula.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFormulaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFormula.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFormulaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFormula.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFormulaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonidFormulaBusqueda.addActionListener(new ButtonActionListener(this,"idFormulaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormula.jButtonid_empresaFormulaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormulaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonid_empresaFormulaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormulaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormula.jButtonid_tipo_formulaFormulaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_formulaFormulaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonid_tipo_formulaFormulaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_formulaFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtoncodigoFormulaBusqueda.addActionListener(new ButtonActionListener(this,"codigoFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonnombreFormulaBusqueda.addActionListener(new ButtonActionListener(this,"nombreFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonaliasFormulaBusqueda.addActionListener(new ButtonActionListener(this,"aliasFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonvalorFormulaBusqueda.addActionListener(new ButtonActionListener(this,"valorFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormula.jButtonformula1FormulaBusqueda.addActionListener(new ButtonActionListener(this,"formula1FormulaBusqueda"));
		
		
		this.jButtonFK_IdTipoFormulaFormula.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormulaFormula"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFormulaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFormula.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFormula(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Formula formulaAux:this.formulaLogic.getFormulas()) {
					formulaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Formula formulaAux:formulas) {
					formulaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFormulaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormula(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Formula formulaAux:this.formulaLogic.getFormulas()) {
						formulaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Formula formulaAux:formulas) {
						formulaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Formula formulaAux:this.formulaLogic.getFormulas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Formula formulaAux:formulas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFormula(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormula.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormula.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormula,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFormulaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormula(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFormula.getSelectedRows();
			
			Formula formulaLocal=new Formula();
			
			//this.seleccionarTodosFormula(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulaLocal =(Formula) this.formulaLogic.getFormulas().toArray()[this.jTableDatosFormula.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					formulaLocal =(Formula) this.formulas.toArray()[this.jTableDatosFormula.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				formulaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Formula formulaAux:this.formulaLogic.getFormulas()) {
						formulaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Formula formulaAux:formulas) {
						formulaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFormula(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormula.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormula.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormula,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFormulaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFormulaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFormulaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFormula(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFormula.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Formula formulaAux:this.formulaLogic.getFormulas()) {
				
						if(sTipoSeleccionar.equals(FormulaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							formulaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FormulaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							formulaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FormulaConstantesFunciones.LABEL_ALIAS)) {
							existe=true;
							formulaAux.setalias(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FormulaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							formulaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormulaConstantesFunciones.LABEL_FORMULA1)) {
							existe=true;
							formulaAux.setformula1(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Formula formulaAux:formulas) {
					
						if(sTipoSeleccionar.equals(FormulaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							formulaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FormulaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							formulaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FormulaConstantesFunciones.LABEL_ALIAS)) {
							existe=true;
							formulaAux.setalias(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FormulaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							formulaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormulaConstantesFunciones.LABEL_FORMULA1)) {
							existe=true;
							formulaAux.setformula1(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFormula(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFormulaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFormula(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFormula=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFormula.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFormula.jComboBoxTiposAccionesFormularioFormula.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFormula) {				
					conSplash=true;//false;										
					
					//this.startProcessFormula(conSplash);
				
					this.generarReporteFormulasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormula.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormula.jComboBoxTiposAccionesFormularioFormula.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFormulasSeleccionados();
				//this.jComboBoxTiposAccionesFormula.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormulasSeleccionados(false);
				//this.jComboBoxTiposAccionesFormula.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormulasSeleccionados(true);
				//this.jComboBoxTiposAccionesFormula.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormula();
				
				this.exportarFormulasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormula.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormula.jComboBoxTiposAccionesFormularioFormula.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFormulas();
				//this.importarFormulas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormula.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormula.jComboBoxTiposAccionesFormularioFormula.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormula();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFormulasSeleccionados();
				//this.jComboBoxTiposAccionesFormula.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Formula", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFormula();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFormula)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFormula(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Formula",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormula.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormula.jComboBoxTiposAccionesFormularioFormula.setSelectedIndex(0);					
				}	
			} 			
			else if(FormulaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFormula) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFormula(conSplash);
					
						//this.actualizarParametrosGeneralFormula();
						
						this.generarReporteProcesoAccionFormulasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFormula.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFormula.jComboBoxTiposAccionesFormularioFormula.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FormulaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO FormulaS SELECCIONADOS?", "MANTENIMIENTO DE Formula", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFormula();
				
						this.actualizarParametrosGeneralFormula();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.formulaReturnGeneral=formulaLogic.procesarAccionFormulasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.formulaLogic.getFormulas(),this.formulaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFormulaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormula.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormula.jComboBoxTiposAccionesFormularioFormula.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFormula();
					
					FormulaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFormulaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormula.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormula.jComboBoxTiposAccionesFormularioFormula.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFormula(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFormulaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFormula();
			
			if(this.jInternalFrameDetalleFormFormula==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Formula> formulasSeleccionados=new ArrayList<Formula>();		
			Formula formula=new Formula();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFormula(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFormula.getSelectedItem();
			
			
			
			
			formulasSeleccionados=this.getFormulasSeleccionados(true);
			//this.sTipoAccion;
			
			if(formulasSeleccionados.size()==1) {
				for(Formula formulaAux:formulasSeleccionados) {
					formula=formulaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Tarjeta Credito")) {
					jButtonTarjetaCreditoActionPerformed(null,rowIndex,true,false,formula);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFormula();
			
      		//this.finishProcessFormula(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFormulaReturnGeneral() throws Exception {
		if(this.formulaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.formulaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.formulaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.formulaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.formulaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.formulaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFormula(false);
		}
		
		if(this.formulaReturnGeneral.getConRetornoLista() || this.formulaReturnGeneral.getConRetornoObjeto()) {
			if(this.formulaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formulaLogic.setFormulas(this.formulaReturnGeneral.getFormulas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.formulaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formulaLogic.setFormula(this.formulaReturnGeneral.getFormula());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFormula(false);
		}
	}
	
	public void actualizarParametrosGeneralFormula() throws Exception {
		
		
	}
	
	public ArrayList<Formula> getFormulasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Formula> formulasSeleccionados=new ArrayList<Formula>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFormula) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Formula formulaAux:formulaLogic.getFormulas()) {
					if(formulaAux.getIsSelected()) {
						formulasSeleccionados.add(formulaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Formula formulaAux:this.formulas) {
					if(formulaAux.getIsSelected()) {
						formulasSeleccionados.add(formulaAux);				
					}
				}
			}
			
			if(formulasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						formulasSeleccionados.addAll(this.formulaLogic.getFormulas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						formulasSeleccionados.addAll(this.formulas);				
					}
				}
			}
		} else {
			formulasSeleccionados.add(this.formula);
		}
		
		return formulasSeleccionados;
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
	
	public void generarReporteFormulasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFormulasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFormulasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormulasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormulasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesFormulasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Formula",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFormulasSeleccionados() throws Exception {
		ArrayList<Formula> formulasSeleccionados=new ArrayList<Formula>();		
		
		formulasSeleccionados=this.getFormulasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFormulas("Todos",formulasSeleccionados);
		
	}	
	
	public void generarReporteNormalFormulasSeleccionados() throws Exception {
		ArrayList<Formula> formulasSeleccionados=new ArrayList<Formula>();		
		
		formulasSeleccionados=this.getFormulasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFormulas("Todos",formulasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFormulasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Formula> formulasSeleccionados=new ArrayList<Formula>();
		
		formulasSeleccionados=this.getFormulasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFormulas("Todos",formulasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFormulasSeleccionados() throws Exception {
		ArrayList<Formula> formulasSeleccionados=new ArrayList<Formula>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFormula();
		
		
		formulasSeleccionados=this.getFormulasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFormula();
		
		
		//this.generarReporteFormulas("Todos",formulasSeleccionados ,formulaImplementable,formulaImplementableHome);
	}
	
	public void mostrarImportacionFormulas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFormula();
		
		this.abrirFrameImportacionFormula();		
		
			
		//this.generarReporteFormulas("Todos",formulasSeleccionados ,formulaImplementable,formulaImplementableHome);
	}
	
	public void importarFormulas() throws Exception {		
	
	}
	
	public void exportarFormulasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFormulasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFormulasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFormulasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Formula",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFormulasSeleccionados() throws Exception {
		ArrayList<Formula> formulasSeleccionados=new ArrayList<Formula>();		
		
		formulasSeleccionados=this.getFormulasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formula."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFormula(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Formula formulaAux:formulasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFormula(formulaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//formulaAux.setsDetalleGeneralEntityReporte(formulaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formula",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFormula(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FormulaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormulaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormulaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormulaConstantesFunciones.LABEL_IDTIPOFORMULA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormulaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormulaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormulaConstantesFunciones.LABEL_ALIAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormulaConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormulaConstantesFunciones.LABEL_FORMULA1;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFormula(Formula formula,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=formula.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=formula.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=formula.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formula.gettipoformula_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formula.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formula.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formula.getalias();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formula.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formula.getformula1();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFormulasSeleccionados() throws Exception {
		ArrayList<Formula> formulasSeleccionados=new ArrayList<Formula>();		
		
		formulasSeleccionados=this.getFormulasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formula.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Formulas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFormula(row);				
				iRow++;
			}				
			
			for(Formula formulaAux:formulasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFormula(formulaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formula",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFormulasSeleccionados() throws Exception {
		ArrayList<Formula> formulasSeleccionados=new ArrayList<Formula>();		
		
		formulasSeleccionados=this.getFormulasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formula.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("formulas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("formula");
			//elementRoot.appendChild(element);
		
			for(Formula formulaAux:formulasSeleccionados) {
				element = document.createElement("formula");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFormula(formulaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formula",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFormula(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FormulaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FormulaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FormulaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormulaConstantesFunciones.LABEL_IDTIPOFORMULA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormulaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormulaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(FormulaConstantesFunciones.LABEL_ALIAS);
		cell = row.createCell(iColumn++);cell.setCellValue(FormulaConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(FormulaConstantesFunciones.LABEL_FORMULA1);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFormula(Formula formula,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(formula.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(formula.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formula.gettipoformula_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formula.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(formula.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(formula.getalias());
		cell = row.createCell(iColumn++);cell.setCellValue(formula.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(formula.getformula1());				
	}
	
	public void setFilaDatosExportarXmlFormula(Formula formula,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FormulaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(formula.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FormulaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(formula.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FormulaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(formula.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipoformula_descripcion = document.createElement(FormulaConstantesFunciones.IDTIPOFORMULA);
		elementtipoformula_descripcion.appendChild(document.createTextNode(formula.gettipoformula_descripcion()));
		element.appendChild(elementtipoformula_descripcion);

		Element elementcodigo = document.createElement(FormulaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(formula.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(FormulaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(formula.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementalias = document.createElement(FormulaConstantesFunciones.ALIAS);
		elementalias.appendChild(document.createTextNode(formula.getalias().trim()));
		element.appendChild(elementalias);

		Element elementvalor = document.createElement(FormulaConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(formula.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementformula1 = document.createElement(FormulaConstantesFunciones.FORMULA1);
		elementformula1.appendChild(document.createTextNode(formula.getformula1().trim()));
		element.appendChild(elementformula1);
	}
	
	public void generarReporteGroupGenericoFormulasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Formula> formulasSeleccionados=new ArrayList<Formula>();
		
		formulasSeleccionados=this.getFormulasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFormula(formulasSeleccionados);
		
		this.generarReporteFormulas("Todos",formulasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFormula(ArrayList<Formula> formulasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Formula formulaAux:formulasSeleccionados) {
				formulaAux.setsDetalleGeneralEntityReporte(formulaAux.toString());
			
				if(sTipoSeleccionar.equals(FormulaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					formulaAux.setsDescripcionGeneralEntityReporte1(formulaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormulaConstantesFunciones.LABEL_IDTIPOFORMULA)) {
					existe=true;
					formulaAux.setsDescripcionGeneralEntityReporte1(formulaAux.gettipoformula_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormulaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					formulaAux.setsDescripcionGeneralEntityReporte1(formulaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(FormulaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					formulaAux.setsDescripcionGeneralEntityReporte1(formulaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(FormulaConstantesFunciones.LABEL_ALIAS)) {
					existe=true;
					formulaAux.setsDescripcionGeneralEntityReporte1(formulaAux.getalias());
				}
				 else if(sTipoSeleccionar.equals(FormulaConstantesFunciones.LABEL_FORMULA1)) {
					existe=true;
					formulaAux.setsDescripcionGeneralEntityReporte1(formulaAux.getformula1());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFormula(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFormula=true;
				this.isVisibilidadCeldaNuevoRelacionesFormula=true;
				this.isVisibilidadCeldaGuardarCambiosFormula=true;
			}
			
			this.isVisibilidadCeldaModificarFormula=false;
			this.isVisibilidadCeldaActualizarFormula=false;
			this.isVisibilidadCeldaEliminarFormula=false;
			this.isVisibilidadCeldaCancelarFormula=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormula=true;
				} else {
					this.isVisibilidadCeldaGuardarFormula=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFormula=false;
			this.isVisibilidadCeldaNuevoRelacionesFormula=false;
			this.isVisibilidadCeldaGuardarCambiosFormula=false;
			this.isVisibilidadCeldaModificarFormula=false;
			this.isVisibilidadCeldaActualizarFormula=true;
			this.isVisibilidadCeldaEliminarFormula=false;
			this.isVisibilidadCeldaCancelarFormula=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormula=true;
				} else {
					this.isVisibilidadCeldaGuardarFormula=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFormula=false;
			this.isVisibilidadCeldaNuevoRelacionesFormula=false;
			this.isVisibilidadCeldaGuardarCambiosFormula=false;
			this.isVisibilidadCeldaModificarFormula=false;
			this.isVisibilidadCeldaActualizarFormula=true;
			this.isVisibilidadCeldaEliminarFormula=true;
			this.isVisibilidadCeldaCancelarFormula=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormula=true;
				} else {
					this.isVisibilidadCeldaGuardarFormula=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFormula=false;
			this.isVisibilidadCeldaNuevoRelacionesFormula=false;
			this.isVisibilidadCeldaGuardarCambiosFormula=false;
			this.isVisibilidadCeldaModificarFormula=false;
			this.isVisibilidadCeldaActualizarFormula=true;
			this.isVisibilidadCeldaEliminarFormula=false;
			this.isVisibilidadCeldaCancelarFormula=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormula=false;
				} else {
					this.isVisibilidadCeldaGuardarFormula=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFormula=true;
			this.isVisibilidadCeldaNuevoRelacionesFormula=true;
			this.isVisibilidadCeldaGuardarCambiosFormula=true;
			this.isVisibilidadCeldaModificarFormula=false;
			this.isVisibilidadCeldaActualizarFormula=false;
			this.isVisibilidadCeldaEliminarFormula=false;
			this.isVisibilidadCeldaCancelarFormula=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormula=true;
				} else {
					this.isVisibilidadCeldaGuardarFormula=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFormula=false;
			this.isVisibilidadCeldaNuevoRelacionesFormula=false;
			this.isVisibilidadCeldaGuardarCambiosFormula=false;
			this.isVisibilidadCeldaActualizarFormula=false;
			this.isVisibilidadCeldaEliminarFormula=false;
			this.isVisibilidadCeldaCancelarFormula=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormula=false;
				} else {
					this.isVisibilidadCeldaGuardarFormula=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFormula=false;
			this.isVisibilidadCeldaNuevoRelacionesFormula=false;
			this.isVisibilidadCeldaGuardarCambiosFormula=false;
			this.isVisibilidadCeldaModificarFormula=true;
			this.isVisibilidadCeldaActualizarFormula=false;
			this.isVisibilidadCeldaEliminarFormula=false;
			this.isVisibilidadCeldaCancelarFormula=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormula=false;
				} else {
					this.isVisibilidadCeldaGuardarFormula=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FormulaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFormula=true;
			this.isVisibilidadCeldaNuevoRelacionesFormula=true;
			this.isVisibilidadCeldaGuardarCambiosFormula=true;
		} else {
			this.actualizarEstadoPanelsFormula(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFormula=false;
			//this.isVisibilidadCeldaVerFormFormula=false;
			this.isVisibilidadCeldaDuplicarFormula=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!formulaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFormula=false;
		} else {
			this.isVisibilidadCeldaNuevoFormula=false;
			this.isVisibilidadCeldaGuardarCambiosFormula=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(formulaSessionBean.getEsGuardarRelacionado()) {
			if(!formulaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFormula=false;												
			}
			
			this.jButtonCerrarFormula.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFormula=false;
		}
		
		if(!this.permiteMantenimiento(this.formula)) {
			this.isVisibilidadCeldaActualizarFormula=false;
			this.isVisibilidadCeldaEliminarFormula=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFormula() {
		this.isVisibilidadCeldaNuevoFormula=false;
		this.isVisibilidadCeldaGuardarCambiosFormula=false;
	}
	
	public void actualizarEstadoPanelsFormula(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFormula!=null) {
				this.jScrollPanelDatosEdicionFormula.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormula!=null) {
				this.jTabbedPaneBusquedasFormula.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormula!=null) {
				this.jScrollPanelDatosFormula.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormula!=null) {
				this.jPanelPaginacionFormula.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormula!=null) {
				this.jPanelParametrosReportesFormula.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFormula!=null) {
				this.jScrollPanelDatosEdicionFormula.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormula!=null) {
				this.jTabbedPaneBusquedasFormula.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFormula!=null) {
				this.jScrollPanelDatosFormula.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormula!=null) {
				this.jPanelPaginacionFormula.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormula!=null) {
				this.jPanelParametrosReportesFormula.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFormula!=null) {
				this.jScrollPanelDatosEdicionFormula.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormula!=null) {
				this.jTabbedPaneBusquedasFormula.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormula!=null) {
				this.jScrollPanelDatosFormula.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormula!=null) {
				this.jPanelPaginacionFormula.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormula!=null) {
				this.jPanelParametrosReportesFormula.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFormula!=null) {
				this.jScrollPanelDatosEdicionFormula.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormula!=null) {
				this.jTabbedPaneBusquedasFormula.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormula!=null) {
				this.jScrollPanelDatosFormula.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormula!=null) {
				this.jPanelPaginacionFormula.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormula!=null) {
				this.jPanelParametrosReportesFormula.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFormula!=null) {
				this.jScrollPanelDatosEdicionFormula.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormula!=null) {
				this.jTabbedPaneBusquedasFormula.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormula!=null) {
				this.jScrollPanelDatosFormula.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormula!=null) {
				this.jPanelPaginacionFormula.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormula!=null) {
				this.jPanelParametrosReportesFormula.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFormula!=null) {
				this.jScrollPanelDatosEdicionFormula.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormula!=null) {
				this.jTabbedPaneBusquedasFormula.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormula!=null) {
				this.jScrollPanelDatosFormula.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormula!=null) {
				this.jPanelPaginacionFormula.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormula!=null) {
				this.jPanelParametrosReportesFormula.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFormula!=null) {
				this.jScrollPanelDatosEdicionFormula.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormula!=null) {
				this.jTabbedPaneBusquedasFormula.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormula!=null) {
				this.jScrollPanelDatosFormula.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormula!=null) {
				this.jPanelPaginacionFormula.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormula!=null) {
				this.jPanelParametrosReportesFormula.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.formulaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFormula!=null) {
					this.jTabbedPaneBusquedasFormula.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFormula!=null) {
				this.jPanelParametrosReportesFormula.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.formulaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormula!=null) {
				this.jTabbedPaneBusquedasFormula.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFormula!=null) {
				this.jPanelParametrosReportesFormula.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTipoFormula=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoFormula) {this.jTabbedPaneBusquedasFormula.remove(jPanelFK_IdTipoFormulaFormula);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoFormula(Boolean isParaTipoFormula){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoFormulaNegation=!isParaTipoFormula;

			this.isVisibilidadFK_IdTipoFormula=isParaTipoFormula;
			if(!this.isVisibilidadFK_IdTipoFormula) {this.jTabbedPaneBusquedasFormula.remove(jPanelFK_IdTipoFormulaFormula);}
		}
		
	}
	
	

	public String registrarSesionFormulaComisionParaTarjetaCreditos() throws Exception {
		Boolean isPaginaPopupTarjetaCredito=false;

		try {

			if(this.formulaSessionBean==null) {
				this.formulaSessionBean=new FormulaSessionBean();
			}

			if(this.jInternalFrameDetalleFormFormula.tarjetacreditoSessionBean==null) {
				this.jInternalFrameDetalleFormFormula.tarjetacreditoSessionBean=new TarjetaCreditoSessionBean();
			}

			this.jInternalFrameDetalleFormFormula.tarjetacreditoSessionBean.setsPathNavegacionActual(formulaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormFormula.tarjetacreditoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTarjetaCredito=this.jInternalFrameDetalleFormFormula.tarjetacreditoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormFormula.tarjetacreditoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTarjetaCredito(true);
			this.jInternalFrameDetalleFormFormula.tarjetacreditoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetaCredito(FormulaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormFormula.tarjetacreditoSessionBean.setisBusquedaDesdeForeignKeySesionFormulaComision(true);
			this.jInternalFrameDetalleFormFormula.tarjetacreditoSessionBean.setlidFormulaComisionActual(this.idFormulaActual);

			formulaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyFormula(true);
			formulaSessionBean.setlIdFormulaActualForeignKey(this.idFormulaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FormulaSessionBean formulaSessionBean=new FormulaSessionBean();
		
		if(this.formulaSessionBean==null) {
			this.formulaSessionBean=new FormulaSessionBean();
		}
		
		this.formulaSessionBean.setsUltimaBusquedaFormula(this.getsAccionBusqueda());
		this.formulaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.formulaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			formulaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoFormula")) {
			formulaSessionBean.setid_tipo_formula(this.getid_tipo_formulaFK_IdTipoFormula());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FormulaSessionBean formulaSessionBean=new FormulaSessionBean();
		
		if(this.formulaSessionBean==null) {
			this.formulaSessionBean=new FormulaSessionBean();
		}
		
		if(this.formulaSessionBean.getsUltimaBusquedaFormula()!=null&&!this.formulaSessionBean.getsUltimaBusquedaFormula().equals("")) {
			this.setsAccionBusqueda(formulaSessionBean.getsUltimaBusquedaFormula());
			this.setiNumeroPaginacion(formulaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(formulaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(formulaSessionBean.getid_empresa());
				formulaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoFormula")) {
				this.setid_tipo_formulaFK_IdTipoFormula(formulaSessionBean.getid_tipo_formula());
				formulaSessionBean.setid_tipo_formula(-1L);
			}
		}
		
		this.formulaSessionBean.setsUltimaBusquedaFormula("");
		this.formulaSessionBean.setiNumeroPaginacion(FormulaConstantesFunciones.INUMEROPAGINACION);
		this.formulaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFormula(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFormula() {
		this.updateBorderResaltarBusquedasFormularioFormula();
		this.updateVisibilidadBusquedasFormularioFormula();
		this.updateHabilitarBusquedasFormularioFormula();
	}
	
	public void updateBorderResaltarBusquedasFormularioFormula() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFormula.getComponents().length>0) {
	

		if(this.formulaConstantesFunciones.resaltarFK_IdTipoFormulaFormula!=null) {
			index= this.jTabbedPaneBusquedasFormula.indexOfComponent(this.jPanelFK_IdTipoFormulaFormula);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormula.getComponent(index);
				jPanel.setBorder(this.formulaConstantesFunciones.resaltarFK_IdTipoFormulaFormula);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFormula() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFormula.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormula.indexOfComponent(this.jPanelFK_IdTipoFormulaFormula);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormula.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formulaConstantesFunciones.mostrarFK_IdTipoFormulaFormula);
			if(!this.formulaConstantesFunciones.mostrarFK_IdTipoFormulaFormula && index>-1) {
				this.jTabbedPaneBusquedasFormula.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFormula() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFormula.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormula.indexOfComponent(this.jPanelFK_IdTipoFormulaFormula);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormula.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formulaConstantesFunciones.activarFK_IdTipoFormulaFormula);
				this.jTabbedPaneBusquedasFormula.setEnabledAt(index,this.formulaConstantesFunciones.activarFK_IdTipoFormulaFormula);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFormula(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoFormula")) {
			index= this.jTabbedPaneBusquedasFormula.indexOfComponent(this.jPanelFK_IdTipoFormulaFormula);

			this.jTabbedPaneBusquedasFormula.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormula.getComponent(index);

			this.formulaConstantesFunciones.setResaltarFK_IdTipoFormulaFormula(resaltar);

			jPanel.setBorder(this.formulaConstantesFunciones.resaltarFK_IdTipoFormulaFormula);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFormula.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFormula() throws Exception {

		if(this.jInternalFrameDetalleFormFormula==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFormula();
		this.updateVisibilidadResaltarControlesFormularioFormula();
		this.updateHabilitarResaltarControlesFormularioFormula();
		
	}
	
	public void updateBorderResaltarControlesFormularioFormula() throws Exception {
		if(this.jInternalFrameDetalleFormFormula==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.formulaConstantesFunciones.resaltaridFormula!=null && this.jInternalFrameDetalleFormFormula!=null) {this.jInternalFrameDetalleFormFormula.jLabelidFormula.setBorder(this.formulaConstantesFunciones.resaltaridFormula);}
		if(this.formulaConstantesFunciones.resaltarid_empresaFormula!=null && this.jInternalFrameDetalleFormFormula!=null) {this.jInternalFrameDetalleFormFormula.jComboBoxid_empresaFormula.setBorder(this.formulaConstantesFunciones.resaltarid_empresaFormula);}
		if(this.formulaConstantesFunciones.resaltarid_tipo_formulaFormula!=null && this.jInternalFrameDetalleFormFormula!=null) {this.jInternalFrameDetalleFormFormula.jComboBoxid_tipo_formulaFormula.setBorder(this.formulaConstantesFunciones.resaltarid_tipo_formulaFormula);}
		if(this.formulaConstantesFunciones.resaltarcodigoFormula!=null && this.jInternalFrameDetalleFormFormula!=null) {this.jInternalFrameDetalleFormFormula.jTextFieldcodigoFormula.setBorder(this.formulaConstantesFunciones.resaltarcodigoFormula);}
		if(this.formulaConstantesFunciones.resaltarnombreFormula!=null && this.jInternalFrameDetalleFormFormula!=null) {this.jInternalFrameDetalleFormFormula.jTextAreanombreFormula.setBorder(this.formulaConstantesFunciones.resaltarnombreFormula);}
		if(this.formulaConstantesFunciones.resaltaraliasFormula!=null && this.jInternalFrameDetalleFormFormula!=null) {this.jInternalFrameDetalleFormFormula.jTextFieldaliasFormula.setBorder(this.formulaConstantesFunciones.resaltaraliasFormula);}
		if(this.formulaConstantesFunciones.resaltarvalorFormula!=null && this.jInternalFrameDetalleFormFormula!=null) {this.jInternalFrameDetalleFormFormula.jTextFieldvalorFormula.setBorder(this.formulaConstantesFunciones.resaltarvalorFormula);}
		if(this.formulaConstantesFunciones.resaltarformula1Formula!=null && this.jInternalFrameDetalleFormFormula!=null) {this.jInternalFrameDetalleFormFormula.jTextAreaformula1Formula.setBorder(this.formulaConstantesFunciones.resaltarformula1Formula);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFormula() throws Exception {		
		if(this.jInternalFrameDetalleFormFormula==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormula!=null) {
	
		//this.jInternalFrameDetalleFormFormula.jLabelidFormula.setVisible(this.formulaConstantesFunciones.mostraridFormula);
		this.jInternalFrameDetalleFormFormula.jPanelidFormula.setVisible(this.formulaConstantesFunciones.mostraridFormula);
		//this.jInternalFrameDetalleFormFormula.jComboBoxid_empresaFormula.setVisible(this.formulaConstantesFunciones.mostrarid_empresaFormula);
		this.jInternalFrameDetalleFormFormula.jPanelid_empresaFormula.setVisible(this.formulaConstantesFunciones.mostrarid_empresaFormula);
		//this.jInternalFrameDetalleFormFormula.jComboBoxid_tipo_formulaFormula.setVisible(this.formulaConstantesFunciones.mostrarid_tipo_formulaFormula);
		this.jInternalFrameDetalleFormFormula.jPanelid_tipo_formulaFormula.setVisible(this.formulaConstantesFunciones.mostrarid_tipo_formulaFormula);
		//this.jInternalFrameDetalleFormFormula.jTextFieldcodigoFormula.setVisible(this.formulaConstantesFunciones.mostrarcodigoFormula);
		this.jInternalFrameDetalleFormFormula.jPanelcodigoFormula.setVisible(this.formulaConstantesFunciones.mostrarcodigoFormula);
		//this.jInternalFrameDetalleFormFormula.jTextAreanombreFormula.setVisible(this.formulaConstantesFunciones.mostrarnombreFormula);
		this.jInternalFrameDetalleFormFormula.jPanelnombreFormula.setVisible(this.formulaConstantesFunciones.mostrarnombreFormula);
		//this.jInternalFrameDetalleFormFormula.jTextFieldaliasFormula.setVisible(this.formulaConstantesFunciones.mostraraliasFormula);
		this.jInternalFrameDetalleFormFormula.jPanelaliasFormula.setVisible(this.formulaConstantesFunciones.mostraraliasFormula);
		//this.jInternalFrameDetalleFormFormula.jTextFieldvalorFormula.setVisible(this.formulaConstantesFunciones.mostrarvalorFormula);
		this.jInternalFrameDetalleFormFormula.jPanelvalorFormula.setVisible(this.formulaConstantesFunciones.mostrarvalorFormula);
		//this.jInternalFrameDetalleFormFormula.jTextAreaformula1Formula.setVisible(this.formulaConstantesFunciones.mostrarformula1Formula);
		this.jInternalFrameDetalleFormFormula.jPanelformula1Formula.setVisible(this.formulaConstantesFunciones.mostrarformula1Formula);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFormula() throws Exception {
		if(this.jInternalFrameDetalleFormFormula==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormula!=null) {
	
		this.jInternalFrameDetalleFormFormula.jLabelidFormula.setEnabled(this.formulaConstantesFunciones.activaridFormula);
		this.jInternalFrameDetalleFormFormula.jComboBoxid_empresaFormula.setEnabled(this.formulaConstantesFunciones.activarid_empresaFormula);
		this.jInternalFrameDetalleFormFormula.jComboBoxid_tipo_formulaFormula.setEnabled(this.formulaConstantesFunciones.activarid_tipo_formulaFormula);
		this.jInternalFrameDetalleFormFormula.jTextFieldcodigoFormula.setEnabled(this.formulaConstantesFunciones.activarcodigoFormula);
		this.jInternalFrameDetalleFormFormula.jTextAreanombreFormula.setEnabled(this.formulaConstantesFunciones.activarnombreFormula);
		this.jInternalFrameDetalleFormFormula.jTextFieldaliasFormula.setEnabled(this.formulaConstantesFunciones.activaraliasFormula);
		this.jInternalFrameDetalleFormFormula.jTextFieldvalorFormula.setEnabled(this.formulaConstantesFunciones.activarvalorFormula);
		this.jInternalFrameDetalleFormFormula.jTextAreaformula1Formula.setEnabled(this.formulaConstantesFunciones.activarformula1Formula);
		}
	}
	
		
}