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

import com.bydan.erp.puntoventa.util.TipoFormulaConstantesFunciones;
import com.bydan.erp.puntoventa.util.TipoFormulaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.TipoFormulaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.TipoFormulaBean;
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
public class TipoFormulaBeanSwingJInternalFrame extends TipoFormulaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoFormulaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoFormula> tipoformulaValidator = new ClassValidator<TipoFormula>(TipoFormula.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoFormula tipoformula;	
	public TipoFormula tipoformulaAux;
	public TipoFormula tipoformulaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoFormula tipoformulaTotales;
	public Long idTipoFormulaActual;
	public Long iIdNuevoTipoFormula=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosFormula=false;

	public Boolean getIsTienePermisosFormula() {
		return isTienePermisosFormula;
	}

	public void setIsTienePermisosFormula(Boolean isTienePermisosFormula) {
		this.isTienePermisosFormula= isTienePermisosFormula;
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
	
	public Boolean isPermisoTodoTipoFormula;
	public Boolean isPermisoNuevoTipoFormula;
	public Boolean isPermisoActualizarTipoFormula;
	public Boolean isPermisoActualizarOriginalTipoFormula;
	public Boolean isPermisoEliminarTipoFormula;
	public Boolean isPermisoGuardarCambiosTipoFormula;
	public Boolean isPermisoConsultaTipoFormula;
	public Boolean isPermisoBusquedaTipoFormula;
	public Boolean isPermisoReporteTipoFormula;
	public Boolean isPermisoPaginacionMedioTipoFormula;
	public Boolean isPermisoPaginacionAltoTipoFormula;
	public Boolean isPermisoPaginacionTodoTipoFormula;
	public Boolean isPermisoCopiarTipoFormula;
	public Boolean isPermisoVerFormTipoFormula;
	public Boolean isPermisoDuplicarTipoFormula;
	public Boolean isPermisoOrdenTipoFormula;
	
	
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
	
	public TipoFormulaParameterReturnGeneral tipoformulaReturnGeneral;
	public TipoFormulaParameterReturnGeneral tipoformulaParameterGeneral;
	
	

	public FormulaLogic formulaLogic=null;

	public FormulaLogic getFormulaLogic() {
		return formulaLogic;
	}

	public void setFormulaLogic(FormulaLogic formulaLogic) {
		this.formulaLogic = formulaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoFormula=false;
	public Boolean esParaAccionDesdeFormularioTipoFormula=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoFormulaLogic tipoformulaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoFormula tipoformulaBean;
	public TipoFormulaConstantesFunciones tipoformulaConstantesFunciones;
	//public TipoFormulaParameterReturnGeneral tipoformulaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoFormula> tipoformulas;	
	//public List<TipoFormula> tipoformulasEliminados;
	//public List<TipoFormula> tipoformulasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoFormula=false;
	public Boolean isVisibilidadCeldaDuplicarTipoFormula=true;
	public Boolean isVisibilidadCeldaCopiarTipoFormula=true;
	public Boolean isVisibilidadCeldaVerFormTipoFormula=true;
	public Boolean isVisibilidadCeldaOrdenTipoFormula=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoFormula=false;
	public Boolean isVisibilidadCeldaModificarTipoFormula=false;
	public Boolean isVisibilidadCeldaActualizarTipoFormula=false;
	public Boolean isVisibilidadCeldaEliminarTipoFormula=false;
	public Boolean isVisibilidadCeldaCancelarTipoFormula=false;
	public Boolean isVisibilidadCeldaGuardarTipoFormula=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoFormula=false;	
	
	
	
	public Long getiIdNuevoTipoFormula() {
		return this.iIdNuevoTipoFormula;
	}

	public void setiIdNuevoTipoFormula(Long iIdNuevoTipoFormula) {
		this.iIdNuevoTipoFormula = iIdNuevoTipoFormula;
	}
	
	public Long getidTipoFormulaActual() {
		return this.idTipoFormulaActual;
	}

	public void setidTipoFormulaActual(Long idTipoFormulaActual) {
		this.idTipoFormulaActual = idTipoFormulaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoFormula gettipoformula() {
		return this.tipoformula;
	}

	public void settipoformula(TipoFormula tipoformula) {
		this.tipoformula = tipoformula;
	}
	
	public TipoFormula gettipoformulaAux() {
		return this.tipoformulaAux;
	}

	public void settipoformulaAux(TipoFormula tipoformulaAux) {
		this.tipoformulaAux = tipoformulaAux;
	}				
	
	public TipoFormula gettipoformulaAnterior() {
		return this.tipoformulaAnterior;
	}

	public void settipoformulaAnterior(TipoFormula tipoformulaAnterior) {
		this.tipoformulaAnterior = tipoformulaAnterior;
	}	
	
	public TipoFormula gettipoformulaTotales() {
		return this.tipoformulaTotales;
	}

	public void settipoformulaTotales(TipoFormula tipoformulaTotales) {
		this.tipoformulaTotales = tipoformulaTotales;
	}	
	
	public TipoFormula gettipoformulaBean() {
		return this.tipoformulaBean;
	}

	public void settipoformulaBean(TipoFormula tipoformulaBean) {
		this.tipoformulaBean = tipoformulaBean;
	}	
	
	public TipoFormulaParameterReturnGeneral gettipoformulaReturnGeneral() {
		return this.tipoformulaReturnGeneral;
	}

	public void settipoformulaReturnGeneral(TipoFormulaParameterReturnGeneral tipoformulaReturnGeneral) {
		this.tipoformulaReturnGeneral = tipoformulaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoFormulaLogic getTipoFormulaLogic()	{		
		return tipoformulaLogic;
	}

	public void setTipoFormulaLogic(TipoFormulaLogic tipoformulaLogic) {
		this.tipoformulaLogic = tipoformulaLogic;
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
	
	public Boolean getIsEsNuevoTipoFormula() {
		return isEsNuevoTipoFormula;
	}

	public void setIsEsNuevoTipoFormula(Boolean isEsNuevoTipoFormula) {
		this.isEsNuevoTipoFormula = isEsNuevoTipoFormula;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoFormula() {
		return esParaAccionDesdeFormularioTipoFormula;
	}
	
	public void setEsParaAccionDesdeFormularioTipoFormula(Boolean esParaAccionDesdeFormularioTipoFormula) {
		this.esParaAccionDesdeFormularioTipoFormula = esParaAccionDesdeFormularioTipoFormula;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoFormula() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoFormulaConstantesFunciones.refrescarForeignKeysDescripcionesTipoFormula(this.tipoformulaLogic.getTipoFormulas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoFormulaConstantesFunciones.refrescarForeignKeysDescripcionesTipoFormula(this.tipoformulas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoformulaLogic.setTipoFormulas(this.tipoformulas);
			tipoformulaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoFormulaParameterReturnGeneral getTipoFormulaParameterGeneral() {
		return this.tipoformulaParameterGeneral;
	}
	
	public void setTipoFormulaParameterGeneral(TipoFormulaParameterReturnGeneral tipoformulaParameterGeneral) {
		this.tipoformulaParameterGeneral = tipoformulaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoFormula() {
		return isPermisoTodoTipoFormula;
	}

	public void setIsPermisoTodoTipoFormula(Boolean isPermisoTodoTipoFormula) {
		this.isPermisoTodoTipoFormula = isPermisoTodoTipoFormula;
	}

	public Boolean getIsPermisoNuevoTipoFormula() {
		return isPermisoNuevoTipoFormula;
	}

	public void setIsPermisoNuevoTipoFormula(Boolean isPermisoNuevoTipoFormula) {
		this.isPermisoNuevoTipoFormula = isPermisoNuevoTipoFormula;
	}

	public Boolean getIsPermisoActualizarTipoFormula() {
		return isPermisoActualizarTipoFormula;
	}

	public void setIsPermisoActualizarTipoFormula(Boolean isPermisoActualizarTipoFormula) {
		this.isPermisoActualizarTipoFormula = isPermisoActualizarTipoFormula;
	}

	public Boolean getIsPermisoEliminarTipoFormula() {
		return isPermisoEliminarTipoFormula;
	}

	public void setIsPermisoEliminarTipoFormula(Boolean isPermisoEliminarTipoFormula) {
		this.isPermisoEliminarTipoFormula = isPermisoEliminarTipoFormula;
	}

	public Boolean getIsPermisoGuardarCambiosTipoFormula() {
		return isPermisoGuardarCambiosTipoFormula;
	}

	public void setIsPermisoGuardarCambiosTipoFormula(Boolean isPermisoGuardarCambiosTipoFormula) {
		this.isPermisoGuardarCambiosTipoFormula = isPermisoGuardarCambiosTipoFormula;
	}
	
	public Boolean getIsPermisoConsultaTipoFormula() {
		return isPermisoConsultaTipoFormula;
	}

	public void setIsPermisoConsultaTipoFormula(Boolean isPermisoConsultaTipoFormula) {
		this.isPermisoConsultaTipoFormula = isPermisoConsultaTipoFormula;
	}

	public Boolean getIsPermisoBusquedaTipoFormula() {
		return isPermisoBusquedaTipoFormula;
	}

	public void setIsPermisoBusquedaTipoFormula(Boolean isPermisoBusquedaTipoFormula) {
		this.isPermisoBusquedaTipoFormula = isPermisoBusquedaTipoFormula;
	}

	public Boolean getIsPermisoReporteTipoFormula() {
		return isPermisoReporteTipoFormula;
	}

	public void setIsPermisoReporteTipoFormula(Boolean isPermisoReporteTipoFormula) {
		this.isPermisoReporteTipoFormula = isPermisoReporteTipoFormula;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoFormula() {
		return isPermisoPaginacionMedioTipoFormula;
	}

	public void setIsPermisoPaginacionMedioTipoFormula(Boolean isPermisoPaginacionMedioTipoFormula) {
		this.isPermisoPaginacionMedioTipoFormula = isPermisoPaginacionMedioTipoFormula;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoFormula() {
		return isPermisoPaginacionTodoTipoFormula;
	}

	public void setIsPermisoPaginacionTodoTipoFormula(Boolean isPermisoPaginacionTodoTipoFormula) {
		this.isPermisoPaginacionTodoTipoFormula = isPermisoPaginacionTodoTipoFormula;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoFormula() {
		return isPermisoPaginacionAltoTipoFormula;
	}

	public void setIsPermisoPaginacionAltoTipoFormula(Boolean isPermisoPaginacionAltoTipoFormula) {
		this.isPermisoPaginacionAltoTipoFormula = isPermisoPaginacionAltoTipoFormula;
	}
	
	public Boolean getIsPermisoCopiarTipoFormula() {
		return isPermisoCopiarTipoFormula;
	}

	public void setIsPermisoCopiarTipoFormula(Boolean isPermisoCopiarTipoFormula) {
		this.isPermisoCopiarTipoFormula = isPermisoCopiarTipoFormula;
	}
	
	public Boolean getIsPermisoVerFormTipoFormula() {
		return isPermisoVerFormTipoFormula;
	}

	public void setIsPermisoVerFormTipoFormula(Boolean isPermisoVerFormTipoFormula) {
		this.isPermisoVerFormTipoFormula = isPermisoVerFormTipoFormula;
	}
	
	public Boolean getIsPermisoDuplicarTipoFormula() {
		return isPermisoDuplicarTipoFormula;
	}

	public void setIsPermisoDuplicarTipoFormula(Boolean isPermisoDuplicarTipoFormula) {
		this.isPermisoDuplicarTipoFormula = isPermisoDuplicarTipoFormula;
	}
	
	public Boolean getIsPermisoOrdenTipoFormula() {
		return isPermisoOrdenTipoFormula;
	}

	public void setIsPermisoOrdenTipoFormula(Boolean isPermisoOrdenTipoFormula) {
		this.isPermisoOrdenTipoFormula = isPermisoOrdenTipoFormula;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoFormula() {
		return isVisibilidadCeldaNuevoTipoFormula;
	}

	public void setIsVisibilidadCeldaNuevoTipoFormula(Boolean isVisibilidadCeldaNuevoTipoFormula) {
		this.isVisibilidadCeldaNuevoTipoFormula = isVisibilidadCeldaNuevoTipoFormula;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoFormula() {
		return isVisibilidadCeldaDuplicarTipoFormula;
	}

	public void setIsVisibilidadCeldaDuplicarTipoFormula(Boolean isVisibilidadCeldaDuplicarTipoFormula) {
		this.isVisibilidadCeldaDuplicarTipoFormula = isVisibilidadCeldaDuplicarTipoFormula;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoFormula() {
		return isVisibilidadCeldaCopiarTipoFormula;
	}

	public void setIsVisibilidadCeldaCopiarTipoFormula(Boolean isVisibilidadCeldaCopiarTipoFormula) {
		this.isVisibilidadCeldaCopiarTipoFormula = isVisibilidadCeldaCopiarTipoFormula;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoFormula() {
		return isVisibilidadCeldaVerFormTipoFormula;
	}

	public void setIsVisibilidadCeldaVerFormTipoFormula(Boolean isVisibilidadCeldaVerFormTipoFormula) {
		this.isVisibilidadCeldaVerFormTipoFormula = isVisibilidadCeldaVerFormTipoFormula;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoFormula() {
		return isVisibilidadCeldaOrdenTipoFormula;
	}

	public void setIsVisibilidadCeldaOrdenTipoFormula(Boolean isVisibilidadCeldaOrdenTipoFormula) {
		this.isVisibilidadCeldaOrdenTipoFormula = isVisibilidadCeldaOrdenTipoFormula;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoFormula() {
		return isVisibilidadCeldaNuevoRelacionesTipoFormula;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoFormula(Boolean isVisibilidadCeldaNuevoRelacionesTipoFormula) {
		this.isVisibilidadCeldaNuevoRelacionesTipoFormula = isVisibilidadCeldaNuevoRelacionesTipoFormula;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoFormula() {
		return isVisibilidadCeldaModificarTipoFormula;
	}

	public void setIsVisibilidadCeldaModificarTipoFormula(Boolean isVisibilidadCeldaModificarTipoFormula) {
		this.isVisibilidadCeldaModificarTipoFormula = isVisibilidadCeldaModificarTipoFormula;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoFormula() {
		return isVisibilidadCeldaActualizarTipoFormula;
	}

	public void setIsVisibilidadCeldaActualizarTipoFormula(Boolean isVisibilidadCeldaActualizarTipoFormula) {
		this.isVisibilidadCeldaActualizarTipoFormula = isVisibilidadCeldaActualizarTipoFormula;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoFormula() {
		return isVisibilidadCeldaEliminarTipoFormula;
	}

	public void setIsVisibilidadCeldaEliminarTipoFormula(Boolean isVisibilidadCeldaEliminarTipoFormula) {
		this.isVisibilidadCeldaEliminarTipoFormula = isVisibilidadCeldaEliminarTipoFormula;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoFormula() {
		return isVisibilidadCeldaCancelarTipoFormula;
	}

	public void setIsVisibilidadCeldaCancelarTipoFormula(Boolean isVisibilidadCeldaCancelarTipoFormula) {
		this.isVisibilidadCeldaCancelarTipoFormula = isVisibilidadCeldaCancelarTipoFormula;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoFormula() {
		return isVisibilidadCeldaGuardarTipoFormula;
	}

	public void setIsVisibilidadCeldaGuardarTipoFormula(Boolean isVisibilidadCeldaGuardarTipoFormula) {
		this.isVisibilidadCeldaGuardarTipoFormula = isVisibilidadCeldaGuardarTipoFormula;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoFormula() {
		return isVisibilidadCeldaGuardarCambiosTipoFormula;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoFormula(Boolean isVisibilidadCeldaGuardarCambiosTipoFormula) {
		this.isVisibilidadCeldaGuardarCambiosTipoFormula = isVisibilidadCeldaGuardarCambiosTipoFormula;
	}
		
	public TipoFormulaSessionBean gettipoformulaSessionBean() {
		return this.tipoformulaSessionBean;
	}
	
	public void settipoformulaSessionBean(TipoFormulaSessionBean tipoformulaSessionBean) {
		this.tipoformulaSessionBean=tipoformulaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoFormula(TipoFormula tipoformula)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(TipoFormula tipoformula,TipoFormula tipoformulaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoFormula(tipoformula);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoformulaAux.setId(tipoformula.getId());
		tipoformulaAux.setVersionRow(tipoformula.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoFormula();
		
			int intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformula =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoformula =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoFormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoFormula(this.tipoformula,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFormula(this.tipoformula);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoformulaValidator.getInvalidValues(this.tipoformula);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoformulaLogic.setDatosCliente(datosCliente);
			tipoformulaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoformulaAux=new  TipoFormula();
				
				tipoformulaAux.setIsNew(true);
				tipoformulaAux.setIsChanged(true);
				
				tipoformulaAux.setTipoFormulaOriginal(this.tipoformula);
				
				tipoformulaAux.setId(this.tipoformula.getId());	
				tipoformulaAux.setVersionRow(this.tipoformula.getVersionRow());	
				tipoformulaAux.setnombre(this.tipoformula.getnombre());	
				tipoformulaAux.setdescripcion(this.tipoformula.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoformulaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoformulaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoformulaAux,tipoformulaLogic.getTipoFormulas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoformulaAux,tipoformulas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoformulaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoformulaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformulaLogic.saveTipoFormulas();//WithConnection
						//tipoformulaLogic.getSetVersionRowTipoFormulas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoformula,tipoformulaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoformulaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoformulaAux=new  TipoFormula();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoformulaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoformulaSessionBean.getEsGuardarRelacionado() && this.tipoformula.getId()>=0)) {
						
					tipoformulaAux.setIsNew(false);
				}
				
				tipoformulaAux.setIsDeleted(false);
			
				tipoformulaAux.setId(this.tipoformula.getId());	
				tipoformulaAux.setVersionRow(this.tipoformula.getVersionRow());	
				tipoformulaAux.setnombre(this.tipoformula.getnombre());	
				tipoformulaAux.setdescripcion(this.tipoformula.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoformulaAux,tipoformulaLogic.getTipoFormulas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoformulaAux,tipoformulas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoformulaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoformulaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformulaLogic.saveTipoFormulas();//WithConnection
						//tipoformulaLogic.getSetVersionRowTipoFormulas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoformula,tipoformulaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoformulaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoformulaAux=new  TipoFormula();
				
				tipoformulaAux.setIsNew(false);
				tipoformulaAux.setIsChanged(false);
				
				tipoformulaAux.setIsDeleted(true);
				
				tipoformulaAux.setId(this.tipoformula.getId());	
				tipoformulaAux.setVersionRow(this.tipoformula.getVersionRow());	
				tipoformulaAux.setnombre(this.tipoformula.getnombre());	
				tipoformulaAux.setdescripcion(this.tipoformula.getdescripcion());	
				
				if(this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoformulaAux.getId()>=0) {	
						this.tipoformulasEliminados.add(tipoformulaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoformulaAux,tipoformulaLogic.getTipoFormulas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoformulaAux,tipoformulas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoformulaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoformulaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformulaLogic.saveTipoFormulas();//WithConnection
						//tipoformulaLogic.getSetVersionRowTipoFormulas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoformulaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoformulaAux.setFormulas(this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.formulaLogic.getFormulas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoformulaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoformulaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoformulaAux,tipoformulaLogic.getTipoFormulas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoformulaAux,tipoformulas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.getTipoFormulas().addAll(this.tipoformulasEliminados);
					
					tipoformulaLogic.saveTipoFormulas();//WithConnection
					//tipoformulaLogic.getSetVersionRowTipoFormulas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoformulasEliminados= new ArrayList<TipoFormula>();		
			}
			
			if(this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Formula GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Formula",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoformula=tipoformulaAux;
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
      		//this.finishProcessTipoFormula();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoFormula tipoformulaLocal) throws Exception {
		
		if(this.tipoformulaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoformulaLocal.setFormulas(this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.formulaLogic.getFormulas());
			
			} else {
			
				tipoformulaLocal.setFormulas(this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.formulas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoFormula tipoformulaLocal) throws Exception {	
		if(this.tipoformulaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoFormulaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoformula =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoformula =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoformulaValidator.getInvalidValues(this.tipoformula);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoFormula tipoformula,List<TipoFormula> tipoformulas) throws Exception {
		try	{		
			TipoFormulaConstantesFunciones.actualizarLista(tipoformula,tipoformulas,this.tipoformulaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoFormula tipoformula,List<TipoFormula> tipoformulas) throws Exception {
		try	{			
			TipoFormulaConstantesFunciones.actualizarSelectedLista(tipoformula,tipoformulas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoFormula> tipoformulasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoformulasLocal=this.tipoformulaLogic.getTipoFormulas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoformulasLocal=this.tipoformulas;
			}
			//ARCHITECTURE
		
			for(TipoFormula tipoformulaLocal:tipoformulasLocal) {
				if(this.permiteMantenimiento(tipoformulaLocal) && tipoformulaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoFormulaConstantesFunciones.getTipoFormulaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoFormulaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFormula.jLabelnombreTipoFormula,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoFormulaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFormula.jLabeldescripcionTipoFormula,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFormula.jLabelnombreTipoFormula,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFormula.jLabeldescripcionTipoFormula,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Formula")) {
			if(this.tipoformula==null) {
				this.tipoformula= new TipoFormula();
			}

			if(this.tipoformulaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoFormula
				this.setVariablesFormularioToObjetoActualTipoFormula(this.tipoformula,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFormula(this.tipoformula);

				this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.getformula().setTipoFormula(this.tipoformula);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoFormula--;	
		
		
		this.tipoformulaAux=new TipoFormula();
		
		this.tipoformulaAux.setId(this.iIdNuevoTipoFormula);
		this.tipoformulaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoformulaLogic.getTipoFormulas().add(this.tipoformulaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoformulas.add(this.tipoformulaAux);
		}
		//ARCHITECTURE
		
		this.tipoformula=this.tipoformulaAux;
		
		if(TipoFormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoFormula(this.tipoformula);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFormula(this.tipoformula);
		}
				
		//this.setDefaultControlesTipoFormula();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoFormula();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoFormula();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFormula();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFormula(this.tipoformulaBean,this.tipoformula,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFormula(this.tipoformula);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoFormulaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoformulaSessionBean.getConGuardarRelaciones()) {
			classes=TipoFormulaConstantesFunciones.getClassesRelationshipsOfTipoFormula(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoformulaReturnGeneral=tipoformulaLogic.procesarEventosTipoFormulasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoformulaLogic.getTipoFormulas(),this.tipoformula,this.tipoformulaParameterGeneral,this.isEsNuevoTipoFormula,classes);//this.tipoformulaLogic.getTipoFormula()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoFormula(this.tipoformulaReturnGeneral,this.tipoformulaBean,false);
		
		if(this.tipoformulaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFormula(this.tipoformulaReturnGeneral.getTipoFormula());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoFormula(this.tipoformulaReturnGeneral.getTipoFormula());
		}
		
		if(this.tipoformulaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoFormula(this.tipoformulaReturnGeneral.getTipoFormula(),classes);//this.tipoformulaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoFormula(this.tipoformula,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoFormula();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoFormula();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoFormula(false);
						
			if(tipoformulaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.formulaSessionBean.getEsGuardarRelacionado() && FormulaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormulaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoFormulaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFormula();
			}
			
			this.actualizarVisualTableDatosTipoFormula();
			
			this.jTableDatosTipoFormula.setRowSelectionInterval(this.getIndiceNuevoTipoFormula(), this.getIndiceNuevoTipoFormula());
			
			this.seleccionarFilaTablaTipoFormulaActual();
						
			this.actualizarEstadoCeldasBotonesTipoFormula("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoFormula(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoFormula.jTextAreanombreTipoFormula.setEnabled(isHabilitar && this.tipoformulaConstantesFunciones.activarnombreTipoFormula);
		this.jInternalFrameDetalleFormTipoFormula.jTextAreadescripcionTipoFormula.setEnabled(isHabilitar && this.tipoformulaConstantesFunciones.activardescripcionTipoFormula);	
		
	};
	
	public void setDefaultControlesTipoFormula() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoFormula(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoformulaSessionBean.setConGuardarRelaciones(true);			
			this.tipoformulaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoFormula.jTabbedPaneRelacionesTipoFormula.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.formulaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoformulaSessionBean.setConGuardarRelaciones(false);			
			this.tipoformulaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoFormula.jTabbedPaneRelacionesTipoFormula.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.formulaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoFormula() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFormula tipoformulaAux:this.tipoformulaLogic.getTipoFormulas()) {
				if(tipoformulaAux.getId().equals(this.iIdNuevoTipoFormula)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFormula tipoformulaAux:this.tipoformulas) {
				if(tipoformulaAux.getId().equals(this.iIdNuevoTipoFormula)) {
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
	
	public int getIndiceActualTipoFormula(TipoFormula tipoformula,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFormula tipoformulaAux:this.tipoformulaLogic.getTipoFormulas()) {
				if(tipoformulaAux.getId().equals(tipoformula.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFormula tipoformulaAux:this.tipoformulas) {
				if(tipoformulaAux.getId().equals(tipoformula.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoFormula(TipoFormula tipoformulaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFormula tipoformulaAux:this.tipoformulaLogic.getTipoFormulas()) {
				if(tipoformulaAux.getTipoFormulaOriginal().getId().equals(tipoformulaOriginal.getId())) {
					existe=true;
					tipoformulaOriginal.setId(tipoformulaAux.getId());
					tipoformulaOriginal.setVersionRow(tipoformulaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFormula tipoformulaAux:this.tipoformulas) {
				if(tipoformulaAux.getTipoFormulaOriginal().getId().equals(tipoformulaOriginal.getId())) {
					existe=true;
					tipoformulaOriginal.setId(tipoformulaAux.getId());
					tipoformulaOriginal.setVersionRow(tipoformulaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoFormula(Boolean esParaCancelar) throws Exception {
		tipoformulasAux=new ArrayList<TipoFormula>();
		tipoformulaAux=new TipoFormula();
		
		if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFormula tipoformulaAux:this.tipoformulaLogic.getTipoFormulas()) {
					if(tipoformulaAux.getId()<0) {
						tipoformulasAux.add(tipoformulaAux);
					}		
				}
				this.iIdNuevoTipoFormula=0L;
				this.tipoformulaLogic.getTipoFormulas().removeAll(tipoformulasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFormula tipoformulaAux:this.tipoformulas) {
					if(tipoformulaAux.getId()<0) {
						tipoformulasAux.add(tipoformulaAux);
					}		
				}
				this.iIdNuevoTipoFormula=0L;
				this.tipoformulas.removeAll(tipoformulasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoFormula 
					&& this.tipoformulaLogic.getTipoFormulas().size()>0
					) {
					tipoformulaAux=this.tipoformulaLogic.getTipoFormulas().get(this.tipoformulaLogic.getTipoFormulas().size() - 1);
				
					if(tipoformulaAux.getId()<0) {
						this.tipoformulaLogic.getTipoFormulas().remove(tipoformulaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoFormula && this.tipoformulas.size()>0) {
					tipoformulaAux=this.tipoformulas.get(this.tipoformulas.size() - 1);
				
					if(tipoformulaAux.getId()<0) {
						this.tipoformulas.remove(tipoformulaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoFormula(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoformula.getId()<0) {
				this.tipoformulaLogic.getTipoFormulas().remove(this.tipoformula);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoformula.getId()<0) {
				this.tipoformulas.remove(this.tipoformula);
			}
		}			
	}
	
	public void setEstadosInicialesTipoFormula(List<TipoFormula> tipoformulasAux) throws Exception {
		TipoFormulaConstantesFunciones.setEstadosInicialesTipoFormula(tipoformulasAux);
	}
	
	public void setEstadosInicialesTipoFormula(TipoFormula tipoformulaAux) throws Exception {
		TipoFormulaConstantesFunciones.setEstadosInicialesTipoFormula(tipoformulaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoFormulaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoFormula("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoFormulaActual()) {
				if(!this.isEsNuevoTipoFormula) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoFormula("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoFormula=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoFormulaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Formula ?", "MANTENIMIENTO DE Tipo Formula", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoFormula("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoFormula tipoformula) throws Exception {
		TipoFormulaConstantesFunciones.seleccionarAsignar(this.tipoformula,tipoformula);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoFormula=this.isPermisoActualizarOriginalTipoFormula;
			
			
			this.seleccionarAsignar(tipoformula);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoFormulaConstantesFunciones.quitarEspaciosTipoFormula(this.tipoformula,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoFormula("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoformulaSessionBean.setsFuncionBusquedaRapida(this.tipoformulaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoFormula) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoFormula(esParaCancelar);				
				this.cancelarNuevoTipoFormula(esParaCancelar);								
			}
			
			this.tipoformula=new TipoFormula();
			
			this.inicializarTipoFormula();
			
			this.actualizarEstadoCeldasBotonesTipoFormula("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoFormula() throws Exception {
		try {
			TipoFormulaConstantesFunciones.inicializarTipoFormula(this.tipoformula);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoformulaLogic.getTipoFormulas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoFormulas(String sAccionBusqueda,List<TipoFormula> tipoformulasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoFormula"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoFormulaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoFormulaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoFormula"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Formulas");		
		parameters.put("busquedapor", TipoFormulaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Formula.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoFormulaLogic tipoformulaLogicAuxiliar=new TipoFormulaLogic();
					tipoformulaLogicAuxiliar.setDatosCliente(tipoformulaLogic.getDatosCliente());				
					tipoformulaLogicAuxiliar.setTipoFormulas(tipoformulasParaReportes);
					
					tipoformulaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoFormulaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoformulasParaReportes=tipoformulaLogicAuxiliar.getTipoFormulas();
					
					//tipoformulaLogic.getNewConnexionToDeep();
					
					//for (TipoFormula tipoformula:tipoformulasParaReportes) {
					//	tipoformulaLogic.deepLoad(tipoformula, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoformulaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoformulaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFormula = AuxiliarReportes.class.getResourceAsStream("FormulaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_formula", reportFileFormula);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoFormula=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoFormulaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoFormulaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoFormula=new JRBeanArrayDataSource(TipoFormulaJInternalFrame.TraerTipoFormulaBeans(tipoformulasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoFormula);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoFormulaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoFormulaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoFormulaBean.TraerTipoFormulaBeans(tipoformulasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoFormulas(sAccionBusqueda,sTipoArchivoReporte,tipoformulasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoFormulas(sAccionBusqueda,sTipoArchivoReporte,tipoformulasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoFormulaActionPerformed(null);
					//this.generarExcelReporteTipoFormulas(sAccionBusqueda,sTipoArchivoReporte,tipoformulasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoFormulas(sAccionBusqueda,sTipoArchivoReporte,tipoformulasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoFormulas(sAccionBusqueda,sTipoArchivoReporte,tipoformulasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoFormulas(sAccionBusqueda,sTipoArchivoReporte,tipoformulasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoFormulas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFormula> tipoformulasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformula";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFormulas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFormula("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoFormula tipoformula : tipoformulasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoFormulaConstantesFunciones.generarExcelReporteDataTipoFormula("NORMAL",row,workbook,tipoformula,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Formula",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoFormula(String sTipo,Row row,Workbook workbook) {
		
		TipoFormulaConstantesFunciones.generarExcelReporteHeaderTipoFormula(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoFormulas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFormula> tipoformulasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformula_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFormulas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoFormula tipoformula : tipoformulasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoFormulaConstantesFunciones.getTipoFormulaDescripcion(tipoformula));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFormulaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFormulaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoformula.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFormulaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFormulaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoformula.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Formula",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoFormulas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFormula> tipoformulasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoFormula> tipoformulasRespaldo=null;
		
		classes=TipoFormulaConstantesFunciones.getClassesRelationshipsOfTipoFormula(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoformulaLogic.setDatosCliente(this.datosCliente);
		this.tipoformulaLogic.setDatosDeep(this.datosDeep);
		this.tipoformulaLogic.setIsConDeep(true);
		
		tipoformulasRespaldo=this.tipoformulaLogic.getTipoFormulas();
		
		this.tipoformulaLogic.setTipoFormulas(tipoformulasParaReportes);	
		this.tipoformulaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoformulasParaReportes=this.tipoformulaLogic.getTipoFormulas();
		this.tipoformulaLogic.setTipoFormulas(tipoformulasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformula_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFormulas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFormula("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoFormula tipoformula : tipoformulasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoFormula("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoFormulaConstantesFunciones.generarExcelReporteDataTipoFormula("NORMAL",row,workbook,tipoformula,cellStyleDataAux);
		
			
			


				//Formula
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormulaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoformula.getFormulas()!=null && tipoformula.getFormulas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormulaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormulaConstantesFunciones.generarExcelReporteHeaderFormula("RELACIONADO",row,workbook);
				}

				if(tipoformula.getFormulas()!=null) {
					i2=0;
					for(Formula formula : tipoformula.getFormulas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FormulaConstantesFunciones.generarExcelReporteDataFormula("RELACIONADO",row,workbook,formula,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoFormulaConstantesFunciones.getTipoFormulaDescripcion(tipoformula));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Formula",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFormula.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFormula.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFormula.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFormula.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoFormula() throws Exception {		
		this.startProcessTipoFormula(true);
	}
	
	public void startProcessTipoFormula(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoFormula, this.jScrollPanelDatosTipoFormula,this.jPanelPaginacionTipoFormula, this.jScrollPanelDatosEdicionTipoFormula, this.jPanelAccionesTipoFormula,this.jPanelAccionesFormularioTipoFormula,this.jmenuBarTipoFormula,this.jmenuBarDetalleTipoFormula,this.jTtoolBarTipoFormula,this.jTtoolBarDetalleTipoFormula);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFormula=null; 
		
		final JPanel jPanelParametrosReportesTipoFormula=this.jPanelParametrosReportesTipoFormula;
		//final JScrollPane jScrollPanelDatosTipoFormula=this.jScrollPanelDatosTipoFormula;
		final JTable jTableDatosTipoFormula=this.jTableDatosTipoFormula;		
		final JPanel jPanelPaginacionTipoFormula=this.jPanelPaginacionTipoFormula;
		//final JScrollPane jScrollPanelDatosEdicionTipoFormula=this.jScrollPanelDatosEdicionTipoFormula;
		final JPanel jPanelAccionesTipoFormula=this.jPanelAccionesTipoFormula;
		
		JPanel jPanelCamposAuxiliarTipoFormula=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoFormula=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) {
			jPanelCamposAuxiliarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jPanelCamposTipoFormula;
			jPanelAccionesFormularioAuxiliarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jPanelAccionesFormularioTipoFormula;
		}
		
		final JPanel jPanelCamposTipoFormula=jPanelCamposAuxiliarTipoFormula;
		final JPanel jPanelAccionesFormularioTipoFormula=jPanelAccionesFormularioAuxiliarTipoFormula;
		
		
		final JMenuBar jmenuBarTipoFormula=this.jmenuBarTipoFormula;
		final JToolBar jTtoolBarTipoFormula=this.jTtoolBarTipoFormula;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoFormula=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFormula=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) {
			jmenuBarDetalleAuxiliarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jmenuBarDetalleTipoFormula;
			jTtoolBarDetalleAuxiliarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jTtoolBarDetalleTipoFormula;
		}
		
		final JMenuBar jmenuBarDetalleTipoFormula=jmenuBarDetalleAuxiliarTipoFormula;
		final JToolBar jTtoolBarDetalleTipoFormula=jTtoolBarDetalleAuxiliarTipoFormula;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFormula;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFormula;
			processRunnable.jTableDatos=jTableDatosTipoFormula;
			processRunnable.jPanelCampos=jPanelCamposTipoFormula;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFormula;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFormula;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFormula;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFormula;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFormula;
			processRunnable.jTtoolBar=jTtoolBarTipoFormula;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFormula;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoFormula ,jPanelParametrosReportesTipoFormula,jTableDatosTipoFormula, /*jScrollPanelDatosTipoFormula,*/jPanelCamposTipoFormula,jPanelPaginacionTipoFormula, /*jScrollPanelDatosEdicionTipoFormula,*/ jPanelAccionesTipoFormula,jPanelAccionesFormularioTipoFormula,jmenuBarTipoFormula,jmenuBarDetalleTipoFormula,jTtoolBarTipoFormula,jTtoolBarDetalleTipoFormula);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoFormula, jScrollPanelDatosTipoFormula,jPanelPaginacionTipoFormula, jScrollPanelDatosEdicionTipoFormula, jPanelAccionesTipoFormula,jPanelAccionesFormularioTipoFormula,jmenuBarTipoFormula,jmenuBarDetalleTipoFormula,jTtoolBarTipoFormula,jTtoolBarDetalleTipoFormula);
						
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
	
	public void finishProcessTipoFormula() {// throws Exception 
		this.finishProcessTipoFormula(true);
	}
	
	public void finishProcessTipoFormula(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoFormula, this.jScrollPanelDatosTipoFormula,this.jPanelPaginacionTipoFormula, this.jScrollPanelDatosEdicionTipoFormula, this.jPanelAccionesTipoFormula,this.jPanelAccionesFormularioTipoFormula,this.jmenuBarTipoFormula,this.jmenuBarDetalleTipoFormula,this.jTtoolBarTipoFormula,this.jTtoolBarDetalleTipoFormula);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFormula=null; 
		
		final JPanel jPanelParametrosReportesTipoFormula=this.jPanelParametrosReportesTipoFormula;
		//final JScrollPane jScrollPanelDatosTipoFormula=this.jScrollPanelDatosTipoFormula;
		final JTable jTableDatosTipoFormula=this.jTableDatosTipoFormula;		
		final JPanel jPanelPaginacionTipoFormula=this.jPanelPaginacionTipoFormula;
		//final JScrollPane jScrollPanelDatosEdicionTipoFormula=this.jScrollPanelDatosEdicionTipoFormula;
		final JPanel jPanelAccionesTipoFormula=this.jPanelAccionesTipoFormula;
		
		JPanel jPanelCamposAuxiliarTipoFormula=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoFormula=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) {
			jPanelCamposAuxiliarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jPanelCamposTipoFormula;
			jPanelAccionesFormularioAuxiliarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jPanelAccionesFormularioTipoFormula;
		}
		
		final JPanel jPanelCamposTipoFormula=jPanelCamposAuxiliarTipoFormula;
		final JPanel jPanelAccionesFormularioTipoFormula=jPanelAccionesFormularioAuxiliarTipoFormula;
		
		
		final JMenuBar jmenuBarTipoFormula=this.jmenuBarTipoFormula;		
		final JToolBar jTtoolBarTipoFormula=this.jTtoolBarTipoFormula;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoFormula=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFormula=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) {
			jmenuBarDetalleAuxiliarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jmenuBarDetalleTipoFormula;
			jTtoolBarDetalleAuxiliarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jTtoolBarDetalleTipoFormula;		
		}
		
		final JMenuBar jmenuBarDetalleTipoFormula=jmenuBarDetalleAuxiliarTipoFormula;
		final JToolBar jTtoolBarDetalleTipoFormula=jTtoolBarDetalleAuxiliarTipoFormula;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFormula;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFormula;
			processRunnable.jTableDatos=jTableDatosTipoFormula;
			processRunnable.jPanelCampos=jPanelCamposTipoFormula;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFormula;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFormula;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFormula;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFormula;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFormula;
			processRunnable.jTtoolBar=jTtoolBarTipoFormula;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFormula;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoFormula ,jPanelParametrosReportesTipoFormula, jTableDatosTipoFormula,/*jScrollPanelDatosTipoFormula,*/jPanelCamposTipoFormula,jPanelPaginacionTipoFormula, /*jScrollPanelDatosEdicionTipoFormula,*/ jPanelAccionesTipoFormula,jPanelAccionesFormularioTipoFormula,jmenuBarTipoFormula,jmenuBarDetalleTipoFormula,jTtoolBarTipoFormula,jTtoolBarDetalleTipoFormula));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoFormula(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoFormula(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoFormula(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoFormula(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoFormula,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoFormula,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoFormula(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoFormula,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoFormula,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoformulaConstantesFunciones.getsFinalQueryTipoFormula();
		String  finalQueryPaginacionTodos=this.tipoformulaConstantesFunciones.getsFinalQueryTipoFormula();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoFormulaConstantesFunciones.getArrayColumnasGlobalesNoTipoFormula(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoFormulaConstantesFunciones.getArrayColumnasGlobalesTipoFormula(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoFormulaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoformulasEliminados= new ArrayList<TipoFormula>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoFormula();
		
				///*TipoFormulaSessionBean*/this.tipoformulaSessionBean=new TipoFormulaSessionBean();
			
			if(this.tipoformulaSessionBean==null) {
				this.tipoformulaSessionBean=new TipoFormulaSessionBean();
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
					this.iNumeroPaginacion=TipoFormulaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoFormulaConstantesFunciones.getClassesForeignKeysOfTipoFormula(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoformula."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoformulasAux= new ArrayList<TipoFormula>();
			
				
			tipoformulaLogic.setDatosCliente(this.datosCliente);
			tipoformulaLogic.setDatosDeep(this.datosDeep);
			tipoformulaLogic.setIsConDeep(true);
			
			
			tipoformulaLogic.getTipoFormulaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoformulaLogic.getTodosTipoFormulas(finalQueryGlobal,pagination);
					
					//tipoformulaLogic.getTodosTipoFormulasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoformulaLogic.getTipoFormulas()==null|| tipoformulaLogic.getTipoFormulas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoformulasAux= new ArrayList<TipoFormula>();
							tipoformulasAux.addAll(tipoformulaLogic.getTipoFormulas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformulasAux= new ArrayList<TipoFormula>();
							tipoformulasAux.addAll(tipoformulas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoformulaLogic.getTodosTipoFormulas(finalQueryGlobal+"",this.pagination);												
							
							//tipoformulaLogic.getTodosTipoFormulasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoFormulas("Todos",tipoformulaLogic.getTipoFormulas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoformulaLogic.setTipoFormulas(new ArrayList<TipoFormula>());					
							tipoformulaLogic.getTipoFormulas().addAll(tipoformulasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformulas=new ArrayList<TipoFormula>();
							tipoformulas.addAll(tipoformulasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoFormula=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoFormula=this.idActual;
				
				} else if(this.idTipoFormulaActual!=null && this.idTipoFormulaActual!=0L) {
					idTipoFormula=idTipoFormulaActual;
				}
				
					
				this.sDetalleReporte=TipoFormulaConstantesFunciones.getDetalleIndicePorId(idTipoFormula);
				
				this.tipoformulas=new ArrayList<TipoFormula>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoformulaLogic.getEntity(idTipoFormula);
					
					//tipoformulaLogic.getEntityWithConnection(idTipoFormula);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformulaLogic.setTipoFormulas(new ArrayList<TipoFormula>());
					tipoformulaLogic.getTipoFormulas().add(tipoformulaLogic.getTipoFormula());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoformulas=new ArrayList<TipoFormula>();
					this.tipoformulas.add(tipoformula);
				}
				
				if(tipoformulaLogic.getTipoFormula()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoFormula();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoFormula();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoformulaLogic.getTipoFormulas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoformulas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoformulaLogic.getTipoFormulas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoformulas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoFormula tipoformula) {
		Boolean permite=true;
		
		if(this.tipoformula.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoFormulaConstantesFunciones.getOrderByListaTipoFormula();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoFormulaConstantesFunciones.getOrderByListaTipoFormula();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFormula tipoformula:tipoformulaLogic.getTipoFormulas()) {
				if(tipoformula.getsType().equals(Constantes2.S_TOTALES)) {
					tipoformulaTotales=tipoformula;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFormula tipoformula:this.tipoformulas) {
				if(tipoformula.getsType().equals(Constantes2.S_TOTALES)) {
					tipoformulaTotales=tipoformula;
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
			this.tipoformulaAux=new TipoFormula();
			this.tipoformulaAux.setsType(Constantes2.S_TOTALES);
			this.tipoformulaAux.setIsNew(false);
			this.tipoformulaAux.setIsChanged(false);
			this.tipoformulaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoFormulaConstantesFunciones.TotalizarValoresFilaTipoFormula(this.tipoformulaLogic.getTipoFormulas(),this.tipoformulaAux);
				
				this.tipoformulaLogic.getTipoFormulas().add(this.tipoformulaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoFormulaConstantesFunciones.TotalizarValoresFilaTipoFormula(this.tipoformulas,this.tipoformulaAux);
				
				this.tipoformulas.add(this.tipoformulaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoformulaTotales=new TipoFormula();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoformulaLogic.getTipoFormulas().remove(tipoformulaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoformulas.remove(tipoformulaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoformulaTotales=new TipoFormula();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFormula tipoformula:tipoformulaLogic.getTipoFormulas()) {
				if(tipoformula.getsType().equals(Constantes2.S_TOTALES)) {
					tipoformulaTotales=tipoformula;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFormulaConstantesFunciones.TotalizarValoresFilaTipoFormula(this.tipoformulaLogic.getTipoFormulas(),tipoformulaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFormula tipoformula:this.tipoformulas) {
				if(tipoformula.getsType().equals(Constantes2.S_TOTALES)) {
					tipoformulaTotales=tipoformula;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFormulaConstantesFunciones.TotalizarValoresFilaTipoFormula(this.tipoformulas,tipoformulaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoFormula() {
		this.isPermisoTodoTipoFormula=false;
		this.isPermisoNuevoTipoFormula=false;
		this.isPermisoActualizarTipoFormula=false;
		this.isPermisoActualizarOriginalTipoFormula=false;
		this.isPermisoEliminarTipoFormula=false;
		this.isPermisoGuardarCambiosTipoFormula=false;
		this.isPermisoConsultaTipoFormula=false;
		this.isPermisoBusquedaTipoFormula=false;
		this.isPermisoReporteTipoFormula=false;		
		this.isPermisoOrdenTipoFormula=false;		
		this.isPermisoPaginacionMedioTipoFormula=false;		
		this.isPermisoPaginacionAltoTipoFormula=false;
		this.isPermisoPaginacionTodoTipoFormula=false;
		this.isPermisoCopiarTipoFormula=false;		
		this.isPermisoVerFormTipoFormula=false;		
		this.isPermisoDuplicarTipoFormula=false;		
		this.isPermisoOrdenTipoFormula=false;		
	}
	
	public void setPermisosUsuarioTipoFormula(Boolean isPermiso) {
		this.isPermisoTodoTipoFormula=isPermiso;
		this.isPermisoNuevoTipoFormula=isPermiso;
		this.isPermisoActualizarTipoFormula=isPermiso;
		this.isPermisoActualizarOriginalTipoFormula=isPermiso;
		this.isPermisoEliminarTipoFormula=isPermiso;
		this.isPermisoGuardarCambiosTipoFormula=isPermiso;
		this.isPermisoConsultaTipoFormula=isPermiso;
		this.isPermisoBusquedaTipoFormula=isPermiso;
		this.isPermisoReporteTipoFormula=isPermiso;
		this.isPermisoOrdenTipoFormula=isPermiso;		
		this.isPermisoPaginacionMedioTipoFormula=isPermiso;		
		this.isPermisoPaginacionAltoTipoFormula=isPermiso;		
		this.isPermisoPaginacionTodoTipoFormula=isPermiso;		
		this.isPermisoCopiarTipoFormula=isPermiso;		
		this.isPermisoVerFormTipoFormula=isPermiso;		
		this.isPermisoDuplicarTipoFormula=isPermiso;
		this.isPermisoOrdenTipoFormula=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoFormula(Boolean isPermiso) {
		//this.isPermisoTodoTipoFormula=isPermiso;
		this.isPermisoNuevoTipoFormula=isPermiso;
		this.isPermisoActualizarTipoFormula=isPermiso;
		this.isPermisoActualizarOriginalTipoFormula=isPermiso;
		this.isPermisoEliminarTipoFormula=isPermiso;
		this.isPermisoGuardarCambiosTipoFormula=isPermiso;
		//this.isPermisoConsultaTipoFormula=isPermiso;
		//this.isPermisoBusquedaTipoFormula=isPermiso;
		//this.isPermisoReporteTipoFormula=isPermiso;
		//this.isPermisoOrdenTipoFormula=isPermiso;		
		//this.isPermisoPaginacionMedioTipoFormula=isPermiso;		
		//this.isPermisoPaginacionAltoTipoFormula=isPermiso;		
		//this.isPermisoPaginacionTodoTipoFormula=isPermiso;		
		//this.isPermisoCopiarTipoFormula=isPermiso;		
		//this.isPermisoDuplicarTipoFormula=isPermiso;
		//this.isPermisoOrdenTipoFormula=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoFormulaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FormulaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoFormulaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFormula=false;
		this.isTienePermisosFormula=this.verificarGetPermisosUsuarioOpcionTipoFormulaClaseRelacionada(this.opcionsRelacionadas,FormulaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoFormula(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoFormulaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFormula=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoFormulaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoFormulaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoFormulaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFormula && this.jInternalFrameDetalleFormTipoFormula!=null && this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoFormula.jTabbedPaneRelacionesTipoFormula.remove(this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoFormula() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoFormulaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoFormulaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoFormula=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoFormula=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoFormula=this.isPermisoActualizarTipoFormula;
			this.isPermisoEliminarTipoFormula=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoFormula=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoFormula=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoFormula=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoFormula=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoFormula=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFormula=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoFormula=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoFormula=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoFormula=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoFormula=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoFormula=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoFormula=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFormula=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoFormula.setToolTipText(this.jTableDatosTipoFormula.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoFormula(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoFormula(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoFormulaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoFormulaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoFormula() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFormula && this.tipoformulaConstantesFunciones.mostrarFormulaTipoFormula && !TipoFormulaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Formula");
			reporte.setsDescripcion("Formula");
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
	
		
	public void inicializarCombosForeignKeyTipoFormulaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoFormulaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoFormulaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoFormulaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoFormulaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoFormula()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoFormula()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoFormula(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoFormula()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFormula();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoFormula(TipoFormula tipoformula)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoFormula(TipoFormula tipoformula,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoFormula()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFormula()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoFormula()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoFormula()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoFormula()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoFormula()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoFormula(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoFormula()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoFormulaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoFormulaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoFormulaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoformulaSessionBean=new TipoFormulaSessionBean(); 
		this.tipoformulaConstantesFunciones=new TipoFormulaConstantesFunciones(); 
		this.tipoformulaBean=new TipoFormula();//(this.tipoformulaConstantesFunciones); 		
		this.tipoformulaReturnGeneral=new TipoFormulaParameterReturnGeneral(); 
		
		this.tipoformulaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoformulaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoFormulaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoFormulaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoFormulaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoFormula(true);
			
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
			
			this.tipoformulaConstantesFunciones=new TipoFormulaConstantesFunciones(); 
			this.tipoformulaBean=new TipoFormula();//this.tipoformulaConstantesFunciones); 			
			this.tipoformulaReturnGeneral=new TipoFormulaParameterReturnGeneral(); 
		
			TipoFormulaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Formula Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoformula=new TipoFormula();
			this.tipoformulas = new ArrayList<TipoFormula>();
			this.tipoformulasAux = new ArrayList<TipoFormula>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic=new TipoFormulaLogic();
				this.tipoformulaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoformulaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoformulaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoFormula);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoFormula!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFormula);	
					}
					
					if(this.jInternalFrameImportacionTipoFormula!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFormula);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoFormula!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoFormula);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoFormula!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFormula);
				this.jInternalFrameDetalleFormTipoFormula.setVisible(false);
				this.jInternalFrameDetalleFormTipoFormula.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoFormula!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFormula);
					this.jInternalFrameReporteDinamicoTipoFormula.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoFormula.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoFormula!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoFormula);
					this.jInternalFrameImportacionTipoFormula.setVisible(false);
					this.jInternalFrameImportacionTipoFormula.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoFormula!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoFormula);
					this.jInternalFrameOrderByTipoFormula.setVisible(false);
					this.jInternalFrameOrderByTipoFormula.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoFormulaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoFormulaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoformulaReturnGeneral=new TipoFormulaParameterReturnGeneral();
			
			this.tipoformulaParameterGeneral=new TipoFormulaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoformulaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoFormulaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FormulaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFormulaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoformulaSessionBean.getEsGuardarRelacionado(),this.tipoformulaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFormulaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoformulaSessionBean.getEsGuardarRelacionado(),this.tipoformulaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoFormula=false;
			this.isVisibilidadCeldaDuplicarTipoFormula=true;
			this.isVisibilidadCeldaCopiarTipoFormula=true;
			this.isVisibilidadCeldaVerFormTipoFormula=true;
			this.isVisibilidadCeldaOrdenTipoFormula=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormula=false;
			this.isVisibilidadCeldaModificarTipoFormula=false;
			this.isVisibilidadCeldaActualizarTipoFormula=false;
			this.isVisibilidadCeldaEliminarTipoFormula=false;
			this.isVisibilidadCeldaCancelarTipoFormula=false;
			this.isVisibilidadCeldaGuardarTipoFormula=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormula=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoFormula("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoFormula();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoFormula(false);
			
			this.setPermisosUsuarioTipoFormula();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoformulaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoformulaSessionBean.getEsGuardarRelacionado() && this.tipoformulaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoFormulaClasesRelacionadas();
			}
			
			if(this.tipoformulaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoFormulaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoFormulaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoFormula();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoFormula();
			}
			
			if(!this.isPermisoBusquedaTipoFormula) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoFormula,this.isPermisoPaginacionMedioTipoFormula,this.isPermisoPaginacionTodoTipoFormula);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoFormulaConstantesFunciones.getTiposSeleccionarTipoFormula());
				
				this.tiposColumnasSelect=TipoFormulaConstantesFunciones.getTiposSeleccionarTipoFormula(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoFormula();				
				//this.tiposRelacionesSelect=TipoFormulaConstantesFunciones.getTiposRelacionesTipoFormula(true);
				
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
			//if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoFormula();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoFormula(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoFormula(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFormula() ;
			
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
			
			
			this.formulaLogic=new FormulaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoformulaImplementable= (TipoFormulaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFormulaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoformulaImplementableHome= (TipoFormulaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFormulaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoformulas= new ArrayList<TipoFormula>();
			this.tipoformulasEliminados= new ArrayList<TipoFormula>();
						
			this.isEsNuevoTipoFormula=false;
			this.esParaAccionDesdeFormularioTipoFormula=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoFormula(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoFormula();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoFormulaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoFormula("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoFormula(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoFormula!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoFormula();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoFormula();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoFormula(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoFormula: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoFormula() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FormulaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FormulaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoFormula")) {
				iIndex=this.jInternalFrameDetalleFormTipoFormula.jTabbedPaneRelacionesTipoFormula.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoFormula.jTabbedPaneRelacionesTipoFormula.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();	
				
				

				if(sTitle.equals("Formulas")) {
					if(!FormulaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoFormula();

						this.cargarParteTabPanelRelacionadaFormula(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoFormula();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFormula(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoFormula.cargarSessionConBeanSwingJInternalFrameFormula(false,true,iIndex);
		this.jButtonFormulaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormula();

		//this.jTabbedPaneRelacionesTipoFormula.updateUI();
		//this.jTabbedPaneRelacionesTipoFormula.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoFormula.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Formula")) {
				int row=this.jTableDatosTipoFormula.getSelectedRow();
				jButtonFormulaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Formula")) {

					if(this.isTienePermisosFormula && this.tipoformulaConstantesFunciones.mostrarFormulaTipoFormula && !TipoFormulaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Formulas"+"("+FormulaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Formulas");

						if(tipoformulaConstantesFunciones.resaltarFormulaTipoFormula!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoformulaConstantesFunciones.resaltarFormulaTipoFormula);
						}

						jmenuItem.setEnabled(this.tipoformulaConstantesFunciones.activarFormulaTipoFormula);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Formula"));

						

						this.jInternalFrameDetalleFormTipoFormula.jmenuDetalleTipoFormula.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoFormula(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoFormula(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoFormula(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoFormulaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoFormula();
		
		this.cargarCombosFrameForeignKeyTipoFormula();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoFormula();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoFormula();
		}
	}
	
	
	
	public void jButtonNuevoTipoFormulaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoformulaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoFormula==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
			
			
			if(jTableDatosTipoFormula.getRowCount()>=1) {
				jTableDatosTipoFormula.removeRowSelectionInterval(0, jTableDatosTipoFormula.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoFormula=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoFormula(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoFormula(true);			
			//this.tipoformula=new TipoFormula();
			//this.tipoformula.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFormula(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFormula() ;
			
			if(TipoFormulaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFormula(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoformula);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoformula);				
			
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
			
			if(this.tipoformulaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoFormula: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoFormulaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoFormula> tipoformulasSeleccionados=new ArrayList<TipoFormula>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoFormula.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoFormula.getSelectedRows().length;			
			}
			
			tipoformulasSeleccionados=this.getTipoFormulasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoFormula--;			
				//TipoFormula tipoformulaAux= new TipoFormula();			
				//tipoformulaAux.setId(this.iIdNuevoTipoFormula);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoFormula tipoformulaOrigen=new TipoFormula();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoFormula tipoformulaOrigen : tipoformulasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoformulaOrigen =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformulaOrigen =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoFormula();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoformula.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoFormula(tipoformulaOrigen,this.tipoformula,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormula(this.tipoformula);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoformulaLogic.getTipoFormulas().add(this.tipoformulaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoformulas.add(this.tipoformulaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoFormula(false);
				
				this.jTableDatosTipoFormula.setRowSelectionInterval(this.getIndiceNuevoTipoFormula(), this.getIndiceNuevoTipoFormula());
				
				int iLastRow =  this.jTableDatosTipoFormula.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFormula.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFormula.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFormula(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoFormula> tipoformulasSeleccionados=new ArrayList<TipoFormula>();									
		
			TipoFormula tipoformulaOrigen=new TipoFormula();
			TipoFormula tipoformulaDestino=new TipoFormula();
				
			tipoformulasSeleccionados=this.getTipoFormulasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoFormula.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoformulasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoFormula.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformulaOrigen =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoformulaOrigen =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformulaDestino =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoformulaDestino =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoformulaOrigen =tipoformulasSeleccionados.get(0);
				tipoformulaDestino =tipoformulasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoFormula(tipoformulaOrigen,tipoformulaDestino,true,false);
				
				tipoformulaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoformulaDestino,tipoformulaLogic.getTipoFormulas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoformulaDestino,tipoformulas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoFormula(false);
				
				//this.jTableDatosTipoFormula.setRowSelectionInterval(this.getIndiceNuevoTipoFormula(), this.getIndiceNuevoTipoFormula());
				
				int iLastRow =  this.jTableDatosTipoFormula.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFormula.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFormula.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFormula(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFormula==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoFormula.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoFormula.isVisible();
			
			
			this.jPanelParametrosReportesTipoFormula.setVisible(!isVisible);
			this.jPanelPaginacionTipoFormula.setVisible(!isVisible);
			this.jPanelAccionesTipoFormula.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoFormula();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoFormula();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoFormula();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoFormula();
			
			this.abrirFrameOrderByTipoFormula();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoFormula();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoFormula(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFormula);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoFormula.isMaximum()) {
					this.jInternalFrameDetalleFormTipoFormula.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoFormula.setSize(this.jInternalFrameDetalleFormTipoFormula.iWidthFormulario,this.jInternalFrameDetalleFormTipoFormula.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoFormula.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoFormula.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoFormula.isMaximum()) {
						this.jInternalFrameDetalleFormTipoFormula.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoFormula.jContentPaneDetalleTipoFormula.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoFormula.jTabbedPaneRelacionesTipoFormula.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoFormula.jContentPaneDetalleTipoFormula.getWidth(),TipoFormulaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFormula.jTabbedPaneRelacionesTipoFormula.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoFormula.jContentPaneDetalleTipoFormula.getWidth(),TipoFormulaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFormula.jTabbedPaneRelacionesTipoFormula.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoFormula.jContentPaneDetalleTipoFormula.getWidth(),TipoFormulaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FormulaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormula();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoFormula.setVisible(true);
	        this.jInternalFrameDetalleFormTipoFormula.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoFormula() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoFormula==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoFormula=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFormula,false,this);
				} else {
					this.jInternalFrameOrderByTipoFormula=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFormula,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoFormula);
				this.jInternalFrameOrderByTipoFormula.setVisible(false);
				this.jInternalFrameOrderByTipoFormula.setSelected(false);
				
				this.jInternalFrameOrderByTipoFormula.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFormula"));
				
				this.inicializarActualizarBindingTablaOrderByTipoFormula();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoFormula() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoFormula==null) {
				
				this.jInternalFrameImportacionTipoFormula=new ImportacionJInternalFrame(TipoFormulaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFormula);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoFormula);
				this.jInternalFrameImportacionTipoFormula.setVisible(false);
				this.jInternalFrameImportacionTipoFormula.setSelected(false);


				this.jInternalFrameImportacionTipoFormula.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFormula"));
				this.jInternalFrameImportacionTipoFormula.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFormula"));
				this.jInternalFrameImportacionTipoFormula.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFormula"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoFormula() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoFormula==null) {
				this.jInternalFrameReporteDinamicoTipoFormula=new ReporteDinamicoJInternalFrame(TipoFormulaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFormula);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFormula);
				this.jInternalFrameReporteDinamicoTipoFormula.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoFormula.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoFormula.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFormula"));
				this.jInternalFrameReporteDinamicoTipoFormula.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFormula"));
				this.jInternalFrameReporteDinamicoTipoFormula.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFormula"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFormula();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFormula() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.jScrollPanelDatosFormula.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoFormula.jContentPaneDetalleTipoFormula.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.jScrollPanelDatosFormula.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.jScrollPanelDatosFormula.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.jScrollPanelDatosFormula.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoFormula() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFormula);
			
	       	this.jInternalFrameDetalleFormTipoFormula.setVisible(false);
	        this.jInternalFrameDetalleFormTipoFormula.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoFormula.dispose();
			//this.jInternalFrameDetalleFormTipoFormula=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoFormula() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoFormula.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoFormula.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoFormula() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoFormula.setVisible(true);
	        this.jInternalFrameImportacionTipoFormula.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoFormula() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoFormula.setVisible(true);
	        this.jInternalFrameOrderByTipoFormula.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoFormula() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoFormula.setVisible(false);
	        this.jInternalFrameOrderByTipoFormula.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoFormula() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoFormula.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoFormula.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoFormula() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoFormula.setVisible(false);
	        this.jInternalFrameImportacionTipoFormula.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoFormula(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoFormula(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoFormula(true);
			//this.isEsNuevoTipoFormula=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformula =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoformula =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoFormula("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFormula(false) ;
			
			if(tipoformulaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.formulaSessionBean.getEsGuardarRelacionado() && FormulaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormulaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoFormulaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFormula(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFormula(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoFormulaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformula =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformula =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoFormula(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFormula==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoFormula(true);
			//this.isEsNuevoTipoFormula=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformula =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoformula =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoformula.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoFormula("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoFormula(false) ;
			
			if(TipoFormulaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFormula(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFormula(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoFormula(false);
			
			//if(!this.isEsNuevoTipoFormula) {								
				int intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformula =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoformula =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoFormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoFormula(this.tipoformula,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFormula(this.tipoformula);
				
			}
			
			if(this.permiteMantenimiento(this.tipoformula)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoFormula=true;
					this.inicializarActualizarBindingTablaTipoFormula(false);
					this.isEsNuevoTipoFormula=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoFormula=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoFormula=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFormula(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFormula(false);
				
				this.habilitarDeshabilitarControlesTipoFormula(false);
			
												
				
				if(TipoFormulaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoFormula();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoFormulaActionPerformed(evt,tipoformulaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoFormula(this.tipoformula,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoFormula.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoformulaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoformula.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoFormula.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormula.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoFormulaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformula =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				this.tipoformula.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoformula =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				this.tipoformula.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoformula)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoFormulaModel) this.jTableDatosTipoFormula.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoFormula=true;
				this.inicializarActualizarBindingTablaTipoFormula(false);
				this.isEsNuevoTipoFormula=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFormula(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFormula(false);
				
				this.habilitarDeshabilitarControlesTipoFormula(false);
				
				
				
				if(TipoFormulaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoFormula();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoFormulaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoFormula.getRowCount()>=1) {
				jTableDatosTipoFormula.removeRowSelectionInterval(0, jTableDatosTipoFormula.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoFormula(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoFormula(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFormula(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFormula(false) ;
			
			this.isEsNuevoTipoFormula=false;
			
			if(TipoFormulaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoFormula();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoFormulaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoFormula(false);
				
				//SI ES MANUAL
				if(TipoFormulaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoFormula();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoFormulaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoFormula--;			
			//TipoFormula tipoformulaAux= new TipoFormula();			
			//tipoformulaAux.setId(this.iIdNuevoTipoFormula);
			
			if(this.jInternalFrameDetalleFormTipoFormula==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoFormula();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoFormula(this.tipoformula);
			
			this.tipoformula.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoformulaLogic.getTipoFormulas().add(this.tipoformulaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoformulas.add(this.tipoformulaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoFormula(false);
			
			this.jTableDatosTipoFormula.setRowSelectionInterval(this.getIndiceNuevoTipoFormula(), this.getIndiceNuevoTipoFormula());
			
			int iLastRow =  this.jTableDatosTipoFormula.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoFormula.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoFormula.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoFormula(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoFormulaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoFormula(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFormula(false);
			
			//SI ES MANUAL
			if(TipoFormulaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFormula();
			}
			
			//this.abrirFrameTreeTipoFormula();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoFormulaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo FormulaS ?", "MANTENIMIENTO DE Tipo Formula", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoFormula.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoFormula();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoformulaReturnGeneral=tipoformulaLogic.procesarImportacionTipoFormulasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoformulaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoFormulaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoFormulaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoFormula.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoFormula.setFileImportacion(this.jInternalFrameImportacionTipoFormula.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoFormula.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoFormula.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoFormula.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoFormula.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoFormulaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoFormula> tipoformulasSeleccionados=new ArrayList<TipoFormula>();		

		tipoformulasSeleccionados=this.getTipoFormulasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFormula.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFormula.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoFormulaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoFormulaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoFormulas("Todos",tipoformulasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Formula",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFormula.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFormula.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFormulaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoFormulaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTipoFormula.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFormula.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFormula.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoFormulaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoFormulaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoFormula.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoFormulaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoFormulaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoFormula.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFormula.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFormulaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoFormulaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoFormulaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoFormula> tipoformulasSeleccionados=new ArrayList<TipoFormula>();		
		
		tipoformulasSeleccionados=this.getTipoFormulasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformula";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoFormulas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoFormula.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFormula.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoFormulaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFormulaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoFormula tipoformula:tipoformulasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoformula.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoFormulaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFormulaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoFormula tipoformula:tipoformulasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoformula.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoFormula(row);				
			//	iRow++;
			//}				
			
			//for(TipoFormula tipoformulaAux:tipoformulasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoFormula(tipoformulaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Formula",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoformulaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFormula(false);
			
			//SI ES MANUAL
			if(TipoFormulaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFormula();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoFormulaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFormula(false);
			
			//SI ES MANUAL
			if(TipoFormulaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFormula();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoFormulaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFormula(false);
			
			//SI ES MANUAL
			if(TipoFormulaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFormula();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformulaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoFormula() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoFormula.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoFormula.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoFormula.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoFormula.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoFormula.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoFormula.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoFormula.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoFormula(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoFormula(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoFormula(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoFormula(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoFormula(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoFormula(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFormula(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoFormula(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoFormulaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoFormulaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoFormula() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoFormula();
		
		this.inicializarActualizarBindingBotonesManualTipoFormula(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFormula();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFormula() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFormula(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFormula(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoFormula.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoFormula.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoFormula.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoFormula!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoFormula.jCheckBoxPostAccionNuevoTipoFormula.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoFormula.jCheckBoxPostAccionSinCerrarTipoFormula.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoFormula.jCheckBoxPostAccionSinMensajeTipoFormula.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoFormula.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoFormula.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoFormula.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoFormula!=null) {
				this.jInternalFrameDetalleFormTipoFormula.jCheckBoxPostAccionNuevoTipoFormula.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoFormula.jCheckBoxPostAccionSinCerrarTipoFormula.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoFormula.jCheckBoxPostAccionSinMensajeTipoFormula.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoFormula.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoFormula.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoFormula!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoFormula.jComboBoxTiposAccionesFormularioTipoFormula.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoFormula.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoFormula!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFormula.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoFormula.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoFormula.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoFormula.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoFormula.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoFormula!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFormula.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoFormula.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoFormula.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoFormula(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoFormulaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFormula(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoFormula() throws Exception {
		try	{
			if(TipoFormulaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFormula();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFormula() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoFormula.jComboBoxTiposAccionesFormularioTipoFormula.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoFormula.jComboBoxTiposAccionesFormularioTipoFormula.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFormula() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoFormula.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoFormula.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoFormula.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoFormula.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoFormula.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoFormula.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoFormula.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoFormula.addItem(reporte);
			}
			
			
			if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoFormula.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoFormula.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoFormula.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoFormula.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoFormula.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoFormula.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoFormula.jComboBoxTiposAccionesFormularioTipoFormula.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoFormula.jComboBoxTiposAccionesFormularioTipoFormula.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoFormula.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoFormula.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoFormula.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFormula();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFormula() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFormula!=null) {
				this.jInternalFrameReporteDinamicoTipoFormula.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFormula.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFormula!=null) {
				this.jInternalFrameReporteDinamicoTipoFormula.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFormula.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoFormula!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoFormula.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFormula.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFormula.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoFormula.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFormula.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFormula.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoFormula()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoFormula(Boolean esInicializar) throws Exception {				
		if(TipoFormulaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFormula();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoFormula() throws Exception {
		this.inicializarActualizarBindingTablaTipoFormula(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoFormula() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoFormula.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoFormula.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFormula.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoFormulaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoFormula.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFormula.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoFormulaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoFormulaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFormulaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoFormulaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoFormula.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFormula.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoFormulaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoFormula.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoFormula(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoformulaLogic.getTipoFormulas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoformulas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoFormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoFormula.setModel(new TipoFormulaModel(this.tipoformulaLogic.getTipoFormulas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoFormula.setModel(new TipoFormulaModel(this.tipoformulas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoFormula!=null && this.jInternalFrameOrderByTipoFormula.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoFormula();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoFormula.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFormula,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoFormulaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO,tipoformulaConstantesFunciones.resaltarSeleccionarTipoFormula,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoFormulaConstantesFunciones.SCLASSWEBTITULO,tipoformulaConstantesFunciones.resaltarSeleccionarTipoFormula,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoFormula.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFormula,TipoFormulaConstantesFunciones.LABEL_ID));

		if(this.tipoformulaConstantesFunciones.mostraridTipoFormula && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFormulaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoformulaConstantesFunciones.resaltaridTipoFormula,this.tipoformulaConstantesFunciones.activaridTipoFormula,this,true,"idTipoFormula","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoformulaConstantesFunciones.resaltaridTipoFormula,this.tipoformulaConstantesFunciones.activaridTipoFormula,this,true,"idTipoFormula","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFormula.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFormula,TipoFormulaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoformulaConstantesFunciones.mostrarnombreTipoFormula && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFormulaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoformulaConstantesFunciones.resaltarnombreTipoFormula,this.tipoformulaConstantesFunciones.activarnombreTipoFormula,this,true,"nombreTipoFormula","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoformulaConstantesFunciones.resaltarnombreTipoFormula,this.tipoformulaConstantesFunciones.activarnombreTipoFormula,this,true,"nombreTipoFormula","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFormulaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFormula.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFormula,TipoFormulaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipoformulaConstantesFunciones.mostrardescripcionTipoFormula && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFormulaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoformulaConstantesFunciones.resaltardescripcionTipoFormula,this.tipoformulaConstantesFunciones.activardescripcionTipoFormula,this,true,"descripcionTipoFormula","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoformulaConstantesFunciones.resaltardescripcionTipoFormula,this.tipoformulaConstantesFunciones.activardescripcionTipoFormula,this,true,"descripcionTipoFormula","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFormulaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFormula && this.tipoformulaConstantesFunciones.mostrarFormulaTipoFormula && !TipoFormulaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Formulas");
				tableColumn.setHeaderValue("Formulas");
				tableColumn.setCellRenderer(new FormulaTableCell(tipoformulaConstantesFunciones.resaltarFormulaTipoFormula,this,this.tipoformulaConstantesFunciones.activarFormulaTipoFormula));
				tableColumn.setCellEditor(new FormulaTableCell(tipoformulaConstantesFunciones.resaltarFormulaTipoFormula,this,this.tipoformulaConstantesFunciones.activarFormulaTipoFormula));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoFormula.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoformulaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoformulaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFormula.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoformulaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoformulaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFormula.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoFormula && this.isPermisoGuardarCambiosTipoFormula) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoformulaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoformulaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoFormula.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoformulaSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoFormula.addColumn(tableColumn);
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
			
			this.jTableDatosTipoFormula.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFormula && this.isPermisoGuardarCambiosTipoFormula) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoformulaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFormula && this.isPermisoGuardarCambiosTipoFormula) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoFormula.moveColumn(this.jTableDatosTipoFormula.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoFormula.moveColumn(this.jTableDatosTipoFormula.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoformulaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoFormula.moveColumn(this.jTableDatosTipoFormula.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoFormula.moveColumn(this.jTableDatosTipoFormula.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoFormula.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoFormula.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoFormula,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoFormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoFormula.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoFormula.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoFormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoFormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoFormula.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoFormula.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoFormula.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoformulaLogic.getTipoFormulas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoformulas.size()-1;
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
		//this.jTableDatosTipoFormula.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoFormula.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoFormula();
			
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
				
				//this.isEsNuevoTipoFormula=false;
					
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
			
				if(this.tipoformulaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoFormula==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFormula.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFormula.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformula =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformula =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoformula.getsType().equals("DUPLICADO")
				   || this.tipoformula.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoFormula=true;
				
				} else {
					this.isEsNuevoTipoFormula=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoformula.getId()>=0 && !this.tipoformula.getIsNew()) {						
						this.isEsNuevoTipoFormula=false;
						
					} else {
						this.isEsNuevoTipoFormula=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoFormula(esRelaciones);						
				
				this.seleccionarTipoFormula(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoformula.getId()<0) {
					this.isEsNuevoTipoFormula=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoFormula(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoFormula(evt,rowIndex);
				}	
				
				if(this.tipoformulaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoFormula: " + this.dDif); 
					}
				}								
				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoFormula(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoformula)) {
					if(this.tipoformula.getId()>0) {
						this.tipoformula.setIsDeleted(true);
						
						this.tipoformulasEliminados.add(this.tipoformula);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoformulaLogic.getTipoFormulas().remove(this.tipoformula);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoformulas.remove(this.tipoformula);				
					}
					
					
					((TipoFormulaModel) this.jTableDatosTipoFormula.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFormula(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoFormula(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoFormula) {
			
			if(this.jInternalFrameDetalleFormTipoFormula==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFormula.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFormula.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformula =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformula =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoFormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoFormula(this.tipoformula);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoFormula("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoFormula(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFormula() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFormula(TipoFormula tipoformula) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoFormula(tipoformula,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFormula(TipoFormula tipoformula,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoFormula(tipoformula);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoFormula(tipoformula,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoFormula(tipoformula);
	}
	
	public void setVariablesObjetoActualToFormularioTipoFormula(TipoFormula tipoformula) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoFormula==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoFormula.jTextFieldidTipoFormula.setText(tipoformula.getId().toString());
			this.jInternalFrameDetalleFormTipoFormula.jTextAreanombreTipoFormula.setText(tipoformula.getnombre());
			this.jInternalFrameDetalleFormTipoFormula.jTextAreadescripcionTipoFormula.setText(tipoformula.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoFormula tipoformulaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoformulaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoFormula tipoformulaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoformulaLocal=this.tipoformula;
			} else {
				tipoformulaLocal=this.tipoformulaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoformulaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoFormula(tipoformulaLocal,true);
					
					if(tipoformulaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoformulaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoformulaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoFormula(TipoFormula tipoformula,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFormula(tipoformula,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFormula(tipoformula);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFormula(TipoFormula tipoformula,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFormula(tipoformula,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFormula(TipoFormula tipoformula,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoFormula==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoFormula.jTextFieldidTipoFormula.getText()==null || this.jInternalFrameDetalleFormTipoFormula.jTextFieldidTipoFormula.getText()=="" || this.jInternalFrameDetalleFormTipoFormula.jTextFieldidTipoFormula.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoFormula.jTextFieldidTipoFormula.setText("0");
			}

			if(conColumnasBase) {tipoformula.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoFormula.jTextFieldidTipoFormula.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFormulaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFormula.jLabelIdTipoFormula,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoformula.setnombre(this.jInternalFrameDetalleFormTipoFormula.jTextAreanombreTipoFormula.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFormulaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFormula.jLabelnombreTipoFormula,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoformula.setdescripcion(this.jInternalFrameDetalleFormTipoFormula.jTextAreadescripcionTipoFormula.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFormulaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFormula.jLabeldescripcionTipoFormula,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFormula(TipoFormula tipoformulaBean,TipoFormula tipoformula,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoFormula(TipoFormula tipoformulaOrigen,TipoFormula tipoformula,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoformulaOrigen.getId()!=null && !tipoformulaOrigen.getId().equals(0L))) {tipoformula.setId(tipoformulaOrigen.getId());}}
			if(conDefault || (!conDefault && tipoformulaOrigen.getnombre()!=null && !tipoformulaOrigen.getnombre().equals(""))) {tipoformula.setnombre(tipoformulaOrigen.getnombre());}
			if(conDefault || (!conDefault && tipoformulaOrigen.getdescripcion()!=null && !tipoformulaOrigen.getdescripcion().equals(""))) {tipoformula.setdescripcion(tipoformulaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFormula(TipoFormula tipoformula) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFormula.jTextFieldidTipoFormula.setText(tipoformula.getId().toString());
			this.jInternalFrameDetalleFormTipoFormula.jTextAreanombreTipoFormula.setText(tipoformula.getnombre());
			this.jInternalFrameDetalleFormTipoFormula.jTextAreadescripcionTipoFormula.setText(tipoformula.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFormula(TipoFormulaBean tipoformulaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFormula.jTextFieldidTipoFormula.setText(tipoformulaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoFormula.jTextAreanombreTipoFormula.setText(tipoformulaBean.getnombre());
			this.jInternalFrameDetalleFormTipoFormula.jTextAreadescripcionTipoFormula.setText(tipoformulaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoFormula(TipoFormulaParameterReturnGeneral tipoformulaReturnGeneral,TipoFormulaBean tipoformulaBean,Boolean conDefault) throws Exception { 
		try {
			TipoFormula tipoformulaLocal=new TipoFormula();
			
			tipoformulaLocal=tipoformulaReturnGeneral.getTipoFormula();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoformulaLocal.getId()!=null && !tipoformulaLocal.getId().equals(0L))) {tipoformulaBean.setId(tipoformulaLocal.getId());}}
			if(conDefault || (!conDefault && tipoformulaLocal.getnombre()!=null && !tipoformulaLocal.getnombre().equals(""))) {tipoformulaBean.setnombre(tipoformulaLocal.getnombre());}
			if(conDefault || (!conDefault && tipoformulaLocal.getdescripcion()!=null && !tipoformulaLocal.getdescripcion().equals(""))) {tipoformulaBean.setdescripcion(tipoformulaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoFormulaGenerico(Long idTipoFormulaSeleccionado,JComboBox jComboBoxTipoFormula,List<TipoFormula> tipoformulasLocal)throws Exception {
		try {
			TipoFormula  tipoformulaTemp=null;

			for(TipoFormula tipoformulaAux:tipoformulasLocal) {
				if(tipoformulaAux.getId()!=null && tipoformulaAux.getId().equals(idTipoFormulaSeleccionado)) {
					tipoformulaTemp=tipoformulaAux;
					break;
				}
			}

			jComboBoxTipoFormula.setSelectedItem(tipoformulaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoFormulaGenerico(JComboBox jComboBoxTipoFormula,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFormula.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoFormula.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFormula.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoFormula.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Formula")) {
			jButtonFormulaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoformula=(TipoFormula) tipoformulaLogic.getTipoFormulas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoformula =(TipoFormula) tipoformulas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoFormula tipoformulaRow=new TipoFormula();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoformulaRow=(TipoFormula) tipoformulaLogic.getTipoFormulas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoformulaRow=(TipoFormula) tipoformulas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFormulaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoFormula tipoformula) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoFormula==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformula = (TipoFormula)this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoformula = (TipoFormula)this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoformula!=null) {
						this.tipoformula = tipoformula;
					} else {
						this.tipoformula = new TipoFormula();
					}
				}

				if(this.isTienePermisosFormula && this.permiteMantenimiento(this.tipoformula)) {
					FormulaBeanSwingJInternalFrame formulaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFramePopup=new FormulaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formulaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFramePopup;
					} else {
						formulaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame;
					}

					List<TipoFormula> tipoformulas=new ArrayList<TipoFormula>();
					tipoformulas.add(this.tipoformula);
					if(!esRelacionado) {
						//formulaBeanSwingJInternalFrame.formulaSessionBean.setConGuardarRelaciones(false);
						//formulaBeanSwingJInternalFrame.formulaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formulaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoFormula.cargarFormulaBeanSwingJInternalFrame(tipoformulas,this.tipoformula,formulaBeanSwingJInternalFrame,/*conInicializar,*/formulaBeanSwingJInternalFrame.formulaSessionBean.getConGuardarRelaciones(),formulaBeanSwingJInternalFrame.formulaSessionBean.getEsGuardarRelacionado());
					formulaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formulaBeanSwingJInternalFrame.actualizarEstadoPanelsFormula("no_relacionado");

						formulaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormulaConstantesFunciones.ITAMANIOFILATABLA + (FormulaConstantesFunciones.ITAMANIOFILATABLA/2));

						formulaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoFormula=(TitledBorder)this.jScrollPanelDatosTipoFormula.getBorder();
						TitledBorder titledBorderFormula=(TitledBorder)formulaBeanSwingJInternalFrame.jScrollPanelDatosFormula.getBorder();

						titledBorderFormula.setTitle(titledBorderTipoFormula.getTitle() + " -> Formula");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formulaBeanSwingJInternalFrame);
						}

						formulaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formulaBeanSwingJInternalFrame);

						formulaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoformulaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Formula",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoFormula(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoFormula.setVisible((this.isVisibilidadCeldaNuevoTipoFormula && this.isPermisoNuevoTipoFormula));			
			this.jButtonDuplicarTipoFormula.setVisible((this.isVisibilidadCeldaDuplicarTipoFormula && this.isPermisoDuplicarTipoFormula));			
			this.jButtonCopiarTipoFormula.setVisible((this.isVisibilidadCeldaCopiarTipoFormula && this.isPermisoCopiarTipoFormula));
			this.jButtonVerFormTipoFormula.setVisible((this.isVisibilidadCeldaVerFormTipoFormula && this.isPermisoVerFormTipoFormula));
			
			this.jButtonAbrirOrderByTipoFormula.setVisible((this.isVisibilidadCeldaOrdenTipoFormula && this.isPermisoOrdenTipoFormula));			
			
			this.jButtonNuevoRelacionesTipoFormula.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFormula && this.isPermisoNuevoTipoFormula));			
			this.jButtonNuevoGuardarCambiosTipoFormula.setVisible((this.isVisibilidadCeldaNuevoTipoFormula && this.isPermisoNuevoTipoFormula && this.isPermisoGuardarCambiosTipoFormula));
			
			if(this.jInternalFrameDetalleFormTipoFormula!=null) {
			this.jInternalFrameDetalleFormTipoFormula.jButtonModificarTipoFormula.setVisible((this.isVisibilidadCeldaModificarTipoFormula && this.isPermisoActualizarTipoFormula));	
			this.jInternalFrameDetalleFormTipoFormula.jButtonActualizarTipoFormula.setVisible((this.isVisibilidadCeldaActualizarTipoFormula && this.isPermisoActualizarTipoFormula));	
			this.jInternalFrameDetalleFormTipoFormula.jButtonEliminarTipoFormula.setVisible((this.isVisibilidadCeldaEliminarTipoFormula && this.isPermisoEliminarTipoFormula));
			this.jInternalFrameDetalleFormTipoFormula.jButtonCancelarTipoFormula.setVisible(this.isVisibilidadCeldaCancelarTipoFormula);							
			this.jInternalFrameDetalleFormTipoFormula.jButtonGuardarCambiosTipoFormula.setVisible((this.isVisibilidadCeldaGuardarTipoFormula && this.isPermisoGuardarCambiosTipoFormula));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoFormula.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFormula && this.isPermisoGuardarCambiosTipoFormula));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoFormula.setVisible((this.isVisibilidadCeldaNuevoTipoFormula && this.isPermisoNuevoTipoFormula));						
			this.jButtonDuplicarToolBarTipoFormula.setVisible((this.isVisibilidadCeldaDuplicarTipoFormula && this.isPermisoDuplicarTipoFormula));						
			this.jButtonCopiarToolBarTipoFormula.setVisible((this.isVisibilidadCeldaCopiarTipoFormula && this.isPermisoCopiarTipoFormula));			
			this.jButtonVerFormToolBarTipoFormula.setVisible((this.isVisibilidadCeldaVerFormTipoFormula && this.isPermisoVerFormTipoFormula));			
			this.jButtonAbrirOrderByToolBarTipoFormula.setVisible((this.isVisibilidadCeldaOrdenTipoFormula && this.isPermisoOrdenTipoFormula));
			this.jButtonNuevoRelacionesToolBarTipoFormula.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFormula && this.isPermisoNuevoTipoFormula));			
			this.jButtonNuevoGuardarCambiosToolBarTipoFormula.setVisible((this.isVisibilidadCeldaNuevoTipoFormula && this.isPermisoNuevoTipoFormula && this.isPermisoGuardarCambiosTipoFormula));			
			
			if(this.jInternalFrameDetalleFormTipoFormula!=null) {
			this.jInternalFrameDetalleFormTipoFormula.jButtonModificarToolBarTipoFormula.setVisible((this.isVisibilidadCeldaModificarTipoFormula && this.isPermisoActualizarTipoFormula));	
			this.jInternalFrameDetalleFormTipoFormula.jButtonActualizarToolBarTipoFormula.setVisible((this.isVisibilidadCeldaActualizarTipoFormula  && this.isPermisoActualizarTipoFormula));	
			this.jInternalFrameDetalleFormTipoFormula.jButtonEliminarToolBarTipoFormula.setVisible((this.isVisibilidadCeldaEliminarTipoFormula && this.isPermisoEliminarTipoFormula));
			this.jInternalFrameDetalleFormTipoFormula.jButtonCancelarToolBarTipoFormula.setVisible(this.isVisibilidadCeldaCancelarTipoFormula);				
			this.jInternalFrameDetalleFormTipoFormula.jButtonGuardarCambiosToolBarTipoFormula.setVisible((this.isVisibilidadCeldaGuardarTipoFormula && this.isPermisoGuardarCambiosTipoFormula));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoFormula.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFormula && this.isPermisoGuardarCambiosTipoFormula));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoFormula.setVisible((this.isVisibilidadCeldaNuevoTipoFormula && this.isPermisoNuevoTipoFormula));			
			this.jMenuItemDuplicarTipoFormula.setVisible((this.isVisibilidadCeldaDuplicarTipoFormula && this.isPermisoDuplicarTipoFormula));			
			this.jMenuItemCopiarTipoFormula.setVisible((this.isVisibilidadCeldaCopiarTipoFormula && this.isPermisoCopiarTipoFormula));			
			this.jMenuItemVerFormTipoFormula.setVisible((this.isVisibilidadCeldaVerFormTipoFormula && this.isPermisoVerFormTipoFormula));			
			this.jMenuItemAbrirOrderByTipoFormula.setVisible((this.isVisibilidadCeldaOrdenTipoFormula && this.isPermisoOrdenTipoFormula));			
			//this.jMenuItemMostrarOcultarTipoFormula.setVisible((this.isVisibilidadCeldaOrdenTipoFormula && this.isPermisoOrdenTipoFormula));
			this.jMenuItemDetalleAbrirOrderByTipoFormula.setVisible((this.isVisibilidadCeldaOrdenTipoFormula && this.isPermisoOrdenTipoFormula));			
			//this.jMenuItemDetalleMostrarOcultarTipoFormula.setVisible((this.isVisibilidadCeldaOrdenTipoFormula && this.isPermisoOrdenTipoFormula));			
			this.jMenuItemNuevoRelacionesTipoFormula.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFormula && this.isPermisoNuevoTipoFormula));			
			this.jMenuItemNuevoGuardarCambiosTipoFormula.setVisible((this.isVisibilidadCeldaNuevoTipoFormula && this.isPermisoNuevoTipoFormula && this.isPermisoGuardarCambiosTipoFormula));									
			
			if(this.jInternalFrameDetalleFormTipoFormula!=null) {
			this.jInternalFrameDetalleFormTipoFormula.jMenuItemModificarTipoFormula.setVisible((this.isVisibilidadCeldaModificarTipoFormula && this.isPermisoActualizarTipoFormula));	
			this.jInternalFrameDetalleFormTipoFormula.jMenuItemActualizarTipoFormula.setVisible((this.isVisibilidadCeldaActualizarTipoFormula && this.isPermisoActualizarTipoFormula));	
			this.jInternalFrameDetalleFormTipoFormula.jMenuItemEliminarTipoFormula.setVisible((this.isVisibilidadCeldaEliminarTipoFormula && this.isPermisoEliminarTipoFormula));
			this.jInternalFrameDetalleFormTipoFormula.jMenuItemCancelarTipoFormula.setVisible(this.isVisibilidadCeldaCancelarTipoFormula);				
			}
			
			this.jMenuItemGuardarCambiosTipoFormula.setVisible((this.isVisibilidadCeldaGuardarTipoFormula && this.isPermisoGuardarCambiosTipoFormula));						
			this.jMenuItemGuardarCambiosTablaTipoFormula.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFormula && this.isPermisoGuardarCambiosTipoFormula));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoFormula=this.jButtonNuevoTipoFormula.isVisible();
			this.isVisibilidadCeldaDuplicarTipoFormula=this.jButtonDuplicarTipoFormula.isVisible();
			this.isVisibilidadCeldaCopiarTipoFormula=this.jButtonCopiarTipoFormula.isVisible();
			this.isVisibilidadCeldaVerFormTipoFormula=this.jButtonVerFormTipoFormula.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoFormula=this.jButtonAbrirOrderByTipoFormula.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoFormula=this.jButtonNuevoRelacionesTipoFormula.isVisible();
			this.isVisibilidadCeldaModificarTipoFormula=this.jButtonModificarTipoFormula.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFormula!=null) {
			this.isVisibilidadCeldaActualizarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jButtonActualizarTipoFormula.isVisible();
			this.isVisibilidadCeldaEliminarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jButtonEliminarTipoFormula.isVisible();
			this.isVisibilidadCeldaCancelarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jButtonCancelarTipoFormula.isVisible();
			this.isVisibilidadCeldaGuardarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jButtonGuardarCambiosTipoFormula.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoFormula=this.jButtonGuardarCambiosTablaTipoFormula.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoFormula=this.jButtonNuevoToolBarTipoFormula.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFormula=this.jButtonNuevoRelacionesToolBarTipoFormula.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFormula!=null) {
			this.isVisibilidadCeldaModificarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jButtonModificarToolBarTipoFormula.isVisible();
			this.isVisibilidadCeldaActualizarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jButtonActualizarToolBarTipoFormula.isVisible();
			this.isVisibilidadCeldaEliminarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jButtonEliminarToolBarTipoFormula.isVisible();
			this.isVisibilidadCeldaCancelarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jButtonCancelarToolBarTipoFormula.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFormula=this.jButtonGuardarCambiosToolBarTipoFormula.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFormula=this.jButtonGuardarCambiosTablaToolBarTipoFormula.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoFormula=this.jMenuItemNuevoTipoFormula.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFormula=this.jMenuItemNuevoRelacionesTipoFormula.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFormula!=null) {
			this.isVisibilidadCeldaModificarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jMenuItemModificarTipoFormula.isVisible();
			this.isVisibilidadCeldaActualizarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jMenuItemActualizarTipoFormula.isVisible();
			this.isVisibilidadCeldaEliminarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jMenuItemEliminarTipoFormula.isVisible();
			this.isVisibilidadCeldaCancelarTipoFormula=this.jInternalFrameDetalleFormTipoFormula.jMenuItemCancelarTipoFormula.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFormula=this.jMenuItemGuardarCambiosTipoFormula.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFormula=this.jMenuItemGuardarCambiosTablaTipoFormula.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoFormula(Boolean esInicializar) {
		if(TipoFormulaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoformulaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFormula();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoFormula(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoFormula() {
		this.jButtonNuevoTipoFormula.setVisible(this.isPermisoNuevoTipoFormula);			
		this.jButtonDuplicarTipoFormula.setVisible(this.isPermisoDuplicarTipoFormula);			
		this.jButtonCopiarTipoFormula.setVisible(this.isPermisoCopiarTipoFormula);			
		this.jButtonVerFormTipoFormula.setVisible(this.isPermisoVerFormTipoFormula);			
		
		this.jButtonAbrirOrderByTipoFormula.setVisible(this.isPermisoOrdenTipoFormula);					
		
		this.jButtonNuevoRelacionesTipoFormula.setVisible(this.isPermisoNuevoTipoFormula);			
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormula.jButtonModificarTipoFormula.setVisible(this.isPermisoActualizarTipoFormula);	
			this.jInternalFrameDetalleFormTipoFormula.jButtonActualizarTipoFormula.setVisible(this.isPermisoActualizarTipoFormula);	
			this.jInternalFrameDetalleFormTipoFormula.jButtonEliminarTipoFormula.setVisible(this.isPermisoEliminarTipoFormula);
			this.jInternalFrameDetalleFormTipoFormula.jButtonCancelarTipoFormula.setVisible(this.isVisibilidadCeldaCancelarTipoFormula);						
			this.jInternalFrameDetalleFormTipoFormula.jButtonGuardarCambiosTipoFormula.setVisible(this.isPermisoGuardarCambiosTipoFormula);							
		}
		
		this.jButtonGuardarCambiosTablaTipoFormula.setVisible(this.isPermisoActualizarTipoFormula);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFormula() {
		this.jInternalFrameDetalleFormTipoFormula.jButtonModificarTipoFormula.setVisible(this.isPermisoActualizarTipoFormula);	
		this.jInternalFrameDetalleFormTipoFormula.jButtonActualizarTipoFormula.setVisible(this.isPermisoActualizarTipoFormula);	
		this.jInternalFrameDetalleFormTipoFormula.jButtonEliminarTipoFormula.setVisible(this.isPermisoEliminarTipoFormula);
		this.jInternalFrameDetalleFormTipoFormula.jButtonCancelarTipoFormula.setVisible(this.isVisibilidadCeldaCancelarTipoFormula);							
		this.jInternalFrameDetalleFormTipoFormula.jButtonGuardarCambiosTipoFormula.setVisible((this.isVisibilidadCeldaGuardarTipoFormula && this.isPermisoGuardarCambiosTipoFormula));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoFormula() {
		if(TipoFormulaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoFormula();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoFormula() {
	}
	
	public void jTableDatosTipoFormulaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoFormula(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoFormulaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFormula(this.gettipoformula(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormula(this.tipoformula);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformula =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoformula =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoformula==null) {
						this.tipoformula = new TipoFormula();
					}

					this.setVariablesFormularioToObjetoActualTipoFormula(this.tipoformula,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormula(this.tipoformula);
				}

				if(this.tipoformula.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoformula.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFormula(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoFormulaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFormula(this.gettipoformula(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormula(this.tipoformula);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformula =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoformula =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoformula==null) {
						this.tipoformula = new TipoFormula();
					}

					this.setVariablesFormularioToObjetoActualTipoFormula(this.tipoformula,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormula(this.tipoformula);
				}

				if(this.tipoformula.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoformula.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFormula(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoFormulaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFormula(this.gettipoformula(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormula(this.tipoformula);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformula =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoformula =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoformula==null) {
						this.tipoformula = new TipoFormula();
					}

					this.setVariablesFormularioToObjetoActualTipoFormula(this.tipoformula,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormula(this.tipoformula);
				}

				if(this.tipoformula.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipoformula.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFormula(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoFormula() {
		if(this.jInternalFrameDetalleFormTipoFormula!=null) {
		

		if(this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) {
			this.jInternalFrameDetalleFormTipoFormula.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoFormula.dispose();
			this.jInternalFrameDetalleFormTipoFormula=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoFormula!=null) {
			this.jInternalFrameReporteDinamicoTipoFormula.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoFormula.dispose();
			this.jInternalFrameReporteDinamicoTipoFormula=null;
		}
		
		if(this.jInternalFrameImportacionTipoFormula!=null) {
			this.jInternalFrameImportacionTipoFormula.setVisible(false);	    			
			this.jInternalFrameImportacionTipoFormula.dispose();
			this.jInternalFrameImportacionTipoFormula=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoFormula();
			
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoFormula")) {
				jButtonNuevoTipoFormulaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoFormula")) {
				jButtonDuplicarTipoFormulaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoFormula")) {
				jButtonCopiarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoFormula")) {
				jButtonVerFormTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoFormula")) {
				jButtonNuevoTipoFormulaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoFormula")) {
				jButtonDuplicarTipoFormulaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoFormula")) {
				jButtonNuevoTipoFormulaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoFormula")) {
				jButtonDuplicarTipoFormulaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoFormula")) {
				jButtonNuevoTipoFormulaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoFormula")) {
				jButtonNuevoTipoFormulaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoFormula")) {
				jButtonNuevoTipoFormulaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoFormula")) {
				jButtonModificarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoFormula")) {
				jButtonModificarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoFormula")) {
				jButtonModificarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoFormula")) {
				jButtonActualizarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoFormula")) {
				jButtonActualizarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoFormula")) {
				jButtonActualizarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoFormula")) {
				jButtonEliminarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoFormula")) {
				jButtonEliminarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoFormula")) {
				jButtonEliminarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoFormula")) {
				jButtonCancelarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoFormula")) {
				jButtonCancelarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoFormula")) {
				jButtonCancelarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoFormula")) {
				jButtonCerrarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoFormula")) {
				jButtonCerrarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoFormula")) {
				jButtonCerrarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoFormula")) {
				jButtonMostrarOcultarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoFormula")) {
				jButtonCancelarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoFormula")) {
				jButtonGuardarCambiosTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoFormula")) {
				jButtonGuardarCambiosTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoFormula")) {
				jButtonCopiarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoFormula")) {
				jButtonVerFormTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoFormula")) {
				jButtonGuardarCambiosTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoFormula")) {
				jButtonCopiarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoFormula")) {
				jButtonVerFormTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoFormula")) {
				jButtonGuardarCambiosTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoFormula")) {
				jButtonGuardarCambiosTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoFormula")) {
				jButtonGuardarCambiosTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoFormula")) {
				jButtonRecargarInformacionTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoFormula")) {
				jButtonRecargarInformacionTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoFormula")) {
				jButtonRecargarInformacionTipoFormulaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoFormula")) {
				jButtonAnterioresTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoFormula")) {
				jButtonAnterioresTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoFormula")) {
				jButtonAnterioresTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoFormula")) {
				jButtonSiguientesTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoFormula")) {
				jButtonSiguientesTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoFormula")) {
				jButtonSiguientesTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoFormula") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoFormula")) {
				jButtonAbrirOrderByTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoFormula") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoFormula")) {
				jButtonMostrarOcultarTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFormula")) {
				jButtonNuevoGuardarCambiosTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoFormula")) {
				jButtonNuevoGuardarCambiosTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoFormula")) {
				jButtonNuevoGuardarCambiosTipoFormulaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoFormula")) {
				jButtonCerrarReporteDinamicoTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoFormula")) {
				jButtonGenerarReporteDinamicoTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoFormula")) {
				
				jButtonGenerarExcelReporteDinamicoTipoFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoFormula")) {
				jButtonCerrarImportacionTipoFormulaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoFormula")) {
				
				jButtonGenerarImportacionTipoFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoFormula")) {
				
				jButtonAbrirImportacionTipoFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoFormula")) {
				jComboBoxTiposAccionesTipoFormulaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoFormula")) {
				jComboBoxTiposRelacionesTipoFormulaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoFormula")) {
				jComboBoxTiposAccionesTipoFormulaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoFormula")) {
				
				jComboBoxTiposSeleccionarTipoFormulaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoFormula")) {
				jTextFieldValorCampoGeneralTipoFormulaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoFormula")) {
				jButtonAbrirOrderByTipoFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoFormula")) {
				jButtonAbrirOrderByTipoFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoFormula")) {
				jButtonCerrarOrderByTipoFormulaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFormulaBusqueda")) {
				this.jButtonidTipoFormulaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFormulaBusqueda")) {
				this.jButtonnombreTipoFormulaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoFormulaBusqueda")) {
				this.jButtondescripcionTipoFormulaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoFormula();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormulaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformula);
				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
				
				


				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormula.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormula.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoFormula tipoformulaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoformulaLocal=this.tipoformula;
			} else {
				tipoformulaLocal=this.tipoformulaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformula);
				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
							
				
				


				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormula.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormula.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormulaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaAnterior =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformulaAnterior =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
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
			
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
			
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
			
			


			
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormulaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformula);
				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
								
						
				


				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormula.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormula.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformula);
				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
								
				
				


				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormula.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormula.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormulaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaAnterior =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformulaAnterior =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformula);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormulaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaAnterior =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformulaAnterior =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormulaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformula);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoformula);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformula);
				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
							
				
				


				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormula.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormula.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormulaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformulaAnterior =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoformulaAnterior =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
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
			
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
			
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
			
			


			
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormulaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformula);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoformula);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformula);
				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
								
				
				


				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormula.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormula.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormulaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaAnterior =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformulaAnterior =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormulaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformula);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoformula);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormulaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformula);
				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoFormula")) {
					jCheckBoxSeleccionarTodosTipoFormulaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoFormula")) {
					jCheckBoxSeleccionadosTipoFormulaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoFormula")) {
					
				}
				
				


				
				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormula.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormula.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformula);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoformula);
				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
												
				
				


				
				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormula.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormula.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormulaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformulaAnterior =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoformulaAnterior =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormulaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformula);
				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
				
				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
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
			
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
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
			
			


			
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormulaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformula);
				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormula.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormula.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformula);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformula);
				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
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
				
				


				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormula.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormula.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormulaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformulaAnterior =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformulaAnterior =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoFormula")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoFormulaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoFormula.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoformula =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoformula =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoformula);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoFormula")) {
				
				}
				
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoFormula")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoFormula.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoFormula")) {
			
			}
			
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoFormula();
			
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoFormula")) {
				jButtonNuevoTipoFormulaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoFormula")) {
				jButtonDuplicarTipoFormulaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoFormula")) {
				jButtonCopiarTipoFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoFormula")) {
				jButtonVerFormTipoFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoFormula")) {
				jButtonNuevoTipoFormulaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoFormula")) {
				jButtonModificarTipoFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoFormula")) {
				jButtonActualizarTipoFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoFormula")) {
				jButtonEliminarTipoFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoFormula")) {
				jButtonGuardarCambiosTipoFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoFormula")) {
				jButtonCancelarTipoFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoFormula")) {
				jButtonCerrarTipoFormulaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoFormula")) {
				jButtonGuardarCambiosTipoFormulaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFormula")) {
				jButtonNuevoGuardarCambiosTipoFormulaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoFormula")) {
				jButtonAbrirOrderByTipoFormulaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoFormula")) {
				jButtonRecargarInformacionTipoFormulaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoFormula")) {
				jButtonAnterioresTipoFormulaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoFormula")) {
				jButtonSiguientesTipoFormulaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFormulaBusqueda")) {
				this.jButtonidTipoFormulaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFormulaBusqueda")) {
				this.jButtonnombreTipoFormulaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoFormulaBusqueda")) {
				this.jButtondescripcionTipoFormulaBusquedaActionPerformed(evt);
			}
			
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoFormula();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoFormula")) {
				closingInternalFrameTipoFormula();
				
			} else if(sTipo.equals("jButtonCancelarTipoFormula")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoFormula = (JInternalFrameBase)evt.getSource();
	            	
	            TipoFormulaBeanSwingJInternalFrame jInternalFrameParent=(TipoFormulaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFormula.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoFormulaActionPerformed(null);
			}
			
			TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoformula,new Object(),this.tipoformulaParameterGeneral,this.tipoformulaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoFormula(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoFormula(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoFormula(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoformula)) {
			if(!esControlTabla) {
				if(TipoFormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoFormula(this.tipoformula,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormula(this.tipoformula);			
				}
				
				if(this.tipoformulaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoFormula(this.tipoformula,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoformulaReturnGeneral=tipoformulaLogic.procesarEventosTipoFormulasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoformulaLogic.getTipoFormulas(),this.tipoformula,this.tipoformulaParameterGeneral,this.isEsNuevoTipoFormula,classes);//this.tipoformulaLogic.getTipoFormula()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoFormula(this.tipoformulaReturnGeneral,this.tipoformulaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoformulaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoFormula(classes,this.tipoformulaReturnGeneral,this.tipoformulaBean,false);
					}
						
					if(this.tipoformulaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoFormula(this.tipoformulaReturnGeneral.getTipoFormula());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoFormula(this.tipoformulaReturnGeneral.getTipoFormula());	
					}
						
					if(this.tipoformulaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoFormula(this.tipoformulaReturnGeneral.getTipoFormula(),classes);//this.tipoformulaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoFormula(this.tipoformula,classes);//this.tipoformulaBean);									
				}
			
				if(TipoFormulaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoFormula(this.tipoformula,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormula(this.tipoformula);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoformulaAnterior!=null) {
						this.tipoformula=this.tipoformulaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoformulaReturnGeneral=tipoformulaLogic.procesarEventosTipoFormulasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoformulaLogic.getTipoFormulas(),this.tipoformula,this.tipoformulaParameterGeneral,this.isEsNuevoTipoFormula,classes);//this.tipoformulaLogic.getTipoFormula()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoformulaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoformulaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoformulaReturnGeneral.getTipoFormula(),tipoformulaLogic.getTipoFormulas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoformulaReturnGeneral.getTipoFormula(),this.tipoformulas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoFormula.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoFormula.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoFormula();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoFormula() throws Exception {
		
		TipoFormulaModel tipoformulaModel=(TipoFormulaModel)this.jTableDatosTipoFormula.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoformulaModel.tipoformulas=this.tipoformulaLogic.getTipoFormulas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoformulaModel.tipoformulas=this.tipoformulas;
		}
		
		
		((TipoFormulaModel) this.jTableDatosTipoFormula.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoFormula() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoformulaAnterior(),this.tipoformulaLogic.getTipoFormulas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoformulaAnterior(),this.tipoformulas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoFormula();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoFormula(TipoFormula tipoformula,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Formula.class)) {
					this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.formulaLogic.setFormulas(tipoformula.getFormulas());
					this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormula(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
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
										
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoformula,new Object(),generalEntityParameterGeneral,this.tipoformulaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoformulaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoFormulaConstantesFunciones.getClassesRelationshipsOfTipoFormula(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoFormulaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoFormula(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoFormula(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoFormulaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoformula,new Object(),generalEntityParameterGeneral,this.tipoformulaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoFormula(TipoFormulaBean tipoformulaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Formula.class)) {
					this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.formulaLogic.setFormulas(tipoformula.getFormulas());
					this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormula(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoFormula(ArrayList<Classe> classes,TipoFormulaReturnGeneral tipoformulaReturnGeneral,TipoFormulaBean tipoformulaBean,Boolean conDefault) throws Exception {
		
			this.tipoformulaBean.setFormulas(tipoformulaReturnGeneral.getTipoFormula().getFormulas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoFormula(TipoFormula tipoformula,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Formula.class)) {
					tipoformula.setFormulas(this.jInternalFrameDetalleFormTipoFormula.formulaBeanSwingJInternalFrame.formulaLogic.getFormulas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoformula)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoFormula = new TipoFormulaDetalleFormJInternalFrame(jDesktopPane,this.tipoformulaSessionBean.getConGuardarRelaciones(),this.tipoformulaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFormula);
		this.jInternalFrameDetalleFormTipoFormula.setVisible(false);
		this.jInternalFrameDetalleFormTipoFormula.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoFormula.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoFormula.tipoformulaLogic=this.tipoformulaLogic;
		
		this.cargarCombosFrameForeignKeyTipoFormula("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFormula();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFormula();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoFormula("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoFormula();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoFormula.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFormula"));
		
		this.jInternalFrameDetalleFormTipoFormula.jButtonModificarTipoFormula.addActionListener(new ButtonActionListener(this,"ModificarTipoFormula"));

		
		this.jInternalFrameDetalleFormTipoFormula.jButtonModificarToolBarTipoFormula.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFormula"));
					
		this.jInternalFrameDetalleFormTipoFormula.jMenuItemModificarTipoFormula.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFormula"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFormula.jButtonActualizarTipoFormula.addActionListener (new ButtonActionListener(this,"ActualizarTipoFormula"));
		
		
		this.jInternalFrameDetalleFormTipoFormula.jButtonActualizarToolBarTipoFormula.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFormula"));
						
		this.jInternalFrameDetalleFormTipoFormula.jMenuItemActualizarTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFormula"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFormula.jButtonEliminarTipoFormula.addActionListener (new ButtonActionListener(this,"EliminarTipoFormula"));
		
		
		this.jInternalFrameDetalleFormTipoFormula.jButtonEliminarToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFormula"));
								
		this.jInternalFrameDetalleFormTipoFormula.jMenuItemEliminarTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFormula"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFormula.jButtonCancelarTipoFormula.addActionListener (new ButtonActionListener(this,"CancelarTipoFormula"));
		
		
		this.jInternalFrameDetalleFormTipoFormula.jButtonCancelarToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFormula"));
					
		this.jInternalFrameDetalleFormTipoFormula.jMenuItemCancelarTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFormula"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoFormula.jMenuItemDetalleCerrarTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFormula"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFormula.jButtonGuardarCambiosToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFormula"));
		
		
		
		this.jInternalFrameDetalleFormTipoFormula.jButtonGuardarCambiosToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFormula"));
		
		
		
		this.jInternalFrameDetalleFormTipoFormula.jComboBoxTiposAccionesFormularioTipoFormula.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFormula"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormula.jButtonidTipoFormulaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormula.jButtonnombreTipoFormulaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormula.jButtondescripcionTipoFormulaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoFormulaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoFormula.jTabbedPaneRelacionesTipoFormula.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFormula"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoFormula"));
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormula.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFormula"));
		}
		
		this.jTableDatosTipoFormula.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoFormula"));
		
		this.jTableDatosTipoFormula.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoFormula"));
		
		this.jButtonNuevoTipoFormula.addActionListener(new ButtonActionListener(this,"NuevoTipoFormula"));
		
		this.jButtonDuplicarTipoFormula.addActionListener(new ButtonActionListener(this,"DuplicarTipoFormula"));
		
		this.jButtonCopiarTipoFormula.addActionListener(new ButtonActionListener(this,"CopiarTipoFormula"));
		
		this.jButtonVerFormTipoFormula.addActionListener(new ButtonActionListener(this,"VerFormTipoFormula"));
		
		
		this.jButtonNuevoToolBarTipoFormula.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoFormula"));
			
		this.jButtonDuplicarToolBarTipoFormula.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoFormula"));
			
		this.jMenuItemNuevoTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoFormula"));
			
		this.jMenuItemDuplicarTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoFormula"));		
		
		
		this.jButtonNuevoRelacionesTipoFormula.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoFormula"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoFormula.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoFormula"));
			
		this.jMenuItemNuevoRelacionesTipoFormula.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoFormula"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormula.jButtonModificarTipoFormula.addActionListener(new ButtonActionListener(this,"ModificarTipoFormula"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormula.jButtonModificarToolBarTipoFormula.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFormula"));
			
			this.jInternalFrameDetalleFormTipoFormula.jMenuItemModificarTipoFormula.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFormula"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoFormula.jButtonActualizarTipoFormula.addActionListener (new ButtonActionListener(this,"ActualizarTipoFormula"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormula.jButtonActualizarToolBarTipoFormula.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFormula"));
				
			this.jInternalFrameDetalleFormTipoFormula.jMenuItemActualizarTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFormula"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormula.jButtonEliminarTipoFormula.addActionListener (new ButtonActionListener(this,"EliminarTipoFormula"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormula.jButtonEliminarToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFormula"));
						
			this.jInternalFrameDetalleFormTipoFormula.jMenuItemEliminarTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFormula"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormula.jButtonCancelarTipoFormula.addActionListener (new ButtonActionListener(this,"CancelarTipoFormula"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormula.jButtonCancelarToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFormula"));
			
			this.jInternalFrameDetalleFormTipoFormula.jMenuItemCancelarTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFormula"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoFormula"));		
		
		
		this.jButtonCerrarTipoFormula.addActionListener (new ButtonActionListener(this,"CerrarTipoFormula"));
		
		
		this.jButtonCerrarToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoFormula"));
			
		this.jMenuItemCerrarTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoFormula"));
			
		if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormula.jMenuItemDetalleCerrarTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFormula"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormula.jButtonGuardarCambiosTipoFormula.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoFormula"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormula.jButtonGuardarCambiosToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFormula"));
		}
		
		this.jButtonCopiarToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoFormula"));
			
		this.jButtonVerFormToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoFormula"));
		
		this.jMenuItemGuardarCambiosTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoFormula"));
			
		this.jMenuItemCopiarTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoFormula"));		
		
		this.jMenuItemVerFormTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoFormula"));		
		
		
		this.jButtonGuardarCambiosTablaTipoFormula.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFormula"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoFormula"));
			
		this.jMenuItemGuardarCambiosTablaTipoFormula.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFormula"));		
		
		
		
		this.jButtonRecargarInformacionTipoFormula.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoFormula"));
					
		this.jButtonRecargarInformacionToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoFormula"));
		
		this.jMenuItemRecargarInformacionTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoFormula"));		
		
		
		
		this.jButtonAnterioresTipoFormula.addActionListener (new ButtonActionListener(this,"AnterioresTipoFormula"));
		
		
		this.jButtonAnterioresToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoFormula"));
		
		this.jMenuItemAnterioresTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoFormula"));		
		
		
		this.jButtonSiguientesTipoFormula.addActionListener (new ButtonActionListener(this,"SiguientesTipoFormula"));
		
		
		this.jButtonSiguientesToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoFormula"));
			
		this.jMenuItemSiguientesTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoFormula"));
			
		this.jMenuItemAbrirOrderByTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoFormula"));
			
		this.jMenuItemMostrarOcultarTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoFormula"));
			
		this.jMenuItemDetalleAbrirOrderByTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoFormula"));
			
		this.jMenuItemDetalleMostarOcultarTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoFormula"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoFormula.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoFormula"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoFormula"));
			
		this.jMenuItemNuevoGuardarCambiosTipoFormula.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoFormula"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoFormula.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoFormula"));

		this.jCheckBoxSeleccionadosTipoFormula.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoFormula"));
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormula.jComboBoxTiposAccionesFormularioTipoFormula.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFormula"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoFormula.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoFormula"));
			
		this.jComboBoxTiposAccionesTipoFormula.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoFormula"));
					
		this.jComboBoxTiposSeleccionarTipoFormula.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoFormula"));
			
		this.jTextFieldValorCampoGeneralTipoFormula.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoFormula"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormula.jButtonidTipoFormulaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormula.jButtonnombreTipoFormulaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormula.jButtondescripcionTipoFormulaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoFormulaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoFormula!=null) {
				this.jInternalFrameReporteDinamicoTipoFormula.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFormula"));
				this.jInternalFrameReporteDinamicoTipoFormula.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFormula"));
				this.jInternalFrameReporteDinamicoTipoFormula.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFormula"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoFormula.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFormula"));				
			//this.jButtonGenerarReporteDinamicoTipoFormula.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFormula"));
			//this.jButtonGenerarExcelReporteDinamicoTipoFormula.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFormula"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoFormula!=null) {
				this.jInternalFrameImportacionTipoFormula.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFormula"));
				this.jInternalFrameImportacionTipoFormula.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFormula"));
				this.jInternalFrameImportacionTipoFormula.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFormula"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoFormula.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoFormula"));
			
			this.jButtonAbrirOrderByToolBarTipoFormula.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoFormula"));			
			
			if(this.jInternalFrameOrderByTipoFormula!=null) {
				this.jInternalFrameOrderByTipoFormula.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFormula"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoFormula!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormula.jTabbedPaneRelacionesTipoFormula.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFormula"));
		
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
            		closingInternalFrameTipoFormula();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoFormula.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoFormula = (JInternalFrameBase)event.getSource();
	            	
	            TipoFormulaBeanSwingJInternalFrame jInternalFrameParent=(TipoFormulaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFormula.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoFormulaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoFormula.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoFormulaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoFormula.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoFormula.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormulaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormulaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormulaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoFormula";
		inputMap = this.jButtonNuevoTipoFormula.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoFormula.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFormulaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormulaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormulaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormulaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoFormula";
		inputMap = this.jButtonNuevoRelacionesTipoFormula.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoFormula.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFormulaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoFormula";
		inputMap = this.jButtonModificarTipoFormula.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoFormula.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoFormulaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoFormula";
		inputMap = this.jButtonActualizarTipoFormula.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoFormula.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoFormulaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoFormula";
		inputMap = this.jButtonEliminarTipoFormula.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoFormula.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoFormulaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoFormula";
		inputMap = this.jButtonCancelarTipoFormula.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoFormula.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoFormulaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoFormula";
		inputMap = this.jButtonCerrarTipoFormula.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoFormula.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoFormulaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoFormula.jButtonGuardarCambiosTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoFormula";
		inputMap = this.jInternalFrameDetalleFormTipoFormula.jButtonGuardarCambiosTipoFormula.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoFormula.jButtonGuardarCambiosTipoFormula.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoFormulaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoFormula.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoFormulaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoFormula.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoFormulaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoFormula.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoFormulaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoFormula.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoFormulaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormula.jButtonidTipoFormulaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormula.jButtonnombreTipoFormulaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFormulaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormula.jButtondescripcionTipoFormulaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoFormulaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoFormula.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoFormulaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoFormulaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoFormula.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoFormula(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoFormula tipoformulaAux:this.tipoformulaLogic.getTipoFormulas()) {
					tipoformulaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFormula tipoformulaAux:tipoformulas) {
					tipoformulaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoFormulaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFormula(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFormula tipoformulaAux:this.tipoformulaLogic.getTipoFormulas()) {
						tipoformulaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFormula tipoformulaAux:tipoformulas) {
						tipoformulaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoFormula tipoformulaAux:this.tipoformulaLogic.getTipoFormulas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFormula tipoformulaAux:tipoformulas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFormula(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFormula.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFormula.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFormula,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoFormulaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFormula(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoFormula.getSelectedRows();
			
			TipoFormula tipoformulaLocal=new TipoFormula();
			
			//this.seleccionarTodosTipoFormula(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformulaLocal =(TipoFormula) this.tipoformulaLogic.getTipoFormulas().toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoformulaLocal =(TipoFormula) this.tipoformulas.toArray()[this.jTableDatosTipoFormula.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoformulaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFormula tipoformulaAux:this.tipoformulaLogic.getTipoFormulas()) {
						tipoformulaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFormula tipoformulaAux:tipoformulas) {
						tipoformulaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoFormula(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFormula.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFormula.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFormula,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoFormulaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoFormulaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoFormulaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoFormula(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoFormula.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFormula tipoformulaAux:this.tipoformulaLogic.getTipoFormulas()) {
				
						if(sTipoSeleccionar.equals(TipoFormulaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoformulaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoFormulaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipoformulaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFormula tipoformulaAux:tipoformulas) {
					
						if(sTipoSeleccionar.equals(TipoFormulaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoformulaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoFormulaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipoformulaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFormula(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoFormulaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoFormula(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoFormula=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoFormula.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoFormula.jComboBoxTiposAccionesFormularioTipoFormula.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoFormula) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoFormula(conSplash);
				
					this.generarReporteTipoFormulasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFormula.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFormula.jComboBoxTiposAccionesFormularioTipoFormula.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoFormulasSeleccionados();
				//this.jComboBoxTiposAccionesTipoFormula.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFormulasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoFormula.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFormulasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoFormula.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFormula();
				
				this.exportarTipoFormulasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFormula.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFormula.jComboBoxTiposAccionesFormularioTipoFormula.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoFormulas();
				//this.importarTipoFormulas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFormula.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFormula.jComboBoxTiposAccionesFormularioTipoFormula.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFormula();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoFormulasSeleccionados();
				//this.jComboBoxTiposAccionesTipoFormula.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Formula", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoFormula();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoFormula)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoFormula(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Formula",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFormula.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFormula.jComboBoxTiposAccionesFormularioTipoFormula.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoFormula();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoFormula(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoFormulaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoFormula();
			
			if(this.jInternalFrameDetalleFormTipoFormula==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoFormula> tipoformulasSeleccionados=new ArrayList<TipoFormula>();		
			TipoFormula tipoformula=new TipoFormula();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoFormula(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoFormula.getSelectedItem();
			
			
			
			
			tipoformulasSeleccionados=this.getTipoFormulasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoformulasSeleccionados.size()==1) {
				for(TipoFormula tipoformulaAux:tipoformulasSeleccionados) {
					tipoformula=tipoformulaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Formula")) {
					jButtonFormulaActionPerformed(null,rowIndex,true,false,tipoformula);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoFormula();
			
      		//this.finishProcessTipoFormula(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoFormulaReturnGeneral() throws Exception {
		if(this.tipoformulaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoformulaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoformulaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoformulaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoformulaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoformulaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoFormula(false);
		}
		
		if(this.tipoformulaReturnGeneral.getConRetornoLista() || this.tipoformulaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoformulaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoformulaLogic.setTipoFormulas(this.tipoformulaReturnGeneral.getTipoFormulas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoformulaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoformulaLogic.setTipoFormula(this.tipoformulaReturnGeneral.getTipoFormula());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoFormula(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoFormula() throws Exception {
		
		
	}
	
	public ArrayList<TipoFormula> getTipoFormulasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoFormula> tipoformulasSeleccionados=new ArrayList<TipoFormula>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoFormula) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoFormula tipoformulaAux:tipoformulaLogic.getTipoFormulas()) {
					if(tipoformulaAux.getIsSelected()) {
						tipoformulasSeleccionados.add(tipoformulaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFormula tipoformulaAux:this.tipoformulas) {
					if(tipoformulaAux.getIsSelected()) {
						tipoformulasSeleccionados.add(tipoformulaAux);				
					}
				}
			}
			
			if(tipoformulasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoformulasSeleccionados.addAll(this.tipoformulaLogic.getTipoFormulas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoformulasSeleccionados.addAll(this.tipoformulas);				
					}
				}
			}
		} else {
			tipoformulasSeleccionados.add(this.tipoformula);
		}
		
		return tipoformulasSeleccionados;
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
	
	public void generarReporteTipoFormulasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoFormulasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoFormulasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFormulasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFormulasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoFormulasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Formula",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoFormulasSeleccionados() throws Exception {
		ArrayList<TipoFormula> tipoformulasSeleccionados=new ArrayList<TipoFormula>();		
		
		tipoformulasSeleccionados=this.getTipoFormulasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoFormulas("Todos",tipoformulasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoFormulasSeleccionados() throws Exception {
		ArrayList<TipoFormula> tipoformulasSeleccionados=new ArrayList<TipoFormula>();		
		
		tipoformulasSeleccionados=this.getTipoFormulasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoFormulas("Todos",tipoformulasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoFormulasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoFormula> tipoformulasSeleccionados=new ArrayList<TipoFormula>();
		
		tipoformulasSeleccionados=this.getTipoFormulasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoFormulas("Todos",tipoformulasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoFormulasSeleccionados() throws Exception {
		ArrayList<TipoFormula> tipoformulasSeleccionados=new ArrayList<TipoFormula>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoFormula();
		
		
		tipoformulasSeleccionados=this.getTipoFormulasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoFormula();
		
		
		//this.generarReporteTipoFormulas("Todos",tipoformulasSeleccionados ,tipoformulaImplementable,tipoformulaImplementableHome);
	}
	
	public void mostrarImportacionTipoFormulas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoFormula();
		
		this.abrirFrameImportacionTipoFormula();		
		
			
		//this.generarReporteTipoFormulas("Todos",tipoformulasSeleccionados ,tipoformulaImplementable,tipoformulaImplementableHome);
	}
	
	public void importarTipoFormulas() throws Exception {		
	
	}
	
	public void exportarTipoFormulasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoFormulasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoFormulasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoFormulasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Formula",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoFormulasSeleccionados() throws Exception {
		ArrayList<TipoFormula> tipoformulasSeleccionados=new ArrayList<TipoFormula>();		
		
		tipoformulasSeleccionados=this.getTipoFormulasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformula."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoFormula(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoFormula tipoformulaAux:tipoformulasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoFormula(tipoformulaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoformulaAux.setsDetalleGeneralEntityReporte(tipoformulaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Formula",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoFormula(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoFormulaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFormulaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFormulaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFormulaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoFormula(TipoFormula tipoformula,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoformula.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoformula.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoformula.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoformula.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoFormulasSeleccionados() throws Exception {
		ArrayList<TipoFormula> tipoformulasSeleccionados=new ArrayList<TipoFormula>();		
		
		tipoformulasSeleccionados=this.getTipoFormulasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformula.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoFormulas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoFormula(row);				
				iRow++;
			}				
			
			for(TipoFormula tipoformulaAux:tipoformulasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoFormula(tipoformulaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Formula",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoFormulasSeleccionados() throws Exception {
		ArrayList<TipoFormula> tipoformulasSeleccionados=new ArrayList<TipoFormula>();		
		
		tipoformulasSeleccionados=this.getTipoFormulasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformula.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoformulas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoformula");
			//elementRoot.appendChild(element);
		
			for(TipoFormula tipoformulaAux:tipoformulasSeleccionados) {
				element = document.createElement("tipoformula");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoFormula(tipoformulaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformulaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Formula",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoFormula(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFormulaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFormulaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoFormulaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFormulaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoFormula(TipoFormula tipoformula,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoformula.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoformula.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoformula.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoFormula(TipoFormula tipoformula,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoFormulaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoformula.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoFormulaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoformula.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoFormulaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoformula.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoFormulaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipoformula.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoFormulasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoFormula> tipoformulasSeleccionados=new ArrayList<TipoFormula>();
		
		tipoformulasSeleccionados=this.getTipoFormulasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoFormula(tipoformulasSeleccionados);
		
		this.generarReporteTipoFormulas("Todos",tipoformulasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoFormula(ArrayList<TipoFormula> tipoformulasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoFormula tipoformulaAux:tipoformulasSeleccionados) {
				tipoformulaAux.setsDetalleGeneralEntityReporte(tipoformulaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoFormulaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoformulaAux.setsDescripcionGeneralEntityReporte1(tipoformulaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoFormulaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipoformulaAux.setsDescripcionGeneralEntityReporte1(tipoformulaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormulaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoFormula(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoFormula=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoFormula=true;
				this.isVisibilidadCeldaGuardarCambiosTipoFormula=true;
			}
			
			this.isVisibilidadCeldaModificarTipoFormula=false;
			this.isVisibilidadCeldaActualizarTipoFormula=false;
			this.isVisibilidadCeldaEliminarTipoFormula=false;
			this.isVisibilidadCeldaCancelarTipoFormula=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormula=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormula=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoFormula=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormula=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormula=false;
			this.isVisibilidadCeldaModificarTipoFormula=false;
			this.isVisibilidadCeldaActualizarTipoFormula=true;
			this.isVisibilidadCeldaEliminarTipoFormula=false;
			this.isVisibilidadCeldaCancelarTipoFormula=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormula=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormula=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoFormula=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormula=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormula=false;
			this.isVisibilidadCeldaModificarTipoFormula=false;
			this.isVisibilidadCeldaActualizarTipoFormula=true;
			this.isVisibilidadCeldaEliminarTipoFormula=true;
			this.isVisibilidadCeldaCancelarTipoFormula=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormula=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormula=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoFormula=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormula=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormula=false;
			this.isVisibilidadCeldaModificarTipoFormula=false;
			this.isVisibilidadCeldaActualizarTipoFormula=true;
			this.isVisibilidadCeldaEliminarTipoFormula=false;
			this.isVisibilidadCeldaCancelarTipoFormula=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormula=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormula=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoFormula=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormula=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFormula=true;
			this.isVisibilidadCeldaModificarTipoFormula=false;
			this.isVisibilidadCeldaActualizarTipoFormula=false;
			this.isVisibilidadCeldaEliminarTipoFormula=false;
			this.isVisibilidadCeldaCancelarTipoFormula=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormula=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormula=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoFormula=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormula=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormula=false;
			this.isVisibilidadCeldaActualizarTipoFormula=false;
			this.isVisibilidadCeldaEliminarTipoFormula=false;
			this.isVisibilidadCeldaCancelarTipoFormula=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormula=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormula=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoFormula=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormula=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormula=false;
			this.isVisibilidadCeldaModificarTipoFormula=true;
			this.isVisibilidadCeldaActualizarTipoFormula=false;
			this.isVisibilidadCeldaEliminarTipoFormula=false;
			this.isVisibilidadCeldaCancelarTipoFormula=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormula=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormula=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoFormulaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoFormula=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormula=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFormula=true;
		} else {
			this.actualizarEstadoPanelsTipoFormula(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoFormula=false;
			//this.isVisibilidadCeldaVerFormTipoFormula=false;
			this.isVisibilidadCeldaDuplicarTipoFormula=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoformulaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFormula=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoFormula=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormula=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoformulaSessionBean.getEsGuardarRelacionado()) {
			if(!tipoformulaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoFormula=false;												
			}
			
			this.jButtonCerrarTipoFormula.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFormula=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoformula)) {
			this.isVisibilidadCeldaActualizarTipoFormula=false;
			this.isVisibilidadCeldaEliminarTipoFormula=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFormula() {
		this.isVisibilidadCeldaNuevoTipoFormula=false;
		this.isVisibilidadCeldaGuardarCambiosTipoFormula=false;
	}
	
	public void actualizarEstadoPanelsTipoFormula(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoFormula!=null) {
				this.jScrollPanelDatosEdicionTipoFormula.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFormula!=null) {
				this.jScrollPanelDatosTipoFormula.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFormula!=null) {
				this.jPanelPaginacionTipoFormula.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFormula!=null) {
				this.jPanelParametrosReportesTipoFormula.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoFormula!=null) {
				this.jScrollPanelDatosEdicionTipoFormula.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoFormula!=null) {
				this.jScrollPanelDatosTipoFormula.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFormula!=null) {
				this.jPanelPaginacionTipoFormula.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFormula!=null) {
				this.jPanelParametrosReportesTipoFormula.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoFormula!=null) {
				this.jScrollPanelDatosEdicionTipoFormula.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoFormula!=null) {
				this.jScrollPanelDatosTipoFormula.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFormula!=null) {
				this.jPanelPaginacionTipoFormula.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFormula!=null) {
				this.jPanelParametrosReportesTipoFormula.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoFormula!=null) {
				this.jScrollPanelDatosEdicionTipoFormula.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFormula!=null) {
				this.jScrollPanelDatosTipoFormula.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFormula!=null) {
				this.jPanelPaginacionTipoFormula.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFormula!=null) {
				this.jPanelParametrosReportesTipoFormula.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoFormula!=null) {
				this.jScrollPanelDatosEdicionTipoFormula.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFormula!=null) {
				this.jScrollPanelDatosTipoFormula.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFormula!=null) {
				this.jPanelPaginacionTipoFormula.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFormula!=null) {
				this.jPanelParametrosReportesTipoFormula.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoFormula!=null) {
				this.jScrollPanelDatosEdicionTipoFormula.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoFormula!=null) {
				this.jScrollPanelDatosTipoFormula.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFormula!=null) {
				this.jPanelPaginacionTipoFormula.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFormula!=null) {
				this.jPanelParametrosReportesTipoFormula.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoFormula!=null) {
				this.jScrollPanelDatosEdicionTipoFormula.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoFormula!=null) {
				this.jScrollPanelDatosTipoFormula.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFormula!=null) {
				this.jPanelPaginacionTipoFormula.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFormula!=null) {
				this.jPanelParametrosReportesTipoFormula.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoformulaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoFormulaParaFormulas() throws Exception {
		Boolean isPaginaPopupFormula=false;

		try {

			if(this.tipoformulaSessionBean==null) {
				this.tipoformulaSessionBean=new TipoFormulaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoFormula.formulaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoFormula.formulaSessionBean=new FormulaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoFormula.formulaSessionBean.setsPathNavegacionActual(tipoformulaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormulaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoFormula.formulaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormula=this.jInternalFrameDetalleFormTipoFormula.formulaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoFormula.formulaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormula(true);
			this.jInternalFrameDetalleFormTipoFormula.formulaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormula(TipoFormulaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoFormula.formulaSessionBean.setisBusquedaDesdeForeignKeySesionTipoFormula(true);
			this.jInternalFrameDetalleFormTipoFormula.formulaSessionBean.setlidTipoFormulaActual(this.idTipoFormulaActual);

			tipoformulaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoFormula(true);
			tipoformulaSessionBean.setlIdTipoFormulaActualForeignKey(this.idTipoFormulaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoFormulaSessionBean tipoformulaSessionBean=new TipoFormulaSessionBean();
		
		if(this.tipoformulaSessionBean==null) {
			this.tipoformulaSessionBean=new TipoFormulaSessionBean();
		}
		
		this.tipoformulaSessionBean.setsUltimaBusquedaTipoFormula(this.getsAccionBusqueda());
		this.tipoformulaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoformulaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoFormulaSessionBean tipoformulaSessionBean=new TipoFormulaSessionBean();
		
		if(this.tipoformulaSessionBean==null) {
			this.tipoformulaSessionBean=new TipoFormulaSessionBean();
		}
		
		if(this.tipoformulaSessionBean.getsUltimaBusquedaTipoFormula()!=null&&!this.tipoformulaSessionBean.getsUltimaBusquedaTipoFormula().equals("")) {
			this.setsAccionBusqueda(tipoformulaSessionBean.getsUltimaBusquedaTipoFormula());
			this.setiNumeroPaginacion(tipoformulaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoformulaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoformulaSessionBean.setsUltimaBusquedaTipoFormula("");
		this.tipoformulaSessionBean.setiNumeroPaginacion(TipoFormulaConstantesFunciones.INUMEROPAGINACION);
		this.tipoformulaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoFormula(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoFormula() {
		this.updateBorderResaltarBusquedasFormularioTipoFormula();
		this.updateVisibilidadBusquedasFormularioTipoFormula();
		this.updateHabilitarBusquedasFormularioTipoFormula();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoFormula() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoFormula() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoFormula() {
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
	
	public void updateControlesFormularioTipoFormula() throws Exception {

		if(this.jInternalFrameDetalleFormTipoFormula==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoFormula();
		this.updateVisibilidadResaltarControlesFormularioTipoFormula();
		this.updateHabilitarResaltarControlesFormularioTipoFormula();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoFormula() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFormula==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoformulaConstantesFunciones.resaltaridTipoFormula!=null && this.jInternalFrameDetalleFormTipoFormula!=null) {this.jInternalFrameDetalleFormTipoFormula.jTextFieldidTipoFormula.setBorder(this.tipoformulaConstantesFunciones.resaltaridTipoFormula);}
		if(this.tipoformulaConstantesFunciones.resaltarnombreTipoFormula!=null && this.jInternalFrameDetalleFormTipoFormula!=null) {this.jInternalFrameDetalleFormTipoFormula.jTextAreanombreTipoFormula.setBorder(this.tipoformulaConstantesFunciones.resaltarnombreTipoFormula);}
		if(this.tipoformulaConstantesFunciones.resaltardescripcionTipoFormula!=null && this.jInternalFrameDetalleFormTipoFormula!=null) {this.jInternalFrameDetalleFormTipoFormula.jTextAreadescripcionTipoFormula.setBorder(this.tipoformulaConstantesFunciones.resaltardescripcionTipoFormula);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoFormula() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoFormula==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) {
	
		//this.jInternalFrameDetalleFormTipoFormula.jTextFieldidTipoFormula.setVisible(this.tipoformulaConstantesFunciones.mostraridTipoFormula);
		this.jInternalFrameDetalleFormTipoFormula.jPanelidTipoFormula.setVisible(this.tipoformulaConstantesFunciones.mostraridTipoFormula);
		//this.jInternalFrameDetalleFormTipoFormula.jTextAreanombreTipoFormula.setVisible(this.tipoformulaConstantesFunciones.mostrarnombreTipoFormula);
		this.jInternalFrameDetalleFormTipoFormula.jPanelnombreTipoFormula.setVisible(this.tipoformulaConstantesFunciones.mostrarnombreTipoFormula);
		//this.jInternalFrameDetalleFormTipoFormula.jTextAreadescripcionTipoFormula.setVisible(this.tipoformulaConstantesFunciones.mostrardescripcionTipoFormula);
		this.jInternalFrameDetalleFormTipoFormula.jPaneldescripcionTipoFormula.setVisible(this.tipoformulaConstantesFunciones.mostrardescripcionTipoFormula);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoFormula() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFormula==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFormula!=null) {
	
		this.jInternalFrameDetalleFormTipoFormula.jTextFieldidTipoFormula.setEnabled(this.tipoformulaConstantesFunciones.activaridTipoFormula);
		this.jInternalFrameDetalleFormTipoFormula.jTextAreanombreTipoFormula.setEnabled(this.tipoformulaConstantesFunciones.activarnombreTipoFormula);
		this.jInternalFrameDetalleFormTipoFormula.jTextAreadescripcionTipoFormula.setEnabled(this.tipoformulaConstantesFunciones.activardescripcionTipoFormula);
		}
	}
	
		
}