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

import com.bydan.erp.seguridad.util.BimestreConstantesFunciones;
import com.bydan.erp.seguridad.util.BimestreParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.BimestreParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.BimestreBean;
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
public class BimestreBeanSwingJInternalFrame extends BimestreJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(BimestreBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Bimestre> bimestreValidator = new ClassValidator<Bimestre>(Bimestre.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Bimestre bimestre;	
	public Bimestre bimestreAux;
	public Bimestre bimestreAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Bimestre bimestreTotales;
	public Long idBimestreActual;
	public Long iIdNuevoBimestre=0L;
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
	
	public Boolean isPermisoTodoBimestre;
	public Boolean isPermisoNuevoBimestre;
	public Boolean isPermisoActualizarBimestre;
	public Boolean isPermisoActualizarOriginalBimestre;
	public Boolean isPermisoEliminarBimestre;
	public Boolean isPermisoGuardarCambiosBimestre;
	public Boolean isPermisoConsultaBimestre;
	public Boolean isPermisoBusquedaBimestre;
	public Boolean isPermisoReporteBimestre;
	public Boolean isPermisoPaginacionMedioBimestre;
	public Boolean isPermisoPaginacionAltoBimestre;
	public Boolean isPermisoPaginacionTodoBimestre;
	public Boolean isPermisoCopiarBimestre;
	public Boolean isPermisoVerFormBimestre;
	public Boolean isPermisoDuplicarBimestre;
	public Boolean isPermisoOrdenBimestre;
	
	
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
	
	public BimestreParameterReturnGeneral bimestreReturnGeneral;
	public BimestreParameterReturnGeneral bimestreParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoBimestre=false;
	public Boolean esParaAccionDesdeFormularioBimestre=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public BimestreLogic bimestreLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Bimestre bimestreBean;
	public BimestreConstantesFunciones bimestreConstantesFunciones;
	//public BimestreParameterReturnGeneral bimestreReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Bimestre> bimestres;	
	//public List<Bimestre> bimestresEliminados;
	//public List<Bimestre> bimestresAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoBimestre=false;
	public Boolean isVisibilidadCeldaDuplicarBimestre=true;
	public Boolean isVisibilidadCeldaCopiarBimestre=true;
	public Boolean isVisibilidadCeldaVerFormBimestre=true;
	public Boolean isVisibilidadCeldaOrdenBimestre=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesBimestre=false;
	public Boolean isVisibilidadCeldaModificarBimestre=false;
	public Boolean isVisibilidadCeldaActualizarBimestre=false;
	public Boolean isVisibilidadCeldaEliminarBimestre=false;
	public Boolean isVisibilidadCeldaCancelarBimestre=false;
	public Boolean isVisibilidadCeldaGuardarBimestre=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosBimestre=false;	
	
	
	
	public Long getiIdNuevoBimestre() {
		return this.iIdNuevoBimestre;
	}

	public void setiIdNuevoBimestre(Long iIdNuevoBimestre) {
		this.iIdNuevoBimestre = iIdNuevoBimestre;
	}
	
	public Long getidBimestreActual() {
		return this.idBimestreActual;
	}

	public void setidBimestreActual(Long idBimestreActual) {
		this.idBimestreActual = idBimestreActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Bimestre getbimestre() {
		return this.bimestre;
	}

	public void setbimestre(Bimestre bimestre) {
		this.bimestre = bimestre;
	}
	
	public Bimestre getbimestreAux() {
		return this.bimestreAux;
	}

	public void setbimestreAux(Bimestre bimestreAux) {
		this.bimestreAux = bimestreAux;
	}				
	
	public Bimestre getbimestreAnterior() {
		return this.bimestreAnterior;
	}

	public void setbimestreAnterior(Bimestre bimestreAnterior) {
		this.bimestreAnterior = bimestreAnterior;
	}	
	
	public Bimestre getbimestreTotales() {
		return this.bimestreTotales;
	}

	public void setbimestreTotales(Bimestre bimestreTotales) {
		this.bimestreTotales = bimestreTotales;
	}	
	
	public Bimestre getbimestreBean() {
		return this.bimestreBean;
	}

	public void setbimestreBean(Bimestre bimestreBean) {
		this.bimestreBean = bimestreBean;
	}	
	
	public BimestreParameterReturnGeneral getbimestreReturnGeneral() {
		return this.bimestreReturnGeneral;
	}

	public void setbimestreReturnGeneral(BimestreParameterReturnGeneral bimestreReturnGeneral) {
		this.bimestreReturnGeneral = bimestreReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public BimestreLogic getBimestreLogic()	{		
		return bimestreLogic;
	}

	public void setBimestreLogic(BimestreLogic bimestreLogic) {
		this.bimestreLogic = bimestreLogic;
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
	
	public Boolean getIsEsNuevoBimestre() {
		return isEsNuevoBimestre;
	}

	public void setIsEsNuevoBimestre(Boolean isEsNuevoBimestre) {
		this.isEsNuevoBimestre = isEsNuevoBimestre;
	}

	public Boolean getEsParaAccionDesdeFormularioBimestre() {
		return esParaAccionDesdeFormularioBimestre;
	}
	
	public void setEsParaAccionDesdeFormularioBimestre(Boolean esParaAccionDesdeFormularioBimestre) {
		this.esParaAccionDesdeFormularioBimestre = esParaAccionDesdeFormularioBimestre;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesBimestre() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			BimestreConstantesFunciones.refrescarForeignKeysDescripcionesBimestre(this.bimestreLogic.getBimestres());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			BimestreConstantesFunciones.refrescarForeignKeysDescripcionesBimestre(this.bimestres);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//bimestreLogic.setBimestres(this.bimestres);
			bimestreLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public BimestreParameterReturnGeneral getBimestreParameterGeneral() {
		return this.bimestreParameterGeneral;
	}
	
	public void setBimestreParameterGeneral(BimestreParameterReturnGeneral bimestreParameterGeneral) {
		this.bimestreParameterGeneral = bimestreParameterGeneral;
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
	
	public Boolean getIsPermisoTodoBimestre() {
		return isPermisoTodoBimestre;
	}

	public void setIsPermisoTodoBimestre(Boolean isPermisoTodoBimestre) {
		this.isPermisoTodoBimestre = isPermisoTodoBimestre;
	}

	public Boolean getIsPermisoNuevoBimestre() {
		return isPermisoNuevoBimestre;
	}

	public void setIsPermisoNuevoBimestre(Boolean isPermisoNuevoBimestre) {
		this.isPermisoNuevoBimestre = isPermisoNuevoBimestre;
	}

	public Boolean getIsPermisoActualizarBimestre() {
		return isPermisoActualizarBimestre;
	}

	public void setIsPermisoActualizarBimestre(Boolean isPermisoActualizarBimestre) {
		this.isPermisoActualizarBimestre = isPermisoActualizarBimestre;
	}

	public Boolean getIsPermisoEliminarBimestre() {
		return isPermisoEliminarBimestre;
	}

	public void setIsPermisoEliminarBimestre(Boolean isPermisoEliminarBimestre) {
		this.isPermisoEliminarBimestre = isPermisoEliminarBimestre;
	}

	public Boolean getIsPermisoGuardarCambiosBimestre() {
		return isPermisoGuardarCambiosBimestre;
	}

	public void setIsPermisoGuardarCambiosBimestre(Boolean isPermisoGuardarCambiosBimestre) {
		this.isPermisoGuardarCambiosBimestre = isPermisoGuardarCambiosBimestre;
	}
	
	public Boolean getIsPermisoConsultaBimestre() {
		return isPermisoConsultaBimestre;
	}

	public void setIsPermisoConsultaBimestre(Boolean isPermisoConsultaBimestre) {
		this.isPermisoConsultaBimestre = isPermisoConsultaBimestre;
	}

	public Boolean getIsPermisoBusquedaBimestre() {
		return isPermisoBusquedaBimestre;
	}

	public void setIsPermisoBusquedaBimestre(Boolean isPermisoBusquedaBimestre) {
		this.isPermisoBusquedaBimestre = isPermisoBusquedaBimestre;
	}

	public Boolean getIsPermisoReporteBimestre() {
		return isPermisoReporteBimestre;
	}

	public void setIsPermisoReporteBimestre(Boolean isPermisoReporteBimestre) {
		this.isPermisoReporteBimestre = isPermisoReporteBimestre;
	}
	
	public Boolean getIsPermisoPaginacionMedioBimestre() {
		return isPermisoPaginacionMedioBimestre;
	}

	public void setIsPermisoPaginacionMedioBimestre(Boolean isPermisoPaginacionMedioBimestre) {
		this.isPermisoPaginacionMedioBimestre = isPermisoPaginacionMedioBimestre;
	}
	
	public Boolean getIsPermisoPaginacionTodoBimestre() {
		return isPermisoPaginacionTodoBimestre;
	}

	public void setIsPermisoPaginacionTodoBimestre(Boolean isPermisoPaginacionTodoBimestre) {
		this.isPermisoPaginacionTodoBimestre = isPermisoPaginacionTodoBimestre;
	}
	
	public Boolean getIsPermisoPaginacionAltoBimestre() {
		return isPermisoPaginacionAltoBimestre;
	}

	public void setIsPermisoPaginacionAltoBimestre(Boolean isPermisoPaginacionAltoBimestre) {
		this.isPermisoPaginacionAltoBimestre = isPermisoPaginacionAltoBimestre;
	}
	
	public Boolean getIsPermisoCopiarBimestre() {
		return isPermisoCopiarBimestre;
	}

	public void setIsPermisoCopiarBimestre(Boolean isPermisoCopiarBimestre) {
		this.isPermisoCopiarBimestre = isPermisoCopiarBimestre;
	}
	
	public Boolean getIsPermisoVerFormBimestre() {
		return isPermisoVerFormBimestre;
	}

	public void setIsPermisoVerFormBimestre(Boolean isPermisoVerFormBimestre) {
		this.isPermisoVerFormBimestre = isPermisoVerFormBimestre;
	}
	
	public Boolean getIsPermisoDuplicarBimestre() {
		return isPermisoDuplicarBimestre;
	}

	public void setIsPermisoDuplicarBimestre(Boolean isPermisoDuplicarBimestre) {
		this.isPermisoDuplicarBimestre = isPermisoDuplicarBimestre;
	}
	
	public Boolean getIsPermisoOrdenBimestre() {
		return isPermisoOrdenBimestre;
	}

	public void setIsPermisoOrdenBimestre(Boolean isPermisoOrdenBimestre) {
		this.isPermisoOrdenBimestre = isPermisoOrdenBimestre;
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
	
	public Boolean getIsVisibilidadCeldaNuevoBimestre() {
		return isVisibilidadCeldaNuevoBimestre;
	}

	public void setIsVisibilidadCeldaNuevoBimestre(Boolean isVisibilidadCeldaNuevoBimestre) {
		this.isVisibilidadCeldaNuevoBimestre = isVisibilidadCeldaNuevoBimestre;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarBimestre() {
		return isVisibilidadCeldaDuplicarBimestre;
	}

	public void setIsVisibilidadCeldaDuplicarBimestre(Boolean isVisibilidadCeldaDuplicarBimestre) {
		this.isVisibilidadCeldaDuplicarBimestre = isVisibilidadCeldaDuplicarBimestre;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarBimestre() {
		return isVisibilidadCeldaCopiarBimestre;
	}

	public void setIsVisibilidadCeldaCopiarBimestre(Boolean isVisibilidadCeldaCopiarBimestre) {
		this.isVisibilidadCeldaCopiarBimestre = isVisibilidadCeldaCopiarBimestre;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormBimestre() {
		return isVisibilidadCeldaVerFormBimestre;
	}

	public void setIsVisibilidadCeldaVerFormBimestre(Boolean isVisibilidadCeldaVerFormBimestre) {
		this.isVisibilidadCeldaVerFormBimestre = isVisibilidadCeldaVerFormBimestre;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenBimestre() {
		return isVisibilidadCeldaOrdenBimestre;
	}

	public void setIsVisibilidadCeldaOrdenBimestre(Boolean isVisibilidadCeldaOrdenBimestre) {
		this.isVisibilidadCeldaOrdenBimestre = isVisibilidadCeldaOrdenBimestre;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesBimestre() {
		return isVisibilidadCeldaNuevoRelacionesBimestre;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesBimestre(Boolean isVisibilidadCeldaNuevoRelacionesBimestre) {
		this.isVisibilidadCeldaNuevoRelacionesBimestre = isVisibilidadCeldaNuevoRelacionesBimestre;
	}
	
	public Boolean getIsVisibilidadCeldaModificarBimestre() {
		return isVisibilidadCeldaModificarBimestre;
	}

	public void setIsVisibilidadCeldaModificarBimestre(Boolean isVisibilidadCeldaModificarBimestre) {
		this.isVisibilidadCeldaModificarBimestre = isVisibilidadCeldaModificarBimestre;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarBimestre() {
		return isVisibilidadCeldaActualizarBimestre;
	}

	public void setIsVisibilidadCeldaActualizarBimestre(Boolean isVisibilidadCeldaActualizarBimestre) {
		this.isVisibilidadCeldaActualizarBimestre = isVisibilidadCeldaActualizarBimestre;
	}

	public Boolean getIsVisibilidadCeldaEliminarBimestre() {
		return isVisibilidadCeldaEliminarBimestre;
	}

	public void setIsVisibilidadCeldaEliminarBimestre(Boolean isVisibilidadCeldaEliminarBimestre) {
		this.isVisibilidadCeldaEliminarBimestre = isVisibilidadCeldaEliminarBimestre;
	}

	public Boolean getIsVisibilidadCeldaCancelarBimestre() {
		return isVisibilidadCeldaCancelarBimestre;
	}

	public void setIsVisibilidadCeldaCancelarBimestre(Boolean isVisibilidadCeldaCancelarBimestre) {
		this.isVisibilidadCeldaCancelarBimestre = isVisibilidadCeldaCancelarBimestre;
	}

	public Boolean getIsVisibilidadCeldaGuardarBimestre() {
		return isVisibilidadCeldaGuardarBimestre;
	}

	public void setIsVisibilidadCeldaGuardarBimestre(Boolean isVisibilidadCeldaGuardarBimestre) {
		this.isVisibilidadCeldaGuardarBimestre = isVisibilidadCeldaGuardarBimestre;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosBimestre() {
		return isVisibilidadCeldaGuardarCambiosBimestre;
	}

	public void setIsVisibilidadCeldaGuardarCambiosBimestre(Boolean isVisibilidadCeldaGuardarCambiosBimestre) {
		this.isVisibilidadCeldaGuardarCambiosBimestre = isVisibilidadCeldaGuardarCambiosBimestre;
	}
		
	public BimestreSessionBean getbimestreSessionBean() {
		return this.bimestreSessionBean;
	}
	
	public void setbimestreSessionBean(BimestreSessionBean bimestreSessionBean) {
		this.bimestreSessionBean=bimestreSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysBimestre(Bimestre bimestre)throws Exception {
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
	
	public void bugActualizarReferenciaActual(Bimestre bimestre,Bimestre bimestreAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalBimestre(bimestre);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		bimestreAux.setId(bimestre.getId());
		bimestreAux.setVersionRow(bimestre.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessBimestre();
		
			int intSelectedRow = this.jTableDatosBimestre.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestre =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.bimestre =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(BimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualBimestre(this.bimestre,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysBimestre(this.bimestre);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = bimestreValidator.getInvalidValues(this.bimestre);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			bimestreLogic.setDatosCliente(datosCliente);
			bimestreLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				bimestreAux=new  Bimestre();
				
				bimestreAux.setIsNew(true);
				bimestreAux.setIsChanged(true);
				
				bimestreAux.setBimestreOriginal(this.bimestre);
				
				bimestreAux.setId(this.bimestre.getId());	
				bimestreAux.setVersionRow(this.bimestre.getVersionRow());	
				bimestreAux.setnombre(this.bimestre.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.bimestreSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.bimestreSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(bimestreAux,bimestreLogic.getBimestres());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bimestreAux,bimestres);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.bimestreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bimestreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bimestreLogic.saveBimestres();//WithConnection
						//bimestreLogic.getSetVersionRowBimestres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.bimestre,bimestreAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				bimestreAux=new  Bimestre();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.bimestreSessionBean.getEsGuardarRelacionado() 
					|| (this.bimestreSessionBean.getEsGuardarRelacionado() && this.bimestre.getId()>=0)) {
						
					bimestreAux.setIsNew(false);
				}
				
				bimestreAux.setIsDeleted(false);
			
				bimestreAux.setId(this.bimestre.getId());	
				bimestreAux.setVersionRow(this.bimestre.getVersionRow());	
				bimestreAux.setnombre(this.bimestre.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(bimestreAux,bimestreLogic.getBimestres());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bimestreAux,bimestres);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.bimestreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bimestreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bimestreLogic.saveBimestres();//WithConnection
						//bimestreLogic.getSetVersionRowBimestres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.bimestre,bimestreAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				bimestreAux=new  Bimestre();
				
				bimestreAux.setIsNew(false);
				bimestreAux.setIsChanged(false);
				
				bimestreAux.setIsDeleted(true);
				
				bimestreAux.setId(this.bimestre.getId());	
				bimestreAux.setVersionRow(this.bimestre.getVersionRow());	
				bimestreAux.setnombre(this.bimestre.getnombre());	
				
				if(this.bimestreSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.bimestreAux.getId()>=0) {	
						this.bimestresEliminados.add(bimestreAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(bimestreAux,bimestreLogic.getBimestres());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bimestreAux,bimestres);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.bimestreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bimestreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bimestreLogic.saveBimestres();//WithConnection
						//bimestreLogic.getSetVersionRowBimestres();//WithConnection
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
					this.bimestreLogic.getBimestres().addAll(this.bimestresEliminados);
					
					bimestreLogic.saveBimestres();//WithConnection
					//bimestreLogic.getSetVersionRowBimestres();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.bimestresEliminados= new ArrayList<Bimestre>();		
			}
			
			if(this.bimestreSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Bimestre GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Bimestre",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.bimestre=bimestreAux;
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
      		//this.finishProcessBimestre();
      	}
		
	}	
	
	public void actualizarRelaciones(Bimestre bimestreLocal) throws Exception {
		
		if(this.bimestreSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Bimestre bimestreLocal) throws Exception {	
		if(this.bimestreSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarBimestreActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosBimestre.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.bimestre =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.bimestre =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = bimestreValidator.getInvalidValues(this.bimestre);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Bimestre bimestre,List<Bimestre> bimestres) throws Exception {
		try	{		
			BimestreConstantesFunciones.actualizarLista(bimestre,bimestres,this.bimestreSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Bimestre bimestre,List<Bimestre> bimestres) throws Exception {
		try	{			
			BimestreConstantesFunciones.actualizarSelectedLista(bimestre,bimestres);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Bimestre> bimestresLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				bimestresLocal=this.bimestreLogic.getBimestres();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				bimestresLocal=this.bimestres;
			}
			//ARCHITECTURE
		
			for(Bimestre bimestreLocal:bimestresLocal) {
				if(this.permiteMantenimiento(bimestreLocal) && bimestreLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+BimestreConstantesFunciones.getBimestreLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(BimestreConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBimestre.jLabelnombreBimestre,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormBimestre!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBimestre.jLabelnombreBimestre,"");
		
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
		this.iIdNuevoBimestre--;	
		
		
		this.bimestreAux=new Bimestre();
		
		this.bimestreAux.setId(this.iIdNuevoBimestre);
		this.bimestreAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.bimestreLogic.getBimestres().add(this.bimestreAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.bimestres.add(this.bimestreAux);
		}
		//ARCHITECTURE
		
		this.bimestre=this.bimestreAux;
		
		if(BimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioBimestre(this.bimestre);
			this.setVariablesObjetoActualToFormularioForeignKeyBimestre(this.bimestre);
		}
				
		//this.setDefaultControlesBimestre();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyBimestre();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyBimestre();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyBimestre();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBimestre(this.bimestreBean,this.bimestre,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysBimestre(this.bimestre);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(BimestreConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.bimestreSessionBean.getConGuardarRelaciones()) {
			classes=BimestreConstantesFunciones.getClassesRelationshipsOfBimestre(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.bimestreReturnGeneral=bimestreLogic.procesarEventosBimestresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bimestreLogic.getBimestres(),this.bimestre,this.bimestreParameterGeneral,this.isEsNuevoBimestre,classes);//this.bimestreLogic.getBimestre()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanBimestre(this.bimestreReturnGeneral,this.bimestreBean,false);
		
		if(this.bimestreReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyBimestre(this.bimestreReturnGeneral.getBimestre());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioBimestre(this.bimestreReturnGeneral.getBimestre());
		}
		
		if(this.bimestreReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioBimestre(this.bimestreReturnGeneral.getBimestre(),classes);//this.bimestreBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualBimestre(this.bimestre,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyBimestre();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyBimestre();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingBimestre(false);
						
			if(bimestreSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(BimestreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBimestre();
			}
			
			this.actualizarVisualTableDatosBimestre();
			
			this.jTableDatosBimestre.setRowSelectionInterval(this.getIndiceNuevoBimestre(), this.getIndiceNuevoBimestre());
			
			this.seleccionarFilaTablaBimestreActual();
						
			this.actualizarEstadoCeldasBotonesBimestre("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesBimestre(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormBimestre.jTextFieldnombreBimestre.setEnabled(isHabilitar && this.bimestreConstantesFunciones.activarnombreBimestre);	
		
	};
	
	public void setDefaultControlesBimestre() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoBimestre(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.bimestreSessionBean.setConGuardarRelaciones(true);			
			this.bimestreSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormBimestre.jTabbedPaneRelacionesBimestre.setVisible(true);
			
					
		} else {
			//this.bimestreSessionBean.setConGuardarRelaciones(false);			
			this.bimestreSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormBimestre.jTabbedPaneRelacionesBimestre.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoBimestre() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Bimestre bimestreAux:this.bimestreLogic.getBimestres()) {
				if(bimestreAux.getId().equals(this.iIdNuevoBimestre)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Bimestre bimestreAux:this.bimestres) {
				if(bimestreAux.getId().equals(this.iIdNuevoBimestre)) {
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
	
	public int getIndiceActualBimestre(Bimestre bimestre,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Bimestre bimestreAux:this.bimestreLogic.getBimestres()) {
				if(bimestreAux.getId().equals(bimestre.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Bimestre bimestreAux:this.bimestres) {
				if(bimestreAux.getId().equals(bimestre.getId())) {
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
	
	public void setCamposBaseDesdeOriginalBimestre(Bimestre bimestreOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Bimestre bimestreAux:this.bimestreLogic.getBimestres()) {
				if(bimestreAux.getBimestreOriginal().getId().equals(bimestreOriginal.getId())) {
					existe=true;
					bimestreOriginal.setId(bimestreAux.getId());
					bimestreOriginal.setVersionRow(bimestreAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Bimestre bimestreAux:this.bimestres) {
				if(bimestreAux.getBimestreOriginal().getId().equals(bimestreOriginal.getId())) {
					existe=true;
					bimestreOriginal.setId(bimestreAux.getId());
					bimestreOriginal.setVersionRow(bimestreAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosBimestre(Boolean esParaCancelar) throws Exception {
		bimestresAux=new ArrayList<Bimestre>();
		bimestreAux=new Bimestre();
		
		if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Bimestre bimestreAux:this.bimestreLogic.getBimestres()) {
					if(bimestreAux.getId()<0) {
						bimestresAux.add(bimestreAux);
					}		
				}
				this.iIdNuevoBimestre=0L;
				this.bimestreLogic.getBimestres().removeAll(bimestresAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Bimestre bimestreAux:this.bimestres) {
					if(bimestreAux.getId()<0) {
						bimestresAux.add(bimestreAux);
					}		
				}
				this.iIdNuevoBimestre=0L;
				this.bimestres.removeAll(bimestresAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoBimestre 
					&& this.bimestreLogic.getBimestres().size()>0
					) {
					bimestreAux=this.bimestreLogic.getBimestres().get(this.bimestreLogic.getBimestres().size() - 1);
				
					if(bimestreAux.getId()<0) {
						this.bimestreLogic.getBimestres().remove(bimestreAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoBimestre && this.bimestres.size()>0) {
					bimestreAux=this.bimestres.get(this.bimestres.size() - 1);
				
					if(bimestreAux.getId()<0) {
						this.bimestres.remove(bimestreAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoBimestre(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(bimestre.getId()<0) {
				this.bimestreLogic.getBimestres().remove(this.bimestre);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(bimestre.getId()<0) {
				this.bimestres.remove(this.bimestre);
			}
		}			
	}
	
	public void setEstadosInicialesBimestre(List<Bimestre> bimestresAux) throws Exception {
		BimestreConstantesFunciones.setEstadosInicialesBimestre(bimestresAux);
	}
	
	public void setEstadosInicialesBimestre(Bimestre bimestreAux) throws Exception {
		BimestreConstantesFunciones.setEstadosInicialesBimestre(bimestreAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarBimestreActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesBimestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarBimestreActual()) {
				if(!this.isEsNuevoBimestre) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesBimestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoBimestre=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarBimestreActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Bimestre ?", "MANTENIMIENTO DE Bimestre", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesBimestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Bimestre bimestre) throws Exception {
		BimestreConstantesFunciones.seleccionarAsignar(this.bimestre,bimestre);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarBimestre=this.isPermisoActualizarOriginalBimestre;
			
			
			this.seleccionarAsignar(bimestre);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BimestreConstantesFunciones.quitarEspaciosBimestre(this.bimestre,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesBimestre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.bimestreSessionBean.setsFuncionBusquedaRapida(this.bimestreSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoBimestre) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosBimestre(esParaCancelar);				
				this.cancelarNuevoBimestre(esParaCancelar);								
			}
			
			this.bimestre=new Bimestre();
			
			this.inicializarBimestre();
			
			this.actualizarEstadoCeldasBotonesBimestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarBimestre() throws Exception {
		try {
			BimestreConstantesFunciones.inicializarBimestre(this.bimestre);
			
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
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.bimestreLogic.getBimestres().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteBimestres(String sAccionBusqueda,List<Bimestre> bimestresParaReportes) throws Exception {
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
					sPathReporteFinal="Bimestre"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="BimestreMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("BimestreMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Bimestre"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Bimestres");		
		parameters.put("busquedapor", BimestreConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceBimestre=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			BimestreConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			BimestreConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceBimestre=new JRBeanArrayDataSource(BimestreJInternalFrame.TraerBimestreBeans(bimestresParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceBimestre);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+BimestreConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+BimestreConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(BimestreBean.TraerBimestreBeans(bimestresParaReportes).toArray()));
							
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
				this.generarExcelReporteBimestres(sAccionBusqueda,sTipoArchivoReporte,bimestresParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalBimestres(sAccionBusqueda,sTipoArchivoReporte,bimestresParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoBimestreActionPerformed(null);
					//this.generarExcelReporteBimestres(sAccionBusqueda,sTipoArchivoReporte,bimestresParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalBimestres(sAccionBusqueda,sTipoArchivoReporte,bimestresParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesBimestres(sAccionBusqueda,sTipoArchivoReporte,bimestresParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesBimestres(sAccionBusqueda,sTipoArchivoReporte,bimestresParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteBimestres(String sAccionBusqueda,String sTipoArchivoReporte,List<Bimestre> bimestresParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bimestre";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Bimestres");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBimestre("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Bimestre bimestre : bimestresParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			BimestreConstantesFunciones.generarExcelReporteDataBimestre("NORMAL",row,workbook,bimestre,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bimestre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderBimestre(String sTipo,Row row,Workbook workbook) {
		
		BimestreConstantesFunciones.generarExcelReporteHeaderBimestre(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalBimestres(String sAccionBusqueda,String sTipoArchivoReporte,List<Bimestre> bimestresParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bimestre_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Bimestres");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Bimestre bimestre : bimestresParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(BimestreConstantesFunciones.getBimestreDescripcion(bimestre));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BimestreConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BimestreConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bimestre.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bimestre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesBimestres(String sAccionBusqueda,String sTipoArchivoReporte,List<Bimestre> bimestresParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Bimestre> bimestresRespaldo=null;
		
		classes=BimestreConstantesFunciones.getClassesRelationshipsOfBimestre(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.bimestreLogic.setDatosCliente(this.datosCliente);
		this.bimestreLogic.setDatosDeep(this.datosDeep);
		this.bimestreLogic.setIsConDeep(true);
		
		bimestresRespaldo=this.bimestreLogic.getBimestres();
		
		this.bimestreLogic.setBimestres(bimestresParaReportes);	
		this.bimestreLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		bimestresParaReportes=this.bimestreLogic.getBimestres();
		this.bimestreLogic.setBimestres(bimestresRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bimestre_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Bimestres");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBimestre("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Bimestre bimestre : bimestresParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderBimestre("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			BimestreConstantesFunciones.generarExcelReporteDataBimestre("NORMAL",row,workbook,bimestre,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(BimestreConstantesFunciones.getBimestreDescripcion(bimestre));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bimestre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoBimestre.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBimestre.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoBimestre.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBimestre.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessBimestre() throws Exception {		
		this.startProcessBimestre(true);
	}
	
	public void startProcessBimestre(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesBimestre, this.jScrollPanelDatosBimestre,this.jPanelPaginacionBimestre, this.jScrollPanelDatosEdicionBimestre, this.jPanelAccionesBimestre,this.jPanelAccionesFormularioBimestre,this.jmenuBarBimestre,this.jmenuBarDetalleBimestre,this.jTtoolBarBimestre,this.jTtoolBarDetalleBimestre);		
		
		final JTabbedPane jTabbedPaneBusquedasBimestre=null; 
		
		final JPanel jPanelParametrosReportesBimestre=this.jPanelParametrosReportesBimestre;
		//final JScrollPane jScrollPanelDatosBimestre=this.jScrollPanelDatosBimestre;
		final JTable jTableDatosBimestre=this.jTableDatosBimestre;		
		final JPanel jPanelPaginacionBimestre=this.jPanelPaginacionBimestre;
		//final JScrollPane jScrollPanelDatosEdicionBimestre=this.jScrollPanelDatosEdicionBimestre;
		final JPanel jPanelAccionesBimestre=this.jPanelAccionesBimestre;
		
		JPanel jPanelCamposAuxiliarBimestre=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarBimestre=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormBimestre!=null) {
			jPanelCamposAuxiliarBimestre=this.jInternalFrameDetalleFormBimestre.jPanelCamposBimestre;
			jPanelAccionesFormularioAuxiliarBimestre=this.jInternalFrameDetalleFormBimestre.jPanelAccionesFormularioBimestre;
		}
		
		final JPanel jPanelCamposBimestre=jPanelCamposAuxiliarBimestre;
		final JPanel jPanelAccionesFormularioBimestre=jPanelAccionesFormularioAuxiliarBimestre;
		
		
		final JMenuBar jmenuBarBimestre=this.jmenuBarBimestre;
		final JToolBar jTtoolBarBimestre=this.jTtoolBarBimestre;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarBimestre=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBimestre=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormBimestre!=null) {
			jmenuBarDetalleAuxiliarBimestre=this.jInternalFrameDetalleFormBimestre.jmenuBarDetalleBimestre;
			jTtoolBarDetalleAuxiliarBimestre=this.jInternalFrameDetalleFormBimestre.jTtoolBarDetalleBimestre;
		}
		
		final JMenuBar jmenuBarDetalleBimestre=jmenuBarDetalleAuxiliarBimestre;
		final JToolBar jTtoolBarDetalleBimestre=jTtoolBarDetalleAuxiliarBimestre;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBimestre;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBimestre;
			processRunnable.jTableDatos=jTableDatosBimestre;
			processRunnable.jPanelCampos=jPanelCamposBimestre;
			processRunnable.jPanelPaginacion=jPanelPaginacionBimestre;
			processRunnable.jPanelAcciones=jPanelAccionesBimestre;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBimestre;
			
			
			processRunnable.jmenuBar=jmenuBarBimestre;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBimestre;
			processRunnable.jTtoolBar=jTtoolBarBimestre;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBimestre;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBimestre ,jPanelParametrosReportesBimestre,jTableDatosBimestre, /*jScrollPanelDatosBimestre,*/jPanelCamposBimestre,jPanelPaginacionBimestre, /*jScrollPanelDatosEdicionBimestre,*/ jPanelAccionesBimestre,jPanelAccionesFormularioBimestre,jmenuBarBimestre,jmenuBarDetalleBimestre,jTtoolBarBimestre,jTtoolBarDetalleBimestre);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesBimestre, jScrollPanelDatosBimestre,jPanelPaginacionBimestre, jScrollPanelDatosEdicionBimestre, jPanelAccionesBimestre,jPanelAccionesFormularioBimestre,jmenuBarBimestre,jmenuBarDetalleBimestre,jTtoolBarBimestre,jTtoolBarDetalleBimestre);
						
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
	
	public void finishProcessBimestre() {// throws Exception 
		this.finishProcessBimestre(true);
	}
	
	public void finishProcessBimestre(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesBimestre, this.jScrollPanelDatosBimestre,this.jPanelPaginacionBimestre, this.jScrollPanelDatosEdicionBimestre, this.jPanelAccionesBimestre,this.jPanelAccionesFormularioBimestre,this.jmenuBarBimestre,this.jmenuBarDetalleBimestre,this.jTtoolBarBimestre,this.jTtoolBarDetalleBimestre);		
		
		final JTabbedPane jTabbedPaneBusquedasBimestre=null; 
		
		final JPanel jPanelParametrosReportesBimestre=this.jPanelParametrosReportesBimestre;
		//final JScrollPane jScrollPanelDatosBimestre=this.jScrollPanelDatosBimestre;
		final JTable jTableDatosBimestre=this.jTableDatosBimestre;		
		final JPanel jPanelPaginacionBimestre=this.jPanelPaginacionBimestre;
		//final JScrollPane jScrollPanelDatosEdicionBimestre=this.jScrollPanelDatosEdicionBimestre;
		final JPanel jPanelAccionesBimestre=this.jPanelAccionesBimestre;
		
		JPanel jPanelCamposAuxiliarBimestre=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarBimestre=new JPanel();
		
		if(this.jInternalFrameDetalleFormBimestre!=null) {
			jPanelCamposAuxiliarBimestre=this.jInternalFrameDetalleFormBimestre.jPanelCamposBimestre;
			jPanelAccionesFormularioAuxiliarBimestre=this.jInternalFrameDetalleFormBimestre.jPanelAccionesFormularioBimestre;
		}
		
		final JPanel jPanelCamposBimestre=jPanelCamposAuxiliarBimestre;
		final JPanel jPanelAccionesFormularioBimestre=jPanelAccionesFormularioAuxiliarBimestre;
		
		
		final JMenuBar jmenuBarBimestre=this.jmenuBarBimestre;		
		final JToolBar jTtoolBarBimestre=this.jTtoolBarBimestre;
				
		JMenuBar jmenuBarDetalleAuxiliarBimestre=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBimestre=new JToolBar();
		
		if(this.jInternalFrameDetalleFormBimestre!=null) {
			jmenuBarDetalleAuxiliarBimestre=this.jInternalFrameDetalleFormBimestre.jmenuBarDetalleBimestre;
			jTtoolBarDetalleAuxiliarBimestre=this.jInternalFrameDetalleFormBimestre.jTtoolBarDetalleBimestre;		
		}
		
		final JMenuBar jmenuBarDetalleBimestre=jmenuBarDetalleAuxiliarBimestre;
		final JToolBar jTtoolBarDetalleBimestre=jTtoolBarDetalleAuxiliarBimestre;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBimestre;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBimestre;
			processRunnable.jTableDatos=jTableDatosBimestre;
			processRunnable.jPanelCampos=jPanelCamposBimestre;
			processRunnable.jPanelPaginacion=jPanelPaginacionBimestre;
			processRunnable.jPanelAcciones=jPanelAccionesBimestre;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBimestre;
			
			
			processRunnable.jmenuBar=jmenuBarBimestre;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBimestre;
			processRunnable.jTtoolBar=jTtoolBarBimestre;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBimestre;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasBimestre ,jPanelParametrosReportesBimestre, jTableDatosBimestre,/*jScrollPanelDatosBimestre,*/jPanelCamposBimestre,jPanelPaginacionBimestre, /*jScrollPanelDatosEdicionBimestre,*/ jPanelAccionesBimestre,jPanelAccionesFormularioBimestre,jmenuBarBimestre,jmenuBarDetalleBimestre,jTtoolBarBimestre,jTtoolBarDetalleBimestre));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesBimestre(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarBimestre(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuBimestre(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarBimestre(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarBimestre,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleBimestre,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuBimestre(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarBimestre,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleBimestre,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.bimestreConstantesFunciones.getsFinalQueryBimestre();
		String  finalQueryPaginacionTodos=this.bimestreConstantesFunciones.getsFinalQueryBimestre();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=BimestreConstantesFunciones.getArrayColumnasGlobalesNoBimestre(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=BimestreConstantesFunciones.getArrayColumnasGlobalesBimestre(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,BimestreConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.bimestresEliminados= new ArrayList<Bimestre>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessBimestre();
		
				///*BimestreSessionBean*/this.bimestreSessionBean=new BimestreSessionBean();
			
			if(this.bimestreSessionBean==null) {
				this.bimestreSessionBean=new BimestreSessionBean();
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
					this.iNumeroPaginacion=BimestreConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=BimestreConstantesFunciones.getClassesForeignKeysOfBimestre(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/bimestre."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			bimestresAux= new ArrayList<Bimestre>();
			
				
			bimestreLogic.setDatosCliente(this.datosCliente);
			bimestreLogic.setDatosDeep(this.datosDeep);
			bimestreLogic.setIsConDeep(true);
			
			
			bimestreLogic.getBimestreDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					bimestreLogic.getTodosBimestres(finalQueryGlobal,pagination);
					
					//bimestreLogic.getTodosBimestresWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(bimestreLogic.getBimestres()==null|| bimestreLogic.getBimestres().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bimestresAux= new ArrayList<Bimestre>();
							bimestresAux.addAll(bimestreLogic.getBimestres());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bimestresAux= new ArrayList<Bimestre>();
							bimestresAux.addAll(bimestres);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bimestreLogic.getTodosBimestres(finalQueryGlobal+"",this.pagination);												
							
							//bimestreLogic.getTodosBimestresWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteBimestres("Todos",bimestreLogic.getBimestres() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bimestreLogic.setBimestres(new ArrayList<Bimestre>());					
							bimestreLogic.getBimestres().addAll(bimestresAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bimestres=new ArrayList<Bimestre>();
							bimestres.addAll(bimestresAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idBimestre=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idBimestre=this.idActual;
				
				} else if(this.idBimestreActual!=null && this.idBimestreActual!=0L) {
					idBimestre=idBimestreActual;
				}
				
					
				this.sDetalleReporte=BimestreConstantesFunciones.getDetalleIndicePorId(idBimestre);
				
				this.bimestres=new ArrayList<Bimestre>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					bimestreLogic.getEntity(idBimestre);
					
					//bimestreLogic.getEntityWithConnection(idBimestre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bimestreLogic.setBimestres(new ArrayList<Bimestre>());
					bimestreLogic.getBimestres().add(bimestreLogic.getBimestre());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bimestres=new ArrayList<Bimestre>();
					this.bimestres.add(bimestre);
				}
				
				if(bimestreLogic.getBimestre()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesBimestre();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessBimestre();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=bimestreLogic.getBimestres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bimestres.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=bimestreLogic.getBimestres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bimestres.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Bimestre bimestre) {
		Boolean permite=true;
		
		if(this.bimestre.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=BimestreConstantesFunciones.getOrderByListaBimestre();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=BimestreConstantesFunciones.getOrderByListaBimestre();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Bimestre bimestre:bimestreLogic.getBimestres()) {
				if(bimestre.getsType().equals(Constantes2.S_TOTALES)) {
					bimestreTotales=bimestre;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Bimestre bimestre:this.bimestres) {
				if(bimestre.getsType().equals(Constantes2.S_TOTALES)) {
					bimestreTotales=bimestre;
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
			this.bimestreAux=new Bimestre();
			this.bimestreAux.setsType(Constantes2.S_TOTALES);
			this.bimestreAux.setIsNew(false);
			this.bimestreAux.setIsChanged(false);
			this.bimestreAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				BimestreConstantesFunciones.TotalizarValoresFilaBimestre(this.bimestreLogic.getBimestres(),this.bimestreAux);
				
				this.bimestreLogic.getBimestres().add(this.bimestreAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				BimestreConstantesFunciones.TotalizarValoresFilaBimestre(this.bimestres,this.bimestreAux);
				
				this.bimestres.add(this.bimestreAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		bimestreTotales=new Bimestre();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.bimestreLogic.getBimestres().remove(bimestreTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.bimestres.remove(bimestreTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		bimestreTotales=new Bimestre();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Bimestre bimestre:bimestreLogic.getBimestres()) {
				if(bimestre.getsType().equals(Constantes2.S_TOTALES)) {
					bimestreTotales=bimestre;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BimestreConstantesFunciones.TotalizarValoresFilaBimestre(this.bimestreLogic.getBimestres(),bimestreTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Bimestre bimestre:this.bimestres) {
				if(bimestre.getsType().equals(Constantes2.S_TOTALES)) {
					bimestreTotales=bimestre;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BimestreConstantesFunciones.TotalizarValoresFilaBimestre(this.bimestres,bimestreTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosBimestre() {
		this.isPermisoTodoBimestre=false;
		this.isPermisoNuevoBimestre=false;
		this.isPermisoActualizarBimestre=false;
		this.isPermisoActualizarOriginalBimestre=false;
		this.isPermisoEliminarBimestre=false;
		this.isPermisoGuardarCambiosBimestre=false;
		this.isPermisoConsultaBimestre=false;
		this.isPermisoBusquedaBimestre=false;
		this.isPermisoReporteBimestre=false;		
		this.isPermisoOrdenBimestre=false;		
		this.isPermisoPaginacionMedioBimestre=false;		
		this.isPermisoPaginacionAltoBimestre=false;
		this.isPermisoPaginacionTodoBimestre=false;
		this.isPermisoCopiarBimestre=false;		
		this.isPermisoVerFormBimestre=false;		
		this.isPermisoDuplicarBimestre=false;		
		this.isPermisoOrdenBimestre=false;		
	}
	
	public void setPermisosUsuarioBimestre(Boolean isPermiso) {
		this.isPermisoTodoBimestre=isPermiso;
		this.isPermisoNuevoBimestre=isPermiso;
		this.isPermisoActualizarBimestre=isPermiso;
		this.isPermisoActualizarOriginalBimestre=isPermiso;
		this.isPermisoEliminarBimestre=isPermiso;
		this.isPermisoGuardarCambiosBimestre=isPermiso;
		this.isPermisoConsultaBimestre=isPermiso;
		this.isPermisoBusquedaBimestre=isPermiso;
		this.isPermisoReporteBimestre=isPermiso;
		this.isPermisoOrdenBimestre=isPermiso;		
		this.isPermisoPaginacionMedioBimestre=isPermiso;		
		this.isPermisoPaginacionAltoBimestre=isPermiso;		
		this.isPermisoPaginacionTodoBimestre=isPermiso;		
		this.isPermisoCopiarBimestre=isPermiso;		
		this.isPermisoVerFormBimestre=isPermiso;		
		this.isPermisoDuplicarBimestre=isPermiso;
		this.isPermisoOrdenBimestre=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioBimestre(Boolean isPermiso) {
		//this.isPermisoTodoBimestre=isPermiso;
		this.isPermisoNuevoBimestre=isPermiso;
		this.isPermisoActualizarBimestre=isPermiso;
		this.isPermisoActualizarOriginalBimestre=isPermiso;
		this.isPermisoEliminarBimestre=isPermiso;
		this.isPermisoGuardarCambiosBimestre=isPermiso;
		//this.isPermisoConsultaBimestre=isPermiso;
		//this.isPermisoBusquedaBimestre=isPermiso;
		//this.isPermisoReporteBimestre=isPermiso;
		//this.isPermisoOrdenBimestre=isPermiso;		
		//this.isPermisoPaginacionMedioBimestre=isPermiso;		
		//this.isPermisoPaginacionAltoBimestre=isPermiso;		
		//this.isPermisoPaginacionTodoBimestre=isPermiso;		
		//this.isPermisoCopiarBimestre=isPermiso;		
		//this.isPermisoDuplicarBimestre=isPermiso;
		//this.isPermisoOrdenBimestre=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioBimestreClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(BimestreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebBimestre(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioBimestreClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioBimestreClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionBimestreClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioBimestreClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioBimestre() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(BimestreJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.bimestreSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, BimestreConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoBimestre=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarBimestre=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalBimestre=this.isPermisoActualizarBimestre;
			this.isPermisoEliminarBimestre=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosBimestre=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaBimestre=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaBimestre=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoBimestre=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteBimestre=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBimestre=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioBimestre=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoBimestre=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoBimestre=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarBimestre=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormBimestre=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarBimestre=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBimestre=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.bimestreSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosBimestre.setToolTipText(this.jTableDatosBimestre.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioBimestre(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioBimestre(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(BimestreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(BimestreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioBimestre() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyBimestreListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyBimestreListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(BimestreJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyBimestreListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyBimestreListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyBimestre()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyBimestre()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyBimestre(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyBimestre()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyBimestre();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyBimestre(Bimestre bimestre)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyBimestre(Bimestre bimestre,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyBimestre()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyBimestre()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyBimestre()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyBimestre()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroBimestre()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyBimestre()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyBimestre(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyBimestre()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public BimestreBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public BimestreBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public BimestreBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.bimestreSessionBean=new BimestreSessionBean(); 
		this.bimestreConstantesFunciones=new BimestreConstantesFunciones(); 
		this.bimestreBean=new Bimestre();//(this.bimestreConstantesFunciones); 		
		this.bimestreReturnGeneral=new BimestreParameterReturnGeneral(); 
		
		this.bimestreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bimestreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public BimestreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public BimestreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public BimestreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessBimestre(true);
			
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
			
			this.bimestreConstantesFunciones=new BimestreConstantesFunciones(); 
			this.bimestreBean=new Bimestre();//this.bimestreConstantesFunciones); 			
			this.bimestreReturnGeneral=new BimestreParameterReturnGeneral(); 
		
			BimestreBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Bimestre Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.bimestre=new Bimestre();
			this.bimestres = new ArrayList<Bimestre>();
			this.bimestresAux = new ArrayList<Bimestre>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic=new BimestreLogic();
				this.bimestreLogic.getNewConnexionToDeep("");
			}
			
			//this.bimestreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.bimestreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormBimestre);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoBimestre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBimestre);	
					}
					
					if(this.jInternalFrameImportacionBimestre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBimestre);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByBimestre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByBimestre);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormBimestre!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormBimestre);
				this.jInternalFrameDetalleFormBimestre.setVisible(false);
				this.jInternalFrameDetalleFormBimestre.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoBimestre!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBimestre);
					this.jInternalFrameReporteDinamicoBimestre.setVisible(false);
					this.jInternalFrameReporteDinamicoBimestre.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionBimestre!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionBimestre);
					this.jInternalFrameImportacionBimestre.setVisible(false);
					this.jInternalFrameImportacionBimestre.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByBimestre!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByBimestre);
					this.jInternalFrameOrderByBimestre.setVisible(false);
					this.jInternalFrameOrderByBimestre.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idBimestreActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=BimestreConstantesFunciones.INUMEROPAGINACION;
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
			
			this.bimestreReturnGeneral=new BimestreParameterReturnGeneral();
			
			this.bimestreParameterGeneral=new BimestreParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.bimestreLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {
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
			
			if(BimestreJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.bimestreSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BimestreConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.bimestreSessionBean.getEsGuardarRelacionado(),this.bimestreSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BimestreConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.bimestreSessionBean.getEsGuardarRelacionado(),this.bimestreSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoBimestre=false;
			this.isVisibilidadCeldaDuplicarBimestre=true;
			this.isVisibilidadCeldaCopiarBimestre=true;
			this.isVisibilidadCeldaVerFormBimestre=true;
			this.isVisibilidadCeldaOrdenBimestre=true;
			this.isVisibilidadCeldaNuevoRelacionesBimestre=false;
			this.isVisibilidadCeldaModificarBimestre=false;
			this.isVisibilidadCeldaActualizarBimestre=false;
			this.isVisibilidadCeldaEliminarBimestre=false;
			this.isVisibilidadCeldaCancelarBimestre=false;
			this.isVisibilidadCeldaGuardarBimestre=false;
			this.isVisibilidadCeldaGuardarCambiosBimestre=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesBimestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosBimestre();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioBimestre(false);
			
			this.setPermisosUsuarioBimestre();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bimestreSessionBean.getEsGuardarRelacionado() 
				|| (this.bimestreSessionBean.getEsGuardarRelacionado() && this.bimestreSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioBimestreClasesRelacionadas();
			}
			
			if(this.bimestreSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioBimestreClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!BimestreJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosBimestre();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualBimestre();
			}
			
			if(!this.isPermisoBusquedaBimestre) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioBimestre,this.isPermisoPaginacionMedioBimestre,this.isPermisoPaginacionTodoBimestre);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(BimestreConstantesFunciones.getTiposSeleccionarBimestre());
				
				this.tiposColumnasSelect=BimestreConstantesFunciones.getTiposSeleccionarBimestre(true);
				
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
			//if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioBimestre();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioBimestre(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioBimestre(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesBimestre() ;
			
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
				bimestreImplementable= (BimestreImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BimestreConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				bimestreImplementableHome= (BimestreImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BimestreConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.bimestres= new ArrayList<Bimestre>();
			this.bimestresEliminados= new ArrayList<Bimestre>();
						
			this.isEsNuevoBimestre=false;
			this.esParaAccionDesdeFormularioBimestre=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyBimestre(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroBimestre();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=BimestreConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesBimestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingBimestre(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormBimestre!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioBimestre();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioBimestre();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessBimestre(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Bimestre: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectBimestre() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesBimestre")) {
				iIndex=this.jInternalFrameDetalleFormBimestre.jTabbedPaneRelacionesBimestre.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormBimestre.jTabbedPaneRelacionesBimestre.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosBimestre.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessBimestre();	
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
	
	public void cargarCombosForeignKeyBimestre(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyBimestre(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyBimestre(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyBimestreListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyBimestre();
		
		this.cargarCombosFrameForeignKeyBimestre();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyBimestre();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyBimestre();
		}
	}
	
	
	
	public void jButtonNuevoBimestreActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.bimestreSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormBimestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
			
			
			if(jTableDatosBimestre.getRowCount()>=1) {
				jTableDatosBimestre.removeRowSelectionInterval(0, jTableDatosBimestre.getRowCount()-1);						
			}
			
			this.isEsNuevoBimestre=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoBimestre(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesBimestre(true);			
			//this.bimestre=new Bimestre();
			//this.bimestre.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBimestre(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBimestre() ;
			
			if(BimestreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBimestre(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.bimestre);	
			this.actualizarInformacion("INFO_PADRE",false,this.bimestre);				
			
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
			
			if(this.bimestreSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Bimestre: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarBimestreActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Bimestre> bimestresSeleccionados=new ArrayList<Bimestre>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosBimestre.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosBimestre.getSelectedRows().length;			
			}
			
			bimestresSeleccionados=this.getBimestresSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoBimestre--;			
				//Bimestre bimestreAux= new Bimestre();			
				//bimestreAux.setId(this.iIdNuevoBimestre);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Bimestre bimestreOrigen=new Bimestre();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Bimestre bimestreOrigen : bimestresSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosBimestre.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							bimestreOrigen =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bimestreOrigen =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaBimestre();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.bimestre.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosBimestre(bimestreOrigen,this.bimestre,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysBimestre(this.bimestre);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.bimestreLogic.getBimestres().add(this.bimestreAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.bimestres.add(this.bimestreAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaBimestre(false);
				
				this.jTableDatosBimestre.setRowSelectionInterval(this.getIndiceNuevoBimestre(), this.getIndiceNuevoBimestre());
				
				int iLastRow =  this.jTableDatosBimestre.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBimestre.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBimestre.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBimestre(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarBimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Bimestre> bimestresSeleccionados=new ArrayList<Bimestre>();									
		
			Bimestre bimestreOrigen=new Bimestre();
			Bimestre bimestreDestino=new Bimestre();
				
			bimestresSeleccionados=this.getBimestresSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosBimestre.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || bimestresSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosBimestre.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bimestreOrigen =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						bimestreOrigen =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bimestreDestino =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						bimestreDestino =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				bimestreOrigen =bimestresSeleccionados.get(0);
				bimestreDestino =bimestresSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosBimestre(bimestreOrigen,bimestreDestino,true,false);
				
				bimestreDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(bimestreDestino,bimestreLogic.getBimestres());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bimestreDestino,bimestres);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaBimestre(false);
				
				//this.jTableDatosBimestre.setRowSelectionInterval(this.getIndiceNuevoBimestre(), this.getIndiceNuevoBimestre());
				
				int iLastRow =  this.jTableDatosBimestre.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBimestre.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBimestre.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBimestre(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormBimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBimestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormBimestre.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarBimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesBimestre.isVisible();
			
			
			this.jPanelParametrosReportesBimestre.setVisible(!isVisible);
			this.jPanelPaginacionBimestre.setVisible(!isVisible);
			this.jPanelAccionesBimestre.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarBimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameBimestre();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoBimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoBimestre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionBimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionBimestre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByBimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByBimestre();
			
			this.abrirFrameOrderByBimestre();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByBimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByBimestre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleBimestre(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormBimestre);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormBimestre.isMaximum()) {
					this.jInternalFrameDetalleFormBimestre.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormBimestre.setSize(this.jInternalFrameDetalleFormBimestre.iWidthFormulario,this.jInternalFrameDetalleFormBimestre.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormBimestre.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormBimestre.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormBimestre.isMaximum()) {
						this.jInternalFrameDetalleFormBimestre.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormBimestre.jContentPaneDetalleBimestre.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormBimestre.jTabbedPaneRelacionesBimestre.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormBimestre.jContentPaneDetalleBimestre.getWidth(),BimestreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBimestre.jTabbedPaneRelacionesBimestre.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormBimestre.jContentPaneDetalleBimestre.getWidth(),BimestreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBimestre.jTabbedPaneRelacionesBimestre.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormBimestre.jContentPaneDetalleBimestre.getWidth(),BimestreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormBimestre.setVisible(true);
	        this.jInternalFrameDetalleFormBimestre.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByBimestre() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByBimestre==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByBimestre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBimestre,false,this);
				} else {
					this.jInternalFrameOrderByBimestre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBimestre,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByBimestre);
				this.jInternalFrameOrderByBimestre.setVisible(false);
				this.jInternalFrameOrderByBimestre.setSelected(false);
				
				this.jInternalFrameOrderByBimestre.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBimestre"));
				
				this.inicializarActualizarBindingTablaOrderByBimestre();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionBimestre() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionBimestre==null) {
				
				this.jInternalFrameImportacionBimestre=new ImportacionJInternalFrame(BimestreConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBimestre);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionBimestre);
				this.jInternalFrameImportacionBimestre.setVisible(false);
				this.jInternalFrameImportacionBimestre.setSelected(false);


				this.jInternalFrameImportacionBimestre.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBimestre"));
				this.jInternalFrameImportacionBimestre.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBimestre"));
				this.jInternalFrameImportacionBimestre.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBimestre"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoBimestre() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoBimestre==null) {
				this.jInternalFrameReporteDinamicoBimestre=new ReporteDinamicoJInternalFrame(BimestreConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBimestre);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBimestre);
				this.jInternalFrameReporteDinamicoBimestre.setVisible(false);
				this.jInternalFrameReporteDinamicoBimestre.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoBimestre.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBimestre"));
				this.jInternalFrameReporteDinamicoBimestre.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBimestre"));
				this.jInternalFrameReporteDinamicoBimestre.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBimestre"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBimestre();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleBimestre() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormBimestre);
			
	       	this.jInternalFrameDetalleFormBimestre.setVisible(false);
	        this.jInternalFrameDetalleFormBimestre.setSelected(false);
			
			//this.jInternalFrameDetalleFormBimestre.dispose();
			//this.jInternalFrameDetalleFormBimestre=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoBimestre() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoBimestre.setVisible(true);
	        this.jInternalFrameReporteDinamicoBimestre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionBimestre() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionBimestre.setVisible(true);
	        this.jInternalFrameImportacionBimestre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByBimestre() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByBimestre.setVisible(true);
	        this.jInternalFrameOrderByBimestre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByBimestre() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByBimestre.setVisible(false);
	        this.jInternalFrameOrderByBimestre.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoBimestre() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoBimestre.setVisible(false);
	        this.jInternalFrameReporteDinamicoBimestre.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionBimestre() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionBimestre.setVisible(false);
	        this.jInternalFrameImportacionBimestre.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarBimestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarBimestre(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarBimestre(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBimestre.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesBimestre(true);
			//this.isEsNuevoBimestre=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestre =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bimestre =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesBimestre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBimestre(false) ;
			
			if(bimestreSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(BimestreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBimestre(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBimestre(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaBimestreActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosBimestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestre =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bimestre =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarBimestre(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBimestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBimestre.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesBimestre(true);
			//this.isEsNuevoBimestre=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestre =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bimestre =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.bimestre.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesBimestre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesBimestre(false) ;
			
			if(BimestreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBimestre(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBimestre(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarBimestreActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesBimestre(false);
			
			//if(!this.isEsNuevoBimestre) {								
				int intSelectedRow = this.jTableDatosBimestre.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestre =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bimestre =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(BimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualBimestre(this.bimestre,true);
				this.setVariablesFormularioToObjetoActualForeignKeysBimestre(this.bimestre);
				
			}
			
			if(this.permiteMantenimiento(this.bimestre)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.bimestreSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoBimestre=true;
					this.inicializarActualizarBindingTablaBimestre(false);
					this.isEsNuevoBimestre=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoBimestre=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoBimestre=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBimestre(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBimestre(false);
				
				this.habilitarDeshabilitarControlesBimestre(false);
			
												
				
				if(BimestreJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleBimestre();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoBimestreActionPerformed(evt,bimestreSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualBimestre(this.bimestre,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosBimestre.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,bimestreSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.bimestre.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Bimestre.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bimestre.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarBimestreActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosBimestre.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestre =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				this.bimestre.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bimestre =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				this.bimestre.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.bimestre)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.bimestreSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((BimestreModel) this.jTableDatosBimestre.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoBimestre=true;
				this.inicializarActualizarBindingTablaBimestre(false);
				this.isEsNuevoBimestre=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBimestre(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBimestre(false);
				
				this.habilitarDeshabilitarControlesBimestre(false);
				
				
				
				if(BimestreJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleBimestre();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarBimestreActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosBimestre.getRowCount()>=1) {
				jTableDatosBimestre.removeRowSelectionInterval(0, jTableDatosBimestre.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesBimestre(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaBimestre(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBimestre(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBimestre(false) ;
			
			this.isEsNuevoBimestre=false;
			
			if(BimestreJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleBimestre();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosBimestreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBimestre(false);
				
				//SI ES MANUAL
				if(BimestreJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualBimestre();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosBimestreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoBimestre--;			
			//Bimestre bimestreAux= new Bimestre();			
			//bimestreAux.setId(this.iIdNuevoBimestre);
			
			if(this.jInternalFrameDetalleFormBimestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaBimestre();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysBimestre(this.bimestre);
			
			this.bimestre.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.bimestreLogic.getBimestres().add(this.bimestreAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.bimestres.add(this.bimestreAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaBimestre(false);
			
			this.jTableDatosBimestre.setRowSelectionInterval(this.getIndiceNuevoBimestre(), this.getIndiceNuevoBimestre());
			
			int iLastRow =  this.jTableDatosBimestre.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosBimestre.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosBimestre.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaBimestre(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionBimestreActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingBimestre(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBimestre(false);
			
			//SI ES MANUAL
			if(BimestreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBimestre();
			}
			
			//this.abrirFrameTreeBimestre();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionBimestreActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE BimestreS ?", "MANTENIMIENTO DE Bimestre", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionBimestre.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralBimestre();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.bimestreReturnGeneral=bimestreLogic.procesarImportacionBimestresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.bimestreParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarBimestreReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionBimestreActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionBimestre.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionBimestre.setFileImportacion(this.jInternalFrameImportacionBimestre.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionBimestre.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionBimestre.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionBimestre.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionBimestre.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoBimestreActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Bimestre> bimestresSeleccionados=new ArrayList<Bimestre>();		

		bimestresSeleccionados=this.getBimestresSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBimestre.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBimestre.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("BimestreBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"BimestreBaseDesign.jrxml";
			
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
			
			this.generarReporteBimestres("Todos",bimestresSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bimestre",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoBimestre.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBimestre.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BimestreConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoBimestre.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoBimestre.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoBimestre.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case BimestreConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoBimestre.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case BimestreConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoBimestre.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBimestre.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BimestreConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoBimestreActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Bimestre> bimestresSeleccionados=new ArrayList<Bimestre>();		
		
		bimestresSeleccionados=this.getBimestresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bimestre";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Bimestres");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoBimestre.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoBimestre.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case BimestreConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BimestreConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Bimestre bimestre:bimestresSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bimestre.getnombre());
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
			//	this.getFilaCabeceraExportarExcelBimestre(row);				
			//	iRow++;
			//}				
			
			//for(Bimestre bimestreAux:bimestresSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelBimestre(bimestreAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bimestre",JOptionPane.INFORMATION_MESSAGE);
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
				this.bimestreLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBimestre(false);
			
			//SI ES MANUAL
			if(BimestreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBimestre();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresBimestreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBimestre(false);
			
			//SI ES MANUAL
			if(BimestreJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBimestre();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesBimestreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBimestre(false);
			
			//SI ES MANUAL
			if(BimestreJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBimestre();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bimestreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaBimestre() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosBimestre.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosBimestre.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosBimestre.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosBimestre.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosBimestre.setMinimumSize(dimensionMinimum);
		this.jTableDatosBimestre.setMaximumSize(dimensionMaximum);
		this.jTableDatosBimestre.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingBimestre(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingBimestre(esInicializar,true);
	}
	
	public void inicializarActualizarBindingBimestre(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaBimestre(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesBimestre(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasBimestre(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBimestre(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesBimestre(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !BimestreJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!BimestreJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualBimestre() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaBimestre();
		
		this.inicializarActualizarBindingBotonesManualBimestre(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualBimestre();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBimestre() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualBimestre(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualBimestre(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosBimestre.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosBimestre.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteBimestre.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormBimestre!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormBimestre.jCheckBoxPostAccionNuevoBimestre.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormBimestre.jCheckBoxPostAccionSinCerrarBimestre.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormBimestre.jCheckBoxPostAccionSinMensajeBimestre.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosBimestre.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosBimestre.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteBimestre.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormBimestre!=null) {
				this.jInternalFrameDetalleFormBimestre.jCheckBoxPostAccionNuevoBimestre.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormBimestre.jCheckBoxPostAccionSinCerrarBimestre.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormBimestre.jCheckBoxPostAccionSinMensajeBimestre.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionBimestre.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionBimestre.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormBimestre!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormBimestre.jComboBoxTiposAccionesFormularioBimestre.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesBimestre.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoBimestre!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBimestre.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesBimestre.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesBimestre.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarBimestre.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesBimestre.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoBimestre!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBimestre.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesBimestre.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralBimestre.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesBimestre(Boolean esInicializar) throws Exception {
		try	{	
			if(BimestreJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualBimestre(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesBimestre() throws Exception {
		try	{
			if(BimestreJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualBimestre();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBimestre() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormBimestre.jComboBoxTiposAccionesFormularioBimestre.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormBimestre.jComboBoxTiposAccionesFormularioBimestre.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualBimestre() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesBimestre.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesBimestre.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesBimestre.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesBimestre.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesBimestre.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesBimestre.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionBimestre.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionBimestre.addItem(reporte);
			}
			
			
			if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionBimestre.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionBimestre.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesBimestre.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesBimestre.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesBimestre.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesBimestre.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormBimestre.jComboBoxTiposAccionesFormularioBimestre.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormBimestre.jComboBoxTiposAccionesFormularioBimestre.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarBimestre.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarBimestre.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarBimestre.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBimestre();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBimestre() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBimestre!=null) {
				this.jInternalFrameReporteDinamicoBimestre.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoBimestre.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBimestre!=null) {
				this.jInternalFrameReporteDinamicoBimestre.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoBimestre.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoBimestre!=null) {
				
				if(this.jInternalFrameReporteDinamicoBimestre.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBimestre.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBimestre.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoBimestre.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBimestre.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBimestre.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualBimestre()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasBimestre(Boolean esInicializar) throws Exception {				
		if(BimestreJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualBimestre();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaBimestre() throws Exception {
		this.inicializarActualizarBindingTablaBimestre(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByBimestre() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByBimestre.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByBimestre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBimestre.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new BimestrePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByBimestre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBimestre.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new BimestrePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosBimestreOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBimestreOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new BimestrePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByBimestre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBimestre.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new BimestrePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByBimestre.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaBimestre(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=bimestreLogic.getBimestres().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=bimestres.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(BimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosBimestre.setModel(new BimestreModel(this.bimestreLogic.getBimestres(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosBimestre.setModel(new BimestreModel(this.bimestres,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByBimestre!=null && this.jInternalFrameOrderByBimestre.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByBimestre();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosBimestre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBimestre,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new BimestrePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+BimestreConstantesFunciones.SCLASSWEBTITULO,bimestreConstantesFunciones.resaltarSeleccionarBimestre,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+BimestreConstantesFunciones.SCLASSWEBTITULO,bimestreConstantesFunciones.resaltarSeleccionarBimestre,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosBimestre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBimestre,BimestreConstantesFunciones.LABEL_ID));

		if(this.bimestreConstantesFunciones.mostraridBimestre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BimestreConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bimestreConstantesFunciones.resaltaridBimestre,this.bimestreConstantesFunciones.activaridBimestre,this,true,"idBimestre","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bimestreConstantesFunciones.resaltaridBimestre,this.bimestreConstantesFunciones.activaridBimestre,this,true,"idBimestre","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBimestre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBimestre,BimestreConstantesFunciones.LABEL_NOMBRE));

		if(this.bimestreConstantesFunciones.mostrarnombreBimestre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BimestreConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bimestreConstantesFunciones.resaltarnombreBimestre,this.bimestreConstantesFunciones.activarnombreBimestre,this,true,"nombreBimestre","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bimestreConstantesFunciones.resaltarnombreBimestre,this.bimestreConstantesFunciones.activarnombreBimestre,this,true,"nombreBimestre","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BimestrePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.bimestreSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.bimestreSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.bimestreSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBimestre.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.bimestreSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.bimestreSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBimestre.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarBimestre && this.isPermisoGuardarCambiosBimestre) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.bimestreSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.bimestreSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosBimestre.addColumn(tableColumn);
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
			
			this.jTableDatosBimestre.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBimestre && this.isPermisoGuardarCambiosBimestre) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBimestre && this.isPermisoGuardarCambiosBimestre) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosBimestre.moveColumn(this.jTableDatosBimestre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosBimestre.moveColumn(this.jTableDatosBimestre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosBimestre.moveColumn(this.jTableDatosBimestre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosBimestre.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosBimestre.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosBimestre,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!BimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosBimestre.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosBimestre.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!BimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!BimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosBimestre.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosBimestre.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosBimestre.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=bimestreLogic.getBimestres().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=bimestres.size()-1;
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
		//this.jTableDatosBimestre.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosBimestre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosBimestre();
			
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
				
				//this.isEsNuevoBimestre=false;
					
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
			
				if(this.bimestreSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormBimestre==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBimestre.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBimestre.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestre =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bimestre =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.bimestre.getsType().equals("DUPLICADO")
				   || this.bimestre.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoBimestre=true;
				
				} else {
					this.isEsNuevoBimestre=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {
					if(this.bimestre.getId()>=0 && !this.bimestre.getIsNew()) {						
						this.isEsNuevoBimestre=false;
						
					} else {
						this.isEsNuevoBimestre=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoBimestre(esRelaciones);						
				
				this.seleccionarBimestre(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.bimestre.getId()<0) {
					this.isEsNuevoBimestre=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarBimestre(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarBimestre(evt,rowIndex);
				}	
				
				if(this.bimestreSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Bimestre: " + this.dDif); 
					}
				}								
				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarBimestre(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.bimestre)) {
					if(this.bimestre.getId()>0) {
						this.bimestre.setIsDeleted(true);
						
						this.bimestresEliminados.add(this.bimestre);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.bimestreLogic.getBimestres().remove(this.bimestre);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.bimestres.remove(this.bimestre);				
					}
					
					
					((BimestreModel) this.jTableDatosBimestre.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaBimestre(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarBimestre(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoBimestre) {
			
			if(this.jInternalFrameDetalleFormBimestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBimestre.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBimestre.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestre =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bimestre =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(BimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioBimestre(this.bimestre);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesBimestre("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesBimestre(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBimestre() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoBimestre(Bimestre bimestre) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoBimestre(bimestre,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoBimestre(Bimestre bimestre,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioBimestre(bimestre);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyBimestre(bimestre,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyBimestre(bimestre);
	}
	
	public void setVariablesObjetoActualToFormularioBimestre(Bimestre bimestre) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormBimestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormBimestre.jTextFieldidBimestre.setText(bimestre.getId().toString());
			this.jInternalFrameDetalleFormBimestre.jTextFieldnombreBimestre.setText(bimestre.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Bimestre bimestreLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,bimestreLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Bimestre bimestreLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				bimestreLocal=this.bimestre;
			} else {
				bimestreLocal=this.bimestreAnterior;
			}
		}
		
		if(this.permiteMantenimiento(bimestreLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoBimestre(bimestreLocal,true);
					
					if(bimestreSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(bimestreLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.bimestreSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(bimestreLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoBimestre(Bimestre bimestre,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBimestre(bimestre,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysBimestre(bimestre);
	}
	
	public void setVariablesFormularioToObjetoActualBimestre(Bimestre bimestre,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBimestre(bimestre,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualBimestre(Bimestre bimestre,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormBimestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormBimestre.jTextFieldidBimestre.getText()==null || this.jInternalFrameDetalleFormBimestre.jTextFieldidBimestre.getText()=="" || this.jInternalFrameDetalleFormBimestre.jTextFieldidBimestre.getText()=="Id") {
				this.jInternalFrameDetalleFormBimestre.jTextFieldidBimestre.setText("0");
			}

			if(conColumnasBase) {bimestre.setId(Long.parseLong(this.jInternalFrameDetalleFormBimestre.jTextFieldidBimestre.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BimestreConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBimestre.jLabelIdBimestre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bimestre.setnombre(this.jInternalFrameDetalleFormBimestre.jTextFieldnombreBimestre.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BimestreConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBimestre.jLabelnombreBimestre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBimestre(Bimestre bimestreBean,Bimestre bimestre,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosBimestre(Bimestre bimestreOrigen,Bimestre bimestre,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && bimestreOrigen.getId()!=null && !bimestreOrigen.getId().equals(0L))) {bimestre.setId(bimestreOrigen.getId());}}
			if(conDefault || (!conDefault && bimestreOrigen.getnombre()!=null && !bimestreOrigen.getnombre().equals(""))) {bimestre.setnombre(bimestreOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBimestre(Bimestre bimestre) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBimestre.jTextFieldidBimestre.setText(bimestre.getId().toString());
			this.jInternalFrameDetalleFormBimestre.jTextFieldnombreBimestre.setText(bimestre.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBimestre(BimestreBean bimestreBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBimestre.jTextFieldidBimestre.setText(bimestreBean.getId().toString());
			this.jInternalFrameDetalleFormBimestre.jTextFieldnombreBimestre.setText(bimestreBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanBimestre(BimestreParameterReturnGeneral bimestreReturnGeneral,BimestreBean bimestreBean,Boolean conDefault) throws Exception { 
		try {
			Bimestre bimestreLocal=new Bimestre();
			
			bimestreLocal=bimestreReturnGeneral.getBimestre();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && bimestreLocal.getId()!=null && !bimestreLocal.getId().equals(0L))) {bimestreBean.setId(bimestreLocal.getId());}}
			if(conDefault || (!conDefault && bimestreLocal.getnombre()!=null && !bimestreLocal.getnombre().equals(""))) {bimestreBean.setnombre(bimestreLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxBimestreGenerico(Long idBimestreSeleccionado,JComboBox jComboBoxBimestre,List<Bimestre> bimestresLocal)throws Exception {
		try {
			Bimestre  bimestreTemp=null;

			for(Bimestre bimestreAux:bimestresLocal) {
				if(bimestreAux.getId()!=null && bimestreAux.getId().equals(idBimestreSeleccionado)) {
					bimestreTemp=bimestreAux;
					break;
				}
			}

			jComboBoxBimestre.setSelectedItem(bimestreTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxBimestreGenerico(JComboBox jComboBoxBimestre,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxBimestre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBimestre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxBimestre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBimestre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBimestre.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxBimestre.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBimestre.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxBimestre.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxBimestre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxBimestre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bimestre=(Bimestre) bimestreLogic.getBimestres().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			bimestre =(Bimestre) bimestres.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Bimestre bimestreRow=new Bimestre();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bimestreRow=(Bimestre) bimestreLogic.getBimestres().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			bimestreRow=(Bimestre) bimestres.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualBimestre(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoBimestre.setVisible((this.isVisibilidadCeldaNuevoBimestre && this.isPermisoNuevoBimestre));			
			this.jButtonDuplicarBimestre.setVisible((this.isVisibilidadCeldaDuplicarBimestre && this.isPermisoDuplicarBimestre));			
			this.jButtonCopiarBimestre.setVisible((this.isVisibilidadCeldaCopiarBimestre && this.isPermisoCopiarBimestre));
			this.jButtonVerFormBimestre.setVisible((this.isVisibilidadCeldaVerFormBimestre && this.isPermisoVerFormBimestre));
			
			this.jButtonAbrirOrderByBimestre.setVisible((this.isVisibilidadCeldaOrdenBimestre && this.isPermisoOrdenBimestre));			
			
			this.jButtonNuevoRelacionesBimestre.setVisible((this.isVisibilidadCeldaNuevoRelacionesBimestre && this.isPermisoNuevoBimestre));			
			this.jButtonNuevoGuardarCambiosBimestre.setVisible((this.isVisibilidadCeldaNuevoBimestre && this.isPermisoNuevoBimestre && this.isPermisoGuardarCambiosBimestre));
			
			if(this.jInternalFrameDetalleFormBimestre!=null) {
			this.jInternalFrameDetalleFormBimestre.jButtonModificarBimestre.setVisible((this.isVisibilidadCeldaModificarBimestre && this.isPermisoActualizarBimestre));	
			this.jInternalFrameDetalleFormBimestre.jButtonActualizarBimestre.setVisible((this.isVisibilidadCeldaActualizarBimestre && this.isPermisoActualizarBimestre));	
			this.jInternalFrameDetalleFormBimestre.jButtonEliminarBimestre.setVisible((this.isVisibilidadCeldaEliminarBimestre && this.isPermisoEliminarBimestre));
			this.jInternalFrameDetalleFormBimestre.jButtonCancelarBimestre.setVisible(this.isVisibilidadCeldaCancelarBimestre);							
			this.jInternalFrameDetalleFormBimestre.jButtonGuardarCambiosBimestre.setVisible((this.isVisibilidadCeldaGuardarBimestre && this.isPermisoGuardarCambiosBimestre));			
			
			}
						
			this.jButtonGuardarCambiosTablaBimestre.setVisible((this.isVisibilidadCeldaGuardarCambiosBimestre && this.isPermisoGuardarCambiosBimestre));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarBimestre.setVisible((this.isVisibilidadCeldaNuevoBimestre && this.isPermisoNuevoBimestre));						
			this.jButtonDuplicarToolBarBimestre.setVisible((this.isVisibilidadCeldaDuplicarBimestre && this.isPermisoDuplicarBimestre));						
			this.jButtonCopiarToolBarBimestre.setVisible((this.isVisibilidadCeldaCopiarBimestre && this.isPermisoCopiarBimestre));			
			this.jButtonVerFormToolBarBimestre.setVisible((this.isVisibilidadCeldaVerFormBimestre && this.isPermisoVerFormBimestre));			
			this.jButtonAbrirOrderByToolBarBimestre.setVisible((this.isVisibilidadCeldaOrdenBimestre && this.isPermisoOrdenBimestre));
			this.jButtonNuevoRelacionesToolBarBimestre.setVisible((this.isVisibilidadCeldaNuevoRelacionesBimestre && this.isPermisoNuevoBimestre));			
			this.jButtonNuevoGuardarCambiosToolBarBimestre.setVisible((this.isVisibilidadCeldaNuevoBimestre && this.isPermisoNuevoBimestre && this.isPermisoGuardarCambiosBimestre));			
			
			if(this.jInternalFrameDetalleFormBimestre!=null) {
			this.jInternalFrameDetalleFormBimestre.jButtonModificarToolBarBimestre.setVisible((this.isVisibilidadCeldaModificarBimestre && this.isPermisoActualizarBimestre));	
			this.jInternalFrameDetalleFormBimestre.jButtonActualizarToolBarBimestre.setVisible((this.isVisibilidadCeldaActualizarBimestre  && this.isPermisoActualizarBimestre));	
			this.jInternalFrameDetalleFormBimestre.jButtonEliminarToolBarBimestre.setVisible((this.isVisibilidadCeldaEliminarBimestre && this.isPermisoEliminarBimestre));
			this.jInternalFrameDetalleFormBimestre.jButtonCancelarToolBarBimestre.setVisible(this.isVisibilidadCeldaCancelarBimestre);				
			this.jInternalFrameDetalleFormBimestre.jButtonGuardarCambiosToolBarBimestre.setVisible((this.isVisibilidadCeldaGuardarBimestre && this.isPermisoGuardarCambiosBimestre));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarBimestre.setVisible((this.isVisibilidadCeldaGuardarCambiosBimestre && this.isPermisoGuardarCambiosBimestre));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoBimestre.setVisible((this.isVisibilidadCeldaNuevoBimestre && this.isPermisoNuevoBimestre));			
			this.jMenuItemDuplicarBimestre.setVisible((this.isVisibilidadCeldaDuplicarBimestre && this.isPermisoDuplicarBimestre));			
			this.jMenuItemCopiarBimestre.setVisible((this.isVisibilidadCeldaCopiarBimestre && this.isPermisoCopiarBimestre));			
			this.jMenuItemVerFormBimestre.setVisible((this.isVisibilidadCeldaVerFormBimestre && this.isPermisoVerFormBimestre));			
			this.jMenuItemAbrirOrderByBimestre.setVisible((this.isVisibilidadCeldaOrdenBimestre && this.isPermisoOrdenBimestre));			
			//this.jMenuItemMostrarOcultarBimestre.setVisible((this.isVisibilidadCeldaOrdenBimestre && this.isPermisoOrdenBimestre));
			this.jMenuItemDetalleAbrirOrderByBimestre.setVisible((this.isVisibilidadCeldaOrdenBimestre && this.isPermisoOrdenBimestre));			
			//this.jMenuItemDetalleMostrarOcultarBimestre.setVisible((this.isVisibilidadCeldaOrdenBimestre && this.isPermisoOrdenBimestre));			
			this.jMenuItemNuevoRelacionesBimestre.setVisible((this.isVisibilidadCeldaNuevoRelacionesBimestre && this.isPermisoNuevoBimestre));			
			this.jMenuItemNuevoGuardarCambiosBimestre.setVisible((this.isVisibilidadCeldaNuevoBimestre && this.isPermisoNuevoBimestre && this.isPermisoGuardarCambiosBimestre));									
			
			if(this.jInternalFrameDetalleFormBimestre!=null) {
			this.jInternalFrameDetalleFormBimestre.jMenuItemModificarBimestre.setVisible((this.isVisibilidadCeldaModificarBimestre && this.isPermisoActualizarBimestre));	
			this.jInternalFrameDetalleFormBimestre.jMenuItemActualizarBimestre.setVisible((this.isVisibilidadCeldaActualizarBimestre && this.isPermisoActualizarBimestre));	
			this.jInternalFrameDetalleFormBimestre.jMenuItemEliminarBimestre.setVisible((this.isVisibilidadCeldaEliminarBimestre && this.isPermisoEliminarBimestre));
			this.jInternalFrameDetalleFormBimestre.jMenuItemCancelarBimestre.setVisible(this.isVisibilidadCeldaCancelarBimestre);				
			}
			
			this.jMenuItemGuardarCambiosBimestre.setVisible((this.isVisibilidadCeldaGuardarBimestre && this.isPermisoGuardarCambiosBimestre));						
			this.jMenuItemGuardarCambiosTablaBimestre.setVisible((this.isVisibilidadCeldaGuardarCambiosBimestre && this.isPermisoGuardarCambiosBimestre));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoBimestre=this.jButtonNuevoBimestre.isVisible();
			this.isVisibilidadCeldaDuplicarBimestre=this.jButtonDuplicarBimestre.isVisible();
			this.isVisibilidadCeldaCopiarBimestre=this.jButtonCopiarBimestre.isVisible();
			this.isVisibilidadCeldaVerFormBimestre=this.jButtonVerFormBimestre.isVisible();
			
			this.isVisibilidadCeldaOrdenBimestre=this.jButtonAbrirOrderByBimestre.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesBimestre=this.jButtonNuevoRelacionesBimestre.isVisible();
			this.isVisibilidadCeldaModificarBimestre=this.jButtonModificarBimestre.isVisible();
			
			if(this.jInternalFrameDetalleFormBimestre!=null) {
			this.isVisibilidadCeldaActualizarBimestre=this.jInternalFrameDetalleFormBimestre.jButtonActualizarBimestre.isVisible();
			this.isVisibilidadCeldaEliminarBimestre=this.jInternalFrameDetalleFormBimestre.jButtonEliminarBimestre.isVisible();
			this.isVisibilidadCeldaCancelarBimestre=this.jInternalFrameDetalleFormBimestre.jButtonCancelarBimestre.isVisible();
			this.isVisibilidadCeldaGuardarBimestre=this.jInternalFrameDetalleFormBimestre.jButtonGuardarCambiosBimestre.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosBimestre=this.jButtonGuardarCambiosTablaBimestre.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoBimestre=this.jButtonNuevoToolBarBimestre.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBimestre=this.jButtonNuevoRelacionesToolBarBimestre.isVisible();
			
			if(this.jInternalFrameDetalleFormBimestre!=null) {
			this.isVisibilidadCeldaModificarBimestre=this.jInternalFrameDetalleFormBimestre.jButtonModificarToolBarBimestre.isVisible();
			this.isVisibilidadCeldaActualizarBimestre=this.jInternalFrameDetalleFormBimestre.jButtonActualizarToolBarBimestre.isVisible();
			this.isVisibilidadCeldaEliminarBimestre=this.jInternalFrameDetalleFormBimestre.jButtonEliminarToolBarBimestre.isVisible();
			this.isVisibilidadCeldaCancelarBimestre=this.jInternalFrameDetalleFormBimestre.jButtonCancelarToolBarBimestre.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBimestre=this.jButtonGuardarCambiosToolBarBimestre.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBimestre=this.jButtonGuardarCambiosTablaToolBarBimestre.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoBimestre=this.jMenuItemNuevoBimestre.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBimestre=this.jMenuItemNuevoRelacionesBimestre.isVisible();
			
			if(this.jInternalFrameDetalleFormBimestre!=null) {
			this.isVisibilidadCeldaModificarBimestre=this.jInternalFrameDetalleFormBimestre.jMenuItemModificarBimestre.isVisible();
			this.isVisibilidadCeldaActualizarBimestre=this.jInternalFrameDetalleFormBimestre.jMenuItemActualizarBimestre.isVisible();
			this.isVisibilidadCeldaEliminarBimestre=this.jInternalFrameDetalleFormBimestre.jMenuItemEliminarBimestre.isVisible();
			this.isVisibilidadCeldaCancelarBimestre=this.jInternalFrameDetalleFormBimestre.jMenuItemCancelarBimestre.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBimestre=this.jMenuItemGuardarCambiosBimestre.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBimestre=this.jMenuItemGuardarCambiosTablaBimestre.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesBimestre(Boolean esInicializar) {
		if(BimestreJInternalFrame.ISBINDING_MANUAL) {			
			if(this.bimestreSessionBean.getConGuardarRelaciones()) {
				//if(this.bimestreSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesBimestre();
			}
			
			this.inicializarActualizarBindingBotonesManualBimestre(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualBimestre() {
		this.jButtonNuevoBimestre.setVisible(this.isPermisoNuevoBimestre);			
		this.jButtonDuplicarBimestre.setVisible(this.isPermisoDuplicarBimestre);			
		this.jButtonCopiarBimestre.setVisible(this.isPermisoCopiarBimestre);			
		this.jButtonVerFormBimestre.setVisible(this.isPermisoVerFormBimestre);			
		
		this.jButtonAbrirOrderByBimestre.setVisible(this.isPermisoOrdenBimestre);					
		
		this.jButtonNuevoRelacionesBimestre.setVisible(this.isPermisoNuevoBimestre);			
		
		if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBimestre.jButtonModificarBimestre.setVisible(this.isPermisoActualizarBimestre);	
			this.jInternalFrameDetalleFormBimestre.jButtonActualizarBimestre.setVisible(this.isPermisoActualizarBimestre);	
			this.jInternalFrameDetalleFormBimestre.jButtonEliminarBimestre.setVisible(this.isPermisoEliminarBimestre);
			this.jInternalFrameDetalleFormBimestre.jButtonCancelarBimestre.setVisible(this.isVisibilidadCeldaCancelarBimestre);						
			this.jInternalFrameDetalleFormBimestre.jButtonGuardarCambiosBimestre.setVisible(this.isPermisoGuardarCambiosBimestre);							
		}
		
		this.jButtonGuardarCambiosTablaBimestre.setVisible(this.isPermisoActualizarBimestre);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleBimestre() {
		this.jInternalFrameDetalleFormBimestre.jButtonModificarBimestre.setVisible(this.isPermisoActualizarBimestre);	
		this.jInternalFrameDetalleFormBimestre.jButtonActualizarBimestre.setVisible(this.isPermisoActualizarBimestre);	
		this.jInternalFrameDetalleFormBimestre.jButtonEliminarBimestre.setVisible(this.isPermisoEliminarBimestre);
		this.jInternalFrameDetalleFormBimestre.jButtonCancelarBimestre.setVisible(this.isVisibilidadCeldaCancelarBimestre);							
		this.jInternalFrameDetalleFormBimestre.jButtonGuardarCambiosBimestre.setVisible((this.isVisibilidadCeldaGuardarBimestre && this.isPermisoGuardarCambiosBimestre));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosBimestre() {
		if(BimestreJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualBimestre();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesBimestre() {
	}
	
	public void jTableDatosBimestreListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarBimestre(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidBimestreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBimestre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBimestre(this.getbimestre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBimestre(this.bimestre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bimestre =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bimestre =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bimestre==null) {
						this.bimestre = new Bimestre();
					}

					this.setVariablesFormularioToObjetoActualBimestre(this.bimestre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBimestre(this.bimestre);
				}

				if(this.bimestre.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.bimestre.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBimestre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestreLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreBimestreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBimestre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBimestre(this.getbimestre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBimestre(this.bimestre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bimestre =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bimestre =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bimestre==null) {
						this.bimestre = new Bimestre();
					}

					this.setVariablesFormularioToObjetoActualBimestre(this.bimestre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBimestre(this.bimestre);
				}

				if(this.bimestre.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.bimestre.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBimestre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestreLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameBimestre() {
		if(this.jInternalFrameDetalleFormBimestre!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormBimestre!=null) {
			this.jInternalFrameDetalleFormBimestre.setVisible(false);	    			
			this.jInternalFrameDetalleFormBimestre.dispose();
			this.jInternalFrameDetalleFormBimestre=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoBimestre!=null) {
			this.jInternalFrameReporteDinamicoBimestre.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoBimestre.dispose();
			this.jInternalFrameReporteDinamicoBimestre=null;
		}
		
		if(this.jInternalFrameImportacionBimestre!=null) {
			this.jInternalFrameImportacionBimestre.setVisible(false);	    			
			this.jInternalFrameImportacionBimestre.dispose();
			this.jInternalFrameImportacionBimestre=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessBimestre();
			
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
			
			
			if(sTipo.equals("NuevoBimestre")) {
				jButtonNuevoBimestreActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarBimestre")) {
				jButtonDuplicarBimestreActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarBimestre")) {
				jButtonCopiarBimestreActionPerformed(evt);
			} else if(sTipo.equals("VerFormBimestre")) {
				jButtonVerFormBimestreActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarBimestre")) {
				jButtonNuevoBimestreActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarBimestre")) {
				jButtonDuplicarBimestreActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoBimestre")) {
				jButtonNuevoBimestreActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarBimestre")) {
				jButtonDuplicarBimestreActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesBimestre")) {
				jButtonNuevoBimestreActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarBimestre")) {
				jButtonNuevoBimestreActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesBimestre")) {
				jButtonNuevoBimestreActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarBimestre")) {
				jButtonModificarBimestreActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarBimestre")) {
				jButtonModificarBimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarBimestre")) {
				jButtonModificarBimestreActionPerformed(evt);
			} else if(sTipo.equals("ActualizarBimestre")) {
				jButtonActualizarBimestreActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarBimestre")) {
				jButtonActualizarBimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarBimestre")) {
				jButtonActualizarBimestreActionPerformed(evt);
			} else if(sTipo.equals("EliminarBimestre")) {
				jButtonEliminarBimestreActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarBimestre")) {
				jButtonEliminarBimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarBimestre")) {
				jButtonEliminarBimestreActionPerformed(evt);
			} else if(sTipo.equals("CancelarBimestre")) {
				jButtonCancelarBimestreActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarBimestre")) {
				jButtonCancelarBimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarBimestre")) {
				jButtonCancelarBimestreActionPerformed(evt);
			} else if(sTipo.equals("CerrarBimestre")) {
				jButtonCerrarBimestreActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarBimestre")) {
				jButtonCerrarBimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarBimestre")) {
				jButtonCerrarBimestreActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarBimestre")) {
				jButtonMostrarOcultarBimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarBimestre")) {
				jButtonCancelarBimestreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosBimestre")) {
				jButtonGuardarCambiosBimestreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarBimestre")) {
				jButtonGuardarCambiosBimestreActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarBimestre")) {
				jButtonCopiarBimestreActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarBimestre")) {
				jButtonVerFormBimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosBimestre")) {
				jButtonGuardarCambiosBimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarBimestre")) {
				jButtonCopiarBimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormBimestre")) {
				jButtonVerFormBimestreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaBimestre")) {
				jButtonGuardarCambiosBimestreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarBimestre")) {
				jButtonGuardarCambiosBimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaBimestre")) {
				jButtonGuardarCambiosBimestreActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionBimestre")) {
				jButtonRecargarInformacionBimestreActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarBimestre")) {
				jButtonRecargarInformacionBimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionBimestre")) {
				jButtonRecargarInformacionBimestreActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresBimestre")) {
				jButtonAnterioresBimestreActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarBimestre")) {
				jButtonAnterioresBimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreBimestre")) {
				jButtonAnterioresBimestreActionPerformed(evt);
			} else if(sTipo.equals("SiguientesBimestre")) {
				jButtonSiguientesBimestreActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarBimestre")) {
				jButtonSiguientesBimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesBimestre")) {
				jButtonSiguientesBimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByBimestre") || sTipo.equals("MenuItemDetalleAbrirOrderByBimestre")) {
				jButtonAbrirOrderByBimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarBimestre") || sTipo.equals("MenuItemDetalleMostrarOcultarBimestre")) {
				jButtonMostrarOcultarBimestreActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosBimestre")) {
				jButtonNuevoGuardarCambiosBimestreActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarBimestre")) {
				jButtonNuevoGuardarCambiosBimestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosBimestre")) {
				jButtonNuevoGuardarCambiosBimestreActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoBimestre")) {
				jButtonCerrarReporteDinamicoBimestreActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoBimestre")) {
				jButtonGenerarReporteDinamicoBimestreActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoBimestre")) {
				
				jButtonGenerarExcelReporteDinamicoBimestreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionBimestre")) {
				jButtonCerrarImportacionBimestreActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionBimestre")) {
				
				jButtonGenerarImportacionBimestreActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionBimestre")) {
				
				jButtonAbrirImportacionBimestreActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesBimestre")) {
				jComboBoxTiposAccionesBimestreActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesBimestre")) {
				jComboBoxTiposRelacionesBimestreActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioBimestre")) {
				jComboBoxTiposAccionesBimestreActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarBimestre")) {
				
				jComboBoxTiposSeleccionarBimestreActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralBimestre")) {
				jTextFieldValorCampoGeneralBimestreActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByBimestre")) {
				jButtonAbrirOrderByBimestreActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarBimestre")) {
				jButtonAbrirOrderByBimestreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByBimestre")) {
				jButtonCerrarOrderByBimestreActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBimestreBusqueda")) {
				this.jButtonidBimestreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreBimestreBusqueda")) {
				this.jButtonnombreBimestreBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessBimestre();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBimestreActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bimestre);
				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
				
				


				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bimestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bimestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Bimestre bimestreLocal=null;
			
			if(!this.getEsControlTabla()) {
				bimestreLocal=this.bimestre;
			} else {
				bimestreLocal=this.bimestreAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bimestre);
				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
							
				
				


				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bimestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bimestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBimestreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBimestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestreAnterior =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bimestreAnterior =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
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
			
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
			
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
			
			


			
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBimestreActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bimestre);
				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
								
						
				


				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bimestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bimestre.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bimestre);
				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
								
				
				


				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bimestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bimestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBimestreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBimestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestreAnterior =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bimestreAnterior =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bimestre);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBimestreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBimestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestreAnterior =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bimestreAnterior =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBimestreActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bimestre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bimestre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bimestre);
				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
							
				
				


				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bimestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bimestre.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBimestreActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBimestre.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bimestreAnterior =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.bimestreAnterior =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
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
			
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
			
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
			
			


			
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBimestreActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bimestre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bimestre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bimestre);
				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
								
				
				


				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bimestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bimestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBimestreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBimestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestreAnterior =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bimestreAnterior =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBimestreActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bimestre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bimestre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBimestreActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bimestre);
				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosBimestre")) {
					jCheckBoxSeleccionarTodosBimestreItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosBimestre")) {
					jCheckBoxSeleccionadosBimestreItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarBimestre")) {
					
				}
				
				


				
				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bimestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bimestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.bimestre);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.bimestre);
				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
												
				
				


				
				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bimestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bimestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBimestreActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBimestre.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bimestreAnterior =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.bimestreAnterior =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBimestreActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bimestre);
				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
				
				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
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
			
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
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
			
			


			
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBimestreActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bimestre);
				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bimestre.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bimestre.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bimestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bimestre);
				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
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
				
				


				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bimestre.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bimestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBimestreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBimestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bimestreAnterior =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bimestreAnterior =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarBimestre")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosBimestreListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosBimestre.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.bimestre =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.bimestre =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.bimestre);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarBimestre")) {
				
				}
				
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarBimestre")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosBimestre.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarBimestre")) {
			
			}
			
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessBimestre();
			
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
			
			if(sTipo.equals("NuevoBimestre")) {
				jButtonNuevoBimestreActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarBimestre")) {
				jButtonDuplicarBimestreActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarBimestre")) {
				jButtonCopiarBimestreActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormBimestre")) {
				jButtonVerFormBimestreActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesBimestre")) {
				jButtonNuevoBimestreActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarBimestre")) {
				jButtonModificarBimestreActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarBimestre")) {
				jButtonActualizarBimestreActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarBimestre")) {
				jButtonEliminarBimestreActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaBimestre")) {
				jButtonGuardarCambiosBimestreActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarBimestre")) {
				jButtonCancelarBimestreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarBimestre")) {
				jButtonCerrarBimestreActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosBimestre")) {
				jButtonGuardarCambiosBimestreActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosBimestre")) {
				jButtonNuevoGuardarCambiosBimestreActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByBimestre")) {
				jButtonAbrirOrderByBimestreActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionBimestre")) {
				jButtonRecargarInformacionBimestreActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresBimestre")) {
				jButtonAnterioresBimestreActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesBimestre")) {
				jButtonSiguientesBimestreActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBimestreBusqueda")) {
				this.jButtonidBimestreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreBimestreBusqueda")) {
				this.jButtonnombreBimestreBusquedaActionPerformed(evt);
			}
			
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessBimestre();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameBimestre")) {
				closingInternalFrameBimestre();
				
			} else if(sTipo.equals("jButtonCancelarBimestre")) {
				JInternalFrameBase jInternalFrameDetalleFormBimestre = (JInternalFrameBase)evt.getSource();
	            	
	            BimestreBeanSwingJInternalFrame jInternalFrameParent=(BimestreBeanSwingJInternalFrame)jInternalFrameDetalleFormBimestre.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarBimestreActionPerformed(null);
			}
			
			BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.bimestre,new Object(),this.bimestreParameterGeneral,this.bimestreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormBimestre(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormBimestre(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormBimestre(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.bimestre)) {
			if(!esControlTabla) {
				if(BimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualBimestre(this.bimestre,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBimestre(this.bimestre);			
				}
				
				if(this.bimestreSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualBimestre(this.bimestre,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.bimestreReturnGeneral=bimestreLogic.procesarEventosBimestresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bimestreLogic.getBimestres(),this.bimestre,this.bimestreParameterGeneral,this.isEsNuevoBimestre,classes);//this.bimestreLogic.getBimestre()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanBimestre(this.bimestreReturnGeneral,this.bimestreBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.bimestreSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanBimestre(classes,this.bimestreReturnGeneral,this.bimestreBean,false);
					}
						
					if(this.bimestreReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyBimestre(this.bimestreReturnGeneral.getBimestre());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioBimestre(this.bimestreReturnGeneral.getBimestre());	
					}
						
					if(this.bimestreReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioBimestre(this.bimestreReturnGeneral.getBimestre(),classes);//this.bimestreBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioBimestre(this.bimestre,classes);//this.bimestreBean);									
				}
			
				if(BimestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualBimestre(this.bimestre,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBimestre(this.bimestre);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.bimestreAnterior!=null) {
						this.bimestre=this.bimestreAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.bimestreReturnGeneral=bimestreLogic.procesarEventosBimestresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bimestreLogic.getBimestres(),this.bimestre,this.bimestreParameterGeneral,this.isEsNuevoBimestre,classes);//this.bimestreLogic.getBimestre()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.bimestreSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.bimestreSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.bimestreReturnGeneral.getBimestre(),bimestreLogic.getBimestres());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.bimestreReturnGeneral.getBimestre(),this.bimestres);
				}
				//ARCHITECTURE
				
				//this.jTableDatosBimestre.repaint();
				
				//((AbstractTableModel) this.jTableDatosBimestre.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosBimestre();
			}
		}
	}
	
	public void actualizarVisualTableDatosBimestre() throws Exception {
		
		BimestreModel bimestreModel=(BimestreModel)this.jTableDatosBimestre.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bimestreModel.bimestres=this.bimestreLogic.getBimestres();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			bimestreModel.bimestres=this.bimestres;
		}
		
		
		((BimestreModel) this.jTableDatosBimestre.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaBimestre() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getbimestreAnterior(),this.bimestreLogic.getBimestres());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getbimestreAnterior(),this.bimestres);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosBimestre();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioBimestre(Bimestre bimestre,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
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
										
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bimestre,new Object(),generalEntityParameterGeneral,this.bimestreReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.bimestreSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=BimestreConstantesFunciones.getClassesRelationshipsOfBimestre(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=BimestreConstantesFunciones.getClassesRelationshipsFromStringsOfBimestre(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormBimestre(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				BimestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bimestre,new Object(),generalEntityParameterGeneral,this.bimestreReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioBimestre(BimestreBean bimestreBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanBimestre(ArrayList<Classe> classes,BimestreReturnGeneral bimestreReturnGeneral,BimestreBean bimestreBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualBimestre(Bimestre bimestre,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.bimestre)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormBimestre = new BimestreDetalleFormJInternalFrame(jDesktopPane,this.bimestreSessionBean.getConGuardarRelaciones(),this.bimestreSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormBimestre);
		this.jInternalFrameDetalleFormBimestre.setVisible(false);
		this.jInternalFrameDetalleFormBimestre.setSelected(false);						
		
		this.jInternalFrameDetalleFormBimestre.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormBimestre.bimestreLogic=this.bimestreLogic;
		
		this.cargarCombosFrameForeignKeyBimestre("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleBimestre();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBimestre();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyBimestre("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyBimestre();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormBimestre.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBimestre"));
		
		this.jInternalFrameDetalleFormBimestre.jButtonModificarBimestre.addActionListener(new ButtonActionListener(this,"ModificarBimestre"));

		
		this.jInternalFrameDetalleFormBimestre.jButtonModificarToolBarBimestre.addActionListener(new ButtonActionListener(this,"ModificarToolBarBimestre"));
					
		this.jInternalFrameDetalleFormBimestre.jMenuItemModificarBimestre.addActionListener(new ButtonActionListener(this,"MenuItemModificarBimestre"));		
		
		
		
		this.jInternalFrameDetalleFormBimestre.jButtonActualizarBimestre.addActionListener (new ButtonActionListener(this,"ActualizarBimestre"));
		
		
		this.jInternalFrameDetalleFormBimestre.jButtonActualizarToolBarBimestre.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBimestre"));
						
		this.jInternalFrameDetalleFormBimestre.jMenuItemActualizarBimestre.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBimestre"));		
		
		
		
		this.jInternalFrameDetalleFormBimestre.jButtonEliminarBimestre.addActionListener (new ButtonActionListener(this,"EliminarBimestre"));
		
		
		this.jInternalFrameDetalleFormBimestre.jButtonEliminarToolBarBimestre.addActionListener (new ButtonActionListener(this,"EliminarToolBarBimestre"));
								
		this.jInternalFrameDetalleFormBimestre.jMenuItemEliminarBimestre.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBimestre"));		
		
		
		
		this.jInternalFrameDetalleFormBimestre.jButtonCancelarBimestre.addActionListener (new ButtonActionListener(this,"CancelarBimestre"));
		
		
		this.jInternalFrameDetalleFormBimestre.jButtonCancelarToolBarBimestre.addActionListener (new ButtonActionListener(this,"CancelarToolBarBimestre"));
					
		this.jInternalFrameDetalleFormBimestre.jMenuItemCancelarBimestre.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBimestre"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormBimestre.jMenuItemDetalleCerrarBimestre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBimestre"));		
		
		
		
		this.jInternalFrameDetalleFormBimestre.jButtonGuardarCambiosToolBarBimestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBimestre"));
		
		
		
		this.jInternalFrameDetalleFormBimestre.jButtonGuardarCambiosToolBarBimestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBimestre"));
		
		
		
		this.jInternalFrameDetalleFormBimestre.jComboBoxTiposAccionesFormularioBimestre.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBimestre"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBimestre.jButtonidBimestreBusqueda.addActionListener(new ButtonActionListener(this,"idBimestreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBimestre.jButtonnombreBimestreBusqueda.addActionListener(new ButtonActionListener(this,"nombreBimestreBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormBimestre.jTabbedPaneRelacionesBimestre.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBimestre"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameBimestre"));
		
		if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBimestre.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBimestre"));
		}
		
		this.jTableDatosBimestre.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarBimestre"));
		
		this.jTableDatosBimestre.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarBimestre"));
		
		this.jButtonNuevoBimestre.addActionListener(new ButtonActionListener(this,"NuevoBimestre"));
		
		this.jButtonDuplicarBimestre.addActionListener(new ButtonActionListener(this,"DuplicarBimestre"));
		
		this.jButtonCopiarBimestre.addActionListener(new ButtonActionListener(this,"CopiarBimestre"));
		
		this.jButtonVerFormBimestre.addActionListener(new ButtonActionListener(this,"VerFormBimestre"));
		
		
		this.jButtonNuevoToolBarBimestre.addActionListener(new ButtonActionListener(this,"NuevoToolBarBimestre"));
			
		this.jButtonDuplicarToolBarBimestre.addActionListener(new ButtonActionListener(this,"DuplicarToolBarBimestre"));
			
		this.jMenuItemNuevoBimestre.addActionListener (new ButtonActionListener(this,"MenuItemNuevoBimestre"));
			
		this.jMenuItemDuplicarBimestre.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarBimestre"));		
		
		
		this.jButtonNuevoRelacionesBimestre.addActionListener (new ButtonActionListener(this,"NuevoRelacionesBimestre"));
		
		
		this.jButtonNuevoRelacionesToolBarBimestre.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarBimestre"));
			
		this.jMenuItemNuevoRelacionesBimestre.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesBimestre"));		
		
		
		if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBimestre.jButtonModificarBimestre.addActionListener(new ButtonActionListener(this,"ModificarBimestre"));
		}
		
		
		if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBimestre.jButtonModificarToolBarBimestre.addActionListener(new ButtonActionListener(this,"ModificarToolBarBimestre"));
			
			this.jInternalFrameDetalleFormBimestre.jMenuItemModificarBimestre.addActionListener(new ButtonActionListener(this,"MenuItemModificarBimestre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormBimestre.jButtonActualizarBimestre.addActionListener (new ButtonActionListener(this,"ActualizarBimestre"));
		}
		
		
		if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBimestre.jButtonActualizarToolBarBimestre.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBimestre"));
				
			this.jInternalFrameDetalleFormBimestre.jMenuItemActualizarBimestre.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBimestre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBimestre.jButtonEliminarBimestre.addActionListener (new ButtonActionListener(this,"EliminarBimestre"));
		}
		
		
		if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBimestre.jButtonEliminarToolBarBimestre.addActionListener (new ButtonActionListener(this,"EliminarToolBarBimestre"));
						
			this.jInternalFrameDetalleFormBimestre.jMenuItemEliminarBimestre.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBimestre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBimestre.jButtonCancelarBimestre.addActionListener (new ButtonActionListener(this,"CancelarBimestre"));
		}
		
		
		if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBimestre.jButtonCancelarToolBarBimestre.addActionListener (new ButtonActionListener(this,"CancelarToolBarBimestre"));
			
			this.jInternalFrameDetalleFormBimestre.jMenuItemCancelarBimestre.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBimestre"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarBimestre.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarBimestre"));		
		
		
		this.jButtonCerrarBimestre.addActionListener (new ButtonActionListener(this,"CerrarBimestre"));
		
		
		this.jButtonCerrarToolBarBimestre.addActionListener (new ButtonActionListener(this,"CerrarToolBarBimestre"));
			
		this.jMenuItemCerrarBimestre.addActionListener (new ButtonActionListener(this,"MenuItemCerrarBimestre"));
			
		if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBimestre.jMenuItemDetalleCerrarBimestre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBimestre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBimestre.jButtonGuardarCambiosBimestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosBimestre"));
		}
		
		
		if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBimestre.jButtonGuardarCambiosToolBarBimestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBimestre"));
		}
		
		this.jButtonCopiarToolBarBimestre.addActionListener (new ButtonActionListener(this,"CopiarToolBarBimestre"));
			
		this.jButtonVerFormToolBarBimestre.addActionListener (new ButtonActionListener(this,"VerFormToolBarBimestre"));
		
		this.jMenuItemGuardarCambiosBimestre.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosBimestre"));
			
		this.jMenuItemCopiarBimestre.addActionListener (new ButtonActionListener(this,"MenuItemCopiarBimestre"));		
		
		this.jMenuItemVerFormBimestre.addActionListener (new ButtonActionListener(this,"MenuItemVerFormBimestre"));		
		
		
		this.jButtonGuardarCambiosTablaBimestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBimestre"));
		
		
		this.jButtonGuardarCambiosTablaToolBarBimestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarBimestre"));
			
		this.jMenuItemGuardarCambiosTablaBimestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBimestre"));		
		
		
		
		this.jButtonRecargarInformacionBimestre.addActionListener (new ButtonActionListener(this,"RecargarInformacionBimestre"));
					
		this.jButtonRecargarInformacionToolBarBimestre.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarBimestre"));
		
		this.jMenuItemRecargarInformacionBimestre.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionBimestre"));		
		
		
		
		this.jButtonAnterioresBimestre.addActionListener (new ButtonActionListener(this,"AnterioresBimestre"));
		
		
		this.jButtonAnterioresToolBarBimestre.addActionListener (new ButtonActionListener(this,"AnterioresToolBarBimestre"));
		
		this.jMenuItemAnterioresBimestre.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresBimestre"));		
		
		
		this.jButtonSiguientesBimestre.addActionListener (new ButtonActionListener(this,"SiguientesBimestre"));
		
		
		this.jButtonSiguientesToolBarBimestre.addActionListener (new ButtonActionListener(this,"SiguientesToolBarBimestre"));
			
		this.jMenuItemSiguientesBimestre.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesBimestre"));
			
		this.jMenuItemAbrirOrderByBimestre.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByBimestre"));
			
		this.jMenuItemMostrarOcultarBimestre.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarBimestre"));
			
		this.jMenuItemDetalleAbrirOrderByBimestre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByBimestre"));
			
		this.jMenuItemDetalleMostarOcultarBimestre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarBimestre"));		
		
		
		this.jButtonNuevoGuardarCambiosBimestre.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosBimestre"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarBimestre.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarBimestre"));
			
		this.jMenuItemNuevoGuardarCambiosBimestre.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosBimestre"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosBimestre.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosBimestre"));

		this.jCheckBoxSeleccionadosBimestre.addItemListener(new CheckBoxItemListener(this,"SeleccionadosBimestre"));
		
		if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBimestre.jComboBoxTiposAccionesFormularioBimestre.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBimestre"));
		}
		
		
		this.jComboBoxTiposRelacionesBimestre.addActionListener (new ButtonActionListener(this,"TiposRelacionesBimestre"));
			
		this.jComboBoxTiposAccionesBimestre.addActionListener (new ButtonActionListener(this,"TiposAccionesBimestre"));
					
		this.jComboBoxTiposSeleccionarBimestre.addActionListener (new ButtonActionListener(this,"TiposSeleccionarBimestre"));
			
		this.jTextFieldValorCampoGeneralBimestre.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralBimestre"));		
		
		
		if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBimestre.jButtonidBimestreBusqueda.addActionListener(new ButtonActionListener(this,"idBimestreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBimestre.jButtonnombreBimestreBusqueda.addActionListener(new ButtonActionListener(this,"nombreBimestreBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoBimestre!=null) {
				this.jInternalFrameReporteDinamicoBimestre.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBimestre"));
				this.jInternalFrameReporteDinamicoBimestre.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBimestre"));
				this.jInternalFrameReporteDinamicoBimestre.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBimestre"));
			}
			
			//this.jButtonCerrarReporteDinamicoBimestre.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBimestre"));				
			//this.jButtonGenerarReporteDinamicoBimestre.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBimestre"));
			//this.jButtonGenerarExcelReporteDinamicoBimestre.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBimestre"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionBimestre!=null) {
				this.jInternalFrameImportacionBimestre.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBimestre"));
				this.jInternalFrameImportacionBimestre.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBimestre"));
				this.jInternalFrameImportacionBimestre.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBimestre"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByBimestre.addActionListener (new ButtonActionListener(this,"AbrirOrderByBimestre"));
			
			this.jButtonAbrirOrderByToolBarBimestre.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarBimestre"));			
			
			if(this.jInternalFrameOrderByBimestre!=null) {
				this.jInternalFrameOrderByBimestre.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBimestre"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormBimestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBimestre.jTabbedPaneRelacionesBimestre.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBimestre"));
		
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
            		closingInternalFrameBimestre();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormBimestre.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormBimestre = (JInternalFrameBase)event.getSource();
	            	
	            BimestreBeanSwingJInternalFrame jInternalFrameParent=(BimestreBeanSwingJInternalFrame)jInternalFrameDetalleFormBimestre.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarBimestreActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosBimestre.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosBimestreListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosBimestre.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosBimestre.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBimestreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBimestreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBimestreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoBimestre";
		inputMap = this.jButtonNuevoBimestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoBimestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBimestreActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBimestreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBimestreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBimestreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesBimestre";
		inputMap = this.jButtonNuevoRelacionesBimestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesBimestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBimestreActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarBimestre";
		inputMap = this.jButtonModificarBimestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarBimestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarBimestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarBimestre";
		inputMap = this.jButtonActualizarBimestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarBimestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarBimestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarBimestre";
		inputMap = this.jButtonEliminarBimestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarBimestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarBimestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarBimestre";
		inputMap = this.jButtonCancelarBimestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarBimestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarBimestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarBimestre";
		inputMap = this.jButtonCerrarBimestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarBimestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarBimestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormBimestre.jButtonGuardarCambiosBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosBimestre";
		inputMap = this.jInternalFrameDetalleFormBimestre.jButtonGuardarCambiosBimestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormBimestre.jButtonGuardarCambiosBimestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosBimestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosBimestre.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosBimestreItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesBimestre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesBimestreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarBimestre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarBimestreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralBimestre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralBimestreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBimestre.jButtonidBimestreBusqueda.addActionListener(new ButtonActionListener(this,"idBimestreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBimestre.jButtonnombreBimestreBusqueda.addActionListener(new ButtonActionListener(this,"nombreBimestreBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionBimestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionBimestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarBimestreActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarBimestre.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosBimestre(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Bimestre bimestreAux:this.bimestreLogic.getBimestres()) {
					bimestreAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Bimestre bimestreAux:bimestres) {
					bimestreAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosBimestreItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBimestre(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Bimestre bimestreAux:this.bimestreLogic.getBimestres()) {
						bimestreAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Bimestre bimestreAux:bimestres) {
						bimestreAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Bimestre bimestreAux:this.bimestreLogic.getBimestres()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Bimestre bimestreAux:bimestres) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaBimestre(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBimestre.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBimestre.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBimestre,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosBimestreItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBimestre(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosBimestre.getSelectedRows();
			
			Bimestre bimestreLocal=new Bimestre();
			
			//this.seleccionarTodosBimestre(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bimestreLocal =(Bimestre) this.bimestreLogic.getBimestres().toArray()[this.jTableDatosBimestre.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					bimestreLocal =(Bimestre) this.bimestres.toArray()[this.jTableDatosBimestre.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				bimestreLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Bimestre bimestreAux:this.bimestreLogic.getBimestres()) {
						bimestreAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Bimestre bimestreAux:bimestres) {
						bimestreAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaBimestre(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBimestre.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBimestre.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBimestre,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualBimestreItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarBimestreParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralBimestreActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingBimestre(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralBimestre.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Bimestre bimestreAux:this.bimestreLogic.getBimestres()) {
				
						if(sTipoSeleccionar.equals(BimestreConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							bimestreAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Bimestre bimestreAux:bimestres) {
					
						if(sTipoSeleccionar.equals(BimestreConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							bimestreAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaBimestre(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesBimestreActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingBimestre(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioBimestre=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesBimestre.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormBimestre.jComboBoxTiposAccionesFormularioBimestre.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteBimestre) {				
					conSplash=true;//false;										
					
					//this.startProcessBimestre(conSplash);
				
					this.generarReporteBimestresSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBimestre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBimestre.jComboBoxTiposAccionesFormularioBimestre.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoBimestresSeleccionados();
				//this.jComboBoxTiposAccionesBimestre.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBimestresSeleccionados(false);
				//this.jComboBoxTiposAccionesBimestre.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBimestresSeleccionados(true);
				//this.jComboBoxTiposAccionesBimestre.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBimestre();
				
				this.exportarBimestresSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBimestre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBimestre.jComboBoxTiposAccionesFormularioBimestre.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionBimestres();
				//this.importarBimestres();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBimestre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBimestre.jComboBoxTiposAccionesFormularioBimestre.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBimestre();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelBimestresSeleccionados();
				//this.jComboBoxTiposAccionesBimestre.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Bimestre", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessBimestre();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoBimestre)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyBimestre(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Bimestre",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBimestre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBimestre.jComboBoxTiposAccionesFormularioBimestre.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralBimestre();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessBimestre(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesBimestreActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessBimestre();
			
			if(this.jInternalFrameDetalleFormBimestre==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Bimestre> bimestresSeleccionados=new ArrayList<Bimestre>();		
			Bimestre bimestre=new Bimestre();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingBimestre(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesBimestre.getSelectedItem();
			
			
			
			
			bimestresSeleccionados=this.getBimestresSeleccionados(true);
			//this.sTipoAccion;
			
			if(bimestresSeleccionados.size()==1) {
				for(Bimestre bimestreAux:bimestresSeleccionados) {
					bimestre=bimestreAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessBimestre();
			
      		//this.finishProcessBimestre(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarBimestreReturnGeneral() throws Exception {
		if(this.bimestreReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.bimestreReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.bimestreReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.bimestreReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.bimestreReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.bimestreReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingBimestre(false);
		}
		
		if(this.bimestreReturnGeneral.getConRetornoLista() || this.bimestreReturnGeneral.getConRetornoObjeto()) {
			if(this.bimestreReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.bimestreLogic.setBimestres(this.bimestreReturnGeneral.getBimestres());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.bimestreReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.bimestreLogic.setBimestre(this.bimestreReturnGeneral.getBimestre());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingBimestre(false);
		}
	}
	
	public void actualizarParametrosGeneralBimestre() throws Exception {
		
		
	}
	
	public ArrayList<Bimestre> getBimestresSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Bimestre> bimestresSeleccionados=new ArrayList<Bimestre>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioBimestre) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Bimestre bimestreAux:bimestreLogic.getBimestres()) {
					if(bimestreAux.getIsSelected()) {
						bimestresSeleccionados.add(bimestreAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Bimestre bimestreAux:this.bimestres) {
					if(bimestreAux.getIsSelected()) {
						bimestresSeleccionados.add(bimestreAux);				
					}
				}
			}
			
			if(bimestresSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						bimestresSeleccionados.addAll(this.bimestreLogic.getBimestres());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						bimestresSeleccionados.addAll(this.bimestres);				
					}
				}
			}
		} else {
			bimestresSeleccionados.add(this.bimestre);
		}
		
		return bimestresSeleccionados;
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
	
	public void generarReporteBimestresSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalBimestresSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoBimestresSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBimestresSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBimestresSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Bimestre",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesBimestresSeleccionados() throws Exception {
		ArrayList<Bimestre> bimestresSeleccionados=new ArrayList<Bimestre>();		
		
		bimestresSeleccionados=this.getBimestresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteBimestres("Todos",bimestresSeleccionados);
		
	}	
	
	public void generarReporteNormalBimestresSeleccionados() throws Exception {
		ArrayList<Bimestre> bimestresSeleccionados=new ArrayList<Bimestre>();		
		
		bimestresSeleccionados=this.getBimestresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteBimestres("Todos",bimestresSeleccionados);
	}		
	
	public void generarReporteProcesoAccionBimestresSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Bimestre> bimestresSeleccionados=new ArrayList<Bimestre>();
		
		bimestresSeleccionados=this.getBimestresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteBimestres("Todos",bimestresSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoBimestresSeleccionados() throws Exception {
		ArrayList<Bimestre> bimestresSeleccionados=new ArrayList<Bimestre>();		
		
		
		this.abrirInicializarFrameReporteDinamicoBimestre();
		
		
		bimestresSeleccionados=this.getBimestresSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoBimestre();
		
		
		//this.generarReporteBimestres("Todos",bimestresSeleccionados ,bimestreImplementable,bimestreImplementableHome);
	}
	
	public void mostrarImportacionBimestres() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionBimestre();
		
		this.abrirFrameImportacionBimestre();		
		
			
		//this.generarReporteBimestres("Todos",bimestresSeleccionados ,bimestreImplementable,bimestreImplementableHome);
	}
	
	public void importarBimestres() throws Exception {		
	
	}
	
	public void exportarBimestresSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelBimestresSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoBimestresSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlBimestresSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Bimestre",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoBimestresSeleccionados() throws Exception {
		ArrayList<Bimestre> bimestresSeleccionados=new ArrayList<Bimestre>();		
		
		bimestresSeleccionados=this.getBimestresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bimestre."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarBimestre(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Bimestre bimestreAux:bimestresSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarBimestre(bimestreAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//bimestreAux.setsDetalleGeneralEntityReporte(bimestreAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bimestre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarBimestre(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=BimestreConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BimestreConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BimestreConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarBimestre(Bimestre bimestre,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=bimestre.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=bimestre.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=bimestre.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelBimestresSeleccionados() throws Exception {
		ArrayList<Bimestre> bimestresSeleccionados=new ArrayList<Bimestre>();		
		
		bimestresSeleccionados=this.getBimestresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bimestre.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Bimestres");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelBimestre(row);				
				iRow++;
			}				
			
			for(Bimestre bimestreAux:bimestresSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelBimestre(bimestreAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bimestre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlBimestresSeleccionados() throws Exception {
		ArrayList<Bimestre> bimestresSeleccionados=new ArrayList<Bimestre>();		
		
		bimestresSeleccionados=this.getBimestresSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bimestre.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("bimestres");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("bimestre");
			//elementRoot.appendChild(element);
		
			for(Bimestre bimestreAux:bimestresSeleccionados) {
				element = document.createElement("bimestre");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlBimestre(bimestreAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bimestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bimestre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelBimestre(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(BimestreConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(BimestreConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(BimestreConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelBimestre(Bimestre bimestre,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(bimestre.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(bimestre.getnombre());				
	}
	
	public void setFilaDatosExportarXmlBimestre(Bimestre bimestre,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(BimestreConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(bimestre.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(BimestreConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(bimestre.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(BimestreConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(bimestre.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoBimestresSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Bimestre> bimestresSeleccionados=new ArrayList<Bimestre>();
		
		bimestresSeleccionados=this.getBimestresSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoBimestre(bimestresSeleccionados);
		
		this.generarReporteBimestres("Todos",bimestresSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoBimestre(ArrayList<Bimestre> bimestresSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Bimestre bimestreAux:bimestresSeleccionados) {
				bimestreAux.setsDetalleGeneralEntityReporte(bimestreAux.toString());
			
				if(sTipoSeleccionar.equals(BimestreConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					bimestreAux.setsDescripcionGeneralEntityReporte1(bimestreAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BimestreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesBimestre(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoBimestre=true;
				this.isVisibilidadCeldaNuevoRelacionesBimestre=true;
				this.isVisibilidadCeldaGuardarCambiosBimestre=true;
			}
			
			this.isVisibilidadCeldaModificarBimestre=false;
			this.isVisibilidadCeldaActualizarBimestre=false;
			this.isVisibilidadCeldaEliminarBimestre=false;
			this.isVisibilidadCeldaCancelarBimestre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBimestre=true;
				} else {
					this.isVisibilidadCeldaGuardarBimestre=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoBimestre=false;
			this.isVisibilidadCeldaNuevoRelacionesBimestre=false;
			this.isVisibilidadCeldaGuardarCambiosBimestre=false;
			this.isVisibilidadCeldaModificarBimestre=false;
			this.isVisibilidadCeldaActualizarBimestre=true;
			this.isVisibilidadCeldaEliminarBimestre=false;
			this.isVisibilidadCeldaCancelarBimestre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBimestre=true;
				} else {
					this.isVisibilidadCeldaGuardarBimestre=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoBimestre=false;
			this.isVisibilidadCeldaNuevoRelacionesBimestre=false;
			this.isVisibilidadCeldaGuardarCambiosBimestre=false;
			this.isVisibilidadCeldaModificarBimestre=false;
			this.isVisibilidadCeldaActualizarBimestre=true;
			this.isVisibilidadCeldaEliminarBimestre=true;
			this.isVisibilidadCeldaCancelarBimestre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBimestre=true;
				} else {
					this.isVisibilidadCeldaGuardarBimestre=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoBimestre=false;
			this.isVisibilidadCeldaNuevoRelacionesBimestre=false;
			this.isVisibilidadCeldaGuardarCambiosBimestre=false;
			this.isVisibilidadCeldaModificarBimestre=false;
			this.isVisibilidadCeldaActualizarBimestre=true;
			this.isVisibilidadCeldaEliminarBimestre=false;
			this.isVisibilidadCeldaCancelarBimestre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBimestre=false;
				} else {
					this.isVisibilidadCeldaGuardarBimestre=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoBimestre=true;
			this.isVisibilidadCeldaNuevoRelacionesBimestre=true;
			this.isVisibilidadCeldaGuardarCambiosBimestre=true;
			this.isVisibilidadCeldaModificarBimestre=false;
			this.isVisibilidadCeldaActualizarBimestre=false;
			this.isVisibilidadCeldaEliminarBimestre=false;
			this.isVisibilidadCeldaCancelarBimestre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBimestre=true;
				} else {
					this.isVisibilidadCeldaGuardarBimestre=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoBimestre=false;
			this.isVisibilidadCeldaNuevoRelacionesBimestre=false;
			this.isVisibilidadCeldaGuardarCambiosBimestre=false;
			this.isVisibilidadCeldaActualizarBimestre=false;
			this.isVisibilidadCeldaEliminarBimestre=false;
			this.isVisibilidadCeldaCancelarBimestre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBimestre=false;
				} else {
					this.isVisibilidadCeldaGuardarBimestre=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoBimestre=false;
			this.isVisibilidadCeldaNuevoRelacionesBimestre=false;
			this.isVisibilidadCeldaGuardarCambiosBimestre=false;
			this.isVisibilidadCeldaModificarBimestre=true;
			this.isVisibilidadCeldaActualizarBimestre=false;
			this.isVisibilidadCeldaEliminarBimestre=false;
			this.isVisibilidadCeldaCancelarBimestre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBimestre=false;
				} else {
					this.isVisibilidadCeldaGuardarBimestre=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(BimestreJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoBimestre=true;
			this.isVisibilidadCeldaNuevoRelacionesBimestre=true;
			this.isVisibilidadCeldaGuardarCambiosBimestre=true;
		} else {
			this.actualizarEstadoPanelsBimestre(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarBimestre=false;
			//this.isVisibilidadCeldaVerFormBimestre=false;
			this.isVisibilidadCeldaDuplicarBimestre=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!bimestreSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesBimestre=false;
		} else {
			this.isVisibilidadCeldaNuevoBimestre=false;
			this.isVisibilidadCeldaGuardarCambiosBimestre=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(bimestreSessionBean.getEsGuardarRelacionado()) {
			if(!bimestreSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesBimestre=false;												
			}
			
			this.jButtonCerrarBimestre.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesBimestre=false;
		}
		
		if(!this.permiteMantenimiento(this.bimestre)) {
			this.isVisibilidadCeldaActualizarBimestre=false;
			this.isVisibilidadCeldaEliminarBimestre=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesBimestre() {
	}
	
	public void actualizarEstadoPanelsBimestre(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionBimestre!=null) {
				this.jScrollPanelDatosEdicionBimestre.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBimestre!=null) {
				this.jScrollPanelDatosBimestre.setVisible(true);
			}
			
			if(this.jPanelPaginacionBimestre!=null) {
				this.jPanelPaginacionBimestre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBimestre!=null) {
				this.jPanelParametrosReportesBimestre.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionBimestre!=null) {
				this.jScrollPanelDatosEdicionBimestre.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosBimestre!=null) {
				this.jScrollPanelDatosBimestre.setVisible(false);
			}
			
			if(this.jPanelPaginacionBimestre!=null) {
				this.jPanelPaginacionBimestre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBimestre!=null) {
				this.jPanelParametrosReportesBimestre.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionBimestre!=null) {
				this.jScrollPanelDatosEdicionBimestre.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosBimestre!=null) {
				this.jScrollPanelDatosBimestre.setVisible(false);
			}
			
			if(this.jPanelPaginacionBimestre!=null) {
				this.jPanelPaginacionBimestre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBimestre!=null) {
				this.jPanelParametrosReportesBimestre.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionBimestre!=null) {
				this.jScrollPanelDatosEdicionBimestre.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBimestre!=null) {
				this.jScrollPanelDatosBimestre.setVisible(false);
			}
			
			if(this.jPanelPaginacionBimestre!=null) {
				this.jPanelPaginacionBimestre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBimestre!=null) {
				this.jPanelParametrosReportesBimestre.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionBimestre!=null) {
				this.jScrollPanelDatosEdicionBimestre.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBimestre!=null) {
				this.jScrollPanelDatosBimestre.setVisible(true);
			}
			
			if(this.jPanelPaginacionBimestre!=null) {
				this.jPanelPaginacionBimestre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBimestre!=null) {
				this.jPanelParametrosReportesBimestre.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionBimestre!=null) {
				this.jScrollPanelDatosEdicionBimestre.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosBimestre!=null) {
				this.jScrollPanelDatosBimestre.setVisible(true);
			}
			
			if(this.jPanelPaginacionBimestre!=null) {
				this.jPanelPaginacionBimestre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBimestre!=null) {
				this.jPanelParametrosReportesBimestre.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionBimestre!=null) {
				this.jScrollPanelDatosEdicionBimestre.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosBimestre!=null) {
				this.jScrollPanelDatosBimestre.setVisible(true);
			}
			
			if(this.jPanelPaginacionBimestre!=null) {
				this.jPanelPaginacionBimestre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBimestre!=null) {
				this.jPanelParametrosReportesBimestre.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.bimestreSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.bimestreSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//BimestreSessionBean bimestreSessionBean=new BimestreSessionBean();
		
		if(this.bimestreSessionBean==null) {
			this.bimestreSessionBean=new BimestreSessionBean();
		}
		
		this.bimestreSessionBean.setsUltimaBusquedaBimestre(this.getsAccionBusqueda());
		this.bimestreSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.bimestreSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//BimestreSessionBean bimestreSessionBean=new BimestreSessionBean();
		
		if(this.bimestreSessionBean==null) {
			this.bimestreSessionBean=new BimestreSessionBean();
		}
		
		if(this.bimestreSessionBean.getsUltimaBusquedaBimestre()!=null&&!this.bimestreSessionBean.getsUltimaBusquedaBimestre().equals("")) {
			this.setsAccionBusqueda(bimestreSessionBean.getsUltimaBusquedaBimestre());
			this.setiNumeroPaginacion(bimestreSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(bimestreSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.bimestreSessionBean.setsUltimaBusquedaBimestre("");
		this.bimestreSessionBean.setiNumeroPaginacion(BimestreConstantesFunciones.INUMEROPAGINACION);
		this.bimestreSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaBimestre(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioBimestre() {
		this.updateBorderResaltarBusquedasFormularioBimestre();
		this.updateVisibilidadBusquedasFormularioBimestre();
		this.updateHabilitarBusquedasFormularioBimestre();
	}
	
	public void updateBorderResaltarBusquedasFormularioBimestre() {					
	}
	
	public void updateVisibilidadBusquedasFormularioBimestre() {
	}
	
	public void updateHabilitarBusquedasFormularioBimestre() {
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
	
	public void updateControlesFormularioBimestre() throws Exception {

		if(this.jInternalFrameDetalleFormBimestre==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioBimestre();
		this.updateVisibilidadResaltarControlesFormularioBimestre();
		this.updateHabilitarResaltarControlesFormularioBimestre();
		
	}
	
	public void updateBorderResaltarControlesFormularioBimestre() throws Exception {
		if(this.jInternalFrameDetalleFormBimestre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.bimestreConstantesFunciones.resaltaridBimestre!=null && this.jInternalFrameDetalleFormBimestre!=null) {this.jInternalFrameDetalleFormBimestre.jTextFieldidBimestre.setBorder(this.bimestreConstantesFunciones.resaltaridBimestre);}
		if(this.bimestreConstantesFunciones.resaltarnombreBimestre!=null && this.jInternalFrameDetalleFormBimestre!=null) {this.jInternalFrameDetalleFormBimestre.jTextFieldnombreBimestre.setBorder(this.bimestreConstantesFunciones.resaltarnombreBimestre);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioBimestre() throws Exception {		
		if(this.jInternalFrameDetalleFormBimestre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBimestre!=null) {
	
		//this.jInternalFrameDetalleFormBimestre.jTextFieldidBimestre.setVisible(this.bimestreConstantesFunciones.mostraridBimestre);
		this.jInternalFrameDetalleFormBimestre.jPanelidBimestre.setVisible(this.bimestreConstantesFunciones.mostraridBimestre);
		//this.jInternalFrameDetalleFormBimestre.jTextFieldnombreBimestre.setVisible(this.bimestreConstantesFunciones.mostrarnombreBimestre);
		this.jInternalFrameDetalleFormBimestre.jPanelnombreBimestre.setVisible(this.bimestreConstantesFunciones.mostrarnombreBimestre);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioBimestre() throws Exception {
		if(this.jInternalFrameDetalleFormBimestre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBimestre!=null) {
	
		this.jInternalFrameDetalleFormBimestre.jTextFieldidBimestre.setEnabled(this.bimestreConstantesFunciones.activaridBimestre);
		this.jInternalFrameDetalleFormBimestre.jTextFieldnombreBimestre.setEnabled(this.bimestreConstantesFunciones.activarnombreBimestre);
		}
	}
	
		
}