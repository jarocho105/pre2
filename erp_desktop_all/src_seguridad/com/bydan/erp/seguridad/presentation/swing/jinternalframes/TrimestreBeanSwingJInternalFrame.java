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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




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

import com.bydan.erp.seguridad.util.TrimestreConstantesFunciones;
import com.bydan.erp.seguridad.util.TrimestreParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.TrimestreParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.TrimestreBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;

import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TrimestreBeanSwingJInternalFrame extends TrimestreJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TrimestreBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Trimestre> trimestreValidator = new ClassValidator<Trimestre>(Trimestre.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Trimestre trimestre;	
	public Trimestre trimestreAux;
	public Trimestre trimestreAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Trimestre trimestreTotales;
	public Long idTrimestreActual;
	public Long iIdNuevoTrimestre=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoTrimestre;
	public Boolean isPermisoNuevoTrimestre;
	public Boolean isPermisoActualizarTrimestre;
	public Boolean isPermisoActualizarOriginalTrimestre;
	public Boolean isPermisoEliminarTrimestre;
	public Boolean isPermisoGuardarCambiosTrimestre;
	public Boolean isPermisoConsultaTrimestre;
	public Boolean isPermisoBusquedaTrimestre;
	public Boolean isPermisoReporteTrimestre;
	public Boolean isPermisoPaginacionMedioTrimestre;
	public Boolean isPermisoPaginacionAltoTrimestre;
	public Boolean isPermisoPaginacionTodoTrimestre;
	public Boolean isPermisoCopiarTrimestre;
	public Boolean isPermisoVerFormTrimestre;
	public Boolean isPermisoDuplicarTrimestre;
	public Boolean isPermisoOrdenTrimestre;
	
	
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
	
	public TrimestreParameterReturnGeneral trimestreReturnGeneral;
	public TrimestreParameterReturnGeneral trimestreParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTrimestre=false;
	public Boolean esParaAccionDesdeFormularioTrimestre=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TrimestreLogic trimestreLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Trimestre trimestreBean;
	public TrimestreConstantesFunciones trimestreConstantesFunciones;
	//public TrimestreParameterReturnGeneral trimestreReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Trimestre> trimestres;	
	//public List<Trimestre> trimestresEliminados;
	//public List<Trimestre> trimestresAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTrimestre=false;
	public Boolean isVisibilidadCeldaDuplicarTrimestre=true;
	public Boolean isVisibilidadCeldaCopiarTrimestre=true;
	public Boolean isVisibilidadCeldaVerFormTrimestre=true;
	public Boolean isVisibilidadCeldaOrdenTrimestre=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTrimestre=false;
	public Boolean isVisibilidadCeldaModificarTrimestre=false;
	public Boolean isVisibilidadCeldaActualizarTrimestre=false;
	public Boolean isVisibilidadCeldaEliminarTrimestre=false;
	public Boolean isVisibilidadCeldaCancelarTrimestre=false;
	public Boolean isVisibilidadCeldaGuardarTrimestre=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTrimestre=false;	
	
	
	
	public Long getiIdNuevoTrimestre() {
		return this.iIdNuevoTrimestre;
	}

	public void setiIdNuevoTrimestre(Long iIdNuevoTrimestre) {
		this.iIdNuevoTrimestre = iIdNuevoTrimestre;
	}
	
	public Long getidTrimestreActual() {
		return this.idTrimestreActual;
	}

	public void setidTrimestreActual(Long idTrimestreActual) {
		this.idTrimestreActual = idTrimestreActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Trimestre gettrimestre() {
		return this.trimestre;
	}

	public void settrimestre(Trimestre trimestre) {
		this.trimestre = trimestre;
	}
	
	public Trimestre gettrimestreAux() {
		return this.trimestreAux;
	}

	public void settrimestreAux(Trimestre trimestreAux) {
		this.trimestreAux = trimestreAux;
	}				
	
	public Trimestre gettrimestreAnterior() {
		return this.trimestreAnterior;
	}

	public void settrimestreAnterior(Trimestre trimestreAnterior) {
		this.trimestreAnterior = trimestreAnterior;
	}	
	
	public Trimestre gettrimestreTotales() {
		return this.trimestreTotales;
	}

	public void settrimestreTotales(Trimestre trimestreTotales) {
		this.trimestreTotales = trimestreTotales;
	}	
	
	public Trimestre gettrimestreBean() {
		return this.trimestreBean;
	}

	public void settrimestreBean(Trimestre trimestreBean) {
		this.trimestreBean = trimestreBean;
	}	
	
	public TrimestreParameterReturnGeneral gettrimestreReturnGeneral() {
		return this.trimestreReturnGeneral;
	}

	public void settrimestreReturnGeneral(TrimestreParameterReturnGeneral trimestreReturnGeneral) {
		this.trimestreReturnGeneral = trimestreReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TrimestreLogic getTrimestreLogic()	{		
		return trimestreLogic;
	}

	public void setTrimestreLogic(TrimestreLogic trimestreLogic) {
		this.trimestreLogic = trimestreLogic;
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
	
	public Boolean getIsEsNuevoTrimestre() {
		return isEsNuevoTrimestre;
	}

	public void setIsEsNuevoTrimestre(Boolean isEsNuevoTrimestre) {
		this.isEsNuevoTrimestre = isEsNuevoTrimestre;
	}

	public Boolean getEsParaAccionDesdeFormularioTrimestre() {
		return esParaAccionDesdeFormularioTrimestre;
	}
	
	public void setEsParaAccionDesdeFormularioTrimestre(Boolean esParaAccionDesdeFormularioTrimestre) {
		this.esParaAccionDesdeFormularioTrimestre = esParaAccionDesdeFormularioTrimestre;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTrimestre() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TrimestreConstantesFunciones.refrescarForeignKeysDescripcionesTrimestre(this.trimestreLogic.getTrimestres());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TrimestreConstantesFunciones.refrescarForeignKeysDescripcionesTrimestre(this.trimestres);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//trimestreLogic.setTrimestres(this.trimestres);
			trimestreLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TrimestreParameterReturnGeneral getTrimestreParameterGeneral() {
		return this.trimestreParameterGeneral;
	}
	
	public void setTrimestreParameterGeneral(TrimestreParameterReturnGeneral trimestreParameterGeneral) {
		this.trimestreParameterGeneral = trimestreParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTrimestre() {
		return isPermisoTodoTrimestre;
	}

	public void setIsPermisoTodoTrimestre(Boolean isPermisoTodoTrimestre) {
		this.isPermisoTodoTrimestre = isPermisoTodoTrimestre;
	}

	public Boolean getIsPermisoNuevoTrimestre() {
		return isPermisoNuevoTrimestre;
	}

	public void setIsPermisoNuevoTrimestre(Boolean isPermisoNuevoTrimestre) {
		this.isPermisoNuevoTrimestre = isPermisoNuevoTrimestre;
	}

	public Boolean getIsPermisoActualizarTrimestre() {
		return isPermisoActualizarTrimestre;
	}

	public void setIsPermisoActualizarTrimestre(Boolean isPermisoActualizarTrimestre) {
		this.isPermisoActualizarTrimestre = isPermisoActualizarTrimestre;
	}

	public Boolean getIsPermisoEliminarTrimestre() {
		return isPermisoEliminarTrimestre;
	}

	public void setIsPermisoEliminarTrimestre(Boolean isPermisoEliminarTrimestre) {
		this.isPermisoEliminarTrimestre = isPermisoEliminarTrimestre;
	}

	public Boolean getIsPermisoGuardarCambiosTrimestre() {
		return isPermisoGuardarCambiosTrimestre;
	}

	public void setIsPermisoGuardarCambiosTrimestre(Boolean isPermisoGuardarCambiosTrimestre) {
		this.isPermisoGuardarCambiosTrimestre = isPermisoGuardarCambiosTrimestre;
	}
	
	public Boolean getIsPermisoConsultaTrimestre() {
		return isPermisoConsultaTrimestre;
	}

	public void setIsPermisoConsultaTrimestre(Boolean isPermisoConsultaTrimestre) {
		this.isPermisoConsultaTrimestre = isPermisoConsultaTrimestre;
	}

	public Boolean getIsPermisoBusquedaTrimestre() {
		return isPermisoBusquedaTrimestre;
	}

	public void setIsPermisoBusquedaTrimestre(Boolean isPermisoBusquedaTrimestre) {
		this.isPermisoBusquedaTrimestre = isPermisoBusquedaTrimestre;
	}

	public Boolean getIsPermisoReporteTrimestre() {
		return isPermisoReporteTrimestre;
	}

	public void setIsPermisoReporteTrimestre(Boolean isPermisoReporteTrimestre) {
		this.isPermisoReporteTrimestre = isPermisoReporteTrimestre;
	}
	
	public Boolean getIsPermisoPaginacionMedioTrimestre() {
		return isPermisoPaginacionMedioTrimestre;
	}

	public void setIsPermisoPaginacionMedioTrimestre(Boolean isPermisoPaginacionMedioTrimestre) {
		this.isPermisoPaginacionMedioTrimestre = isPermisoPaginacionMedioTrimestre;
	}
	
	public Boolean getIsPermisoPaginacionTodoTrimestre() {
		return isPermisoPaginacionTodoTrimestre;
	}

	public void setIsPermisoPaginacionTodoTrimestre(Boolean isPermisoPaginacionTodoTrimestre) {
		this.isPermisoPaginacionTodoTrimestre = isPermisoPaginacionTodoTrimestre;
	}
	
	public Boolean getIsPermisoPaginacionAltoTrimestre() {
		return isPermisoPaginacionAltoTrimestre;
	}

	public void setIsPermisoPaginacionAltoTrimestre(Boolean isPermisoPaginacionAltoTrimestre) {
		this.isPermisoPaginacionAltoTrimestre = isPermisoPaginacionAltoTrimestre;
	}
	
	public Boolean getIsPermisoCopiarTrimestre() {
		return isPermisoCopiarTrimestre;
	}

	public void setIsPermisoCopiarTrimestre(Boolean isPermisoCopiarTrimestre) {
		this.isPermisoCopiarTrimestre = isPermisoCopiarTrimestre;
	}
	
	public Boolean getIsPermisoVerFormTrimestre() {
		return isPermisoVerFormTrimestre;
	}

	public void setIsPermisoVerFormTrimestre(Boolean isPermisoVerFormTrimestre) {
		this.isPermisoVerFormTrimestre = isPermisoVerFormTrimestre;
	}
	
	public Boolean getIsPermisoDuplicarTrimestre() {
		return isPermisoDuplicarTrimestre;
	}

	public void setIsPermisoDuplicarTrimestre(Boolean isPermisoDuplicarTrimestre) {
		this.isPermisoDuplicarTrimestre = isPermisoDuplicarTrimestre;
	}
	
	public Boolean getIsPermisoOrdenTrimestre() {
		return isPermisoOrdenTrimestre;
	}

	public void setIsPermisoOrdenTrimestre(Boolean isPermisoOrdenTrimestre) {
		this.isPermisoOrdenTrimestre = isPermisoOrdenTrimestre;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTrimestre() {
		return isVisibilidadCeldaNuevoTrimestre;
	}

	public void setIsVisibilidadCeldaNuevoTrimestre(Boolean isVisibilidadCeldaNuevoTrimestre) {
		this.isVisibilidadCeldaNuevoTrimestre = isVisibilidadCeldaNuevoTrimestre;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTrimestre() {
		return isVisibilidadCeldaDuplicarTrimestre;
	}

	public void setIsVisibilidadCeldaDuplicarTrimestre(Boolean isVisibilidadCeldaDuplicarTrimestre) {
		this.isVisibilidadCeldaDuplicarTrimestre = isVisibilidadCeldaDuplicarTrimestre;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTrimestre() {
		return isVisibilidadCeldaCopiarTrimestre;
	}

	public void setIsVisibilidadCeldaCopiarTrimestre(Boolean isVisibilidadCeldaCopiarTrimestre) {
		this.isVisibilidadCeldaCopiarTrimestre = isVisibilidadCeldaCopiarTrimestre;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTrimestre() {
		return isVisibilidadCeldaVerFormTrimestre;
	}

	public void setIsVisibilidadCeldaVerFormTrimestre(Boolean isVisibilidadCeldaVerFormTrimestre) {
		this.isVisibilidadCeldaVerFormTrimestre = isVisibilidadCeldaVerFormTrimestre;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTrimestre() {
		return isVisibilidadCeldaOrdenTrimestre;
	}

	public void setIsVisibilidadCeldaOrdenTrimestre(Boolean isVisibilidadCeldaOrdenTrimestre) {
		this.isVisibilidadCeldaOrdenTrimestre = isVisibilidadCeldaOrdenTrimestre;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTrimestre() {
		return isVisibilidadCeldaNuevoRelacionesTrimestre;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTrimestre(Boolean isVisibilidadCeldaNuevoRelacionesTrimestre) {
		this.isVisibilidadCeldaNuevoRelacionesTrimestre = isVisibilidadCeldaNuevoRelacionesTrimestre;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTrimestre() {
		return isVisibilidadCeldaModificarTrimestre;
	}

	public void setIsVisibilidadCeldaModificarTrimestre(Boolean isVisibilidadCeldaModificarTrimestre) {
		this.isVisibilidadCeldaModificarTrimestre = isVisibilidadCeldaModificarTrimestre;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTrimestre() {
		return isVisibilidadCeldaActualizarTrimestre;
	}

	public void setIsVisibilidadCeldaActualizarTrimestre(Boolean isVisibilidadCeldaActualizarTrimestre) {
		this.isVisibilidadCeldaActualizarTrimestre = isVisibilidadCeldaActualizarTrimestre;
	}

	public Boolean getIsVisibilidadCeldaEliminarTrimestre() {
		return isVisibilidadCeldaEliminarTrimestre;
	}

	public void setIsVisibilidadCeldaEliminarTrimestre(Boolean isVisibilidadCeldaEliminarTrimestre) {
		this.isVisibilidadCeldaEliminarTrimestre = isVisibilidadCeldaEliminarTrimestre;
	}

	public Boolean getIsVisibilidadCeldaCancelarTrimestre() {
		return isVisibilidadCeldaCancelarTrimestre;
	}

	public void setIsVisibilidadCeldaCancelarTrimestre(Boolean isVisibilidadCeldaCancelarTrimestre) {
		this.isVisibilidadCeldaCancelarTrimestre = isVisibilidadCeldaCancelarTrimestre;
	}

	public Boolean getIsVisibilidadCeldaGuardarTrimestre() {
		return isVisibilidadCeldaGuardarTrimestre;
	}

	public void setIsVisibilidadCeldaGuardarTrimestre(Boolean isVisibilidadCeldaGuardarTrimestre) {
		this.isVisibilidadCeldaGuardarTrimestre = isVisibilidadCeldaGuardarTrimestre;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTrimestre() {
		return isVisibilidadCeldaGuardarCambiosTrimestre;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTrimestre(Boolean isVisibilidadCeldaGuardarCambiosTrimestre) {
		this.isVisibilidadCeldaGuardarCambiosTrimestre = isVisibilidadCeldaGuardarCambiosTrimestre;
	}
		
	public TrimestreSessionBean gettrimestreSessionBean() {
		return this.trimestreSessionBean;
	}
	
	public void settrimestreSessionBean(TrimestreSessionBean trimestreSessionBean) {
		this.trimestreSessionBean=trimestreSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTrimestre(Trimestre trimestre)throws Exception {
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
	
	public void bugActualizarReferenciaActual(Trimestre trimestre,Trimestre trimestreAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTrimestre(trimestre);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		trimestreAux.setId(trimestre.getId());
		trimestreAux.setVersionRow(trimestre.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTrimestre();
		
			int intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestre =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.trimestre =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TrimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTrimestre(this.trimestre,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTrimestre(this.trimestre);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = trimestreValidator.getInvalidValues(this.trimestre);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			trimestreLogic.setDatosCliente(datosCliente);
			trimestreLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				trimestreAux=new  Trimestre();
				
				trimestreAux.setIsNew(true);
				trimestreAux.setIsChanged(true);
				
				trimestreAux.setTrimestreOriginal(this.trimestre);
				
				trimestreAux.setId(this.trimestre.getId());	
				trimestreAux.setVersionRow(this.trimestre.getVersionRow());	
				trimestreAux.setnombre(this.trimestre.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.trimestreSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.trimestreSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(trimestreAux,trimestreLogic.getTrimestres());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(trimestreAux,trimestres);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.trimestreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.trimestreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						trimestreLogic.saveTrimestres();//WithConnection
						//trimestreLogic.getSetVersionRowTrimestres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.trimestre,trimestreAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				trimestreAux=new  Trimestre();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.trimestreSessionBean.getEsGuardarRelacionado() 
					|| (this.trimestreSessionBean.getEsGuardarRelacionado() && this.trimestre.getId()>=0)) {
						
					trimestreAux.setIsNew(false);
				}
				
				trimestreAux.setIsDeleted(false);
			
				trimestreAux.setId(this.trimestre.getId());	
				trimestreAux.setVersionRow(this.trimestre.getVersionRow());	
				trimestreAux.setnombre(this.trimestre.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(trimestreAux,trimestreLogic.getTrimestres());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(trimestreAux,trimestres);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.trimestreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.trimestreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						trimestreLogic.saveTrimestres();//WithConnection
						//trimestreLogic.getSetVersionRowTrimestres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.trimestre,trimestreAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				trimestreAux=new  Trimestre();
				
				trimestreAux.setIsNew(false);
				trimestreAux.setIsChanged(false);
				
				trimestreAux.setIsDeleted(true);
				
				trimestreAux.setId(this.trimestre.getId());	
				trimestreAux.setVersionRow(this.trimestre.getVersionRow());	
				trimestreAux.setnombre(this.trimestre.getnombre());	
				
				if(this.trimestreSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.trimestreAux.getId()>=0) {	
						this.trimestresEliminados.add(trimestreAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(trimestreAux,trimestreLogic.getTrimestres());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(trimestreAux,trimestres);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.trimestreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.trimestreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						trimestreLogic.saveTrimestres();//WithConnection
						//trimestreLogic.getSetVersionRowTrimestres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestreLogic.getTrimestres().addAll(this.trimestresEliminados);
					
					trimestreLogic.saveTrimestres();//WithConnection
					//trimestreLogic.getSetVersionRowTrimestres();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.trimestresEliminados= new ArrayList<Trimestre>();		
			}
			
			if(this.trimestreSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.trimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Trimestre GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Trimestre",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.trimestre=trimestreAux;
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
      		//this.finishProcessTrimestre();
      	}
		
	}	
	
	public void actualizarRelaciones(Trimestre trimestreLocal) throws Exception {
		
		if(this.trimestreSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Trimestre trimestreLocal) throws Exception {	
		if(this.trimestreSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTrimestreActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.trimestre =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.trimestre =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = trimestreValidator.getInvalidValues(this.trimestre);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Trimestre trimestre,List<Trimestre> trimestres) throws Exception {
		try	{		
			TrimestreConstantesFunciones.actualizarLista(trimestre,trimestres,this.trimestreSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Trimestre trimestre,List<Trimestre> trimestres) throws Exception {
		try	{			
			TrimestreConstantesFunciones.actualizarSelectedLista(trimestre,trimestres);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Trimestre> trimestresLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				trimestresLocal=this.trimestreLogic.getTrimestres();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				trimestresLocal=this.trimestres;
			}
			//ARCHITECTURE
		
			for(Trimestre trimestreLocal:trimestresLocal) {
				if(this.permiteMantenimiento(trimestreLocal) && trimestreLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TrimestreConstantesFunciones.getTrimestreLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TrimestreConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTrimestre.jLabelnombreTrimestre,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTrimestre.jLabelnombreTrimestre,"");
		
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
		this.iIdNuevoTrimestre--;	
		
		
		this.trimestreAux=new Trimestre();
		
		this.trimestreAux.setId(this.iIdNuevoTrimestre);
		this.trimestreAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.trimestreLogic.getTrimestres().add(this.trimestreAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.trimestres.add(this.trimestreAux);
		}
		//ARCHITECTURE
		
		this.trimestre=this.trimestreAux;
		
		if(TrimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTrimestre(this.trimestre);
			this.setVariablesObjetoActualToFormularioForeignKeyTrimestre(this.trimestre);
		}
				
		//this.setDefaultControlesTrimestre();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTrimestre();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTrimestre();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTrimestre();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTrimestre(this.trimestreBean,this.trimestre,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTrimestre(this.trimestre);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TrimestreConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.trimestreSessionBean.getConGuardarRelaciones()) {
			classes=TrimestreConstantesFunciones.getClassesRelationshipsOfTrimestre(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.trimestreReturnGeneral=trimestreLogic.procesarEventosTrimestresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.trimestreLogic.getTrimestres(),this.trimestre,this.trimestreParameterGeneral,this.isEsNuevoTrimestre,classes);//this.trimestreLogic.getTrimestre()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTrimestre(this.trimestreReturnGeneral,this.trimestreBean,false);
		
		if(this.trimestreReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTrimestre(this.trimestreReturnGeneral.getTrimestre());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTrimestre(this.trimestreReturnGeneral.getTrimestre());
		}
		
		if(this.trimestreReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTrimestre(this.trimestreReturnGeneral.getTrimestre(),classes);//this.trimestreBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTrimestre(this.trimestre,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTrimestre();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTrimestre();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTrimestre(false);
						
			if(trimestreSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TrimestreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTrimestre();
			}
			
			this.actualizarVisualTableDatosTrimestre();
			
			this.jTableDatosTrimestre.setRowSelectionInterval(this.getIndiceNuevoTrimestre(), this.getIndiceNuevoTrimestre());
			
			this.seleccionarFilaTablaTrimestreActual();
						
			this.actualizarEstadoCeldasBotonesTrimestre("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTrimestre(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTrimestre.jTextFieldnombreTrimestre.setEnabled(isHabilitar && this.trimestreConstantesFunciones.activarnombreTrimestre);	
		
	};
	
	public void setDefaultControlesTrimestre() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTrimestre(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.trimestreSessionBean.setConGuardarRelaciones(true);			
			this.trimestreSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTrimestre.jTabbedPaneRelacionesTrimestre.setVisible(true);
			
					
		} else {
			//this.trimestreSessionBean.setConGuardarRelaciones(false);			
			this.trimestreSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTrimestre.jTabbedPaneRelacionesTrimestre.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTrimestre() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Trimestre trimestreAux:this.trimestreLogic.getTrimestres()) {
				if(trimestreAux.getId().equals(this.iIdNuevoTrimestre)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Trimestre trimestreAux:this.trimestres) {
				if(trimestreAux.getId().equals(this.iIdNuevoTrimestre)) {
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
	
	public int getIndiceActualTrimestre(Trimestre trimestre,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Trimestre trimestreAux:this.trimestreLogic.getTrimestres()) {
				if(trimestreAux.getId().equals(trimestre.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Trimestre trimestreAux:this.trimestres) {
				if(trimestreAux.getId().equals(trimestre.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTrimestre(Trimestre trimestreOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Trimestre trimestreAux:this.trimestreLogic.getTrimestres()) {
				if(trimestreAux.getTrimestreOriginal().getId().equals(trimestreOriginal.getId())) {
					existe=true;
					trimestreOriginal.setId(trimestreAux.getId());
					trimestreOriginal.setVersionRow(trimestreAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Trimestre trimestreAux:this.trimestres) {
				if(trimestreAux.getTrimestreOriginal().getId().equals(trimestreOriginal.getId())) {
					existe=true;
					trimestreOriginal.setId(trimestreAux.getId());
					trimestreOriginal.setVersionRow(trimestreAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTrimestre(Boolean esParaCancelar) throws Exception {
		trimestresAux=new ArrayList<Trimestre>();
		trimestreAux=new Trimestre();
		
		if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Trimestre trimestreAux:this.trimestreLogic.getTrimestres()) {
					if(trimestreAux.getId()<0) {
						trimestresAux.add(trimestreAux);
					}		
				}
				this.iIdNuevoTrimestre=0L;
				this.trimestreLogic.getTrimestres().removeAll(trimestresAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Trimestre trimestreAux:this.trimestres) {
					if(trimestreAux.getId()<0) {
						trimestresAux.add(trimestreAux);
					}		
				}
				this.iIdNuevoTrimestre=0L;
				this.trimestres.removeAll(trimestresAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTrimestre 
					&& this.trimestreLogic.getTrimestres().size()>0
					) {
					trimestreAux=this.trimestreLogic.getTrimestres().get(this.trimestreLogic.getTrimestres().size() - 1);
				
					if(trimestreAux.getId()<0) {
						this.trimestreLogic.getTrimestres().remove(trimestreAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTrimestre && this.trimestres.size()>0) {
					trimestreAux=this.trimestres.get(this.trimestres.size() - 1);
				
					if(trimestreAux.getId()<0) {
						this.trimestres.remove(trimestreAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTrimestre(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(trimestre.getId()<0) {
				this.trimestreLogic.getTrimestres().remove(this.trimestre);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(trimestre.getId()<0) {
				this.trimestres.remove(this.trimestre);
			}
		}			
	}
	
	public void setEstadosInicialesTrimestre(List<Trimestre> trimestresAux) throws Exception {
		TrimestreConstantesFunciones.setEstadosInicialesTrimestre(trimestresAux);
	}
	
	public void setEstadosInicialesTrimestre(Trimestre trimestreAux) throws Exception {
		TrimestreConstantesFunciones.setEstadosInicialesTrimestre(trimestreAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTrimestreActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTrimestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTrimestreActual()) {
				if(!this.isEsNuevoTrimestre) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTrimestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTrimestre=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTrimestreActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Trimestre ?", "MANTENIMIENTO DE Trimestre", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTrimestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Trimestre trimestre) throws Exception {
		TrimestreConstantesFunciones.seleccionarAsignar(this.trimestre,trimestre);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTrimestre=this.isPermisoActualizarOriginalTrimestre;
			
			
			this.seleccionarAsignar(trimestre);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TrimestreConstantesFunciones.quitarEspaciosTrimestre(this.trimestre,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTrimestre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.trimestreSessionBean.setsFuncionBusquedaRapida(this.trimestreSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTrimestre) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTrimestre(esParaCancelar);				
				this.cancelarNuevoTrimestre(esParaCancelar);								
			}
			
			this.trimestre=new Trimestre();
			
			this.inicializarTrimestre();
			
			this.actualizarEstadoCeldasBotonesTrimestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTrimestre() throws Exception {
		try {
			TrimestreConstantesFunciones.inicializarTrimestre(this.trimestre);
			
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
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.trimestreLogic.getTrimestres().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTrimestres(String sAccionBusqueda,List<Trimestre> trimestresParaReportes) throws Exception {
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
					sPathReporteFinal="Trimestre"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TrimestreMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TrimestreMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Trimestre"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Trimestres");		
		parameters.put("busquedapor", TrimestreConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTrimestre=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TrimestreConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TrimestreConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTrimestre=new JRBeanArrayDataSource(TrimestreJInternalFrame.TraerTrimestreBeans(trimestresParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTrimestre);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TrimestreConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TrimestreConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TrimestreBean.TraerTrimestreBeans(trimestresParaReportes).toArray()));
							
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
				this.generarExcelReporteTrimestres(sAccionBusqueda,sTipoArchivoReporte,trimestresParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTrimestres(sAccionBusqueda,sTipoArchivoReporte,trimestresParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTrimestreActionPerformed(null);
					//this.generarExcelReporteTrimestres(sAccionBusqueda,sTipoArchivoReporte,trimestresParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTrimestres(sAccionBusqueda,sTipoArchivoReporte,trimestresParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTrimestres(sAccionBusqueda,sTipoArchivoReporte,trimestresParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTrimestres(sAccionBusqueda,sTipoArchivoReporte,trimestresParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTrimestres(String sAccionBusqueda,String sTipoArchivoReporte,List<Trimestre> trimestresParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"trimestre";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Trimestres");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTrimestre("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Trimestre trimestre : trimestresParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TrimestreConstantesFunciones.generarExcelReporteDataTrimestre("NORMAL",row,workbook,trimestre,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.trimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Trimestre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTrimestre(String sTipo,Row row,Workbook workbook) {
		
		TrimestreConstantesFunciones.generarExcelReporteHeaderTrimestre(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTrimestres(String sAccionBusqueda,String sTipoArchivoReporte,List<Trimestre> trimestresParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"trimestre_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Trimestres");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Trimestre trimestre : trimestresParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TrimestreConstantesFunciones.getTrimestreDescripcion(trimestre));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TrimestreConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TrimestreConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(trimestre.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.trimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Trimestre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTrimestres(String sAccionBusqueda,String sTipoArchivoReporte,List<Trimestre> trimestresParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Trimestre> trimestresRespaldo=null;
		
		classes=TrimestreConstantesFunciones.getClassesRelationshipsOfTrimestre(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.trimestreLogic.setDatosCliente(this.datosCliente);
		this.trimestreLogic.setDatosDeep(this.datosDeep);
		this.trimestreLogic.setIsConDeep(true);
		
		trimestresRespaldo=this.trimestreLogic.getTrimestres();
		
		this.trimestreLogic.setTrimestres(trimestresParaReportes);	
		this.trimestreLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		trimestresParaReportes=this.trimestreLogic.getTrimestres();
		this.trimestreLogic.setTrimestres(trimestresRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"trimestre_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Trimestres");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTrimestre("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Trimestre trimestre : trimestresParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTrimestre("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TrimestreConstantesFunciones.generarExcelReporteDataTrimestre("NORMAL",row,workbook,trimestre,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TrimestreConstantesFunciones.getTrimestreDescripcion(trimestre));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.trimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Trimestre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTrimestre.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTrimestre.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTrimestre.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTrimestre.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTrimestre() throws Exception {		
		this.startProcessTrimestre(true);
	}
	
	public void startProcessTrimestre(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTrimestre, this.jScrollPanelDatosTrimestre,this.jPanelPaginacionTrimestre, this.jScrollPanelDatosEdicionTrimestre, this.jPanelAccionesTrimestre,this.jPanelAccionesFormularioTrimestre,this.jmenuBarTrimestre,this.jmenuBarDetalleTrimestre,this.jTtoolBarTrimestre,this.jTtoolBarDetalleTrimestre);		
		
		final JTabbedPane jTabbedPaneBusquedasTrimestre=null; 
		
		final JPanel jPanelParametrosReportesTrimestre=this.jPanelParametrosReportesTrimestre;
		//final JScrollPane jScrollPanelDatosTrimestre=this.jScrollPanelDatosTrimestre;
		final JTable jTableDatosTrimestre=this.jTableDatosTrimestre;		
		final JPanel jPanelPaginacionTrimestre=this.jPanelPaginacionTrimestre;
		//final JScrollPane jScrollPanelDatosEdicionTrimestre=this.jScrollPanelDatosEdicionTrimestre;
		final JPanel jPanelAccionesTrimestre=this.jPanelAccionesTrimestre;
		
		JPanel jPanelCamposAuxiliarTrimestre=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTrimestre=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) {
			jPanelCamposAuxiliarTrimestre=this.jInternalFrameDetalleFormTrimestre.jPanelCamposTrimestre;
			jPanelAccionesFormularioAuxiliarTrimestre=this.jInternalFrameDetalleFormTrimestre.jPanelAccionesFormularioTrimestre;
		}
		
		final JPanel jPanelCamposTrimestre=jPanelCamposAuxiliarTrimestre;
		final JPanel jPanelAccionesFormularioTrimestre=jPanelAccionesFormularioAuxiliarTrimestre;
		
		
		final JMenuBar jmenuBarTrimestre=this.jmenuBarTrimestre;
		final JToolBar jTtoolBarTrimestre=this.jTtoolBarTrimestre;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTrimestre=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTrimestre=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) {
			jmenuBarDetalleAuxiliarTrimestre=this.jInternalFrameDetalleFormTrimestre.jmenuBarDetalleTrimestre;
			jTtoolBarDetalleAuxiliarTrimestre=this.jInternalFrameDetalleFormTrimestre.jTtoolBarDetalleTrimestre;
		}
		
		final JMenuBar jmenuBarDetalleTrimestre=jmenuBarDetalleAuxiliarTrimestre;
		final JToolBar jTtoolBarDetalleTrimestre=jTtoolBarDetalleAuxiliarTrimestre;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTrimestre;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTrimestre;
			processRunnable.jTableDatos=jTableDatosTrimestre;
			processRunnable.jPanelCampos=jPanelCamposTrimestre;
			processRunnable.jPanelPaginacion=jPanelPaginacionTrimestre;
			processRunnable.jPanelAcciones=jPanelAccionesTrimestre;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTrimestre;
			
			
			processRunnable.jmenuBar=jmenuBarTrimestre;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTrimestre;
			processRunnable.jTtoolBar=jTtoolBarTrimestre;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTrimestre;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTrimestre ,jPanelParametrosReportesTrimestre,jTableDatosTrimestre, /*jScrollPanelDatosTrimestre,*/jPanelCamposTrimestre,jPanelPaginacionTrimestre, /*jScrollPanelDatosEdicionTrimestre,*/ jPanelAccionesTrimestre,jPanelAccionesFormularioTrimestre,jmenuBarTrimestre,jmenuBarDetalleTrimestre,jTtoolBarTrimestre,jTtoolBarDetalleTrimestre);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTrimestre, jScrollPanelDatosTrimestre,jPanelPaginacionTrimestre, jScrollPanelDatosEdicionTrimestre, jPanelAccionesTrimestre,jPanelAccionesFormularioTrimestre,jmenuBarTrimestre,jmenuBarDetalleTrimestre,jTtoolBarTrimestre,jTtoolBarDetalleTrimestre);
						
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
	
	public void finishProcessTrimestre() {// throws Exception 
		this.finishProcessTrimestre(true);
	}
	
	public void finishProcessTrimestre(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTrimestre, this.jScrollPanelDatosTrimestre,this.jPanelPaginacionTrimestre, this.jScrollPanelDatosEdicionTrimestre, this.jPanelAccionesTrimestre,this.jPanelAccionesFormularioTrimestre,this.jmenuBarTrimestre,this.jmenuBarDetalleTrimestre,this.jTtoolBarTrimestre,this.jTtoolBarDetalleTrimestre);		
		
		final JTabbedPane jTabbedPaneBusquedasTrimestre=null; 
		
		final JPanel jPanelParametrosReportesTrimestre=this.jPanelParametrosReportesTrimestre;
		//final JScrollPane jScrollPanelDatosTrimestre=this.jScrollPanelDatosTrimestre;
		final JTable jTableDatosTrimestre=this.jTableDatosTrimestre;		
		final JPanel jPanelPaginacionTrimestre=this.jPanelPaginacionTrimestre;
		//final JScrollPane jScrollPanelDatosEdicionTrimestre=this.jScrollPanelDatosEdicionTrimestre;
		final JPanel jPanelAccionesTrimestre=this.jPanelAccionesTrimestre;
		
		JPanel jPanelCamposAuxiliarTrimestre=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTrimestre=new JPanel();
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) {
			jPanelCamposAuxiliarTrimestre=this.jInternalFrameDetalleFormTrimestre.jPanelCamposTrimestre;
			jPanelAccionesFormularioAuxiliarTrimestre=this.jInternalFrameDetalleFormTrimestre.jPanelAccionesFormularioTrimestre;
		}
		
		final JPanel jPanelCamposTrimestre=jPanelCamposAuxiliarTrimestre;
		final JPanel jPanelAccionesFormularioTrimestre=jPanelAccionesFormularioAuxiliarTrimestre;
		
		
		final JMenuBar jmenuBarTrimestre=this.jmenuBarTrimestre;		
		final JToolBar jTtoolBarTrimestre=this.jTtoolBarTrimestre;
				
		JMenuBar jmenuBarDetalleAuxiliarTrimestre=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTrimestre=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) {
			jmenuBarDetalleAuxiliarTrimestre=this.jInternalFrameDetalleFormTrimestre.jmenuBarDetalleTrimestre;
			jTtoolBarDetalleAuxiliarTrimestre=this.jInternalFrameDetalleFormTrimestre.jTtoolBarDetalleTrimestre;		
		}
		
		final JMenuBar jmenuBarDetalleTrimestre=jmenuBarDetalleAuxiliarTrimestre;
		final JToolBar jTtoolBarDetalleTrimestre=jTtoolBarDetalleAuxiliarTrimestre;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTrimestre;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTrimestre;
			processRunnable.jTableDatos=jTableDatosTrimestre;
			processRunnable.jPanelCampos=jPanelCamposTrimestre;
			processRunnable.jPanelPaginacion=jPanelPaginacionTrimestre;
			processRunnable.jPanelAcciones=jPanelAccionesTrimestre;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTrimestre;
			
			
			processRunnable.jmenuBar=jmenuBarTrimestre;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTrimestre;
			processRunnable.jTtoolBar=jTtoolBarTrimestre;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTrimestre;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTrimestre ,jPanelParametrosReportesTrimestre, jTableDatosTrimestre,/*jScrollPanelDatosTrimestre,*/jPanelCamposTrimestre,jPanelPaginacionTrimestre, /*jScrollPanelDatosEdicionTrimestre,*/ jPanelAccionesTrimestre,jPanelAccionesFormularioTrimestre,jmenuBarTrimestre,jmenuBarDetalleTrimestre,jTtoolBarTrimestre,jTtoolBarDetalleTrimestre));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTrimestre(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTrimestre(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTrimestre(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTrimestre(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTrimestre,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTrimestre,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTrimestre(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTrimestre,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTrimestre,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.trimestreConstantesFunciones.getsFinalQueryTrimestre();
		String  finalQueryPaginacionTodos=this.trimestreConstantesFunciones.getsFinalQueryTrimestre();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TrimestreConstantesFunciones.getArrayColumnasGlobalesNoTrimestre(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TrimestreConstantesFunciones.getArrayColumnasGlobalesTrimestre(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TrimestreConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.trimestresEliminados= new ArrayList<Trimestre>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTrimestre();
		
				///*TrimestreSessionBean*/this.trimestreSessionBean=new TrimestreSessionBean();
			
			if(this.trimestreSessionBean==null) {
				this.trimestreSessionBean=new TrimestreSessionBean();
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
					this.iNumeroPaginacion=TrimestreConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TrimestreConstantesFunciones.getClassesForeignKeysOfTrimestre(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/trimestre."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			trimestresAux= new ArrayList<Trimestre>();
			
				
			trimestreLogic.setDatosCliente(this.datosCliente);
			trimestreLogic.setDatosDeep(this.datosDeep);
			trimestreLogic.setIsConDeep(true);
			
			
			trimestreLogic.getTrimestreDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					trimestreLogic.getTodosTrimestres(finalQueryGlobal,pagination);
					
					//trimestreLogic.getTodosTrimestresWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(trimestreLogic.getTrimestres()==null|| trimestreLogic.getTrimestres().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							trimestresAux= new ArrayList<Trimestre>();
							trimestresAux.addAll(trimestreLogic.getTrimestres());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							trimestresAux= new ArrayList<Trimestre>();
							trimestresAux.addAll(trimestres);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							trimestreLogic.getTodosTrimestres(finalQueryGlobal+"",this.pagination);												
							
							//trimestreLogic.getTodosTrimestresWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTrimestres("Todos",trimestreLogic.getTrimestres() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							trimestreLogic.setTrimestres(new ArrayList<Trimestre>());					
							trimestreLogic.getTrimestres().addAll(trimestresAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							trimestres=new ArrayList<Trimestre>();
							trimestres.addAll(trimestresAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTrimestre=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTrimestre=this.idActual;
				
				} else if(this.idTrimestreActual!=null && this.idTrimestreActual!=0L) {
					idTrimestre=idTrimestreActual;
				}
				
					
				this.sDetalleReporte=TrimestreConstantesFunciones.getDetalleIndicePorId(idTrimestre);
				
				this.trimestres=new ArrayList<Trimestre>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					trimestreLogic.getEntity(idTrimestre);
					
					//trimestreLogic.getEntityWithConnection(idTrimestre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					trimestreLogic.setTrimestres(new ArrayList<Trimestre>());
					trimestreLogic.getTrimestres().add(trimestreLogic.getTrimestre());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.trimestres=new ArrayList<Trimestre>();
					this.trimestres.add(trimestre);
				}
				
				if(trimestreLogic.getTrimestre()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTrimestre();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTrimestre();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=trimestreLogic.getTrimestres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=trimestres.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=trimestreLogic.getTrimestres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=trimestres.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Trimestre trimestre) {
		Boolean permite=true;
		
		if(this.trimestre.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TrimestreConstantesFunciones.getOrderByListaTrimestre();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TrimestreConstantesFunciones.getOrderByListaTrimestre();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Trimestre trimestre:trimestreLogic.getTrimestres()) {
				if(trimestre.getsType().equals(Constantes2.S_TOTALES)) {
					trimestreTotales=trimestre;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Trimestre trimestre:this.trimestres) {
				if(trimestre.getsType().equals(Constantes2.S_TOTALES)) {
					trimestreTotales=trimestre;
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
			this.trimestreAux=new Trimestre();
			this.trimestreAux.setsType(Constantes2.S_TOTALES);
			this.trimestreAux.setIsNew(false);
			this.trimestreAux.setIsChanged(false);
			this.trimestreAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TrimestreConstantesFunciones.TotalizarValoresFilaTrimestre(this.trimestreLogic.getTrimestres(),this.trimestreAux);
				
				this.trimestreLogic.getTrimestres().add(this.trimestreAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TrimestreConstantesFunciones.TotalizarValoresFilaTrimestre(this.trimestres,this.trimestreAux);
				
				this.trimestres.add(this.trimestreAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		trimestreTotales=new Trimestre();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.trimestreLogic.getTrimestres().remove(trimestreTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.trimestres.remove(trimestreTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		trimestreTotales=new Trimestre();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Trimestre trimestre:trimestreLogic.getTrimestres()) {
				if(trimestre.getsType().equals(Constantes2.S_TOTALES)) {
					trimestreTotales=trimestre;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TrimestreConstantesFunciones.TotalizarValoresFilaTrimestre(this.trimestreLogic.getTrimestres(),trimestreTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Trimestre trimestre:this.trimestres) {
				if(trimestre.getsType().equals(Constantes2.S_TOTALES)) {
					trimestreTotales=trimestre;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TrimestreConstantesFunciones.TotalizarValoresFilaTrimestre(this.trimestres,trimestreTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTrimestre() {
		this.isPermisoTodoTrimestre=false;
		this.isPermisoNuevoTrimestre=false;
		this.isPermisoActualizarTrimestre=false;
		this.isPermisoActualizarOriginalTrimestre=false;
		this.isPermisoEliminarTrimestre=false;
		this.isPermisoGuardarCambiosTrimestre=false;
		this.isPermisoConsultaTrimestre=false;
		this.isPermisoBusquedaTrimestre=false;
		this.isPermisoReporteTrimestre=false;		
		this.isPermisoOrdenTrimestre=false;		
		this.isPermisoPaginacionMedioTrimestre=false;		
		this.isPermisoPaginacionAltoTrimestre=false;
		this.isPermisoPaginacionTodoTrimestre=false;
		this.isPermisoCopiarTrimestre=false;		
		this.isPermisoVerFormTrimestre=false;		
		this.isPermisoDuplicarTrimestre=false;		
		this.isPermisoOrdenTrimestre=false;		
	}
	
	public void setPermisosUsuarioTrimestre(Boolean isPermiso) {
		this.isPermisoTodoTrimestre=isPermiso;
		this.isPermisoNuevoTrimestre=isPermiso;
		this.isPermisoActualizarTrimestre=isPermiso;
		this.isPermisoActualizarOriginalTrimestre=isPermiso;
		this.isPermisoEliminarTrimestre=isPermiso;
		this.isPermisoGuardarCambiosTrimestre=isPermiso;
		this.isPermisoConsultaTrimestre=isPermiso;
		this.isPermisoBusquedaTrimestre=isPermiso;
		this.isPermisoReporteTrimestre=isPermiso;
		this.isPermisoOrdenTrimestre=isPermiso;		
		this.isPermisoPaginacionMedioTrimestre=isPermiso;		
		this.isPermisoPaginacionAltoTrimestre=isPermiso;		
		this.isPermisoPaginacionTodoTrimestre=isPermiso;		
		this.isPermisoCopiarTrimestre=isPermiso;		
		this.isPermisoVerFormTrimestre=isPermiso;		
		this.isPermisoDuplicarTrimestre=isPermiso;
		this.isPermisoOrdenTrimestre=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTrimestre(Boolean isPermiso) {
		//this.isPermisoTodoTrimestre=isPermiso;
		this.isPermisoNuevoTrimestre=isPermiso;
		this.isPermisoActualizarTrimestre=isPermiso;
		this.isPermisoActualizarOriginalTrimestre=isPermiso;
		this.isPermisoEliminarTrimestre=isPermiso;
		this.isPermisoGuardarCambiosTrimestre=isPermiso;
		//this.isPermisoConsultaTrimestre=isPermiso;
		//this.isPermisoBusquedaTrimestre=isPermiso;
		//this.isPermisoReporteTrimestre=isPermiso;
		//this.isPermisoOrdenTrimestre=isPermiso;		
		//this.isPermisoPaginacionMedioTrimestre=isPermiso;		
		//this.isPermisoPaginacionAltoTrimestre=isPermiso;		
		//this.isPermisoPaginacionTodoTrimestre=isPermiso;		
		//this.isPermisoCopiarTrimestre=isPermiso;		
		//this.isPermisoDuplicarTrimestre=isPermiso;
		//this.isPermisoOrdenTrimestre=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTrimestreClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TrimestreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTrimestre(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTrimestreClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTrimestreClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTrimestreClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTrimestreClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTrimestre() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TrimestreJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.trimestreSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TrimestreConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTrimestre=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTrimestre=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTrimestre=this.isPermisoActualizarTrimestre;
			this.isPermisoEliminarTrimestre=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTrimestre=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTrimestre=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTrimestre=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTrimestre=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTrimestre=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTrimestre=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTrimestre=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTrimestre=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTrimestre=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTrimestre=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTrimestre=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTrimestre=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTrimestre=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.trimestreSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTrimestre.setToolTipText(this.jTableDatosTrimestre.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTrimestre(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTrimestre(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TrimestreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TrimestreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTrimestre() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTrimestreListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTrimestreListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TrimestreJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTrimestreListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTrimestreListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTrimestre()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTrimestre()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTrimestre(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTrimestre()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTrimestre();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTrimestre(Trimestre trimestre)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTrimestre(Trimestre trimestre,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTrimestre()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTrimestre()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTrimestre()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTrimestre()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTrimestre()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTrimestre()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTrimestre(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTrimestre()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TrimestreBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TrimestreBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TrimestreBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.trimestreSessionBean=new TrimestreSessionBean(); 
		this.trimestreConstantesFunciones=new TrimestreConstantesFunciones(); 
		this.trimestreBean=new Trimestre();//(this.trimestreConstantesFunciones); 		
		this.trimestreReturnGeneral=new TrimestreParameterReturnGeneral(); 
		
		this.trimestreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.trimestreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TrimestreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TrimestreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TrimestreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTrimestre(true);
			
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
			
			this.trimestreConstantesFunciones=new TrimestreConstantesFunciones(); 
			this.trimestreBean=new Trimestre();//this.trimestreConstantesFunciones); 			
			this.trimestreReturnGeneral=new TrimestreParameterReturnGeneral(); 
		
			TrimestreBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Trimestre Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.trimestre=new Trimestre();
			this.trimestres = new ArrayList<Trimestre>();
			this.trimestresAux = new ArrayList<Trimestre>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic=new TrimestreLogic();
				this.trimestreLogic.getNewConnexionToDeep("");
			}
			
			//this.trimestreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.trimestreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTrimestre);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTrimestre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTrimestre);	
					}
					
					if(this.jInternalFrameImportacionTrimestre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTrimestre);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTrimestre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTrimestre);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTrimestre!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTrimestre);
				this.jInternalFrameDetalleFormTrimestre.setVisible(false);
				this.jInternalFrameDetalleFormTrimestre.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTrimestre!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTrimestre);
					this.jInternalFrameReporteDinamicoTrimestre.setVisible(false);
					this.jInternalFrameReporteDinamicoTrimestre.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTrimestre!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTrimestre);
					this.jInternalFrameImportacionTrimestre.setVisible(false);
					this.jInternalFrameImportacionTrimestre.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTrimestre!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTrimestre);
					this.jInternalFrameOrderByTrimestre.setVisible(false);
					this.jInternalFrameOrderByTrimestre.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTrimestreActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TrimestreConstantesFunciones.INUMEROPAGINACION;
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
			
			this.trimestreReturnGeneral=new TrimestreParameterReturnGeneral();
			
			this.trimestreParameterGeneral=new TrimestreParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.trimestreLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TrimestreJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.trimestreSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TrimestreConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.trimestreSessionBean.getEsGuardarRelacionado(),this.trimestreSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TrimestreConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.trimestreSessionBean.getEsGuardarRelacionado(),this.trimestreSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTrimestre=false;
			this.isVisibilidadCeldaDuplicarTrimestre=true;
			this.isVisibilidadCeldaCopiarTrimestre=true;
			this.isVisibilidadCeldaVerFormTrimestre=true;
			this.isVisibilidadCeldaOrdenTrimestre=true;
			this.isVisibilidadCeldaNuevoRelacionesTrimestre=false;
			this.isVisibilidadCeldaModificarTrimestre=false;
			this.isVisibilidadCeldaActualizarTrimestre=false;
			this.isVisibilidadCeldaEliminarTrimestre=false;
			this.isVisibilidadCeldaCancelarTrimestre=false;
			this.isVisibilidadCeldaGuardarTrimestre=false;
			this.isVisibilidadCeldaGuardarCambiosTrimestre=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTrimestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTrimestre();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTrimestre(false);
			
			this.setPermisosUsuarioTrimestre();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.trimestreSessionBean.getEsGuardarRelacionado() 
				|| (this.trimestreSessionBean.getEsGuardarRelacionado() && this.trimestreSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTrimestreClasesRelacionadas();
			}
			
			if(this.trimestreSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTrimestreClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TrimestreJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTrimestre();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTrimestre();
			}
			
			if(!this.isPermisoBusquedaTrimestre) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTrimestre,this.isPermisoPaginacionMedioTrimestre,this.isPermisoPaginacionTodoTrimestre);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TrimestreConstantesFunciones.getTiposSeleccionarTrimestre());
				
				this.tiposColumnasSelect=TrimestreConstantesFunciones.getTiposSeleccionarTrimestre(true);
				
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
			//if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTrimestre();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTrimestre(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTrimestre(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTrimestre() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				trimestreImplementable= (TrimestreImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TrimestreConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				trimestreImplementableHome= (TrimestreImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TrimestreConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.trimestres= new ArrayList<Trimestre>();
			this.trimestresEliminados= new ArrayList<Trimestre>();
						
			this.isEsNuevoTrimestre=false;
			this.esParaAccionDesdeFormularioTrimestre=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTrimestre(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTrimestre();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TrimestreConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTrimestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTrimestre(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTrimestre!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTrimestre();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTrimestre();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTrimestre(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Trimestre: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTrimestre() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTrimestre")) {
				iIndex=this.jInternalFrameDetalleFormTrimestre.jTabbedPaneRelacionesTrimestre.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTrimestre.jTabbedPaneRelacionesTrimestre.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTrimestre();	
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
	
	public void cargarCombosForeignKeyTrimestre(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTrimestre(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTrimestre(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTrimestreListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTrimestre();
		
		this.cargarCombosFrameForeignKeyTrimestre();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTrimestre();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTrimestre();
		}
	}
	
	
	
	public void jButtonNuevoTrimestreActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.trimestreSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTrimestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
			
			
			if(jTableDatosTrimestre.getRowCount()>=1) {
				jTableDatosTrimestre.removeRowSelectionInterval(0, jTableDatosTrimestre.getRowCount()-1);						
			}
			
			this.isEsNuevoTrimestre=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTrimestre(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTrimestre(true);			
			//this.trimestre=new Trimestre();
			//this.trimestre.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTrimestre(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTrimestre() ;
			
			if(TrimestreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTrimestre(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.trimestre);	
			this.actualizarInformacion("INFO_PADRE",false,this.trimestre);				
			
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
			
			if(this.trimestreSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Trimestre: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTrimestreActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Trimestre> trimestresSeleccionados=new ArrayList<Trimestre>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTrimestre.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTrimestre.getSelectedRows().length;			
			}
			
			trimestresSeleccionados=this.getTrimestresSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTrimestre--;			
				//Trimestre trimestreAux= new Trimestre();			
				//trimestreAux.setId(this.iIdNuevoTrimestre);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Trimestre trimestreOrigen=new Trimestre();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Trimestre trimestreOrigen : trimestresSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							trimestreOrigen =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							trimestreOrigen =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTrimestre();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.trimestre.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTrimestre(trimestreOrigen,this.trimestre,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTrimestre(this.trimestre);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.trimestreLogic.getTrimestres().add(this.trimestreAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.trimestres.add(this.trimestreAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTrimestre(false);
				
				this.jTableDatosTrimestre.setRowSelectionInterval(this.getIndiceNuevoTrimestre(), this.getIndiceNuevoTrimestre());
				
				int iLastRow =  this.jTableDatosTrimestre.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTrimestre.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTrimestre.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTrimestre(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTrimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Trimestre> trimestresSeleccionados=new ArrayList<Trimestre>();									
		
			Trimestre trimestreOrigen=new Trimestre();
			Trimestre trimestreDestino=new Trimestre();
				
			trimestresSeleccionados=this.getTrimestresSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTrimestre.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || trimestresSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTrimestre.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						trimestreOrigen =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						trimestreOrigen =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						trimestreDestino =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						trimestreDestino =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				trimestreOrigen =trimestresSeleccionados.get(0);
				trimestreDestino =trimestresSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTrimestre(trimestreOrigen,trimestreDestino,true,false);
				
				trimestreDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(trimestreDestino,trimestreLogic.getTrimestres());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(trimestreDestino,trimestres);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTrimestre(false);
				
				//this.jTableDatosTrimestre.setRowSelectionInterval(this.getIndiceNuevoTrimestre(), this.getIndiceNuevoTrimestre());
				
				int iLastRow =  this.jTableDatosTrimestre.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTrimestre.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTrimestre.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTrimestre(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTrimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTrimestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTrimestre.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTrimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTrimestre.isVisible();
			
			
			this.jPanelParametrosReportesTrimestre.setVisible(!isVisible);
			this.jPanelPaginacionTrimestre.setVisible(!isVisible);
			this.jPanelAccionesTrimestre.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTrimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTrimestre();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTrimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTrimestre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTrimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTrimestre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTrimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTrimestre();
			
			this.abrirFrameOrderByTrimestre();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTrimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTrimestre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTrimestre(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTrimestre);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTrimestre.isMaximum()) {
					this.jInternalFrameDetalleFormTrimestre.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTrimestre.setSize(this.jInternalFrameDetalleFormTrimestre.iWidthFormulario,this.jInternalFrameDetalleFormTrimestre.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTrimestre.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTrimestre.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTrimestre.isMaximum()) {
						this.jInternalFrameDetalleFormTrimestre.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTrimestre.jContentPaneDetalleTrimestre.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTrimestre.jTabbedPaneRelacionesTrimestre.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTrimestre.jContentPaneDetalleTrimestre.getWidth(),TrimestreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTrimestre.jTabbedPaneRelacionesTrimestre.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTrimestre.jContentPaneDetalleTrimestre.getWidth(),TrimestreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTrimestre.jTabbedPaneRelacionesTrimestre.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTrimestre.jContentPaneDetalleTrimestre.getWidth(),TrimestreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTrimestre.setVisible(true);
	        this.jInternalFrameDetalleFormTrimestre.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTrimestre() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTrimestre==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTrimestre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTrimestre,false,this);
				} else {
					this.jInternalFrameOrderByTrimestre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTrimestre,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTrimestre);
				this.jInternalFrameOrderByTrimestre.setVisible(false);
				this.jInternalFrameOrderByTrimestre.setSelected(false);
				
				this.jInternalFrameOrderByTrimestre.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTrimestre"));
				
				this.inicializarActualizarBindingTablaOrderByTrimestre();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTrimestre() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTrimestre==null) {
				
				this.jInternalFrameImportacionTrimestre=new ImportacionJInternalFrame(TrimestreConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTrimestre);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTrimestre);
				this.jInternalFrameImportacionTrimestre.setVisible(false);
				this.jInternalFrameImportacionTrimestre.setSelected(false);


				this.jInternalFrameImportacionTrimestre.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTrimestre"));
				this.jInternalFrameImportacionTrimestre.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTrimestre"));
				this.jInternalFrameImportacionTrimestre.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTrimestre"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTrimestre() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTrimestre==null) {
				this.jInternalFrameReporteDinamicoTrimestre=new ReporteDinamicoJInternalFrame(TrimestreConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTrimestre);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTrimestre);
				this.jInternalFrameReporteDinamicoTrimestre.setVisible(false);
				this.jInternalFrameReporteDinamicoTrimestre.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTrimestre.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTrimestre"));
				this.jInternalFrameReporteDinamicoTrimestre.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTrimestre"));
				this.jInternalFrameReporteDinamicoTrimestre.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTrimestre"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTrimestre();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTrimestre() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTrimestre);
			
	       	this.jInternalFrameDetalleFormTrimestre.setVisible(false);
	        this.jInternalFrameDetalleFormTrimestre.setSelected(false);
			
			//this.jInternalFrameDetalleFormTrimestre.dispose();
			//this.jInternalFrameDetalleFormTrimestre=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTrimestre() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTrimestre.setVisible(true);
	        this.jInternalFrameReporteDinamicoTrimestre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTrimestre() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTrimestre.setVisible(true);
	        this.jInternalFrameImportacionTrimestre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTrimestre() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTrimestre.setVisible(true);
	        this.jInternalFrameOrderByTrimestre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTrimestre() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTrimestre.setVisible(false);
	        this.jInternalFrameOrderByTrimestre.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTrimestre() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTrimestre.setVisible(false);
	        this.jInternalFrameReporteDinamicoTrimestre.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTrimestre() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTrimestre.setVisible(false);
	        this.jInternalFrameImportacionTrimestre.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTrimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTrimestre(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTrimestre(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTrimestre(true);
			//this.isEsNuevoTrimestre=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestre =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.trimestre =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTrimestre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTrimestre(false) ;
			
			if(trimestreSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TrimestreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTrimestre(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTrimestre(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTrimestreActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestre =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.trimestre =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTrimestre(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTrimestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTrimestre(true);
			//this.isEsNuevoTrimestre=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestre =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.trimestre =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.trimestre.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTrimestre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTrimestre(false) ;
			
			if(TrimestreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTrimestre(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTrimestre(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTrimestreActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTrimestre(false);
			
			//if(!this.isEsNuevoTrimestre) {								
				int intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestre =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.trimestre =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TrimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTrimestre(this.trimestre,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTrimestre(this.trimestre);
				
			}
			
			if(this.permiteMantenimiento(this.trimestre)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.trimestreSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTrimestre=true;
					this.inicializarActualizarBindingTablaTrimestre(false);
					this.isEsNuevoTrimestre=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTrimestre=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTrimestre=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTrimestre(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTrimestre(false);
				
				this.habilitarDeshabilitarControlesTrimestre(false);
			
												
				
				if(TrimestreJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTrimestre();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTrimestreActionPerformed(evt,trimestreSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTrimestre(this.trimestre,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTrimestre.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,trimestreSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.trimestre.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Trimestre.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Trimestre.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTrimestreActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestre =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				this.trimestre.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.trimestre =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				this.trimestre.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.trimestre)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.trimestreSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TrimestreModel) this.jTableDatosTrimestre.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTrimestre=true;
				this.inicializarActualizarBindingTablaTrimestre(false);
				this.isEsNuevoTrimestre=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTrimestre(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTrimestre(false);
				
				this.habilitarDeshabilitarControlesTrimestre(false);
				
				
				
				if(TrimestreJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTrimestre();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTrimestreActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTrimestre.getRowCount()>=1) {
				jTableDatosTrimestre.removeRowSelectionInterval(0, jTableDatosTrimestre.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTrimestre(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTrimestre(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTrimestre(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTrimestre(false) ;
			
			this.isEsNuevoTrimestre=false;
			
			if(TrimestreJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTrimestre();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTrimestreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTrimestre(false);
				
				//SI ES MANUAL
				if(TrimestreJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTrimestre();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTrimestreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTrimestre--;			
			//Trimestre trimestreAux= new Trimestre();			
			//trimestreAux.setId(this.iIdNuevoTrimestre);
			
			if(this.jInternalFrameDetalleFormTrimestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTrimestre();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTrimestre(this.trimestre);
			
			this.trimestre.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.trimestreLogic.getTrimestres().add(this.trimestreAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.trimestres.add(this.trimestreAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTrimestre(false);
			
			this.jTableDatosTrimestre.setRowSelectionInterval(this.getIndiceNuevoTrimestre(), this.getIndiceNuevoTrimestre());
			
			int iLastRow =  this.jTableDatosTrimestre.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTrimestre.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTrimestre.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTrimestre(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTrimestreActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTrimestre(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTrimestre(false);
			
			//SI ES MANUAL
			if(TrimestreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTrimestre();
			}
			
			//this.abrirFrameTreeTrimestre();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTrimestreActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE TrimestreS ?", "MANTENIMIENTO DE Trimestre", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTrimestre.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTrimestre();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.trimestreReturnGeneral=trimestreLogic.procesarImportacionTrimestresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.trimestreParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTrimestreReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTrimestreActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTrimestre.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTrimestre.setFileImportacion(this.jInternalFrameImportacionTrimestre.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTrimestre.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTrimestre.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTrimestre.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTrimestre.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTrimestreActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Trimestre> trimestresSeleccionados=new ArrayList<Trimestre>();		

		trimestresSeleccionados=this.getTrimestresSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTrimestre.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTrimestre.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TrimestreBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TrimestreBaseDesign.jrxml";
			
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
			
			this.generarReporteTrimestres("Todos",trimestresSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.trimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Trimestre",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTrimestre.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTrimestre.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TrimestreConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTrimestre.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTrimestre.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTrimestre.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TrimestreConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTrimestre.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TrimestreConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTrimestre.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTrimestre.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TrimestreConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTrimestreActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Trimestre> trimestresSeleccionados=new ArrayList<Trimestre>();		
		
		trimestresSeleccionados=this.getTrimestresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"trimestre";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Trimestres");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTrimestre.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTrimestre.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TrimestreConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TrimestreConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Trimestre trimestre:trimestresSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(trimestre.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTrimestre(row);				
			//	iRow++;
			//}				
			
			//for(Trimestre trimestreAux:trimestresSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTrimestre(trimestreAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.trimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Trimestre",JOptionPane.INFORMATION_MESSAGE);
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
				this.trimestreLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTrimestre(false);
			
			//SI ES MANUAL
			if(TrimestreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTrimestre();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTrimestreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTrimestre(false);
			
			//SI ES MANUAL
			if(TrimestreJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTrimestre();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTrimestreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTrimestre(false);
			
			//SI ES MANUAL
			if(TrimestreJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTrimestre();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.trimestreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTrimestre() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTrimestre.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTrimestre.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTrimestre.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTrimestre.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTrimestre.setMinimumSize(dimensionMinimum);
		this.jTableDatosTrimestre.setMaximumSize(dimensionMaximum);
		this.jTableDatosTrimestre.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTrimestre(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTrimestre(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTrimestre(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTrimestre(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTrimestre(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTrimestre(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTrimestre(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTrimestre(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TrimestreJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TrimestreJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTrimestre() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTrimestre();
		
		this.inicializarActualizarBindingBotonesManualTrimestre(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTrimestre();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTrimestre() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTrimestre(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTrimestre(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTrimestre.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTrimestre.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTrimestre.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTrimestre!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTrimestre.jCheckBoxPostAccionNuevoTrimestre.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTrimestre.jCheckBoxPostAccionSinCerrarTrimestre.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTrimestre.jCheckBoxPostAccionSinMensajeTrimestre.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTrimestre.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTrimestre.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTrimestre.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTrimestre!=null) {
				this.jInternalFrameDetalleFormTrimestre.jCheckBoxPostAccionNuevoTrimestre.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTrimestre.jCheckBoxPostAccionSinCerrarTrimestre.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTrimestre.jCheckBoxPostAccionSinMensajeTrimestre.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTrimestre.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTrimestre.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTrimestre!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTrimestre.jComboBoxTiposAccionesFormularioTrimestre.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTrimestre.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTrimestre!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTrimestre.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTrimestre.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTrimestre.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTrimestre.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTrimestre.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTrimestre!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTrimestre.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTrimestre.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTrimestre.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTrimestre(Boolean esInicializar) throws Exception {
		try	{	
			if(TrimestreJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTrimestre(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTrimestre() throws Exception {
		try	{
			if(TrimestreJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTrimestre();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTrimestre() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTrimestre.jComboBoxTiposAccionesFormularioTrimestre.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTrimestre.jComboBoxTiposAccionesFormularioTrimestre.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTrimestre() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTrimestre.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTrimestre.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTrimestre.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTrimestre.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTrimestre.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTrimestre.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTrimestre.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTrimestre.addItem(reporte);
			}
			
			
			if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTrimestre.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTrimestre.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTrimestre.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTrimestre.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTrimestre.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTrimestre.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTrimestre.jComboBoxTiposAccionesFormularioTrimestre.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTrimestre.jComboBoxTiposAccionesFormularioTrimestre.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTrimestre.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTrimestre.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTrimestre.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTrimestre();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTrimestre() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTrimestre!=null) {
				this.jInternalFrameReporteDinamicoTrimestre.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTrimestre.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTrimestre!=null) {
				this.jInternalFrameReporteDinamicoTrimestre.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTrimestre.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTrimestre!=null) {
				
				if(this.jInternalFrameReporteDinamicoTrimestre.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTrimestre.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTrimestre.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTrimestre.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTrimestre.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTrimestre.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTrimestre()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTrimestre(Boolean esInicializar) throws Exception {				
		if(TrimestreJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTrimestre();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTrimestre() throws Exception {
		this.inicializarActualizarBindingTablaTrimestre(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTrimestre() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTrimestre.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTrimestre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTrimestre.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TrimestrePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTrimestre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTrimestre.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TrimestrePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTrimestreOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTrimestreOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TrimestrePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTrimestre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTrimestre.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TrimestrePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTrimestre.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTrimestre(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=trimestreLogic.getTrimestres().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=trimestres.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TrimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTrimestre.setModel(new TrimestreModel(this.trimestreLogic.getTrimestres(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTrimestre.setModel(new TrimestreModel(this.trimestres,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTrimestre!=null && this.jInternalFrameOrderByTrimestre.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTrimestre();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTrimestre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTrimestre,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TrimestrePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TrimestreConstantesFunciones.SCLASSWEBTITULO,trimestreConstantesFunciones.resaltarSeleccionarTrimestre,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TrimestreConstantesFunciones.SCLASSWEBTITULO,trimestreConstantesFunciones.resaltarSeleccionarTrimestre,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTrimestre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTrimestre,TrimestreConstantesFunciones.LABEL_ID));

		if(this.trimestreConstantesFunciones.mostraridTrimestre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TrimestreConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.trimestreConstantesFunciones.resaltaridTrimestre,this.trimestreConstantesFunciones.activaridTrimestre,this,true,"idTrimestre","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.trimestreConstantesFunciones.resaltaridTrimestre,this.trimestreConstantesFunciones.activaridTrimestre,this,true,"idTrimestre","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTrimestre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTrimestre,TrimestreConstantesFunciones.LABEL_NOMBRE));

		if(this.trimestreConstantesFunciones.mostrarnombreTrimestre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TrimestreConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.trimestreConstantesFunciones.resaltarnombreTrimestre,this.trimestreConstantesFunciones.activarnombreTrimestre,this,true,"nombreTrimestre","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.trimestreConstantesFunciones.resaltarnombreTrimestre,this.trimestreConstantesFunciones.activarnombreTrimestre,this,true,"nombreTrimestre","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TrimestrePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.trimestreSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.trimestreSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.trimestreSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTrimestre.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.trimestreSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.trimestreSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTrimestre.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTrimestre && this.isPermisoGuardarCambiosTrimestre) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.trimestreSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.trimestreSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTrimestre.addColumn(tableColumn);
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
			
			this.jTableDatosTrimestre.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTrimestre && this.isPermisoGuardarCambiosTrimestre) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTrimestre && this.isPermisoGuardarCambiosTrimestre) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTrimestre.moveColumn(this.jTableDatosTrimestre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTrimestre.moveColumn(this.jTableDatosTrimestre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTrimestre.moveColumn(this.jTableDatosTrimestre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTrimestre.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTrimestre.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTrimestre,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TrimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTrimestre.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTrimestre.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TrimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TrimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTrimestre.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTrimestre.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTrimestre.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=trimestreLogic.getTrimestres().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=trimestres.size()-1;
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
		//this.jTableDatosTrimestre.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTrimestre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTrimestre();
			
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
				
				//this.isEsNuevoTrimestre=false;
					
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
			
				if(this.trimestreSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTrimestre==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTrimestre.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTrimestre.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestre =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.trimestre =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.trimestre.getsType().equals("DUPLICADO")
				   || this.trimestre.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTrimestre=true;
				
				} else {
					this.isEsNuevoTrimestre=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.trimestreSessionBean.getEsGuardarRelacionado()) {
					if(this.trimestre.getId()>=0 && !this.trimestre.getIsNew()) {						
						this.isEsNuevoTrimestre=false;
						
					} else {
						this.isEsNuevoTrimestre=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTrimestre(esRelaciones);						
				
				this.seleccionarTrimestre(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.trimestre.getId()<0) {
					this.isEsNuevoTrimestre=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTrimestre(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTrimestre(evt,rowIndex);
				}	
				
				if(this.trimestreSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Trimestre: " + this.dDif); 
					}
				}								
				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTrimestre(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.trimestre)) {
					if(this.trimestre.getId()>0) {
						this.trimestre.setIsDeleted(true);
						
						this.trimestresEliminados.add(this.trimestre);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.trimestreLogic.getTrimestres().remove(this.trimestre);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.trimestres.remove(this.trimestre);				
					}
					
					
					((TrimestreModel) this.jTableDatosTrimestre.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTrimestre(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTrimestre(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTrimestre) {
			
			if(this.jInternalFrameDetalleFormTrimestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTrimestre.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTrimestre.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestre =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.trimestre =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TrimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTrimestre(this.trimestre);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTrimestre("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTrimestre(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTrimestre() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTrimestre(Trimestre trimestre) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTrimestre(trimestre,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTrimestre(Trimestre trimestre,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTrimestre(trimestre);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTrimestre(trimestre,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTrimestre(trimestre);
	}
	
	public void setVariablesObjetoActualToFormularioTrimestre(Trimestre trimestre) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTrimestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTrimestre.jTextFieldidTrimestre.setText(trimestre.getId().toString());
			this.jInternalFrameDetalleFormTrimestre.jTextFieldnombreTrimestre.setText(trimestre.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Trimestre trimestreLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,trimestreLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Trimestre trimestreLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				trimestreLocal=this.trimestre;
			} else {
				trimestreLocal=this.trimestreAnterior;
			}
		}
		
		if(this.permiteMantenimiento(trimestreLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTrimestre(trimestreLocal,true);
					
					if(trimestreSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(trimestreLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.trimestreSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(trimestreLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTrimestre(Trimestre trimestre,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTrimestre(trimestre,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTrimestre(trimestre);
	}
	
	public void setVariablesFormularioToObjetoActualTrimestre(Trimestre trimestre,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTrimestre(trimestre,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTrimestre(Trimestre trimestre,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTrimestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTrimestre.jTextFieldidTrimestre.getText()==null || this.jInternalFrameDetalleFormTrimestre.jTextFieldidTrimestre.getText()=="" || this.jInternalFrameDetalleFormTrimestre.jTextFieldidTrimestre.getText()=="Id") {
				this.jInternalFrameDetalleFormTrimestre.jTextFieldidTrimestre.setText("0");
			}

			if(conColumnasBase) {trimestre.setId(Long.parseLong(this.jInternalFrameDetalleFormTrimestre.jTextFieldidTrimestre.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TrimestreConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTrimestre.jLabelIdTrimestre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			trimestre.setnombre(this.jInternalFrameDetalleFormTrimestre.jTextFieldnombreTrimestre.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TrimestreConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTrimestre.jLabelnombreTrimestre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTrimestre(Trimestre trimestreBean,Trimestre trimestre,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTrimestre(Trimestre trimestreOrigen,Trimestre trimestre,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && trimestreOrigen.getId()!=null && !trimestreOrigen.getId().equals(0L))) {trimestre.setId(trimestreOrigen.getId());}}
			if(conDefault || (!conDefault && trimestreOrigen.getnombre()!=null && !trimestreOrigen.getnombre().equals(""))) {trimestre.setnombre(trimestreOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTrimestre(Trimestre trimestre) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTrimestre.jTextFieldidTrimestre.setText(trimestre.getId().toString());
			this.jInternalFrameDetalleFormTrimestre.jTextFieldnombreTrimestre.setText(trimestre.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTrimestre(TrimestreBean trimestreBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTrimestre.jTextFieldidTrimestre.setText(trimestreBean.getId().toString());
			this.jInternalFrameDetalleFormTrimestre.jTextFieldnombreTrimestre.setText(trimestreBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTrimestre(TrimestreParameterReturnGeneral trimestreReturnGeneral,TrimestreBean trimestreBean,Boolean conDefault) throws Exception { 
		try {
			Trimestre trimestreLocal=new Trimestre();
			
			trimestreLocal=trimestreReturnGeneral.getTrimestre();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && trimestreLocal.getId()!=null && !trimestreLocal.getId().equals(0L))) {trimestreBean.setId(trimestreLocal.getId());}}
			if(conDefault || (!conDefault && trimestreLocal.getnombre()!=null && !trimestreLocal.getnombre().equals(""))) {trimestreBean.setnombre(trimestreLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTrimestreGenerico(Long idTrimestreSeleccionado,JComboBox jComboBoxTrimestre,List<Trimestre> trimestresLocal)throws Exception {
		try {
			Trimestre  trimestreTemp=null;

			for(Trimestre trimestreAux:trimestresLocal) {
				if(trimestreAux.getId()!=null && trimestreAux.getId().equals(idTrimestreSeleccionado)) {
					trimestreTemp=trimestreAux;
					break;
				}
			}

			jComboBoxTrimestre.setSelectedItem(trimestreTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTrimestreGenerico(JComboBox jComboBoxTrimestre,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTrimestre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTrimestre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTrimestre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTrimestre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTrimestre.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTrimestre.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTrimestre.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTrimestre.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTrimestre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTrimestre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			trimestre=(Trimestre) trimestreLogic.getTrimestres().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			trimestre =(Trimestre) trimestres.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Trimestre trimestreRow=new Trimestre();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			trimestreRow=(Trimestre) trimestreLogic.getTrimestres().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			trimestreRow=(Trimestre) trimestres.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTrimestre(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTrimestre.setVisible((this.isVisibilidadCeldaNuevoTrimestre && this.isPermisoNuevoTrimestre));			
			this.jButtonDuplicarTrimestre.setVisible((this.isVisibilidadCeldaDuplicarTrimestre && this.isPermisoDuplicarTrimestre));			
			this.jButtonCopiarTrimestre.setVisible((this.isVisibilidadCeldaCopiarTrimestre && this.isPermisoCopiarTrimestre));
			this.jButtonVerFormTrimestre.setVisible((this.isVisibilidadCeldaVerFormTrimestre && this.isPermisoVerFormTrimestre));
			
			this.jButtonAbrirOrderByTrimestre.setVisible((this.isVisibilidadCeldaOrdenTrimestre && this.isPermisoOrdenTrimestre));			
			
			this.jButtonNuevoRelacionesTrimestre.setVisible((this.isVisibilidadCeldaNuevoRelacionesTrimestre && this.isPermisoNuevoTrimestre));			
			this.jButtonNuevoGuardarCambiosTrimestre.setVisible((this.isVisibilidadCeldaNuevoTrimestre && this.isPermisoNuevoTrimestre && this.isPermisoGuardarCambiosTrimestre));
			
			if(this.jInternalFrameDetalleFormTrimestre!=null) {
			this.jInternalFrameDetalleFormTrimestre.jButtonModificarTrimestre.setVisible((this.isVisibilidadCeldaModificarTrimestre && this.isPermisoActualizarTrimestre));	
			this.jInternalFrameDetalleFormTrimestre.jButtonActualizarTrimestre.setVisible((this.isVisibilidadCeldaActualizarTrimestre && this.isPermisoActualizarTrimestre));	
			this.jInternalFrameDetalleFormTrimestre.jButtonEliminarTrimestre.setVisible((this.isVisibilidadCeldaEliminarTrimestre && this.isPermisoEliminarTrimestre));
			this.jInternalFrameDetalleFormTrimestre.jButtonCancelarTrimestre.setVisible(this.isVisibilidadCeldaCancelarTrimestre);							
			this.jInternalFrameDetalleFormTrimestre.jButtonGuardarCambiosTrimestre.setVisible((this.isVisibilidadCeldaGuardarTrimestre && this.isPermisoGuardarCambiosTrimestre));			
			
			}
						
			this.jButtonGuardarCambiosTablaTrimestre.setVisible((this.isVisibilidadCeldaGuardarCambiosTrimestre && this.isPermisoGuardarCambiosTrimestre));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTrimestre.setVisible((this.isVisibilidadCeldaNuevoTrimestre && this.isPermisoNuevoTrimestre));						
			this.jButtonDuplicarToolBarTrimestre.setVisible((this.isVisibilidadCeldaDuplicarTrimestre && this.isPermisoDuplicarTrimestre));						
			this.jButtonCopiarToolBarTrimestre.setVisible((this.isVisibilidadCeldaCopiarTrimestre && this.isPermisoCopiarTrimestre));			
			this.jButtonVerFormToolBarTrimestre.setVisible((this.isVisibilidadCeldaVerFormTrimestre && this.isPermisoVerFormTrimestre));			
			this.jButtonAbrirOrderByToolBarTrimestre.setVisible((this.isVisibilidadCeldaOrdenTrimestre && this.isPermisoOrdenTrimestre));
			this.jButtonNuevoRelacionesToolBarTrimestre.setVisible((this.isVisibilidadCeldaNuevoRelacionesTrimestre && this.isPermisoNuevoTrimestre));			
			this.jButtonNuevoGuardarCambiosToolBarTrimestre.setVisible((this.isVisibilidadCeldaNuevoTrimestre && this.isPermisoNuevoTrimestre && this.isPermisoGuardarCambiosTrimestre));			
			
			if(this.jInternalFrameDetalleFormTrimestre!=null) {
			this.jInternalFrameDetalleFormTrimestre.jButtonModificarToolBarTrimestre.setVisible((this.isVisibilidadCeldaModificarTrimestre && this.isPermisoActualizarTrimestre));	
			this.jInternalFrameDetalleFormTrimestre.jButtonActualizarToolBarTrimestre.setVisible((this.isVisibilidadCeldaActualizarTrimestre  && this.isPermisoActualizarTrimestre));	
			this.jInternalFrameDetalleFormTrimestre.jButtonEliminarToolBarTrimestre.setVisible((this.isVisibilidadCeldaEliminarTrimestre && this.isPermisoEliminarTrimestre));
			this.jInternalFrameDetalleFormTrimestre.jButtonCancelarToolBarTrimestre.setVisible(this.isVisibilidadCeldaCancelarTrimestre);				
			this.jInternalFrameDetalleFormTrimestre.jButtonGuardarCambiosToolBarTrimestre.setVisible((this.isVisibilidadCeldaGuardarTrimestre && this.isPermisoGuardarCambiosTrimestre));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTrimestre.setVisible((this.isVisibilidadCeldaGuardarCambiosTrimestre && this.isPermisoGuardarCambiosTrimestre));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTrimestre.setVisible((this.isVisibilidadCeldaNuevoTrimestre && this.isPermisoNuevoTrimestre));			
			this.jMenuItemDuplicarTrimestre.setVisible((this.isVisibilidadCeldaDuplicarTrimestre && this.isPermisoDuplicarTrimestre));			
			this.jMenuItemCopiarTrimestre.setVisible((this.isVisibilidadCeldaCopiarTrimestre && this.isPermisoCopiarTrimestre));			
			this.jMenuItemVerFormTrimestre.setVisible((this.isVisibilidadCeldaVerFormTrimestre && this.isPermisoVerFormTrimestre));			
			this.jMenuItemAbrirOrderByTrimestre.setVisible((this.isVisibilidadCeldaOrdenTrimestre && this.isPermisoOrdenTrimestre));			
			//this.jMenuItemMostrarOcultarTrimestre.setVisible((this.isVisibilidadCeldaOrdenTrimestre && this.isPermisoOrdenTrimestre));
			this.jMenuItemDetalleAbrirOrderByTrimestre.setVisible((this.isVisibilidadCeldaOrdenTrimestre && this.isPermisoOrdenTrimestre));			
			//this.jMenuItemDetalleMostrarOcultarTrimestre.setVisible((this.isVisibilidadCeldaOrdenTrimestre && this.isPermisoOrdenTrimestre));			
			this.jMenuItemNuevoRelacionesTrimestre.setVisible((this.isVisibilidadCeldaNuevoRelacionesTrimestre && this.isPermisoNuevoTrimestre));			
			this.jMenuItemNuevoGuardarCambiosTrimestre.setVisible((this.isVisibilidadCeldaNuevoTrimestre && this.isPermisoNuevoTrimestre && this.isPermisoGuardarCambiosTrimestre));									
			
			if(this.jInternalFrameDetalleFormTrimestre!=null) {
			this.jInternalFrameDetalleFormTrimestre.jMenuItemModificarTrimestre.setVisible((this.isVisibilidadCeldaModificarTrimestre && this.isPermisoActualizarTrimestre));	
			this.jInternalFrameDetalleFormTrimestre.jMenuItemActualizarTrimestre.setVisible((this.isVisibilidadCeldaActualizarTrimestre && this.isPermisoActualizarTrimestre));	
			this.jInternalFrameDetalleFormTrimestre.jMenuItemEliminarTrimestre.setVisible((this.isVisibilidadCeldaEliminarTrimestre && this.isPermisoEliminarTrimestre));
			this.jInternalFrameDetalleFormTrimestre.jMenuItemCancelarTrimestre.setVisible(this.isVisibilidadCeldaCancelarTrimestre);				
			}
			
			this.jMenuItemGuardarCambiosTrimestre.setVisible((this.isVisibilidadCeldaGuardarTrimestre && this.isPermisoGuardarCambiosTrimestre));						
			this.jMenuItemGuardarCambiosTablaTrimestre.setVisible((this.isVisibilidadCeldaGuardarCambiosTrimestre && this.isPermisoGuardarCambiosTrimestre));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTrimestre=this.jButtonNuevoTrimestre.isVisible();
			this.isVisibilidadCeldaDuplicarTrimestre=this.jButtonDuplicarTrimestre.isVisible();
			this.isVisibilidadCeldaCopiarTrimestre=this.jButtonCopiarTrimestre.isVisible();
			this.isVisibilidadCeldaVerFormTrimestre=this.jButtonVerFormTrimestre.isVisible();
			
			this.isVisibilidadCeldaOrdenTrimestre=this.jButtonAbrirOrderByTrimestre.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTrimestre=this.jButtonNuevoRelacionesTrimestre.isVisible();
			this.isVisibilidadCeldaModificarTrimestre=this.jButtonModificarTrimestre.isVisible();
			
			if(this.jInternalFrameDetalleFormTrimestre!=null) {
			this.isVisibilidadCeldaActualizarTrimestre=this.jInternalFrameDetalleFormTrimestre.jButtonActualizarTrimestre.isVisible();
			this.isVisibilidadCeldaEliminarTrimestre=this.jInternalFrameDetalleFormTrimestre.jButtonEliminarTrimestre.isVisible();
			this.isVisibilidadCeldaCancelarTrimestre=this.jInternalFrameDetalleFormTrimestre.jButtonCancelarTrimestre.isVisible();
			this.isVisibilidadCeldaGuardarTrimestre=this.jInternalFrameDetalleFormTrimestre.jButtonGuardarCambiosTrimestre.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTrimestre=this.jButtonGuardarCambiosTablaTrimestre.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTrimestre=this.jButtonNuevoToolBarTrimestre.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTrimestre=this.jButtonNuevoRelacionesToolBarTrimestre.isVisible();
			
			if(this.jInternalFrameDetalleFormTrimestre!=null) {
			this.isVisibilidadCeldaModificarTrimestre=this.jInternalFrameDetalleFormTrimestre.jButtonModificarToolBarTrimestre.isVisible();
			this.isVisibilidadCeldaActualizarTrimestre=this.jInternalFrameDetalleFormTrimestre.jButtonActualizarToolBarTrimestre.isVisible();
			this.isVisibilidadCeldaEliminarTrimestre=this.jInternalFrameDetalleFormTrimestre.jButtonEliminarToolBarTrimestre.isVisible();
			this.isVisibilidadCeldaCancelarTrimestre=this.jInternalFrameDetalleFormTrimestre.jButtonCancelarToolBarTrimestre.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTrimestre=this.jButtonGuardarCambiosToolBarTrimestre.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTrimestre=this.jButtonGuardarCambiosTablaToolBarTrimestre.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTrimestre=this.jMenuItemNuevoTrimestre.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTrimestre=this.jMenuItemNuevoRelacionesTrimestre.isVisible();
			
			if(this.jInternalFrameDetalleFormTrimestre!=null) {
			this.isVisibilidadCeldaModificarTrimestre=this.jInternalFrameDetalleFormTrimestre.jMenuItemModificarTrimestre.isVisible();
			this.isVisibilidadCeldaActualizarTrimestre=this.jInternalFrameDetalleFormTrimestre.jMenuItemActualizarTrimestre.isVisible();
			this.isVisibilidadCeldaEliminarTrimestre=this.jInternalFrameDetalleFormTrimestre.jMenuItemEliminarTrimestre.isVisible();
			this.isVisibilidadCeldaCancelarTrimestre=this.jInternalFrameDetalleFormTrimestre.jMenuItemCancelarTrimestre.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTrimestre=this.jMenuItemGuardarCambiosTrimestre.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTrimestre=this.jMenuItemGuardarCambiosTablaTrimestre.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTrimestre(Boolean esInicializar) {
		if(TrimestreJInternalFrame.ISBINDING_MANUAL) {			
			if(this.trimestreSessionBean.getConGuardarRelaciones()) {
				//if(this.trimestreSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTrimestre();
			}
			
			this.inicializarActualizarBindingBotonesManualTrimestre(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTrimestre() {
		this.jButtonNuevoTrimestre.setVisible(this.isPermisoNuevoTrimestre);			
		this.jButtonDuplicarTrimestre.setVisible(this.isPermisoDuplicarTrimestre);			
		this.jButtonCopiarTrimestre.setVisible(this.isPermisoCopiarTrimestre);			
		this.jButtonVerFormTrimestre.setVisible(this.isPermisoVerFormTrimestre);			
		
		this.jButtonAbrirOrderByTrimestre.setVisible(this.isPermisoOrdenTrimestre);					
		
		this.jButtonNuevoRelacionesTrimestre.setVisible(this.isPermisoNuevoTrimestre);			
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTrimestre.jButtonModificarTrimestre.setVisible(this.isPermisoActualizarTrimestre);	
			this.jInternalFrameDetalleFormTrimestre.jButtonActualizarTrimestre.setVisible(this.isPermisoActualizarTrimestre);	
			this.jInternalFrameDetalleFormTrimestre.jButtonEliminarTrimestre.setVisible(this.isPermisoEliminarTrimestre);
			this.jInternalFrameDetalleFormTrimestre.jButtonCancelarTrimestre.setVisible(this.isVisibilidadCeldaCancelarTrimestre);						
			this.jInternalFrameDetalleFormTrimestre.jButtonGuardarCambiosTrimestre.setVisible(this.isPermisoGuardarCambiosTrimestre);							
		}
		
		this.jButtonGuardarCambiosTablaTrimestre.setVisible(this.isPermisoActualizarTrimestre);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTrimestre() {
		this.jInternalFrameDetalleFormTrimestre.jButtonModificarTrimestre.setVisible(this.isPermisoActualizarTrimestre);	
		this.jInternalFrameDetalleFormTrimestre.jButtonActualizarTrimestre.setVisible(this.isPermisoActualizarTrimestre);	
		this.jInternalFrameDetalleFormTrimestre.jButtonEliminarTrimestre.setVisible(this.isPermisoEliminarTrimestre);
		this.jInternalFrameDetalleFormTrimestre.jButtonCancelarTrimestre.setVisible(this.isVisibilidadCeldaCancelarTrimestre);							
		this.jInternalFrameDetalleFormTrimestre.jButtonGuardarCambiosTrimestre.setVisible((this.isVisibilidadCeldaGuardarTrimestre && this.isPermisoGuardarCambiosTrimestre));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTrimestre() {
		if(TrimestreJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTrimestre();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTrimestre() {
	}
	
	public void jTableDatosTrimestreListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTrimestre(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTrimestreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTrimestre(this.gettrimestre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTrimestre(this.trimestre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.trimestre =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.trimestre =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.trimestre==null) {
						this.trimestre = new Trimestre();
					}

					this.setVariablesFormularioToObjetoActualTrimestre(this.trimestre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTrimestre(this.trimestre);
				}

				if(this.trimestre.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.trimestre.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTrimestre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestreLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTrimestreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTrimestre(this.gettrimestre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTrimestre(this.trimestre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.trimestre =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.trimestre =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.trimestre==null) {
						this.trimestre = new Trimestre();
					}

					this.setVariablesFormularioToObjetoActualTrimestre(this.trimestre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTrimestre(this.trimestre);
				}

				if(this.trimestre.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.trimestre.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTrimestre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestreLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTrimestre() {
		if(this.jInternalFrameDetalleFormTrimestre!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) {
			this.jInternalFrameDetalleFormTrimestre.setVisible(false);	    			
			this.jInternalFrameDetalleFormTrimestre.dispose();
			this.jInternalFrameDetalleFormTrimestre=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTrimestre!=null) {
			this.jInternalFrameReporteDinamicoTrimestre.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTrimestre.dispose();
			this.jInternalFrameReporteDinamicoTrimestre=null;
		}
		
		if(this.jInternalFrameImportacionTrimestre!=null) {
			this.jInternalFrameImportacionTrimestre.setVisible(false);	    			
			this.jInternalFrameImportacionTrimestre.dispose();
			this.jInternalFrameImportacionTrimestre=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTrimestre();
			
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
			
			
			if(sTipo.equals("NuevoTrimestre")) {
				jButtonNuevoTrimestreActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTrimestre")) {
				jButtonDuplicarTrimestreActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTrimestre")) {
				jButtonCopiarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("VerFormTrimestre")) {
				jButtonVerFormTrimestreActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTrimestre")) {
				jButtonNuevoTrimestreActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTrimestre")) {
				jButtonDuplicarTrimestreActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTrimestre")) {
				jButtonNuevoTrimestreActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTrimestre")) {
				jButtonDuplicarTrimestreActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTrimestre")) {
				jButtonNuevoTrimestreActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTrimestre")) {
				jButtonNuevoTrimestreActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTrimestre")) {
				jButtonNuevoTrimestreActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTrimestre")) {
				jButtonModificarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTrimestre")) {
				jButtonModificarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTrimestre")) {
				jButtonModificarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTrimestre")) {
				jButtonActualizarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTrimestre")) {
				jButtonActualizarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTrimestre")) {
				jButtonActualizarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("EliminarTrimestre")) {
				jButtonEliminarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTrimestre")) {
				jButtonEliminarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTrimestre")) {
				jButtonEliminarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("CancelarTrimestre")) {
				jButtonCancelarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTrimestre")) {
				jButtonCancelarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTrimestre")) {
				jButtonCancelarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("CerrarTrimestre")) {
				jButtonCerrarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTrimestre")) {
				jButtonCerrarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTrimestre")) {
				jButtonCerrarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTrimestre")) {
				jButtonMostrarOcultarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTrimestre")) {
				jButtonCancelarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTrimestre")) {
				jButtonGuardarCambiosTrimestreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTrimestre")) {
				jButtonGuardarCambiosTrimestreActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTrimestre")) {
				jButtonCopiarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTrimestre")) {
				jButtonVerFormTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTrimestre")) {
				jButtonGuardarCambiosTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTrimestre")) {
				jButtonCopiarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTrimestre")) {
				jButtonVerFormTrimestreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTrimestre")) {
				jButtonGuardarCambiosTrimestreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTrimestre")) {
				jButtonGuardarCambiosTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTrimestre")) {
				jButtonGuardarCambiosTrimestreActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTrimestre")) {
				jButtonRecargarInformacionTrimestreActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTrimestre")) {
				jButtonRecargarInformacionTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTrimestre")) {
				jButtonRecargarInformacionTrimestreActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTrimestre")) {
				jButtonAnterioresTrimestreActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTrimestre")) {
				jButtonAnterioresTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTrimestre")) {
				jButtonAnterioresTrimestreActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTrimestre")) {
				jButtonSiguientesTrimestreActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTrimestre")) {
				jButtonSiguientesTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTrimestre")) {
				jButtonSiguientesTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTrimestre") || sTipo.equals("MenuItemDetalleAbrirOrderByTrimestre")) {
				jButtonAbrirOrderByTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTrimestre") || sTipo.equals("MenuItemDetalleMostrarOcultarTrimestre")) {
				jButtonMostrarOcultarTrimestreActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTrimestre")) {
				jButtonNuevoGuardarCambiosTrimestreActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTrimestre")) {
				jButtonNuevoGuardarCambiosTrimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTrimestre")) {
				jButtonNuevoGuardarCambiosTrimestreActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTrimestre")) {
				jButtonCerrarReporteDinamicoTrimestreActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTrimestre")) {
				jButtonGenerarReporteDinamicoTrimestreActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTrimestre")) {
				
				jButtonGenerarExcelReporteDinamicoTrimestreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTrimestre")) {
				jButtonCerrarImportacionTrimestreActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTrimestre")) {
				
				jButtonGenerarImportacionTrimestreActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTrimestre")) {
				
				jButtonAbrirImportacionTrimestreActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTrimestre")) {
				jComboBoxTiposAccionesTrimestreActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTrimestre")) {
				jComboBoxTiposRelacionesTrimestreActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTrimestre")) {
				jComboBoxTiposAccionesTrimestreActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTrimestre")) {
				
				jComboBoxTiposSeleccionarTrimestreActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTrimestre")) {
				jTextFieldValorCampoGeneralTrimestreActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTrimestre")) {
				jButtonAbrirOrderByTrimestreActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTrimestre")) {
				jButtonAbrirOrderByTrimestreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTrimestre")) {
				jButtonCerrarOrderByTrimestreActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTrimestreBusqueda")) {
				this.jButtonidTrimestreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTrimestreBusqueda")) {
				this.jButtonnombreTrimestreBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTrimestre();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTrimestreActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.trimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.trimestre);
				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
				
				


				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Trimestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Trimestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Trimestre trimestreLocal=null;
			
			if(!this.getEsControlTabla()) {
				trimestreLocal=this.trimestre;
			} else {
				trimestreLocal=this.trimestreAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.trimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.trimestre);
				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
							
				
				


				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Trimestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Trimestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTrimestreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestreAnterior =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.trimestreAnterior =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
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
			
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
			
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
			
			


			
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTrimestreActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.trimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.trimestre);
				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
								
						
				


				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Trimestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Trimestre.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.trimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.trimestre);
				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
								
				
				


				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Trimestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Trimestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTrimestreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestreAnterior =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.trimestreAnterior =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.trimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.trimestre);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTrimestreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestreAnterior =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.trimestreAnterior =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTrimestreActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.trimestre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.trimestre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.trimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.trimestre);
				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
							
				
				


				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Trimestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Trimestre.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTrimestreActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.trimestreAnterior =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.trimestreAnterior =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
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
			
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
			
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
			
			


			
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTrimestreActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.trimestre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.trimestre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.trimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.trimestre);
				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
								
				
				


				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Trimestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Trimestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTrimestreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestreAnterior =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.trimestreAnterior =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTrimestreActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.trimestre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.trimestre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTrimestreActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.trimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.trimestre);
				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTrimestre")) {
					jCheckBoxSeleccionarTodosTrimestreItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTrimestre")) {
					jCheckBoxSeleccionadosTrimestreItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTrimestre")) {
					
				}
				
				


				
				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Trimestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Trimestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.trimestre);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.trimestre);
				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
												
				
				


				
				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Trimestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Trimestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTrimestreActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.trimestreAnterior =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.trimestreAnterior =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTrimestreActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.trimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.trimestre);
				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
				
				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
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
			
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
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
			
			


			
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTrimestreActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.trimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.trimestre);
				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Trimestre.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Trimestre.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.trimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.trimestre);
				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
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
				
				


				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Trimestre.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Trimestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTrimestreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.trimestreAnterior =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.trimestreAnterior =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTrimestre")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTrimestreListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTrimestre.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.trimestre =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.trimestre =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.trimestre);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTrimestre")) {
				
				}
				
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTrimestre")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTrimestre.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTrimestre")) {
			
			}
			
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTrimestre();
			
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
			
			if(sTipo.equals("NuevoTrimestre")) {
				jButtonNuevoTrimestreActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTrimestre")) {
				jButtonDuplicarTrimestreActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTrimestre")) {
				jButtonCopiarTrimestreActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTrimestre")) {
				jButtonVerFormTrimestreActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTrimestre")) {
				jButtonNuevoTrimestreActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTrimestre")) {
				jButtonModificarTrimestreActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTrimestre")) {
				jButtonActualizarTrimestreActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTrimestre")) {
				jButtonEliminarTrimestreActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTrimestre")) {
				jButtonGuardarCambiosTrimestreActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTrimestre")) {
				jButtonCancelarTrimestreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTrimestre")) {
				jButtonCerrarTrimestreActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTrimestre")) {
				jButtonGuardarCambiosTrimestreActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTrimestre")) {
				jButtonNuevoGuardarCambiosTrimestreActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTrimestre")) {
				jButtonAbrirOrderByTrimestreActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTrimestre")) {
				jButtonRecargarInformacionTrimestreActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTrimestre")) {
				jButtonAnterioresTrimestreActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTrimestre")) {
				jButtonSiguientesTrimestreActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTrimestreBusqueda")) {
				this.jButtonidTrimestreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTrimestreBusqueda")) {
				this.jButtonnombreTrimestreBusquedaActionPerformed(evt);
			}
			
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTrimestre();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTrimestre")) {
				closingInternalFrameTrimestre();
				
			} else if(sTipo.equals("jButtonCancelarTrimestre")) {
				JInternalFrameBase jInternalFrameDetalleFormTrimestre = (JInternalFrameBase)evt.getSource();
	            	
	            TrimestreBeanSwingJInternalFrame jInternalFrameParent=(TrimestreBeanSwingJInternalFrame)jInternalFrameDetalleFormTrimestre.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTrimestreActionPerformed(null);
			}
			
			TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.trimestre,new Object(),this.trimestreParameterGeneral,this.trimestreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTrimestre(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTrimestre(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTrimestre(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.trimestre)) {
			if(!esControlTabla) {
				if(TrimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTrimestre(this.trimestre,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTrimestre(this.trimestre);			
				}
				
				if(this.trimestreSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTrimestre(this.trimestre,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.trimestreReturnGeneral=trimestreLogic.procesarEventosTrimestresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.trimestreLogic.getTrimestres(),this.trimestre,this.trimestreParameterGeneral,this.isEsNuevoTrimestre,classes);//this.trimestreLogic.getTrimestre()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTrimestre(this.trimestreReturnGeneral,this.trimestreBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.trimestreSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTrimestre(classes,this.trimestreReturnGeneral,this.trimestreBean,false);
					}
						
					if(this.trimestreReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTrimestre(this.trimestreReturnGeneral.getTrimestre());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTrimestre(this.trimestreReturnGeneral.getTrimestre());	
					}
						
					if(this.trimestreReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTrimestre(this.trimestreReturnGeneral.getTrimestre(),classes);//this.trimestreBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTrimestre(this.trimestre,classes);//this.trimestreBean);									
				}
			
				if(TrimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTrimestre(this.trimestre,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTrimestre(this.trimestre);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.trimestreAnterior!=null) {
						this.trimestre=this.trimestreAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.trimestreReturnGeneral=trimestreLogic.procesarEventosTrimestresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.trimestreLogic.getTrimestres(),this.trimestre,this.trimestreParameterGeneral,this.isEsNuevoTrimestre,classes);//this.trimestreLogic.getTrimestre()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.trimestreSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.trimestreSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.trimestreReturnGeneral.getTrimestre(),trimestreLogic.getTrimestres());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.trimestreReturnGeneral.getTrimestre(),this.trimestres);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTrimestre.repaint();
				
				//((AbstractTableModel) this.jTableDatosTrimestre.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTrimestre();
			}
		}
	}
	
	public void actualizarVisualTableDatosTrimestre() throws Exception {
		
		TrimestreModel trimestreModel=(TrimestreModel)this.jTableDatosTrimestre.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			trimestreModel.trimestres=this.trimestreLogic.getTrimestres();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			trimestreModel.trimestres=this.trimestres;
		}
		
		
		((TrimestreModel) this.jTableDatosTrimestre.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTrimestre() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettrimestreAnterior(),this.trimestreLogic.getTrimestres());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettrimestreAnterior(),this.trimestres);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTrimestre();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTrimestre(Trimestre trimestre,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
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
										
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.trimestre,new Object(),generalEntityParameterGeneral,this.trimestreReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.trimestreSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TrimestreConstantesFunciones.getClassesRelationshipsOfTrimestre(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TrimestreConstantesFunciones.getClassesRelationshipsFromStringsOfTrimestre(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTrimestre(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TrimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.trimestre,new Object(),generalEntityParameterGeneral,this.trimestreReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTrimestre(TrimestreBean trimestreBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTrimestre(ArrayList<Classe> classes,TrimestreReturnGeneral trimestreReturnGeneral,TrimestreBean trimestreBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTrimestre(Trimestre trimestre,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.trimestre)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTrimestre = new TrimestreDetalleFormJInternalFrame(jDesktopPane,this.trimestreSessionBean.getConGuardarRelaciones(),this.trimestreSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTrimestre);
		this.jInternalFrameDetalleFormTrimestre.setVisible(false);
		this.jInternalFrameDetalleFormTrimestre.setSelected(false);						
		
		this.jInternalFrameDetalleFormTrimestre.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTrimestre.trimestreLogic=this.trimestreLogic;
		
		this.cargarCombosFrameForeignKeyTrimestre("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTrimestre();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTrimestre();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTrimestre("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTrimestre();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTrimestre.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTrimestre"));
		
		this.jInternalFrameDetalleFormTrimestre.jButtonModificarTrimestre.addActionListener(new ButtonActionListener(this,"ModificarTrimestre"));

		
		this.jInternalFrameDetalleFormTrimestre.jButtonModificarToolBarTrimestre.addActionListener(new ButtonActionListener(this,"ModificarToolBarTrimestre"));
					
		this.jInternalFrameDetalleFormTrimestre.jMenuItemModificarTrimestre.addActionListener(new ButtonActionListener(this,"MenuItemModificarTrimestre"));		
		
		
		
		this.jInternalFrameDetalleFormTrimestre.jButtonActualizarTrimestre.addActionListener (new ButtonActionListener(this,"ActualizarTrimestre"));
		
		
		this.jInternalFrameDetalleFormTrimestre.jButtonActualizarToolBarTrimestre.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTrimestre"));
						
		this.jInternalFrameDetalleFormTrimestre.jMenuItemActualizarTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTrimestre"));		
		
		
		
		this.jInternalFrameDetalleFormTrimestre.jButtonEliminarTrimestre.addActionListener (new ButtonActionListener(this,"EliminarTrimestre"));
		
		
		this.jInternalFrameDetalleFormTrimestre.jButtonEliminarToolBarTrimestre.addActionListener (new ButtonActionListener(this,"EliminarToolBarTrimestre"));
								
		this.jInternalFrameDetalleFormTrimestre.jMenuItemEliminarTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTrimestre"));		
		
		
		
		this.jInternalFrameDetalleFormTrimestre.jButtonCancelarTrimestre.addActionListener (new ButtonActionListener(this,"CancelarTrimestre"));
		
		
		this.jInternalFrameDetalleFormTrimestre.jButtonCancelarToolBarTrimestre.addActionListener (new ButtonActionListener(this,"CancelarToolBarTrimestre"));
					
		this.jInternalFrameDetalleFormTrimestre.jMenuItemCancelarTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTrimestre"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTrimestre.jMenuItemDetalleCerrarTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTrimestre"));		
		
		
		
		this.jInternalFrameDetalleFormTrimestre.jButtonGuardarCambiosToolBarTrimestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTrimestre"));
		
		
		
		this.jInternalFrameDetalleFormTrimestre.jButtonGuardarCambiosToolBarTrimestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTrimestre"));
		
		
		
		this.jInternalFrameDetalleFormTrimestre.jComboBoxTiposAccionesFormularioTrimestre.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTrimestre"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTrimestre.jButtonidTrimestreBusqueda.addActionListener(new ButtonActionListener(this,"idTrimestreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTrimestre.jButtonnombreTrimestreBusqueda.addActionListener(new ButtonActionListener(this,"nombreTrimestreBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTrimestre.jTabbedPaneRelacionesTrimestre.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTrimestre"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTrimestre"));
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTrimestre.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTrimestre"));
		}
		
		this.jTableDatosTrimestre.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTrimestre"));
		
		this.jTableDatosTrimestre.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTrimestre"));
		
		this.jButtonNuevoTrimestre.addActionListener(new ButtonActionListener(this,"NuevoTrimestre"));
		
		this.jButtonDuplicarTrimestre.addActionListener(new ButtonActionListener(this,"DuplicarTrimestre"));
		
		this.jButtonCopiarTrimestre.addActionListener(new ButtonActionListener(this,"CopiarTrimestre"));
		
		this.jButtonVerFormTrimestre.addActionListener(new ButtonActionListener(this,"VerFormTrimestre"));
		
		
		this.jButtonNuevoToolBarTrimestre.addActionListener(new ButtonActionListener(this,"NuevoToolBarTrimestre"));
			
		this.jButtonDuplicarToolBarTrimestre.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTrimestre"));
			
		this.jMenuItemNuevoTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTrimestre"));
			
		this.jMenuItemDuplicarTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTrimestre"));		
		
		
		this.jButtonNuevoRelacionesTrimestre.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTrimestre"));
		
		
		this.jButtonNuevoRelacionesToolBarTrimestre.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTrimestre"));
			
		this.jMenuItemNuevoRelacionesTrimestre.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTrimestre"));		
		
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTrimestre.jButtonModificarTrimestre.addActionListener(new ButtonActionListener(this,"ModificarTrimestre"));
		}
		
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTrimestre.jButtonModificarToolBarTrimestre.addActionListener(new ButtonActionListener(this,"ModificarToolBarTrimestre"));
			
			this.jInternalFrameDetalleFormTrimestre.jMenuItemModificarTrimestre.addActionListener(new ButtonActionListener(this,"MenuItemModificarTrimestre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTrimestre.jButtonActualizarTrimestre.addActionListener (new ButtonActionListener(this,"ActualizarTrimestre"));
		}
		
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTrimestre.jButtonActualizarToolBarTrimestre.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTrimestre"));
				
			this.jInternalFrameDetalleFormTrimestre.jMenuItemActualizarTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTrimestre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTrimestre.jButtonEliminarTrimestre.addActionListener (new ButtonActionListener(this,"EliminarTrimestre"));
		}
		
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTrimestre.jButtonEliminarToolBarTrimestre.addActionListener (new ButtonActionListener(this,"EliminarToolBarTrimestre"));
						
			this.jInternalFrameDetalleFormTrimestre.jMenuItemEliminarTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTrimestre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTrimestre.jButtonCancelarTrimestre.addActionListener (new ButtonActionListener(this,"CancelarTrimestre"));
		}
		
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTrimestre.jButtonCancelarToolBarTrimestre.addActionListener (new ButtonActionListener(this,"CancelarToolBarTrimestre"));
			
			this.jInternalFrameDetalleFormTrimestre.jMenuItemCancelarTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTrimestre"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTrimestre.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTrimestre"));		
		
		
		this.jButtonCerrarTrimestre.addActionListener (new ButtonActionListener(this,"CerrarTrimestre"));
		
		
		this.jButtonCerrarToolBarTrimestre.addActionListener (new ButtonActionListener(this,"CerrarToolBarTrimestre"));
			
		this.jMenuItemCerrarTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTrimestre"));
			
		if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTrimestre.jMenuItemDetalleCerrarTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTrimestre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTrimestre.jButtonGuardarCambiosTrimestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTrimestre"));
		}
		
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTrimestre.jButtonGuardarCambiosToolBarTrimestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTrimestre"));
		}
		
		this.jButtonCopiarToolBarTrimestre.addActionListener (new ButtonActionListener(this,"CopiarToolBarTrimestre"));
			
		this.jButtonVerFormToolBarTrimestre.addActionListener (new ButtonActionListener(this,"VerFormToolBarTrimestre"));
		
		this.jMenuItemGuardarCambiosTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTrimestre"));
			
		this.jMenuItemCopiarTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTrimestre"));		
		
		this.jMenuItemVerFormTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTrimestre"));		
		
		
		this.jButtonGuardarCambiosTablaTrimestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTrimestre"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTrimestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTrimestre"));
			
		this.jMenuItemGuardarCambiosTablaTrimestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTrimestre"));		
		
		
		
		this.jButtonRecargarInformacionTrimestre.addActionListener (new ButtonActionListener(this,"RecargarInformacionTrimestre"));
					
		this.jButtonRecargarInformacionToolBarTrimestre.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTrimestre"));
		
		this.jMenuItemRecargarInformacionTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTrimestre"));		
		
		
		
		this.jButtonAnterioresTrimestre.addActionListener (new ButtonActionListener(this,"AnterioresTrimestre"));
		
		
		this.jButtonAnterioresToolBarTrimestre.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTrimestre"));
		
		this.jMenuItemAnterioresTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTrimestre"));		
		
		
		this.jButtonSiguientesTrimestre.addActionListener (new ButtonActionListener(this,"SiguientesTrimestre"));
		
		
		this.jButtonSiguientesToolBarTrimestre.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTrimestre"));
			
		this.jMenuItemSiguientesTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTrimestre"));
			
		this.jMenuItemAbrirOrderByTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTrimestre"));
			
		this.jMenuItemMostrarOcultarTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTrimestre"));
			
		this.jMenuItemDetalleAbrirOrderByTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTrimestre"));
			
		this.jMenuItemDetalleMostarOcultarTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTrimestre"));		
		
		
		this.jButtonNuevoGuardarCambiosTrimestre.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTrimestre"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTrimestre.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTrimestre"));
			
		this.jMenuItemNuevoGuardarCambiosTrimestre.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTrimestre"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTrimestre.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTrimestre"));

		this.jCheckBoxSeleccionadosTrimestre.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTrimestre"));
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTrimestre.jComboBoxTiposAccionesFormularioTrimestre.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTrimestre"));
		}
		
		
		this.jComboBoxTiposRelacionesTrimestre.addActionListener (new ButtonActionListener(this,"TiposRelacionesTrimestre"));
			
		this.jComboBoxTiposAccionesTrimestre.addActionListener (new ButtonActionListener(this,"TiposAccionesTrimestre"));
					
		this.jComboBoxTiposSeleccionarTrimestre.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTrimestre"));
			
		this.jTextFieldValorCampoGeneralTrimestre.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTrimestre"));		
		
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTrimestre.jButtonidTrimestreBusqueda.addActionListener(new ButtonActionListener(this,"idTrimestreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTrimestre.jButtonnombreTrimestreBusqueda.addActionListener(new ButtonActionListener(this,"nombreTrimestreBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTrimestre!=null) {
				this.jInternalFrameReporteDinamicoTrimestre.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTrimestre"));
				this.jInternalFrameReporteDinamicoTrimestre.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTrimestre"));
				this.jInternalFrameReporteDinamicoTrimestre.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTrimestre"));
			}
			
			//this.jButtonCerrarReporteDinamicoTrimestre.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTrimestre"));				
			//this.jButtonGenerarReporteDinamicoTrimestre.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTrimestre"));
			//this.jButtonGenerarExcelReporteDinamicoTrimestre.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTrimestre"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTrimestre!=null) {
				this.jInternalFrameImportacionTrimestre.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTrimestre"));
				this.jInternalFrameImportacionTrimestre.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTrimestre"));
				this.jInternalFrameImportacionTrimestre.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTrimestre"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTrimestre.addActionListener (new ButtonActionListener(this,"AbrirOrderByTrimestre"));
			
			this.jButtonAbrirOrderByToolBarTrimestre.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTrimestre"));			
			
			if(this.jInternalFrameOrderByTrimestre!=null) {
				this.jInternalFrameOrderByTrimestre.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTrimestre"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTrimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTrimestre.jTabbedPaneRelacionesTrimestre.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTrimestre"));
		
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
            		closingInternalFrameTrimestre();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTrimestre.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTrimestre = (JInternalFrameBase)event.getSource();
	            	
	            TrimestreBeanSwingJInternalFrame jInternalFrameParent=(TrimestreBeanSwingJInternalFrame)jInternalFrameDetalleFormTrimestre.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTrimestreActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTrimestre.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTrimestreListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTrimestre.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTrimestre.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTrimestreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTrimestreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTrimestreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTrimestre";
		inputMap = this.jButtonNuevoTrimestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTrimestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTrimestreActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTrimestreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTrimestreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTrimestreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTrimestre";
		inputMap = this.jButtonNuevoRelacionesTrimestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTrimestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTrimestreActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTrimestre";
		inputMap = this.jButtonModificarTrimestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTrimestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTrimestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTrimestre";
		inputMap = this.jButtonActualizarTrimestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTrimestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTrimestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTrimestre";
		inputMap = this.jButtonEliminarTrimestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTrimestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTrimestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTrimestre";
		inputMap = this.jButtonCancelarTrimestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTrimestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTrimestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTrimestre";
		inputMap = this.jButtonCerrarTrimestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTrimestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTrimestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTrimestre.jButtonGuardarCambiosTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTrimestre";
		inputMap = this.jInternalFrameDetalleFormTrimestre.jButtonGuardarCambiosTrimestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTrimestre.jButtonGuardarCambiosTrimestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTrimestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTrimestre.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTrimestreItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTrimestre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTrimestreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTrimestre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTrimestreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTrimestre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTrimestreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTrimestre.jButtonidTrimestreBusqueda.addActionListener(new ButtonActionListener(this,"idTrimestreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTrimestre.jButtonnombreTrimestreBusqueda.addActionListener(new ButtonActionListener(this,"nombreTrimestreBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTrimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTrimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTrimestreActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTrimestre.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTrimestre(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Trimestre trimestreAux:this.trimestreLogic.getTrimestres()) {
					trimestreAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Trimestre trimestreAux:trimestres) {
					trimestreAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTrimestreItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTrimestre(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Trimestre trimestreAux:this.trimestreLogic.getTrimestres()) {
						trimestreAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Trimestre trimestreAux:trimestres) {
						trimestreAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Trimestre trimestreAux:this.trimestreLogic.getTrimestres()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Trimestre trimestreAux:trimestres) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTrimestre(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTrimestre.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTrimestre.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTrimestre,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTrimestreItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTrimestre(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTrimestre.getSelectedRows();
			
			Trimestre trimestreLocal=new Trimestre();
			
			//this.seleccionarTodosTrimestre(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					trimestreLocal =(Trimestre) this.trimestreLogic.getTrimestres().toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					trimestreLocal =(Trimestre) this.trimestres.toArray()[this.jTableDatosTrimestre.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				trimestreLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Trimestre trimestreAux:this.trimestreLogic.getTrimestres()) {
						trimestreAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Trimestre trimestreAux:trimestres) {
						trimestreAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTrimestre(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTrimestre.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTrimestre.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTrimestre,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTrimestreItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTrimestreParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTrimestreActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTrimestre(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTrimestre.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Trimestre trimestreAux:this.trimestreLogic.getTrimestres()) {
				
						if(sTipoSeleccionar.equals(TrimestreConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							trimestreAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Trimestre trimestreAux:trimestres) {
					
						if(sTipoSeleccionar.equals(TrimestreConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							trimestreAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTrimestre(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTrimestreActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTrimestre(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTrimestre=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTrimestre.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTrimestre.jComboBoxTiposAccionesFormularioTrimestre.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTrimestre) {				
					conSplash=true;//false;										
					
					//this.startProcessTrimestre(conSplash);
				
					this.generarReporteTrimestresSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTrimestre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTrimestre.jComboBoxTiposAccionesFormularioTrimestre.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTrimestresSeleccionados();
				//this.jComboBoxTiposAccionesTrimestre.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTrimestresSeleccionados(false);
				//this.jComboBoxTiposAccionesTrimestre.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTrimestresSeleccionados(true);
				//this.jComboBoxTiposAccionesTrimestre.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTrimestre();
				
				this.exportarTrimestresSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTrimestre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTrimestre.jComboBoxTiposAccionesFormularioTrimestre.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTrimestres();
				//this.importarTrimestres();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTrimestre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTrimestre.jComboBoxTiposAccionesFormularioTrimestre.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTrimestre();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTrimestresSeleccionados();
				//this.jComboBoxTiposAccionesTrimestre.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Trimestre", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTrimestre();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTrimestre)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTrimestre(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Trimestre",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTrimestre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTrimestre.jComboBoxTiposAccionesFormularioTrimestre.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTrimestre();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTrimestre(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTrimestreActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTrimestre();
			
			if(this.jInternalFrameDetalleFormTrimestre==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Trimestre> trimestresSeleccionados=new ArrayList<Trimestre>();		
			Trimestre trimestre=new Trimestre();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTrimestre(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTrimestre.getSelectedItem();
			
			
			
			
			trimestresSeleccionados=this.getTrimestresSeleccionados(true);
			//this.sTipoAccion;
			
			if(trimestresSeleccionados.size()==1) {
				for(Trimestre trimestreAux:trimestresSeleccionados) {
					trimestre=trimestreAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTrimestre();
			
      		//this.finishProcessTrimestre(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTrimestreReturnGeneral() throws Exception {
		if(this.trimestreReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.trimestreReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.trimestreReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.trimestreReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.trimestreReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.trimestreReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTrimestre(false);
		}
		
		if(this.trimestreReturnGeneral.getConRetornoLista() || this.trimestreReturnGeneral.getConRetornoObjeto()) {
			if(this.trimestreReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.trimestreLogic.setTrimestres(this.trimestreReturnGeneral.getTrimestres());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.trimestreReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.trimestreLogic.setTrimestre(this.trimestreReturnGeneral.getTrimestre());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTrimestre(false);
		}
	}
	
	public void actualizarParametrosGeneralTrimestre() throws Exception {
		
		
	}
	
	public ArrayList<Trimestre> getTrimestresSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Trimestre> trimestresSeleccionados=new ArrayList<Trimestre>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTrimestre) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Trimestre trimestreAux:trimestreLogic.getTrimestres()) {
					if(trimestreAux.getIsSelected()) {
						trimestresSeleccionados.add(trimestreAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Trimestre trimestreAux:this.trimestres) {
					if(trimestreAux.getIsSelected()) {
						trimestresSeleccionados.add(trimestreAux);				
					}
				}
			}
			
			if(trimestresSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						trimestresSeleccionados.addAll(this.trimestreLogic.getTrimestres());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						trimestresSeleccionados.addAll(this.trimestres);				
					}
				}
			}
		} else {
			trimestresSeleccionados.add(this.trimestre);
		}
		
		return trimestresSeleccionados;
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
	
	public void generarReporteTrimestresSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTrimestresSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTrimestresSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTrimestresSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTrimestresSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Trimestre",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTrimestresSeleccionados() throws Exception {
		ArrayList<Trimestre> trimestresSeleccionados=new ArrayList<Trimestre>();		
		
		trimestresSeleccionados=this.getTrimestresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTrimestres("Todos",trimestresSeleccionados);
		
	}	
	
	public void generarReporteNormalTrimestresSeleccionados() throws Exception {
		ArrayList<Trimestre> trimestresSeleccionados=new ArrayList<Trimestre>();		
		
		trimestresSeleccionados=this.getTrimestresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTrimestres("Todos",trimestresSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTrimestresSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Trimestre> trimestresSeleccionados=new ArrayList<Trimestre>();
		
		trimestresSeleccionados=this.getTrimestresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTrimestres("Todos",trimestresSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTrimestresSeleccionados() throws Exception {
		ArrayList<Trimestre> trimestresSeleccionados=new ArrayList<Trimestre>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTrimestre();
		
		
		trimestresSeleccionados=this.getTrimestresSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTrimestre();
		
		
		//this.generarReporteTrimestres("Todos",trimestresSeleccionados ,trimestreImplementable,trimestreImplementableHome);
	}
	
	public void mostrarImportacionTrimestres() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTrimestre();
		
		this.abrirFrameImportacionTrimestre();		
		
			
		//this.generarReporteTrimestres("Todos",trimestresSeleccionados ,trimestreImplementable,trimestreImplementableHome);
	}
	
	public void importarTrimestres() throws Exception {		
	
	}
	
	public void exportarTrimestresSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTrimestresSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTrimestresSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTrimestresSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Trimestre",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTrimestresSeleccionados() throws Exception {
		ArrayList<Trimestre> trimestresSeleccionados=new ArrayList<Trimestre>();		
		
		trimestresSeleccionados=this.getTrimestresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"trimestre."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTrimestre(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Trimestre trimestreAux:trimestresSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTrimestre(trimestreAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//trimestreAux.setsDetalleGeneralEntityReporte(trimestreAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.trimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Trimestre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTrimestre(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TrimestreConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TrimestreConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TrimestreConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTrimestre(Trimestre trimestre,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=trimestre.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=trimestre.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=trimestre.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTrimestresSeleccionados() throws Exception {
		ArrayList<Trimestre> trimestresSeleccionados=new ArrayList<Trimestre>();		
		
		trimestresSeleccionados=this.getTrimestresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"trimestre.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Trimestres");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTrimestre(row);				
				iRow++;
			}				
			
			for(Trimestre trimestreAux:trimestresSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTrimestre(trimestreAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.trimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Trimestre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTrimestresSeleccionados() throws Exception {
		ArrayList<Trimestre> trimestresSeleccionados=new ArrayList<Trimestre>();		
		
		trimestresSeleccionados=this.getTrimestresSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"trimestre.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("trimestres");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("trimestre");
			//elementRoot.appendChild(element);
		
			for(Trimestre trimestreAux:trimestresSeleccionados) {
				element = document.createElement("trimestre");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTrimestre(trimestreAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.trimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Trimestre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTrimestre(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TrimestreConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TrimestreConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TrimestreConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTrimestre(Trimestre trimestre,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(trimestre.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(trimestre.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTrimestre(Trimestre trimestre,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TrimestreConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(trimestre.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TrimestreConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(trimestre.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TrimestreConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(trimestre.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTrimestresSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Trimestre> trimestresSeleccionados=new ArrayList<Trimestre>();
		
		trimestresSeleccionados=this.getTrimestresSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTrimestre(trimestresSeleccionados);
		
		this.generarReporteTrimestres("Todos",trimestresSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTrimestre(ArrayList<Trimestre> trimestresSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Trimestre trimestreAux:trimestresSeleccionados) {
				trimestreAux.setsDetalleGeneralEntityReporte(trimestreAux.toString());
			
				if(sTipoSeleccionar.equals(TrimestreConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					trimestreAux.setsDescripcionGeneralEntityReporte1(trimestreAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TrimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTrimestre(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTrimestre=true;
				this.isVisibilidadCeldaNuevoRelacionesTrimestre=true;
				this.isVisibilidadCeldaGuardarCambiosTrimestre=true;
			}
			
			this.isVisibilidadCeldaModificarTrimestre=false;
			this.isVisibilidadCeldaActualizarTrimestre=false;
			this.isVisibilidadCeldaEliminarTrimestre=false;
			this.isVisibilidadCeldaCancelarTrimestre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTrimestre=true;
				} else {
					this.isVisibilidadCeldaGuardarTrimestre=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTrimestre=false;
			this.isVisibilidadCeldaNuevoRelacionesTrimestre=false;
			this.isVisibilidadCeldaGuardarCambiosTrimestre=false;
			this.isVisibilidadCeldaModificarTrimestre=false;
			this.isVisibilidadCeldaActualizarTrimestre=true;
			this.isVisibilidadCeldaEliminarTrimestre=false;
			this.isVisibilidadCeldaCancelarTrimestre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTrimestre=true;
				} else {
					this.isVisibilidadCeldaGuardarTrimestre=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTrimestre=false;
			this.isVisibilidadCeldaNuevoRelacionesTrimestre=false;
			this.isVisibilidadCeldaGuardarCambiosTrimestre=false;
			this.isVisibilidadCeldaModificarTrimestre=false;
			this.isVisibilidadCeldaActualizarTrimestre=true;
			this.isVisibilidadCeldaEliminarTrimestre=true;
			this.isVisibilidadCeldaCancelarTrimestre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTrimestre=true;
				} else {
					this.isVisibilidadCeldaGuardarTrimestre=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTrimestre=false;
			this.isVisibilidadCeldaNuevoRelacionesTrimestre=false;
			this.isVisibilidadCeldaGuardarCambiosTrimestre=false;
			this.isVisibilidadCeldaModificarTrimestre=false;
			this.isVisibilidadCeldaActualizarTrimestre=true;
			this.isVisibilidadCeldaEliminarTrimestre=false;
			this.isVisibilidadCeldaCancelarTrimestre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTrimestre=false;
				} else {
					this.isVisibilidadCeldaGuardarTrimestre=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTrimestre=true;
			this.isVisibilidadCeldaNuevoRelacionesTrimestre=true;
			this.isVisibilidadCeldaGuardarCambiosTrimestre=true;
			this.isVisibilidadCeldaModificarTrimestre=false;
			this.isVisibilidadCeldaActualizarTrimestre=false;
			this.isVisibilidadCeldaEliminarTrimestre=false;
			this.isVisibilidadCeldaCancelarTrimestre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTrimestre=true;
				} else {
					this.isVisibilidadCeldaGuardarTrimestre=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTrimestre=false;
			this.isVisibilidadCeldaNuevoRelacionesTrimestre=false;
			this.isVisibilidadCeldaGuardarCambiosTrimestre=false;
			this.isVisibilidadCeldaActualizarTrimestre=false;
			this.isVisibilidadCeldaEliminarTrimestre=false;
			this.isVisibilidadCeldaCancelarTrimestre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTrimestre=false;
				} else {
					this.isVisibilidadCeldaGuardarTrimestre=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTrimestre=false;
			this.isVisibilidadCeldaNuevoRelacionesTrimestre=false;
			this.isVisibilidadCeldaGuardarCambiosTrimestre=false;
			this.isVisibilidadCeldaModificarTrimestre=true;
			this.isVisibilidadCeldaActualizarTrimestre=false;
			this.isVisibilidadCeldaEliminarTrimestre=false;
			this.isVisibilidadCeldaCancelarTrimestre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTrimestre=false;
				} else {
					this.isVisibilidadCeldaGuardarTrimestre=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TrimestreJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTrimestre=true;
			this.isVisibilidadCeldaNuevoRelacionesTrimestre=true;
			this.isVisibilidadCeldaGuardarCambiosTrimestre=true;
		} else {
			this.actualizarEstadoPanelsTrimestre(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTrimestre=false;
			//this.isVisibilidadCeldaVerFormTrimestre=false;
			this.isVisibilidadCeldaDuplicarTrimestre=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!trimestreSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTrimestre=false;
		} else {
			this.isVisibilidadCeldaNuevoTrimestre=false;
			this.isVisibilidadCeldaGuardarCambiosTrimestre=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(trimestreSessionBean.getEsGuardarRelacionado()) {
			if(!trimestreSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTrimestre=false;												
			}
			
			this.jButtonCerrarTrimestre.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTrimestre=false;
		}
		
		if(!this.permiteMantenimiento(this.trimestre)) {
			this.isVisibilidadCeldaActualizarTrimestre=false;
			this.isVisibilidadCeldaEliminarTrimestre=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTrimestre() {
	}
	
	public void actualizarEstadoPanelsTrimestre(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTrimestre!=null) {
				this.jScrollPanelDatosEdicionTrimestre.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTrimestre!=null) {
				this.jScrollPanelDatosTrimestre.setVisible(true);
			}
			
			if(this.jPanelPaginacionTrimestre!=null) {
				this.jPanelPaginacionTrimestre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTrimestre!=null) {
				this.jPanelParametrosReportesTrimestre.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTrimestre!=null) {
				this.jScrollPanelDatosEdicionTrimestre.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTrimestre!=null) {
				this.jScrollPanelDatosTrimestre.setVisible(false);
			}
			
			if(this.jPanelPaginacionTrimestre!=null) {
				this.jPanelPaginacionTrimestre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTrimestre!=null) {
				this.jPanelParametrosReportesTrimestre.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTrimestre!=null) {
				this.jScrollPanelDatosEdicionTrimestre.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTrimestre!=null) {
				this.jScrollPanelDatosTrimestre.setVisible(false);
			}
			
			if(this.jPanelPaginacionTrimestre!=null) {
				this.jPanelPaginacionTrimestre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTrimestre!=null) {
				this.jPanelParametrosReportesTrimestre.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTrimestre!=null) {
				this.jScrollPanelDatosEdicionTrimestre.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTrimestre!=null) {
				this.jScrollPanelDatosTrimestre.setVisible(false);
			}
			
			if(this.jPanelPaginacionTrimestre!=null) {
				this.jPanelPaginacionTrimestre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTrimestre!=null) {
				this.jPanelParametrosReportesTrimestre.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTrimestre!=null) {
				this.jScrollPanelDatosEdicionTrimestre.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTrimestre!=null) {
				this.jScrollPanelDatosTrimestre.setVisible(true);
			}
			
			if(this.jPanelPaginacionTrimestre!=null) {
				this.jPanelPaginacionTrimestre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTrimestre!=null) {
				this.jPanelParametrosReportesTrimestre.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTrimestre!=null) {
				this.jScrollPanelDatosEdicionTrimestre.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTrimestre!=null) {
				this.jScrollPanelDatosTrimestre.setVisible(true);
			}
			
			if(this.jPanelPaginacionTrimestre!=null) {
				this.jPanelPaginacionTrimestre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTrimestre!=null) {
				this.jPanelParametrosReportesTrimestre.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTrimestre!=null) {
				this.jScrollPanelDatosEdicionTrimestre.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTrimestre!=null) {
				this.jScrollPanelDatosTrimestre.setVisible(true);
			}
			
			if(this.jPanelPaginacionTrimestre!=null) {
				this.jPanelPaginacionTrimestre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTrimestre!=null) {
				this.jPanelParametrosReportesTrimestre.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.trimestreSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.trimestreSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TrimestreSessionBean trimestreSessionBean=new TrimestreSessionBean();
		
		if(this.trimestreSessionBean==null) {
			this.trimestreSessionBean=new TrimestreSessionBean();
		}
		
		this.trimestreSessionBean.setsUltimaBusquedaTrimestre(this.getsAccionBusqueda());
		this.trimestreSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.trimestreSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TrimestreSessionBean trimestreSessionBean=new TrimestreSessionBean();
		
		if(this.trimestreSessionBean==null) {
			this.trimestreSessionBean=new TrimestreSessionBean();
		}
		
		if(this.trimestreSessionBean.getsUltimaBusquedaTrimestre()!=null&&!this.trimestreSessionBean.getsUltimaBusquedaTrimestre().equals("")) {
			this.setsAccionBusqueda(trimestreSessionBean.getsUltimaBusquedaTrimestre());
			this.setiNumeroPaginacion(trimestreSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(trimestreSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.trimestreSessionBean.setsUltimaBusquedaTrimestre("");
		this.trimestreSessionBean.setiNumeroPaginacion(TrimestreConstantesFunciones.INUMEROPAGINACION);
		this.trimestreSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTrimestre(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTrimestre() {
		this.updateBorderResaltarBusquedasFormularioTrimestre();
		this.updateVisibilidadBusquedasFormularioTrimestre();
		this.updateHabilitarBusquedasFormularioTrimestre();
	}
	
	public void updateBorderResaltarBusquedasFormularioTrimestre() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTrimestre() {
	}
	
	public void updateHabilitarBusquedasFormularioTrimestre() {
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
	
	public void updateControlesFormularioTrimestre() throws Exception {

		if(this.jInternalFrameDetalleFormTrimestre==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTrimestre();
		this.updateVisibilidadResaltarControlesFormularioTrimestre();
		this.updateHabilitarResaltarControlesFormularioTrimestre();
		
	}
	
	public void updateBorderResaltarControlesFormularioTrimestre() throws Exception {
		if(this.jInternalFrameDetalleFormTrimestre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.trimestreConstantesFunciones.resaltaridTrimestre!=null && this.jInternalFrameDetalleFormTrimestre!=null) {this.jInternalFrameDetalleFormTrimestre.jTextFieldidTrimestre.setBorder(this.trimestreConstantesFunciones.resaltaridTrimestre);}
		if(this.trimestreConstantesFunciones.resaltarnombreTrimestre!=null && this.jInternalFrameDetalleFormTrimestre!=null) {this.jInternalFrameDetalleFormTrimestre.jTextFieldnombreTrimestre.setBorder(this.trimestreConstantesFunciones.resaltarnombreTrimestre);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTrimestre() throws Exception {		
		if(this.jInternalFrameDetalleFormTrimestre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) {
	
		//this.jInternalFrameDetalleFormTrimestre.jTextFieldidTrimestre.setVisible(this.trimestreConstantesFunciones.mostraridTrimestre);
		this.jInternalFrameDetalleFormTrimestre.jPanelidTrimestre.setVisible(this.trimestreConstantesFunciones.mostraridTrimestre);
		//this.jInternalFrameDetalleFormTrimestre.jTextFieldnombreTrimestre.setVisible(this.trimestreConstantesFunciones.mostrarnombreTrimestre);
		this.jInternalFrameDetalleFormTrimestre.jPanelnombreTrimestre.setVisible(this.trimestreConstantesFunciones.mostrarnombreTrimestre);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTrimestre() throws Exception {
		if(this.jInternalFrameDetalleFormTrimestre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTrimestre!=null) {
	
		this.jInternalFrameDetalleFormTrimestre.jTextFieldidTrimestre.setEnabled(this.trimestreConstantesFunciones.activaridTrimestre);
		this.jInternalFrameDetalleFormTrimestre.jTextFieldnombreTrimestre.setEnabled(this.trimestreConstantesFunciones.activarnombreTrimestre);
		}
	}
	
		
}