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

import com.bydan.erp.seguridad.util.ContinenteConstantesFunciones;
import com.bydan.erp.seguridad.util.ContinenteParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.ContinenteParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.ContinenteBean;
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
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ContinenteBeanSwingJInternalFrame extends ContinenteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ContinenteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Continente> continenteValidator = new ClassValidator<Continente>(Continente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Continente continente;	
	public Continente continenteAux;
	public Continente continenteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Continente continenteTotales;
	public Long idContinenteActual;
	public Long iIdNuevoContinente=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosPais=false;

	public Boolean getIsTienePermisosPais() {
		return isTienePermisosPais;
	}

	public void setIsTienePermisosPais(Boolean isTienePermisosPais) {
		this.isTienePermisosPais= isTienePermisosPais;
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
	
	public Boolean isPermisoTodoContinente;
	public Boolean isPermisoNuevoContinente;
	public Boolean isPermisoActualizarContinente;
	public Boolean isPermisoActualizarOriginalContinente;
	public Boolean isPermisoEliminarContinente;
	public Boolean isPermisoGuardarCambiosContinente;
	public Boolean isPermisoConsultaContinente;
	public Boolean isPermisoBusquedaContinente;
	public Boolean isPermisoReporteContinente;
	public Boolean isPermisoPaginacionMedioContinente;
	public Boolean isPermisoPaginacionAltoContinente;
	public Boolean isPermisoPaginacionTodoContinente;
	public Boolean isPermisoCopiarContinente;
	public Boolean isPermisoVerFormContinente;
	public Boolean isPermisoDuplicarContinente;
	public Boolean isPermisoOrdenContinente;
	
	
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
	
	public ContinenteParameterReturnGeneral continenteReturnGeneral;
	public ContinenteParameterReturnGeneral continenteParameterGeneral;
	
	

	public PaisLogic paisLogic=null;

	public PaisLogic getPaisLogic() {
		return paisLogic;
	}

	public void setPaisLogic(PaisLogic paisLogic) {
		this.paisLogic = paisLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoContinente=false;
	public Boolean esParaAccionDesdeFormularioContinente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ContinenteSessionBeanAdditional continenteSessionBeanAdditional=null;
	
	public ContinenteSessionBeanAdditional getContinenteSessionBeanAdditional() {
		return this.continenteSessionBeanAdditional;
	}
	
	public void setContinenteSessionBeanAdditional(ContinenteSessionBeanAdditional continenteSessionBeanAdditional) {
		try {
			this.continenteSessionBeanAdditional=continenteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ContinenteBeanSwingJInternalFrameAdditional continenteBeanSwingJInternalFrameAdditional=null;
	//public class ContinenteBeanSwingJInternalFrame
	
	public ContinenteBeanSwingJInternalFrameAdditional getContinenteBeanSwingJInternalFrameAdditional() {
		return this.continenteBeanSwingJInternalFrameAdditional;
	}
	
	public void setContinenteBeanSwingJInternalFrameAdditional(ContinenteBeanSwingJInternalFrameAdditional continenteBeanSwingJInternalFrameAdditional) {
		try {
			this.continenteBeanSwingJInternalFrameAdditional=continenteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ContinenteLogic continenteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Continente continenteBean;
	public ContinenteConstantesFunciones continenteConstantesFunciones;
	//public ContinenteParameterReturnGeneral continenteReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Continente> continentes;	
	//public List<Continente> continentesEliminados;
	//public List<Continente> continentesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoContinente=false;
	public Boolean isVisibilidadCeldaDuplicarContinente=true;
	public Boolean isVisibilidadCeldaCopiarContinente=true;
	public Boolean isVisibilidadCeldaVerFormContinente=true;
	public Boolean isVisibilidadCeldaOrdenContinente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesContinente=false;
	public Boolean isVisibilidadCeldaModificarContinente=false;
	public Boolean isVisibilidadCeldaActualizarContinente=false;
	public Boolean isVisibilidadCeldaEliminarContinente=false;
	public Boolean isVisibilidadCeldaCancelarContinente=false;
	public Boolean isVisibilidadCeldaGuardarContinente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosContinente=false;	
	
	
	
	public Long getiIdNuevoContinente() {
		return this.iIdNuevoContinente;
	}

	public void setiIdNuevoContinente(Long iIdNuevoContinente) {
		this.iIdNuevoContinente = iIdNuevoContinente;
	}
	
	public Long getidContinenteActual() {
		return this.idContinenteActual;
	}

	public void setidContinenteActual(Long idContinenteActual) {
		this.idContinenteActual = idContinenteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Continente getcontinente() {
		return this.continente;
	}

	public void setcontinente(Continente continente) {
		this.continente = continente;
	}
	
	public Continente getcontinenteAux() {
		return this.continenteAux;
	}

	public void setcontinenteAux(Continente continenteAux) {
		this.continenteAux = continenteAux;
	}				
	
	public Continente getcontinenteAnterior() {
		return this.continenteAnterior;
	}

	public void setcontinenteAnterior(Continente continenteAnterior) {
		this.continenteAnterior = continenteAnterior;
	}	
	
	public Continente getcontinenteTotales() {
		return this.continenteTotales;
	}

	public void setcontinenteTotales(Continente continenteTotales) {
		this.continenteTotales = continenteTotales;
	}	
	
	public Continente getcontinenteBean() {
		return this.continenteBean;
	}

	public void setcontinenteBean(Continente continenteBean) {
		this.continenteBean = continenteBean;
	}	
	
	public ContinenteParameterReturnGeneral getcontinenteReturnGeneral() {
		return this.continenteReturnGeneral;
	}

	public void setcontinenteReturnGeneral(ContinenteParameterReturnGeneral continenteReturnGeneral) {
		this.continenteReturnGeneral = continenteReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ContinenteLogic getContinenteLogic()	{		
		return continenteLogic;
	}

	public void setContinenteLogic(ContinenteLogic continenteLogic) {
		this.continenteLogic = continenteLogic;
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
	
	public Boolean getIsEsNuevoContinente() {
		return isEsNuevoContinente;
	}

	public void setIsEsNuevoContinente(Boolean isEsNuevoContinente) {
		this.isEsNuevoContinente = isEsNuevoContinente;
	}

	public Boolean getEsParaAccionDesdeFormularioContinente() {
		return esParaAccionDesdeFormularioContinente;
	}
	
	public void setEsParaAccionDesdeFormularioContinente(Boolean esParaAccionDesdeFormularioContinente) {
		this.esParaAccionDesdeFormularioContinente = esParaAccionDesdeFormularioContinente;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesContinente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ContinenteConstantesFunciones.refrescarForeignKeysDescripcionesContinente(this.continenteLogic.getContinentes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ContinenteConstantesFunciones.refrescarForeignKeysDescripcionesContinente(this.continentes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//continenteLogic.setContinentes(this.continentes);
			continenteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ContinenteParameterReturnGeneral getContinenteParameterGeneral() {
		return this.continenteParameterGeneral;
	}
	
	public void setContinenteParameterGeneral(ContinenteParameterReturnGeneral continenteParameterGeneral) {
		this.continenteParameterGeneral = continenteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoContinente() {
		return isPermisoTodoContinente;
	}

	public void setIsPermisoTodoContinente(Boolean isPermisoTodoContinente) {
		this.isPermisoTodoContinente = isPermisoTodoContinente;
	}

	public Boolean getIsPermisoNuevoContinente() {
		return isPermisoNuevoContinente;
	}

	public void setIsPermisoNuevoContinente(Boolean isPermisoNuevoContinente) {
		this.isPermisoNuevoContinente = isPermisoNuevoContinente;
	}

	public Boolean getIsPermisoActualizarContinente() {
		return isPermisoActualizarContinente;
	}

	public void setIsPermisoActualizarContinente(Boolean isPermisoActualizarContinente) {
		this.isPermisoActualizarContinente = isPermisoActualizarContinente;
	}

	public Boolean getIsPermisoEliminarContinente() {
		return isPermisoEliminarContinente;
	}

	public void setIsPermisoEliminarContinente(Boolean isPermisoEliminarContinente) {
		this.isPermisoEliminarContinente = isPermisoEliminarContinente;
	}

	public Boolean getIsPermisoGuardarCambiosContinente() {
		return isPermisoGuardarCambiosContinente;
	}

	public void setIsPermisoGuardarCambiosContinente(Boolean isPermisoGuardarCambiosContinente) {
		this.isPermisoGuardarCambiosContinente = isPermisoGuardarCambiosContinente;
	}
	
	public Boolean getIsPermisoConsultaContinente() {
		return isPermisoConsultaContinente;
	}

	public void setIsPermisoConsultaContinente(Boolean isPermisoConsultaContinente) {
		this.isPermisoConsultaContinente = isPermisoConsultaContinente;
	}

	public Boolean getIsPermisoBusquedaContinente() {
		return isPermisoBusquedaContinente;
	}

	public void setIsPermisoBusquedaContinente(Boolean isPermisoBusquedaContinente) {
		this.isPermisoBusquedaContinente = isPermisoBusquedaContinente;
	}

	public Boolean getIsPermisoReporteContinente() {
		return isPermisoReporteContinente;
	}

	public void setIsPermisoReporteContinente(Boolean isPermisoReporteContinente) {
		this.isPermisoReporteContinente = isPermisoReporteContinente;
	}
	
	public Boolean getIsPermisoPaginacionMedioContinente() {
		return isPermisoPaginacionMedioContinente;
	}

	public void setIsPermisoPaginacionMedioContinente(Boolean isPermisoPaginacionMedioContinente) {
		this.isPermisoPaginacionMedioContinente = isPermisoPaginacionMedioContinente;
	}
	
	public Boolean getIsPermisoPaginacionTodoContinente() {
		return isPermisoPaginacionTodoContinente;
	}

	public void setIsPermisoPaginacionTodoContinente(Boolean isPermisoPaginacionTodoContinente) {
		this.isPermisoPaginacionTodoContinente = isPermisoPaginacionTodoContinente;
	}
	
	public Boolean getIsPermisoPaginacionAltoContinente() {
		return isPermisoPaginacionAltoContinente;
	}

	public void setIsPermisoPaginacionAltoContinente(Boolean isPermisoPaginacionAltoContinente) {
		this.isPermisoPaginacionAltoContinente = isPermisoPaginacionAltoContinente;
	}
	
	public Boolean getIsPermisoCopiarContinente() {
		return isPermisoCopiarContinente;
	}

	public void setIsPermisoCopiarContinente(Boolean isPermisoCopiarContinente) {
		this.isPermisoCopiarContinente = isPermisoCopiarContinente;
	}
	
	public Boolean getIsPermisoVerFormContinente() {
		return isPermisoVerFormContinente;
	}

	public void setIsPermisoVerFormContinente(Boolean isPermisoVerFormContinente) {
		this.isPermisoVerFormContinente = isPermisoVerFormContinente;
	}
	
	public Boolean getIsPermisoDuplicarContinente() {
		return isPermisoDuplicarContinente;
	}

	public void setIsPermisoDuplicarContinente(Boolean isPermisoDuplicarContinente) {
		this.isPermisoDuplicarContinente = isPermisoDuplicarContinente;
	}
	
	public Boolean getIsPermisoOrdenContinente() {
		return isPermisoOrdenContinente;
	}

	public void setIsPermisoOrdenContinente(Boolean isPermisoOrdenContinente) {
		this.isPermisoOrdenContinente = isPermisoOrdenContinente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoContinente() {
		return isVisibilidadCeldaNuevoContinente;
	}

	public void setIsVisibilidadCeldaNuevoContinente(Boolean isVisibilidadCeldaNuevoContinente) {
		this.isVisibilidadCeldaNuevoContinente = isVisibilidadCeldaNuevoContinente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarContinente() {
		return isVisibilidadCeldaDuplicarContinente;
	}

	public void setIsVisibilidadCeldaDuplicarContinente(Boolean isVisibilidadCeldaDuplicarContinente) {
		this.isVisibilidadCeldaDuplicarContinente = isVisibilidadCeldaDuplicarContinente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarContinente() {
		return isVisibilidadCeldaCopiarContinente;
	}

	public void setIsVisibilidadCeldaCopiarContinente(Boolean isVisibilidadCeldaCopiarContinente) {
		this.isVisibilidadCeldaCopiarContinente = isVisibilidadCeldaCopiarContinente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormContinente() {
		return isVisibilidadCeldaVerFormContinente;
	}

	public void setIsVisibilidadCeldaVerFormContinente(Boolean isVisibilidadCeldaVerFormContinente) {
		this.isVisibilidadCeldaVerFormContinente = isVisibilidadCeldaVerFormContinente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenContinente() {
		return isVisibilidadCeldaOrdenContinente;
	}

	public void setIsVisibilidadCeldaOrdenContinente(Boolean isVisibilidadCeldaOrdenContinente) {
		this.isVisibilidadCeldaOrdenContinente = isVisibilidadCeldaOrdenContinente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesContinente() {
		return isVisibilidadCeldaNuevoRelacionesContinente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesContinente(Boolean isVisibilidadCeldaNuevoRelacionesContinente) {
		this.isVisibilidadCeldaNuevoRelacionesContinente = isVisibilidadCeldaNuevoRelacionesContinente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarContinente() {
		return isVisibilidadCeldaModificarContinente;
	}

	public void setIsVisibilidadCeldaModificarContinente(Boolean isVisibilidadCeldaModificarContinente) {
		this.isVisibilidadCeldaModificarContinente = isVisibilidadCeldaModificarContinente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarContinente() {
		return isVisibilidadCeldaActualizarContinente;
	}

	public void setIsVisibilidadCeldaActualizarContinente(Boolean isVisibilidadCeldaActualizarContinente) {
		this.isVisibilidadCeldaActualizarContinente = isVisibilidadCeldaActualizarContinente;
	}

	public Boolean getIsVisibilidadCeldaEliminarContinente() {
		return isVisibilidadCeldaEliminarContinente;
	}

	public void setIsVisibilidadCeldaEliminarContinente(Boolean isVisibilidadCeldaEliminarContinente) {
		this.isVisibilidadCeldaEliminarContinente = isVisibilidadCeldaEliminarContinente;
	}

	public Boolean getIsVisibilidadCeldaCancelarContinente() {
		return isVisibilidadCeldaCancelarContinente;
	}

	public void setIsVisibilidadCeldaCancelarContinente(Boolean isVisibilidadCeldaCancelarContinente) {
		this.isVisibilidadCeldaCancelarContinente = isVisibilidadCeldaCancelarContinente;
	}

	public Boolean getIsVisibilidadCeldaGuardarContinente() {
		return isVisibilidadCeldaGuardarContinente;
	}

	public void setIsVisibilidadCeldaGuardarContinente(Boolean isVisibilidadCeldaGuardarContinente) {
		this.isVisibilidadCeldaGuardarContinente = isVisibilidadCeldaGuardarContinente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosContinente() {
		return isVisibilidadCeldaGuardarCambiosContinente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosContinente(Boolean isVisibilidadCeldaGuardarCambiosContinente) {
		this.isVisibilidadCeldaGuardarCambiosContinente = isVisibilidadCeldaGuardarCambiosContinente;
	}
		
	public ContinenteSessionBean getcontinenteSessionBean() {
		return this.continenteSessionBean;
	}
	
	public void setcontinenteSessionBean(ContinenteSessionBean continenteSessionBean) {
		this.continenteSessionBean=continenteSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysContinente(Continente continente)throws Exception {
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
	
	public void bugActualizarReferenciaActual(Continente continente,Continente continenteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalContinente(continente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		continenteAux.setId(continente.getId());
		continenteAux.setVersionRow(continente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessContinente();
		
			int intSelectedRow = this.jTableDatosContinente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continente =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.continente =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ContinenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualContinente(this.continente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysContinente(this.continente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = continenteValidator.getInvalidValues(this.continente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			continenteLogic.setDatosCliente(datosCliente);
			continenteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				continenteAux=new  Continente();
				
				continenteAux.setIsNew(true);
				continenteAux.setIsChanged(true);
				
				continenteAux.setContinenteOriginal(this.continente);
				
				continenteAux.setId(this.continente.getId());	
				continenteAux.setVersionRow(this.continente.getVersionRow());	
				continenteAux.setcodigo(this.continente.getcodigo());	
				continenteAux.setnombre(this.continente.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.continenteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.continenteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(continenteAux,continenteLogic.getContinentes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(continenteAux,continentes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.continenteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.continenteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						continenteLogic.saveContinentes();//WithConnection
						//continenteLogic.getSetVersionRowContinentes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.continente,continenteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.continenteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisLogic.getPaiss().addAll(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paissEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paiss.addAll(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paissEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								continenteLogic.saveContinenteRelaciones(continenteAux,this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisLogic.getPaiss());//WithConnection
								//continenteLogic.getSetVersionRowContinentes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.continente,continenteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisLogic.setPaiss(new ArrayList<Pais>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paiss= new ArrayList<Pais>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.quitarFilaTotales();}
							continenteAux.setPaiss(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisLogic.getPaiss());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.continenteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.continenteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(continenteAux,continenteLogic.getContinentes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(continenteAux,continentes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.continente,continenteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				continenteAux=new  Continente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.continenteSessionBean.getEsGuardarRelacionado() 
					|| (this.continenteSessionBean.getEsGuardarRelacionado() && this.continente.getId()>=0)) {
						
					continenteAux.setIsNew(false);
				}
				
				continenteAux.setIsDeleted(false);
			
				continenteAux.setId(this.continente.getId());	
				continenteAux.setVersionRow(this.continente.getVersionRow());	
				continenteAux.setcodigo(this.continente.getcodigo());	
				continenteAux.setnombre(this.continente.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(continenteAux,continenteLogic.getContinentes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(continenteAux,continentes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.continenteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.continenteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						continenteLogic.saveContinentes();//WithConnection
						//continenteLogic.getSetVersionRowContinentes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.continente,continenteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.continenteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisLogic.getPaiss().addAll(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paissEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paiss.addAll(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paissEliminados);
						}
						//ARCHITECTURE
						
						if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								continenteLogic.saveContinenteRelaciones(continenteAux,this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisLogic.getPaiss());//WithConnection
								//continenteLogic.getSetVersionRowContinentes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.continente,continenteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisLogic.setPaiss(new ArrayList<Pais>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paiss= new ArrayList<Pais>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.quitarFilaTotales();}
							continenteAux.setPaiss(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisLogic.getPaiss());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.continenteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.continenteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(continenteAux,continenteLogic.getContinentes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(continenteAux,continentes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.continente,continenteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				continenteAux=new  Continente();
				
				continenteAux.setIsNew(false);
				continenteAux.setIsChanged(false);
				
				continenteAux.setIsDeleted(true);
				
				continenteAux.setId(this.continente.getId());	
				continenteAux.setVersionRow(this.continente.getVersionRow());	
				continenteAux.setcodigo(this.continente.getcodigo());	
				continenteAux.setnombre(this.continente.getnombre());	
				
				if(this.continenteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.continenteAux.getId()>=0) {	
						this.continentesEliminados.add(continenteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(continenteAux,continenteLogic.getContinentes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(continenteAux,continentes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.continenteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.continenteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						continenteLogic.saveContinentes();//WithConnection
						//continenteLogic.getSetVersionRowContinentes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.continenteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisLogic.getPaiss().addAll(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paissEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paiss.addAll(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paissEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								continenteLogic.saveContinenteRelaciones(continenteAux,this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisLogic.getPaiss());//WithConnection
								//continenteLogic.getSetVersionRowContinentes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisLogic.setPaiss(new ArrayList<Pais>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paiss= new ArrayList<Pais>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.quitarFilaTotales();}
							continenteAux.setPaiss(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisLogic.getPaiss());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.continenteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.continenteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(continenteAux,continenteLogic.getContinentes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(continenteAux,continentes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.getContinentes().addAll(this.continentesEliminados);
					
					continenteLogic.saveContinentes();//WithConnection
					//continenteLogic.getSetVersionRowContinentes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.continentesEliminados= new ArrayList<Continente>();		
			}
			
			if(this.continenteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.continenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Continente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Continente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.continente=continenteAux;
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
      		//this.finishProcessContinente();
      	}
		
	}	
	
	public void actualizarRelaciones(Continente continenteLocal) throws Exception {
		
		if(this.continenteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				continenteLocal.setPaiss(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisLogic.getPaiss());
			
			} else {
			
				continenteLocal.setPaiss(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paiss);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Continente continenteLocal) throws Exception {	
		if(this.continenteSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarContinenteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosContinente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.continente =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.continente =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = continenteValidator.getInvalidValues(this.continente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Continente continente,List<Continente> continentes) throws Exception {
		try	{		
			ContinenteConstantesFunciones.actualizarLista(continente,continentes,this.continenteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Continente continente,List<Continente> continentes) throws Exception {
		try	{			
			ContinenteConstantesFunciones.actualizarSelectedLista(continente,continentes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Continente> continentesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				continentesLocal=this.continenteLogic.getContinentes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				continentesLocal=this.continentes;
			}
			//ARCHITECTURE
		
			for(Continente continenteLocal:continentesLocal) {
				if(this.permiteMantenimiento(continenteLocal) && continenteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ContinenteConstantesFunciones.getContinenteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ContinenteConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContinente.jLabelcodigoContinente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ContinenteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContinente.jLabelnombreContinente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormContinente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContinente.jLabelcodigoContinente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContinente.jLabelnombreContinente,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Pais")) {
			if(this.continente==null) {
				this.continente= new Continente();
			}

			if(this.continenteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoContinente
				this.setVariablesFormularioToObjetoActualContinente(this.continente,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysContinente(this.continente);

				this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.getpais().setContinente(this.continente);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoContinente--;	
		
		
		this.continenteAux=new Continente();
		
		this.continenteAux.setId(this.iIdNuevoContinente);
		this.continenteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.continenteLogic.getContinentes().add(this.continenteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.continentes.add(this.continenteAux);
		}
		//ARCHITECTURE
		
		this.continente=this.continenteAux;
		
		if(ContinenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioContinente(this.continente);
			this.setVariablesObjetoActualToFormularioForeignKeyContinente(this.continente);
		}
				
		//this.setDefaultControlesContinente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyContinente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyContinente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyContinente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualContinente(this.continenteBean,this.continente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysContinente(this.continente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ContinenteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.continenteSessionBean.getConGuardarRelaciones()) {
			classes=ContinenteConstantesFunciones.getClassesRelationshipsOfContinente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.continenteReturnGeneral=continenteLogic.procesarEventosContinentesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.continenteLogic.getContinentes(),this.continente,this.continenteParameterGeneral,this.isEsNuevoContinente,classes);//this.continenteLogic.getContinente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanContinente(this.continenteReturnGeneral,this.continenteBean,false);
		
		if(this.continenteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyContinente(this.continenteReturnGeneral.getContinente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioContinente(this.continenteReturnGeneral.getContinente());
		}
		
		if(this.continenteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioContinente(this.continenteReturnGeneral.getContinente(),classes);//this.continenteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualContinente(this.continente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyContinente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyContinente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ContinenteBeanSwingJInternalFrameAdditional.RecargarFormContinente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingContinente(false);
						
			if(continenteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisSessionBean.getEsGuardarRelacionado() && PaisJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPaisActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ContinenteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualContinente();
			}
			
			this.actualizarVisualTableDatosContinente();
			
			this.jTableDatosContinente.setRowSelectionInterval(this.getIndiceNuevoContinente(), this.getIndiceNuevoContinente());
			
			this.seleccionarFilaTablaContinenteActual();
						
			this.actualizarEstadoCeldasBotonesContinente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesContinente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormContinente.jTextFieldcodigoContinente.setEnabled(isHabilitar && this.continenteConstantesFunciones.activarcodigoContinente);
		this.jInternalFrameDetalleFormContinente.jTextFieldnombreContinente.setEnabled(isHabilitar && this.continenteConstantesFunciones.activarnombreContinente);	
		
	};
	
	public void setDefaultControlesContinente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoContinente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.continenteSessionBean.setConGuardarRelaciones(true);			
			this.continenteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormContinente.jTabbedPaneRelacionesContinente.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.continenteSessionBean.setConGuardarRelaciones(false);			
			this.continenteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormContinente.jTabbedPaneRelacionesContinente.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoContinente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Continente continenteAux:this.continenteLogic.getContinentes()) {
				if(continenteAux.getId().equals(this.iIdNuevoContinente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Continente continenteAux:this.continentes) {
				if(continenteAux.getId().equals(this.iIdNuevoContinente)) {
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
	
	public int getIndiceActualContinente(Continente continente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Continente continenteAux:this.continenteLogic.getContinentes()) {
				if(continenteAux.getId().equals(continente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Continente continenteAux:this.continentes) {
				if(continenteAux.getId().equals(continente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalContinente(Continente continenteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Continente continenteAux:this.continenteLogic.getContinentes()) {
				if(continenteAux.getContinenteOriginal().getId().equals(continenteOriginal.getId())) {
					existe=true;
					continenteOriginal.setId(continenteAux.getId());
					continenteOriginal.setVersionRow(continenteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Continente continenteAux:this.continentes) {
				if(continenteAux.getContinenteOriginal().getId().equals(continenteOriginal.getId())) {
					existe=true;
					continenteOriginal.setId(continenteAux.getId());
					continenteOriginal.setVersionRow(continenteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosContinente(Boolean esParaCancelar) throws Exception {
		continentesAux=new ArrayList<Continente>();
		continenteAux=new Continente();
		
		if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Continente continenteAux:this.continenteLogic.getContinentes()) {
					if(continenteAux.getId()<0) {
						continentesAux.add(continenteAux);
					}		
				}
				this.iIdNuevoContinente=0L;
				this.continenteLogic.getContinentes().removeAll(continentesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Continente continenteAux:this.continentes) {
					if(continenteAux.getId()<0) {
						continentesAux.add(continenteAux);
					}		
				}
				this.iIdNuevoContinente=0L;
				this.continentes.removeAll(continentesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoContinente 
					&& this.continenteLogic.getContinentes().size()>0
					) {
					continenteAux=this.continenteLogic.getContinentes().get(this.continenteLogic.getContinentes().size() - 1);
				
					if(continenteAux.getId()<0) {
						this.continenteLogic.getContinentes().remove(continenteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoContinente && this.continentes.size()>0) {
					continenteAux=this.continentes.get(this.continentes.size() - 1);
				
					if(continenteAux.getId()<0) {
						this.continentes.remove(continenteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoContinente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(continente.getId()<0) {
				this.continenteLogic.getContinentes().remove(this.continente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(continente.getId()<0) {
				this.continentes.remove(this.continente);
			}
		}			
	}
	
	public void setEstadosInicialesContinente(List<Continente> continentesAux) throws Exception {
		ContinenteConstantesFunciones.setEstadosInicialesContinente(continentesAux);
	}
	
	public void setEstadosInicialesContinente(Continente continenteAux) throws Exception {
		ContinenteConstantesFunciones.setEstadosInicialesContinente(continenteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarContinenteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesContinente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarContinenteActual()) {
				if(!this.isEsNuevoContinente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesContinente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoContinente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarContinenteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Continente ?", "MANTENIMIENTO DE Continente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesContinente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Continente continente) throws Exception {
		ContinenteConstantesFunciones.seleccionarAsignar(this.continente,continente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarContinente=this.isPermisoActualizarOriginalContinente;
			
			
			this.seleccionarAsignar(continente);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ContinenteConstantesFunciones.quitarEspaciosContinente(this.continente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesContinente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.continenteSessionBean.setsFuncionBusquedaRapida(this.continenteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoContinente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosContinente(esParaCancelar);				
				this.cancelarNuevoContinente(esParaCancelar);								
			}
			
			this.continente=new Continente();
			
			this.inicializarContinente();
			
			this.actualizarEstadoCeldasBotonesContinente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarContinente() throws Exception {
		try {
			ContinenteConstantesFunciones.inicializarContinente(this.continente);
			
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
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.continenteLogic.getContinentes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteContinentes(String sAccionBusqueda,List<Continente> continentesParaReportes) throws Exception {
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
					sPathReporteFinal="Continente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ContinenteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ContinenteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Continente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Continentes");		
		parameters.put("busquedapor", ContinenteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Pais.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ContinenteLogic continenteLogicAuxiliar=new ContinenteLogic();
					continenteLogicAuxiliar.setDatosCliente(continenteLogic.getDatosCliente());				
					continenteLogicAuxiliar.setContinentes(continentesParaReportes);
					
					continenteLogicAuxiliar.cargarRelacionesLoteForeignKeyContinenteWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					continentesParaReportes=continenteLogicAuxiliar.getContinentes();
					
					//continenteLogic.getNewConnexionToDeep();
					
					//for (Continente continente:continentesParaReportes) {
					//	continenteLogic.deepLoad(continente, false, DeepLoadType.INCLUDE, classes);
					//}						
					//continenteLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//continenteLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePais = AuxiliarReportes.class.getResourceAsStream("PaisDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pais", reportFilePais);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceContinente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ContinenteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ContinenteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceContinente=new JRBeanArrayDataSource(ContinenteJInternalFrame.TraerContinenteBeans(continentesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceContinente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ContinenteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ContinenteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ContinenteBean.TraerContinenteBeans(continentesParaReportes).toArray()));
							
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
				this.generarExcelReporteContinentes(sAccionBusqueda,sTipoArchivoReporte,continentesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalContinentes(sAccionBusqueda,sTipoArchivoReporte,continentesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoContinenteActionPerformed(null);
					//this.generarExcelReporteContinentes(sAccionBusqueda,sTipoArchivoReporte,continentesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalContinentes(sAccionBusqueda,sTipoArchivoReporte,continentesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesContinentes(sAccionBusqueda,sTipoArchivoReporte,continentesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesContinentes(sAccionBusqueda,sTipoArchivoReporte,continentesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteContinentes(String sAccionBusqueda,String sTipoArchivoReporte,List<Continente> continentesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"continente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Continentes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderContinente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Continente continente : continentesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ContinenteConstantesFunciones.generarExcelReporteDataContinente("NORMAL",row,workbook,continente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.continenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Continente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderContinente(String sTipo,Row row,Workbook workbook) {
		
		ContinenteConstantesFunciones.generarExcelReporteHeaderContinente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalContinentes(String sAccionBusqueda,String sTipoArchivoReporte,List<Continente> continentesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"continente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Continentes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Continente continente : continentesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ContinenteConstantesFunciones.getContinenteDescripcion(continente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContinenteConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContinenteConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(continente.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContinenteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContinenteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(continente.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.continenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Continente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesContinentes(String sAccionBusqueda,String sTipoArchivoReporte,List<Continente> continentesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Continente> continentesRespaldo=null;
		
		classes=ContinenteConstantesFunciones.getClassesRelationshipsOfContinente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.continenteLogic.setDatosCliente(this.datosCliente);
		this.continenteLogic.setDatosDeep(this.datosDeep);
		this.continenteLogic.setIsConDeep(true);
		
		continentesRespaldo=this.continenteLogic.getContinentes();
		
		this.continenteLogic.setContinentes(continentesParaReportes);	
		this.continenteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		continentesParaReportes=this.continenteLogic.getContinentes();
		this.continenteLogic.setContinentes(continentesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"continente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Continentes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderContinente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Continente continente : continentesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderContinente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ContinenteConstantesFunciones.generarExcelReporteDataContinente("NORMAL",row,workbook,continente,cellStyleDataAux);
		
			
			


				//Pais
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PaisConstantesFunciones.SCLASSWEBTITULO))) {

				if(continente.getPaiss()!=null && continente.getPaiss().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PaisConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PaisConstantesFunciones.generarExcelReporteHeaderPais("RELACIONADO",row,workbook);
				}

				if(continente.getPaiss()!=null) {
					i2=0;
					for(Pais pais : continente.getPaiss()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PaisConstantesFunciones.generarExcelReporteDataPais("RELACIONADO",row,workbook,pais,cellStyleDataAuxHijo);
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
		cell.setCellValue(ContinenteConstantesFunciones.getContinenteDescripcion(continente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.continenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Continente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoContinente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoContinente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoContinente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoContinente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessContinente() throws Exception {		
		this.startProcessContinente(true);
	}
	
	public void startProcessContinente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesContinente, this.jScrollPanelDatosContinente,this.jPanelPaginacionContinente, this.jScrollPanelDatosEdicionContinente, this.jPanelAccionesContinente,this.jPanelAccionesFormularioContinente,this.jmenuBarContinente,this.jmenuBarDetalleContinente,this.jTtoolBarContinente,this.jTtoolBarDetalleContinente);		
		
		final JTabbedPane jTabbedPaneBusquedasContinente=null; 
		
		final JPanel jPanelParametrosReportesContinente=this.jPanelParametrosReportesContinente;
		//final JScrollPane jScrollPanelDatosContinente=this.jScrollPanelDatosContinente;
		final JTable jTableDatosContinente=this.jTableDatosContinente;		
		final JPanel jPanelPaginacionContinente=this.jPanelPaginacionContinente;
		//final JScrollPane jScrollPanelDatosEdicionContinente=this.jScrollPanelDatosEdicionContinente;
		final JPanel jPanelAccionesContinente=this.jPanelAccionesContinente;
		
		JPanel jPanelCamposAuxiliarContinente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarContinente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormContinente!=null) {
			jPanelCamposAuxiliarContinente=this.jInternalFrameDetalleFormContinente.jPanelCamposContinente;
			jPanelAccionesFormularioAuxiliarContinente=this.jInternalFrameDetalleFormContinente.jPanelAccionesFormularioContinente;
		}
		
		final JPanel jPanelCamposContinente=jPanelCamposAuxiliarContinente;
		final JPanel jPanelAccionesFormularioContinente=jPanelAccionesFormularioAuxiliarContinente;
		
		
		final JMenuBar jmenuBarContinente=this.jmenuBarContinente;
		final JToolBar jTtoolBarContinente=this.jTtoolBarContinente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarContinente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarContinente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormContinente!=null) {
			jmenuBarDetalleAuxiliarContinente=this.jInternalFrameDetalleFormContinente.jmenuBarDetalleContinente;
			jTtoolBarDetalleAuxiliarContinente=this.jInternalFrameDetalleFormContinente.jTtoolBarDetalleContinente;
		}
		
		final JMenuBar jmenuBarDetalleContinente=jmenuBarDetalleAuxiliarContinente;
		final JToolBar jTtoolBarDetalleContinente=jTtoolBarDetalleAuxiliarContinente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasContinente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesContinente;
			processRunnable.jTableDatos=jTableDatosContinente;
			processRunnable.jPanelCampos=jPanelCamposContinente;
			processRunnable.jPanelPaginacion=jPanelPaginacionContinente;
			processRunnable.jPanelAcciones=jPanelAccionesContinente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioContinente;
			
			
			processRunnable.jmenuBar=jmenuBarContinente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleContinente;
			processRunnable.jTtoolBar=jTtoolBarContinente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleContinente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasContinente ,jPanelParametrosReportesContinente,jTableDatosContinente, /*jScrollPanelDatosContinente,*/jPanelCamposContinente,jPanelPaginacionContinente, /*jScrollPanelDatosEdicionContinente,*/ jPanelAccionesContinente,jPanelAccionesFormularioContinente,jmenuBarContinente,jmenuBarDetalleContinente,jTtoolBarContinente,jTtoolBarDetalleContinente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesContinente, jScrollPanelDatosContinente,jPanelPaginacionContinente, jScrollPanelDatosEdicionContinente, jPanelAccionesContinente,jPanelAccionesFormularioContinente,jmenuBarContinente,jmenuBarDetalleContinente,jTtoolBarContinente,jTtoolBarDetalleContinente);
						
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
	
	public void finishProcessContinente() {// throws Exception 
		this.finishProcessContinente(true);
	}
	
	public void finishProcessContinente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesContinente, this.jScrollPanelDatosContinente,this.jPanelPaginacionContinente, this.jScrollPanelDatosEdicionContinente, this.jPanelAccionesContinente,this.jPanelAccionesFormularioContinente,this.jmenuBarContinente,this.jmenuBarDetalleContinente,this.jTtoolBarContinente,this.jTtoolBarDetalleContinente);		
		
		final JTabbedPane jTabbedPaneBusquedasContinente=null; 
		
		final JPanel jPanelParametrosReportesContinente=this.jPanelParametrosReportesContinente;
		//final JScrollPane jScrollPanelDatosContinente=this.jScrollPanelDatosContinente;
		final JTable jTableDatosContinente=this.jTableDatosContinente;		
		final JPanel jPanelPaginacionContinente=this.jPanelPaginacionContinente;
		//final JScrollPane jScrollPanelDatosEdicionContinente=this.jScrollPanelDatosEdicionContinente;
		final JPanel jPanelAccionesContinente=this.jPanelAccionesContinente;
		
		JPanel jPanelCamposAuxiliarContinente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarContinente=new JPanel();
		
		if(this.jInternalFrameDetalleFormContinente!=null) {
			jPanelCamposAuxiliarContinente=this.jInternalFrameDetalleFormContinente.jPanelCamposContinente;
			jPanelAccionesFormularioAuxiliarContinente=this.jInternalFrameDetalleFormContinente.jPanelAccionesFormularioContinente;
		}
		
		final JPanel jPanelCamposContinente=jPanelCamposAuxiliarContinente;
		final JPanel jPanelAccionesFormularioContinente=jPanelAccionesFormularioAuxiliarContinente;
		
		
		final JMenuBar jmenuBarContinente=this.jmenuBarContinente;		
		final JToolBar jTtoolBarContinente=this.jTtoolBarContinente;
				
		JMenuBar jmenuBarDetalleAuxiliarContinente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarContinente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormContinente!=null) {
			jmenuBarDetalleAuxiliarContinente=this.jInternalFrameDetalleFormContinente.jmenuBarDetalleContinente;
			jTtoolBarDetalleAuxiliarContinente=this.jInternalFrameDetalleFormContinente.jTtoolBarDetalleContinente;		
		}
		
		final JMenuBar jmenuBarDetalleContinente=jmenuBarDetalleAuxiliarContinente;
		final JToolBar jTtoolBarDetalleContinente=jTtoolBarDetalleAuxiliarContinente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasContinente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesContinente;
			processRunnable.jTableDatos=jTableDatosContinente;
			processRunnable.jPanelCampos=jPanelCamposContinente;
			processRunnable.jPanelPaginacion=jPanelPaginacionContinente;
			processRunnable.jPanelAcciones=jPanelAccionesContinente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioContinente;
			
			
			processRunnable.jmenuBar=jmenuBarContinente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleContinente;
			processRunnable.jTtoolBar=jTtoolBarContinente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleContinente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasContinente ,jPanelParametrosReportesContinente, jTableDatosContinente,/*jScrollPanelDatosContinente,*/jPanelCamposContinente,jPanelPaginacionContinente, /*jScrollPanelDatosEdicionContinente,*/ jPanelAccionesContinente,jPanelAccionesFormularioContinente,jmenuBarContinente,jmenuBarDetalleContinente,jTtoolBarContinente,jTtoolBarDetalleContinente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesContinente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarContinente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuContinente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarContinente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarContinente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleContinente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuContinente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarContinente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleContinente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.continenteConstantesFunciones.getsFinalQueryContinente();
		String  finalQueryPaginacionTodos=this.continenteConstantesFunciones.getsFinalQueryContinente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ContinenteConstantesFunciones.getArrayColumnasGlobalesNoContinente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ContinenteConstantesFunciones.getArrayColumnasGlobalesContinente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ContinenteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.continentesEliminados= new ArrayList<Continente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessContinente();
		
				///*ContinenteSessionBean*/this.continenteSessionBean=new ContinenteSessionBean();
			
			if(this.continenteSessionBean==null) {
				this.continenteSessionBean=new ContinenteSessionBean();
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
					this.iNumeroPaginacion=ContinenteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ContinenteConstantesFunciones.getClassesForeignKeysOfContinente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/continente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			continentesAux= new ArrayList<Continente>();
			
				
			continenteLogic.setDatosCliente(this.datosCliente);
			continenteLogic.setDatosDeep(this.datosDeep);
			continenteLogic.setIsConDeep(true);
			
			
			continenteLogic.getContinenteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					continenteLogic.getTodosContinentes(finalQueryGlobal,pagination);
					
					//continenteLogic.getTodosContinentesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(continenteLogic.getContinentes()==null|| continenteLogic.getContinentes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							continentesAux= new ArrayList<Continente>();
							continentesAux.addAll(continenteLogic.getContinentes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							continentesAux= new ArrayList<Continente>();
							continentesAux.addAll(continentes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							continenteLogic.getTodosContinentes(finalQueryGlobal+"",this.pagination);												
							
							//continenteLogic.getTodosContinentesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteContinentes("Todos",continenteLogic.getContinentes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							continenteLogic.setContinentes(new ArrayList<Continente>());					
							continenteLogic.getContinentes().addAll(continentesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							continentes=new ArrayList<Continente>();
							continentes.addAll(continentesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idContinente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idContinente=this.idActual;
				
				} else if(this.idContinenteActual!=null && this.idContinenteActual!=0L) {
					idContinente=idContinenteActual;
				}
				
					
				this.sDetalleReporte=ContinenteConstantesFunciones.getDetalleIndicePorId(idContinente);
				
				this.continentes=new ArrayList<Continente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					continenteLogic.getEntity(idContinente);
					
					//continenteLogic.getEntityWithConnection(idContinente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					continenteLogic.setContinentes(new ArrayList<Continente>());
					continenteLogic.getContinentes().add(continenteLogic.getContinente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.continentes=new ArrayList<Continente>();
					this.continentes.add(continente);
				}
				
				if(continenteLogic.getContinente()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesContinente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessContinente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=continenteLogic.getContinentes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=continentes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=continenteLogic.getContinentes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=continentes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Continente continente) {
		Boolean permite=true;
		
		if(this.continente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ContinenteConstantesFunciones.getOrderByListaContinente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ContinenteConstantesFunciones.getOrderByListaContinente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Continente continente:continenteLogic.getContinentes()) {
				if(continente.getsType().equals(Constantes2.S_TOTALES)) {
					continenteTotales=continente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Continente continente:this.continentes) {
				if(continente.getsType().equals(Constantes2.S_TOTALES)) {
					continenteTotales=continente;
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
			this.continenteAux=new Continente();
			this.continenteAux.setsType(Constantes2.S_TOTALES);
			this.continenteAux.setIsNew(false);
			this.continenteAux.setIsChanged(false);
			this.continenteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ContinenteConstantesFunciones.TotalizarValoresFilaContinente(this.continenteLogic.getContinentes(),this.continenteAux);
				
				this.continenteLogic.getContinentes().add(this.continenteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ContinenteConstantesFunciones.TotalizarValoresFilaContinente(this.continentes,this.continenteAux);
				
				this.continentes.add(this.continenteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		continenteTotales=new Continente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.continenteLogic.getContinentes().remove(continenteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.continentes.remove(continenteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		continenteTotales=new Continente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Continente continente:continenteLogic.getContinentes()) {
				if(continente.getsType().equals(Constantes2.S_TOTALES)) {
					continenteTotales=continente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ContinenteConstantesFunciones.TotalizarValoresFilaContinente(this.continenteLogic.getContinentes(),continenteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Continente continente:this.continentes) {
				if(continente.getsType().equals(Constantes2.S_TOTALES)) {
					continenteTotales=continente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ContinenteConstantesFunciones.TotalizarValoresFilaContinente(this.continentes,continenteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getContinentePorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getContinentePorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					continenteLogic.getContinentePorNombre(nombre);
				
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
	
	public void inicializarPermisosContinente() {
		this.isPermisoTodoContinente=false;
		this.isPermisoNuevoContinente=false;
		this.isPermisoActualizarContinente=false;
		this.isPermisoActualizarOriginalContinente=false;
		this.isPermisoEliminarContinente=false;
		this.isPermisoGuardarCambiosContinente=false;
		this.isPermisoConsultaContinente=false;
		this.isPermisoBusquedaContinente=false;
		this.isPermisoReporteContinente=false;		
		this.isPermisoOrdenContinente=false;		
		this.isPermisoPaginacionMedioContinente=false;		
		this.isPermisoPaginacionAltoContinente=false;
		this.isPermisoPaginacionTodoContinente=false;
		this.isPermisoCopiarContinente=false;		
		this.isPermisoVerFormContinente=false;		
		this.isPermisoDuplicarContinente=false;		
		this.isPermisoOrdenContinente=false;		
	}
	
	public void setPermisosUsuarioContinente(Boolean isPermiso) {
		this.isPermisoTodoContinente=isPermiso;
		this.isPermisoNuevoContinente=isPermiso;
		this.isPermisoActualizarContinente=isPermiso;
		this.isPermisoActualizarOriginalContinente=isPermiso;
		this.isPermisoEliminarContinente=isPermiso;
		this.isPermisoGuardarCambiosContinente=isPermiso;
		this.isPermisoConsultaContinente=isPermiso;
		this.isPermisoBusquedaContinente=isPermiso;
		this.isPermisoReporteContinente=isPermiso;
		this.isPermisoOrdenContinente=isPermiso;		
		this.isPermisoPaginacionMedioContinente=isPermiso;		
		this.isPermisoPaginacionAltoContinente=isPermiso;		
		this.isPermisoPaginacionTodoContinente=isPermiso;		
		this.isPermisoCopiarContinente=isPermiso;		
		this.isPermisoVerFormContinente=isPermiso;		
		this.isPermisoDuplicarContinente=isPermiso;
		this.isPermisoOrdenContinente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioContinente(Boolean isPermiso) {
		//this.isPermisoTodoContinente=isPermiso;
		this.isPermisoNuevoContinente=isPermiso;
		this.isPermisoActualizarContinente=isPermiso;
		this.isPermisoActualizarOriginalContinente=isPermiso;
		this.isPermisoEliminarContinente=isPermiso;
		this.isPermisoGuardarCambiosContinente=isPermiso;
		//this.isPermisoConsultaContinente=isPermiso;
		//this.isPermisoBusquedaContinente=isPermiso;
		//this.isPermisoReporteContinente=isPermiso;
		//this.isPermisoOrdenContinente=isPermiso;		
		//this.isPermisoPaginacionMedioContinente=isPermiso;		
		//this.isPermisoPaginacionAltoContinente=isPermiso;		
		//this.isPermisoPaginacionTodoContinente=isPermiso;		
		//this.isPermisoCopiarContinente=isPermiso;		
		//this.isPermisoDuplicarContinente=isPermiso;
		//this.isPermisoOrdenContinente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioContinenteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PaisConstantesFunciones.SNOMBREOPCION);
		
		if(ContinenteJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPais=false;
		this.isTienePermisosPais=this.verificarGetPermisosUsuarioOpcionContinenteClaseRelacionada(this.opcionsRelacionadas,PaisConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebContinente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioContinenteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPais=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioContinenteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionContinenteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioContinenteClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPais && this.jInternalFrameDetalleFormContinente!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormContinente.jTabbedPaneRelacionesContinente.remove(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioContinente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ContinenteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.continenteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ContinenteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoContinente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarContinente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalContinente=this.isPermisoActualizarContinente;
			this.isPermisoEliminarContinente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosContinente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaContinente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaContinente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoContinente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteContinente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenContinente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioContinente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoContinente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoContinente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarContinente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormContinente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarContinente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenContinente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.continenteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosContinente.setToolTipText(this.jTableDatosContinente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioContinente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioContinente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ContinenteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ContinenteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioContinente() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPais && this.continenteConstantesFunciones.mostrarPaisContinente && !ContinenteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pais");
			reporte.setsDescripcion("Pais");
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
	
		
	public void inicializarCombosForeignKeyContinenteListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyContinenteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ContinenteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyContinenteListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyContinenteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyContinente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyContinente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyContinente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyContinente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyContinente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyContinente(Continente continente)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyContinente(Continente continente,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyContinente()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyContinente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyContinente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyContinente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroContinente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyContinente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyContinente(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyContinente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public ContinenteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ContinenteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ContinenteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.continenteSessionBean=new ContinenteSessionBean(); 
		this.continenteConstantesFunciones=new ContinenteConstantesFunciones(); 
		this.continenteBean=new Continente();//(this.continenteConstantesFunciones); 		
		this.continenteReturnGeneral=new ContinenteParameterReturnGeneral(); 
		
		this.continenteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.continenteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ContinenteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ContinenteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ContinenteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessContinente(true);
			
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
			
			this.continenteConstantesFunciones=new ContinenteConstantesFunciones(); 
			this.continenteBean=new Continente();//this.continenteConstantesFunciones); 			
			this.continenteReturnGeneral=new ContinenteParameterReturnGeneral(); 
		
			ContinenteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Continente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.continente=new Continente();
			this.continentes = new ArrayList<Continente>();
			this.continentesAux = new ArrayList<Continente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic=new ContinenteLogic();
				this.continenteLogic.getNewConnexionToDeep("");
			}
			
			//this.continenteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.continenteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormContinente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoContinente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoContinente);	
					}
					
					if(this.jInternalFrameImportacionContinente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionContinente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByContinente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByContinente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormContinente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormContinente);
				this.jInternalFrameDetalleFormContinente.setVisible(false);
				this.jInternalFrameDetalleFormContinente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoContinente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoContinente);
					this.jInternalFrameReporteDinamicoContinente.setVisible(false);
					this.jInternalFrameReporteDinamicoContinente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionContinente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionContinente);
					this.jInternalFrameImportacionContinente.setVisible(false);
					this.jInternalFrameImportacionContinente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByContinente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByContinente);
					this.jInternalFrameOrderByContinente.setVisible(false);
					this.jInternalFrameOrderByContinente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idContinenteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ContinenteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.continenteReturnGeneral=new ContinenteParameterReturnGeneral();
			
			this.continenteParameterGeneral=new ContinenteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.continenteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ContinenteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.continenteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PaisConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ContinenteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.continenteSessionBean.getEsGuardarRelacionado(),this.continenteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ContinenteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.continenteSessionBean.getEsGuardarRelacionado(),this.continenteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoContinente=false;
			this.isVisibilidadCeldaDuplicarContinente=true;
			this.isVisibilidadCeldaCopiarContinente=true;
			this.isVisibilidadCeldaVerFormContinente=true;
			this.isVisibilidadCeldaOrdenContinente=true;
			this.isVisibilidadCeldaNuevoRelacionesContinente=false;
			this.isVisibilidadCeldaModificarContinente=false;
			this.isVisibilidadCeldaActualizarContinente=false;
			this.isVisibilidadCeldaEliminarContinente=false;
			this.isVisibilidadCeldaCancelarContinente=false;
			this.isVisibilidadCeldaGuardarContinente=false;
			this.isVisibilidadCeldaGuardarCambiosContinente=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesContinente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosContinente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioContinente(false);
			
			this.setPermisosUsuarioContinente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.continenteSessionBean.getEsGuardarRelacionado() 
				|| (this.continenteSessionBean.getEsGuardarRelacionado() && this.continenteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioContinenteClasesRelacionadas();
			}
			
			if(this.continenteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioContinenteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ContinenteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosContinente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualContinente();
			}
			
			if(!this.isPermisoBusquedaContinente) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.continenteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioContinente,this.isPermisoPaginacionMedioContinente,this.isPermisoPaginacionTodoContinente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ContinenteConstantesFunciones.getTiposSeleccionarContinente());
				
				this.tiposColumnasSelect=ContinenteConstantesFunciones.getTiposSeleccionarContinente(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectContinente();				
				//this.tiposRelacionesSelect=ContinenteConstantesFunciones.getTiposRelacionesContinente(true);
				
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
			//if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioContinente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioContinente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioContinente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesContinente() ;
			
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
			
			
			this.paisLogic=new PaisLogic(); 
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
				continenteImplementable= (ContinenteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ContinenteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				continenteImplementableHome= (ContinenteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ContinenteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.continentes= new ArrayList<Continente>();
			this.continentesEliminados= new ArrayList<Continente>();
						
			this.isEsNuevoContinente=false;
			this.esParaAccionDesdeFormularioContinente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyContinente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroContinente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ContinenteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ContinenteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesContinente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingContinente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormContinente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioContinente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioContinente();
			}
			
			ContinenteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessContinente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Continente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectContinente() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PaisConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PaisConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesContinente")) {
				iIndex=this.jInternalFrameDetalleFormContinente.jTabbedPaneRelacionesContinente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormContinente.jTabbedPaneRelacionesContinente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosContinente.getSelectedRow();	
				
				

				if(sTitle.equals("Paises")) {
					if(!PaisJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessContinente();

						this.cargarParteTabPanelRelacionadaPais(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessContinente();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaPais(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormContinente.cargarSessionConBeanSwingJInternalFramePais(false,true,iIndex);
		this.jButtonPaisActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPais();

		//this.jTabbedPaneRelacionesContinente.updateUI();
		//this.jTabbedPaneRelacionesContinente.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesContinente.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Pais")) {
				int row=this.jTableDatosContinente.getSelectedRow();
				jButtonPaisActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Pais")) {

					if(this.isTienePermisosPais && this.continenteConstantesFunciones.mostrarPaisContinente && !ContinenteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Paises"+"("+PaisConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Paises");

						if(continenteConstantesFunciones.resaltarPaisContinente!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(continenteConstantesFunciones.resaltarPaisContinente);
						}

						jmenuItem.setEnabled(this.continenteConstantesFunciones.activarPaisContinente);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Pais"));

						

						this.jInternalFrameDetalleFormContinente.jmenuDetalleContinente.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyContinente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyContinente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyContinente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyContinenteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyContinente();
		
		this.cargarCombosFrameForeignKeyContinente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyContinente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyContinente();
		}
	}
	
	
	
	public void jButtonNuevoContinenteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.continenteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormContinente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
			
			
			if(jTableDatosContinente.getRowCount()>=1) {
				jTableDatosContinente.removeRowSelectionInterval(0, jTableDatosContinente.getRowCount()-1);						
			}
			
			this.isEsNuevoContinente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoContinente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesContinente(true);			
			//this.continente=new Continente();
			//this.continente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesContinente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualContinente() ;
			
			if(ContinenteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleContinente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.continente);	
			this.actualizarInformacion("INFO_PADRE",false,this.continente);				
			
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
			
			if(this.continenteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Continente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarContinenteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Continente> continentesSeleccionados=new ArrayList<Continente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosContinente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosContinente.getSelectedRows().length;			
			}
			
			continentesSeleccionados=this.getContinentesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoContinente--;			
				//Continente continenteAux= new Continente();			
				//continenteAux.setId(this.iIdNuevoContinente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Continente continenteOrigen=new Continente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Continente continenteOrigen : continentesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosContinente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							continenteOrigen =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							continenteOrigen =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaContinente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.continente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosContinente(continenteOrigen,this.continente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysContinente(this.continente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.continenteLogic.getContinentes().add(this.continenteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.continentes.add(this.continenteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaContinente(false);
				
				this.jTableDatosContinente.setRowSelectionInterval(this.getIndiceNuevoContinente(), this.getIndiceNuevoContinente());
				
				int iLastRow =  this.jTableDatosContinente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosContinente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosContinente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaContinente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarContinenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Continente> continentesSeleccionados=new ArrayList<Continente>();									
		
			Continente continenteOrigen=new Continente();
			Continente continenteDestino=new Continente();
				
			continentesSeleccionados=this.getContinentesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosContinente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || continentesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosContinente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						continenteOrigen =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						continenteOrigen =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						continenteDestino =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						continenteDestino =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				continenteOrigen =continentesSeleccionados.get(0);
				continenteDestino =continentesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosContinente(continenteOrigen,continenteDestino,true,false);
				
				continenteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(continenteDestino,continenteLogic.getContinentes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(continenteDestino,continentes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaContinente(false);
				
				//this.jTableDatosContinente.setRowSelectionInterval(this.getIndiceNuevoContinente(), this.getIndiceNuevoContinente());
				
				int iLastRow =  this.jTableDatosContinente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosContinente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosContinente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaContinente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormContinenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormContinente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormContinente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarContinenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesContinente.isVisible();
			
			
			this.jPanelParametrosReportesContinente.setVisible(!isVisible);
			this.jPanelPaginacionContinente.setVisible(!isVisible);
			this.jPanelAccionesContinente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarContinenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameContinente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoContinenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoContinente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionContinenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionContinente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByContinenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByContinente();
			
			this.abrirFrameOrderByContinente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByContinenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByContinente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleContinente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormContinente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormContinente.isMaximum()) {
					this.jInternalFrameDetalleFormContinente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormContinente.setSize(this.jInternalFrameDetalleFormContinente.iWidthFormulario,this.jInternalFrameDetalleFormContinente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormContinente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormContinente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormContinente.isMaximum()) {
						this.jInternalFrameDetalleFormContinente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormContinente.jContentPaneDetalleContinente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormContinente.jTabbedPaneRelacionesContinente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormContinente.jContentPaneDetalleContinente.getWidth(),ContinenteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormContinente.jTabbedPaneRelacionesContinente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormContinente.jContentPaneDetalleContinente.getWidth(),ContinenteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormContinente.jTabbedPaneRelacionesContinente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormContinente.jContentPaneDetalleContinente.getWidth(),ContinenteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(PaisJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPais();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormContinente.setVisible(true);
	        this.jInternalFrameDetalleFormContinente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByContinente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByContinente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByContinente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByContinente,false,this);
				} else {
					this.jInternalFrameOrderByContinente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByContinente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByContinente);
				this.jInternalFrameOrderByContinente.setVisible(false);
				this.jInternalFrameOrderByContinente.setSelected(false);
				
				this.jInternalFrameOrderByContinente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByContinente"));
				
				this.inicializarActualizarBindingTablaOrderByContinente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionContinente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionContinente==null) {
				
				this.jInternalFrameImportacionContinente=new ImportacionJInternalFrame(ContinenteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionContinente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionContinente);
				this.jInternalFrameImportacionContinente.setVisible(false);
				this.jInternalFrameImportacionContinente.setSelected(false);


				this.jInternalFrameImportacionContinente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionContinente"));
				this.jInternalFrameImportacionContinente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionContinente"));
				this.jInternalFrameImportacionContinente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionContinente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoContinente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoContinente==null) {
				this.jInternalFrameReporteDinamicoContinente=new ReporteDinamicoJInternalFrame(ContinenteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoContinente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoContinente);
				this.jInternalFrameReporteDinamicoContinente.setVisible(false);
				this.jInternalFrameReporteDinamicoContinente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoContinente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoContinente"));
				this.jInternalFrameReporteDinamicoContinente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoContinente"));
				this.jInternalFrameReporteDinamicoContinente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoContinente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualContinente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaPais() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormContinente.jContentPaneDetalleContinente.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleContinente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormContinente);
			
	       	this.jInternalFrameDetalleFormContinente.setVisible(false);
	        this.jInternalFrameDetalleFormContinente.setSelected(false);
			
			//this.jInternalFrameDetalleFormContinente.dispose();
			//this.jInternalFrameDetalleFormContinente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoContinente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoContinente.setVisible(true);
	        this.jInternalFrameReporteDinamicoContinente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionContinente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionContinente.setVisible(true);
	        this.jInternalFrameImportacionContinente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByContinente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByContinente.setVisible(true);
	        this.jInternalFrameOrderByContinente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByContinente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByContinente.setVisible(false);
	        this.jInternalFrameOrderByContinente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoContinente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoContinente.setVisible(false);
	        this.jInternalFrameReporteDinamicoContinente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionContinente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionContinente.setVisible(false);
	        this.jInternalFrameImportacionContinente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarContinenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarContinente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarContinente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosContinente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesContinente(true);
			//this.isEsNuevoContinente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continente =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.continente =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesContinente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesContinente(false) ;
			
			if(continenteSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisSessionBean.getEsGuardarRelacionado() && PaisJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPaisActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ContinenteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleContinente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualContinente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaContinenteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosContinente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continente =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.continente =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarContinente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormContinente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosContinente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesContinente(true);
			//this.isEsNuevoContinente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continente =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.continente =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.continente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesContinente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesContinente(false) ;
			
			if(ContinenteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleContinente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualContinente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarContinenteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesContinente(false);
			
			//if(!this.isEsNuevoContinente) {								
				int intSelectedRow = this.jTableDatosContinente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continente =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.continente =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ContinenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualContinente(this.continente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysContinente(this.continente);
				
			}
			
			if(this.permiteMantenimiento(this.continente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.continenteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoContinente=true;
					this.inicializarActualizarBindingTablaContinente(false);
					this.isEsNuevoContinente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoContinente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoContinente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesContinente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualContinente(false);
				
				this.habilitarDeshabilitarControlesContinente(false);
			
												
				
				if(ContinenteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleContinente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoContinenteActionPerformed(evt,continenteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualContinente(this.continente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosContinente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,continenteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.continente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Continente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Continente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarContinenteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosContinente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continente =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				this.continente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.continente =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				this.continente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.continente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.continenteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ContinenteModel) this.jTableDatosContinente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoContinente=true;
				this.inicializarActualizarBindingTablaContinente(false);
				this.isEsNuevoContinente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesContinente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualContinente(false);
				
				this.habilitarDeshabilitarControlesContinente(false);
				
				
				
				if(ContinenteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleContinente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarContinenteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosContinente.getRowCount()>=1) {
				jTableDatosContinente.removeRowSelectionInterval(0, jTableDatosContinente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesContinente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaContinente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesContinente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualContinente(false) ;
			
			this.isEsNuevoContinente=false;
			
			if(ContinenteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleContinente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosContinenteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingContinente(false);
				
				//SI ES MANUAL
				if(ContinenteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualContinente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosContinenteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoContinente--;			
			//Continente continenteAux= new Continente();			
			//continenteAux.setId(this.iIdNuevoContinente);
			
			if(this.jInternalFrameDetalleFormContinente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaContinente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysContinente(this.continente);
			
			this.continente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.continenteLogic.getContinentes().add(this.continenteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.continentes.add(this.continenteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaContinente(false);
			
			this.jTableDatosContinente.setRowSelectionInterval(this.getIndiceNuevoContinente(), this.getIndiceNuevoContinente());
			
			int iLastRow =  this.jTableDatosContinente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosContinente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosContinente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaContinente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionContinenteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingContinente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingContinente(false);
			
			//SI ES MANUAL
			if(ContinenteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualContinente();
			}
			
			//this.abrirFrameTreeContinente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionContinenteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ContinenteS ?", "MANTENIMIENTO DE Continente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionContinente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralContinente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.continenteReturnGeneral=continenteLogic.procesarImportacionContinentesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.continenteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarContinenteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionContinenteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionContinente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionContinente.setFileImportacion(this.jInternalFrameImportacionContinente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionContinente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionContinente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionContinente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionContinente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoContinenteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Continente> continentesSeleccionados=new ArrayList<Continente>();		

		continentesSeleccionados=this.getContinentesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoContinente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoContinente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ContinenteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ContinenteBaseDesign.jrxml";
			
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
			
			this.generarReporteContinentes("Todos",continentesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.continenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Continente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoContinente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoContinente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ContinenteConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ContinenteConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoContinente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoContinente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoContinente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ContinenteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ContinenteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoContinente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ContinenteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ContinenteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoContinente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoContinente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ContinenteConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ContinenteConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoContinenteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Continente> continentesSeleccionados=new ArrayList<Continente>();		
		
		continentesSeleccionados=this.getContinentesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"continente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Continentes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoContinente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoContinente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ContinenteConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContinenteConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Continente continente:continentesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(continente.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ContinenteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContinenteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Continente continente:continentesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(continente.getnombre());
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
			//	this.getFilaCabeceraExportarExcelContinente(row);				
			//	iRow++;
			//}				
			
			//for(Continente continenteAux:continentesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelContinente(continenteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.continenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Continente",JOptionPane.INFORMATION_MESSAGE);
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
				this.continenteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingContinente(false);
			
			//SI ES MANUAL
			if(ContinenteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualContinente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresContinenteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingContinente(false);
			
			//SI ES MANUAL
			if(ContinenteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualContinente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesContinenteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingContinente(false);
			
			//SI ES MANUAL
			if(ContinenteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualContinente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.continenteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaContinente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosContinente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosContinente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosContinente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosContinente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosContinente.setMinimumSize(dimensionMinimum);
		this.jTableDatosContinente.setMaximumSize(dimensionMaximum);
		this.jTableDatosContinente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingContinente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingContinente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingContinente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaContinente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesContinente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasContinente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesContinente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesContinente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ContinenteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ContinenteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualContinente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaContinente();
		
		this.inicializarActualizarBindingBotonesManualContinente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualContinente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesContinente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualContinente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualContinente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosContinente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosContinente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteContinente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormContinente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormContinente.jCheckBoxPostAccionNuevoContinente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormContinente.jCheckBoxPostAccionSinCerrarContinente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormContinente.jCheckBoxPostAccionSinMensajeContinente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosContinente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosContinente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteContinente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormContinente!=null) {
				this.jInternalFrameDetalleFormContinente.jCheckBoxPostAccionNuevoContinente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormContinente.jCheckBoxPostAccionSinCerrarContinente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormContinente.jCheckBoxPostAccionSinMensajeContinente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionContinente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionContinente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormContinente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormContinente.jComboBoxTiposAccionesFormularioContinente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesContinente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoContinente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoContinente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesContinente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesContinente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarContinente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesContinente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoContinente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoContinente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesContinente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralContinente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesContinente(Boolean esInicializar) throws Exception {
		try	{	
			if(ContinenteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualContinente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesContinente() throws Exception {
		try	{
			if(ContinenteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualContinente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleContinente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormContinente.jComboBoxTiposAccionesFormularioContinente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormContinente.jComboBoxTiposAccionesFormularioContinente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualContinente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesContinente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesContinente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesContinente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesContinente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesContinente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesContinente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionContinente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionContinente.addItem(reporte);
			}
			
			
			if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionContinente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionContinente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesContinente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesContinente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesContinente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesContinente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormContinente.jComboBoxTiposAccionesFormularioContinente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormContinente.jComboBoxTiposAccionesFormularioContinente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarContinente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarContinente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarContinente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualContinente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualContinente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoContinente!=null) {
				this.jInternalFrameReporteDinamicoContinente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoContinente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoContinente!=null) {
				this.jInternalFrameReporteDinamicoContinente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoContinente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoContinente!=null) {
				
				if(this.jInternalFrameReporteDinamicoContinente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoContinente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoContinente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoContinente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoContinente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoContinente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualContinente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasContinente(Boolean esInicializar) throws Exception {				
		if(ContinenteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualContinente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaContinente() throws Exception {
		this.inicializarActualizarBindingTablaContinente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByContinente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByContinente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByContinente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByContinente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ContinentePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByContinente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByContinente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ContinentePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosContinenteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContinenteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ContinentePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByContinente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByContinente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ContinentePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByContinente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaContinente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=continenteLogic.getContinentes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=continentes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ContinenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosContinente.setModel(new ContinenteModel(this.continenteLogic.getContinentes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosContinente.setModel(new ContinenteModel(this.continentes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByContinente!=null && this.jInternalFrameOrderByContinente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByContinente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosContinente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContinente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ContinentePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ContinenteConstantesFunciones.SCLASSWEBTITULO,continenteConstantesFunciones.resaltarSeleccionarContinente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ContinenteConstantesFunciones.SCLASSWEBTITULO,continenteConstantesFunciones.resaltarSeleccionarContinente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosContinente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContinente,ContinenteConstantesFunciones.LABEL_ID));

		if(this.continenteConstantesFunciones.mostraridContinente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContinenteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.continenteConstantesFunciones.resaltaridContinente,this.continenteConstantesFunciones.activaridContinente,this,true,"idContinente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.continenteConstantesFunciones.resaltaridContinente,this.continenteConstantesFunciones.activaridContinente,this,true,"idContinente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContinente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContinente,ContinenteConstantesFunciones.LABEL_CODIGO));

		if(this.continenteConstantesFunciones.mostrarcodigoContinente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContinenteConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.continenteConstantesFunciones.resaltarcodigoContinente,this.continenteConstantesFunciones.activarcodigoContinente,this,true,"codigoContinente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.continenteConstantesFunciones.resaltarcodigoContinente,this.continenteConstantesFunciones.activarcodigoContinente,this,true,"codigoContinente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContinentePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContinente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContinente,ContinenteConstantesFunciones.LABEL_NOMBRE));

		if(this.continenteConstantesFunciones.mostrarnombreContinente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContinenteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.continenteConstantesFunciones.resaltarnombreContinente,this.continenteConstantesFunciones.activarnombreContinente,this,true,"nombreContinente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.continenteConstantesFunciones.resaltarnombreContinente,this.continenteConstantesFunciones.activarnombreContinente,this,true,"nombreContinente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContinentePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.continenteSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPais && this.continenteConstantesFunciones.mostrarPaisContinente && !ContinenteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Paises");
				tableColumn.setHeaderValue("Paises");
				tableColumn.setCellRenderer(new PaisTableCell(continenteConstantesFunciones.resaltarPaisContinente,this,this.continenteConstantesFunciones.activarPaisContinente));
				tableColumn.setCellEditor(new PaisTableCell(continenteConstantesFunciones.resaltarPaisContinente,this,this.continenteConstantesFunciones.activarPaisContinente));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosContinente.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.continenteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.continenteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosContinente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.continenteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.continenteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosContinente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarContinente && this.isPermisoGuardarCambiosContinente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.continenteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.continenteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosContinente.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.continenteSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosContinente.addColumn(tableColumn);
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
			
			this.jTableDatosContinente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarContinente && this.isPermisoGuardarCambiosContinente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.continenteSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarContinente && this.isPermisoGuardarCambiosContinente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosContinente.moveColumn(this.jTableDatosContinente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosContinente.moveColumn(this.jTableDatosContinente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.continenteSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosContinente.moveColumn(this.jTableDatosContinente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosContinente.moveColumn(this.jTableDatosContinente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosContinente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosContinente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosContinente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ContinenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosContinente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosContinente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ContinenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ContinenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosContinente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosContinente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosContinente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=continenteLogic.getContinentes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=continentes.size()-1;
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
		//this.jTableDatosContinente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosContinente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosContinente();
			
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
				
				//this.isEsNuevoContinente=false;
					
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
			
				if(this.continenteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormContinente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosContinente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosContinente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continente =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.continente =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.continente.getsType().equals("DUPLICADO")
				   || this.continente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoContinente=true;
				
				} else {
					this.isEsNuevoContinente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
					if(this.continente.getId()>=0 && !this.continente.getIsNew()) {						
						this.isEsNuevoContinente=false;
						
					} else {
						this.isEsNuevoContinente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoContinente(esRelaciones);						
				
				this.seleccionarContinente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.continente.getId()<0) {
					this.isEsNuevoContinente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarContinente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarContinente(evt,rowIndex);
				}	
				
				if(this.continenteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Continente: " + this.dDif); 
					}
				}								
				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarContinente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.continente)) {
					if(this.continente.getId()>0) {
						this.continente.setIsDeleted(true);
						
						this.continentesEliminados.add(this.continente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.continenteLogic.getContinentes().remove(this.continente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.continentes.remove(this.continente);				
					}
					
					
					((ContinenteModel) this.jTableDatosContinente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaContinente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarContinente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoContinente) {
			
			if(this.jInternalFrameDetalleFormContinente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosContinente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosContinente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continente =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.continente =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ContinenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioContinente(this.continente);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesContinente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesContinente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualContinente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoContinente(Continente continente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoContinente(continente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoContinente(Continente continente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioContinente(continente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyContinente(continente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyContinente(continente);
	}
	
	public void setVariablesObjetoActualToFormularioContinente(Continente continente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormContinente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormContinente.jTextFieldidContinente.setText(continente.getId().toString());
			this.jInternalFrameDetalleFormContinente.jTextFieldcodigoContinente.setText(continente.getcodigo());
			this.jInternalFrameDetalleFormContinente.jTextFieldnombreContinente.setText(continente.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Continente continenteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,continenteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Continente continenteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				continenteLocal=this.continente;
			} else {
				continenteLocal=this.continenteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(continenteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoContinente(continenteLocal,true);
					
					if(continenteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(continenteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.continenteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(continenteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoContinente(Continente continente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualContinente(continente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysContinente(continente);
	}
	
	public void setVariablesFormularioToObjetoActualContinente(Continente continente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualContinente(continente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualContinente(Continente continente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormContinente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormContinente.jTextFieldidContinente.getText()==null || this.jInternalFrameDetalleFormContinente.jTextFieldidContinente.getText()=="" || this.jInternalFrameDetalleFormContinente.jTextFieldidContinente.getText()=="Id") {
				this.jInternalFrameDetalleFormContinente.jTextFieldidContinente.setText("0");
			}

			if(conColumnasBase) {continente.setId(Long.parseLong(this.jInternalFrameDetalleFormContinente.jTextFieldidContinente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContinenteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContinente.jLabelIdContinente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			continente.setcodigo(this.jInternalFrameDetalleFormContinente.jTextFieldcodigoContinente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContinenteConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContinente.jLabelcodigoContinente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			continente.setnombre(this.jInternalFrameDetalleFormContinente.jTextFieldnombreContinente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContinenteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContinente.jLabelnombreContinente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualContinente(Continente continenteBean,Continente continente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosContinente(Continente continenteOrigen,Continente continente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && continenteOrigen.getId()!=null && !continenteOrigen.getId().equals(0L))) {continente.setId(continenteOrigen.getId());}}
			if(conDefault || (!conDefault && continenteOrigen.getcodigo()!=null && !continenteOrigen.getcodigo().equals(""))) {continente.setcodigo(continenteOrigen.getcodigo());}
			if(conDefault || (!conDefault && continenteOrigen.getnombre()!=null && !continenteOrigen.getnombre().equals(""))) {continente.setnombre(continenteOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioContinente(Continente continente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormContinente.jTextFieldidContinente.setText(continente.getId().toString());
			this.jInternalFrameDetalleFormContinente.jTextFieldcodigoContinente.setText(continente.getcodigo());
			this.jInternalFrameDetalleFormContinente.jTextFieldnombreContinente.setText(continente.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioContinente(ContinenteBean continenteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormContinente.jTextFieldidContinente.setText(continenteBean.getId().toString());
			this.jInternalFrameDetalleFormContinente.jTextFieldcodigoContinente.setText(continenteBean.getcodigo());
			this.jInternalFrameDetalleFormContinente.jTextFieldnombreContinente.setText(continenteBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanContinente(ContinenteParameterReturnGeneral continenteReturnGeneral,ContinenteBean continenteBean,Boolean conDefault) throws Exception { 
		try {
			Continente continenteLocal=new Continente();
			
			continenteLocal=continenteReturnGeneral.getContinente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && continenteLocal.getId()!=null && !continenteLocal.getId().equals(0L))) {continenteBean.setId(continenteLocal.getId());}}
			if(conDefault || (!conDefault && continenteLocal.getcodigo()!=null && !continenteLocal.getcodigo().equals(""))) {continenteBean.setcodigo(continenteLocal.getcodigo());}
			if(conDefault || (!conDefault && continenteLocal.getnombre()!=null && !continenteLocal.getnombre().equals(""))) {continenteBean.setnombre(continenteLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxContinenteGenerico(Long idContinenteSeleccionado,JComboBox jComboBoxContinente,List<Continente> continentesLocal)throws Exception {
		try {
			Continente  continenteTemp=null;

			for(Continente continenteAux:continentesLocal) {
				if(continenteAux.getId()!=null && continenteAux.getId().equals(idContinenteSeleccionado)) {
					continenteTemp=continenteAux;
					break;
				}
			}

			jComboBoxContinente.setSelectedItem(continenteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxContinenteGenerico(JComboBox jComboBoxContinente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxContinente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxContinente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxContinente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxContinente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxContinente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxContinente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxContinente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxContinente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxContinente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxContinente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Pais")) {
			jButtonPaisActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			continente=(Continente) continenteLogic.getContinentes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			continente =(Continente) continentes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Continente continenteRow=new Continente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			continenteRow=(Continente) continenteLogic.getContinentes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			continenteRow=(Continente) continentes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPaisActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Continente continente) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormContinente==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.continente = (Continente)this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.continente = (Continente)this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(continente!=null) {
						this.continente = continente;
					} else {
						this.continente = new Continente();
					}
				}

				if(this.isTienePermisosPais && this.permiteMantenimiento(this.continente)) {
					PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFramePopup=new PaisBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						paisBeanSwingJInternalFrame=this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFramePopup;
					} else {
						paisBeanSwingJInternalFrame=this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame;
					}

					List<Continente> continentes=new ArrayList<Continente>();
					continentes.add(this.continente);
					if(!esRelacionado) {
						//paisBeanSwingJInternalFrame.paisSessionBean.setConGuardarRelaciones(false);
						//paisBeanSwingJInternalFrame.paisSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					paisBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormContinente.cargarPaisBeanSwingJInternalFrame(continentes,this.continente,paisBeanSwingJInternalFrame,/*conInicializar,*/paisBeanSwingJInternalFrame.paisSessionBean.getConGuardarRelaciones(),paisBeanSwingJInternalFrame.paisSessionBean.getEsGuardarRelacionado());
					paisBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						paisBeanSwingJInternalFrame.actualizarEstadoPanelsPais("no_relacionado");

						paisBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PaisConstantesFunciones.ITAMANIOFILATABLA + (PaisConstantesFunciones.ITAMANIOFILATABLA/2));

						paisBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderContinente=(TitledBorder)this.jScrollPanelDatosContinente.getBorder();
						TitledBorder titledBorderPais=(TitledBorder)paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

						titledBorderPais.setTitle(titledBorderContinente.getTitle() + " -> Pais");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,paisBeanSwingJInternalFrame);
						}

						paisBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(paisBeanSwingJInternalFrame);

						paisBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.continenteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pais",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualContinente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoContinente.setVisible((this.isVisibilidadCeldaNuevoContinente && this.isPermisoNuevoContinente));			
			this.jButtonDuplicarContinente.setVisible((this.isVisibilidadCeldaDuplicarContinente && this.isPermisoDuplicarContinente));			
			this.jButtonCopiarContinente.setVisible((this.isVisibilidadCeldaCopiarContinente && this.isPermisoCopiarContinente));
			this.jButtonVerFormContinente.setVisible((this.isVisibilidadCeldaVerFormContinente && this.isPermisoVerFormContinente));
			
			this.jButtonAbrirOrderByContinente.setVisible((this.isVisibilidadCeldaOrdenContinente && this.isPermisoOrdenContinente));			
			
			this.jButtonNuevoRelacionesContinente.setVisible((this.isVisibilidadCeldaNuevoRelacionesContinente && this.isPermisoNuevoContinente));			
			this.jButtonNuevoGuardarCambiosContinente.setVisible((this.isVisibilidadCeldaNuevoContinente && this.isPermisoNuevoContinente && this.isPermisoGuardarCambiosContinente));
			
			if(this.jInternalFrameDetalleFormContinente!=null) {
			this.jInternalFrameDetalleFormContinente.jButtonModificarContinente.setVisible((this.isVisibilidadCeldaModificarContinente && this.isPermisoActualizarContinente));	
			this.jInternalFrameDetalleFormContinente.jButtonActualizarContinente.setVisible((this.isVisibilidadCeldaActualizarContinente && this.isPermisoActualizarContinente));	
			this.jInternalFrameDetalleFormContinente.jButtonEliminarContinente.setVisible((this.isVisibilidadCeldaEliminarContinente && this.isPermisoEliminarContinente));
			this.jInternalFrameDetalleFormContinente.jButtonCancelarContinente.setVisible(this.isVisibilidadCeldaCancelarContinente);							
			this.jInternalFrameDetalleFormContinente.jButtonGuardarCambiosContinente.setVisible((this.isVisibilidadCeldaGuardarContinente && this.isPermisoGuardarCambiosContinente));			
			
			}
						
			this.jButtonGuardarCambiosTablaContinente.setVisible((this.isVisibilidadCeldaGuardarCambiosContinente && this.isPermisoGuardarCambiosContinente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarContinente.setVisible((this.isVisibilidadCeldaNuevoContinente && this.isPermisoNuevoContinente));						
			this.jButtonDuplicarToolBarContinente.setVisible((this.isVisibilidadCeldaDuplicarContinente && this.isPermisoDuplicarContinente));						
			this.jButtonCopiarToolBarContinente.setVisible((this.isVisibilidadCeldaCopiarContinente && this.isPermisoCopiarContinente));			
			this.jButtonVerFormToolBarContinente.setVisible((this.isVisibilidadCeldaVerFormContinente && this.isPermisoVerFormContinente));			
			this.jButtonAbrirOrderByToolBarContinente.setVisible((this.isVisibilidadCeldaOrdenContinente && this.isPermisoOrdenContinente));
			this.jButtonNuevoRelacionesToolBarContinente.setVisible((this.isVisibilidadCeldaNuevoRelacionesContinente && this.isPermisoNuevoContinente));			
			this.jButtonNuevoGuardarCambiosToolBarContinente.setVisible((this.isVisibilidadCeldaNuevoContinente && this.isPermisoNuevoContinente && this.isPermisoGuardarCambiosContinente));			
			
			if(this.jInternalFrameDetalleFormContinente!=null) {
			this.jInternalFrameDetalleFormContinente.jButtonModificarToolBarContinente.setVisible((this.isVisibilidadCeldaModificarContinente && this.isPermisoActualizarContinente));	
			this.jInternalFrameDetalleFormContinente.jButtonActualizarToolBarContinente.setVisible((this.isVisibilidadCeldaActualizarContinente  && this.isPermisoActualizarContinente));	
			this.jInternalFrameDetalleFormContinente.jButtonEliminarToolBarContinente.setVisible((this.isVisibilidadCeldaEliminarContinente && this.isPermisoEliminarContinente));
			this.jInternalFrameDetalleFormContinente.jButtonCancelarToolBarContinente.setVisible(this.isVisibilidadCeldaCancelarContinente);				
			this.jInternalFrameDetalleFormContinente.jButtonGuardarCambiosToolBarContinente.setVisible((this.isVisibilidadCeldaGuardarContinente && this.isPermisoGuardarCambiosContinente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarContinente.setVisible((this.isVisibilidadCeldaGuardarCambiosContinente && this.isPermisoGuardarCambiosContinente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoContinente.setVisible((this.isVisibilidadCeldaNuevoContinente && this.isPermisoNuevoContinente));			
			this.jMenuItemDuplicarContinente.setVisible((this.isVisibilidadCeldaDuplicarContinente && this.isPermisoDuplicarContinente));			
			this.jMenuItemCopiarContinente.setVisible((this.isVisibilidadCeldaCopiarContinente && this.isPermisoCopiarContinente));			
			this.jMenuItemVerFormContinente.setVisible((this.isVisibilidadCeldaVerFormContinente && this.isPermisoVerFormContinente));			
			this.jMenuItemAbrirOrderByContinente.setVisible((this.isVisibilidadCeldaOrdenContinente && this.isPermisoOrdenContinente));			
			//this.jMenuItemMostrarOcultarContinente.setVisible((this.isVisibilidadCeldaOrdenContinente && this.isPermisoOrdenContinente));
			this.jMenuItemDetalleAbrirOrderByContinente.setVisible((this.isVisibilidadCeldaOrdenContinente && this.isPermisoOrdenContinente));			
			//this.jMenuItemDetalleMostrarOcultarContinente.setVisible((this.isVisibilidadCeldaOrdenContinente && this.isPermisoOrdenContinente));			
			this.jMenuItemNuevoRelacionesContinente.setVisible((this.isVisibilidadCeldaNuevoRelacionesContinente && this.isPermisoNuevoContinente));			
			this.jMenuItemNuevoGuardarCambiosContinente.setVisible((this.isVisibilidadCeldaNuevoContinente && this.isPermisoNuevoContinente && this.isPermisoGuardarCambiosContinente));									
			
			if(this.jInternalFrameDetalleFormContinente!=null) {
			this.jInternalFrameDetalleFormContinente.jMenuItemModificarContinente.setVisible((this.isVisibilidadCeldaModificarContinente && this.isPermisoActualizarContinente));	
			this.jInternalFrameDetalleFormContinente.jMenuItemActualizarContinente.setVisible((this.isVisibilidadCeldaActualizarContinente && this.isPermisoActualizarContinente));	
			this.jInternalFrameDetalleFormContinente.jMenuItemEliminarContinente.setVisible((this.isVisibilidadCeldaEliminarContinente && this.isPermisoEliminarContinente));
			this.jInternalFrameDetalleFormContinente.jMenuItemCancelarContinente.setVisible(this.isVisibilidadCeldaCancelarContinente);				
			}
			
			this.jMenuItemGuardarCambiosContinente.setVisible((this.isVisibilidadCeldaGuardarContinente && this.isPermisoGuardarCambiosContinente));						
			this.jMenuItemGuardarCambiosTablaContinente.setVisible((this.isVisibilidadCeldaGuardarCambiosContinente && this.isPermisoGuardarCambiosContinente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoContinente=this.jButtonNuevoContinente.isVisible();
			this.isVisibilidadCeldaDuplicarContinente=this.jButtonDuplicarContinente.isVisible();
			this.isVisibilidadCeldaCopiarContinente=this.jButtonCopiarContinente.isVisible();
			this.isVisibilidadCeldaVerFormContinente=this.jButtonVerFormContinente.isVisible();
			
			this.isVisibilidadCeldaOrdenContinente=this.jButtonAbrirOrderByContinente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesContinente=this.jButtonNuevoRelacionesContinente.isVisible();
			this.isVisibilidadCeldaModificarContinente=this.jButtonModificarContinente.isVisible();
			
			if(this.jInternalFrameDetalleFormContinente!=null) {
			this.isVisibilidadCeldaActualizarContinente=this.jInternalFrameDetalleFormContinente.jButtonActualizarContinente.isVisible();
			this.isVisibilidadCeldaEliminarContinente=this.jInternalFrameDetalleFormContinente.jButtonEliminarContinente.isVisible();
			this.isVisibilidadCeldaCancelarContinente=this.jInternalFrameDetalleFormContinente.jButtonCancelarContinente.isVisible();
			this.isVisibilidadCeldaGuardarContinente=this.jInternalFrameDetalleFormContinente.jButtonGuardarCambiosContinente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosContinente=this.jButtonGuardarCambiosTablaContinente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoContinente=this.jButtonNuevoToolBarContinente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesContinente=this.jButtonNuevoRelacionesToolBarContinente.isVisible();
			
			if(this.jInternalFrameDetalleFormContinente!=null) {
			this.isVisibilidadCeldaModificarContinente=this.jInternalFrameDetalleFormContinente.jButtonModificarToolBarContinente.isVisible();
			this.isVisibilidadCeldaActualizarContinente=this.jInternalFrameDetalleFormContinente.jButtonActualizarToolBarContinente.isVisible();
			this.isVisibilidadCeldaEliminarContinente=this.jInternalFrameDetalleFormContinente.jButtonEliminarToolBarContinente.isVisible();
			this.isVisibilidadCeldaCancelarContinente=this.jInternalFrameDetalleFormContinente.jButtonCancelarToolBarContinente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarContinente=this.jButtonGuardarCambiosToolBarContinente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosContinente=this.jButtonGuardarCambiosTablaToolBarContinente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoContinente=this.jMenuItemNuevoContinente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesContinente=this.jMenuItemNuevoRelacionesContinente.isVisible();
			
			if(this.jInternalFrameDetalleFormContinente!=null) {
			this.isVisibilidadCeldaModificarContinente=this.jInternalFrameDetalleFormContinente.jMenuItemModificarContinente.isVisible();
			this.isVisibilidadCeldaActualizarContinente=this.jInternalFrameDetalleFormContinente.jMenuItemActualizarContinente.isVisible();
			this.isVisibilidadCeldaEliminarContinente=this.jInternalFrameDetalleFormContinente.jMenuItemEliminarContinente.isVisible();
			this.isVisibilidadCeldaCancelarContinente=this.jInternalFrameDetalleFormContinente.jMenuItemCancelarContinente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarContinente=this.jMenuItemGuardarCambiosContinente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosContinente=this.jMenuItemGuardarCambiosTablaContinente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesContinente(Boolean esInicializar) {
		if(ContinenteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.continenteSessionBean.getConGuardarRelaciones()) {
				//if(this.continenteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesContinente();
			}
			
			this.inicializarActualizarBindingBotonesManualContinente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualContinente() {
		this.jButtonNuevoContinente.setVisible(this.isPermisoNuevoContinente);			
		this.jButtonDuplicarContinente.setVisible(this.isPermisoDuplicarContinente);			
		this.jButtonCopiarContinente.setVisible(this.isPermisoCopiarContinente);			
		this.jButtonVerFormContinente.setVisible(this.isPermisoVerFormContinente);			
		
		this.jButtonAbrirOrderByContinente.setVisible(this.isPermisoOrdenContinente);					
		
		this.jButtonNuevoRelacionesContinente.setVisible(this.isPermisoNuevoContinente);			
		
		if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContinente.jButtonModificarContinente.setVisible(this.isPermisoActualizarContinente);	
			this.jInternalFrameDetalleFormContinente.jButtonActualizarContinente.setVisible(this.isPermisoActualizarContinente);	
			this.jInternalFrameDetalleFormContinente.jButtonEliminarContinente.setVisible(this.isPermisoEliminarContinente);
			this.jInternalFrameDetalleFormContinente.jButtonCancelarContinente.setVisible(this.isVisibilidadCeldaCancelarContinente);						
			this.jInternalFrameDetalleFormContinente.jButtonGuardarCambiosContinente.setVisible(this.isPermisoGuardarCambiosContinente);							
		}
		
		this.jButtonGuardarCambiosTablaContinente.setVisible(this.isPermisoActualizarContinente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleContinente() {
		this.jInternalFrameDetalleFormContinente.jButtonModificarContinente.setVisible(this.isPermisoActualizarContinente);	
		this.jInternalFrameDetalleFormContinente.jButtonActualizarContinente.setVisible(this.isPermisoActualizarContinente);	
		this.jInternalFrameDetalleFormContinente.jButtonEliminarContinente.setVisible(this.isPermisoEliminarContinente);
		this.jInternalFrameDetalleFormContinente.jButtonCancelarContinente.setVisible(this.isVisibilidadCeldaCancelarContinente);							
		this.jInternalFrameDetalleFormContinente.jButtonGuardarCambiosContinente.setVisible((this.isVisibilidadCeldaGuardarContinente && this.isPermisoGuardarCambiosContinente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosContinente() {
		if(ContinenteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualContinente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesContinente() {
	}
	
	public void jTableDatosContinenteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarContinente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidContinenteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContinente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContinente(this.getcontinente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContinente(this.continente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.continente =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.continente =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.continente==null) {
						this.continente = new Continente();
					}

					this.setVariablesFormularioToObjetoActualContinente(this.continente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContinente(this.continente);
				}

				if(this.continente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.continente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContinente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoContinenteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContinente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContinente(this.getcontinente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContinente(this.continente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.continente =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.continente =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.continente==null) {
						this.continente = new Continente();
					}

					this.setVariablesFormularioToObjetoActualContinente(this.continente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContinente(this.continente);
				}

				if(this.continente.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.continente.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContinente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreContinenteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContinente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContinente(this.getcontinente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContinente(this.continente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.continente =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.continente =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.continente==null) {
						this.continente = new Continente();
					}

					this.setVariablesFormularioToObjetoActualContinente(this.continente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContinente(this.continente);
				}

				if(this.continente.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.continente.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContinente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameContinente() {
		if(this.jInternalFrameDetalleFormContinente!=null) {
		

		if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormContinente!=null) {
			this.jInternalFrameDetalleFormContinente.setVisible(false);	    			
			this.jInternalFrameDetalleFormContinente.dispose();
			this.jInternalFrameDetalleFormContinente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoContinente!=null) {
			this.jInternalFrameReporteDinamicoContinente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoContinente.dispose();
			this.jInternalFrameReporteDinamicoContinente=null;
		}
		
		if(this.jInternalFrameImportacionContinente!=null) {
			this.jInternalFrameImportacionContinente.setVisible(false);	    			
			this.jInternalFrameImportacionContinente.dispose();
			this.jInternalFrameImportacionContinente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessContinente();
			
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
			
			
			if(sTipo.equals("NuevoContinente")) {
				jButtonNuevoContinenteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarContinente")) {
				jButtonDuplicarContinenteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarContinente")) {
				jButtonCopiarContinenteActionPerformed(evt);
			} else if(sTipo.equals("VerFormContinente")) {
				jButtonVerFormContinenteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarContinente")) {
				jButtonNuevoContinenteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarContinente")) {
				jButtonDuplicarContinenteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoContinente")) {
				jButtonNuevoContinenteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarContinente")) {
				jButtonDuplicarContinenteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesContinente")) {
				jButtonNuevoContinenteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarContinente")) {
				jButtonNuevoContinenteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesContinente")) {
				jButtonNuevoContinenteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarContinente")) {
				jButtonModificarContinenteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarContinente")) {
				jButtonModificarContinenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarContinente")) {
				jButtonModificarContinenteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarContinente")) {
				jButtonActualizarContinenteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarContinente")) {
				jButtonActualizarContinenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarContinente")) {
				jButtonActualizarContinenteActionPerformed(evt);
			} else if(sTipo.equals("EliminarContinente")) {
				jButtonEliminarContinenteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarContinente")) {
				jButtonEliminarContinenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarContinente")) {
				jButtonEliminarContinenteActionPerformed(evt);
			} else if(sTipo.equals("CancelarContinente")) {
				jButtonCancelarContinenteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarContinente")) {
				jButtonCancelarContinenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarContinente")) {
				jButtonCancelarContinenteActionPerformed(evt);
			} else if(sTipo.equals("CerrarContinente")) {
				jButtonCerrarContinenteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarContinente")) {
				jButtonCerrarContinenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarContinente")) {
				jButtonCerrarContinenteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarContinente")) {
				jButtonMostrarOcultarContinenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarContinente")) {
				jButtonCancelarContinenteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosContinente")) {
				jButtonGuardarCambiosContinenteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarContinente")) {
				jButtonGuardarCambiosContinenteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarContinente")) {
				jButtonCopiarContinenteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarContinente")) {
				jButtonVerFormContinenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosContinente")) {
				jButtonGuardarCambiosContinenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarContinente")) {
				jButtonCopiarContinenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormContinente")) {
				jButtonVerFormContinenteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaContinente")) {
				jButtonGuardarCambiosContinenteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarContinente")) {
				jButtonGuardarCambiosContinenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaContinente")) {
				jButtonGuardarCambiosContinenteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionContinente")) {
				jButtonRecargarInformacionContinenteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarContinente")) {
				jButtonRecargarInformacionContinenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionContinente")) {
				jButtonRecargarInformacionContinenteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresContinente")) {
				jButtonAnterioresContinenteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarContinente")) {
				jButtonAnterioresContinenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreContinente")) {
				jButtonAnterioresContinenteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesContinente")) {
				jButtonSiguientesContinenteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarContinente")) {
				jButtonSiguientesContinenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesContinente")) {
				jButtonSiguientesContinenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByContinente") || sTipo.equals("MenuItemDetalleAbrirOrderByContinente")) {
				jButtonAbrirOrderByContinenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarContinente") || sTipo.equals("MenuItemDetalleMostrarOcultarContinente")) {
				jButtonMostrarOcultarContinenteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosContinente")) {
				jButtonNuevoGuardarCambiosContinenteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarContinente")) {
				jButtonNuevoGuardarCambiosContinenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosContinente")) {
				jButtonNuevoGuardarCambiosContinenteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoContinente")) {
				jButtonCerrarReporteDinamicoContinenteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoContinente")) {
				jButtonGenerarReporteDinamicoContinenteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoContinente")) {
				
				jButtonGenerarExcelReporteDinamicoContinenteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionContinente")) {
				jButtonCerrarImportacionContinenteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionContinente")) {
				
				jButtonGenerarImportacionContinenteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionContinente")) {
				
				jButtonAbrirImportacionContinenteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesContinente")) {
				jComboBoxTiposAccionesContinenteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesContinente")) {
				jComboBoxTiposRelacionesContinenteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioContinente")) {
				jComboBoxTiposAccionesContinenteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarContinente")) {
				
				jComboBoxTiposSeleccionarContinenteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralContinente")) {
				jTextFieldValorCampoGeneralContinenteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByContinente")) {
				jButtonAbrirOrderByContinenteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarContinente")) {
				jButtonAbrirOrderByContinenteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByContinente")) {
				jButtonCerrarOrderByContinenteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idContinenteBusqueda")) {
				this.jButtonidContinenteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoContinenteBusqueda")) {
				this.jButtoncodigoContinenteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreContinenteBusqueda")) {
				this.jButtonnombreContinenteBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessContinente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContinenteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.continente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.continente);
				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
				
				


				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Continente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Continente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Continente continenteLocal=null;
			
			if(!this.getEsControlTabla()) {
				continenteLocal=this.continente;
			} else {
				continenteLocal=this.continenteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.continente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.continente);
				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
							
				
				


				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Continente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Continente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContinenteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContinente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteAnterior =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.continenteAnterior =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
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
			
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
			
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
			
			


			
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContinenteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.continente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.continente);
				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
								
						
				


				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Continente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Continente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.continente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.continente);
				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
								
				
				


				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Continente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Continente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContinenteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContinente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteAnterior =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.continenteAnterior =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.continente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.continente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContinenteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContinente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteAnterior =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.continenteAnterior =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContinenteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.continente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.continente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.continente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.continente);
				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
							
				
				


				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Continente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Continente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContinenteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosContinente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.continenteAnterior =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.continenteAnterior =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
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
			
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
			
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
			
			


			
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContinenteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.continente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.continente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.continente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.continente);
				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
								
				
				


				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Continente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Continente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContinenteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContinente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteAnterior =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.continenteAnterior =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContinenteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.continente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.continente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContinenteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.continente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.continente);
				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosContinente")) {
					jCheckBoxSeleccionarTodosContinenteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosContinente")) {
					jCheckBoxSeleccionadosContinenteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarContinente")) {
					
				}
				
				


				
				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Continente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Continente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.continente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.continente);
				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
												
				
				


				
				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Continente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Continente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContinenteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosContinente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.continenteAnterior =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.continenteAnterior =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContinenteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.continente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.continente);
				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
				
				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
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
			
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
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
			
			


			
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContinenteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.continente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.continente);
				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Continente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Continente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.continente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.continente);
				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
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
				
				


				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Continente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Continente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContinenteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContinente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.continenteAnterior =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.continenteAnterior =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarContinente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosContinenteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosContinente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.continente =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.continente =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.continente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarContinente")) {
				
				}
				
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarContinente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosContinente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarContinente")) {
			
			}
			
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessContinente();
			
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
			
			if(sTipo.equals("NuevoContinente")) {
				jButtonNuevoContinenteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarContinente")) {
				jButtonDuplicarContinenteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarContinente")) {
				jButtonCopiarContinenteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormContinente")) {
				jButtonVerFormContinenteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesContinente")) {
				jButtonNuevoContinenteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarContinente")) {
				jButtonModificarContinenteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarContinente")) {
				jButtonActualizarContinenteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarContinente")) {
				jButtonEliminarContinenteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaContinente")) {
				jButtonGuardarCambiosContinenteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarContinente")) {
				jButtonCancelarContinenteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarContinente")) {
				jButtonCerrarContinenteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosContinente")) {
				jButtonGuardarCambiosContinenteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosContinente")) {
				jButtonNuevoGuardarCambiosContinenteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByContinente")) {
				jButtonAbrirOrderByContinenteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionContinente")) {
				jButtonRecargarInformacionContinenteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresContinente")) {
				jButtonAnterioresContinenteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesContinente")) {
				jButtonSiguientesContinenteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idContinenteBusqueda")) {
				this.jButtonidContinenteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoContinenteBusqueda")) {
				this.jButtoncodigoContinenteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreContinenteBusqueda")) {
				this.jButtonnombreContinenteBusquedaActionPerformed(evt);
			}
			
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessContinente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameContinente")) {
				closingInternalFrameContinente();
				
			} else if(sTipo.equals("jButtonCancelarContinente")) {
				JInternalFrameBase jInternalFrameDetalleFormContinente = (JInternalFrameBase)evt.getSource();
	            	
	            ContinenteBeanSwingJInternalFrame jInternalFrameParent=(ContinenteBeanSwingJInternalFrame)jInternalFrameDetalleFormContinente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarContinenteActionPerformed(null);
			}
			
			ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.continente,new Object(),this.continenteParameterGeneral,this.continenteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormContinente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormContinente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormContinente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.continente)) {
			if(!esControlTabla) {
				if(ContinenteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualContinente(this.continente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysContinente(this.continente);			
				}
				
				if(this.continenteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualContinente(this.continente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.continenteReturnGeneral=continenteLogic.procesarEventosContinentesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.continenteLogic.getContinentes(),this.continente,this.continenteParameterGeneral,this.isEsNuevoContinente,classes);//this.continenteLogic.getContinente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanContinente(this.continenteReturnGeneral,this.continenteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.continenteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanContinente(classes,this.continenteReturnGeneral,this.continenteBean,false);
					}
						
					if(this.continenteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyContinente(this.continenteReturnGeneral.getContinente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioContinente(this.continenteReturnGeneral.getContinente());	
					}
						
					if(this.continenteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioContinente(this.continenteReturnGeneral.getContinente(),classes);//this.continenteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioContinente(this.continente,classes);//this.continenteBean);									
				}
			
				if(ContinenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualContinente(this.continente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysContinente(this.continente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.continenteAnterior!=null) {
						this.continente=this.continenteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.continenteReturnGeneral=continenteLogic.procesarEventosContinentesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.continenteLogic.getContinentes(),this.continente,this.continenteParameterGeneral,this.isEsNuevoContinente,classes);//this.continenteLogic.getContinente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.continenteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.continenteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.continenteReturnGeneral.getContinente(),continenteLogic.getContinentes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.continenteReturnGeneral.getContinente(),this.continentes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosContinente.repaint();
				
				//((AbstractTableModel) this.jTableDatosContinente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosContinente();
			}
		}
	}
	
	public void actualizarVisualTableDatosContinente() throws Exception {
		
		ContinenteModel continenteModel=(ContinenteModel)this.jTableDatosContinente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			continenteModel.continentes=this.continenteLogic.getContinentes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			continenteModel.continentes=this.continentes;
		}
		
		
		((ContinenteModel) this.jTableDatosContinente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaContinente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcontinenteAnterior(),this.continenteLogic.getContinentes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcontinenteAnterior(),this.continentes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosContinente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioContinente(Continente continente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Pais.class)) {
					this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisLogic.setPaiss(continente.getPaiss());
					this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
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
										
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.continente,new Object(),generalEntityParameterGeneral,this.continenteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.continenteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ContinenteConstantesFunciones.getClassesRelationshipsOfContinente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ContinenteConstantesFunciones.getClassesRelationshipsFromStringsOfContinente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormContinente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ContinenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.continente,new Object(),generalEntityParameterGeneral,this.continenteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioContinente(ContinenteBean continenteBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Pais.class)) {
					this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisLogic.setPaiss(continente.getPaiss());
					this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanContinente(ArrayList<Classe> classes,ContinenteReturnGeneral continenteReturnGeneral,ContinenteBean continenteBean,Boolean conDefault) throws Exception {
		
			this.continenteBean.setPaiss(continenteReturnGeneral.getContinente().getPaiss());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualContinente(Continente continente,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Pais.class)) {
					continente.setPaiss(this.jInternalFrameDetalleFormContinente.paisBeanSwingJInternalFrame.paisLogic.getPaiss());
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
		if(!paraTabla && !this.permiteMantenimiento(this.continente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormContinente = new ContinenteDetalleFormJInternalFrame(jDesktopPane,this.continenteSessionBean.getConGuardarRelaciones(),this.continenteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormContinente);
		this.jInternalFrameDetalleFormContinente.setVisible(false);
		this.jInternalFrameDetalleFormContinente.setSelected(false);						
		
		this.jInternalFrameDetalleFormContinente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormContinente.continenteLogic=this.continenteLogic;
		
		this.cargarCombosFrameForeignKeyContinente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleContinente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleContinente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyContinente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyContinente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormContinente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarContinente"));
		
		this.jInternalFrameDetalleFormContinente.jButtonModificarContinente.addActionListener(new ButtonActionListener(this,"ModificarContinente"));

		
		this.jInternalFrameDetalleFormContinente.jButtonModificarToolBarContinente.addActionListener(new ButtonActionListener(this,"ModificarToolBarContinente"));
					
		this.jInternalFrameDetalleFormContinente.jMenuItemModificarContinente.addActionListener(new ButtonActionListener(this,"MenuItemModificarContinente"));		
		
		
		
		this.jInternalFrameDetalleFormContinente.jButtonActualizarContinente.addActionListener (new ButtonActionListener(this,"ActualizarContinente"));
		
		
		this.jInternalFrameDetalleFormContinente.jButtonActualizarToolBarContinente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarContinente"));
						
		this.jInternalFrameDetalleFormContinente.jMenuItemActualizarContinente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarContinente"));		
		
		
		
		this.jInternalFrameDetalleFormContinente.jButtonEliminarContinente.addActionListener (new ButtonActionListener(this,"EliminarContinente"));
		
		
		this.jInternalFrameDetalleFormContinente.jButtonEliminarToolBarContinente.addActionListener (new ButtonActionListener(this,"EliminarToolBarContinente"));
								
		this.jInternalFrameDetalleFormContinente.jMenuItemEliminarContinente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarContinente"));		
		
		
		
		this.jInternalFrameDetalleFormContinente.jButtonCancelarContinente.addActionListener (new ButtonActionListener(this,"CancelarContinente"));
		
		
		this.jInternalFrameDetalleFormContinente.jButtonCancelarToolBarContinente.addActionListener (new ButtonActionListener(this,"CancelarToolBarContinente"));
					
		this.jInternalFrameDetalleFormContinente.jMenuItemCancelarContinente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarContinente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormContinente.jMenuItemDetalleCerrarContinente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarContinente"));		
		
		
		
		this.jInternalFrameDetalleFormContinente.jButtonGuardarCambiosToolBarContinente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarContinente"));
		
		
		
		this.jInternalFrameDetalleFormContinente.jButtonGuardarCambiosToolBarContinente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarContinente"));
		
		
		
		this.jInternalFrameDetalleFormContinente.jComboBoxTiposAccionesFormularioContinente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioContinente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContinente.jButtonidContinenteBusqueda.addActionListener(new ButtonActionListener(this,"idContinenteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContinente.jButtoncodigoContinenteBusqueda.addActionListener(new ButtonActionListener(this,"codigoContinenteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContinente.jButtonnombreContinenteBusqueda.addActionListener(new ButtonActionListener(this,"nombreContinenteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormContinente.jTabbedPaneRelacionesContinente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesContinente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameContinente"));
		
		if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContinente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarContinente"));
		}
		
		this.jTableDatosContinente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarContinente"));
		
		this.jTableDatosContinente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarContinente"));
		
		this.jButtonNuevoContinente.addActionListener(new ButtonActionListener(this,"NuevoContinente"));
		
		this.jButtonDuplicarContinente.addActionListener(new ButtonActionListener(this,"DuplicarContinente"));
		
		this.jButtonCopiarContinente.addActionListener(new ButtonActionListener(this,"CopiarContinente"));
		
		this.jButtonVerFormContinente.addActionListener(new ButtonActionListener(this,"VerFormContinente"));
		
		
		this.jButtonNuevoToolBarContinente.addActionListener(new ButtonActionListener(this,"NuevoToolBarContinente"));
			
		this.jButtonDuplicarToolBarContinente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarContinente"));
			
		this.jMenuItemNuevoContinente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoContinente"));
			
		this.jMenuItemDuplicarContinente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarContinente"));		
		
		
		this.jButtonNuevoRelacionesContinente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesContinente"));
		
		
		this.jButtonNuevoRelacionesToolBarContinente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarContinente"));
			
		this.jMenuItemNuevoRelacionesContinente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesContinente"));		
		
		
		if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContinente.jButtonModificarContinente.addActionListener(new ButtonActionListener(this,"ModificarContinente"));
		}
		
		
		if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContinente.jButtonModificarToolBarContinente.addActionListener(new ButtonActionListener(this,"ModificarToolBarContinente"));
			
			this.jInternalFrameDetalleFormContinente.jMenuItemModificarContinente.addActionListener(new ButtonActionListener(this,"MenuItemModificarContinente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormContinente.jButtonActualizarContinente.addActionListener (new ButtonActionListener(this,"ActualizarContinente"));
		}
		
		
		if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContinente.jButtonActualizarToolBarContinente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarContinente"));
				
			this.jInternalFrameDetalleFormContinente.jMenuItemActualizarContinente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarContinente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContinente.jButtonEliminarContinente.addActionListener (new ButtonActionListener(this,"EliminarContinente"));
		}
		
		
		if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContinente.jButtonEliminarToolBarContinente.addActionListener (new ButtonActionListener(this,"EliminarToolBarContinente"));
						
			this.jInternalFrameDetalleFormContinente.jMenuItemEliminarContinente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarContinente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContinente.jButtonCancelarContinente.addActionListener (new ButtonActionListener(this,"CancelarContinente"));
		}
		
		
		if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContinente.jButtonCancelarToolBarContinente.addActionListener (new ButtonActionListener(this,"CancelarToolBarContinente"));
			
			this.jInternalFrameDetalleFormContinente.jMenuItemCancelarContinente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarContinente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarContinente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarContinente"));		
		
		
		this.jButtonCerrarContinente.addActionListener (new ButtonActionListener(this,"CerrarContinente"));
		
		
		this.jButtonCerrarToolBarContinente.addActionListener (new ButtonActionListener(this,"CerrarToolBarContinente"));
			
		this.jMenuItemCerrarContinente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarContinente"));
			
		if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContinente.jMenuItemDetalleCerrarContinente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarContinente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContinente.jButtonGuardarCambiosContinente.addActionListener (new ButtonActionListener(this,"GuardarCambiosContinente"));
		}
		
		
		if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContinente.jButtonGuardarCambiosToolBarContinente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarContinente"));
		}
		
		this.jButtonCopiarToolBarContinente.addActionListener (new ButtonActionListener(this,"CopiarToolBarContinente"));
			
		this.jButtonVerFormToolBarContinente.addActionListener (new ButtonActionListener(this,"VerFormToolBarContinente"));
		
		this.jMenuItemGuardarCambiosContinente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosContinente"));
			
		this.jMenuItemCopiarContinente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarContinente"));		
		
		this.jMenuItemVerFormContinente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormContinente"));		
		
		
		this.jButtonGuardarCambiosTablaContinente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaContinente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarContinente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarContinente"));
			
		this.jMenuItemGuardarCambiosTablaContinente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaContinente"));		
		
		
		
		this.jButtonRecargarInformacionContinente.addActionListener (new ButtonActionListener(this,"RecargarInformacionContinente"));
					
		this.jButtonRecargarInformacionToolBarContinente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarContinente"));
		
		this.jMenuItemRecargarInformacionContinente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionContinente"));		
		
		
		
		this.jButtonAnterioresContinente.addActionListener (new ButtonActionListener(this,"AnterioresContinente"));
		
		
		this.jButtonAnterioresToolBarContinente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarContinente"));
		
		this.jMenuItemAnterioresContinente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresContinente"));		
		
		
		this.jButtonSiguientesContinente.addActionListener (new ButtonActionListener(this,"SiguientesContinente"));
		
		
		this.jButtonSiguientesToolBarContinente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarContinente"));
			
		this.jMenuItemSiguientesContinente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesContinente"));
			
		this.jMenuItemAbrirOrderByContinente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByContinente"));
			
		this.jMenuItemMostrarOcultarContinente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarContinente"));
			
		this.jMenuItemDetalleAbrirOrderByContinente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByContinente"));
			
		this.jMenuItemDetalleMostarOcultarContinente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarContinente"));		
		
		
		this.jButtonNuevoGuardarCambiosContinente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosContinente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarContinente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarContinente"));
			
		this.jMenuItemNuevoGuardarCambiosContinente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosContinente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosContinente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosContinente"));

		this.jCheckBoxSeleccionadosContinente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosContinente"));
		
		if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContinente.jComboBoxTiposAccionesFormularioContinente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioContinente"));
		}
		
		
		this.jComboBoxTiposRelacionesContinente.addActionListener (new ButtonActionListener(this,"TiposRelacionesContinente"));
			
		this.jComboBoxTiposAccionesContinente.addActionListener (new ButtonActionListener(this,"TiposAccionesContinente"));
					
		this.jComboBoxTiposSeleccionarContinente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarContinente"));
			
		this.jTextFieldValorCampoGeneralContinente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralContinente"));		
		
		
		if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContinente.jButtonidContinenteBusqueda.addActionListener(new ButtonActionListener(this,"idContinenteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContinente.jButtoncodigoContinenteBusqueda.addActionListener(new ButtonActionListener(this,"codigoContinenteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContinente.jButtonnombreContinenteBusqueda.addActionListener(new ButtonActionListener(this,"nombreContinenteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoContinente!=null) {
				this.jInternalFrameReporteDinamicoContinente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoContinente"));
				this.jInternalFrameReporteDinamicoContinente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoContinente"));
				this.jInternalFrameReporteDinamicoContinente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoContinente"));
			}
			
			//this.jButtonCerrarReporteDinamicoContinente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoContinente"));				
			//this.jButtonGenerarReporteDinamicoContinente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoContinente"));
			//this.jButtonGenerarExcelReporteDinamicoContinente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoContinente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionContinente!=null) {
				this.jInternalFrameImportacionContinente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionContinente"));
				this.jInternalFrameImportacionContinente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionContinente"));
				this.jInternalFrameImportacionContinente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionContinente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByContinente.addActionListener (new ButtonActionListener(this,"AbrirOrderByContinente"));
			
			this.jButtonAbrirOrderByToolBarContinente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarContinente"));			
			
			if(this.jInternalFrameOrderByContinente!=null) {
				this.jInternalFrameOrderByContinente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByContinente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormContinente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContinente.jTabbedPaneRelacionesContinente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesContinente"));
		
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
            		closingInternalFrameContinente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormContinente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormContinente = (JInternalFrameBase)event.getSource();
	            	
	            ContinenteBeanSwingJInternalFrame jInternalFrameParent=(ContinenteBeanSwingJInternalFrame)jInternalFrameDetalleFormContinente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarContinenteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosContinente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosContinenteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosContinente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosContinente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContinenteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContinenteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContinenteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoContinente";
		inputMap = this.jButtonNuevoContinente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoContinente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoContinenteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContinenteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContinenteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContinenteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesContinente";
		inputMap = this.jButtonNuevoRelacionesContinente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesContinente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoContinenteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarContinente";
		inputMap = this.jButtonModificarContinente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarContinente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarContinenteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarContinente";
		inputMap = this.jButtonActualizarContinente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarContinente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarContinenteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarContinente";
		inputMap = this.jButtonEliminarContinente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarContinente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarContinenteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarContinente";
		inputMap = this.jButtonCancelarContinente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarContinente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarContinenteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarContinente";
		inputMap = this.jButtonCerrarContinente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarContinente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarContinenteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormContinente.jButtonGuardarCambiosContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosContinente";
		inputMap = this.jInternalFrameDetalleFormContinente.jButtonGuardarCambiosContinente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormContinente.jButtonGuardarCambiosContinente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosContinenteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosContinente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosContinenteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesContinente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesContinenteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarContinente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarContinenteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralContinente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralContinenteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContinente.jButtonidContinenteBusqueda.addActionListener(new ButtonActionListener(this,"idContinenteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContinente.jButtoncodigoContinenteBusqueda.addActionListener(new ButtonActionListener(this,"codigoContinenteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContinente.jButtonnombreContinenteBusqueda.addActionListener(new ButtonActionListener(this,"nombreContinenteBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionContinente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionContinenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarContinenteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarContinente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosContinente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Continente continenteAux:this.continenteLogic.getContinentes()) {
					continenteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Continente continenteAux:continentes) {
					continenteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosContinenteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingContinente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Continente continenteAux:this.continenteLogic.getContinentes()) {
						continenteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Continente continenteAux:continentes) {
						continenteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Continente continenteAux:this.continenteLogic.getContinentes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Continente continenteAux:continentes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaContinente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosContinente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosContinente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosContinente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosContinenteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingContinente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosContinente.getSelectedRows();
			
			Continente continenteLocal=new Continente();
			
			//this.seleccionarTodosContinente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					continenteLocal =(Continente) this.continenteLogic.getContinentes().toArray()[this.jTableDatosContinente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					continenteLocal =(Continente) this.continentes.toArray()[this.jTableDatosContinente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				continenteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Continente continenteAux:this.continenteLogic.getContinentes()) {
						continenteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Continente continenteAux:continentes) {
						continenteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaContinente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosContinente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosContinente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosContinente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualContinenteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarContinenteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralContinenteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingContinente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralContinente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Continente continenteAux:this.continenteLogic.getContinentes()) {
				
						if(sTipoSeleccionar.equals(ContinenteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							continenteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContinenteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							continenteAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Continente continenteAux:continentes) {
					
						if(sTipoSeleccionar.equals(ContinenteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							continenteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContinenteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							continenteAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaContinente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesContinenteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingContinente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioContinente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesContinente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormContinente.jComboBoxTiposAccionesFormularioContinente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteContinente) {				
					conSplash=true;//false;										
					
					//this.startProcessContinente(conSplash);
				
					this.generarReporteContinentesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesContinente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormContinente.jComboBoxTiposAccionesFormularioContinente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoContinentesSeleccionados();
				//this.jComboBoxTiposAccionesContinente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoContinentesSeleccionados(false);
				//this.jComboBoxTiposAccionesContinente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoContinentesSeleccionados(true);
				//this.jComboBoxTiposAccionesContinente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessContinente();
				
				this.exportarContinentesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesContinente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormContinente.jComboBoxTiposAccionesFormularioContinente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionContinentes();
				//this.importarContinentes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesContinente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormContinente.jComboBoxTiposAccionesFormularioContinente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessContinente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelContinentesSeleccionados();
				//this.jComboBoxTiposAccionesContinente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Continente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessContinente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoContinente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyContinente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Continente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesContinente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormContinente.jComboBoxTiposAccionesFormularioContinente.setSelectedIndex(0);					
				}	
			} 			
			else if(ContinenteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteContinente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessContinente(conSplash);
					
						//this.actualizarParametrosGeneralContinente();
						
						this.generarReporteProcesoAccionContinentesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesContinente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormContinente.jComboBoxTiposAccionesFormularioContinente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ContinenteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ContinenteS SELECCIONADOS?", "MANTENIMIENTO DE Continente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessContinente();
				
						this.actualizarParametrosGeneralContinente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.continenteReturnGeneral=continenteLogic.procesarAccionContinentesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.continenteLogic.getContinentes(),this.continenteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarContinenteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesContinente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormContinente.jComboBoxTiposAccionesFormularioContinente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralContinente();
					
					ContinenteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarContinenteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesContinente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormContinente.jComboBoxTiposAccionesFormularioContinente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessContinente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesContinenteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessContinente();
			
			if(this.jInternalFrameDetalleFormContinente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Continente> continentesSeleccionados=new ArrayList<Continente>();		
			Continente continente=new Continente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingContinente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesContinente.getSelectedItem();
			
			
			
			
			continentesSeleccionados=this.getContinentesSeleccionados(true);
			//this.sTipoAccion;
			
			if(continentesSeleccionados.size()==1) {
				for(Continente continenteAux:continentesSeleccionados) {
					continente=continenteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Pais")) {
					jButtonPaisActionPerformed(null,rowIndex,true,false,continente);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessContinente();
			
      		//this.finishProcessContinente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarContinenteReturnGeneral() throws Exception {
		if(this.continenteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.continenteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.continenteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.continenteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.continenteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.continenteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingContinente(false);
		}
		
		if(this.continenteReturnGeneral.getConRetornoLista() || this.continenteReturnGeneral.getConRetornoObjeto()) {
			if(this.continenteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.continenteLogic.setContinentes(this.continenteReturnGeneral.getContinentes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.continenteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.continenteLogic.setContinente(this.continenteReturnGeneral.getContinente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingContinente(false);
		}
	}
	
	public void actualizarParametrosGeneralContinente() throws Exception {
		
		
	}
	
	public ArrayList<Continente> getContinentesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Continente> continentesSeleccionados=new ArrayList<Continente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioContinente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Continente continenteAux:continenteLogic.getContinentes()) {
					if(continenteAux.getIsSelected()) {
						continentesSeleccionados.add(continenteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Continente continenteAux:this.continentes) {
					if(continenteAux.getIsSelected()) {
						continentesSeleccionados.add(continenteAux);				
					}
				}
			}
			
			if(continentesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						continentesSeleccionados.addAll(this.continenteLogic.getContinentes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						continentesSeleccionados.addAll(this.continentes);				
					}
				}
			}
		} else {
			continentesSeleccionados.add(this.continente);
		}
		
		return continentesSeleccionados;
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
	
	public void generarReporteContinentesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalContinentesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoContinentesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoContinentesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoContinentesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesContinentesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Continente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesContinentesSeleccionados() throws Exception {
		ArrayList<Continente> continentesSeleccionados=new ArrayList<Continente>();		
		
		continentesSeleccionados=this.getContinentesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteContinentes("Todos",continentesSeleccionados);
		
	}	
	
	public void generarReporteNormalContinentesSeleccionados() throws Exception {
		ArrayList<Continente> continentesSeleccionados=new ArrayList<Continente>();		
		
		continentesSeleccionados=this.getContinentesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteContinentes("Todos",continentesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionContinentesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Continente> continentesSeleccionados=new ArrayList<Continente>();
		
		continentesSeleccionados=this.getContinentesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteContinentes("Todos",continentesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoContinentesSeleccionados() throws Exception {
		ArrayList<Continente> continentesSeleccionados=new ArrayList<Continente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoContinente();
		
		
		continentesSeleccionados=this.getContinentesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoContinente();
		
		
		//this.generarReporteContinentes("Todos",continentesSeleccionados ,continenteImplementable,continenteImplementableHome);
	}
	
	public void mostrarImportacionContinentes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionContinente();
		
		this.abrirFrameImportacionContinente();		
		
			
		//this.generarReporteContinentes("Todos",continentesSeleccionados ,continenteImplementable,continenteImplementableHome);
	}
	
	public void importarContinentes() throws Exception {		
	
	}
	
	public void exportarContinentesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelContinentesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoContinentesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlContinentesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Continente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoContinentesSeleccionados() throws Exception {
		ArrayList<Continente> continentesSeleccionados=new ArrayList<Continente>();		
		
		continentesSeleccionados=this.getContinentesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"continente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarContinente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Continente continenteAux:continentesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarContinente(continenteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//continenteAux.setsDetalleGeneralEntityReporte(continenteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.continenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Continente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarContinente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ContinenteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContinenteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContinenteConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContinenteConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarContinente(Continente continente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=continente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=continente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=continente.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=continente.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelContinentesSeleccionados() throws Exception {
		ArrayList<Continente> continentesSeleccionados=new ArrayList<Continente>();		
		
		continentesSeleccionados=this.getContinentesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"continente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Continentes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelContinente(row);				
				iRow++;
			}				
			
			for(Continente continenteAux:continentesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelContinente(continenteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.continenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Continente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlContinentesSeleccionados() throws Exception {
		ArrayList<Continente> continentesSeleccionados=new ArrayList<Continente>();		
		
		continentesSeleccionados=this.getContinentesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"continente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("continentes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("continente");
			//elementRoot.appendChild(element);
		
			for(Continente continenteAux:continentesSeleccionados) {
				element = document.createElement("continente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlContinente(continenteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.continenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Continente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelContinente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ContinenteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ContinenteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ContinenteConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ContinenteConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelContinente(Continente continente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(continente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(continente.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(continente.getnombre());				
	}
	
	public void setFilaDatosExportarXmlContinente(Continente continente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ContinenteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(continente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ContinenteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(continente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(ContinenteConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(continente.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ContinenteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(continente.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoContinentesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Continente> continentesSeleccionados=new ArrayList<Continente>();
		
		continentesSeleccionados=this.getContinentesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoContinente(continentesSeleccionados);
		
		this.generarReporteContinentes("Todos",continentesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoContinente(ArrayList<Continente> continentesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Continente continenteAux:continentesSeleccionados) {
				continenteAux.setsDetalleGeneralEntityReporte(continenteAux.toString());
			
				if(sTipoSeleccionar.equals(ContinenteConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					continenteAux.setsDescripcionGeneralEntityReporte1(continenteAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ContinenteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					continenteAux.setsDescripcionGeneralEntityReporte1(continenteAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContinenteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesContinente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoContinente=true;
				this.isVisibilidadCeldaNuevoRelacionesContinente=true;
				this.isVisibilidadCeldaGuardarCambiosContinente=true;
			}
			
			this.isVisibilidadCeldaModificarContinente=false;
			this.isVisibilidadCeldaActualizarContinente=false;
			this.isVisibilidadCeldaEliminarContinente=false;
			this.isVisibilidadCeldaCancelarContinente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContinente=true;
				} else {
					this.isVisibilidadCeldaGuardarContinente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoContinente=false;
			this.isVisibilidadCeldaNuevoRelacionesContinente=false;
			this.isVisibilidadCeldaGuardarCambiosContinente=false;
			this.isVisibilidadCeldaModificarContinente=false;
			this.isVisibilidadCeldaActualizarContinente=true;
			this.isVisibilidadCeldaEliminarContinente=false;
			this.isVisibilidadCeldaCancelarContinente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContinente=true;
				} else {
					this.isVisibilidadCeldaGuardarContinente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoContinente=false;
			this.isVisibilidadCeldaNuevoRelacionesContinente=false;
			this.isVisibilidadCeldaGuardarCambiosContinente=false;
			this.isVisibilidadCeldaModificarContinente=false;
			this.isVisibilidadCeldaActualizarContinente=true;
			this.isVisibilidadCeldaEliminarContinente=true;
			this.isVisibilidadCeldaCancelarContinente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContinente=true;
				} else {
					this.isVisibilidadCeldaGuardarContinente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoContinente=false;
			this.isVisibilidadCeldaNuevoRelacionesContinente=false;
			this.isVisibilidadCeldaGuardarCambiosContinente=false;
			this.isVisibilidadCeldaModificarContinente=false;
			this.isVisibilidadCeldaActualizarContinente=true;
			this.isVisibilidadCeldaEliminarContinente=false;
			this.isVisibilidadCeldaCancelarContinente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContinente=false;
				} else {
					this.isVisibilidadCeldaGuardarContinente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoContinente=true;
			this.isVisibilidadCeldaNuevoRelacionesContinente=true;
			this.isVisibilidadCeldaGuardarCambiosContinente=true;
			this.isVisibilidadCeldaModificarContinente=false;
			this.isVisibilidadCeldaActualizarContinente=false;
			this.isVisibilidadCeldaEliminarContinente=false;
			this.isVisibilidadCeldaCancelarContinente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContinente=true;
				} else {
					this.isVisibilidadCeldaGuardarContinente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoContinente=false;
			this.isVisibilidadCeldaNuevoRelacionesContinente=false;
			this.isVisibilidadCeldaGuardarCambiosContinente=false;
			this.isVisibilidadCeldaActualizarContinente=false;
			this.isVisibilidadCeldaEliminarContinente=false;
			this.isVisibilidadCeldaCancelarContinente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContinente=false;
				} else {
					this.isVisibilidadCeldaGuardarContinente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoContinente=false;
			this.isVisibilidadCeldaNuevoRelacionesContinente=false;
			this.isVisibilidadCeldaGuardarCambiosContinente=false;
			this.isVisibilidadCeldaModificarContinente=true;
			this.isVisibilidadCeldaActualizarContinente=false;
			this.isVisibilidadCeldaEliminarContinente=false;
			this.isVisibilidadCeldaCancelarContinente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContinente=false;
				} else {
					this.isVisibilidadCeldaGuardarContinente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ContinenteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoContinente=true;
			this.isVisibilidadCeldaNuevoRelacionesContinente=true;
			this.isVisibilidadCeldaGuardarCambiosContinente=true;
		} else {
			this.actualizarEstadoPanelsContinente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarContinente=false;
			//this.isVisibilidadCeldaVerFormContinente=false;
			this.isVisibilidadCeldaDuplicarContinente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!continenteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesContinente=false;
		} else {
			this.isVisibilidadCeldaNuevoContinente=false;
			this.isVisibilidadCeldaGuardarCambiosContinente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(continenteSessionBean.getEsGuardarRelacionado()) {
			if(!continenteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesContinente=false;												
			}
			
			this.jButtonCerrarContinente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesContinente=false;
		}
		
		if(!this.permiteMantenimiento(this.continente)) {
			this.isVisibilidadCeldaActualizarContinente=false;
			this.isVisibilidadCeldaEliminarContinente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesContinente() {
		this.isVisibilidadCeldaNuevoContinente=false;
		this.isVisibilidadCeldaGuardarCambiosContinente=false;
	}
	
	public void actualizarEstadoPanelsContinente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionContinente!=null) {
				this.jScrollPanelDatosEdicionContinente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosContinente!=null) {
				this.jScrollPanelDatosContinente.setVisible(true);
			}
			
			if(this.jPanelPaginacionContinente!=null) {
				this.jPanelPaginacionContinente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesContinente!=null) {
				this.jPanelParametrosReportesContinente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionContinente!=null) {
				this.jScrollPanelDatosEdicionContinente.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosContinente!=null) {
				this.jScrollPanelDatosContinente.setVisible(false);
			}
			
			if(this.jPanelPaginacionContinente!=null) {
				this.jPanelPaginacionContinente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesContinente!=null) {
				this.jPanelParametrosReportesContinente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionContinente!=null) {
				this.jScrollPanelDatosEdicionContinente.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosContinente!=null) {
				this.jScrollPanelDatosContinente.setVisible(false);
			}
			
			if(this.jPanelPaginacionContinente!=null) {
				this.jPanelPaginacionContinente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesContinente!=null) {
				this.jPanelParametrosReportesContinente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionContinente!=null) {
				this.jScrollPanelDatosEdicionContinente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosContinente!=null) {
				this.jScrollPanelDatosContinente.setVisible(false);
			}
			
			if(this.jPanelPaginacionContinente!=null) {
				this.jPanelPaginacionContinente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesContinente!=null) {
				this.jPanelParametrosReportesContinente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionContinente!=null) {
				this.jScrollPanelDatosEdicionContinente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosContinente!=null) {
				this.jScrollPanelDatosContinente.setVisible(true);
			}
			
			if(this.jPanelPaginacionContinente!=null) {
				this.jPanelPaginacionContinente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesContinente!=null) {
				this.jPanelParametrosReportesContinente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionContinente!=null) {
				this.jScrollPanelDatosEdicionContinente.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosContinente!=null) {
				this.jScrollPanelDatosContinente.setVisible(true);
			}
			
			if(this.jPanelPaginacionContinente!=null) {
				this.jPanelPaginacionContinente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesContinente!=null) {
				this.jPanelParametrosReportesContinente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionContinente!=null) {
				this.jScrollPanelDatosEdicionContinente.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosContinente!=null) {
				this.jScrollPanelDatosContinente.setVisible(true);
			}
			
			if(this.jPanelPaginacionContinente!=null) {
				this.jPanelPaginacionContinente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesContinente!=null) {
				this.jPanelParametrosReportesContinente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.continenteSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.continenteSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionContinenteParaPaises() throws Exception {
		Boolean isPaginaPopupPais=false;

		try {

			if(this.continenteSessionBean==null) {
				this.continenteSessionBean=new ContinenteSessionBean();
			}

			if(this.jInternalFrameDetalleFormContinente.paisSessionBean==null) {
				this.jInternalFrameDetalleFormContinente.paisSessionBean=new PaisSessionBean();
			}

			this.jInternalFrameDetalleFormContinente.paisSessionBean.setsPathNavegacionActual(continenteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PaisConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormContinente.paisSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPais=this.jInternalFrameDetalleFormContinente.paisSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormContinente.paisSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePais(true);
			this.jInternalFrameDetalleFormContinente.paisSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePais(ContinenteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormContinente.paisSessionBean.setisBusquedaDesdeForeignKeySesionContinente(true);
			this.jInternalFrameDetalleFormContinente.paisSessionBean.setlidContinenteActual(this.idContinenteActual);

			continenteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyContinente(true);
			continenteSessionBean.setlIdContinenteActualForeignKey(this.idContinenteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ContinenteSessionBean continenteSessionBean=new ContinenteSessionBean();
		
		if(this.continenteSessionBean==null) {
			this.continenteSessionBean=new ContinenteSessionBean();
		}
		
		this.continenteSessionBean.setsUltimaBusquedaContinente(this.getsAccionBusqueda());
		this.continenteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.continenteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ContinenteSessionBean continenteSessionBean=new ContinenteSessionBean();
		
		if(this.continenteSessionBean==null) {
			this.continenteSessionBean=new ContinenteSessionBean();
		}
		
		if(this.continenteSessionBean.getsUltimaBusquedaContinente()!=null&&!this.continenteSessionBean.getsUltimaBusquedaContinente().equals("")) {
			this.setsAccionBusqueda(continenteSessionBean.getsUltimaBusquedaContinente());
			this.setiNumeroPaginacion(continenteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(continenteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.continenteSessionBean.setsUltimaBusquedaContinente("");
		this.continenteSessionBean.setiNumeroPaginacion(ContinenteConstantesFunciones.INUMEROPAGINACION);
		this.continenteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaContinente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioContinente() {
		this.updateBorderResaltarBusquedasFormularioContinente();
		this.updateVisibilidadBusquedasFormularioContinente();
		this.updateHabilitarBusquedasFormularioContinente();
	}
	
	public void updateBorderResaltarBusquedasFormularioContinente() {					
	}
	
	public void updateVisibilidadBusquedasFormularioContinente() {
	}
	
	public void updateHabilitarBusquedasFormularioContinente() {
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
	
	public void updateControlesFormularioContinente() throws Exception {

		if(this.jInternalFrameDetalleFormContinente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioContinente();
		this.updateVisibilidadResaltarControlesFormularioContinente();
		this.updateHabilitarResaltarControlesFormularioContinente();
		
	}
	
	public void updateBorderResaltarControlesFormularioContinente() throws Exception {
		if(this.jInternalFrameDetalleFormContinente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.continenteConstantesFunciones.resaltaridContinente!=null && this.jInternalFrameDetalleFormContinente!=null) {this.jInternalFrameDetalleFormContinente.jTextFieldidContinente.setBorder(this.continenteConstantesFunciones.resaltaridContinente);}
		if(this.continenteConstantesFunciones.resaltarcodigoContinente!=null && this.jInternalFrameDetalleFormContinente!=null) {this.jInternalFrameDetalleFormContinente.jTextFieldcodigoContinente.setBorder(this.continenteConstantesFunciones.resaltarcodigoContinente);}
		if(this.continenteConstantesFunciones.resaltarnombreContinente!=null && this.jInternalFrameDetalleFormContinente!=null) {this.jInternalFrameDetalleFormContinente.jTextFieldnombreContinente.setBorder(this.continenteConstantesFunciones.resaltarnombreContinente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioContinente() throws Exception {		
		if(this.jInternalFrameDetalleFormContinente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormContinente!=null) {
	
		//this.jInternalFrameDetalleFormContinente.jTextFieldidContinente.setVisible(this.continenteConstantesFunciones.mostraridContinente);
		this.jInternalFrameDetalleFormContinente.jPanelidContinente.setVisible(this.continenteConstantesFunciones.mostraridContinente);
		//this.jInternalFrameDetalleFormContinente.jTextFieldcodigoContinente.setVisible(this.continenteConstantesFunciones.mostrarcodigoContinente);
		this.jInternalFrameDetalleFormContinente.jPanelcodigoContinente.setVisible(this.continenteConstantesFunciones.mostrarcodigoContinente);
		//this.jInternalFrameDetalleFormContinente.jTextFieldnombreContinente.setVisible(this.continenteConstantesFunciones.mostrarnombreContinente);
		this.jInternalFrameDetalleFormContinente.jPanelnombreContinente.setVisible(this.continenteConstantesFunciones.mostrarnombreContinente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioContinente() throws Exception {
		if(this.jInternalFrameDetalleFormContinente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormContinente!=null) {
	
		this.jInternalFrameDetalleFormContinente.jTextFieldidContinente.setEnabled(this.continenteConstantesFunciones.activaridContinente);
		this.jInternalFrameDetalleFormContinente.jTextFieldcodigoContinente.setEnabled(this.continenteConstantesFunciones.activarcodigoContinente);
		this.jInternalFrameDetalleFormContinente.jTextFieldnombreContinente.setEnabled(this.continenteConstantesFunciones.activarnombreContinente);
		}
	}
	
		
}