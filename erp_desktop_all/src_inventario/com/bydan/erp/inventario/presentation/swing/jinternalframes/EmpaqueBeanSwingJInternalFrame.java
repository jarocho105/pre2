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

import com.bydan.erp.inventario.util.EmpaqueConstantesFunciones;
import com.bydan.erp.inventario.util.EmpaqueParameterReturnGeneral;
//import com.bydan.erp.inventario.util.EmpaqueParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.EmpaqueBean;
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
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EmpaqueBeanSwingJInternalFrame extends EmpaqueJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EmpaqueBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Empaque> empaqueValidator = new ClassValidator<Empaque>(Empaque.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Empaque empaque;	
	public Empaque empaqueAux;
	public Empaque empaqueAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Empaque empaqueTotales;
	public Long idEmpaqueActual;
	public Long iIdNuevoEmpaque=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosDetalleProforma=false;

	public Boolean getIsTienePermisosDetalleProforma() {
		return isTienePermisosDetalleProforma;
	}

	public void setIsTienePermisosDetalleProforma(Boolean isTienePermisosDetalleProforma) {
		this.isTienePermisosDetalleProforma= isTienePermisosDetalleProforma;
	}


	public Boolean isTienePermisosDetaNotaCreditoSoli=false;

	public Boolean getIsTienePermisosDetaNotaCreditoSoli() {
		return isTienePermisosDetaNotaCreditoSoli;
	}

	public void setIsTienePermisosDetaNotaCreditoSoli(Boolean isTienePermisosDetaNotaCreditoSoli) {
		this.isTienePermisosDetaNotaCreditoSoli= isTienePermisosDetaNotaCreditoSoli;
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
	
	public Boolean isPermisoTodoEmpaque;
	public Boolean isPermisoNuevoEmpaque;
	public Boolean isPermisoActualizarEmpaque;
	public Boolean isPermisoActualizarOriginalEmpaque;
	public Boolean isPermisoEliminarEmpaque;
	public Boolean isPermisoGuardarCambiosEmpaque;
	public Boolean isPermisoConsultaEmpaque;
	public Boolean isPermisoBusquedaEmpaque;
	public Boolean isPermisoReporteEmpaque;
	public Boolean isPermisoPaginacionMedioEmpaque;
	public Boolean isPermisoPaginacionAltoEmpaque;
	public Boolean isPermisoPaginacionTodoEmpaque;
	public Boolean isPermisoCopiarEmpaque;
	public Boolean isPermisoVerFormEmpaque;
	public Boolean isPermisoDuplicarEmpaque;
	public Boolean isPermisoOrdenEmpaque;
	
	
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
	
	public EmpaqueParameterReturnGeneral empaqueReturnGeneral;
	public EmpaqueParameterReturnGeneral empaqueParameterGeneral;
	
	

	public DetaNotaCreditoSoliLogic detanotacreditosoliLogic=null;

	public DetaNotaCreditoSoliLogic getDetaNotaCreditoSoliLogic() {
		return detanotacreditosoliLogic;
	}

	public void setDetaNotaCreditoSoliLogic(DetaNotaCreditoSoliLogic detanotacreditosoliLogic) {
		this.detanotacreditosoliLogic = detanotacreditosoliLogic;
	}


	public DetalleProformaLogic detalleproformaLogic=null;

	public DetalleProformaLogic getDetalleProformaLogic() {
		return detalleproformaLogic;
	}

	public void setDetalleProformaLogic(DetalleProformaLogic detalleproformaLogic) {
		this.detalleproformaLogic = detalleproformaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEmpaque=false;
	public Boolean esParaAccionDesdeFormularioEmpaque=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EmpaqueSessionBeanAdditional empaqueSessionBeanAdditional=null;
	
	public EmpaqueSessionBeanAdditional getEmpaqueSessionBeanAdditional() {
		return this.empaqueSessionBeanAdditional;
	}
	
	public void setEmpaqueSessionBeanAdditional(EmpaqueSessionBeanAdditional empaqueSessionBeanAdditional) {
		try {
			this.empaqueSessionBeanAdditional=empaqueSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EmpaqueBeanSwingJInternalFrameAdditional empaqueBeanSwingJInternalFrameAdditional=null;
	//public class EmpaqueBeanSwingJInternalFrame
	
	public EmpaqueBeanSwingJInternalFrameAdditional getEmpaqueBeanSwingJInternalFrameAdditional() {
		return this.empaqueBeanSwingJInternalFrameAdditional;
	}
	
	public void setEmpaqueBeanSwingJInternalFrameAdditional(EmpaqueBeanSwingJInternalFrameAdditional empaqueBeanSwingJInternalFrameAdditional) {
		try {
			this.empaqueBeanSwingJInternalFrameAdditional=empaqueBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EmpaqueLogic empaqueLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Empaque empaqueBean;
	public EmpaqueConstantesFunciones empaqueConstantesFunciones;
	//public EmpaqueParameterReturnGeneral empaqueReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<Empaque> empaques;	
	//public List<Empaque> empaquesEliminados;
	//public List<Empaque> empaquesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEmpaque=false;
	public Boolean isVisibilidadCeldaDuplicarEmpaque=true;
	public Boolean isVisibilidadCeldaCopiarEmpaque=true;
	public Boolean isVisibilidadCeldaVerFormEmpaque=true;
	public Boolean isVisibilidadCeldaOrdenEmpaque=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEmpaque=false;
	public Boolean isVisibilidadCeldaModificarEmpaque=false;
	public Boolean isVisibilidadCeldaActualizarEmpaque=false;
	public Boolean isVisibilidadCeldaEliminarEmpaque=false;
	public Boolean isVisibilidadCeldaCancelarEmpaque=false;
	public Boolean isVisibilidadCeldaGuardarEmpaque=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEmpaque=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoEmpaque() {
		return this.iIdNuevoEmpaque;
	}

	public void setiIdNuevoEmpaque(Long iIdNuevoEmpaque) {
		this.iIdNuevoEmpaque = iIdNuevoEmpaque;
	}
	
	public Long getidEmpaqueActual() {
		return this.idEmpaqueActual;
	}

	public void setidEmpaqueActual(Long idEmpaqueActual) {
		this.idEmpaqueActual = idEmpaqueActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Empaque getempaque() {
		return this.empaque;
	}

	public void setempaque(Empaque empaque) {
		this.empaque = empaque;
	}
	
	public Empaque getempaqueAux() {
		return this.empaqueAux;
	}

	public void setempaqueAux(Empaque empaqueAux) {
		this.empaqueAux = empaqueAux;
	}				
	
	public Empaque getempaqueAnterior() {
		return this.empaqueAnterior;
	}

	public void setempaqueAnterior(Empaque empaqueAnterior) {
		this.empaqueAnterior = empaqueAnterior;
	}	
	
	public Empaque getempaqueTotales() {
		return this.empaqueTotales;
	}

	public void setempaqueTotales(Empaque empaqueTotales) {
		this.empaqueTotales = empaqueTotales;
	}	
	
	public Empaque getempaqueBean() {
		return this.empaqueBean;
	}

	public void setempaqueBean(Empaque empaqueBean) {
		this.empaqueBean = empaqueBean;
	}	
	
	public EmpaqueParameterReturnGeneral getempaqueReturnGeneral() {
		return this.empaqueReturnGeneral;
	}

	public void setempaqueReturnGeneral(EmpaqueParameterReturnGeneral empaqueReturnGeneral) {
		this.empaqueReturnGeneral = empaqueReturnGeneral;
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
	
	
	public EmpaqueLogic getEmpaqueLogic()	{		
		return empaqueLogic;
	}

	public void setEmpaqueLogic(EmpaqueLogic empaqueLogic) {
		this.empaqueLogic = empaqueLogic;
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
	
	public Boolean getIsEsNuevoEmpaque() {
		return isEsNuevoEmpaque;
	}

	public void setIsEsNuevoEmpaque(Boolean isEsNuevoEmpaque) {
		this.isEsNuevoEmpaque = isEsNuevoEmpaque;
	}

	public Boolean getEsParaAccionDesdeFormularioEmpaque() {
		return esParaAccionDesdeFormularioEmpaque;
	}
	
	public void setEsParaAccionDesdeFormularioEmpaque(Boolean esParaAccionDesdeFormularioEmpaque) {
		this.esParaAccionDesdeFormularioEmpaque = esParaAccionDesdeFormularioEmpaque;
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

			if(this.empaqueSessionBean==null) {
				this.empaqueSessionBean=new EmpaqueSessionBean();
			}

			if(!this.empaqueSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(empaqueSessionBean.getlidEmpresaActual());
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

					if(this.empaque!=null) {
						this.empaque.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEmpaque!=null) {
						this.jInternalFrameDetalleFormEmpaque.jComboBoxid_empresaEmpaque.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEmpaque.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEmpaque!=null) {
						if(this.jInternalFrameDetalleFormEmpaque.jComboBoxid_empresaEmpaque.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpaque.jComboBoxid_empresaEmpaque.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEmpaqueGenerico)throws Exception
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
				jComboBoxid_empresaEmpaqueGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEmpaqueGenerico!=null && jComboBoxid_empresaEmpaqueGenerico.getItemCount()>0) {
					jComboBoxid_empresaEmpaqueGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Empaque empaque,JComboBox jComboBoxid_empresaEmpaqueGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEmpaqueGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEmpaque.jComboBoxid_empresaEmpaque.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEmpaqueGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				empaque.setid_empresa(empresaAux.getId());
				empaque.setempresa_descripcion(EmpaqueConstantesFunciones.getEmpresaDescripcion(empresaAux));
				empaque.setEmpresa(empresaAux);			}
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

					if(!EmpaqueJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpaque!=null) { 
							this.jInternalFrameDetalleFormEmpaque.jComboBoxid_empresaEmpaque.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEmpaque.jComboBoxid_empresaEmpaque.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpaque!=null) { 
					}

					if(!EmpaqueJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEmpaque!=null) {
							this.jInternalFrameDetalleFormEmpaque.jComboBoxid_empresaEmpaque.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpaque!=null) {
							this.jInternalFrameDetalleFormEmpaque.jComboBoxid_empresaEmpaque.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesEmpaque() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EmpaqueConstantesFunciones.refrescarForeignKeysDescripcionesEmpaque(this.empaqueLogic.getEmpaques());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EmpaqueConstantesFunciones.refrescarForeignKeysDescripcionesEmpaque(this.empaques);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//empaqueLogic.setEmpaques(this.empaques);
			empaqueLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EmpaqueParameterReturnGeneral getEmpaqueParameterGeneral() {
		return this.empaqueParameterGeneral;
	}
	
	public void setEmpaqueParameterGeneral(EmpaqueParameterReturnGeneral empaqueParameterGeneral) {
		this.empaqueParameterGeneral = empaqueParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEmpaque() {
		return isPermisoTodoEmpaque;
	}

	public void setIsPermisoTodoEmpaque(Boolean isPermisoTodoEmpaque) {
		this.isPermisoTodoEmpaque = isPermisoTodoEmpaque;
	}

	public Boolean getIsPermisoNuevoEmpaque() {
		return isPermisoNuevoEmpaque;
	}

	public void setIsPermisoNuevoEmpaque(Boolean isPermisoNuevoEmpaque) {
		this.isPermisoNuevoEmpaque = isPermisoNuevoEmpaque;
	}

	public Boolean getIsPermisoActualizarEmpaque() {
		return isPermisoActualizarEmpaque;
	}

	public void setIsPermisoActualizarEmpaque(Boolean isPermisoActualizarEmpaque) {
		this.isPermisoActualizarEmpaque = isPermisoActualizarEmpaque;
	}

	public Boolean getIsPermisoEliminarEmpaque() {
		return isPermisoEliminarEmpaque;
	}

	public void setIsPermisoEliminarEmpaque(Boolean isPermisoEliminarEmpaque) {
		this.isPermisoEliminarEmpaque = isPermisoEliminarEmpaque;
	}

	public Boolean getIsPermisoGuardarCambiosEmpaque() {
		return isPermisoGuardarCambiosEmpaque;
	}

	public void setIsPermisoGuardarCambiosEmpaque(Boolean isPermisoGuardarCambiosEmpaque) {
		this.isPermisoGuardarCambiosEmpaque = isPermisoGuardarCambiosEmpaque;
	}
	
	public Boolean getIsPermisoConsultaEmpaque() {
		return isPermisoConsultaEmpaque;
	}

	public void setIsPermisoConsultaEmpaque(Boolean isPermisoConsultaEmpaque) {
		this.isPermisoConsultaEmpaque = isPermisoConsultaEmpaque;
	}

	public Boolean getIsPermisoBusquedaEmpaque() {
		return isPermisoBusquedaEmpaque;
	}

	public void setIsPermisoBusquedaEmpaque(Boolean isPermisoBusquedaEmpaque) {
		this.isPermisoBusquedaEmpaque = isPermisoBusquedaEmpaque;
	}

	public Boolean getIsPermisoReporteEmpaque() {
		return isPermisoReporteEmpaque;
	}

	public void setIsPermisoReporteEmpaque(Boolean isPermisoReporteEmpaque) {
		this.isPermisoReporteEmpaque = isPermisoReporteEmpaque;
	}
	
	public Boolean getIsPermisoPaginacionMedioEmpaque() {
		return isPermisoPaginacionMedioEmpaque;
	}

	public void setIsPermisoPaginacionMedioEmpaque(Boolean isPermisoPaginacionMedioEmpaque) {
		this.isPermisoPaginacionMedioEmpaque = isPermisoPaginacionMedioEmpaque;
	}
	
	public Boolean getIsPermisoPaginacionTodoEmpaque() {
		return isPermisoPaginacionTodoEmpaque;
	}

	public void setIsPermisoPaginacionTodoEmpaque(Boolean isPermisoPaginacionTodoEmpaque) {
		this.isPermisoPaginacionTodoEmpaque = isPermisoPaginacionTodoEmpaque;
	}
	
	public Boolean getIsPermisoPaginacionAltoEmpaque() {
		return isPermisoPaginacionAltoEmpaque;
	}

	public void setIsPermisoPaginacionAltoEmpaque(Boolean isPermisoPaginacionAltoEmpaque) {
		this.isPermisoPaginacionAltoEmpaque = isPermisoPaginacionAltoEmpaque;
	}
	
	public Boolean getIsPermisoCopiarEmpaque() {
		return isPermisoCopiarEmpaque;
	}

	public void setIsPermisoCopiarEmpaque(Boolean isPermisoCopiarEmpaque) {
		this.isPermisoCopiarEmpaque = isPermisoCopiarEmpaque;
	}
	
	public Boolean getIsPermisoVerFormEmpaque() {
		return isPermisoVerFormEmpaque;
	}

	public void setIsPermisoVerFormEmpaque(Boolean isPermisoVerFormEmpaque) {
		this.isPermisoVerFormEmpaque = isPermisoVerFormEmpaque;
	}
	
	public Boolean getIsPermisoDuplicarEmpaque() {
		return isPermisoDuplicarEmpaque;
	}

	public void setIsPermisoDuplicarEmpaque(Boolean isPermisoDuplicarEmpaque) {
		this.isPermisoDuplicarEmpaque = isPermisoDuplicarEmpaque;
	}
	
	public Boolean getIsPermisoOrdenEmpaque() {
		return isPermisoOrdenEmpaque;
	}

	public void setIsPermisoOrdenEmpaque(Boolean isPermisoOrdenEmpaque) {
		this.isPermisoOrdenEmpaque = isPermisoOrdenEmpaque;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEmpaque() {
		return isVisibilidadCeldaNuevoEmpaque;
	}

	public void setIsVisibilidadCeldaNuevoEmpaque(Boolean isVisibilidadCeldaNuevoEmpaque) {
		this.isVisibilidadCeldaNuevoEmpaque = isVisibilidadCeldaNuevoEmpaque;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEmpaque() {
		return isVisibilidadCeldaDuplicarEmpaque;
	}

	public void setIsVisibilidadCeldaDuplicarEmpaque(Boolean isVisibilidadCeldaDuplicarEmpaque) {
		this.isVisibilidadCeldaDuplicarEmpaque = isVisibilidadCeldaDuplicarEmpaque;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEmpaque() {
		return isVisibilidadCeldaCopiarEmpaque;
	}

	public void setIsVisibilidadCeldaCopiarEmpaque(Boolean isVisibilidadCeldaCopiarEmpaque) {
		this.isVisibilidadCeldaCopiarEmpaque = isVisibilidadCeldaCopiarEmpaque;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEmpaque() {
		return isVisibilidadCeldaVerFormEmpaque;
	}

	public void setIsVisibilidadCeldaVerFormEmpaque(Boolean isVisibilidadCeldaVerFormEmpaque) {
		this.isVisibilidadCeldaVerFormEmpaque = isVisibilidadCeldaVerFormEmpaque;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEmpaque() {
		return isVisibilidadCeldaOrdenEmpaque;
	}

	public void setIsVisibilidadCeldaOrdenEmpaque(Boolean isVisibilidadCeldaOrdenEmpaque) {
		this.isVisibilidadCeldaOrdenEmpaque = isVisibilidadCeldaOrdenEmpaque;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEmpaque() {
		return isVisibilidadCeldaNuevoRelacionesEmpaque;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEmpaque(Boolean isVisibilidadCeldaNuevoRelacionesEmpaque) {
		this.isVisibilidadCeldaNuevoRelacionesEmpaque = isVisibilidadCeldaNuevoRelacionesEmpaque;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEmpaque() {
		return isVisibilidadCeldaModificarEmpaque;
	}

	public void setIsVisibilidadCeldaModificarEmpaque(Boolean isVisibilidadCeldaModificarEmpaque) {
		this.isVisibilidadCeldaModificarEmpaque = isVisibilidadCeldaModificarEmpaque;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEmpaque() {
		return isVisibilidadCeldaActualizarEmpaque;
	}

	public void setIsVisibilidadCeldaActualizarEmpaque(Boolean isVisibilidadCeldaActualizarEmpaque) {
		this.isVisibilidadCeldaActualizarEmpaque = isVisibilidadCeldaActualizarEmpaque;
	}

	public Boolean getIsVisibilidadCeldaEliminarEmpaque() {
		return isVisibilidadCeldaEliminarEmpaque;
	}

	public void setIsVisibilidadCeldaEliminarEmpaque(Boolean isVisibilidadCeldaEliminarEmpaque) {
		this.isVisibilidadCeldaEliminarEmpaque = isVisibilidadCeldaEliminarEmpaque;
	}

	public Boolean getIsVisibilidadCeldaCancelarEmpaque() {
		return isVisibilidadCeldaCancelarEmpaque;
	}

	public void setIsVisibilidadCeldaCancelarEmpaque(Boolean isVisibilidadCeldaCancelarEmpaque) {
		this.isVisibilidadCeldaCancelarEmpaque = isVisibilidadCeldaCancelarEmpaque;
	}

	public Boolean getIsVisibilidadCeldaGuardarEmpaque() {
		return isVisibilidadCeldaGuardarEmpaque;
	}

	public void setIsVisibilidadCeldaGuardarEmpaque(Boolean isVisibilidadCeldaGuardarEmpaque) {
		this.isVisibilidadCeldaGuardarEmpaque = isVisibilidadCeldaGuardarEmpaque;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEmpaque() {
		return isVisibilidadCeldaGuardarCambiosEmpaque;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEmpaque(Boolean isVisibilidadCeldaGuardarCambiosEmpaque) {
		this.isVisibilidadCeldaGuardarCambiosEmpaque = isVisibilidadCeldaGuardarCambiosEmpaque;
	}
		
	public EmpaqueSessionBean getempaqueSessionBean() {
		return this.empaqueSessionBean;
	}
	
	public void setempaqueSessionBean(EmpaqueSessionBean empaqueSessionBean) {
		this.empaqueSessionBean=empaqueSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEmpaque(Empaque empaque)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(empaque,null);
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
	
	public void bugActualizarReferenciaActual(Empaque empaque,Empaque empaqueAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEmpaque(empaque);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		empaqueAux.setId(empaque.getId());
		empaqueAux.setVersionRow(empaque.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEmpaque();
		
			int intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaque =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.empaque =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EmpaqueJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEmpaque(this.empaque,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = empaqueValidator.getInvalidValues(this.empaque);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			empaqueLogic.setDatosCliente(datosCliente);
			empaqueLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				empaqueAux=new  Empaque();
				
				empaqueAux.setIsNew(true);
				empaqueAux.setIsChanged(true);
				
				empaqueAux.setEmpaqueOriginal(this.empaque);
				
				empaqueAux.setId(this.empaque.getId());	
				empaqueAux.setVersionRow(this.empaque.getVersionRow());	
				empaqueAux.setid_empresa(this.empaque.getid_empresa());	
				empaqueAux.setvalor(this.empaque.getvalor());	
				empaqueAux.setdescripcion(this.empaque.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empaqueSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empaqueSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(empaqueAux,empaqueLogic.getEmpaques());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empaqueAux,empaques);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.empaqueSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empaqueSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empaqueLogic.saveEmpaques();//WithConnection
						//empaqueLogic.getSetVersionRowEmpaques();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empaque,empaqueAux);
					
					this.refrescarForeignKeysDescripcionesEmpaque();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empaqueSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas().addAll(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformasEliminados);
							this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis().addAll(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformas.addAll(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformasEliminados);
							this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolis.addAll(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolisEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empaqueLogic.saveEmpaqueRelaciones(empaqueAux,this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis(),this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas());//WithConnection
								//empaqueLogic.getSetVersionRowEmpaques();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empaque,empaqueAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.setDetalleProformas(new ArrayList<DetalleProforma>());
							this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.setDetaNotaCreditoSolis(new ArrayList<DetaNotaCreditoSoli>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformas= new ArrayList<DetalleProforma>();
							this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolis= new ArrayList<DetaNotaCreditoSoli>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();}
							empaqueAux.setDetaNotaCreditoSolis(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis());

							if(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();}
							empaqueAux.setDetalleProformas(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empaqueSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empaqueSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empaqueAux,empaqueLogic.getEmpaques());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empaqueAux,empaques);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empaque,empaqueAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				empaqueAux=new  Empaque();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.empaqueSessionBean.getEsGuardarRelacionado() 
					|| (this.empaqueSessionBean.getEsGuardarRelacionado() && this.empaque.getId()>=0)) {
						
					empaqueAux.setIsNew(false);
				}
				
				empaqueAux.setIsDeleted(false);
			
				empaqueAux.setId(this.empaque.getId());	
				empaqueAux.setVersionRow(this.empaque.getVersionRow());	
				empaqueAux.setid_empresa(this.empaque.getid_empresa());	
				empaqueAux.setvalor(this.empaque.getvalor());	
				empaqueAux.setdescripcion(this.empaque.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empaqueAux,empaqueLogic.getEmpaques());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empaqueAux,empaques);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.empaqueSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empaqueSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empaqueLogic.saveEmpaques();//WithConnection
						//empaqueLogic.getSetVersionRowEmpaques();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empaque,empaqueAux);
					
					this.refrescarForeignKeysDescripcionesEmpaque();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empaqueSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas().addAll(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformasEliminados);
							this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis().addAll(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformas.addAll(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformasEliminados);
							this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolis.addAll(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolisEliminados);
						}
						//ARCHITECTURE
						
						if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empaqueLogic.saveEmpaqueRelaciones(empaqueAux,this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis(),this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas());//WithConnection
								//empaqueLogic.getSetVersionRowEmpaques();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empaque,empaqueAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.setDetalleProformas(new ArrayList<DetalleProforma>());
							this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.setDetaNotaCreditoSolis(new ArrayList<DetaNotaCreditoSoli>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformas= new ArrayList<DetalleProforma>();
							this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolis= new ArrayList<DetaNotaCreditoSoli>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();}
							empaqueAux.setDetaNotaCreditoSolis(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis());

							if(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();}
							empaqueAux.setDetalleProformas(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empaqueSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empaqueSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empaqueAux,empaqueLogic.getEmpaques());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empaqueAux,empaques);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empaque,empaqueAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				empaqueAux=new  Empaque();
				
				empaqueAux.setIsNew(false);
				empaqueAux.setIsChanged(false);
				
				empaqueAux.setIsDeleted(true);
				
				empaqueAux.setId(this.empaque.getId());	
				empaqueAux.setVersionRow(this.empaque.getVersionRow());	
				empaqueAux.setid_empresa(this.empaque.getid_empresa());	
				empaqueAux.setvalor(this.empaque.getvalor());	
				empaqueAux.setdescripcion(this.empaque.getdescripcion());	
				
				if(this.empaqueSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.empaqueAux.getId()>=0) {	
						this.empaquesEliminados.add(empaqueAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(empaqueAux,empaqueLogic.getEmpaques());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empaqueAux,empaques);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.empaqueSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empaqueSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empaqueLogic.saveEmpaques();//WithConnection
						//empaqueLogic.getSetVersionRowEmpaques();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empaqueSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas().addAll(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformasEliminados);
							this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis().addAll(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformas.addAll(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformasEliminados);
							this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolis.addAll(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolisEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empaqueLogic.saveEmpaqueRelaciones(empaqueAux,this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis(),this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas());//WithConnection
								//empaqueLogic.getSetVersionRowEmpaques();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.setDetalleProformas(new ArrayList<DetalleProforma>());
							this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.setDetaNotaCreditoSolis(new ArrayList<DetaNotaCreditoSoli>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformas= new ArrayList<DetalleProforma>();
							this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolis= new ArrayList<DetaNotaCreditoSoli>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();}
							empaqueAux.setDetaNotaCreditoSolis(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis());

							if(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();}
							empaqueAux.setDetalleProformas(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.empaqueSessionBean.getEstaModoGuardarRelaciones() 
								|| this.empaqueSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(empaqueAux,empaqueLogic.getEmpaques());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(empaqueAux,empaques);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.getEmpaques().addAll(this.empaquesEliminados);
					
					empaqueLogic.saveEmpaques();//WithConnection
					//empaqueLogic.getSetVersionRowEmpaques();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEmpaque();
				
				this.empaquesEliminados= new ArrayList<Empaque>();		
			}
			
			if(this.empaqueSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empaqueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Empaque GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Empaque",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.empaque=empaqueAux;
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
      		//this.finishProcessEmpaque();
      	}
		
	}	
	
	public void actualizarRelaciones(Empaque empaqueLocal) throws Exception {
		
		if(this.empaqueSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				empaqueLocal.setDetaNotaCreditoSolis(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis());
				empaqueLocal.setDetalleProformas(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas());
			
			} else {
			
				empaqueLocal.setDetaNotaCreditoSolis(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolis);
				empaqueLocal.setDetalleProformas(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Empaque empaqueLocal) throws Exception {	
		if(this.empaqueSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				empaqueLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEmpaqueActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empaque =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.empaque =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = empaqueValidator.getInvalidValues(this.empaque);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Empaque empaque,List<Empaque> empaques) throws Exception {
		try	{		
			EmpaqueConstantesFunciones.actualizarLista(empaque,empaques,this.empaqueSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Empaque empaque,List<Empaque> empaques) throws Exception {
		try	{			
			EmpaqueConstantesFunciones.actualizarSelectedLista(empaque,empaques);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Empaque> empaquesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				empaquesLocal=this.empaqueLogic.getEmpaques();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				empaquesLocal=this.empaques;
			}
			//ARCHITECTURE
		
			for(Empaque empaqueLocal:empaquesLocal) {
				if(this.permiteMantenimiento(empaqueLocal) && empaqueLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EmpaqueConstantesFunciones.getEmpaqueLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EmpaqueConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpaque.jLabelid_empresaEmpaque,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpaqueConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpaque.jLabelvalorEmpaque,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpaqueConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpaque.jLabeldescripcionEmpaque,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpaque.jLabelid_empresaEmpaque,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpaque.jLabelvalorEmpaque,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpaque.jLabeldescripcionEmpaque,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetaNotaCreditoSoli")) {
			if(this.empaque==null) {
				this.empaque= new Empaque();
			}

			if(this.empaqueSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEmpaque
				this.setVariablesFormularioToObjetoActualEmpaque(this.empaque,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);

				this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.getdetanotacreditosoli().setEmpaque(this.empaque);
			}

			return;
		}
		 else  if(sTipo.equals("DetalleProforma")) {
			if(this.empaque==null) {
				this.empaque= new Empaque();
			}

			if(this.empaqueSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEmpaque
				this.setVariablesFormularioToObjetoActualEmpaque(this.empaque,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);

				this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.getdetalleproforma().setEmpaque(this.empaque);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEmpaque--;	
		
		
		this.empaqueAux=new Empaque();
		
		this.empaqueAux.setId(this.iIdNuevoEmpaque);
		this.empaqueAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empaqueLogic.getEmpaques().add(this.empaqueAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.empaques.add(this.empaqueAux);
		}
		//ARCHITECTURE
		
		this.empaque=this.empaqueAux;
		
		if(EmpaqueJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEmpaque(this.empaque);
			this.setVariablesObjetoActualToFormularioForeignKeyEmpaque(this.empaque);
		}
				
		//this.setDefaultControlesEmpaque();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEmpaque();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEmpaque();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpaque();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpaque(this.empaqueBean,this.empaque,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EmpaqueConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.empaqueSessionBean.getConGuardarRelaciones()) {
			classes=EmpaqueConstantesFunciones.getClassesRelationshipsOfEmpaque(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.empaqueReturnGeneral=empaqueLogic.procesarEventosEmpaquesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empaqueLogic.getEmpaques(),this.empaque,this.empaqueParameterGeneral,this.isEsNuevoEmpaque,classes);//this.empaqueLogic.getEmpaque()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEmpaque(this.empaqueReturnGeneral,this.empaqueBean,false);
		
		if(this.empaqueReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEmpaque(this.empaqueReturnGeneral.getEmpaque());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEmpaque(this.empaqueReturnGeneral.getEmpaque());
		}
		
		if(this.empaqueReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEmpaque(this.empaqueReturnGeneral.getEmpaque(),classes);//this.empaqueBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEmpaque(this.empaque,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEmpaque();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEmpaque();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpaqueBeanSwingJInternalFrameAdditional.RecargarFormEmpaque(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEmpaque(false);
						
			if(empaqueSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.getEsGuardarRelacionado() && DetalleProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleProformaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.getEsGuardarRelacionado() && DetaNotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetaNotaCreditoSoliActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EmpaqueJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpaque();
			}
			
			this.actualizarVisualTableDatosEmpaque();
			
			this.jTableDatosEmpaque.setRowSelectionInterval(this.getIndiceNuevoEmpaque(), this.getIndiceNuevoEmpaque());
			
			this.seleccionarFilaTablaEmpaqueActual();
						
			this.actualizarEstadoCeldasBotonesEmpaque("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEmpaque(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEmpaque.jTextFieldvalorEmpaque.setEnabled(isHabilitar && this.empaqueConstantesFunciones.activarvalorEmpaque);
		this.jInternalFrameDetalleFormEmpaque.jTextAreadescripcionEmpaque.setEnabled(isHabilitar && this.empaqueConstantesFunciones.activardescripcionEmpaque);	
		//
		this.jInternalFrameDetalleFormEmpaque.jComboBoxid_empresaEmpaque.setEnabled(isHabilitar && this.empaqueConstantesFunciones.activarid_empresaEmpaque);
	};
	
	public void setDefaultControlesEmpaque() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEmpaque(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.empaqueSessionBean.setConGuardarRelaciones(true);			
			this.empaqueSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEmpaque.jTabbedPaneRelacionesEmpaque.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.empaqueSessionBean.setConGuardarRelaciones(false);			
			this.empaqueSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEmpaque.jTabbedPaneRelacionesEmpaque.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEmpaque() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Empaque empaqueAux:this.empaqueLogic.getEmpaques()) {
				if(empaqueAux.getId().equals(this.iIdNuevoEmpaque)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Empaque empaqueAux:this.empaques) {
				if(empaqueAux.getId().equals(this.iIdNuevoEmpaque)) {
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
	
	public int getIndiceActualEmpaque(Empaque empaque,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Empaque empaqueAux:this.empaqueLogic.getEmpaques()) {
				if(empaqueAux.getId().equals(empaque.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Empaque empaqueAux:this.empaques) {
				if(empaqueAux.getId().equals(empaque.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEmpaque(Empaque empaqueOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Empaque empaqueAux:this.empaqueLogic.getEmpaques()) {
				if(empaqueAux.getEmpaqueOriginal().getId().equals(empaqueOriginal.getId())) {
					existe=true;
					empaqueOriginal.setId(empaqueAux.getId());
					empaqueOriginal.setVersionRow(empaqueAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Empaque empaqueAux:this.empaques) {
				if(empaqueAux.getEmpaqueOriginal().getId().equals(empaqueOriginal.getId())) {
					existe=true;
					empaqueOriginal.setId(empaqueAux.getId());
					empaqueOriginal.setVersionRow(empaqueAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEmpaque(Boolean esParaCancelar) throws Exception {
		empaquesAux=new ArrayList<Empaque>();
		empaqueAux=new Empaque();
		
		if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Empaque empaqueAux:this.empaqueLogic.getEmpaques()) {
					if(empaqueAux.getId()<0) {
						empaquesAux.add(empaqueAux);
					}		
				}
				this.iIdNuevoEmpaque=0L;
				this.empaqueLogic.getEmpaques().removeAll(empaquesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Empaque empaqueAux:this.empaques) {
					if(empaqueAux.getId()<0) {
						empaquesAux.add(empaqueAux);
					}		
				}
				this.iIdNuevoEmpaque=0L;
				this.empaques.removeAll(empaquesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEmpaque 
					&& this.empaqueLogic.getEmpaques().size()>0
					) {
					empaqueAux=this.empaqueLogic.getEmpaques().get(this.empaqueLogic.getEmpaques().size() - 1);
				
					if(empaqueAux.getId()<0) {
						this.empaqueLogic.getEmpaques().remove(empaqueAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEmpaque && this.empaques.size()>0) {
					empaqueAux=this.empaques.get(this.empaques.size() - 1);
				
					if(empaqueAux.getId()<0) {
						this.empaques.remove(empaqueAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEmpaque(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(empaque.getId()<0) {
				this.empaqueLogic.getEmpaques().remove(this.empaque);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(empaque.getId()<0) {
				this.empaques.remove(this.empaque);
			}
		}			
	}
	
	public void setEstadosInicialesEmpaque(List<Empaque> empaquesAux) throws Exception {
		EmpaqueConstantesFunciones.setEstadosInicialesEmpaque(empaquesAux);
	}
	
	public void setEstadosInicialesEmpaque(Empaque empaqueAux) throws Exception {
		EmpaqueConstantesFunciones.setEstadosInicialesEmpaque(empaqueAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEmpaqueActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEmpaque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEmpaqueActual()) {
				if(!this.isEsNuevoEmpaque) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEmpaque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEmpaque=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEmpaqueActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Empaque ?", "MANTENIMIENTO DE Empaque", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEmpaque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Empaque empaque) throws Exception {
		EmpaqueConstantesFunciones.seleccionarAsignar(this.empaque,empaque);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEmpaque=this.isPermisoActualizarOriginalEmpaque;
			
			
			this.seleccionarAsignar(empaque);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpaqueConstantesFunciones.quitarEspaciosEmpaque(this.empaque,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEmpaque("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.empaqueSessionBean.setsFuncionBusquedaRapida(this.empaqueSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEmpaque) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEmpaque(esParaCancelar);				
				this.cancelarNuevoEmpaque(esParaCancelar);								
			}
			
			this.empaque=new Empaque();
			
			this.inicializarEmpaque();
			
			this.actualizarEstadoCeldasBotonesEmpaque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEmpaque() throws Exception {
		try {
			EmpaqueConstantesFunciones.inicializarEmpaque(this.empaque);
			
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
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.empaqueLogic.getEmpaques().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEmpaques(String sAccionBusqueda,List<Empaque> empaquesParaReportes) throws Exception {
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
					sPathReporteFinal="Empaque"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EmpaqueMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EmpaqueMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Empaque"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Empaques");		
		parameters.put("busquedapor", EmpaqueConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleProforma.class));
			classes.add(new Classe(DetaNotaCreditoSoli.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EmpaqueLogic empaqueLogicAuxiliar=new EmpaqueLogic();
					empaqueLogicAuxiliar.setDatosCliente(empaqueLogic.getDatosCliente());				
					empaqueLogicAuxiliar.setEmpaques(empaquesParaReportes);
					
					empaqueLogicAuxiliar.cargarRelacionesLoteForeignKeyEmpaqueWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					empaquesParaReportes=empaqueLogicAuxiliar.getEmpaques();
					
					//empaqueLogic.getNewConnexionToDeep();
					
					//for (Empaque empaque:empaquesParaReportes) {
					//	empaqueLogic.deepLoad(empaque, false, DeepLoadType.INCLUDE, classes);
					//}						
					//empaqueLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//empaqueLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleProforma = AuxiliarReportes.class.getResourceAsStream("DetalleProformaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleproforma", reportFileDetalleProforma);

			InputStream reportFileDetaNotaCreditoSoli = AuxiliarReportes.class.getResourceAsStream("DetaNotaCreditoSoliDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detanotacreditosoli", reportFileDetaNotaCreditoSoli);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEmpaque=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EmpaqueConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EmpaqueConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEmpaque=new JRBeanArrayDataSource(EmpaqueJInternalFrame.TraerEmpaqueBeans(empaquesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEmpaque);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EmpaqueConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EmpaqueConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EmpaqueBean.TraerEmpaqueBeans(empaquesParaReportes).toArray()));
							
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
				this.generarExcelReporteEmpaques(sAccionBusqueda,sTipoArchivoReporte,empaquesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEmpaques(sAccionBusqueda,sTipoArchivoReporte,empaquesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEmpaqueActionPerformed(null);
					//this.generarExcelReporteEmpaques(sAccionBusqueda,sTipoArchivoReporte,empaquesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEmpaques(sAccionBusqueda,sTipoArchivoReporte,empaquesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEmpaques(sAccionBusqueda,sTipoArchivoReporte,empaquesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEmpaques(sAccionBusqueda,sTipoArchivoReporte,empaquesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEmpaques(String sAccionBusqueda,String sTipoArchivoReporte,List<Empaque> empaquesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empaque";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Empaques");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpaque("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Empaque empaque : empaquesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EmpaqueConstantesFunciones.generarExcelReporteDataEmpaque("NORMAL",row,workbook,empaque,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empaqueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empaque",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEmpaque(String sTipo,Row row,Workbook workbook) {
		
		EmpaqueConstantesFunciones.generarExcelReporteHeaderEmpaque(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEmpaques(String sAccionBusqueda,String sTipoArchivoReporte,List<Empaque> empaquesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empaque_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Empaques");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Empaque empaque : empaquesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EmpaqueConstantesFunciones.getEmpaqueDescripcion(empaque));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpaqueConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpaqueConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empaque.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpaqueConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpaqueConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empaque.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpaqueConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpaqueConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empaque.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empaqueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empaque",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEmpaques(String sAccionBusqueda,String sTipoArchivoReporte,List<Empaque> empaquesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Empaque> empaquesRespaldo=null;
		
		classes=EmpaqueConstantesFunciones.getClassesRelationshipsOfEmpaque(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.empaqueLogic.setDatosCliente(this.datosCliente);
		this.empaqueLogic.setDatosDeep(this.datosDeep);
		this.empaqueLogic.setIsConDeep(true);
		
		empaquesRespaldo=this.empaqueLogic.getEmpaques();
		
		this.empaqueLogic.setEmpaques(empaquesParaReportes);	
		this.empaqueLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		empaquesParaReportes=this.empaqueLogic.getEmpaques();
		this.empaqueLogic.setEmpaques(empaquesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empaque_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Empaques");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpaque("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Empaque empaque : empaquesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEmpaque("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EmpaqueConstantesFunciones.generarExcelReporteDataEmpaque("NORMAL",row,workbook,empaque,cellStyleDataAux);
		
			
			


				//DetaNotaCreditoSoli
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO))) {

				if(empaque.getDetaNotaCreditoSolis()!=null && empaque.getDetaNotaCreditoSolis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetaNotaCreditoSoliConstantesFunciones.generarExcelReporteHeaderDetaNotaCreditoSoli("RELACIONADO",row,workbook);
				}

				if(empaque.getDetaNotaCreditoSolis()!=null) {
					i2=0;
					for(DetaNotaCreditoSoli detanotacreditosoli : empaque.getDetaNotaCreditoSolis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetaNotaCreditoSoliConstantesFunciones.generarExcelReporteDataDetaNotaCreditoSoli("RELACIONADO",row,workbook,detanotacreditosoli,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DetalleProforma
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleProformaConstantesFunciones.SCLASSWEBTITULO))) {

				if(empaque.getDetalleProformas()!=null && empaque.getDetalleProformas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleProformaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleProformaConstantesFunciones.generarExcelReporteHeaderDetalleProforma("RELACIONADO",row,workbook);
				}

				if(empaque.getDetalleProformas()!=null) {
					i2=0;
					for(DetalleProforma detalleproforma : empaque.getDetalleProformas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleProformaConstantesFunciones.generarExcelReporteDataDetalleProforma("RELACIONADO",row,workbook,detalleproforma,cellStyleDataAuxHijo);
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
		cell.setCellValue(EmpaqueConstantesFunciones.getEmpaqueDescripcion(empaque));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empaqueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empaque",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpaque.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpaque.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpaque.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpaque.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEmpaque() throws Exception {		
		this.startProcessEmpaque(true);
	}
	
	public void startProcessEmpaque(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEmpaque ,this.jPanelParametrosReportesEmpaque, this.jScrollPanelDatosEmpaque,this.jPanelPaginacionEmpaque, this.jScrollPanelDatosEdicionEmpaque, this.jPanelAccionesEmpaque,this.jPanelAccionesFormularioEmpaque,this.jmenuBarEmpaque,this.jmenuBarDetalleEmpaque,this.jTtoolBarEmpaque,this.jTtoolBarDetalleEmpaque);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpaque=this.jTabbedPaneBusquedasEmpaque; 
		
		final JPanel jPanelParametrosReportesEmpaque=this.jPanelParametrosReportesEmpaque;
		//final JScrollPane jScrollPanelDatosEmpaque=this.jScrollPanelDatosEmpaque;
		final JTable jTableDatosEmpaque=this.jTableDatosEmpaque;		
		final JPanel jPanelPaginacionEmpaque=this.jPanelPaginacionEmpaque;
		//final JScrollPane jScrollPanelDatosEdicionEmpaque=this.jScrollPanelDatosEdicionEmpaque;
		final JPanel jPanelAccionesEmpaque=this.jPanelAccionesEmpaque;
		
		JPanel jPanelCamposAuxiliarEmpaque=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEmpaque=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) {
			jPanelCamposAuxiliarEmpaque=this.jInternalFrameDetalleFormEmpaque.jPanelCamposEmpaque;
			jPanelAccionesFormularioAuxiliarEmpaque=this.jInternalFrameDetalleFormEmpaque.jPanelAccionesFormularioEmpaque;
		}
		
		final JPanel jPanelCamposEmpaque=jPanelCamposAuxiliarEmpaque;
		final JPanel jPanelAccionesFormularioEmpaque=jPanelAccionesFormularioAuxiliarEmpaque;
		
		
		final JMenuBar jmenuBarEmpaque=this.jmenuBarEmpaque;
		final JToolBar jTtoolBarEmpaque=this.jTtoolBarEmpaque;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEmpaque=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpaque=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) {
			jmenuBarDetalleAuxiliarEmpaque=this.jInternalFrameDetalleFormEmpaque.jmenuBarDetalleEmpaque;
			jTtoolBarDetalleAuxiliarEmpaque=this.jInternalFrameDetalleFormEmpaque.jTtoolBarDetalleEmpaque;
		}
		
		final JMenuBar jmenuBarDetalleEmpaque=jmenuBarDetalleAuxiliarEmpaque;
		final JToolBar jTtoolBarDetalleEmpaque=jTtoolBarDetalleAuxiliarEmpaque;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpaque;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpaque;
			processRunnable.jTableDatos=jTableDatosEmpaque;
			processRunnable.jPanelCampos=jPanelCamposEmpaque;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpaque;
			processRunnable.jPanelAcciones=jPanelAccionesEmpaque;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpaque;
			
			
			processRunnable.jmenuBar=jmenuBarEmpaque;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpaque;
			processRunnable.jTtoolBar=jTtoolBarEmpaque;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpaque;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpaque ,jPanelParametrosReportesEmpaque,jTableDatosEmpaque, /*jScrollPanelDatosEmpaque,*/jPanelCamposEmpaque,jPanelPaginacionEmpaque, /*jScrollPanelDatosEdicionEmpaque,*/ jPanelAccionesEmpaque,jPanelAccionesFormularioEmpaque,jmenuBarEmpaque,jmenuBarDetalleEmpaque,jTtoolBarEmpaque,jTtoolBarDetalleEmpaque);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpaque ,jPanelParametrosReportesEmpaque, jScrollPanelDatosEmpaque,jPanelPaginacionEmpaque, jScrollPanelDatosEdicionEmpaque, jPanelAccionesEmpaque,jPanelAccionesFormularioEmpaque,jmenuBarEmpaque,jmenuBarDetalleEmpaque,jTtoolBarEmpaque,jTtoolBarDetalleEmpaque);
						
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
	
	public void finishProcessEmpaque() {// throws Exception 
		this.finishProcessEmpaque(true);
	}
	
	public void finishProcessEmpaque(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEmpaque ,this.jPanelParametrosReportesEmpaque, this.jScrollPanelDatosEmpaque,this.jPanelPaginacionEmpaque, this.jScrollPanelDatosEdicionEmpaque, this.jPanelAccionesEmpaque,this.jPanelAccionesFormularioEmpaque,this.jmenuBarEmpaque,this.jmenuBarDetalleEmpaque,this.jTtoolBarEmpaque,this.jTtoolBarDetalleEmpaque);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpaque=this.jTabbedPaneBusquedasEmpaque; 
		
		final JPanel jPanelParametrosReportesEmpaque=this.jPanelParametrosReportesEmpaque;
		//final JScrollPane jScrollPanelDatosEmpaque=this.jScrollPanelDatosEmpaque;
		final JTable jTableDatosEmpaque=this.jTableDatosEmpaque;		
		final JPanel jPanelPaginacionEmpaque=this.jPanelPaginacionEmpaque;
		//final JScrollPane jScrollPanelDatosEdicionEmpaque=this.jScrollPanelDatosEdicionEmpaque;
		final JPanel jPanelAccionesEmpaque=this.jPanelAccionesEmpaque;
		
		JPanel jPanelCamposAuxiliarEmpaque=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEmpaque=new JPanel();
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) {
			jPanelCamposAuxiliarEmpaque=this.jInternalFrameDetalleFormEmpaque.jPanelCamposEmpaque;
			jPanelAccionesFormularioAuxiliarEmpaque=this.jInternalFrameDetalleFormEmpaque.jPanelAccionesFormularioEmpaque;
		}
		
		final JPanel jPanelCamposEmpaque=jPanelCamposAuxiliarEmpaque;
		final JPanel jPanelAccionesFormularioEmpaque=jPanelAccionesFormularioAuxiliarEmpaque;
		
		
		final JMenuBar jmenuBarEmpaque=this.jmenuBarEmpaque;		
		final JToolBar jTtoolBarEmpaque=this.jTtoolBarEmpaque;
				
		JMenuBar jmenuBarDetalleAuxiliarEmpaque=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpaque=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) {
			jmenuBarDetalleAuxiliarEmpaque=this.jInternalFrameDetalleFormEmpaque.jmenuBarDetalleEmpaque;
			jTtoolBarDetalleAuxiliarEmpaque=this.jInternalFrameDetalleFormEmpaque.jTtoolBarDetalleEmpaque;		
		}
		
		final JMenuBar jmenuBarDetalleEmpaque=jmenuBarDetalleAuxiliarEmpaque;
		final JToolBar jTtoolBarDetalleEmpaque=jTtoolBarDetalleAuxiliarEmpaque;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpaque;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpaque;
			processRunnable.jTableDatos=jTableDatosEmpaque;
			processRunnable.jPanelCampos=jPanelCamposEmpaque;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpaque;
			processRunnable.jPanelAcciones=jPanelAccionesEmpaque;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpaque;
			
			
			processRunnable.jmenuBar=jmenuBarEmpaque;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpaque;
			processRunnable.jTtoolBar=jTtoolBarEmpaque;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpaque;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEmpaque ,jPanelParametrosReportesEmpaque, jTableDatosEmpaque,/*jScrollPanelDatosEmpaque,*/jPanelCamposEmpaque,jPanelPaginacionEmpaque, /*jScrollPanelDatosEdicionEmpaque,*/ jPanelAccionesEmpaque,jPanelAccionesFormularioEmpaque,jmenuBarEmpaque,jmenuBarDetalleEmpaque,jTtoolBarEmpaque,jTtoolBarDetalleEmpaque));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEmpaque(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEmpaque(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEmpaque(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEmpaque(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEmpaque,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEmpaque,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEmpaque(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEmpaque,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEmpaque,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.empaqueConstantesFunciones.getsFinalQueryEmpaque();
		String  finalQueryPaginacionTodos=this.empaqueConstantesFunciones.getsFinalQueryEmpaque();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EmpaqueConstantesFunciones.getArrayColumnasGlobalesNoEmpaque(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EmpaqueConstantesFunciones.getArrayColumnasGlobalesEmpaque(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EmpaqueConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.empaquesEliminados= new ArrayList<Empaque>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEmpaque();
		
				///*EmpaqueSessionBean*/this.empaqueSessionBean=new EmpaqueSessionBean();
			
			if(this.empaqueSessionBean==null) {
				this.empaqueSessionBean=new EmpaqueSessionBean();
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
					this.iNumeroPaginacion=EmpaqueConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EmpaqueConstantesFunciones.getClassesForeignKeysOfEmpaque(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/empaque."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			empaquesAux= new ArrayList<Empaque>();
			
				
			empaqueLogic.setDatosCliente(this.datosCliente);
			empaqueLogic.setDatosDeep(this.datosDeep);
			empaqueLogic.setIsConDeep(true);
			
			
			empaqueLogic.getEmpaqueDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					empaqueLogic.getTodosEmpaques(finalQueryGlobal,pagination);
					
					//empaqueLogic.getTodosEmpaquesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(empaqueLogic.getEmpaques()==null|| empaqueLogic.getEmpaques().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empaquesAux= new ArrayList<Empaque>();
							empaquesAux.addAll(empaqueLogic.getEmpaques());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empaquesAux= new ArrayList<Empaque>();
							empaquesAux.addAll(empaques);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empaqueLogic.getTodosEmpaques(finalQueryGlobal+"",this.pagination);												
							
							//empaqueLogic.getTodosEmpaquesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEmpaques("Todos",empaqueLogic.getEmpaques() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empaqueLogic.setEmpaques(new ArrayList<Empaque>());					
							empaqueLogic.getEmpaques().addAll(empaquesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empaques=new ArrayList<Empaque>();
							empaques.addAll(empaquesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEmpaque=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEmpaque=this.idActual;
				
				} else if(this.idEmpaqueActual!=null && this.idEmpaqueActual!=0L) {
					idEmpaque=idEmpaqueActual;
				}
				
					
				this.sDetalleReporte=EmpaqueConstantesFunciones.getDetalleIndicePorId(idEmpaque);
				
				this.empaques=new ArrayList<Empaque>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					empaqueLogic.getEntity(idEmpaque);
					
					//empaqueLogic.getEntityWithConnection(idEmpaque);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empaqueLogic.setEmpaques(new ArrayList<Empaque>());
					empaqueLogic.getEmpaques().add(empaqueLogic.getEmpaque());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empaques=new ArrayList<Empaque>();
					this.empaques.add(empaque);
				}
				
				if(empaqueLogic.getEmpaque()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EmpaqueConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empaqueLogic.getEmpaquesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpaqueConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpaqueConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empaqueLogic.getEmpaques()==null||empaqueLogic.getEmpaques().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empaques==null|| empaques.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empaquesAux=new ArrayList<Empaque>();
						empaquesAux.addAll(empaqueLogic.getEmpaques());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empaquesAux=new ArrayList<Empaque>();
							empaquesAux.addAll(empaques);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empaqueLogic.getEmpaquesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpaqueConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpaqueConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpaques("FK_IdEmpresa",empaqueLogic.getEmpaques());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpaques("FK_IdEmpresa",empaques);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empaqueLogic.setEmpaques(new ArrayList<Empaque>());
						empaqueLogic.getEmpaques().addAll(empaquesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empaques=new ArrayList<Empaque>();
							empaques.addAll(empaquesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEmpaque();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEmpaque();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empaqueLogic.getEmpaques().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empaques.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empaqueLogic.getEmpaques().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empaques.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Empaque empaque) {
		Boolean permite=true;
		
		if(this.empaque.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EmpaqueConstantesFunciones.getOrderByListaEmpaque();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EmpaqueConstantesFunciones.getOrderByListaEmpaque();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Empaque empaque:empaqueLogic.getEmpaques()) {
				if(empaque.getsType().equals(Constantes2.S_TOTALES)) {
					empaqueTotales=empaque;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Empaque empaque:this.empaques) {
				if(empaque.getsType().equals(Constantes2.S_TOTALES)) {
					empaqueTotales=empaque;
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
			this.empaqueAux=new Empaque();
			this.empaqueAux.setsType(Constantes2.S_TOTALES);
			this.empaqueAux.setIsNew(false);
			this.empaqueAux.setIsChanged(false);
			this.empaqueAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EmpaqueConstantesFunciones.TotalizarValoresFilaEmpaque(this.empaqueLogic.getEmpaques(),this.empaqueAux);
				
				this.empaqueLogic.getEmpaques().add(this.empaqueAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EmpaqueConstantesFunciones.TotalizarValoresFilaEmpaque(this.empaques,this.empaqueAux);
				
				this.empaques.add(this.empaqueAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		empaqueTotales=new Empaque();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empaqueLogic.getEmpaques().remove(empaqueTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empaques.remove(empaqueTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		empaqueTotales=new Empaque();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Empaque empaque:empaqueLogic.getEmpaques()) {
				if(empaque.getsType().equals(Constantes2.S_TOTALES)) {
					empaqueTotales=empaque;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpaqueConstantesFunciones.TotalizarValoresFilaEmpaque(this.empaqueLogic.getEmpaques(),empaqueTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Empaque empaque:this.empaques) {
				if(empaque.getsType().equals(Constantes2.S_TOTALES)) {
					empaqueTotales=empaque;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpaqueConstantesFunciones.TotalizarValoresFilaEmpaque(this.empaques,empaqueTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEmpaquesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEmpaquesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empaqueLogic.getEmpaquesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosEmpaque() {
		this.isPermisoTodoEmpaque=false;
		this.isPermisoNuevoEmpaque=false;
		this.isPermisoActualizarEmpaque=false;
		this.isPermisoActualizarOriginalEmpaque=false;
		this.isPermisoEliminarEmpaque=false;
		this.isPermisoGuardarCambiosEmpaque=false;
		this.isPermisoConsultaEmpaque=false;
		this.isPermisoBusquedaEmpaque=false;
		this.isPermisoReporteEmpaque=false;		
		this.isPermisoOrdenEmpaque=false;		
		this.isPermisoPaginacionMedioEmpaque=false;		
		this.isPermisoPaginacionAltoEmpaque=false;
		this.isPermisoPaginacionTodoEmpaque=false;
		this.isPermisoCopiarEmpaque=false;		
		this.isPermisoVerFormEmpaque=false;		
		this.isPermisoDuplicarEmpaque=false;		
		this.isPermisoOrdenEmpaque=false;		
	}
	
	public void setPermisosUsuarioEmpaque(Boolean isPermiso) {
		this.isPermisoTodoEmpaque=isPermiso;
		this.isPermisoNuevoEmpaque=isPermiso;
		this.isPermisoActualizarEmpaque=isPermiso;
		this.isPermisoActualizarOriginalEmpaque=isPermiso;
		this.isPermisoEliminarEmpaque=isPermiso;
		this.isPermisoGuardarCambiosEmpaque=isPermiso;
		this.isPermisoConsultaEmpaque=isPermiso;
		this.isPermisoBusquedaEmpaque=isPermiso;
		this.isPermisoReporteEmpaque=isPermiso;
		this.isPermisoOrdenEmpaque=isPermiso;		
		this.isPermisoPaginacionMedioEmpaque=isPermiso;		
		this.isPermisoPaginacionAltoEmpaque=isPermiso;		
		this.isPermisoPaginacionTodoEmpaque=isPermiso;		
		this.isPermisoCopiarEmpaque=isPermiso;		
		this.isPermisoVerFormEmpaque=isPermiso;		
		this.isPermisoDuplicarEmpaque=isPermiso;
		this.isPermisoOrdenEmpaque=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEmpaque(Boolean isPermiso) {
		//this.isPermisoTodoEmpaque=isPermiso;
		this.isPermisoNuevoEmpaque=isPermiso;
		this.isPermisoActualizarEmpaque=isPermiso;
		this.isPermisoActualizarOriginalEmpaque=isPermiso;
		this.isPermisoEliminarEmpaque=isPermiso;
		this.isPermisoGuardarCambiosEmpaque=isPermiso;
		//this.isPermisoConsultaEmpaque=isPermiso;
		//this.isPermisoBusquedaEmpaque=isPermiso;
		//this.isPermisoReporteEmpaque=isPermiso;
		//this.isPermisoOrdenEmpaque=isPermiso;		
		//this.isPermisoPaginacionMedioEmpaque=isPermiso;		
		//this.isPermisoPaginacionAltoEmpaque=isPermiso;		
		//this.isPermisoPaginacionTodoEmpaque=isPermiso;		
		//this.isPermisoCopiarEmpaque=isPermiso;		
		//this.isPermisoDuplicarEmpaque=isPermiso;
		//this.isPermisoOrdenEmpaque=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEmpaqueClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleProformaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DetaNotaCreditoSoliConstantesFunciones.SNOMBREOPCION);
		
		if(EmpaqueJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleProforma=false;
		this.isTienePermisosDetalleProforma=this.verificarGetPermisosUsuarioOpcionEmpaqueClaseRelacionada(this.opcionsRelacionadas,DetalleProformaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDetaNotaCreditoSoli=false;
		this.isTienePermisosDetaNotaCreditoSoli=this.verificarGetPermisosUsuarioOpcionEmpaqueClaseRelacionada(this.opcionsRelacionadas,DetaNotaCreditoSoliConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEmpaque(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEmpaqueClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleProforma=conPermiso;
		this.isTienePermisosDetaNotaCreditoSoli=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEmpaqueClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEmpaqueClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEmpaqueClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleProforma && this.jInternalFrameDetalleFormEmpaque!=null && this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEmpaque.jTabbedPaneRelacionesEmpaque.remove(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDetaNotaCreditoSoli && this.jInternalFrameDetalleFormEmpaque!=null && this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEmpaque.jTabbedPaneRelacionesEmpaque.remove(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEmpaque() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EmpaqueJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.empaqueSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EmpaqueConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEmpaque=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEmpaque=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEmpaque=this.isPermisoActualizarEmpaque;
			this.isPermisoEliminarEmpaque=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEmpaque=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEmpaque=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEmpaque=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEmpaque=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEmpaque=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpaque=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEmpaque=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEmpaque=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEmpaque=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEmpaque=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEmpaque=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEmpaque=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpaque=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.empaqueSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEmpaque.setToolTipText(this.jTableDatosEmpaque.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEmpaque(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEmpaque(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EmpaqueJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EmpaqueJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEmpaque() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetaNotaCreditoSoli && this.empaqueConstantesFunciones.mostrarDetaNotaCreditoSoliEmpaque && !EmpaqueConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle  Solicitud Nota Credit");
			reporte.setsDescripcion("Detalle  Solicitud Nota Credit");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDetalleProforma && this.empaqueConstantesFunciones.mostrarDetalleProformaEmpaque && !EmpaqueConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Proforma");
			reporte.setsDescripcion("Detalle Proforma");
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
	public void inicializarCombosForeignKeyEmpaqueListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEmpaqueListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EmpaqueJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEmpaqueListas(false);
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
	
	public void cargarCombosLoteForeignKeyEmpaqueListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EmpaqueParameterReturnGeneral empaqueReturnGeneral=new EmpaqueParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.empaqueConstantesFunciones.cargarid_empresaEmpaque)
					 || (this.esRecargarFks && this.empaqueConstantesFunciones.cargarid_empresaEmpaque)) {

					if(!this.empaqueSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+empaqueSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				empaqueReturnGeneral=empaqueLogic.cargarCombosLoteForeignKeyEmpaque(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=empaqueReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEmpaque()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.empaqueSessionBean==null) {
				this.empaqueSessionBean=new EmpaqueSessionBean();
			}

			if(!this.empaqueSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyEmpaque()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEmpaque(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEmpaque()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpaque();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEmpaque(Empaque empaque)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEmpaque(Empaque empaque,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEmpaque()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEmpaque()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEmpaque()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEmpaque()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEmpaque()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEmpaque()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEmpaque(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEmpaque()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEmpaque.jComboBoxid_empresaEmpaque!=null && this.jInternalFrameDetalleFormEmpaque.jComboBoxid_empresaEmpaque.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpaque.jComboBoxid_empresaEmpaque.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public EmpaqueBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EmpaqueBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EmpaqueBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.empaqueSessionBean=new EmpaqueSessionBean(); 
		this.empaqueConstantesFunciones=new EmpaqueConstantesFunciones(); 
		this.empaqueBean=new Empaque();//(this.empaqueConstantesFunciones); 		
		this.empaqueReturnGeneral=new EmpaqueParameterReturnGeneral(); 
		
		this.empaqueSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empaqueSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EmpaqueBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EmpaqueBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EmpaqueBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEmpaque(true);
			
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
			
			this.empaqueConstantesFunciones=new EmpaqueConstantesFunciones(); 
			this.empaqueBean=new Empaque();//this.empaqueConstantesFunciones); 			
			this.empaqueReturnGeneral=new EmpaqueParameterReturnGeneral(); 
		
			EmpaqueBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empaque Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.empaque=new Empaque();
			this.empaques = new ArrayList<Empaque>();
			this.empaquesAux = new ArrayList<Empaque>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic=new EmpaqueLogic();
				this.empaqueLogic.getNewConnexionToDeep("");
			}
			
			//this.empaqueSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.empaqueSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEmpaque);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEmpaque!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpaque);	
					}
					
					if(this.jInternalFrameImportacionEmpaque!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpaque);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEmpaque!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEmpaque);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEmpaque!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpaque);
				this.jInternalFrameDetalleFormEmpaque.setVisible(false);
				this.jInternalFrameDetalleFormEmpaque.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpaque!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpaque);
					this.jInternalFrameReporteDinamicoEmpaque.setVisible(false);
					this.jInternalFrameReporteDinamicoEmpaque.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEmpaque!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEmpaque);
					this.jInternalFrameImportacionEmpaque.setVisible(false);
					this.jInternalFrameImportacionEmpaque.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEmpaque!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEmpaque);
					this.jInternalFrameOrderByEmpaque.setVisible(false);
					this.jInternalFrameOrderByEmpaque.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEmpaqueActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EmpaqueConstantesFunciones.INUMEROPAGINACION;
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
			
			this.empaqueReturnGeneral=new EmpaqueParameterReturnGeneral();
			
			this.empaqueParameterGeneral=new EmpaqueParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.empaqueLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EmpaqueJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.empaqueSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleProformaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DetaNotaCreditoSoliConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpaqueConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empaqueSessionBean.getEsGuardarRelacionado(),this.empaqueSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpaqueConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empaqueSessionBean.getEsGuardarRelacionado(),this.empaqueSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEmpaque=false;
			this.isVisibilidadCeldaDuplicarEmpaque=true;
			this.isVisibilidadCeldaCopiarEmpaque=true;
			this.isVisibilidadCeldaVerFormEmpaque=true;
			this.isVisibilidadCeldaOrdenEmpaque=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpaque=false;
			this.isVisibilidadCeldaModificarEmpaque=false;
			this.isVisibilidadCeldaActualizarEmpaque=false;
			this.isVisibilidadCeldaEliminarEmpaque=false;
			this.isVisibilidadCeldaCancelarEmpaque=false;
			this.isVisibilidadCeldaGuardarEmpaque=false;
			this.isVisibilidadCeldaGuardarCambiosEmpaque=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEmpaque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEmpaque();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEmpaque(false);
			
			this.setPermisosUsuarioEmpaque();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empaqueSessionBean.getEsGuardarRelacionado() 
				|| (this.empaqueSessionBean.getEsGuardarRelacionado() && this.empaqueSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEmpaqueClasesRelacionadas();
			}
			
			if(this.empaqueSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEmpaqueClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EmpaqueJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEmpaque();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEmpaque();
			}
			
			if(!this.isPermisoBusquedaEmpaque) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEmpaque.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEmpaque,this.isPermisoPaginacionMedioEmpaque,this.isPermisoPaginacionTodoEmpaque);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EmpaqueConstantesFunciones.getTiposSeleccionarEmpaque());
				
				this.tiposColumnasSelect=EmpaqueConstantesFunciones.getTiposSeleccionarEmpaque(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEmpaque();				
				//this.tiposRelacionesSelect=EmpaqueConstantesFunciones.getTiposRelacionesEmpaque(true);
				
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
			//if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEmpaque();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioEmpaque(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioEmpaque(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpaque() ;
			
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
			
			
			this.detanotacreditosoliLogic=new DetaNotaCreditoSoliLogic();
			this.detalleproformaLogic=new DetalleProformaLogic(); 
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
				empaqueImplementable= (EmpaqueImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpaqueConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				empaqueImplementableHome= (EmpaqueImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpaqueConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.empaques= new ArrayList<Empaque>();
			this.empaquesEliminados= new ArrayList<Empaque>();
						
			this.isEsNuevoEmpaque=false;
			this.esParaAccionDesdeFormularioEmpaque=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEmpaque(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEmpaque();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EmpaqueBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EmpaqueConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEmpaque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEmpaque(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEmpaque!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEmpaque();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEmpaque();
			}
			
			EmpaqueBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEmpaque.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEmpaque.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEmpaque.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEmpaque(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Empaque: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEmpaque() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEmpaque")) {
				iIndex=this.jInternalFrameDetalleFormEmpaque.jTabbedPaneRelacionesEmpaque.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEmpaque.jTabbedPaneRelacionesEmpaque.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Proformas")) {
					if(!DetalleProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEmpaque();

						this.cargarParteTabPanelRelacionadaDetalleProforma(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Detalle  Solicitud Nota Credits")) {
					if(!DetaNotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEmpaque();

						this.cargarParteTabPanelRelacionadaDetaNotaCreditoSoli(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEmpaque();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleProforma(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEmpaque.cargarSessionConBeanSwingJInternalFrameDetalleProforma(false,true,iIndex);
		this.jButtonDetalleProformaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleProforma();

		//this.jTabbedPaneRelacionesEmpaque.updateUI();
		//this.jTabbedPaneRelacionesEmpaque.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEmpaque.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDetaNotaCreditoSoli(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEmpaque.cargarSessionConBeanSwingJInternalFrameDetaNotaCreditoSoli(false,true,iIndex);
		this.jButtonDetaNotaCreditoSoliActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetaNotaCreditoSoli();

		//this.jTabbedPaneRelacionesEmpaque.updateUI();
		//this.jTabbedPaneRelacionesEmpaque.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEmpaque.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetaNotaCreditoSoli")) {
				int row=this.jTableDatosEmpaque.getSelectedRow();
				jButtonDetaNotaCreditoSoliActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DetalleProforma")) {
				int row=this.jTableDatosEmpaque.getSelectedRow();
				jButtonDetalleProformaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle  Solicitud Nota Credit")) {

					if(this.isTienePermisosDetaNotaCreditoSoli && this.empaqueConstantesFunciones.mostrarDetaNotaCreditoSoliEmpaque && !EmpaqueConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle  Solicitud Nota Credits"+"("+DetaNotaCreditoSoliConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle  Solicitud Nota Credits");

						if(empaqueConstantesFunciones.resaltarDetaNotaCreditoSoliEmpaque!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(empaqueConstantesFunciones.resaltarDetaNotaCreditoSoliEmpaque);
						}

						jmenuItem.setEnabled(this.empaqueConstantesFunciones.activarDetaNotaCreditoSoliEmpaque);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetaNotaCreditoSoli"));

						

						this.jInternalFrameDetalleFormEmpaque.jmenuDetalleEmpaque.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Detalle Proforma")) {

					if(this.isTienePermisosDetalleProforma && this.empaqueConstantesFunciones.mostrarDetalleProformaEmpaque && !EmpaqueConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Proformas"+"("+DetalleProformaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Proformas");

						if(empaqueConstantesFunciones.resaltarDetalleProformaEmpaque!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(empaqueConstantesFunciones.resaltarDetalleProformaEmpaque);
						}

						jmenuItem.setEnabled(this.empaqueConstantesFunciones.activarDetalleProformaEmpaque);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleProforma"));

						

						this.jInternalFrameDetalleFormEmpaque.jmenuDetalleEmpaque.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEmpaque(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEmpaque(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEmpaque(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEmpaqueListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEmpaque();
		
		this.cargarCombosFrameForeignKeyEmpaque();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEmpaque();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEmpaque();
		}
	}
	
	
	
	public void jButtonNuevoEmpaqueActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.empaqueSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEmpaque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
			
			
			if(jTableDatosEmpaque.getRowCount()>=1) {
				jTableDatosEmpaque.removeRowSelectionInterval(0, jTableDatosEmpaque.getRowCount()-1);						
			}
			
			this.isEsNuevoEmpaque=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEmpaque(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEmpaque(true);			
			//this.empaque=new Empaque();
			//this.empaque.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpaque(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpaque() ;
			
			if(EmpaqueJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpaque(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.empaque);	
			this.actualizarInformacion("INFO_PADRE",false,this.empaque);				
			
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
			
			if(this.empaqueSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Empaque: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEmpaqueActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Empaque> empaquesSeleccionados=new ArrayList<Empaque>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEmpaque.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEmpaque.getSelectedRows().length;			
			}
			
			empaquesSeleccionados=this.getEmpaquesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEmpaque--;			
				//Empaque empaqueAux= new Empaque();			
				//empaqueAux.setId(this.iIdNuevoEmpaque);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Empaque empaqueOrigen=new Empaque();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Empaque empaqueOrigen : empaquesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							empaqueOrigen =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empaqueOrigen =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEmpaque();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.empaque.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEmpaque(empaqueOrigen,this.empaque,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empaqueLogic.getEmpaques().add(this.empaqueAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empaques.add(this.empaqueAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEmpaque(false);
				
				this.jTableDatosEmpaque.setRowSelectionInterval(this.getIndiceNuevoEmpaque(), this.getIndiceNuevoEmpaque());
				
				int iLastRow =  this.jTableDatosEmpaque.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpaque.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpaque.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpaque(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEmpaqueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Empaque> empaquesSeleccionados=new ArrayList<Empaque>();									
		
			Empaque empaqueOrigen=new Empaque();
			Empaque empaqueDestino=new Empaque();
				
			empaquesSeleccionados=this.getEmpaquesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEmpaque.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || empaquesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEmpaque.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empaqueOrigen =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empaqueOrigen =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empaqueDestino =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empaqueDestino =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				empaqueOrigen =empaquesSeleccionados.get(0);
				empaqueDestino =empaquesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEmpaque(empaqueOrigen,empaqueDestino,true,false);
				
				empaqueDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empaqueDestino,empaqueLogic.getEmpaques());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empaqueDestino,empaques);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEmpaque(false);
				
				//this.jTableDatosEmpaque.setRowSelectionInterval(this.getIndiceNuevoEmpaque(), this.getIndiceNuevoEmpaque());
				
				int iLastRow =  this.jTableDatosEmpaque.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpaque.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpaque.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpaque(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEmpaqueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpaque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEmpaque.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEmpaqueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEmpaque.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEmpaque.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEmpaque.setVisible(!isVisible);
			this.jPanelPaginacionEmpaque.setVisible(!isVisible);
			this.jPanelAccionesEmpaque.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEmpaqueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEmpaque();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEmpaqueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEmpaque();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEmpaqueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEmpaque();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEmpaqueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEmpaque();
			
			this.abrirFrameOrderByEmpaque();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEmpaqueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEmpaque();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEmpaque(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpaque);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEmpaque.isMaximum()) {
					this.jInternalFrameDetalleFormEmpaque.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEmpaque.setSize(this.jInternalFrameDetalleFormEmpaque.iWidthFormulario,this.jInternalFrameDetalleFormEmpaque.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEmpaque.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEmpaque.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEmpaque.isMaximum()) {
						this.jInternalFrameDetalleFormEmpaque.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEmpaque.jContentPaneDetalleEmpaque.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEmpaque.jTabbedPaneRelacionesEmpaque.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEmpaque.jContentPaneDetalleEmpaque.getWidth(),EmpaqueConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpaque.jTabbedPaneRelacionesEmpaque.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEmpaque.jContentPaneDetalleEmpaque.getWidth(),EmpaqueConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpaque.jTabbedPaneRelacionesEmpaque.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEmpaque.jContentPaneDetalleEmpaque.getWidth(),EmpaqueConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleProforma();
					}

					if(DetaNotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetaNotaCreditoSoli();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEmpaque.setVisible(true);
	        this.jInternalFrameDetalleFormEmpaque.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEmpaque() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEmpaque==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEmpaque=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpaque,false,this);
				} else {
					this.jInternalFrameOrderByEmpaque=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpaque,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEmpaque);
				this.jInternalFrameOrderByEmpaque.setVisible(false);
				this.jInternalFrameOrderByEmpaque.setSelected(false);
				
				this.jInternalFrameOrderByEmpaque.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpaque"));
				
				this.inicializarActualizarBindingTablaOrderByEmpaque();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEmpaque() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEmpaque==null) {
				
				this.jInternalFrameImportacionEmpaque=new ImportacionJInternalFrame(EmpaqueConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpaque);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEmpaque);
				this.jInternalFrameImportacionEmpaque.setVisible(false);
				this.jInternalFrameImportacionEmpaque.setSelected(false);


				this.jInternalFrameImportacionEmpaque.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpaque"));
				this.jInternalFrameImportacionEmpaque.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpaque"));
				this.jInternalFrameImportacionEmpaque.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpaque"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEmpaque() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEmpaque==null) {
				this.jInternalFrameReporteDinamicoEmpaque=new ReporteDinamicoJInternalFrame(EmpaqueConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpaque);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpaque);
				this.jInternalFrameReporteDinamicoEmpaque.setVisible(false);
				this.jInternalFrameReporteDinamicoEmpaque.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEmpaque.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpaque"));
				this.jInternalFrameReporteDinamicoEmpaque.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpaque"));
				this.jInternalFrameReporteDinamicoEmpaque.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpaque"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpaque();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleProforma() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.jScrollPanelDatosDetalleProforma.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEmpaque.jContentPaneDetalleEmpaque.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.jScrollPanelDatosDetalleProforma.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.jScrollPanelDatosDetalleProforma.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.jScrollPanelDatosDetalleProforma.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaDetaNotaCreditoSoli() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosDetaNotaCreditoSoli.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEmpaque.jContentPaneDetalleEmpaque.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosDetaNotaCreditoSoli.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosDetaNotaCreditoSoli.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosDetaNotaCreditoSoli.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEmpaque() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpaque);
			
	       	this.jInternalFrameDetalleFormEmpaque.setVisible(false);
	        this.jInternalFrameDetalleFormEmpaque.setSelected(false);
			
			//this.jInternalFrameDetalleFormEmpaque.dispose();
			//this.jInternalFrameDetalleFormEmpaque=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEmpaque() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEmpaque.setVisible(true);
	        this.jInternalFrameReporteDinamicoEmpaque.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEmpaque() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEmpaque.setVisible(true);
	        this.jInternalFrameImportacionEmpaque.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEmpaque() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEmpaque.setVisible(true);
	        this.jInternalFrameOrderByEmpaque.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEmpaque() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEmpaque.setVisible(false);
	        this.jInternalFrameOrderByEmpaque.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEmpaque() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEmpaque.setVisible(false);
	        this.jInternalFrameReporteDinamicoEmpaque.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEmpaque() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEmpaque.setVisible(false);
	        this.jInternalFrameImportacionEmpaque.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEmpaqueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEmpaque(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEmpaque(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEmpaque(true);
			//this.isEsNuevoEmpaque=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaque =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empaque =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEmpaque("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpaque(false) ;
			
			if(empaqueSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.getEsGuardarRelacionado() && DetalleProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleProformaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.getEsGuardarRelacionado() && DetaNotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetaNotaCreditoSoliActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EmpaqueJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpaque(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpaque(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEmpaqueActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaque =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empaque =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEmpaque(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpaque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEmpaque(true);
			//this.isEsNuevoEmpaque=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaque =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empaque =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.empaque.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEmpaque("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEmpaque(false) ;
			
			if(EmpaqueJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpaque(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpaque(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarEmpaqueActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEmpaque(false);
			
			//if(!this.isEsNuevoEmpaque) {								
				int intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaque =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empaque =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EmpaqueJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEmpaque(this.empaque,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);
				
			}
			
			if(this.permiteMantenimiento(this.empaque)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.empaqueSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEmpaque=true;
					this.inicializarActualizarBindingTablaEmpaque(false);
					this.isEsNuevoEmpaque=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEmpaque=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEmpaque=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpaque(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpaque(false);
				
				this.habilitarDeshabilitarControlesEmpaque(false);
			
												
				
				if(EmpaqueJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEmpaque();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEmpaqueActionPerformed(evt,empaqueSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEmpaque(this.empaque,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEmpaque.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,empaqueSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.empaque.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Empaque.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empaque.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEmpaqueActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaque =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				this.empaque.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empaque =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				this.empaque.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.empaque)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.empaqueSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EmpaqueModel) this.jTableDatosEmpaque.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEmpaque=true;
				this.inicializarActualizarBindingTablaEmpaque(false);
				this.isEsNuevoEmpaque=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpaque(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpaque(false);
				
				this.habilitarDeshabilitarControlesEmpaque(false);
				
				
				
				if(EmpaqueJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEmpaque();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEmpaqueActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEmpaque.getRowCount()>=1) {
				jTableDatosEmpaque.removeRowSelectionInterval(0, jTableDatosEmpaque.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEmpaque(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEmpaque(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpaque(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpaque(false) ;
			
			this.isEsNuevoEmpaque=false;
			
			if(EmpaqueJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEmpaque();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEmpaqueActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEmpaque(false);
				
				//SI ES MANUAL
				if(EmpaqueJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEmpaque();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEmpaqueActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEmpaque--;			
			//Empaque empaqueAux= new Empaque();			
			//empaqueAux.setId(this.iIdNuevoEmpaque);
			
			if(this.jInternalFrameDetalleFormEmpaque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEmpaque();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);
			
			this.empaque.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.empaqueLogic.getEmpaques().add(this.empaqueAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.empaques.add(this.empaqueAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEmpaque(false);
			
			this.jTableDatosEmpaque.setRowSelectionInterval(this.getIndiceNuevoEmpaque(), this.getIndiceNuevoEmpaque());
			
			int iLastRow =  this.jTableDatosEmpaque.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEmpaque.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEmpaque.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEmpaque(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEmpaqueActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEmpaque(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpaque(false);
			
			//SI ES MANUAL
			if(EmpaqueJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpaque();
			}
			
			//this.abrirFrameTreeEmpaque();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEmpaqueActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE EmpaqueS ?", "MANTENIMIENTO DE Empaque", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEmpaque.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEmpaque();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.empaqueReturnGeneral=empaqueLogic.procesarImportacionEmpaquesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.empaqueParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEmpaqueReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEmpaqueActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEmpaque.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEmpaque.setFileImportacion(this.jInternalFrameImportacionEmpaque.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEmpaque.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEmpaque.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEmpaque.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEmpaque.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEmpaqueActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Empaque> empaquesSeleccionados=new ArrayList<Empaque>();		

		empaquesSeleccionados=this.getEmpaquesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EmpaqueBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EmpaqueBaseDesign.jrxml";
			
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
			
			this.generarReporteEmpaques("Todos",empaquesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empaqueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empaque",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEmpaque.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpaque.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpaqueConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpaqueConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpaqueConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEmpaque.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EmpaqueConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EmpaqueConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case EmpaqueConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EmpaqueConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EmpaqueConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case EmpaqueConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEmpaque.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpaque.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpaqueConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EmpaqueConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case EmpaqueConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoEmpaqueActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Empaque> empaquesSeleccionados=new ArrayList<Empaque>();		
		
		empaquesSeleccionados=this.getEmpaquesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empaque";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Empaques");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEmpaque.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpaque.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EmpaqueConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpaqueConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Empaque empaque:empaquesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empaque.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpaqueConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpaqueConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(Empaque empaque:empaquesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empaque.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpaqueConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpaqueConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Empaque empaque:empaquesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empaque.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelEmpaque(row);				
			//	iRow++;
			//}				
			
			//for(Empaque empaqueAux:empaquesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEmpaque(empaqueAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empaqueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empaque",JOptionPane.INFORMATION_MESSAGE);
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
				this.empaqueLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpaque(false);
			
			//SI ES MANUAL
			if(EmpaqueJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpaque();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEmpaqueActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpaque(false);
			
			//SI ES MANUAL
			if(EmpaqueJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpaque();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEmpaqueActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpaque(false);
			
			//SI ES MANUAL
			if(EmpaqueJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpaque();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEmpaque() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEmpaque.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEmpaque.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEmpaque.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEmpaque.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEmpaque.setMinimumSize(dimensionMinimum);
		this.jTableDatosEmpaque.setMaximumSize(dimensionMaximum);
		this.jTableDatosEmpaque.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEmpaque(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEmpaque(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEmpaque(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEmpaque(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEmpaque(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEmpaque(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpaque(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEmpaque(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EmpaqueJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EmpaqueJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEmpaque() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEmpaque();
		
		this.inicializarActualizarBindingBotonesManualEmpaque(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEmpaque();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpaque() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEmpaque(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEmpaque(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEmpaque.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEmpaque.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEmpaque.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEmpaque!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEmpaque.jCheckBoxPostAccionNuevoEmpaque.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEmpaque.jCheckBoxPostAccionSinCerrarEmpaque.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEmpaque.jCheckBoxPostAccionSinMensajeEmpaque.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEmpaque.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEmpaque.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEmpaque.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEmpaque!=null) {
				this.jInternalFrameDetalleFormEmpaque.jCheckBoxPostAccionNuevoEmpaque.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEmpaque.jCheckBoxPostAccionSinCerrarEmpaque.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEmpaque.jCheckBoxPostAccionSinMensajeEmpaque.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEmpaque.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEmpaque.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEmpaque!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEmpaque.jComboBoxTiposAccionesFormularioEmpaque.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEmpaque.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEmpaque!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEmpaque.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEmpaque.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEmpaque.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEmpaque.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEmpaque!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEmpaque.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEmpaque.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEmpaque(Boolean esInicializar) throws Exception {
		try	{	
			if(EmpaqueJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEmpaque(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEmpaque() throws Exception {
		try	{
			if(EmpaqueJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpaque();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpaque() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEmpaque.jComboBoxTiposAccionesFormularioEmpaque.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEmpaque.jComboBoxTiposAccionesFormularioEmpaque.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpaque() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEmpaque.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEmpaque.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEmpaque.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEmpaque.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEmpaque.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEmpaque.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEmpaque.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEmpaque.addItem(reporte);
			}
			
			
			if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEmpaque.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEmpaque.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEmpaque.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEmpaque.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEmpaque.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEmpaque.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEmpaque.jComboBoxTiposAccionesFormularioEmpaque.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEmpaque.jComboBoxTiposAccionesFormularioEmpaque.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEmpaque.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEmpaque.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEmpaque.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpaque();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpaque() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpaque!=null) {
				this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpaque!=null) {
				this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEmpaque!=null) {
				
				if(this.jInternalFrameReporteDinamicoEmpaque.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpaque.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpaque.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEmpaque.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpaque.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpaque.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=EmpaqueConstantesFunciones.getTiposSeleccionarEmpaque(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=EmpaqueConstantesFunciones.getTiposSeleccionarEmpaque(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoEmpaque.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEmpaque.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=EmpaqueConstantesFunciones.getTiposSeleccionarEmpaque(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpaque.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoEmpaque.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEmpaque()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEmpaque(Boolean esInicializar) throws Exception {				
		if(EmpaqueJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEmpaque();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEmpaque() throws Exception {
		this.inicializarActualizarBindingTablaEmpaque(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEmpaque() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEmpaque.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEmpaque.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpaque.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EmpaquePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEmpaque.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpaque.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EmpaquePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEmpaqueOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpaqueOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EmpaquePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEmpaque.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpaque.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EmpaquePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEmpaque.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEmpaque(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=empaqueLogic.getEmpaques().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=empaques.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EmpaqueJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEmpaque.setModel(new EmpaqueModel(this.empaqueLogic.getEmpaques(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEmpaque.setModel(new EmpaqueModel(this.empaques,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEmpaque!=null && this.jInternalFrameOrderByEmpaque.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEmpaque();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEmpaque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpaque,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EmpaquePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EmpaqueConstantesFunciones.SCLASSWEBTITULO,empaqueConstantesFunciones.resaltarSeleccionarEmpaque,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EmpaqueConstantesFunciones.SCLASSWEBTITULO,empaqueConstantesFunciones.resaltarSeleccionarEmpaque,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEmpaque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpaque,EmpaqueConstantesFunciones.LABEL_ID));

		if(this.empaqueConstantesFunciones.mostraridEmpaque && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpaqueConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empaqueConstantesFunciones.resaltaridEmpaque,this.empaqueConstantesFunciones.activaridEmpaque,iSizeTabla,this,true,"idEmpaque","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empaqueConstantesFunciones.resaltaridEmpaque,this.empaqueConstantesFunciones.activaridEmpaque,this,true,"idEmpaque","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpaque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpaque,EmpaqueConstantesFunciones.LABEL_IDEMPRESA));

		if(this.empaqueConstantesFunciones.mostrarid_empresaEmpaque && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpaqueConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.empaqueConstantesFunciones.resaltarid_empresaEmpaque,this,this.empaqueConstantesFunciones.activarid_empresaEmpaque,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.empaqueConstantesFunciones.resaltarid_empresaEmpaque,this,this.empaqueConstantesFunciones.activarid_empresaEmpaque,false,"id_empresaEmpaque","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpaquePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpaque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpaque,EmpaqueConstantesFunciones.LABEL_VALOR));

		if(this.empaqueConstantesFunciones.mostrarvalorEmpaque && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpaqueConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empaqueConstantesFunciones.resaltarvalorEmpaque,this.empaqueConstantesFunciones.activarvalorEmpaque,iSizeTabla,this,true,"valorEmpaque","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empaqueConstantesFunciones.resaltarvalorEmpaque,this.empaqueConstantesFunciones.activarvalorEmpaque,this,true,"valorEmpaque","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpaquePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpaque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpaque,EmpaqueConstantesFunciones.LABEL_DESCRIPCION));

		if(this.empaqueConstantesFunciones.mostrardescripcionEmpaque && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpaqueConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empaqueConstantesFunciones.resaltardescripcionEmpaque,this.empaqueConstantesFunciones.activardescripcionEmpaque,iSizeTabla,this,true,"descripcionEmpaque","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empaqueConstantesFunciones.resaltardescripcionEmpaque,this.empaqueConstantesFunciones.activardescripcionEmpaque,this,true,"descripcionEmpaque","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpaquePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.empaqueSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetaNotaCreditoSoli && this.empaqueConstantesFunciones.mostrarDetaNotaCreditoSoliEmpaque && !EmpaqueConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle  Solicitud Nota Credits");
				tableColumn.setHeaderValue("Detalle  Solicitud Nota Credits");
				tableColumn.setCellRenderer(new DetaNotaCreditoSoliTableCell(empaqueConstantesFunciones.resaltarDetaNotaCreditoSoliEmpaque,this,this.empaqueConstantesFunciones.activarDetaNotaCreditoSoliEmpaque));
				tableColumn.setCellEditor(new DetaNotaCreditoSoliTableCell(empaqueConstantesFunciones.resaltarDetaNotaCreditoSoliEmpaque,this,this.empaqueConstantesFunciones.activarDetaNotaCreditoSoliEmpaque));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEmpaque.addColumn(tableColumn);
			}

			if(this.isTienePermisosDetalleProforma && this.empaqueConstantesFunciones.mostrarDetalleProformaEmpaque && !EmpaqueConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Proformas");
				tableColumn.setHeaderValue("Detalle Proformas");
				tableColumn.setCellRenderer(new DetalleProformaTableCell(empaqueConstantesFunciones.resaltarDetalleProformaEmpaque,this,this.empaqueConstantesFunciones.activarDetalleProformaEmpaque));
				tableColumn.setCellEditor(new DetalleProformaTableCell(empaqueConstantesFunciones.resaltarDetalleProformaEmpaque,this,this.empaqueConstantesFunciones.activarDetalleProformaEmpaque));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEmpaque.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empaqueSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empaqueSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpaque.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empaqueSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empaqueSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpaque.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEmpaque && this.isPermisoGuardarCambiosEmpaque) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.empaqueSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.empaqueSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEmpaque.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.empaqueSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEmpaque.addColumn(tableColumn);
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
			
			this.jTableDatosEmpaque.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpaque && this.isPermisoGuardarCambiosEmpaque) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.empaqueSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpaque && this.isPermisoGuardarCambiosEmpaque) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEmpaque.moveColumn(this.jTableDatosEmpaque.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEmpaque.moveColumn(this.jTableDatosEmpaque.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.empaqueSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEmpaque.moveColumn(this.jTableDatosEmpaque.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEmpaque.moveColumn(this.jTableDatosEmpaque.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEmpaque.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEmpaque.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEmpaque,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EmpaqueJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEmpaque.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEmpaque.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EmpaqueJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EmpaqueJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEmpaque.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEmpaque.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEmpaque.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=empaqueLogic.getEmpaques().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=empaques.size()-1;
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
		//this.jTableDatosEmpaque.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEmpaque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEmpaque();
			
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
				
				//this.isEsNuevoEmpaque=false;
					
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
			
				if(this.empaqueSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEmpaque==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpaque.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpaque.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaque =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empaque =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.empaque.getsType().equals("DUPLICADO")
				   || this.empaque.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEmpaque=true;
				
				} else {
					this.isEsNuevoEmpaque=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
					if(this.empaque.getId()>=0 && !this.empaque.getIsNew()) {						
						this.isEsNuevoEmpaque=false;
						
					} else {
						this.isEsNuevoEmpaque=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEmpaque(esRelaciones);						
				
				this.seleccionarEmpaque(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.empaque.getId()<0) {
					this.isEsNuevoEmpaque=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEmpaque(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEmpaque(evt,rowIndex);
				}	
				
				if(this.empaqueSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Empaque: " + this.dDif); 
					}
				}								
				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEmpaque(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.empaque)) {
					if(this.empaque.getId()>0) {
						this.empaque.setIsDeleted(true);
						
						this.empaquesEliminados.add(this.empaque);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empaqueLogic.getEmpaques().remove(this.empaque);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empaques.remove(this.empaque);				
					}
					
					
					((EmpaqueModel) this.jTableDatosEmpaque.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpaque(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEmpaque(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEmpaque) {
			
			if(this.jInternalFrameDetalleFormEmpaque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpaque.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpaque.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaque =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empaque =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EmpaqueJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEmpaque(this.empaque);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.empaqueConstantesFunciones.cargarid_empresaEmpaque || this.empaqueConstantesFunciones.event_dependid_empresaEmpaque) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.empaque.getid_empresa());
									//this.inicializarActualizarBindingEmpaque(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(empaque.getEmpresa()!=null) {
							this.empresasForeignKey.add(empaque.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.empaque.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEmpaque("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEmpaque(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpaque() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpaque(Empaque empaque) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEmpaque(empaque,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpaque(Empaque empaque,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEmpaque(empaque);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEmpaque(empaque,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEmpaque(empaque);
	}
	
	public void setVariablesObjetoActualToFormularioEmpaque(Empaque empaque) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEmpaque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEmpaque.jLabelidEmpaque.setText(empaque.getId().toString());
			this.jInternalFrameDetalleFormEmpaque.jTextFieldvalorEmpaque.setText(empaque.getvalor().toString());
			this.jInternalFrameDetalleFormEmpaque.jTextAreadescripcionEmpaque.setText(empaque.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Empaque empaqueLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,empaqueLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Empaque empaqueLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				empaqueLocal=this.empaque;
			} else {
				empaqueLocal=this.empaqueAnterior;
			}
		}
		
		if(this.permiteMantenimiento(empaqueLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEmpaque(empaqueLocal,true);
					
					if(empaqueSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(empaqueLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.empaqueSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(empaqueLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEmpaque(Empaque empaque,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpaque(empaque,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(empaque);
	}
	
	public void setVariablesFormularioToObjetoActualEmpaque(Empaque empaque,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpaque(empaque,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEmpaque(Empaque empaque,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEmpaque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEmpaque.jLabelidEmpaque.getText()==null || this.jInternalFrameDetalleFormEmpaque.jLabelidEmpaque.getText()=="" || this.jInternalFrameDetalleFormEmpaque.jLabelidEmpaque.getText()=="Id") {
				this.jInternalFrameDetalleFormEmpaque.jLabelidEmpaque.setText("0");
			}

			if(conColumnasBase) {empaque.setId(Long.parseLong(this.jInternalFrameDetalleFormEmpaque.jLabelidEmpaque.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpaqueConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpaque.jLabelIdEmpaque,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empaque.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormEmpaque.jTextFieldvalorEmpaque.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpaqueConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpaque.jLabelvalorEmpaque,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empaque.setdescripcion(this.jInternalFrameDetalleFormEmpaque.jTextAreadescripcionEmpaque.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpaqueConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpaque.jLabeldescripcionEmpaque,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpaque(Empaque empaqueBean,Empaque empaque,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEmpaque(Empaque empaqueOrigen,Empaque empaque,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empaqueOrigen.getId()!=null && !empaqueOrigen.getId().equals(0L))) {empaque.setId(empaqueOrigen.getId());}}
			if(conDefault || (!conDefault && empaqueOrigen.getvalor()!=null && !empaqueOrigen.getvalor().equals(0.0))) {empaque.setvalor(empaqueOrigen.getvalor());}
			if(conDefault || (!conDefault && empaqueOrigen.getdescripcion()!=null && !empaqueOrigen.getdescripcion().equals(""))) {empaque.setdescripcion(empaqueOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpaque(Empaque empaque) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpaque.jLabelidEmpaque.setText(empaque.getId().toString());
			this.jInternalFrameDetalleFormEmpaque.jTextFieldvalorEmpaque.setText(empaque.getvalor().toString());
			this.jInternalFrameDetalleFormEmpaque.jTextAreadescripcionEmpaque.setText(empaque.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpaque(EmpaqueBean empaqueBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpaque.jLabelidEmpaque.setText(empaqueBean.getId().toString());
			this.jInternalFrameDetalleFormEmpaque.jTextFieldvalorEmpaque.setText(empaqueBean.getvalor().toString());
			this.jInternalFrameDetalleFormEmpaque.jTextAreadescripcionEmpaque.setText(empaqueBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEmpaque(EmpaqueParameterReturnGeneral empaqueReturnGeneral,EmpaqueBean empaqueBean,Boolean conDefault) throws Exception { 
		try {
			Empaque empaqueLocal=new Empaque();
			
			empaqueLocal=empaqueReturnGeneral.getEmpaque();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empaqueLocal.getId()!=null && !empaqueLocal.getId().equals(0L))) {empaqueBean.setId(empaqueLocal.getId());}}
			if(conDefault || (!conDefault && empaqueLocal.getvalor()!=null && !empaqueLocal.getvalor().equals(0.0))) {empaqueBean.setvalor(empaqueLocal.getvalor());}
			if(conDefault || (!conDefault && empaqueLocal.getdescripcion()!=null && !empaqueLocal.getdescripcion().equals(""))) {empaqueBean.setdescripcion(empaqueLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEmpaqueGenerico(Long idEmpaqueSeleccionado,JComboBox jComboBoxEmpaque,List<Empaque> empaquesLocal)throws Exception {
		try {
			Empaque  empaqueTemp=null;

			for(Empaque empaqueAux:empaquesLocal) {
				if(empaqueAux.getId()!=null && empaqueAux.getId().equals(idEmpaqueSeleccionado)) {
					empaqueTemp=empaqueAux;
					break;
				}
			}

			jComboBoxEmpaque.setSelectedItem(empaqueTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEmpaqueGenerico(JComboBox jComboBoxEmpaque,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEmpaque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpaque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEmpaque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpaque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpaque.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEmpaque.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpaque.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEmpaque.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEmpaque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEmpaque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleProforma")) {
			jButtonDetalleProformaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DetaNotaCreditoSoli")) {
			jButtonDetaNotaCreditoSoliActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empaque=(Empaque) empaqueLogic.getEmpaques().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empaque =(Empaque) empaques.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!empaque.getIsNew() && !empaque.getIsChanged() && !empaque.getIsDeleted()) {
				sDescripcion=empaque.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=empaque.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Empaque empaqueRow=new Empaque();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empaqueRow=(Empaque) empaqueLogic.getEmpaques().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empaqueRow=(Empaque) empaques.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleProformaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Empaque empaque) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEmpaque==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empaque = (Empaque)this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.empaque = (Empaque)this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(empaque!=null) {
						this.empaque = empaque;
					} else {
						this.empaque = new Empaque();
					}
				}

				if(this.isTienePermisosDetalleProforma && this.permiteMantenimiento(this.empaque)) {
					DetalleProformaBeanSwingJInternalFrame detalleproformaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFramePopup=new DetalleProformaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleproformaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFramePopup;
					} else {
						detalleproformaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame;
					}

					List<Empaque> empaques=new ArrayList<Empaque>();
					empaques.add(this.empaque);
					if(!esRelacionado) {
						//detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.setConGuardarRelaciones(false);
						//detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleproformaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEmpaque.cargarDetalleProformaBeanSwingJInternalFrame(empaques,this.empaque,detalleproformaBeanSwingJInternalFrame,/*conInicializar,*/detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.getConGuardarRelaciones(),detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.getEsGuardarRelacionado());
					detalleproformaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleproformaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleProforma("no_relacionado");

						detalleproformaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleProformaConstantesFunciones.ITAMANIOFILATABLA + (DetalleProformaConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleproformaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEmpaque=(TitledBorder)this.jScrollPanelDatosEmpaque.getBorder();
						TitledBorder titledBorderDetalleProforma=(TitledBorder)detalleproformaBeanSwingJInternalFrame.jScrollPanelDatosDetalleProforma.getBorder();

						titledBorderDetalleProforma.setTitle(titledBorderEmpaque.getTitle() + " -> Detalle Proforma");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleproformaBeanSwingJInternalFrame);
						}

						detalleproformaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleproformaBeanSwingJInternalFrame);

						detalleproformaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.empaqueSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Proforma",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDetaNotaCreditoSoliActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Empaque empaque) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEmpaque==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empaque = (Empaque)this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.empaque = (Empaque)this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(empaque!=null) {
						this.empaque = empaque;
					} else {
						this.empaque = new Empaque();
					}
				}

				if(this.isTienePermisosDetaNotaCreditoSoli && this.permiteMantenimiento(this.empaque)) {
					DetaNotaCreditoSoliBeanSwingJInternalFrame detanotacreditosoliBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFramePopup=new DetaNotaCreditoSoliBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detanotacreditosoliBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFramePopup;
					} else {
						detanotacreditosoliBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame;
					}

					List<Empaque> empaques=new ArrayList<Empaque>();
					empaques.add(this.empaque);
					if(!esRelacionado) {
						//detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.setConGuardarRelaciones(false);
						//detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detanotacreditosoliBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEmpaque.cargarDetaNotaCreditoSoliBeanSwingJInternalFrame(empaques,this.empaque,detanotacreditosoliBeanSwingJInternalFrame,/*conInicializar,*/detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.getConGuardarRelaciones(),detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
					detanotacreditosoliBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detanotacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsDetaNotaCreditoSoli("no_relacionado");

						detanotacreditosoliBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetaNotaCreditoSoliConstantesFunciones.ITAMANIOFILATABLA + (DetaNotaCreditoSoliConstantesFunciones.ITAMANIOFILATABLA/2));

						detanotacreditosoliBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEmpaque=(TitledBorder)this.jScrollPanelDatosEmpaque.getBorder();
						TitledBorder titledBorderDetaNotaCreditoSoli=(TitledBorder)detanotacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosDetaNotaCreditoSoli.getBorder();

						titledBorderDetaNotaCreditoSoli.setTitle(titledBorderEmpaque.getTitle() + " -> Detalle  Solicitud Nota Credit");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detanotacreditosoliBeanSwingJInternalFrame);
						}

						detanotacreditosoliBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detanotacreditosoliBeanSwingJInternalFrame);

						detanotacreditosoliBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.empaqueSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle  Solicitud Nota Credit",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEmpaque(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEmpaque.setVisible((this.isVisibilidadCeldaNuevoEmpaque && this.isPermisoNuevoEmpaque));			
			this.jButtonDuplicarEmpaque.setVisible((this.isVisibilidadCeldaDuplicarEmpaque && this.isPermisoDuplicarEmpaque));			
			this.jButtonCopiarEmpaque.setVisible((this.isVisibilidadCeldaCopiarEmpaque && this.isPermisoCopiarEmpaque));
			this.jButtonVerFormEmpaque.setVisible((this.isVisibilidadCeldaVerFormEmpaque && this.isPermisoVerFormEmpaque));
			
			this.jButtonAbrirOrderByEmpaque.setVisible((this.isVisibilidadCeldaOrdenEmpaque && this.isPermisoOrdenEmpaque));			
			
			this.jButtonNuevoRelacionesEmpaque.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpaque && this.isPermisoNuevoEmpaque));			
			this.jButtonNuevoGuardarCambiosEmpaque.setVisible((this.isVisibilidadCeldaNuevoEmpaque && this.isPermisoNuevoEmpaque && this.isPermisoGuardarCambiosEmpaque));
			
			if(this.jInternalFrameDetalleFormEmpaque!=null) {
			this.jInternalFrameDetalleFormEmpaque.jButtonModificarEmpaque.setVisible((this.isVisibilidadCeldaModificarEmpaque && this.isPermisoActualizarEmpaque));	
			this.jInternalFrameDetalleFormEmpaque.jButtonActualizarEmpaque.setVisible((this.isVisibilidadCeldaActualizarEmpaque && this.isPermisoActualizarEmpaque));	
			this.jInternalFrameDetalleFormEmpaque.jButtonEliminarEmpaque.setVisible((this.isVisibilidadCeldaEliminarEmpaque && this.isPermisoEliminarEmpaque));
			this.jInternalFrameDetalleFormEmpaque.jButtonCancelarEmpaque.setVisible(this.isVisibilidadCeldaCancelarEmpaque);							
			this.jInternalFrameDetalleFormEmpaque.jButtonGuardarCambiosEmpaque.setVisible((this.isVisibilidadCeldaGuardarEmpaque && this.isPermisoGuardarCambiosEmpaque));			
			
			}
						
			this.jButtonGuardarCambiosTablaEmpaque.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpaque && this.isPermisoGuardarCambiosEmpaque));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEmpaque.setVisible((this.isVisibilidadCeldaNuevoEmpaque && this.isPermisoNuevoEmpaque));						
			this.jButtonDuplicarToolBarEmpaque.setVisible((this.isVisibilidadCeldaDuplicarEmpaque && this.isPermisoDuplicarEmpaque));						
			this.jButtonCopiarToolBarEmpaque.setVisible((this.isVisibilidadCeldaCopiarEmpaque && this.isPermisoCopiarEmpaque));			
			this.jButtonVerFormToolBarEmpaque.setVisible((this.isVisibilidadCeldaVerFormEmpaque && this.isPermisoVerFormEmpaque));			
			this.jButtonAbrirOrderByToolBarEmpaque.setVisible((this.isVisibilidadCeldaOrdenEmpaque && this.isPermisoOrdenEmpaque));
			this.jButtonNuevoRelacionesToolBarEmpaque.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpaque && this.isPermisoNuevoEmpaque));			
			this.jButtonNuevoGuardarCambiosToolBarEmpaque.setVisible((this.isVisibilidadCeldaNuevoEmpaque && this.isPermisoNuevoEmpaque && this.isPermisoGuardarCambiosEmpaque));			
			
			if(this.jInternalFrameDetalleFormEmpaque!=null) {
			this.jInternalFrameDetalleFormEmpaque.jButtonModificarToolBarEmpaque.setVisible((this.isVisibilidadCeldaModificarEmpaque && this.isPermisoActualizarEmpaque));	
			this.jInternalFrameDetalleFormEmpaque.jButtonActualizarToolBarEmpaque.setVisible((this.isVisibilidadCeldaActualizarEmpaque  && this.isPermisoActualizarEmpaque));	
			this.jInternalFrameDetalleFormEmpaque.jButtonEliminarToolBarEmpaque.setVisible((this.isVisibilidadCeldaEliminarEmpaque && this.isPermisoEliminarEmpaque));
			this.jInternalFrameDetalleFormEmpaque.jButtonCancelarToolBarEmpaque.setVisible(this.isVisibilidadCeldaCancelarEmpaque);				
			this.jInternalFrameDetalleFormEmpaque.jButtonGuardarCambiosToolBarEmpaque.setVisible((this.isVisibilidadCeldaGuardarEmpaque && this.isPermisoGuardarCambiosEmpaque));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEmpaque.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpaque && this.isPermisoGuardarCambiosEmpaque));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEmpaque.setVisible((this.isVisibilidadCeldaNuevoEmpaque && this.isPermisoNuevoEmpaque));			
			this.jMenuItemDuplicarEmpaque.setVisible((this.isVisibilidadCeldaDuplicarEmpaque && this.isPermisoDuplicarEmpaque));			
			this.jMenuItemCopiarEmpaque.setVisible((this.isVisibilidadCeldaCopiarEmpaque && this.isPermisoCopiarEmpaque));			
			this.jMenuItemVerFormEmpaque.setVisible((this.isVisibilidadCeldaVerFormEmpaque && this.isPermisoVerFormEmpaque));			
			this.jMenuItemAbrirOrderByEmpaque.setVisible((this.isVisibilidadCeldaOrdenEmpaque && this.isPermisoOrdenEmpaque));			
			//this.jMenuItemMostrarOcultarEmpaque.setVisible((this.isVisibilidadCeldaOrdenEmpaque && this.isPermisoOrdenEmpaque));
			this.jMenuItemDetalleAbrirOrderByEmpaque.setVisible((this.isVisibilidadCeldaOrdenEmpaque && this.isPermisoOrdenEmpaque));			
			//this.jMenuItemDetalleMostrarOcultarEmpaque.setVisible((this.isVisibilidadCeldaOrdenEmpaque && this.isPermisoOrdenEmpaque));			
			this.jMenuItemNuevoRelacionesEmpaque.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpaque && this.isPermisoNuevoEmpaque));			
			this.jMenuItemNuevoGuardarCambiosEmpaque.setVisible((this.isVisibilidadCeldaNuevoEmpaque && this.isPermisoNuevoEmpaque && this.isPermisoGuardarCambiosEmpaque));									
			
			if(this.jInternalFrameDetalleFormEmpaque!=null) {
			this.jInternalFrameDetalleFormEmpaque.jMenuItemModificarEmpaque.setVisible((this.isVisibilidadCeldaModificarEmpaque && this.isPermisoActualizarEmpaque));	
			this.jInternalFrameDetalleFormEmpaque.jMenuItemActualizarEmpaque.setVisible((this.isVisibilidadCeldaActualizarEmpaque && this.isPermisoActualizarEmpaque));	
			this.jInternalFrameDetalleFormEmpaque.jMenuItemEliminarEmpaque.setVisible((this.isVisibilidadCeldaEliminarEmpaque && this.isPermisoEliminarEmpaque));
			this.jInternalFrameDetalleFormEmpaque.jMenuItemCancelarEmpaque.setVisible(this.isVisibilidadCeldaCancelarEmpaque);				
			}
			
			this.jMenuItemGuardarCambiosEmpaque.setVisible((this.isVisibilidadCeldaGuardarEmpaque && this.isPermisoGuardarCambiosEmpaque));						
			this.jMenuItemGuardarCambiosTablaEmpaque.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpaque && this.isPermisoGuardarCambiosEmpaque));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEmpaque=this.jButtonNuevoEmpaque.isVisible();
			this.isVisibilidadCeldaDuplicarEmpaque=this.jButtonDuplicarEmpaque.isVisible();
			this.isVisibilidadCeldaCopiarEmpaque=this.jButtonCopiarEmpaque.isVisible();
			this.isVisibilidadCeldaVerFormEmpaque=this.jButtonVerFormEmpaque.isVisible();
			
			this.isVisibilidadCeldaOrdenEmpaque=this.jButtonAbrirOrderByEmpaque.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEmpaque=this.jButtonNuevoRelacionesEmpaque.isVisible();
			this.isVisibilidadCeldaModificarEmpaque=this.jButtonModificarEmpaque.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpaque!=null) {
			this.isVisibilidadCeldaActualizarEmpaque=this.jInternalFrameDetalleFormEmpaque.jButtonActualizarEmpaque.isVisible();
			this.isVisibilidadCeldaEliminarEmpaque=this.jInternalFrameDetalleFormEmpaque.jButtonEliminarEmpaque.isVisible();
			this.isVisibilidadCeldaCancelarEmpaque=this.jInternalFrameDetalleFormEmpaque.jButtonCancelarEmpaque.isVisible();
			this.isVisibilidadCeldaGuardarEmpaque=this.jInternalFrameDetalleFormEmpaque.jButtonGuardarCambiosEmpaque.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEmpaque=this.jButtonGuardarCambiosTablaEmpaque.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEmpaque=this.jButtonNuevoToolBarEmpaque.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpaque=this.jButtonNuevoRelacionesToolBarEmpaque.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpaque!=null) {
			this.isVisibilidadCeldaModificarEmpaque=this.jInternalFrameDetalleFormEmpaque.jButtonModificarToolBarEmpaque.isVisible();
			this.isVisibilidadCeldaActualizarEmpaque=this.jInternalFrameDetalleFormEmpaque.jButtonActualizarToolBarEmpaque.isVisible();
			this.isVisibilidadCeldaEliminarEmpaque=this.jInternalFrameDetalleFormEmpaque.jButtonEliminarToolBarEmpaque.isVisible();
			this.isVisibilidadCeldaCancelarEmpaque=this.jInternalFrameDetalleFormEmpaque.jButtonCancelarToolBarEmpaque.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpaque=this.jButtonGuardarCambiosToolBarEmpaque.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpaque=this.jButtonGuardarCambiosTablaToolBarEmpaque.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEmpaque=this.jMenuItemNuevoEmpaque.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpaque=this.jMenuItemNuevoRelacionesEmpaque.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpaque!=null) {
			this.isVisibilidadCeldaModificarEmpaque=this.jInternalFrameDetalleFormEmpaque.jMenuItemModificarEmpaque.isVisible();
			this.isVisibilidadCeldaActualizarEmpaque=this.jInternalFrameDetalleFormEmpaque.jMenuItemActualizarEmpaque.isVisible();
			this.isVisibilidadCeldaEliminarEmpaque=this.jInternalFrameDetalleFormEmpaque.jMenuItemEliminarEmpaque.isVisible();
			this.isVisibilidadCeldaCancelarEmpaque=this.jInternalFrameDetalleFormEmpaque.jMenuItemCancelarEmpaque.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpaque=this.jMenuItemGuardarCambiosEmpaque.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpaque=this.jMenuItemGuardarCambiosTablaEmpaque.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEmpaque(Boolean esInicializar) {
		if(EmpaqueJInternalFrame.ISBINDING_MANUAL) {			
			if(this.empaqueSessionBean.getConGuardarRelaciones()) {
				//if(this.empaqueSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEmpaque();
			}
			
			this.inicializarActualizarBindingBotonesManualEmpaque(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEmpaque() {
		this.jButtonNuevoEmpaque.setVisible(this.isPermisoNuevoEmpaque);			
		this.jButtonDuplicarEmpaque.setVisible(this.isPermisoDuplicarEmpaque);			
		this.jButtonCopiarEmpaque.setVisible(this.isPermisoCopiarEmpaque);			
		this.jButtonVerFormEmpaque.setVisible(this.isPermisoVerFormEmpaque);			
		
		this.jButtonAbrirOrderByEmpaque.setVisible(this.isPermisoOrdenEmpaque);					
		
		this.jButtonNuevoRelacionesEmpaque.setVisible(this.isPermisoNuevoEmpaque);			
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpaque.jButtonModificarEmpaque.setVisible(this.isPermisoActualizarEmpaque);	
			this.jInternalFrameDetalleFormEmpaque.jButtonActualizarEmpaque.setVisible(this.isPermisoActualizarEmpaque);	
			this.jInternalFrameDetalleFormEmpaque.jButtonEliminarEmpaque.setVisible(this.isPermisoEliminarEmpaque);
			this.jInternalFrameDetalleFormEmpaque.jButtonCancelarEmpaque.setVisible(this.isVisibilidadCeldaCancelarEmpaque);						
			this.jInternalFrameDetalleFormEmpaque.jButtonGuardarCambiosEmpaque.setVisible(this.isPermisoGuardarCambiosEmpaque);							
		}
		
		this.jButtonGuardarCambiosTablaEmpaque.setVisible(this.isPermisoActualizarEmpaque);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpaque() {
		this.jInternalFrameDetalleFormEmpaque.jButtonModificarEmpaque.setVisible(this.isPermisoActualizarEmpaque);	
		this.jInternalFrameDetalleFormEmpaque.jButtonActualizarEmpaque.setVisible(this.isPermisoActualizarEmpaque);	
		this.jInternalFrameDetalleFormEmpaque.jButtonEliminarEmpaque.setVisible(this.isPermisoEliminarEmpaque);
		this.jInternalFrameDetalleFormEmpaque.jButtonCancelarEmpaque.setVisible(this.isVisibilidadCeldaCancelarEmpaque);							
		this.jInternalFrameDetalleFormEmpaque.jButtonGuardarCambiosEmpaque.setVisible((this.isVisibilidadCeldaGuardarEmpaque && this.isPermisoGuardarCambiosEmpaque));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEmpaque() {
		if(EmpaqueJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEmpaque();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEmpaque() {
	}
	
	public void jTableDatosEmpaqueListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEmpaque(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEmpaqueBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpaque(this.getempaque(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empaque =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empaque =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empaque==null) {
						this.empaque = new Empaque();
					}

					this.setVariablesFormularioToObjetoActualEmpaque(this.empaque,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);
				}

				if(this.empaque.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.empaque.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpaque(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEmpaqueUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEmpaque(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpaque.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpaque.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaque =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empaque =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpaque(this.getempaque(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.empaqueLogic.getConnexion());

				if(this.empaque.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.empaque.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpaque=(TitledBorder)this.jScrollPanelDatosEmpaque.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEmpaque.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEmpaqueBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpaque(this.getempaque(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empaque =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empaque =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empaque==null) {
						this.empaque = new Empaque();
					}

					this.setVariablesFormularioToObjetoActualEmpaque(this.empaque,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);
				}

				if(this.empaque.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.empaque.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpaque(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorEmpaqueBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpaque(this.getempaque(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empaque =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empaque =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empaque==null) {
						this.empaque = new Empaque();
					}

					this.setVariablesFormularioToObjetoActualEmpaque(this.empaque,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);
				}

				if(this.empaque.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.empaque.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpaque(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionEmpaqueBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpaque(this.getempaque(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empaque =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empaque =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empaque==null) {
						this.empaque = new Empaque();
					}

					this.setVariablesFormularioToObjetoActualEmpaque(this.empaque,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);
				}

				if(this.empaque.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.empaque.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpaque(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaEmpaqueActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpaque(false,false);

			this.getEmpaquesFK_IdEmpresa();

			this.inicializarActualizarBindingEmpaque(false);

			//if(EmpaqueBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpaque(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empaqueLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEmpaque() {
		if(this.jInternalFrameDetalleFormEmpaque!=null) {
		

		if(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) {
			this.jInternalFrameDetalleFormEmpaque.setVisible(false);	    			
			this.jInternalFrameDetalleFormEmpaque.dispose();
			this.jInternalFrameDetalleFormEmpaque=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEmpaque!=null) {
			this.jInternalFrameReporteDinamicoEmpaque.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEmpaque.dispose();
			this.jInternalFrameReporteDinamicoEmpaque=null;
		}
		
		if(this.jInternalFrameImportacionEmpaque!=null) {
			this.jInternalFrameImportacionEmpaque.setVisible(false);	    			
			this.jInternalFrameImportacionEmpaque.dispose();
			this.jInternalFrameImportacionEmpaque=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEmpaque();
			
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
			
			
			if(sTipo.equals("NuevoEmpaque")) {
				jButtonNuevoEmpaqueActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEmpaque")) {
				jButtonDuplicarEmpaqueActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEmpaque")) {
				jButtonCopiarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("VerFormEmpaque")) {
				jButtonVerFormEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEmpaque")) {
				jButtonNuevoEmpaqueActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEmpaque")) {
				jButtonDuplicarEmpaqueActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEmpaque")) {
				jButtonNuevoEmpaqueActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEmpaque")) {
				jButtonDuplicarEmpaqueActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEmpaque")) {
				jButtonNuevoEmpaqueActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEmpaque")) {
				jButtonNuevoEmpaqueActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEmpaque")) {
				jButtonNuevoEmpaqueActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEmpaque")) {
				jButtonModificarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEmpaque")) {
				jButtonModificarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEmpaque")) {
				jButtonModificarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEmpaque")) {
				jButtonActualizarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEmpaque")) {
				jButtonActualizarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEmpaque")) {
				jButtonActualizarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("EliminarEmpaque")) {
				jButtonEliminarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEmpaque")) {
				jButtonEliminarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEmpaque")) {
				jButtonEliminarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("CancelarEmpaque")) {
				jButtonCancelarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEmpaque")) {
				jButtonCancelarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEmpaque")) {
				jButtonCancelarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("CerrarEmpaque")) {
				jButtonCerrarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEmpaque")) {
				jButtonCerrarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEmpaque")) {
				jButtonCerrarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEmpaque")) {
				jButtonMostrarOcultarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEmpaque")) {
				jButtonCancelarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEmpaque")) {
				jButtonGuardarCambiosEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEmpaque")) {
				jButtonGuardarCambiosEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEmpaque")) {
				jButtonCopiarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEmpaque")) {
				jButtonVerFormEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEmpaque")) {
				jButtonGuardarCambiosEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEmpaque")) {
				jButtonCopiarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEmpaque")) {
				jButtonVerFormEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEmpaque")) {
				jButtonGuardarCambiosEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEmpaque")) {
				jButtonGuardarCambiosEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEmpaque")) {
				jButtonGuardarCambiosEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEmpaque")) {
				jButtonRecargarInformacionEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEmpaque")) {
				jButtonRecargarInformacionEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEmpaque")) {
				jButtonRecargarInformacionEmpaqueActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEmpaque")) {
				jButtonAnterioresEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEmpaque")) {
				jButtonAnterioresEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEmpaque")) {
				jButtonAnterioresEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEmpaque")) {
				jButtonSiguientesEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEmpaque")) {
				jButtonSiguientesEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEmpaque")) {
				jButtonSiguientesEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEmpaque") || sTipo.equals("MenuItemDetalleAbrirOrderByEmpaque")) {
				jButtonAbrirOrderByEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEmpaque") || sTipo.equals("MenuItemDetalleMostrarOcultarEmpaque")) {
				jButtonMostrarOcultarEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEmpaque")) {
				jButtonNuevoGuardarCambiosEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEmpaque")) {
				jButtonNuevoGuardarCambiosEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEmpaque")) {
				jButtonNuevoGuardarCambiosEmpaqueActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEmpaque")) {
				jButtonCerrarReporteDinamicoEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEmpaque")) {
				jButtonGenerarReporteDinamicoEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEmpaque")) {
				
				jButtonGenerarExcelReporteDinamicoEmpaqueActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEmpaque")) {
				jButtonCerrarImportacionEmpaqueActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEmpaque")) {
				
				jButtonGenerarImportacionEmpaqueActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEmpaque")) {
				
				jButtonAbrirImportacionEmpaqueActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEmpaque")) {
				jComboBoxTiposAccionesEmpaqueActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEmpaque")) {
				jComboBoxTiposRelacionesEmpaqueActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEmpaque")) {
				jComboBoxTiposAccionesEmpaqueActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEmpaque")) {
				
				jComboBoxTiposSeleccionarEmpaqueActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEmpaque")) {
				jTextFieldValorCampoGeneralEmpaqueActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEmpaque")) {
				jButtonAbrirOrderByEmpaqueActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEmpaque")) {
				jButtonAbrirOrderByEmpaqueActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEmpaque")) {
				jButtonCerrarOrderByEmpaqueActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpaqueBusqueda")) {
				this.jButtonidEmpaqueBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpaqueUpdate")) {
				this.jButtonid_empresaEmpaqueUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpaqueBusqueda")) {
				this.jButtonid_empresaEmpaqueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorEmpaqueBusqueda")) {
				this.jButtonvalorEmpaqueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEmpaqueBusqueda")) {
				this.jButtondescripcionEmpaqueBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEmpaque();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpaqueActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empaque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empaque);
				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
				
				


				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empaque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empaque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Empaque empaqueLocal=null;
			
			if(!this.getEsControlTabla()) {
				empaqueLocal=this.empaque;
			} else {
				empaqueLocal=this.empaqueAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empaque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empaque);
				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
							
				
				


				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empaque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empaque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpaqueActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueAnterior =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empaqueAnterior =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
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
			
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
			
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
			
			


			
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpaqueActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empaque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empaque);
				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
								
						
				


				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empaque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empaque.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empaque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empaque);
				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
								
				
				


				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empaque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empaque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpaqueActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueAnterior =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empaqueAnterior =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empaque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empaque);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpaqueActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueAnterior =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empaqueAnterior =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpaqueActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empaque);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empaque);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empaque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empaque);
				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
							
				
				


				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empaque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empaque.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpaqueActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empaqueAnterior =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empaqueAnterior =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
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
			
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
			
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
			
			


			
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpaqueActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empaque);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empaque);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empaque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empaque);
				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
								
				
				


				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empaque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empaque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpaqueActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueAnterior =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empaqueAnterior =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpaqueActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empaque);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empaque);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpaqueActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empaque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empaque);
				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEmpaque")) {
					jCheckBoxSeleccionarTodosEmpaqueItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEmpaque")) {
					jCheckBoxSeleccionadosEmpaqueItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEmpaque")) {
					
				}
				
				


				
				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empaque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empaque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.empaque);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.empaque);
				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
												
				
				


				
				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empaque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empaque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpaqueActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empaqueAnterior =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empaqueAnterior =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpaqueActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empaque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empaque);
				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
				
				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
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
			
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
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
			
			


			
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpaqueActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empaque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empaque);
				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empaque.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empaque.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empaque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empaque);
				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
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
				
				


				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empaque.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empaque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpaqueActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empaqueAnterior =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empaqueAnterior =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEmpaque")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEmpaqueListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEmpaque.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.empaque =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.empaque =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.empaque);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEmpaque")) {
				
				}
				
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEmpaque")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEmpaque.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEmpaque")) {
			
			}
			
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEmpaque();
			
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
			
			if(sTipo.equals("NuevoEmpaque")) {
				jButtonNuevoEmpaqueActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEmpaque")) {
				jButtonDuplicarEmpaqueActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEmpaque")) {
				jButtonCopiarEmpaqueActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEmpaque")) {
				jButtonVerFormEmpaqueActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEmpaque")) {
				jButtonNuevoEmpaqueActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEmpaque")) {
				jButtonModificarEmpaqueActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEmpaque")) {
				jButtonActualizarEmpaqueActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEmpaque")) {
				jButtonEliminarEmpaqueActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEmpaque")) {
				jButtonGuardarCambiosEmpaqueActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEmpaque")) {
				jButtonCancelarEmpaqueActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEmpaque")) {
				jButtonCerrarEmpaqueActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEmpaque")) {
				jButtonGuardarCambiosEmpaqueActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEmpaque")) {
				jButtonNuevoGuardarCambiosEmpaqueActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEmpaque")) {
				jButtonAbrirOrderByEmpaqueActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEmpaque")) {
				jButtonRecargarInformacionEmpaqueActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEmpaque")) {
				jButtonAnterioresEmpaqueActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEmpaque")) {
				jButtonSiguientesEmpaqueActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpaqueBusqueda")) {
				this.jButtonidEmpaqueBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpaqueUpdate")) {
				this.jButtonid_empresaEmpaqueUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpaqueBusqueda")) {
				this.jButtonid_empresaEmpaqueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorEmpaqueBusqueda")) {
				this.jButtonvalorEmpaqueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEmpaqueBusqueda")) {
				this.jButtondescripcionEmpaqueBusquedaActionPerformed(evt);
			}
			
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEmpaque();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEmpaque")) {
				closingInternalFrameEmpaque();
				
			} else if(sTipo.equals("jButtonCancelarEmpaque")) {
				JInternalFrameBase jInternalFrameDetalleFormEmpaque = (JInternalFrameBase)evt.getSource();
	            	
	            EmpaqueBeanSwingJInternalFrame jInternalFrameParent=(EmpaqueBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpaque.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEmpaqueActionPerformed(null);
			}
			
			EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empaque,new Object(),this.empaqueParameterGeneral,this.empaqueReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEmpaque(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEmpaque(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEmpaque(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.empaque)) {
			if(!esControlTabla) {
				if(EmpaqueJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEmpaque(this.empaque,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);			
				}
				
				if(this.empaqueSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEmpaque(this.empaque,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empaqueReturnGeneral=empaqueLogic.procesarEventosEmpaquesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empaqueLogic.getEmpaques(),this.empaque,this.empaqueParameterGeneral,this.isEsNuevoEmpaque,classes);//this.empaqueLogic.getEmpaque()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEmpaque(this.empaqueReturnGeneral,this.empaqueBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.empaqueSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEmpaque(classes,this.empaqueReturnGeneral,this.empaqueBean,false);
					}
						
					if(this.empaqueReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEmpaque(this.empaqueReturnGeneral.getEmpaque());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEmpaque(this.empaqueReturnGeneral.getEmpaque());	
					}
						
					if(this.empaqueReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEmpaque(this.empaqueReturnGeneral.getEmpaque(),classes);//this.empaqueBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEmpaque(this.empaque,classes);//this.empaqueBean);									
				}
			
				if(EmpaqueJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEmpaque(this.empaque,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpaque(this.empaque);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.empaqueAnterior!=null) {
						this.empaque=this.empaqueAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empaqueReturnGeneral=empaqueLogic.procesarEventosEmpaquesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empaqueLogic.getEmpaques(),this.empaque,this.empaqueParameterGeneral,this.isEsNuevoEmpaque,classes);//this.empaqueLogic.getEmpaque()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empaqueSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empaqueSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.empaqueReturnGeneral.getEmpaque(),empaqueLogic.getEmpaques());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.empaqueReturnGeneral.getEmpaque(),this.empaques);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEmpaque.repaint();
				
				//((AbstractTableModel) this.jTableDatosEmpaque.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEmpaque();
			}
		}
	}
	
	public void actualizarVisualTableDatosEmpaque() throws Exception {
		
		EmpaqueModel empaqueModel=(EmpaqueModel)this.jTableDatosEmpaque.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empaqueModel.empaques=this.empaqueLogic.getEmpaques();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			empaqueModel.empaques=this.empaques;
		}
		
		
		((EmpaqueModel) this.jTableDatosEmpaque.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEmpaque() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getempaqueAnterior(),this.empaqueLogic.getEmpaques());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getempaqueAnterior(),this.empaques);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEmpaque();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEmpaque(Empaque empaque,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetaNotaCreditoSoli.class)) {
					this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.setDetaNotaCreditoSolis(empaque.getDetaNotaCreditoSolis());
					this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetaNotaCreditoSoli(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleProforma.class)) {
					this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.setDetalleProformas(empaque.getDetalleProformas());
					this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleProforma(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
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
										
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empaque,new Object(),generalEntityParameterGeneral,this.empaqueReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.empaqueSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EmpaqueConstantesFunciones.getClassesRelationshipsOfEmpaque(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EmpaqueConstantesFunciones.getClassesRelationshipsFromStringsOfEmpaque(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEmpaque(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EmpaqueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empaque,new Object(),generalEntityParameterGeneral,this.empaqueReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEmpaque(EmpaqueBean empaqueBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetaNotaCreditoSoli.class)) {
					this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.setDetaNotaCreditoSolis(empaque.getDetaNotaCreditoSolis());
					this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetaNotaCreditoSoli(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleProforma.class)) {
					this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.setDetalleProformas(empaque.getDetalleProformas());
					this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleProforma(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEmpaque(ArrayList<Classe> classes,EmpaqueReturnGeneral empaqueReturnGeneral,EmpaqueBean empaqueBean,Boolean conDefault) throws Exception {
		
			this.empaqueBean.setDetaNotaCreditoSolis(empaqueReturnGeneral.getEmpaque().getDetaNotaCreditoSolis());
			this.empaqueBean.setDetalleProformas(empaqueReturnGeneral.getEmpaque().getDetalleProformas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEmpaque(Empaque empaque,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetaNotaCreditoSoli.class)) {
					empaque.setDetaNotaCreditoSolis(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleProforma.class)) {
					empaque.setDetalleProformas(this.jInternalFrameDetalleFormEmpaque.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.empaque)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEmpaque = new EmpaqueDetalleFormJInternalFrame(jDesktopPane,this.empaqueSessionBean.getConGuardarRelaciones(),this.empaqueSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpaque);
		this.jInternalFrameDetalleFormEmpaque.setVisible(false);
		this.jInternalFrameDetalleFormEmpaque.setSelected(false);						
		
		this.jInternalFrameDetalleFormEmpaque.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEmpaque.empaqueLogic=this.empaqueLogic;
		
		this.cargarCombosFrameForeignKeyEmpaque("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpaque();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpaque();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEmpaque("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEmpaque();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEmpaque.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpaque"));
		
		this.jInternalFrameDetalleFormEmpaque.jButtonModificarEmpaque.addActionListener(new ButtonActionListener(this,"ModificarEmpaque"));

		
		this.jInternalFrameDetalleFormEmpaque.jButtonModificarToolBarEmpaque.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpaque"));
					
		this.jInternalFrameDetalleFormEmpaque.jMenuItemModificarEmpaque.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpaque"));		
		
		
		
		this.jInternalFrameDetalleFormEmpaque.jButtonActualizarEmpaque.addActionListener (new ButtonActionListener(this,"ActualizarEmpaque"));
		
		
		this.jInternalFrameDetalleFormEmpaque.jButtonActualizarToolBarEmpaque.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpaque"));
						
		this.jInternalFrameDetalleFormEmpaque.jMenuItemActualizarEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpaque"));		
		
		
		
		this.jInternalFrameDetalleFormEmpaque.jButtonEliminarEmpaque.addActionListener (new ButtonActionListener(this,"EliminarEmpaque"));
		
		
		this.jInternalFrameDetalleFormEmpaque.jButtonEliminarToolBarEmpaque.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpaque"));
								
		this.jInternalFrameDetalleFormEmpaque.jMenuItemEliminarEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpaque"));		
		
		
		
		this.jInternalFrameDetalleFormEmpaque.jButtonCancelarEmpaque.addActionListener (new ButtonActionListener(this,"CancelarEmpaque"));
		
		
		this.jInternalFrameDetalleFormEmpaque.jButtonCancelarToolBarEmpaque.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpaque"));
					
		this.jInternalFrameDetalleFormEmpaque.jMenuItemCancelarEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpaque"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEmpaque.jMenuItemDetalleCerrarEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpaque"));		
		
		
		
		this.jInternalFrameDetalleFormEmpaque.jButtonGuardarCambiosToolBarEmpaque.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpaque"));
		
		
		
		this.jInternalFrameDetalleFormEmpaque.jButtonGuardarCambiosToolBarEmpaque.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpaque"));
		
		
		
		this.jInternalFrameDetalleFormEmpaque.jComboBoxTiposAccionesFormularioEmpaque.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpaque"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpaque.jButtonidEmpaqueBusqueda.addActionListener(new ButtonActionListener(this,"idEmpaqueBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpaque.jButtonid_empresaEmpaqueUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpaqueUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpaque.jButtonid_empresaEmpaqueBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpaqueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpaque.jButtonvalorEmpaqueBusqueda.addActionListener(new ButtonActionListener(this,"valorEmpaqueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpaque.jButtondescripcionEmpaqueBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpaqueBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEmpaque.jTabbedPaneRelacionesEmpaque.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpaque"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEmpaque"));
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpaque.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpaque"));
		}
		
		this.jTableDatosEmpaque.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEmpaque"));
		
		this.jTableDatosEmpaque.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEmpaque"));
		
		this.jButtonNuevoEmpaque.addActionListener(new ButtonActionListener(this,"NuevoEmpaque"));
		
		this.jButtonDuplicarEmpaque.addActionListener(new ButtonActionListener(this,"DuplicarEmpaque"));
		
		this.jButtonCopiarEmpaque.addActionListener(new ButtonActionListener(this,"CopiarEmpaque"));
		
		this.jButtonVerFormEmpaque.addActionListener(new ButtonActionListener(this,"VerFormEmpaque"));
		
		
		this.jButtonNuevoToolBarEmpaque.addActionListener(new ButtonActionListener(this,"NuevoToolBarEmpaque"));
			
		this.jButtonDuplicarToolBarEmpaque.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEmpaque"));
			
		this.jMenuItemNuevoEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEmpaque"));
			
		this.jMenuItemDuplicarEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEmpaque"));		
		
		
		this.jButtonNuevoRelacionesEmpaque.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEmpaque"));
		
		
		this.jButtonNuevoRelacionesToolBarEmpaque.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEmpaque"));
			
		this.jMenuItemNuevoRelacionesEmpaque.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEmpaque"));		
		
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpaque.jButtonModificarEmpaque.addActionListener(new ButtonActionListener(this,"ModificarEmpaque"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpaque.jButtonModificarToolBarEmpaque.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpaque"));
			
			this.jInternalFrameDetalleFormEmpaque.jMenuItemModificarEmpaque.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpaque"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEmpaque.jButtonActualizarEmpaque.addActionListener (new ButtonActionListener(this,"ActualizarEmpaque"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpaque.jButtonActualizarToolBarEmpaque.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpaque"));
				
			this.jInternalFrameDetalleFormEmpaque.jMenuItemActualizarEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpaque"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpaque.jButtonEliminarEmpaque.addActionListener (new ButtonActionListener(this,"EliminarEmpaque"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpaque.jButtonEliminarToolBarEmpaque.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpaque"));
						
			this.jInternalFrameDetalleFormEmpaque.jMenuItemEliminarEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpaque"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpaque.jButtonCancelarEmpaque.addActionListener (new ButtonActionListener(this,"CancelarEmpaque"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpaque.jButtonCancelarToolBarEmpaque.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpaque"));
			
			this.jInternalFrameDetalleFormEmpaque.jMenuItemCancelarEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpaque"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEmpaque.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEmpaque"));		
		
		
		this.jButtonCerrarEmpaque.addActionListener (new ButtonActionListener(this,"CerrarEmpaque"));
		
		
		this.jButtonCerrarToolBarEmpaque.addActionListener (new ButtonActionListener(this,"CerrarToolBarEmpaque"));
			
		this.jMenuItemCerrarEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEmpaque"));
			
		if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpaque.jMenuItemDetalleCerrarEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpaque"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpaque.jButtonGuardarCambiosEmpaque.addActionListener (new ButtonActionListener(this,"GuardarCambiosEmpaque"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpaque.jButtonGuardarCambiosToolBarEmpaque.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpaque"));
		}
		
		this.jButtonCopiarToolBarEmpaque.addActionListener (new ButtonActionListener(this,"CopiarToolBarEmpaque"));
			
		this.jButtonVerFormToolBarEmpaque.addActionListener (new ButtonActionListener(this,"VerFormToolBarEmpaque"));
		
		this.jMenuItemGuardarCambiosEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEmpaque"));
			
		this.jMenuItemCopiarEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEmpaque"));		
		
		this.jMenuItemVerFormEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEmpaque"));		
		
		
		this.jButtonGuardarCambiosTablaEmpaque.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpaque"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpaque.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEmpaque"));
			
		this.jMenuItemGuardarCambiosTablaEmpaque.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpaque"));		
		
		
		
		this.jButtonRecargarInformacionEmpaque.addActionListener (new ButtonActionListener(this,"RecargarInformacionEmpaque"));
					
		this.jButtonRecargarInformacionToolBarEmpaque.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEmpaque"));
		
		this.jMenuItemRecargarInformacionEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEmpaque"));		
		
		
		
		this.jButtonAnterioresEmpaque.addActionListener (new ButtonActionListener(this,"AnterioresEmpaque"));
		
		
		this.jButtonAnterioresToolBarEmpaque.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEmpaque"));
		
		this.jMenuItemAnterioresEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEmpaque"));		
		
		
		this.jButtonSiguientesEmpaque.addActionListener (new ButtonActionListener(this,"SiguientesEmpaque"));
		
		
		this.jButtonSiguientesToolBarEmpaque.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEmpaque"));
			
		this.jMenuItemSiguientesEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEmpaque"));
			
		this.jMenuItemAbrirOrderByEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEmpaque"));
			
		this.jMenuItemMostrarOcultarEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEmpaque"));
			
		this.jMenuItemDetalleAbrirOrderByEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEmpaque"));
			
		this.jMenuItemDetalleMostarOcultarEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEmpaque"));		
		
		
		this.jButtonNuevoGuardarCambiosEmpaque.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEmpaque"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpaque.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEmpaque"));
			
		this.jMenuItemNuevoGuardarCambiosEmpaque.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEmpaque"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEmpaque.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEmpaque"));

		this.jCheckBoxSeleccionadosEmpaque.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEmpaque"));
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpaque.jComboBoxTiposAccionesFormularioEmpaque.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpaque"));
		}
		
		
		this.jComboBoxTiposRelacionesEmpaque.addActionListener (new ButtonActionListener(this,"TiposRelacionesEmpaque"));
			
		this.jComboBoxTiposAccionesEmpaque.addActionListener (new ButtonActionListener(this,"TiposAccionesEmpaque"));
					
		this.jComboBoxTiposSeleccionarEmpaque.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEmpaque"));
			
		this.jTextFieldValorCampoGeneralEmpaque.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEmpaque"));		
		
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpaque.jButtonidEmpaqueBusqueda.addActionListener(new ButtonActionListener(this,"idEmpaqueBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpaque.jButtonid_empresaEmpaqueUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpaqueUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpaque.jButtonid_empresaEmpaqueBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpaqueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpaque.jButtonvalorEmpaqueBusqueda.addActionListener(new ButtonActionListener(this,"valorEmpaqueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpaque.jButtondescripcionEmpaqueBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpaqueBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEmpaque!=null) {
				this.jInternalFrameReporteDinamicoEmpaque.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpaque"));
				this.jInternalFrameReporteDinamicoEmpaque.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpaque"));
				this.jInternalFrameReporteDinamicoEmpaque.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpaque"));
			}
			
			//this.jButtonCerrarReporteDinamicoEmpaque.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpaque"));				
			//this.jButtonGenerarReporteDinamicoEmpaque.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpaque"));
			//this.jButtonGenerarExcelReporteDinamicoEmpaque.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpaque"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEmpaque!=null) {
				this.jInternalFrameImportacionEmpaque.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpaque"));
				this.jInternalFrameImportacionEmpaque.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpaque"));
				this.jInternalFrameImportacionEmpaque.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpaque"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEmpaque.addActionListener (new ButtonActionListener(this,"AbrirOrderByEmpaque"));
			
			this.jButtonAbrirOrderByToolBarEmpaque.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEmpaque"));			
			
			if(this.jInternalFrameOrderByEmpaque!=null) {
				this.jInternalFrameOrderByEmpaque.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpaque"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEmpaque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpaque.jTabbedPaneRelacionesEmpaque.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpaque"));
		
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
            		closingInternalFrameEmpaque();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEmpaque.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEmpaque = (JInternalFrameBase)event.getSource();
	            	
	            EmpaqueBeanSwingJInternalFrame jInternalFrameParent=(EmpaqueBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpaque.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEmpaqueActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEmpaque.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEmpaqueListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEmpaque.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEmpaque.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpaqueActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpaqueActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpaqueActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEmpaque";
		inputMap = this.jButtonNuevoEmpaque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEmpaque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpaqueActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpaqueActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpaqueActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpaqueActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEmpaque";
		inputMap = this.jButtonNuevoRelacionesEmpaque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEmpaque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpaqueActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEmpaque";
		inputMap = this.jButtonModificarEmpaque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEmpaque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEmpaqueActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEmpaque";
		inputMap = this.jButtonActualizarEmpaque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEmpaque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEmpaqueActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEmpaque";
		inputMap = this.jButtonEliminarEmpaque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEmpaque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEmpaqueActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEmpaque";
		inputMap = this.jButtonCancelarEmpaque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEmpaque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEmpaqueActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEmpaque";
		inputMap = this.jButtonCerrarEmpaque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEmpaque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEmpaqueActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEmpaque.jButtonGuardarCambiosEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEmpaque";
		inputMap = this.jInternalFrameDetalleFormEmpaque.jButtonGuardarCambiosEmpaque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEmpaque.jButtonGuardarCambiosEmpaque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEmpaqueActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEmpaque.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEmpaqueItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEmpaque.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEmpaqueActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEmpaque.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEmpaqueActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEmpaque.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEmpaqueActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpaque.jButtonidEmpaqueBusqueda.addActionListener(new ButtonActionListener(this,"idEmpaqueBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpaque.jButtonid_empresaEmpaqueUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpaqueUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpaque.jButtonid_empresaEmpaqueBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpaqueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpaque.jButtonvalorEmpaqueBusqueda.addActionListener(new ButtonActionListener(this,"valorEmpaqueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpaque.jButtondescripcionEmpaqueBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpaqueBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEmpaque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEmpaqueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEmpaqueActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEmpaque.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEmpaque(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Empaque empaqueAux:this.empaqueLogic.getEmpaques()) {
					empaqueAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Empaque empaqueAux:empaques) {
					empaqueAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEmpaqueItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpaque(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Empaque empaqueAux:this.empaqueLogic.getEmpaques()) {
						empaqueAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Empaque empaqueAux:empaques) {
						empaqueAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Empaque empaqueAux:this.empaqueLogic.getEmpaques()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Empaque empaqueAux:empaques) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEmpaque(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpaque.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpaque.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpaque,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEmpaqueItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpaque(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEmpaque.getSelectedRows();
			
			Empaque empaqueLocal=new Empaque();
			
			//this.seleccionarTodosEmpaque(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empaqueLocal =(Empaque) this.empaqueLogic.getEmpaques().toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					empaqueLocal =(Empaque) this.empaques.toArray()[this.jTableDatosEmpaque.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				empaqueLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Empaque empaqueAux:this.empaqueLogic.getEmpaques()) {
						empaqueAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Empaque empaqueAux:empaques) {
						empaqueAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEmpaque(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpaque.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpaque.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpaque,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEmpaqueItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEmpaqueParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEmpaqueActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEmpaque(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEmpaque.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Empaque empaqueAux:this.empaqueLogic.getEmpaques()) {
				
						if(sTipoSeleccionar.equals(EmpaqueConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							empaqueAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpaqueConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							empaqueAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Empaque empaqueAux:empaques) {
					
						if(sTipoSeleccionar.equals(EmpaqueConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							empaqueAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpaqueConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							empaqueAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEmpaque(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEmpaqueActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEmpaque(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEmpaque=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEmpaque.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEmpaque.jComboBoxTiposAccionesFormularioEmpaque.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEmpaque) {				
					conSplash=true;//false;										
					
					//this.startProcessEmpaque(conSplash);
				
					this.generarReporteEmpaquesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpaque.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpaque.jComboBoxTiposAccionesFormularioEmpaque.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEmpaquesSeleccionados();
				//this.jComboBoxTiposAccionesEmpaque.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpaquesSeleccionados(false);
				//this.jComboBoxTiposAccionesEmpaque.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpaquesSeleccionados(true);
				//this.jComboBoxTiposAccionesEmpaque.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpaque();
				
				this.exportarEmpaquesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpaque.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpaque.jComboBoxTiposAccionesFormularioEmpaque.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEmpaques();
				//this.importarEmpaques();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpaque.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpaque.jComboBoxTiposAccionesFormularioEmpaque.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpaque();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEmpaquesSeleccionados();
				//this.jComboBoxTiposAccionesEmpaque.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Empaque", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEmpaque();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEmpaque)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEmpaque(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Empaque",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpaque.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpaque.jComboBoxTiposAccionesFormularioEmpaque.setSelectedIndex(0);					
				}	
			} 			
			else if(EmpaqueBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEmpaque) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEmpaque(conSplash);
					
						//this.actualizarParametrosGeneralEmpaque();
						
						this.generarReporteProcesoAccionEmpaquesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEmpaque.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEmpaque.jComboBoxTiposAccionesFormularioEmpaque.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EmpaqueBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO EmpaqueS SELECCIONADOS?", "MANTENIMIENTO DE Empaque", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEmpaque();
				
						this.actualizarParametrosGeneralEmpaque();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.empaqueReturnGeneral=empaqueLogic.procesarAccionEmpaquesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.empaqueLogic.getEmpaques(),this.empaqueParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEmpaqueReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpaque.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpaque.jComboBoxTiposAccionesFormularioEmpaque.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEmpaque();
					
					EmpaqueBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEmpaqueReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpaque.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpaque.jComboBoxTiposAccionesFormularioEmpaque.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEmpaque(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEmpaqueActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEmpaque();
			
			if(this.jInternalFrameDetalleFormEmpaque==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Empaque> empaquesSeleccionados=new ArrayList<Empaque>();		
			Empaque empaque=new Empaque();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEmpaque(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEmpaque.getSelectedItem();
			
			
			
			
			empaquesSeleccionados=this.getEmpaquesSeleccionados(true);
			//this.sTipoAccion;
			
			if(empaquesSeleccionados.size()==1) {
				for(Empaque empaqueAux:empaquesSeleccionados) {
					empaque=empaqueAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle  Solicitud Nota Credit")) {
					jButtonDetaNotaCreditoSoliActionPerformed(null,rowIndex,true,false,empaque);
				}
				else if(this.sTipoRelacion.equals("Detalle Proforma")) {
					jButtonDetalleProformaActionPerformed(null,rowIndex,true,false,empaque);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEmpaque();
			
      		//this.finishProcessEmpaque(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEmpaqueReturnGeneral() throws Exception {
		if(this.empaqueReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.empaqueReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.empaqueReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.empaqueReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.empaqueReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.empaqueReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEmpaque(false);
		}
		
		if(this.empaqueReturnGeneral.getConRetornoLista() || this.empaqueReturnGeneral.getConRetornoObjeto()) {
			if(this.empaqueReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empaqueLogic.setEmpaques(this.empaqueReturnGeneral.getEmpaques());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.empaqueReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empaqueLogic.setEmpaque(this.empaqueReturnGeneral.getEmpaque());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEmpaque(false);
		}
	}
	
	public void actualizarParametrosGeneralEmpaque() throws Exception {
		
		
	}
	
	public ArrayList<Empaque> getEmpaquesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Empaque> empaquesSeleccionados=new ArrayList<Empaque>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEmpaque) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Empaque empaqueAux:empaqueLogic.getEmpaques()) {
					if(empaqueAux.getIsSelected()) {
						empaquesSeleccionados.add(empaqueAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Empaque empaqueAux:this.empaques) {
					if(empaqueAux.getIsSelected()) {
						empaquesSeleccionados.add(empaqueAux);				
					}
				}
			}
			
			if(empaquesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						empaquesSeleccionados.addAll(this.empaqueLogic.getEmpaques());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						empaquesSeleccionados.addAll(this.empaques);				
					}
				}
			}
		} else {
			empaquesSeleccionados.add(this.empaque);
		}
		
		return empaquesSeleccionados;
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
	
	public void generarReporteEmpaquesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEmpaquesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEmpaquesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpaquesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpaquesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEmpaquesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Empaque",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEmpaquesSeleccionados() throws Exception {
		ArrayList<Empaque> empaquesSeleccionados=new ArrayList<Empaque>();		
		
		empaquesSeleccionados=this.getEmpaquesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEmpaques("Todos",empaquesSeleccionados);
		
	}	
	
	public void generarReporteNormalEmpaquesSeleccionados() throws Exception {
		ArrayList<Empaque> empaquesSeleccionados=new ArrayList<Empaque>();		
		
		empaquesSeleccionados=this.getEmpaquesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEmpaques("Todos",empaquesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEmpaquesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Empaque> empaquesSeleccionados=new ArrayList<Empaque>();
		
		empaquesSeleccionados=this.getEmpaquesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEmpaques("Todos",empaquesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEmpaquesSeleccionados() throws Exception {
		ArrayList<Empaque> empaquesSeleccionados=new ArrayList<Empaque>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEmpaque();
		
		
		empaquesSeleccionados=this.getEmpaquesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEmpaque();
		
		
		//this.generarReporteEmpaques("Todos",empaquesSeleccionados ,empaqueImplementable,empaqueImplementableHome);
	}
	
	public void mostrarImportacionEmpaques() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEmpaque();
		
		this.abrirFrameImportacionEmpaque();		
		
			
		//this.generarReporteEmpaques("Todos",empaquesSeleccionados ,empaqueImplementable,empaqueImplementableHome);
	}
	
	public void importarEmpaques() throws Exception {		
	
	}
	
	public void exportarEmpaquesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEmpaquesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEmpaquesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEmpaquesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Empaque",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEmpaquesSeleccionados() throws Exception {
		ArrayList<Empaque> empaquesSeleccionados=new ArrayList<Empaque>();		
		
		empaquesSeleccionados=this.getEmpaquesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empaque."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEmpaque(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Empaque empaqueAux:empaquesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEmpaque(empaqueAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//empaqueAux.setsDetalleGeneralEntityReporte(empaqueAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empaqueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empaque",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEmpaque(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EmpaqueConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpaqueConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpaqueConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpaqueConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpaqueConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEmpaque(Empaque empaque,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=empaque.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=empaque.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=empaque.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empaque.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empaque.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEmpaquesSeleccionados() throws Exception {
		ArrayList<Empaque> empaquesSeleccionados=new ArrayList<Empaque>();		
		
		empaquesSeleccionados=this.getEmpaquesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empaque.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Empaques");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEmpaque(row);				
				iRow++;
			}				
			
			for(Empaque empaqueAux:empaquesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEmpaque(empaqueAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empaqueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empaque",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEmpaquesSeleccionados() throws Exception {
		ArrayList<Empaque> empaquesSeleccionados=new ArrayList<Empaque>();		
		
		empaquesSeleccionados=this.getEmpaquesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empaque.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("empaques");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("empaque");
			//elementRoot.appendChild(element);
		
			for(Empaque empaqueAux:empaquesSeleccionados) {
				element = document.createElement("empaque");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEmpaque(empaqueAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empaqueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empaque",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEmpaque(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EmpaqueConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EmpaqueConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EmpaqueConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpaqueConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpaqueConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEmpaque(Empaque empaque,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(empaque.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(empaque.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empaque.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(empaque.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlEmpaque(Empaque empaque,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EmpaqueConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(empaque.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EmpaqueConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(empaque.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EmpaqueConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(empaque.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementvalor = document.createElement(EmpaqueConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(empaque.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementdescripcion = document.createElement(EmpaqueConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(empaque.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoEmpaquesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Empaque> empaquesSeleccionados=new ArrayList<Empaque>();
		
		empaquesSeleccionados=this.getEmpaquesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEmpaque(empaquesSeleccionados);
		
		this.generarReporteEmpaques("Todos",empaquesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEmpaque(ArrayList<Empaque> empaquesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Empaque empaqueAux:empaquesSeleccionados) {
				empaqueAux.setsDetalleGeneralEntityReporte(empaqueAux.toString());
			
				if(sTipoSeleccionar.equals(EmpaqueConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					empaqueAux.setsDescripcionGeneralEntityReporte1(empaqueAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpaqueConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					empaqueAux.setsDescripcionGeneralEntityReporte1(empaqueAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpaqueConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEmpaque(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEmpaque=true;
				this.isVisibilidadCeldaNuevoRelacionesEmpaque=true;
				this.isVisibilidadCeldaGuardarCambiosEmpaque=true;
			}
			
			this.isVisibilidadCeldaModificarEmpaque=false;
			this.isVisibilidadCeldaActualizarEmpaque=false;
			this.isVisibilidadCeldaEliminarEmpaque=false;
			this.isVisibilidadCeldaCancelarEmpaque=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpaque=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpaque=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEmpaque=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpaque=false;
			this.isVisibilidadCeldaGuardarCambiosEmpaque=false;
			this.isVisibilidadCeldaModificarEmpaque=false;
			this.isVisibilidadCeldaActualizarEmpaque=true;
			this.isVisibilidadCeldaEliminarEmpaque=false;
			this.isVisibilidadCeldaCancelarEmpaque=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpaque=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpaque=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEmpaque=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpaque=false;
			this.isVisibilidadCeldaGuardarCambiosEmpaque=false;
			this.isVisibilidadCeldaModificarEmpaque=false;
			this.isVisibilidadCeldaActualizarEmpaque=true;
			this.isVisibilidadCeldaEliminarEmpaque=true;
			this.isVisibilidadCeldaCancelarEmpaque=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpaque=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpaque=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEmpaque=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpaque=false;
			this.isVisibilidadCeldaGuardarCambiosEmpaque=false;
			this.isVisibilidadCeldaModificarEmpaque=false;
			this.isVisibilidadCeldaActualizarEmpaque=true;
			this.isVisibilidadCeldaEliminarEmpaque=false;
			this.isVisibilidadCeldaCancelarEmpaque=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpaque=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpaque=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEmpaque=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpaque=true;
			this.isVisibilidadCeldaGuardarCambiosEmpaque=true;
			this.isVisibilidadCeldaModificarEmpaque=false;
			this.isVisibilidadCeldaActualizarEmpaque=false;
			this.isVisibilidadCeldaEliminarEmpaque=false;
			this.isVisibilidadCeldaCancelarEmpaque=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpaque=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpaque=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEmpaque=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpaque=false;
			this.isVisibilidadCeldaGuardarCambiosEmpaque=false;
			this.isVisibilidadCeldaActualizarEmpaque=false;
			this.isVisibilidadCeldaEliminarEmpaque=false;
			this.isVisibilidadCeldaCancelarEmpaque=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpaque=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpaque=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEmpaque=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpaque=false;
			this.isVisibilidadCeldaGuardarCambiosEmpaque=false;
			this.isVisibilidadCeldaModificarEmpaque=true;
			this.isVisibilidadCeldaActualizarEmpaque=false;
			this.isVisibilidadCeldaEliminarEmpaque=false;
			this.isVisibilidadCeldaCancelarEmpaque=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpaque=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpaque=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EmpaqueJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEmpaque=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpaque=true;
			this.isVisibilidadCeldaGuardarCambiosEmpaque=true;
		} else {
			this.actualizarEstadoPanelsEmpaque(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEmpaque=false;
			//this.isVisibilidadCeldaVerFormEmpaque=false;
			this.isVisibilidadCeldaDuplicarEmpaque=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!empaqueSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEmpaque=false;
		} else {
			this.isVisibilidadCeldaNuevoEmpaque=false;
			this.isVisibilidadCeldaGuardarCambiosEmpaque=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(empaqueSessionBean.getEsGuardarRelacionado()) {
			if(!empaqueSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEmpaque=false;												
			}
			
			this.jButtonCerrarEmpaque.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEmpaque=false;
		}
		
		if(!this.permiteMantenimiento(this.empaque)) {
			this.isVisibilidadCeldaActualizarEmpaque=false;
			this.isVisibilidadCeldaEliminarEmpaque=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEmpaque() {
		this.isVisibilidadCeldaNuevoEmpaque=false;
		this.isVisibilidadCeldaGuardarCambiosEmpaque=false;
	}
	
	public void actualizarEstadoPanelsEmpaque(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEmpaque!=null) {
				this.jScrollPanelDatosEdicionEmpaque.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpaque!=null) {
				this.jTabbedPaneBusquedasEmpaque.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpaque!=null) {
				this.jScrollPanelDatosEmpaque.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpaque!=null) {
				this.jPanelPaginacionEmpaque.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpaque!=null) {
				this.jPanelParametrosReportesEmpaque.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEmpaque!=null) {
				this.jScrollPanelDatosEdicionEmpaque.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpaque!=null) {
				this.jTabbedPaneBusquedasEmpaque.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEmpaque!=null) {
				this.jScrollPanelDatosEmpaque.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpaque!=null) {
				this.jPanelPaginacionEmpaque.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpaque!=null) {
				this.jPanelParametrosReportesEmpaque.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEmpaque!=null) {
				this.jScrollPanelDatosEdicionEmpaque.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpaque!=null) {
				this.jTabbedPaneBusquedasEmpaque.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpaque!=null) {
				this.jScrollPanelDatosEmpaque.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpaque!=null) {
				this.jPanelPaginacionEmpaque.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpaque!=null) {
				this.jPanelParametrosReportesEmpaque.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEmpaque!=null) {
				this.jScrollPanelDatosEdicionEmpaque.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpaque!=null) {
				this.jTabbedPaneBusquedasEmpaque.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpaque!=null) {
				this.jScrollPanelDatosEmpaque.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpaque!=null) {
				this.jPanelPaginacionEmpaque.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpaque!=null) {
				this.jPanelParametrosReportesEmpaque.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEmpaque!=null) {
				this.jScrollPanelDatosEdicionEmpaque.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpaque!=null) {
				this.jTabbedPaneBusquedasEmpaque.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpaque!=null) {
				this.jScrollPanelDatosEmpaque.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpaque!=null) {
				this.jPanelPaginacionEmpaque.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpaque!=null) {
				this.jPanelParametrosReportesEmpaque.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEmpaque!=null) {
				this.jScrollPanelDatosEdicionEmpaque.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpaque!=null) {
				this.jTabbedPaneBusquedasEmpaque.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpaque!=null) {
				this.jScrollPanelDatosEmpaque.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpaque!=null) {
				this.jPanelPaginacionEmpaque.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpaque!=null) {
				this.jPanelParametrosReportesEmpaque.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEmpaque!=null) {
				this.jScrollPanelDatosEdicionEmpaque.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpaque!=null) {
				this.jTabbedPaneBusquedasEmpaque.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpaque!=null) {
				this.jScrollPanelDatosEmpaque.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpaque!=null) {
				this.jPanelPaginacionEmpaque.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpaque!=null) {
				this.jPanelParametrosReportesEmpaque.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.empaqueSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEmpaque!=null) {
					this.jTabbedPaneBusquedasEmpaque.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEmpaque!=null) {
				this.jPanelParametrosReportesEmpaque.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.empaqueSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpaque!=null) {
				this.jTabbedPaneBusquedasEmpaque.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEmpaque!=null) {
				this.jPanelParametrosReportesEmpaque.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionEmpaqueParaDetalleProformas() throws Exception {
		Boolean isPaginaPopupDetalleProforma=false;

		try {

			if(this.empaqueSessionBean==null) {
				this.empaqueSessionBean=new EmpaqueSessionBean();
			}

			if(this.jInternalFrameDetalleFormEmpaque.detalleproformaSessionBean==null) {
				this.jInternalFrameDetalleFormEmpaque.detalleproformaSessionBean=new DetalleProformaSessionBean();
			}

			this.jInternalFrameDetalleFormEmpaque.detalleproformaSessionBean.setsPathNavegacionActual(empaqueSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleProformaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEmpaque.detalleproformaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleProforma=this.jInternalFrameDetalleFormEmpaque.detalleproformaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEmpaque.detalleproformaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleProforma(true);
			this.jInternalFrameDetalleFormEmpaque.detalleproformaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleProforma(EmpaqueConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEmpaque.detalleproformaSessionBean.setisBusquedaDesdeForeignKeySesionEmpaque(true);
			this.jInternalFrameDetalleFormEmpaque.detalleproformaSessionBean.setlidEmpaqueActual(this.idEmpaqueActual);

			empaqueSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEmpaque(true);
			empaqueSessionBean.setlIdEmpaqueActualForeignKey(this.idEmpaqueActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEmpaqueParaDetaNotaCreditoSolis() throws Exception {
		Boolean isPaginaPopupDetaNotaCreditoSoli=false;

		try {

			if(this.empaqueSessionBean==null) {
				this.empaqueSessionBean=new EmpaqueSessionBean();
			}

			if(this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliSessionBean==null) {
				this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliSessionBean=new DetaNotaCreditoSoliSessionBean();
			}

			this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliSessionBean.setsPathNavegacionActual(empaqueSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetaNotaCreditoSoli=this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetaNotaCreditoSoli(true);
			this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetaNotaCreditoSoli(EmpaqueConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliSessionBean.setisBusquedaDesdeForeignKeySesionEmpaque(true);
			this.jInternalFrameDetalleFormEmpaque.detanotacreditosoliSessionBean.setlidEmpaqueActual(this.idEmpaqueActual);

			empaqueSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEmpaque(true);
			empaqueSessionBean.setlIdEmpaqueActualForeignKey(this.idEmpaqueActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EmpaqueSessionBean empaqueSessionBean=new EmpaqueSessionBean();
		
		if(this.empaqueSessionBean==null) {
			this.empaqueSessionBean=new EmpaqueSessionBean();
		}
		
		this.empaqueSessionBean.setsUltimaBusquedaEmpaque(this.getsAccionBusqueda());
		this.empaqueSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.empaqueSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			empaqueSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EmpaqueSessionBean empaqueSessionBean=new EmpaqueSessionBean();
		
		if(this.empaqueSessionBean==null) {
			this.empaqueSessionBean=new EmpaqueSessionBean();
		}
		
		if(this.empaqueSessionBean.getsUltimaBusquedaEmpaque()!=null&&!this.empaqueSessionBean.getsUltimaBusquedaEmpaque().equals("")) {
			this.setsAccionBusqueda(empaqueSessionBean.getsUltimaBusquedaEmpaque());
			this.setiNumeroPaginacion(empaqueSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(empaqueSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(empaqueSessionBean.getid_empresa());
				empaqueSessionBean.setid_empresa(-1L);
			}
		}
		
		this.empaqueSessionBean.setsUltimaBusquedaEmpaque("");
		this.empaqueSessionBean.setiNumeroPaginacion(EmpaqueConstantesFunciones.INUMEROPAGINACION);
		this.empaqueSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEmpaque(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEmpaque() {
		this.updateBorderResaltarBusquedasFormularioEmpaque();
		this.updateVisibilidadBusquedasFormularioEmpaque();
		this.updateHabilitarBusquedasFormularioEmpaque();
	}
	
	public void updateBorderResaltarBusquedasFormularioEmpaque() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEmpaque.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEmpaque() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEmpaque.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEmpaque() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEmpaque.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEmpaque(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarEmpaque.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEmpaque() throws Exception {

		if(this.jInternalFrameDetalleFormEmpaque==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEmpaque();
		this.updateVisibilidadResaltarControlesFormularioEmpaque();
		this.updateHabilitarResaltarControlesFormularioEmpaque();
		
	}
	
	public void updateBorderResaltarControlesFormularioEmpaque() throws Exception {
		if(this.jInternalFrameDetalleFormEmpaque==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.empaqueConstantesFunciones.resaltaridEmpaque!=null && this.jInternalFrameDetalleFormEmpaque!=null) {this.jInternalFrameDetalleFormEmpaque.jLabelidEmpaque.setBorder(this.empaqueConstantesFunciones.resaltaridEmpaque);}
		if(this.empaqueConstantesFunciones.resaltarid_empresaEmpaque!=null && this.jInternalFrameDetalleFormEmpaque!=null) {this.jInternalFrameDetalleFormEmpaque.jComboBoxid_empresaEmpaque.setBorder(this.empaqueConstantesFunciones.resaltarid_empresaEmpaque);}
		if(this.empaqueConstantesFunciones.resaltarvalorEmpaque!=null && this.jInternalFrameDetalleFormEmpaque!=null) {this.jInternalFrameDetalleFormEmpaque.jTextFieldvalorEmpaque.setBorder(this.empaqueConstantesFunciones.resaltarvalorEmpaque);}
		if(this.empaqueConstantesFunciones.resaltardescripcionEmpaque!=null && this.jInternalFrameDetalleFormEmpaque!=null) {this.jInternalFrameDetalleFormEmpaque.jTextAreadescripcionEmpaque.setBorder(this.empaqueConstantesFunciones.resaltardescripcionEmpaque);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEmpaque() throws Exception {		
		if(this.jInternalFrameDetalleFormEmpaque==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) {
	
		//this.jInternalFrameDetalleFormEmpaque.jLabelidEmpaque.setVisible(this.empaqueConstantesFunciones.mostraridEmpaque);
		this.jInternalFrameDetalleFormEmpaque.jPanelidEmpaque.setVisible(this.empaqueConstantesFunciones.mostraridEmpaque);
		//this.jInternalFrameDetalleFormEmpaque.jComboBoxid_empresaEmpaque.setVisible(this.empaqueConstantesFunciones.mostrarid_empresaEmpaque);
		this.jInternalFrameDetalleFormEmpaque.jPanelid_empresaEmpaque.setVisible(this.empaqueConstantesFunciones.mostrarid_empresaEmpaque);
		//this.jInternalFrameDetalleFormEmpaque.jTextFieldvalorEmpaque.setVisible(this.empaqueConstantesFunciones.mostrarvalorEmpaque);
		this.jInternalFrameDetalleFormEmpaque.jPanelvalorEmpaque.setVisible(this.empaqueConstantesFunciones.mostrarvalorEmpaque);
		//this.jInternalFrameDetalleFormEmpaque.jTextAreadescripcionEmpaque.setVisible(this.empaqueConstantesFunciones.mostrardescripcionEmpaque);
		this.jInternalFrameDetalleFormEmpaque.jPaneldescripcionEmpaque.setVisible(this.empaqueConstantesFunciones.mostrardescripcionEmpaque);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEmpaque() throws Exception {
		if(this.jInternalFrameDetalleFormEmpaque==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpaque!=null) {
	
		this.jInternalFrameDetalleFormEmpaque.jLabelidEmpaque.setEnabled(this.empaqueConstantesFunciones.activaridEmpaque);
		this.jInternalFrameDetalleFormEmpaque.jComboBoxid_empresaEmpaque.setEnabled(this.empaqueConstantesFunciones.activarid_empresaEmpaque);
		this.jInternalFrameDetalleFormEmpaque.jTextFieldvalorEmpaque.setEnabled(this.empaqueConstantesFunciones.activarvalorEmpaque);
		this.jInternalFrameDetalleFormEmpaque.jTextAreadescripcionEmpaque.setEnabled(this.empaqueConstantesFunciones.activardescripcionEmpaque);
		}
	}
	
		
}