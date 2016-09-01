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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.ParentezcoConstantesFunciones;
import com.bydan.erp.nomina.util.ParentezcoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.ParentezcoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.ParentezcoBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
public class ParentezcoBeanSwingJInternalFrame extends ParentezcoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParentezcoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Parentezco> parentezcoValidator = new ClassValidator<Parentezco>(Parentezco.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Parentezco parentezco;	
	public Parentezco parentezcoAux;
	public Parentezco parentezcoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Parentezco parentezcoTotales;
	public Long idParentezcoActual;
	public Long iIdNuevoParentezco=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosReferencia=false;

	public Boolean getIsTienePermisosReferencia() {
		return isTienePermisosReferencia;
	}

	public void setIsTienePermisosReferencia(Boolean isTienePermisosReferencia) {
		this.isTienePermisosReferencia= isTienePermisosReferencia;
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
	
	public Boolean isPermisoTodoParentezco;
	public Boolean isPermisoNuevoParentezco;
	public Boolean isPermisoActualizarParentezco;
	public Boolean isPermisoActualizarOriginalParentezco;
	public Boolean isPermisoEliminarParentezco;
	public Boolean isPermisoGuardarCambiosParentezco;
	public Boolean isPermisoConsultaParentezco;
	public Boolean isPermisoBusquedaParentezco;
	public Boolean isPermisoReporteParentezco;
	public Boolean isPermisoPaginacionMedioParentezco;
	public Boolean isPermisoPaginacionAltoParentezco;
	public Boolean isPermisoPaginacionTodoParentezco;
	public Boolean isPermisoCopiarParentezco;
	public Boolean isPermisoVerFormParentezco;
	public Boolean isPermisoDuplicarParentezco;
	public Boolean isPermisoOrdenParentezco;
	
	
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
	
	public ParentezcoParameterReturnGeneral parentezcoReturnGeneral;
	public ParentezcoParameterReturnGeneral parentezcoParameterGeneral;
	
	

	public ReferenciaLogic referenciaLogic=null;

	public ReferenciaLogic getReferenciaLogic() {
		return referenciaLogic;
	}

	public void setReferenciaLogic(ReferenciaLogic referenciaLogic) {
		this.referenciaLogic = referenciaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParentezco=false;
	public Boolean esParaAccionDesdeFormularioParentezco=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParentezcoSessionBeanAdditional parentezcoSessionBeanAdditional=null;
	
	public ParentezcoSessionBeanAdditional getParentezcoSessionBeanAdditional() {
		return this.parentezcoSessionBeanAdditional;
	}
	
	public void setParentezcoSessionBeanAdditional(ParentezcoSessionBeanAdditional parentezcoSessionBeanAdditional) {
		try {
			this.parentezcoSessionBeanAdditional=parentezcoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParentezcoBeanSwingJInternalFrameAdditional parentezcoBeanSwingJInternalFrameAdditional=null;
	//public class ParentezcoBeanSwingJInternalFrame
	
	public ParentezcoBeanSwingJInternalFrameAdditional getParentezcoBeanSwingJInternalFrameAdditional() {
		return this.parentezcoBeanSwingJInternalFrameAdditional;
	}
	
	public void setParentezcoBeanSwingJInternalFrameAdditional(ParentezcoBeanSwingJInternalFrameAdditional parentezcoBeanSwingJInternalFrameAdditional) {
		try {
			this.parentezcoBeanSwingJInternalFrameAdditional=parentezcoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParentezcoLogic parentezcoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Parentezco parentezcoBean;
	public ParentezcoConstantesFunciones parentezcoConstantesFunciones;
	//public ParentezcoParameterReturnGeneral parentezcoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Parentezco> parentezcos;	
	//public List<Parentezco> parentezcosEliminados;
	//public List<Parentezco> parentezcosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParentezco=false;
	public Boolean isVisibilidadCeldaDuplicarParentezco=true;
	public Boolean isVisibilidadCeldaCopiarParentezco=true;
	public Boolean isVisibilidadCeldaVerFormParentezco=true;
	public Boolean isVisibilidadCeldaOrdenParentezco=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParentezco=false;
	public Boolean isVisibilidadCeldaModificarParentezco=false;
	public Boolean isVisibilidadCeldaActualizarParentezco=false;
	public Boolean isVisibilidadCeldaEliminarParentezco=false;
	public Boolean isVisibilidadCeldaCancelarParentezco=false;
	public Boolean isVisibilidadCeldaGuardarParentezco=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParentezco=false;	
	
	
	
	public Long getiIdNuevoParentezco() {
		return this.iIdNuevoParentezco;
	}

	public void setiIdNuevoParentezco(Long iIdNuevoParentezco) {
		this.iIdNuevoParentezco = iIdNuevoParentezco;
	}
	
	public Long getidParentezcoActual() {
		return this.idParentezcoActual;
	}

	public void setidParentezcoActual(Long idParentezcoActual) {
		this.idParentezcoActual = idParentezcoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Parentezco getparentezco() {
		return this.parentezco;
	}

	public void setparentezco(Parentezco parentezco) {
		this.parentezco = parentezco;
	}
	
	public Parentezco getparentezcoAux() {
		return this.parentezcoAux;
	}

	public void setparentezcoAux(Parentezco parentezcoAux) {
		this.parentezcoAux = parentezcoAux;
	}				
	
	public Parentezco getparentezcoAnterior() {
		return this.parentezcoAnterior;
	}

	public void setparentezcoAnterior(Parentezco parentezcoAnterior) {
		this.parentezcoAnterior = parentezcoAnterior;
	}	
	
	public Parentezco getparentezcoTotales() {
		return this.parentezcoTotales;
	}

	public void setparentezcoTotales(Parentezco parentezcoTotales) {
		this.parentezcoTotales = parentezcoTotales;
	}	
	
	public Parentezco getparentezcoBean() {
		return this.parentezcoBean;
	}

	public void setparentezcoBean(Parentezco parentezcoBean) {
		this.parentezcoBean = parentezcoBean;
	}	
	
	public ParentezcoParameterReturnGeneral getparentezcoReturnGeneral() {
		return this.parentezcoReturnGeneral;
	}

	public void setparentezcoReturnGeneral(ParentezcoParameterReturnGeneral parentezcoReturnGeneral) {
		this.parentezcoReturnGeneral = parentezcoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ParentezcoLogic getParentezcoLogic()	{		
		return parentezcoLogic;
	}

	public void setParentezcoLogic(ParentezcoLogic parentezcoLogic) {
		this.parentezcoLogic = parentezcoLogic;
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
	
	public Boolean getIsEsNuevoParentezco() {
		return isEsNuevoParentezco;
	}

	public void setIsEsNuevoParentezco(Boolean isEsNuevoParentezco) {
		this.isEsNuevoParentezco = isEsNuevoParentezco;
	}

	public Boolean getEsParaAccionDesdeFormularioParentezco() {
		return esParaAccionDesdeFormularioParentezco;
	}
	
	public void setEsParaAccionDesdeFormularioParentezco(Boolean esParaAccionDesdeFormularioParentezco) {
		this.esParaAccionDesdeFormularioParentezco = esParaAccionDesdeFormularioParentezco;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesParentezco() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParentezcoConstantesFunciones.refrescarForeignKeysDescripcionesParentezco(this.parentezcoLogic.getParentezcos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParentezcoConstantesFunciones.refrescarForeignKeysDescripcionesParentezco(this.parentezcos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parentezcoLogic.setParentezcos(this.parentezcos);
			parentezcoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParentezcoParameterReturnGeneral getParentezcoParameterGeneral() {
		return this.parentezcoParameterGeneral;
	}
	
	public void setParentezcoParameterGeneral(ParentezcoParameterReturnGeneral parentezcoParameterGeneral) {
		this.parentezcoParameterGeneral = parentezcoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParentezco() {
		return isPermisoTodoParentezco;
	}

	public void setIsPermisoTodoParentezco(Boolean isPermisoTodoParentezco) {
		this.isPermisoTodoParentezco = isPermisoTodoParentezco;
	}

	public Boolean getIsPermisoNuevoParentezco() {
		return isPermisoNuevoParentezco;
	}

	public void setIsPermisoNuevoParentezco(Boolean isPermisoNuevoParentezco) {
		this.isPermisoNuevoParentezco = isPermisoNuevoParentezco;
	}

	public Boolean getIsPermisoActualizarParentezco() {
		return isPermisoActualizarParentezco;
	}

	public void setIsPermisoActualizarParentezco(Boolean isPermisoActualizarParentezco) {
		this.isPermisoActualizarParentezco = isPermisoActualizarParentezco;
	}

	public Boolean getIsPermisoEliminarParentezco() {
		return isPermisoEliminarParentezco;
	}

	public void setIsPermisoEliminarParentezco(Boolean isPermisoEliminarParentezco) {
		this.isPermisoEliminarParentezco = isPermisoEliminarParentezco;
	}

	public Boolean getIsPermisoGuardarCambiosParentezco() {
		return isPermisoGuardarCambiosParentezco;
	}

	public void setIsPermisoGuardarCambiosParentezco(Boolean isPermisoGuardarCambiosParentezco) {
		this.isPermisoGuardarCambiosParentezco = isPermisoGuardarCambiosParentezco;
	}
	
	public Boolean getIsPermisoConsultaParentezco() {
		return isPermisoConsultaParentezco;
	}

	public void setIsPermisoConsultaParentezco(Boolean isPermisoConsultaParentezco) {
		this.isPermisoConsultaParentezco = isPermisoConsultaParentezco;
	}

	public Boolean getIsPermisoBusquedaParentezco() {
		return isPermisoBusquedaParentezco;
	}

	public void setIsPermisoBusquedaParentezco(Boolean isPermisoBusquedaParentezco) {
		this.isPermisoBusquedaParentezco = isPermisoBusquedaParentezco;
	}

	public Boolean getIsPermisoReporteParentezco() {
		return isPermisoReporteParentezco;
	}

	public void setIsPermisoReporteParentezco(Boolean isPermisoReporteParentezco) {
		this.isPermisoReporteParentezco = isPermisoReporteParentezco;
	}
	
	public Boolean getIsPermisoPaginacionMedioParentezco() {
		return isPermisoPaginacionMedioParentezco;
	}

	public void setIsPermisoPaginacionMedioParentezco(Boolean isPermisoPaginacionMedioParentezco) {
		this.isPermisoPaginacionMedioParentezco = isPermisoPaginacionMedioParentezco;
	}
	
	public Boolean getIsPermisoPaginacionTodoParentezco() {
		return isPermisoPaginacionTodoParentezco;
	}

	public void setIsPermisoPaginacionTodoParentezco(Boolean isPermisoPaginacionTodoParentezco) {
		this.isPermisoPaginacionTodoParentezco = isPermisoPaginacionTodoParentezco;
	}
	
	public Boolean getIsPermisoPaginacionAltoParentezco() {
		return isPermisoPaginacionAltoParentezco;
	}

	public void setIsPermisoPaginacionAltoParentezco(Boolean isPermisoPaginacionAltoParentezco) {
		this.isPermisoPaginacionAltoParentezco = isPermisoPaginacionAltoParentezco;
	}
	
	public Boolean getIsPermisoCopiarParentezco() {
		return isPermisoCopiarParentezco;
	}

	public void setIsPermisoCopiarParentezco(Boolean isPermisoCopiarParentezco) {
		this.isPermisoCopiarParentezco = isPermisoCopiarParentezco;
	}
	
	public Boolean getIsPermisoVerFormParentezco() {
		return isPermisoVerFormParentezco;
	}

	public void setIsPermisoVerFormParentezco(Boolean isPermisoVerFormParentezco) {
		this.isPermisoVerFormParentezco = isPermisoVerFormParentezco;
	}
	
	public Boolean getIsPermisoDuplicarParentezco() {
		return isPermisoDuplicarParentezco;
	}

	public void setIsPermisoDuplicarParentezco(Boolean isPermisoDuplicarParentezco) {
		this.isPermisoDuplicarParentezco = isPermisoDuplicarParentezco;
	}
	
	public Boolean getIsPermisoOrdenParentezco() {
		return isPermisoOrdenParentezco;
	}

	public void setIsPermisoOrdenParentezco(Boolean isPermisoOrdenParentezco) {
		this.isPermisoOrdenParentezco = isPermisoOrdenParentezco;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParentezco() {
		return isVisibilidadCeldaNuevoParentezco;
	}

	public void setIsVisibilidadCeldaNuevoParentezco(Boolean isVisibilidadCeldaNuevoParentezco) {
		this.isVisibilidadCeldaNuevoParentezco = isVisibilidadCeldaNuevoParentezco;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParentezco() {
		return isVisibilidadCeldaDuplicarParentezco;
	}

	public void setIsVisibilidadCeldaDuplicarParentezco(Boolean isVisibilidadCeldaDuplicarParentezco) {
		this.isVisibilidadCeldaDuplicarParentezco = isVisibilidadCeldaDuplicarParentezco;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParentezco() {
		return isVisibilidadCeldaCopiarParentezco;
	}

	public void setIsVisibilidadCeldaCopiarParentezco(Boolean isVisibilidadCeldaCopiarParentezco) {
		this.isVisibilidadCeldaCopiarParentezco = isVisibilidadCeldaCopiarParentezco;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParentezco() {
		return isVisibilidadCeldaVerFormParentezco;
	}

	public void setIsVisibilidadCeldaVerFormParentezco(Boolean isVisibilidadCeldaVerFormParentezco) {
		this.isVisibilidadCeldaVerFormParentezco = isVisibilidadCeldaVerFormParentezco;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParentezco() {
		return isVisibilidadCeldaOrdenParentezco;
	}

	public void setIsVisibilidadCeldaOrdenParentezco(Boolean isVisibilidadCeldaOrdenParentezco) {
		this.isVisibilidadCeldaOrdenParentezco = isVisibilidadCeldaOrdenParentezco;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParentezco() {
		return isVisibilidadCeldaNuevoRelacionesParentezco;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParentezco(Boolean isVisibilidadCeldaNuevoRelacionesParentezco) {
		this.isVisibilidadCeldaNuevoRelacionesParentezco = isVisibilidadCeldaNuevoRelacionesParentezco;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParentezco() {
		return isVisibilidadCeldaModificarParentezco;
	}

	public void setIsVisibilidadCeldaModificarParentezco(Boolean isVisibilidadCeldaModificarParentezco) {
		this.isVisibilidadCeldaModificarParentezco = isVisibilidadCeldaModificarParentezco;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParentezco() {
		return isVisibilidadCeldaActualizarParentezco;
	}

	public void setIsVisibilidadCeldaActualizarParentezco(Boolean isVisibilidadCeldaActualizarParentezco) {
		this.isVisibilidadCeldaActualizarParentezco = isVisibilidadCeldaActualizarParentezco;
	}

	public Boolean getIsVisibilidadCeldaEliminarParentezco() {
		return isVisibilidadCeldaEliminarParentezco;
	}

	public void setIsVisibilidadCeldaEliminarParentezco(Boolean isVisibilidadCeldaEliminarParentezco) {
		this.isVisibilidadCeldaEliminarParentezco = isVisibilidadCeldaEliminarParentezco;
	}

	public Boolean getIsVisibilidadCeldaCancelarParentezco() {
		return isVisibilidadCeldaCancelarParentezco;
	}

	public void setIsVisibilidadCeldaCancelarParentezco(Boolean isVisibilidadCeldaCancelarParentezco) {
		this.isVisibilidadCeldaCancelarParentezco = isVisibilidadCeldaCancelarParentezco;
	}

	public Boolean getIsVisibilidadCeldaGuardarParentezco() {
		return isVisibilidadCeldaGuardarParentezco;
	}

	public void setIsVisibilidadCeldaGuardarParentezco(Boolean isVisibilidadCeldaGuardarParentezco) {
		this.isVisibilidadCeldaGuardarParentezco = isVisibilidadCeldaGuardarParentezco;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParentezco() {
		return isVisibilidadCeldaGuardarCambiosParentezco;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParentezco(Boolean isVisibilidadCeldaGuardarCambiosParentezco) {
		this.isVisibilidadCeldaGuardarCambiosParentezco = isVisibilidadCeldaGuardarCambiosParentezco;
	}
		
	public ParentezcoSessionBean getparentezcoSessionBean() {
		return this.parentezcoSessionBean;
	}
	
	public void setparentezcoSessionBean(ParentezcoSessionBean parentezcoSessionBean) {
		this.parentezcoSessionBean=parentezcoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParentezco(Parentezco parentezco)throws Exception {
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
	
	public void bugActualizarReferenciaActual(Parentezco parentezco,Parentezco parentezcoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParentezco(parentezco);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parentezcoAux.setId(parentezco.getId());
		parentezcoAux.setVersionRow(parentezco.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParentezco();
		
			int intSelectedRow = this.jTableDatosParentezco.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezco =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parentezco =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParentezcoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParentezco(this.parentezco,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParentezco(this.parentezco);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parentezcoValidator.getInvalidValues(this.parentezco);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parentezcoLogic.setDatosCliente(datosCliente);
			parentezcoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parentezcoAux=new  Parentezco();
				
				parentezcoAux.setIsNew(true);
				parentezcoAux.setIsChanged(true);
				
				parentezcoAux.setParentezcoOriginal(this.parentezco);
				
				parentezcoAux.setId(this.parentezco.getId());	
				parentezcoAux.setVersionRow(this.parentezco.getVersionRow());	
				parentezcoAux.setcodigo(this.parentezco.getcodigo());	
				parentezcoAux.setnombre(this.parentezco.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parentezcoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parentezcoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parentezcoAux,parentezcoLogic.getParentezcos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parentezcoAux,parentezcos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parentezcoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parentezcoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parentezcoLogic.saveParentezcos();//WithConnection
						//parentezcoLogic.getSetVersionRowParentezcos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parentezco,parentezcoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parentezcoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias().addAll(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referencias.addAll(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parentezcoLogic.saveParentezcoRelaciones(parentezcoAux,this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias());//WithConnection
								//parentezcoLogic.getSetVersionRowParentezcos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parentezco,parentezcoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaLogic.setReferencias(new ArrayList<Referencia>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referencias= new ArrayList<Referencia>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							parentezcoAux.setReferencias(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parentezcoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parentezcoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parentezcoAux,parentezcoLogic.getParentezcos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parentezcoAux,parentezcos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parentezco,parentezcoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parentezcoAux=new  Parentezco();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parentezcoSessionBean.getEsGuardarRelacionado() 
					|| (this.parentezcoSessionBean.getEsGuardarRelacionado() && this.parentezco.getId()>=0)) {
						
					parentezcoAux.setIsNew(false);
				}
				
				parentezcoAux.setIsDeleted(false);
			
				parentezcoAux.setId(this.parentezco.getId());	
				parentezcoAux.setVersionRow(this.parentezco.getVersionRow());	
				parentezcoAux.setcodigo(this.parentezco.getcodigo());	
				parentezcoAux.setnombre(this.parentezco.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parentezcoAux,parentezcoLogic.getParentezcos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parentezcoAux,parentezcos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parentezcoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parentezcoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parentezcoLogic.saveParentezcos();//WithConnection
						//parentezcoLogic.getSetVersionRowParentezcos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parentezco,parentezcoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parentezcoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias().addAll(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referencias.addAll(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parentezcoLogic.saveParentezcoRelaciones(parentezcoAux,this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias());//WithConnection
								//parentezcoLogic.getSetVersionRowParentezcos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parentezco,parentezcoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaLogic.setReferencias(new ArrayList<Referencia>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referencias= new ArrayList<Referencia>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							parentezcoAux.setReferencias(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parentezcoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parentezcoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parentezcoAux,parentezcoLogic.getParentezcos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parentezcoAux,parentezcos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parentezco,parentezcoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parentezcoAux=new  Parentezco();
				
				parentezcoAux.setIsNew(false);
				parentezcoAux.setIsChanged(false);
				
				parentezcoAux.setIsDeleted(true);
				
				parentezcoAux.setId(this.parentezco.getId());	
				parentezcoAux.setVersionRow(this.parentezco.getVersionRow());	
				parentezcoAux.setcodigo(this.parentezco.getcodigo());	
				parentezcoAux.setnombre(this.parentezco.getnombre());	
				
				if(this.parentezcoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parentezcoAux.getId()>=0) {	
						this.parentezcosEliminados.add(parentezcoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parentezcoAux,parentezcoLogic.getParentezcos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parentezcoAux,parentezcos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parentezcoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parentezcoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parentezcoLogic.saveParentezcos();//WithConnection
						//parentezcoLogic.getSetVersionRowParentezcos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parentezcoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias().addAll(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referencias.addAll(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parentezcoLogic.saveParentezcoRelaciones(parentezcoAux,this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias());//WithConnection
								//parentezcoLogic.getSetVersionRowParentezcos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaLogic.setReferencias(new ArrayList<Referencia>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referencias= new ArrayList<Referencia>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							parentezcoAux.setReferencias(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.parentezcoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parentezcoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parentezcoAux,parentezcoLogic.getParentezcos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parentezcoAux,parentezcos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.getParentezcos().addAll(this.parentezcosEliminados);
					
					parentezcoLogic.saveParentezcos();//WithConnection
					//parentezcoLogic.getSetVersionRowParentezcos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.parentezcosEliminados= new ArrayList<Parentezco>();		
			}
			
			if(this.parentezcoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parentezcoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parentezco GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parentezco",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parentezco=parentezcoAux;
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
      		//this.finishProcessParentezco();
      	}
		
	}	
	
	public void actualizarRelaciones(Parentezco parentezcoLocal) throws Exception {
		
		if(this.parentezcoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				parentezcoLocal.setReferencias(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias());
			
			} else {
			
				parentezcoLocal.setReferencias(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referencias);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Parentezco parentezcoLocal) throws Exception {	
		if(this.parentezcoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarParentezcoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParentezco.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parentezco =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parentezco =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parentezcoValidator.getInvalidValues(this.parentezco);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Parentezco parentezco,List<Parentezco> parentezcos) throws Exception {
		try	{		
			ParentezcoConstantesFunciones.actualizarLista(parentezco,parentezcos,this.parentezcoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Parentezco parentezco,List<Parentezco> parentezcos) throws Exception {
		try	{			
			ParentezcoConstantesFunciones.actualizarSelectedLista(parentezco,parentezcos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Parentezco> parentezcosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parentezcosLocal=this.parentezcoLogic.getParentezcos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parentezcosLocal=this.parentezcos;
			}
			//ARCHITECTURE
		
			for(Parentezco parentezcoLocal:parentezcosLocal) {
				if(this.permiteMantenimiento(parentezcoLocal) && parentezcoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParentezcoConstantesFunciones.getParentezcoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParentezcoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParentezco.jLabelcodigoParentezco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParentezcoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParentezco.jLabelnombreParentezco,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParentezco!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParentezco.jLabelcodigoParentezco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParentezco.jLabelnombreParentezco,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Referencia")) {
			if(this.parentezco==null) {
				this.parentezco= new Parentezco();
			}

			if(this.parentezcoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoParentezco
				this.setVariablesFormularioToObjetoActualParentezco(this.parentezco,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysParentezco(this.parentezco);

				this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.getreferencia().setParentezco(this.parentezco);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoParentezco--;	
		
		
		this.parentezcoAux=new Parentezco();
		
		this.parentezcoAux.setId(this.iIdNuevoParentezco);
		this.parentezcoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parentezcoLogic.getParentezcos().add(this.parentezcoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parentezcos.add(this.parentezcoAux);
		}
		//ARCHITECTURE
		
		this.parentezco=this.parentezcoAux;
		
		if(ParentezcoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParentezco(this.parentezco);
			this.setVariablesObjetoActualToFormularioForeignKeyParentezco(this.parentezco);
		}
				
		//this.setDefaultControlesParentezco();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParentezco();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParentezco();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParentezco();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParentezco(this.parentezcoBean,this.parentezco,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParentezco(this.parentezco);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParentezcoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parentezcoSessionBean.getConGuardarRelaciones()) {
			classes=ParentezcoConstantesFunciones.getClassesRelationshipsOfParentezco(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parentezcoReturnGeneral=parentezcoLogic.procesarEventosParentezcosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parentezcoLogic.getParentezcos(),this.parentezco,this.parentezcoParameterGeneral,this.isEsNuevoParentezco,classes);//this.parentezcoLogic.getParentezco()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParentezco(this.parentezcoReturnGeneral,this.parentezcoBean,false);
		
		if(this.parentezcoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParentezco(this.parentezcoReturnGeneral.getParentezco());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParentezco(this.parentezcoReturnGeneral.getParentezco());
		}
		
		if(this.parentezcoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParentezco(this.parentezcoReturnGeneral.getParentezco(),classes);//this.parentezcoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParentezco(this.parentezco,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParentezco();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParentezco();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParentezcoBeanSwingJInternalFrameAdditional.RecargarFormParentezco(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParentezco(false);
						
			if(parentezcoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaSessionBean.getEsGuardarRelacionado() && ReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonReferenciaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ParentezcoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParentezco();
			}
			
			this.actualizarVisualTableDatosParentezco();
			
			this.jTableDatosParentezco.setRowSelectionInterval(this.getIndiceNuevoParentezco(), this.getIndiceNuevoParentezco());
			
			this.seleccionarFilaTablaParentezcoActual();
						
			this.actualizarEstadoCeldasBotonesParentezco("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParentezco(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormParentezco.jTextFieldcodigoParentezco.setEnabled(isHabilitar && this.parentezcoConstantesFunciones.activarcodigoParentezco);
		this.jInternalFrameDetalleFormParentezco.jTextAreanombreParentezco.setEnabled(isHabilitar && this.parentezcoConstantesFunciones.activarnombreParentezco);	
		
	};
	
	public void setDefaultControlesParentezco() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParentezco(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parentezcoSessionBean.setConGuardarRelaciones(true);			
			this.parentezcoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParentezco.jTabbedPaneRelacionesParentezco.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.parentezcoSessionBean.setConGuardarRelaciones(false);			
			this.parentezcoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParentezco.jTabbedPaneRelacionesParentezco.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoParentezco() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Parentezco parentezcoAux:this.parentezcoLogic.getParentezcos()) {
				if(parentezcoAux.getId().equals(this.iIdNuevoParentezco)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Parentezco parentezcoAux:this.parentezcos) {
				if(parentezcoAux.getId().equals(this.iIdNuevoParentezco)) {
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
	
	public int getIndiceActualParentezco(Parentezco parentezco,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Parentezco parentezcoAux:this.parentezcoLogic.getParentezcos()) {
				if(parentezcoAux.getId().equals(parentezco.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Parentezco parentezcoAux:this.parentezcos) {
				if(parentezcoAux.getId().equals(parentezco.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParentezco(Parentezco parentezcoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Parentezco parentezcoAux:this.parentezcoLogic.getParentezcos()) {
				if(parentezcoAux.getParentezcoOriginal().getId().equals(parentezcoOriginal.getId())) {
					existe=true;
					parentezcoOriginal.setId(parentezcoAux.getId());
					parentezcoOriginal.setVersionRow(parentezcoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Parentezco parentezcoAux:this.parentezcos) {
				if(parentezcoAux.getParentezcoOriginal().getId().equals(parentezcoOriginal.getId())) {
					existe=true;
					parentezcoOriginal.setId(parentezcoAux.getId());
					parentezcoOriginal.setVersionRow(parentezcoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParentezco(Boolean esParaCancelar) throws Exception {
		parentezcosAux=new ArrayList<Parentezco>();
		parentezcoAux=new Parentezco();
		
		if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Parentezco parentezcoAux:this.parentezcoLogic.getParentezcos()) {
					if(parentezcoAux.getId()<0) {
						parentezcosAux.add(parentezcoAux);
					}		
				}
				this.iIdNuevoParentezco=0L;
				this.parentezcoLogic.getParentezcos().removeAll(parentezcosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Parentezco parentezcoAux:this.parentezcos) {
					if(parentezcoAux.getId()<0) {
						parentezcosAux.add(parentezcoAux);
					}		
				}
				this.iIdNuevoParentezco=0L;
				this.parentezcos.removeAll(parentezcosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParentezco 
					&& this.parentezcoLogic.getParentezcos().size()>0
					) {
					parentezcoAux=this.parentezcoLogic.getParentezcos().get(this.parentezcoLogic.getParentezcos().size() - 1);
				
					if(parentezcoAux.getId()<0) {
						this.parentezcoLogic.getParentezcos().remove(parentezcoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParentezco && this.parentezcos.size()>0) {
					parentezcoAux=this.parentezcos.get(this.parentezcos.size() - 1);
				
					if(parentezcoAux.getId()<0) {
						this.parentezcos.remove(parentezcoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParentezco(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parentezco.getId()<0) {
				this.parentezcoLogic.getParentezcos().remove(this.parentezco);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parentezco.getId()<0) {
				this.parentezcos.remove(this.parentezco);
			}
		}			
	}
	
	public void setEstadosInicialesParentezco(List<Parentezco> parentezcosAux) throws Exception {
		ParentezcoConstantesFunciones.setEstadosInicialesParentezco(parentezcosAux);
	}
	
	public void setEstadosInicialesParentezco(Parentezco parentezcoAux) throws Exception {
		ParentezcoConstantesFunciones.setEstadosInicialesParentezco(parentezcoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParentezcoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParentezco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParentezcoActual()) {
				if(!this.isEsNuevoParentezco) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParentezco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParentezco=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParentezcoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parentezco ?", "MANTENIMIENTO DE Parentezco", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParentezco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Parentezco parentezco) throws Exception {
		ParentezcoConstantesFunciones.seleccionarAsignar(this.parentezco,parentezco);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParentezco=this.isPermisoActualizarOriginalParentezco;
			
			
			this.seleccionarAsignar(parentezco);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParentezcoConstantesFunciones.quitarEspaciosParentezco(this.parentezco,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParentezco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parentezcoSessionBean.setsFuncionBusquedaRapida(this.parentezcoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoParentezco) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParentezco(esParaCancelar);				
				this.cancelarNuevoParentezco(esParaCancelar);								
			}
			
			this.parentezco=new Parentezco();
			
			this.inicializarParentezco();
			
			this.actualizarEstadoCeldasBotonesParentezco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParentezco() throws Exception {
		try {
			ParentezcoConstantesFunciones.inicializarParentezco(this.parentezco);
			
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
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parentezcoLogic.getParentezcos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParentezcos(String sAccionBusqueda,List<Parentezco> parentezcosParaReportes) throws Exception {
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
					sPathReporteFinal="Parentezco"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParentezcoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParentezcoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Parentezco"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parentezcos");		
		parameters.put("busquedapor", ParentezcoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Referencia.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ParentezcoLogic parentezcoLogicAuxiliar=new ParentezcoLogic();
					parentezcoLogicAuxiliar.setDatosCliente(parentezcoLogic.getDatosCliente());				
					parentezcoLogicAuxiliar.setParentezcos(parentezcosParaReportes);
					
					parentezcoLogicAuxiliar.cargarRelacionesLoteForeignKeyParentezcoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					parentezcosParaReportes=parentezcoLogicAuxiliar.getParentezcos();
					
					//parentezcoLogic.getNewConnexionToDeep();
					
					//for (Parentezco parentezco:parentezcosParaReportes) {
					//	parentezcoLogic.deepLoad(parentezco, false, DeepLoadType.INCLUDE, classes);
					//}						
					//parentezcoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//parentezcoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileReferencia = AuxiliarReportes.class.getResourceAsStream("ReferenciaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_referencia", reportFileReferencia);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParentezco=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParentezcoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParentezcoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParentezco=new JRBeanArrayDataSource(ParentezcoJInternalFrame.TraerParentezcoBeans(parentezcosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParentezco);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParentezcoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParentezcoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParentezcoBean.TraerParentezcoBeans(parentezcosParaReportes).toArray()));
							
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
				this.generarExcelReporteParentezcos(sAccionBusqueda,sTipoArchivoReporte,parentezcosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParentezcos(sAccionBusqueda,sTipoArchivoReporte,parentezcosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParentezcoActionPerformed(null);
					//this.generarExcelReporteParentezcos(sAccionBusqueda,sTipoArchivoReporte,parentezcosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParentezcos(sAccionBusqueda,sTipoArchivoReporte,parentezcosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParentezcos(sAccionBusqueda,sTipoArchivoReporte,parentezcosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParentezcos(sAccionBusqueda,sTipoArchivoReporte,parentezcosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParentezcos(String sAccionBusqueda,String sTipoArchivoReporte,List<Parentezco> parentezcosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parentezco";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Parentezcos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParentezco("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Parentezco parentezco : parentezcosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParentezcoConstantesFunciones.generarExcelReporteDataParentezco("NORMAL",row,workbook,parentezco,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parentezcoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parentezco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParentezco(String sTipo,Row row,Workbook workbook) {
		
		ParentezcoConstantesFunciones.generarExcelReporteHeaderParentezco(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParentezcos(String sAccionBusqueda,String sTipoArchivoReporte,List<Parentezco> parentezcosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parentezco_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Parentezcos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Parentezco parentezco : parentezcosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParentezcoConstantesFunciones.getParentezcoDescripcion(parentezco));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParentezcoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParentezcoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parentezco.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParentezcoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParentezcoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parentezco.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parentezcoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parentezco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParentezcos(String sAccionBusqueda,String sTipoArchivoReporte,List<Parentezco> parentezcosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Parentezco> parentezcosRespaldo=null;
		
		classes=ParentezcoConstantesFunciones.getClassesRelationshipsOfParentezco(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parentezcoLogic.setDatosCliente(this.datosCliente);
		this.parentezcoLogic.setDatosDeep(this.datosDeep);
		this.parentezcoLogic.setIsConDeep(true);
		
		parentezcosRespaldo=this.parentezcoLogic.getParentezcos();
		
		this.parentezcoLogic.setParentezcos(parentezcosParaReportes);	
		this.parentezcoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parentezcosParaReportes=this.parentezcoLogic.getParentezcos();
		this.parentezcoLogic.setParentezcos(parentezcosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parentezco_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Parentezcos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParentezco("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Parentezco parentezco : parentezcosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParentezco("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParentezcoConstantesFunciones.generarExcelReporteDataParentezco("NORMAL",row,workbook,parentezco,cellStyleDataAux);
		
			
			


				//Referencia
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ReferenciaConstantesFunciones.SCLASSWEBTITULO))) {

				if(parentezco.getReferencias()!=null && parentezco.getReferencias().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ReferenciaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ReferenciaConstantesFunciones.generarExcelReporteHeaderReferencia("RELACIONADO",row,workbook);
				}

				if(parentezco.getReferencias()!=null) {
					i2=0;
					for(Referencia referencia : parentezco.getReferencias()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ReferenciaConstantesFunciones.generarExcelReporteDataReferencia("RELACIONADO",row,workbook,referencia,cellStyleDataAuxHijo);
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
		cell.setCellValue(ParentezcoConstantesFunciones.getParentezcoDescripcion(parentezco));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parentezcoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parentezco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParentezco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParentezco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParentezco.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParentezco.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParentezco() throws Exception {		
		this.startProcessParentezco(true);
	}
	
	public void startProcessParentezco(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesParentezco, this.jScrollPanelDatosParentezco,this.jPanelPaginacionParentezco, this.jScrollPanelDatosEdicionParentezco, this.jPanelAccionesParentezco,this.jPanelAccionesFormularioParentezco,this.jmenuBarParentezco,this.jmenuBarDetalleParentezco,this.jTtoolBarParentezco,this.jTtoolBarDetalleParentezco);		
		
		final JTabbedPane jTabbedPaneBusquedasParentezco=null; 
		
		final JPanel jPanelParametrosReportesParentezco=this.jPanelParametrosReportesParentezco;
		//final JScrollPane jScrollPanelDatosParentezco=this.jScrollPanelDatosParentezco;
		final JTable jTableDatosParentezco=this.jTableDatosParentezco;		
		final JPanel jPanelPaginacionParentezco=this.jPanelPaginacionParentezco;
		//final JScrollPane jScrollPanelDatosEdicionParentezco=this.jScrollPanelDatosEdicionParentezco;
		final JPanel jPanelAccionesParentezco=this.jPanelAccionesParentezco;
		
		JPanel jPanelCamposAuxiliarParentezco=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParentezco=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParentezco!=null) {
			jPanelCamposAuxiliarParentezco=this.jInternalFrameDetalleFormParentezco.jPanelCamposParentezco;
			jPanelAccionesFormularioAuxiliarParentezco=this.jInternalFrameDetalleFormParentezco.jPanelAccionesFormularioParentezco;
		}
		
		final JPanel jPanelCamposParentezco=jPanelCamposAuxiliarParentezco;
		final JPanel jPanelAccionesFormularioParentezco=jPanelAccionesFormularioAuxiliarParentezco;
		
		
		final JMenuBar jmenuBarParentezco=this.jmenuBarParentezco;
		final JToolBar jTtoolBarParentezco=this.jTtoolBarParentezco;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParentezco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParentezco=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParentezco!=null) {
			jmenuBarDetalleAuxiliarParentezco=this.jInternalFrameDetalleFormParentezco.jmenuBarDetalleParentezco;
			jTtoolBarDetalleAuxiliarParentezco=this.jInternalFrameDetalleFormParentezco.jTtoolBarDetalleParentezco;
		}
		
		final JMenuBar jmenuBarDetalleParentezco=jmenuBarDetalleAuxiliarParentezco;
		final JToolBar jTtoolBarDetalleParentezco=jTtoolBarDetalleAuxiliarParentezco;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParentezco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParentezco;
			processRunnable.jTableDatos=jTableDatosParentezco;
			processRunnable.jPanelCampos=jPanelCamposParentezco;
			processRunnable.jPanelPaginacion=jPanelPaginacionParentezco;
			processRunnable.jPanelAcciones=jPanelAccionesParentezco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParentezco;
			
			
			processRunnable.jmenuBar=jmenuBarParentezco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParentezco;
			processRunnable.jTtoolBar=jTtoolBarParentezco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParentezco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParentezco ,jPanelParametrosReportesParentezco,jTableDatosParentezco, /*jScrollPanelDatosParentezco,*/jPanelCamposParentezco,jPanelPaginacionParentezco, /*jScrollPanelDatosEdicionParentezco,*/ jPanelAccionesParentezco,jPanelAccionesFormularioParentezco,jmenuBarParentezco,jmenuBarDetalleParentezco,jTtoolBarParentezco,jTtoolBarDetalleParentezco);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesParentezco, jScrollPanelDatosParentezco,jPanelPaginacionParentezco, jScrollPanelDatosEdicionParentezco, jPanelAccionesParentezco,jPanelAccionesFormularioParentezco,jmenuBarParentezco,jmenuBarDetalleParentezco,jTtoolBarParentezco,jTtoolBarDetalleParentezco);
						
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
	
	public void finishProcessParentezco() {// throws Exception 
		this.finishProcessParentezco(true);
	}
	
	public void finishProcessParentezco(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesParentezco, this.jScrollPanelDatosParentezco,this.jPanelPaginacionParentezco, this.jScrollPanelDatosEdicionParentezco, this.jPanelAccionesParentezco,this.jPanelAccionesFormularioParentezco,this.jmenuBarParentezco,this.jmenuBarDetalleParentezco,this.jTtoolBarParentezco,this.jTtoolBarDetalleParentezco);		
		
		final JTabbedPane jTabbedPaneBusquedasParentezco=null; 
		
		final JPanel jPanelParametrosReportesParentezco=this.jPanelParametrosReportesParentezco;
		//final JScrollPane jScrollPanelDatosParentezco=this.jScrollPanelDatosParentezco;
		final JTable jTableDatosParentezco=this.jTableDatosParentezco;		
		final JPanel jPanelPaginacionParentezco=this.jPanelPaginacionParentezco;
		//final JScrollPane jScrollPanelDatosEdicionParentezco=this.jScrollPanelDatosEdicionParentezco;
		final JPanel jPanelAccionesParentezco=this.jPanelAccionesParentezco;
		
		JPanel jPanelCamposAuxiliarParentezco=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParentezco=new JPanel();
		
		if(this.jInternalFrameDetalleFormParentezco!=null) {
			jPanelCamposAuxiliarParentezco=this.jInternalFrameDetalleFormParentezco.jPanelCamposParentezco;
			jPanelAccionesFormularioAuxiliarParentezco=this.jInternalFrameDetalleFormParentezco.jPanelAccionesFormularioParentezco;
		}
		
		final JPanel jPanelCamposParentezco=jPanelCamposAuxiliarParentezco;
		final JPanel jPanelAccionesFormularioParentezco=jPanelAccionesFormularioAuxiliarParentezco;
		
		
		final JMenuBar jmenuBarParentezco=this.jmenuBarParentezco;		
		final JToolBar jTtoolBarParentezco=this.jTtoolBarParentezco;
				
		JMenuBar jmenuBarDetalleAuxiliarParentezco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParentezco=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParentezco!=null) {
			jmenuBarDetalleAuxiliarParentezco=this.jInternalFrameDetalleFormParentezco.jmenuBarDetalleParentezco;
			jTtoolBarDetalleAuxiliarParentezco=this.jInternalFrameDetalleFormParentezco.jTtoolBarDetalleParentezco;		
		}
		
		final JMenuBar jmenuBarDetalleParentezco=jmenuBarDetalleAuxiliarParentezco;
		final JToolBar jTtoolBarDetalleParentezco=jTtoolBarDetalleAuxiliarParentezco;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParentezco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParentezco;
			processRunnable.jTableDatos=jTableDatosParentezco;
			processRunnable.jPanelCampos=jPanelCamposParentezco;
			processRunnable.jPanelPaginacion=jPanelPaginacionParentezco;
			processRunnable.jPanelAcciones=jPanelAccionesParentezco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParentezco;
			
			
			processRunnable.jmenuBar=jmenuBarParentezco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParentezco;
			processRunnable.jTtoolBar=jTtoolBarParentezco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParentezco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParentezco ,jPanelParametrosReportesParentezco, jTableDatosParentezco,/*jScrollPanelDatosParentezco,*/jPanelCamposParentezco,jPanelPaginacionParentezco, /*jScrollPanelDatosEdicionParentezco,*/ jPanelAccionesParentezco,jPanelAccionesFormularioParentezco,jmenuBarParentezco,jmenuBarDetalleParentezco,jTtoolBarParentezco,jTtoolBarDetalleParentezco));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParentezco(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParentezco(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParentezco(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParentezco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParentezco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParentezco,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParentezco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParentezco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParentezco,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parentezcoConstantesFunciones.getsFinalQueryParentezco();
		String  finalQueryPaginacionTodos=this.parentezcoConstantesFunciones.getsFinalQueryParentezco();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParentezcoConstantesFunciones.getArrayColumnasGlobalesNoParentezco(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParentezcoConstantesFunciones.getArrayColumnasGlobalesParentezco(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParentezcoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parentezcosEliminados= new ArrayList<Parentezco>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParentezco();
		
				///*ParentezcoSessionBean*/this.parentezcoSessionBean=new ParentezcoSessionBean();
			
			if(this.parentezcoSessionBean==null) {
				this.parentezcoSessionBean=new ParentezcoSessionBean();
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
					this.iNumeroPaginacion=ParentezcoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParentezcoConstantesFunciones.getClassesForeignKeysOfParentezco(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parentezco."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parentezcosAux= new ArrayList<Parentezco>();
			
				
			parentezcoLogic.setDatosCliente(this.datosCliente);
			parentezcoLogic.setDatosDeep(this.datosDeep);
			parentezcoLogic.setIsConDeep(true);
			
			
			parentezcoLogic.getParentezcoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parentezcoLogic.getTodosParentezcos(finalQueryGlobal,pagination);
					
					//parentezcoLogic.getTodosParentezcosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parentezcoLogic.getParentezcos()==null|| parentezcoLogic.getParentezcos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parentezcosAux= new ArrayList<Parentezco>();
							parentezcosAux.addAll(parentezcoLogic.getParentezcos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parentezcosAux= new ArrayList<Parentezco>();
							parentezcosAux.addAll(parentezcos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parentezcoLogic.getTodosParentezcos(finalQueryGlobal+"",this.pagination);												
							
							//parentezcoLogic.getTodosParentezcosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParentezcos("Todos",parentezcoLogic.getParentezcos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parentezcoLogic.setParentezcos(new ArrayList<Parentezco>());					
							parentezcoLogic.getParentezcos().addAll(parentezcosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parentezcos=new ArrayList<Parentezco>();
							parentezcos.addAll(parentezcosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParentezco=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParentezco=this.idActual;
				
				} else if(this.idParentezcoActual!=null && this.idParentezcoActual!=0L) {
					idParentezco=idParentezcoActual;
				}
				
					
				this.sDetalleReporte=ParentezcoConstantesFunciones.getDetalleIndicePorId(idParentezco);
				
				this.parentezcos=new ArrayList<Parentezco>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parentezcoLogic.getEntity(idParentezco);
					
					//parentezcoLogic.getEntityWithConnection(idParentezco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parentezcoLogic.setParentezcos(new ArrayList<Parentezco>());
					parentezcoLogic.getParentezcos().add(parentezcoLogic.getParentezco());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parentezcos=new ArrayList<Parentezco>();
					this.parentezcos.add(parentezco);
				}
				
				if(parentezcoLogic.getParentezco()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParentezco();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParentezco();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parentezcoLogic.getParentezcos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parentezcos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parentezcoLogic.getParentezcos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parentezcos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Parentezco parentezco) {
		Boolean permite=true;
		
		if(this.parentezco.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParentezcoConstantesFunciones.getOrderByListaParentezco();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParentezcoConstantesFunciones.getOrderByListaParentezco();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Parentezco parentezco:parentezcoLogic.getParentezcos()) {
				if(parentezco.getsType().equals(Constantes2.S_TOTALES)) {
					parentezcoTotales=parentezco;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Parentezco parentezco:this.parentezcos) {
				if(parentezco.getsType().equals(Constantes2.S_TOTALES)) {
					parentezcoTotales=parentezco;
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
			this.parentezcoAux=new Parentezco();
			this.parentezcoAux.setsType(Constantes2.S_TOTALES);
			this.parentezcoAux.setIsNew(false);
			this.parentezcoAux.setIsChanged(false);
			this.parentezcoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParentezcoConstantesFunciones.TotalizarValoresFilaParentezco(this.parentezcoLogic.getParentezcos(),this.parentezcoAux);
				
				this.parentezcoLogic.getParentezcos().add(this.parentezcoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParentezcoConstantesFunciones.TotalizarValoresFilaParentezco(this.parentezcos,this.parentezcoAux);
				
				this.parentezcos.add(this.parentezcoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parentezcoTotales=new Parentezco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parentezcoLogic.getParentezcos().remove(parentezcoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parentezcos.remove(parentezcoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parentezcoTotales=new Parentezco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Parentezco parentezco:parentezcoLogic.getParentezcos()) {
				if(parentezco.getsType().equals(Constantes2.S_TOTALES)) {
					parentezcoTotales=parentezco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParentezcoConstantesFunciones.TotalizarValoresFilaParentezco(this.parentezcoLogic.getParentezcos(),parentezcoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Parentezco parentezco:this.parentezcos) {
				if(parentezco.getsType().equals(Constantes2.S_TOTALES)) {
					parentezcoTotales=parentezco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParentezcoConstantesFunciones.TotalizarValoresFilaParentezco(this.parentezcos,parentezcoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosParentezco() {
		this.isPermisoTodoParentezco=false;
		this.isPermisoNuevoParentezco=false;
		this.isPermisoActualizarParentezco=false;
		this.isPermisoActualizarOriginalParentezco=false;
		this.isPermisoEliminarParentezco=false;
		this.isPermisoGuardarCambiosParentezco=false;
		this.isPermisoConsultaParentezco=false;
		this.isPermisoBusquedaParentezco=false;
		this.isPermisoReporteParentezco=false;		
		this.isPermisoOrdenParentezco=false;		
		this.isPermisoPaginacionMedioParentezco=false;		
		this.isPermisoPaginacionAltoParentezco=false;
		this.isPermisoPaginacionTodoParentezco=false;
		this.isPermisoCopiarParentezco=false;		
		this.isPermisoVerFormParentezco=false;		
		this.isPermisoDuplicarParentezco=false;		
		this.isPermisoOrdenParentezco=false;		
	}
	
	public void setPermisosUsuarioParentezco(Boolean isPermiso) {
		this.isPermisoTodoParentezco=isPermiso;
		this.isPermisoNuevoParentezco=isPermiso;
		this.isPermisoActualizarParentezco=isPermiso;
		this.isPermisoActualizarOriginalParentezco=isPermiso;
		this.isPermisoEliminarParentezco=isPermiso;
		this.isPermisoGuardarCambiosParentezco=isPermiso;
		this.isPermisoConsultaParentezco=isPermiso;
		this.isPermisoBusquedaParentezco=isPermiso;
		this.isPermisoReporteParentezco=isPermiso;
		this.isPermisoOrdenParentezco=isPermiso;		
		this.isPermisoPaginacionMedioParentezco=isPermiso;		
		this.isPermisoPaginacionAltoParentezco=isPermiso;		
		this.isPermisoPaginacionTodoParentezco=isPermiso;		
		this.isPermisoCopiarParentezco=isPermiso;		
		this.isPermisoVerFormParentezco=isPermiso;		
		this.isPermisoDuplicarParentezco=isPermiso;
		this.isPermisoOrdenParentezco=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParentezco(Boolean isPermiso) {
		//this.isPermisoTodoParentezco=isPermiso;
		this.isPermisoNuevoParentezco=isPermiso;
		this.isPermisoActualizarParentezco=isPermiso;
		this.isPermisoActualizarOriginalParentezco=isPermiso;
		this.isPermisoEliminarParentezco=isPermiso;
		this.isPermisoGuardarCambiosParentezco=isPermiso;
		//this.isPermisoConsultaParentezco=isPermiso;
		//this.isPermisoBusquedaParentezco=isPermiso;
		//this.isPermisoReporteParentezco=isPermiso;
		//this.isPermisoOrdenParentezco=isPermiso;		
		//this.isPermisoPaginacionMedioParentezco=isPermiso;		
		//this.isPermisoPaginacionAltoParentezco=isPermiso;		
		//this.isPermisoPaginacionTodoParentezco=isPermiso;		
		//this.isPermisoCopiarParentezco=isPermiso;		
		//this.isPermisoDuplicarParentezco=isPermiso;
		//this.isPermisoOrdenParentezco=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParentezcoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ReferenciaConstantesFunciones.SNOMBREOPCION);
		
		if(ParentezcoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosReferencia=false;
		this.isTienePermisosReferencia=this.verificarGetPermisosUsuarioOpcionParentezcoClaseRelacionada(this.opcionsRelacionadas,ReferenciaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebParentezco(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParentezcoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosReferencia=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioParentezcoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParentezcoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParentezcoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosReferencia && this.jInternalFrameDetalleFormParentezco!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormParentezco.jTabbedPaneRelacionesParentezco.remove(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioParentezco() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParentezcoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parentezcoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParentezcoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParentezco=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParentezco=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParentezco=this.isPermisoActualizarParentezco;
			this.isPermisoEliminarParentezco=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParentezco=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParentezco=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParentezco=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParentezco=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParentezco=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParentezco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParentezco=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParentezco=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParentezco=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParentezco=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParentezco=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParentezco=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParentezco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parentezcoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParentezco.setToolTipText(this.jTableDatosParentezco.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParentezco(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParentezco(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParentezcoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParentezcoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParentezco() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosReferencia && this.parentezcoConstantesFunciones.mostrarReferenciaParentezco && !ParentezcoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Referencia");
			reporte.setsDescripcion("Referencia");
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
	
		
	public void inicializarCombosForeignKeyParentezcoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParentezcoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParentezcoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParentezcoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyParentezcoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParentezco()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyParentezco()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParentezco(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParentezco()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParentezco();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParentezco(Parentezco parentezco)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParentezco(Parentezco parentezco,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParentezco()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParentezco()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParentezco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParentezco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParentezco()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParentezco()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParentezco(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParentezco()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public ParentezcoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParentezcoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParentezcoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parentezcoSessionBean=new ParentezcoSessionBean(); 
		this.parentezcoConstantesFunciones=new ParentezcoConstantesFunciones(); 
		this.parentezcoBean=new Parentezco();//(this.parentezcoConstantesFunciones); 		
		this.parentezcoReturnGeneral=new ParentezcoParameterReturnGeneral(); 
		
		this.parentezcoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parentezcoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParentezcoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParentezcoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParentezcoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParentezco(true);
			
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
			
			this.parentezcoConstantesFunciones=new ParentezcoConstantesFunciones(); 
			this.parentezcoBean=new Parentezco();//this.parentezcoConstantesFunciones); 			
			this.parentezcoReturnGeneral=new ParentezcoParameterReturnGeneral(); 
		
			ParentezcoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parentezco Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.parentezco=new Parentezco();
			this.parentezcos = new ArrayList<Parentezco>();
			this.parentezcosAux = new ArrayList<Parentezco>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic=new ParentezcoLogic();
				this.parentezcoLogic.getNewConnexionToDeep("");
			}
			
			//this.parentezcoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parentezcoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParentezco);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParentezco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParentezco);	
					}
					
					if(this.jInternalFrameImportacionParentezco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParentezco);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParentezco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParentezco);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParentezco!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParentezco);
				this.jInternalFrameDetalleFormParentezco.setVisible(false);
				this.jInternalFrameDetalleFormParentezco.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParentezco!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParentezco);
					this.jInternalFrameReporteDinamicoParentezco.setVisible(false);
					this.jInternalFrameReporteDinamicoParentezco.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParentezco!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParentezco);
					this.jInternalFrameImportacionParentezco.setVisible(false);
					this.jInternalFrameImportacionParentezco.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParentezco!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParentezco);
					this.jInternalFrameOrderByParentezco.setVisible(false);
					this.jInternalFrameOrderByParentezco.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParentezcoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParentezcoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parentezcoReturnGeneral=new ParentezcoParameterReturnGeneral();
			
			this.parentezcoParameterGeneral=new ParentezcoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parentezcoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParentezcoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parentezcoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ReferenciaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParentezcoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parentezcoSessionBean.getEsGuardarRelacionado(),this.parentezcoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParentezcoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parentezcoSessionBean.getEsGuardarRelacionado(),this.parentezcoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParentezco=false;
			this.isVisibilidadCeldaDuplicarParentezco=true;
			this.isVisibilidadCeldaCopiarParentezco=true;
			this.isVisibilidadCeldaVerFormParentezco=true;
			this.isVisibilidadCeldaOrdenParentezco=true;
			this.isVisibilidadCeldaNuevoRelacionesParentezco=false;
			this.isVisibilidadCeldaModificarParentezco=false;
			this.isVisibilidadCeldaActualizarParentezco=false;
			this.isVisibilidadCeldaEliminarParentezco=false;
			this.isVisibilidadCeldaCancelarParentezco=false;
			this.isVisibilidadCeldaGuardarParentezco=false;
			this.isVisibilidadCeldaGuardarCambiosParentezco=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParentezco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParentezco();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParentezco(false);
			
			this.setPermisosUsuarioParentezco();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parentezcoSessionBean.getEsGuardarRelacionado() 
				|| (this.parentezcoSessionBean.getEsGuardarRelacionado() && this.parentezcoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParentezcoClasesRelacionadas();
			}
			
			if(this.parentezcoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParentezcoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParentezcoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParentezco();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParentezco();
			}
			
			if(!this.isPermisoBusquedaParentezco) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParentezco,this.isPermisoPaginacionMedioParentezco,this.isPermisoPaginacionTodoParentezco);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParentezcoConstantesFunciones.getTiposSeleccionarParentezco());
				
				this.tiposColumnasSelect=ParentezcoConstantesFunciones.getTiposSeleccionarParentezco(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectParentezco();				
				//this.tiposRelacionesSelect=ParentezcoConstantesFunciones.getTiposRelacionesParentezco(true);
				
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
			//if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParentezco();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioParentezco(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioParentezco(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParentezco() ;
			
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
			
			
			this.referenciaLogic=new ReferenciaLogic(); 
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
				parentezcoImplementable= (ParentezcoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParentezcoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parentezcoImplementableHome= (ParentezcoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParentezcoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parentezcos= new ArrayList<Parentezco>();
			this.parentezcosEliminados= new ArrayList<Parentezco>();
						
			this.isEsNuevoParentezco=false;
			this.esParaAccionDesdeFormularioParentezco=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParentezco(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParentezco();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParentezcoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParentezcoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParentezco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParentezco(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParentezco!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParentezco();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParentezco();
			}
			
			ParentezcoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParentezco(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Parentezco: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParentezco() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ReferenciaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ReferenciaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParentezco")) {
				iIndex=this.jInternalFrameDetalleFormParentezco.jTabbedPaneRelacionesParentezco.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParentezco.jTabbedPaneRelacionesParentezco.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParentezco.getSelectedRow();	
				
				

				if(sTitle.equals("Referencias")) {
					if(!ReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessParentezco();

						this.cargarParteTabPanelRelacionadaReferencia(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParentezco();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaReferencia(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormParentezco.cargarSessionConBeanSwingJInternalFrameReferencia(false,true,iIndex);
		this.jButtonReferenciaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaReferencia();

		//this.jTabbedPaneRelacionesParentezco.updateUI();
		//this.jTabbedPaneRelacionesParentezco.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesParentezco.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Referencia")) {
				int row=this.jTableDatosParentezco.getSelectedRow();
				jButtonReferenciaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Referencia")) {

					if(this.isTienePermisosReferencia && this.parentezcoConstantesFunciones.mostrarReferenciaParentezco && !ParentezcoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Referencias"+"("+ReferenciaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Referencias");

						if(parentezcoConstantesFunciones.resaltarReferenciaParentezco!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(parentezcoConstantesFunciones.resaltarReferenciaParentezco);
						}

						jmenuItem.setEnabled(this.parentezcoConstantesFunciones.activarReferenciaParentezco);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Referencia"));

						

						this.jInternalFrameDetalleFormParentezco.jmenuDetalleParentezco.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyParentezco(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParentezco(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParentezco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParentezcoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParentezco();
		
		this.cargarCombosFrameForeignKeyParentezco();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParentezco();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParentezco();
		}
	}
	
	
	
	public void jButtonNuevoParentezcoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parentezcoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParentezco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
			
			
			if(jTableDatosParentezco.getRowCount()>=1) {
				jTableDatosParentezco.removeRowSelectionInterval(0, jTableDatosParentezco.getRowCount()-1);						
			}
			
			this.isEsNuevoParentezco=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParentezco(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParentezco(true);			
			//this.parentezco=new Parentezco();
			//this.parentezco.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParentezco(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParentezco() ;
			
			if(ParentezcoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParentezco(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parentezco);	
			this.actualizarInformacion("INFO_PADRE",false,this.parentezco);				
			
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
			
			if(this.parentezcoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Parentezco: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParentezcoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Parentezco> parentezcosSeleccionados=new ArrayList<Parentezco>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParentezco.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParentezco.getSelectedRows().length;			
			}
			
			parentezcosSeleccionados=this.getParentezcosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParentezco--;			
				//Parentezco parentezcoAux= new Parentezco();			
				//parentezcoAux.setId(this.iIdNuevoParentezco);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Parentezco parentezcoOrigen=new Parentezco();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Parentezco parentezcoOrigen : parentezcosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParentezco.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parentezcoOrigen =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parentezcoOrigen =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParentezco();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parentezco.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParentezco(parentezcoOrigen,this.parentezco,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParentezco(this.parentezco);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parentezcoLogic.getParentezcos().add(this.parentezcoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parentezcos.add(this.parentezcoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParentezco(false);
				
				this.jTableDatosParentezco.setRowSelectionInterval(this.getIndiceNuevoParentezco(), this.getIndiceNuevoParentezco());
				
				int iLastRow =  this.jTableDatosParentezco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParentezco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParentezco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParentezco(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParentezcoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Parentezco> parentezcosSeleccionados=new ArrayList<Parentezco>();									
		
			Parentezco parentezcoOrigen=new Parentezco();
			Parentezco parentezcoDestino=new Parentezco();
				
			parentezcosSeleccionados=this.getParentezcosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParentezco.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parentezcosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParentezco.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parentezcoOrigen =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parentezcoOrigen =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parentezcoDestino =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parentezcoDestino =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parentezcoOrigen =parentezcosSeleccionados.get(0);
				parentezcoDestino =parentezcosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParentezco(parentezcoOrigen,parentezcoDestino,true,false);
				
				parentezcoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parentezcoDestino,parentezcoLogic.getParentezcos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parentezcoDestino,parentezcos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParentezco(false);
				
				//this.jTableDatosParentezco.setRowSelectionInterval(this.getIndiceNuevoParentezco(), this.getIndiceNuevoParentezco());
				
				int iLastRow =  this.jTableDatosParentezco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParentezco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParentezco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParentezco(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParentezcoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParentezco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParentezco.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParentezcoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParentezco.isVisible();
			
			
			this.jPanelParametrosReportesParentezco.setVisible(!isVisible);
			this.jPanelPaginacionParentezco.setVisible(!isVisible);
			this.jPanelAccionesParentezco.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParentezcoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParentezco();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParentezcoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParentezco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParentezcoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParentezco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParentezcoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParentezco();
			
			this.abrirFrameOrderByParentezco();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParentezcoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParentezco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParentezco(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParentezco);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParentezco.isMaximum()) {
					this.jInternalFrameDetalleFormParentezco.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParentezco.setSize(this.jInternalFrameDetalleFormParentezco.iWidthFormulario,this.jInternalFrameDetalleFormParentezco.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParentezco.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParentezco.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParentezco.isMaximum()) {
						this.jInternalFrameDetalleFormParentezco.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParentezco.jContentPaneDetalleParentezco.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParentezco.jTabbedPaneRelacionesParentezco.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParentezco.jContentPaneDetalleParentezco.getWidth(),ParentezcoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParentezco.jTabbedPaneRelacionesParentezco.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParentezco.jContentPaneDetalleParentezco.getWidth(),ParentezcoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParentezco.jTabbedPaneRelacionesParentezco.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParentezco.jContentPaneDetalleParentezco.getWidth(),ParentezcoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaReferencia();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParentezco.setVisible(true);
	        this.jInternalFrameDetalleFormParentezco.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParentezco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParentezco==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParentezco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParentezco,false,this);
				} else {
					this.jInternalFrameOrderByParentezco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParentezco,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParentezco);
				this.jInternalFrameOrderByParentezco.setVisible(false);
				this.jInternalFrameOrderByParentezco.setSelected(false);
				
				this.jInternalFrameOrderByParentezco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParentezco"));
				
				this.inicializarActualizarBindingTablaOrderByParentezco();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParentezco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParentezco==null) {
				
				this.jInternalFrameImportacionParentezco=new ImportacionJInternalFrame(ParentezcoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParentezco);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParentezco);
				this.jInternalFrameImportacionParentezco.setVisible(false);
				this.jInternalFrameImportacionParentezco.setSelected(false);


				this.jInternalFrameImportacionParentezco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParentezco"));
				this.jInternalFrameImportacionParentezco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParentezco"));
				this.jInternalFrameImportacionParentezco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParentezco"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParentezco() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParentezco==null) {
				this.jInternalFrameReporteDinamicoParentezco=new ReporteDinamicoJInternalFrame(ParentezcoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParentezco);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParentezco);
				this.jInternalFrameReporteDinamicoParentezco.setVisible(false);
				this.jInternalFrameReporteDinamicoParentezco.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParentezco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParentezco"));
				this.jInternalFrameReporteDinamicoParentezco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParentezco"));
				this.jInternalFrameReporteDinamicoParentezco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParentezco"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParentezco();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaReferencia() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jScrollPanelDatosReferencia.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormParentezco.jContentPaneDetalleParentezco.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jScrollPanelDatosReferencia.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jScrollPanelDatosReferencia.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.jScrollPanelDatosReferencia.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleParentezco() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParentezco);
			
	       	this.jInternalFrameDetalleFormParentezco.setVisible(false);
	        this.jInternalFrameDetalleFormParentezco.setSelected(false);
			
			//this.jInternalFrameDetalleFormParentezco.dispose();
			//this.jInternalFrameDetalleFormParentezco=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParentezco() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParentezco.setVisible(true);
	        this.jInternalFrameReporteDinamicoParentezco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParentezco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParentezco.setVisible(true);
	        this.jInternalFrameImportacionParentezco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParentezco() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParentezco.setVisible(true);
	        this.jInternalFrameOrderByParentezco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParentezco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParentezco.setVisible(false);
	        this.jInternalFrameOrderByParentezco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParentezco() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParentezco.setVisible(false);
	        this.jInternalFrameReporteDinamicoParentezco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParentezco() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParentezco.setVisible(false);
	        this.jInternalFrameImportacionParentezco.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarParentezcoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParentezco(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParentezco(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParentezco.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParentezco(true);
			//this.isEsNuevoParentezco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezco =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parentezco =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParentezco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParentezco(false) ;
			
			if(parentezcoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaSessionBean.getEsGuardarRelacionado() && ReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonReferenciaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ParentezcoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParentezco(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParentezco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParentezcoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParentezco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezco =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parentezco =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParentezco(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParentezco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParentezco.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParentezco(true);
			//this.isEsNuevoParentezco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezco =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parentezco =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parentezco.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParentezco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParentezco(false) ;
			
			if(ParentezcoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParentezco(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParentezco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarParentezcoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParentezco(false);
			
			//if(!this.isEsNuevoParentezco) {								
				int intSelectedRow = this.jTableDatosParentezco.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezco =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parentezco =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParentezcoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParentezco(this.parentezco,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParentezco(this.parentezco);
				
			}
			
			if(this.permiteMantenimiento(this.parentezco)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parentezcoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParentezco=true;
					this.inicializarActualizarBindingTablaParentezco(false);
					this.isEsNuevoParentezco=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParentezco=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParentezco=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParentezco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParentezco(false);
				
				this.habilitarDeshabilitarControlesParentezco(false);
			
												
				
				if(ParentezcoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParentezco();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParentezcoActionPerformed(evt,parentezcoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParentezco(this.parentezco,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParentezco.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parentezcoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parentezco.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Parentezco.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parentezco.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParentezcoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParentezco.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezco =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				this.parentezco.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parentezco =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				this.parentezco.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parentezco)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parentezcoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParentezcoModel) this.jTableDatosParentezco.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParentezco=true;
				this.inicializarActualizarBindingTablaParentezco(false);
				this.isEsNuevoParentezco=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParentezco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParentezco(false);
				
				this.habilitarDeshabilitarControlesParentezco(false);
				
				
				
				if(ParentezcoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParentezco();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParentezcoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParentezco.getRowCount()>=1) {
				jTableDatosParentezco.removeRowSelectionInterval(0, jTableDatosParentezco.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParentezco(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParentezco(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParentezco(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParentezco(false) ;
			
			this.isEsNuevoParentezco=false;
			
			if(ParentezcoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParentezco();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParentezcoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParentezco(false);
				
				//SI ES MANUAL
				if(ParentezcoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParentezco();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParentezcoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParentezco--;			
			//Parentezco parentezcoAux= new Parentezco();			
			//parentezcoAux.setId(this.iIdNuevoParentezco);
			
			if(this.jInternalFrameDetalleFormParentezco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParentezco();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParentezco(this.parentezco);
			
			this.parentezco.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parentezcoLogic.getParentezcos().add(this.parentezcoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parentezcos.add(this.parentezcoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParentezco(false);
			
			this.jTableDatosParentezco.setRowSelectionInterval(this.getIndiceNuevoParentezco(), this.getIndiceNuevoParentezco());
			
			int iLastRow =  this.jTableDatosParentezco.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParentezco.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParentezco.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParentezco(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParentezcoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParentezco(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParentezco(false);
			
			//SI ES MANUAL
			if(ParentezcoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParentezco();
			}
			
			//this.abrirFrameTreeParentezco();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParentezcoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ParentezcoS ?", "MANTENIMIENTO DE Parentezco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParentezco.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParentezco();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parentezcoReturnGeneral=parentezcoLogic.procesarImportacionParentezcosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parentezcoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParentezcoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParentezcoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParentezco.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParentezco.setFileImportacion(this.jInternalFrameImportacionParentezco.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParentezco.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParentezco.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParentezco.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParentezco.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParentezcoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Parentezco> parentezcosSeleccionados=new ArrayList<Parentezco>();		

		parentezcosSeleccionados=this.getParentezcosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParentezco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParentezco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParentezcoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParentezcoBaseDesign.jrxml";
			
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
			
			this.generarReporteParentezcos("Todos",parentezcosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parentezcoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parentezco",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParentezco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParentezco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParentezcoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParentezcoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoParentezco.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParentezco.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParentezco.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParentezcoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ParentezcoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParentezco.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParentezcoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ParentezcoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParentezco.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParentezco.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParentezcoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ParentezcoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoParentezcoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Parentezco> parentezcosSeleccionados=new ArrayList<Parentezco>();		
		
		parentezcosSeleccionados=this.getParentezcosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parentezco";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Parentezcos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParentezco.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParentezco.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParentezcoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParentezcoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Parentezco parentezco:parentezcosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parentezco.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParentezcoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParentezcoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Parentezco parentezco:parentezcosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parentezco.getnombre());
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
			//	this.getFilaCabeceraExportarExcelParentezco(row);				
			//	iRow++;
			//}				
			
			//for(Parentezco parentezcoAux:parentezcosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParentezco(parentezcoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parentezcoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parentezco",JOptionPane.INFORMATION_MESSAGE);
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
				this.parentezcoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParentezco(false);
			
			//SI ES MANUAL
			if(ParentezcoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParentezco();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParentezcoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParentezco(false);
			
			//SI ES MANUAL
			if(ParentezcoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParentezco();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParentezcoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParentezco(false);
			
			//SI ES MANUAL
			if(ParentezcoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParentezco();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parentezcoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParentezco() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParentezco.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParentezco.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParentezco.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParentezco.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParentezco.setMinimumSize(dimensionMinimum);
		this.jTableDatosParentezco.setMaximumSize(dimensionMaximum);
		this.jTableDatosParentezco.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParentezco(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParentezco(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParentezco(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParentezco(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParentezco(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParentezco(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParentezco(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParentezco(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParentezcoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParentezcoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParentezco() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParentezco();
		
		this.inicializarActualizarBindingBotonesManualParentezco(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParentezco();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParentezco() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParentezco(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParentezco(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParentezco.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParentezco.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParentezco.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParentezco!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParentezco.jCheckBoxPostAccionNuevoParentezco.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParentezco.jCheckBoxPostAccionSinCerrarParentezco.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParentezco.jCheckBoxPostAccionSinMensajeParentezco.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParentezco.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParentezco.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParentezco.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParentezco!=null) {
				this.jInternalFrameDetalleFormParentezco.jCheckBoxPostAccionNuevoParentezco.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParentezco.jCheckBoxPostAccionSinCerrarParentezco.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParentezco.jCheckBoxPostAccionSinMensajeParentezco.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParentezco.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParentezco.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParentezco!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParentezco.jComboBoxTiposAccionesFormularioParentezco.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParentezco.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParentezco!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParentezco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParentezco.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParentezco.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParentezco.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParentezco.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParentezco!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParentezco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParentezco.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParentezco.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParentezco(Boolean esInicializar) throws Exception {
		try	{	
			if(ParentezcoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParentezco(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParentezco() throws Exception {
		try	{
			if(ParentezcoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParentezco();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParentezco() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParentezco.jComboBoxTiposAccionesFormularioParentezco.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParentezco.jComboBoxTiposAccionesFormularioParentezco.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParentezco() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParentezco.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParentezco.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParentezco.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParentezco.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParentezco.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParentezco.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParentezco.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParentezco.addItem(reporte);
			}
			
			
			if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParentezco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParentezco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParentezco.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParentezco.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParentezco.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParentezco.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParentezco.jComboBoxTiposAccionesFormularioParentezco.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParentezco.jComboBoxTiposAccionesFormularioParentezco.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParentezco.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParentezco.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParentezco.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParentezco();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParentezco() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParentezco!=null) {
				this.jInternalFrameReporteDinamicoParentezco.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParentezco.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParentezco!=null) {
				this.jInternalFrameReporteDinamicoParentezco.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParentezco.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParentezco!=null) {
				
				if(this.jInternalFrameReporteDinamicoParentezco.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParentezco.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParentezco.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParentezco.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParentezco.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParentezco.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParentezco()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParentezco(Boolean esInicializar) throws Exception {				
		if(ParentezcoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParentezco();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParentezco() throws Exception {
		this.inicializarActualizarBindingTablaParentezco(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParentezco() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParentezco.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParentezco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParentezco.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParentezcoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParentezco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParentezco.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParentezcoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParentezcoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParentezcoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParentezcoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParentezco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParentezco.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParentezcoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParentezco.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParentezco(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parentezcoLogic.getParentezcos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parentezcos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParentezcoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParentezco.setModel(new ParentezcoModel(this.parentezcoLogic.getParentezcos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParentezco.setModel(new ParentezcoModel(this.parentezcos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParentezco!=null && this.jInternalFrameOrderByParentezco.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParentezco();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParentezco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParentezco,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParentezcoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParentezcoConstantesFunciones.SCLASSWEBTITULO,parentezcoConstantesFunciones.resaltarSeleccionarParentezco,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParentezcoConstantesFunciones.SCLASSWEBTITULO,parentezcoConstantesFunciones.resaltarSeleccionarParentezco,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParentezco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParentezco,ParentezcoConstantesFunciones.LABEL_ID));

		if(this.parentezcoConstantesFunciones.mostraridParentezco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParentezcoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parentezcoConstantesFunciones.resaltaridParentezco,this.parentezcoConstantesFunciones.activaridParentezco,this,true,"idParentezco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parentezcoConstantesFunciones.resaltaridParentezco,this.parentezcoConstantesFunciones.activaridParentezco,this,true,"idParentezco","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParentezco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParentezco,ParentezcoConstantesFunciones.LABEL_CODIGO));

		if(this.parentezcoConstantesFunciones.mostrarcodigoParentezco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParentezcoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parentezcoConstantesFunciones.resaltarcodigoParentezco,this.parentezcoConstantesFunciones.activarcodigoParentezco,this,true,"codigoParentezco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parentezcoConstantesFunciones.resaltarcodigoParentezco,this.parentezcoConstantesFunciones.activarcodigoParentezco,this,true,"codigoParentezco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParentezcoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParentezco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParentezco,ParentezcoConstantesFunciones.LABEL_NOMBRE));

		if(this.parentezcoConstantesFunciones.mostrarnombreParentezco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParentezcoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parentezcoConstantesFunciones.resaltarnombreParentezco,this.parentezcoConstantesFunciones.activarnombreParentezco,this,true,"nombreParentezco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parentezcoConstantesFunciones.resaltarnombreParentezco,this.parentezcoConstantesFunciones.activarnombreParentezco,this,true,"nombreParentezco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParentezcoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parentezcoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosReferencia && this.parentezcoConstantesFunciones.mostrarReferenciaParentezco && !ParentezcoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Referencias");
				tableColumn.setHeaderValue("Referencias");
				tableColumn.setCellRenderer(new ReferenciaTableCell(parentezcoConstantesFunciones.resaltarReferenciaParentezco,this,this.parentezcoConstantesFunciones.activarReferenciaParentezco));
				tableColumn.setCellEditor(new ReferenciaTableCell(parentezcoConstantesFunciones.resaltarReferenciaParentezco,this,this.parentezcoConstantesFunciones.activarReferenciaParentezco));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosParentezco.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parentezcoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parentezcoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParentezco.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parentezcoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parentezcoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParentezco.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParentezco && this.isPermisoGuardarCambiosParentezco) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parentezcoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parentezcoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParentezco.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.parentezcoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosParentezco.addColumn(tableColumn);
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
			
			this.jTableDatosParentezco.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParentezco && this.isPermisoGuardarCambiosParentezco) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.parentezcoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParentezco && this.isPermisoGuardarCambiosParentezco) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParentezco.moveColumn(this.jTableDatosParentezco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParentezco.moveColumn(this.jTableDatosParentezco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.parentezcoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosParentezco.moveColumn(this.jTableDatosParentezco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParentezco.moveColumn(this.jTableDatosParentezco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParentezco.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParentezco.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParentezco,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParentezcoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParentezco.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParentezco.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParentezcoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParentezcoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParentezco.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParentezco.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParentezco.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parentezcoLogic.getParentezcos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parentezcos.size()-1;
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
		//this.jTableDatosParentezco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParentezco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParentezco();
			
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
				
				//this.isEsNuevoParentezco=false;
					
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
			
				if(this.parentezcoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParentezco==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParentezco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParentezco.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezco =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parentezco =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parentezco.getsType().equals("DUPLICADO")
				   || this.parentezco.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParentezco=true;
				
				} else {
					this.isEsNuevoParentezco=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
					if(this.parentezco.getId()>=0 && !this.parentezco.getIsNew()) {						
						this.isEsNuevoParentezco=false;
						
					} else {
						this.isEsNuevoParentezco=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParentezco(esRelaciones);						
				
				this.seleccionarParentezco(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parentezco.getId()<0) {
					this.isEsNuevoParentezco=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParentezco(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParentezco(evt,rowIndex);
				}	
				
				if(this.parentezcoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Parentezco: " + this.dDif); 
					}
				}								
				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParentezco(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parentezco)) {
					if(this.parentezco.getId()>0) {
						this.parentezco.setIsDeleted(true);
						
						this.parentezcosEliminados.add(this.parentezco);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parentezcoLogic.getParentezcos().remove(this.parentezco);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parentezcos.remove(this.parentezco);				
					}
					
					
					((ParentezcoModel) this.jTableDatosParentezco.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParentezco(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParentezco(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParentezco) {
			
			if(this.jInternalFrameDetalleFormParentezco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParentezco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParentezco.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezco =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parentezco =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParentezcoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParentezco(this.parentezco);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParentezco("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParentezco(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParentezco() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParentezco(Parentezco parentezco) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParentezco(parentezco,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParentezco(Parentezco parentezco,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParentezco(parentezco);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParentezco(parentezco,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParentezco(parentezco);
	}
	
	public void setVariablesObjetoActualToFormularioParentezco(Parentezco parentezco) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParentezco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParentezco.jLabelidParentezco.setText(parentezco.getId().toString());
			this.jInternalFrameDetalleFormParentezco.jTextFieldcodigoParentezco.setText(parentezco.getcodigo());
			this.jInternalFrameDetalleFormParentezco.jTextAreanombreParentezco.setText(parentezco.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Parentezco parentezcoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parentezcoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Parentezco parentezcoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parentezcoLocal=this.parentezco;
			} else {
				parentezcoLocal=this.parentezcoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parentezcoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParentezco(parentezcoLocal,true);
					
					if(parentezcoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parentezcoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parentezcoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parentezcoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParentezco(Parentezco parentezco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParentezco(parentezco,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParentezco(parentezco);
	}
	
	public void setVariablesFormularioToObjetoActualParentezco(Parentezco parentezco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParentezco(parentezco,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParentezco(Parentezco parentezco,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParentezco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParentezco.jLabelidParentezco.getText()==null || this.jInternalFrameDetalleFormParentezco.jLabelidParentezco.getText()=="" || this.jInternalFrameDetalleFormParentezco.jLabelidParentezco.getText()=="Id") {
				this.jInternalFrameDetalleFormParentezco.jLabelidParentezco.setText("0");
			}

			if(conColumnasBase) {parentezco.setId(Long.parseLong(this.jInternalFrameDetalleFormParentezco.jLabelidParentezco.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParentezcoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParentezco.jLabelIdParentezco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parentezco.setcodigo(this.jInternalFrameDetalleFormParentezco.jTextFieldcodigoParentezco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParentezcoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParentezco.jLabelcodigoParentezco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parentezco.setnombre(this.jInternalFrameDetalleFormParentezco.jTextAreanombreParentezco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParentezcoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParentezco.jLabelnombreParentezco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParentezco(Parentezco parentezcoBean,Parentezco parentezco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParentezco(Parentezco parentezcoOrigen,Parentezco parentezco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parentezcoOrigen.getId()!=null && !parentezcoOrigen.getId().equals(0L))) {parentezco.setId(parentezcoOrigen.getId());}}
			if(conDefault || (!conDefault && parentezcoOrigen.getcodigo()!=null && !parentezcoOrigen.getcodigo().equals(""))) {parentezco.setcodigo(parentezcoOrigen.getcodigo());}
			if(conDefault || (!conDefault && parentezcoOrigen.getnombre()!=null && !parentezcoOrigen.getnombre().equals(""))) {parentezco.setnombre(parentezcoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParentezco(Parentezco parentezco) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParentezco.jLabelidParentezco.setText(parentezco.getId().toString());
			this.jInternalFrameDetalleFormParentezco.jTextFieldcodigoParentezco.setText(parentezco.getcodigo());
			this.jInternalFrameDetalleFormParentezco.jTextAreanombreParentezco.setText(parentezco.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParentezco(ParentezcoBean parentezcoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParentezco.jLabelidParentezco.setText(parentezcoBean.getId().toString());
			this.jInternalFrameDetalleFormParentezco.jTextFieldcodigoParentezco.setText(parentezcoBean.getcodigo());
			this.jInternalFrameDetalleFormParentezco.jTextAreanombreParentezco.setText(parentezcoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParentezco(ParentezcoParameterReturnGeneral parentezcoReturnGeneral,ParentezcoBean parentezcoBean,Boolean conDefault) throws Exception { 
		try {
			Parentezco parentezcoLocal=new Parentezco();
			
			parentezcoLocal=parentezcoReturnGeneral.getParentezco();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parentezcoLocal.getId()!=null && !parentezcoLocal.getId().equals(0L))) {parentezcoBean.setId(parentezcoLocal.getId());}}
			if(conDefault || (!conDefault && parentezcoLocal.getcodigo()!=null && !parentezcoLocal.getcodigo().equals(""))) {parentezcoBean.setcodigo(parentezcoLocal.getcodigo());}
			if(conDefault || (!conDefault && parentezcoLocal.getnombre()!=null && !parentezcoLocal.getnombre().equals(""))) {parentezcoBean.setnombre(parentezcoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParentezcoGenerico(Long idParentezcoSeleccionado,JComboBox jComboBoxParentezco,List<Parentezco> parentezcosLocal)throws Exception {
		try {
			Parentezco  parentezcoTemp=null;

			for(Parentezco parentezcoAux:parentezcosLocal) {
				if(parentezcoAux.getId()!=null && parentezcoAux.getId().equals(idParentezcoSeleccionado)) {
					parentezcoTemp=parentezcoAux;
					break;
				}
			}

			jComboBoxParentezco.setSelectedItem(parentezcoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParentezcoGenerico(JComboBox jComboBoxParentezco,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParentezco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParentezco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParentezco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParentezco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParentezco.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParentezco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParentezco.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParentezco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParentezco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParentezco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Referencia")) {
			jButtonReferenciaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parentezco=(Parentezco) parentezcoLogic.getParentezcos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parentezco =(Parentezco) parentezcos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Parentezco parentezcoRow=new Parentezco();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parentezcoRow=(Parentezco) parentezcoLogic.getParentezcos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parentezcoRow=(Parentezco) parentezcos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonReferenciaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Parentezco parentezco) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormParentezco==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parentezco = (Parentezco)this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.parentezco = (Parentezco)this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(parentezco!=null) {
						this.parentezco = parentezco;
					} else {
						this.parentezco = new Parentezco();
					}
				}

				if(this.isTienePermisosReferencia && this.permiteMantenimiento(this.parentezco)) {
					ReferenciaBeanSwingJInternalFrame referenciaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFramePopup=new ReferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						referenciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFramePopup;
					} else {
						referenciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame;
					}

					List<Parentezco> parentezcos=new ArrayList<Parentezco>();
					parentezcos.add(this.parentezco);
					if(!esRelacionado) {
						//referenciaBeanSwingJInternalFrame.referenciaSessionBean.setConGuardarRelaciones(false);
						//referenciaBeanSwingJInternalFrame.referenciaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					referenciaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormParentezco.cargarReferenciaBeanSwingJInternalFrame(parentezcos,this.parentezco,referenciaBeanSwingJInternalFrame,/*conInicializar,*/referenciaBeanSwingJInternalFrame.referenciaSessionBean.getConGuardarRelaciones(),referenciaBeanSwingJInternalFrame.referenciaSessionBean.getEsGuardarRelacionado());
					referenciaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						referenciaBeanSwingJInternalFrame.actualizarEstadoPanelsReferencia("no_relacionado");

						referenciaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ReferenciaConstantesFunciones.ITAMANIOFILATABLA + (ReferenciaConstantesFunciones.ITAMANIOFILATABLA/2));

						referenciaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderParentezco=(TitledBorder)this.jScrollPanelDatosParentezco.getBorder();
						TitledBorder titledBorderReferencia=(TitledBorder)referenciaBeanSwingJInternalFrame.jScrollPanelDatosReferencia.getBorder();

						titledBorderReferencia.setTitle(titledBorderParentezco.getTitle() + " -> Referencia");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,referenciaBeanSwingJInternalFrame);
						}

						referenciaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(referenciaBeanSwingJInternalFrame);

						referenciaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.parentezcoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Referencia",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParentezco(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParentezco.setVisible((this.isVisibilidadCeldaNuevoParentezco && this.isPermisoNuevoParentezco));			
			this.jButtonDuplicarParentezco.setVisible((this.isVisibilidadCeldaDuplicarParentezco && this.isPermisoDuplicarParentezco));			
			this.jButtonCopiarParentezco.setVisible((this.isVisibilidadCeldaCopiarParentezco && this.isPermisoCopiarParentezco));
			this.jButtonVerFormParentezco.setVisible((this.isVisibilidadCeldaVerFormParentezco && this.isPermisoVerFormParentezco));
			
			this.jButtonAbrirOrderByParentezco.setVisible((this.isVisibilidadCeldaOrdenParentezco && this.isPermisoOrdenParentezco));			
			
			this.jButtonNuevoRelacionesParentezco.setVisible((this.isVisibilidadCeldaNuevoRelacionesParentezco && this.isPermisoNuevoParentezco));			
			this.jButtonNuevoGuardarCambiosParentezco.setVisible((this.isVisibilidadCeldaNuevoParentezco && this.isPermisoNuevoParentezco && this.isPermisoGuardarCambiosParentezco));
			
			if(this.jInternalFrameDetalleFormParentezco!=null) {
			this.jInternalFrameDetalleFormParentezco.jButtonModificarParentezco.setVisible((this.isVisibilidadCeldaModificarParentezco && this.isPermisoActualizarParentezco));	
			this.jInternalFrameDetalleFormParentezco.jButtonActualizarParentezco.setVisible((this.isVisibilidadCeldaActualizarParentezco && this.isPermisoActualizarParentezco));	
			this.jInternalFrameDetalleFormParentezco.jButtonEliminarParentezco.setVisible((this.isVisibilidadCeldaEliminarParentezco && this.isPermisoEliminarParentezco));
			this.jInternalFrameDetalleFormParentezco.jButtonCancelarParentezco.setVisible(this.isVisibilidadCeldaCancelarParentezco);							
			this.jInternalFrameDetalleFormParentezco.jButtonGuardarCambiosParentezco.setVisible((this.isVisibilidadCeldaGuardarParentezco && this.isPermisoGuardarCambiosParentezco));			
			
			}
						
			this.jButtonGuardarCambiosTablaParentezco.setVisible((this.isVisibilidadCeldaGuardarCambiosParentezco && this.isPermisoGuardarCambiosParentezco));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParentezco.setVisible((this.isVisibilidadCeldaNuevoParentezco && this.isPermisoNuevoParentezco));						
			this.jButtonDuplicarToolBarParentezco.setVisible((this.isVisibilidadCeldaDuplicarParentezco && this.isPermisoDuplicarParentezco));						
			this.jButtonCopiarToolBarParentezco.setVisible((this.isVisibilidadCeldaCopiarParentezco && this.isPermisoCopiarParentezco));			
			this.jButtonVerFormToolBarParentezco.setVisible((this.isVisibilidadCeldaVerFormParentezco && this.isPermisoVerFormParentezco));			
			this.jButtonAbrirOrderByToolBarParentezco.setVisible((this.isVisibilidadCeldaOrdenParentezco && this.isPermisoOrdenParentezco));
			this.jButtonNuevoRelacionesToolBarParentezco.setVisible((this.isVisibilidadCeldaNuevoRelacionesParentezco && this.isPermisoNuevoParentezco));			
			this.jButtonNuevoGuardarCambiosToolBarParentezco.setVisible((this.isVisibilidadCeldaNuevoParentezco && this.isPermisoNuevoParentezco && this.isPermisoGuardarCambiosParentezco));			
			
			if(this.jInternalFrameDetalleFormParentezco!=null) {
			this.jInternalFrameDetalleFormParentezco.jButtonModificarToolBarParentezco.setVisible((this.isVisibilidadCeldaModificarParentezco && this.isPermisoActualizarParentezco));	
			this.jInternalFrameDetalleFormParentezco.jButtonActualizarToolBarParentezco.setVisible((this.isVisibilidadCeldaActualizarParentezco  && this.isPermisoActualizarParentezco));	
			this.jInternalFrameDetalleFormParentezco.jButtonEliminarToolBarParentezco.setVisible((this.isVisibilidadCeldaEliminarParentezco && this.isPermisoEliminarParentezco));
			this.jInternalFrameDetalleFormParentezco.jButtonCancelarToolBarParentezco.setVisible(this.isVisibilidadCeldaCancelarParentezco);				
			this.jInternalFrameDetalleFormParentezco.jButtonGuardarCambiosToolBarParentezco.setVisible((this.isVisibilidadCeldaGuardarParentezco && this.isPermisoGuardarCambiosParentezco));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParentezco.setVisible((this.isVisibilidadCeldaGuardarCambiosParentezco && this.isPermisoGuardarCambiosParentezco));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParentezco.setVisible((this.isVisibilidadCeldaNuevoParentezco && this.isPermisoNuevoParentezco));			
			this.jMenuItemDuplicarParentezco.setVisible((this.isVisibilidadCeldaDuplicarParentezco && this.isPermisoDuplicarParentezco));			
			this.jMenuItemCopiarParentezco.setVisible((this.isVisibilidadCeldaCopiarParentezco && this.isPermisoCopiarParentezco));			
			this.jMenuItemVerFormParentezco.setVisible((this.isVisibilidadCeldaVerFormParentezco && this.isPermisoVerFormParentezco));			
			this.jMenuItemAbrirOrderByParentezco.setVisible((this.isVisibilidadCeldaOrdenParentezco && this.isPermisoOrdenParentezco));			
			//this.jMenuItemMostrarOcultarParentezco.setVisible((this.isVisibilidadCeldaOrdenParentezco && this.isPermisoOrdenParentezco));
			this.jMenuItemDetalleAbrirOrderByParentezco.setVisible((this.isVisibilidadCeldaOrdenParentezco && this.isPermisoOrdenParentezco));			
			//this.jMenuItemDetalleMostrarOcultarParentezco.setVisible((this.isVisibilidadCeldaOrdenParentezco && this.isPermisoOrdenParentezco));			
			this.jMenuItemNuevoRelacionesParentezco.setVisible((this.isVisibilidadCeldaNuevoRelacionesParentezco && this.isPermisoNuevoParentezco));			
			this.jMenuItemNuevoGuardarCambiosParentezco.setVisible((this.isVisibilidadCeldaNuevoParentezco && this.isPermisoNuevoParentezco && this.isPermisoGuardarCambiosParentezco));									
			
			if(this.jInternalFrameDetalleFormParentezco!=null) {
			this.jInternalFrameDetalleFormParentezco.jMenuItemModificarParentezco.setVisible((this.isVisibilidadCeldaModificarParentezco && this.isPermisoActualizarParentezco));	
			this.jInternalFrameDetalleFormParentezco.jMenuItemActualizarParentezco.setVisible((this.isVisibilidadCeldaActualizarParentezco && this.isPermisoActualizarParentezco));	
			this.jInternalFrameDetalleFormParentezco.jMenuItemEliminarParentezco.setVisible((this.isVisibilidadCeldaEliminarParentezco && this.isPermisoEliminarParentezco));
			this.jInternalFrameDetalleFormParentezco.jMenuItemCancelarParentezco.setVisible(this.isVisibilidadCeldaCancelarParentezco);				
			}
			
			this.jMenuItemGuardarCambiosParentezco.setVisible((this.isVisibilidadCeldaGuardarParentezco && this.isPermisoGuardarCambiosParentezco));						
			this.jMenuItemGuardarCambiosTablaParentezco.setVisible((this.isVisibilidadCeldaGuardarCambiosParentezco && this.isPermisoGuardarCambiosParentezco));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParentezco=this.jButtonNuevoParentezco.isVisible();
			this.isVisibilidadCeldaDuplicarParentezco=this.jButtonDuplicarParentezco.isVisible();
			this.isVisibilidadCeldaCopiarParentezco=this.jButtonCopiarParentezco.isVisible();
			this.isVisibilidadCeldaVerFormParentezco=this.jButtonVerFormParentezco.isVisible();
			
			this.isVisibilidadCeldaOrdenParentezco=this.jButtonAbrirOrderByParentezco.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParentezco=this.jButtonNuevoRelacionesParentezco.isVisible();
			this.isVisibilidadCeldaModificarParentezco=this.jButtonModificarParentezco.isVisible();
			
			if(this.jInternalFrameDetalleFormParentezco!=null) {
			this.isVisibilidadCeldaActualizarParentezco=this.jInternalFrameDetalleFormParentezco.jButtonActualizarParentezco.isVisible();
			this.isVisibilidadCeldaEliminarParentezco=this.jInternalFrameDetalleFormParentezco.jButtonEliminarParentezco.isVisible();
			this.isVisibilidadCeldaCancelarParentezco=this.jInternalFrameDetalleFormParentezco.jButtonCancelarParentezco.isVisible();
			this.isVisibilidadCeldaGuardarParentezco=this.jInternalFrameDetalleFormParentezco.jButtonGuardarCambiosParentezco.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParentezco=this.jButtonGuardarCambiosTablaParentezco.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParentezco=this.jButtonNuevoToolBarParentezco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParentezco=this.jButtonNuevoRelacionesToolBarParentezco.isVisible();
			
			if(this.jInternalFrameDetalleFormParentezco!=null) {
			this.isVisibilidadCeldaModificarParentezco=this.jInternalFrameDetalleFormParentezco.jButtonModificarToolBarParentezco.isVisible();
			this.isVisibilidadCeldaActualizarParentezco=this.jInternalFrameDetalleFormParentezco.jButtonActualizarToolBarParentezco.isVisible();
			this.isVisibilidadCeldaEliminarParentezco=this.jInternalFrameDetalleFormParentezco.jButtonEliminarToolBarParentezco.isVisible();
			this.isVisibilidadCeldaCancelarParentezco=this.jInternalFrameDetalleFormParentezco.jButtonCancelarToolBarParentezco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParentezco=this.jButtonGuardarCambiosToolBarParentezco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParentezco=this.jButtonGuardarCambiosTablaToolBarParentezco.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParentezco=this.jMenuItemNuevoParentezco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParentezco=this.jMenuItemNuevoRelacionesParentezco.isVisible();
			
			if(this.jInternalFrameDetalleFormParentezco!=null) {
			this.isVisibilidadCeldaModificarParentezco=this.jInternalFrameDetalleFormParentezco.jMenuItemModificarParentezco.isVisible();
			this.isVisibilidadCeldaActualizarParentezco=this.jInternalFrameDetalleFormParentezco.jMenuItemActualizarParentezco.isVisible();
			this.isVisibilidadCeldaEliminarParentezco=this.jInternalFrameDetalleFormParentezco.jMenuItemEliminarParentezco.isVisible();
			this.isVisibilidadCeldaCancelarParentezco=this.jInternalFrameDetalleFormParentezco.jMenuItemCancelarParentezco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParentezco=this.jMenuItemGuardarCambiosParentezco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParentezco=this.jMenuItemGuardarCambiosTablaParentezco.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParentezco(Boolean esInicializar) {
		if(ParentezcoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parentezcoSessionBean.getConGuardarRelaciones()) {
				//if(this.parentezcoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParentezco();
			}
			
			this.inicializarActualizarBindingBotonesManualParentezco(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParentezco() {
		this.jButtonNuevoParentezco.setVisible(this.isPermisoNuevoParentezco);			
		this.jButtonDuplicarParentezco.setVisible(this.isPermisoDuplicarParentezco);			
		this.jButtonCopiarParentezco.setVisible(this.isPermisoCopiarParentezco);			
		this.jButtonVerFormParentezco.setVisible(this.isPermisoVerFormParentezco);			
		
		this.jButtonAbrirOrderByParentezco.setVisible(this.isPermisoOrdenParentezco);					
		
		this.jButtonNuevoRelacionesParentezco.setVisible(this.isPermisoNuevoParentezco);			
		
		if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParentezco.jButtonModificarParentezco.setVisible(this.isPermisoActualizarParentezco);	
			this.jInternalFrameDetalleFormParentezco.jButtonActualizarParentezco.setVisible(this.isPermisoActualizarParentezco);	
			this.jInternalFrameDetalleFormParentezco.jButtonEliminarParentezco.setVisible(this.isPermisoEliminarParentezco);
			this.jInternalFrameDetalleFormParentezco.jButtonCancelarParentezco.setVisible(this.isVisibilidadCeldaCancelarParentezco);						
			this.jInternalFrameDetalleFormParentezco.jButtonGuardarCambiosParentezco.setVisible(this.isPermisoGuardarCambiosParentezco);							
		}
		
		this.jButtonGuardarCambiosTablaParentezco.setVisible(this.isPermisoActualizarParentezco);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParentezco() {
		this.jInternalFrameDetalleFormParentezco.jButtonModificarParentezco.setVisible(this.isPermisoActualizarParentezco);	
		this.jInternalFrameDetalleFormParentezco.jButtonActualizarParentezco.setVisible(this.isPermisoActualizarParentezco);	
		this.jInternalFrameDetalleFormParentezco.jButtonEliminarParentezco.setVisible(this.isPermisoEliminarParentezco);
		this.jInternalFrameDetalleFormParentezco.jButtonCancelarParentezco.setVisible(this.isVisibilidadCeldaCancelarParentezco);							
		this.jInternalFrameDetalleFormParentezco.jButtonGuardarCambiosParentezco.setVisible((this.isVisibilidadCeldaGuardarParentezco && this.isPermisoGuardarCambiosParentezco));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParentezco() {
		if(ParentezcoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParentezco();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParentezco() {
	}
	
	public void jTableDatosParentezcoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParentezco(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParentezcoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParentezco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParentezco(this.getparentezco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParentezco(this.parentezco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parentezco =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parentezco =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parentezco==null) {
						this.parentezco = new Parentezco();
					}

					this.setVariablesFormularioToObjetoActualParentezco(this.parentezco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParentezco(this.parentezco);
				}

				if(this.parentezco.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parentezco.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParentezco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoParentezcoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParentezco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParentezco(this.getparentezco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParentezco(this.parentezco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parentezco =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parentezco =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parentezco==null) {
						this.parentezco = new Parentezco();
					}

					this.setVariablesFormularioToObjetoActualParentezco(this.parentezco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParentezco(this.parentezco);
				}

				if(this.parentezco.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.parentezco.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParentezco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreParentezcoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParentezco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParentezco(this.getparentezco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParentezco(this.parentezco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parentezco =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parentezco =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parentezco==null) {
						this.parentezco = new Parentezco();
					}

					this.setVariablesFormularioToObjetoActualParentezco(this.parentezco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParentezco(this.parentezco);
				}

				if(this.parentezco.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.parentezco.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParentezco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameParentezco() {
		if(this.jInternalFrameDetalleFormParentezco!=null) {
		

		if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormParentezco!=null) {
			this.jInternalFrameDetalleFormParentezco.setVisible(false);	    			
			this.jInternalFrameDetalleFormParentezco.dispose();
			this.jInternalFrameDetalleFormParentezco=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParentezco!=null) {
			this.jInternalFrameReporteDinamicoParentezco.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParentezco.dispose();
			this.jInternalFrameReporteDinamicoParentezco=null;
		}
		
		if(this.jInternalFrameImportacionParentezco!=null) {
			this.jInternalFrameImportacionParentezco.setVisible(false);	    			
			this.jInternalFrameImportacionParentezco.dispose();
			this.jInternalFrameImportacionParentezco=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParentezco();
			
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
			
			
			if(sTipo.equals("NuevoParentezco")) {
				jButtonNuevoParentezcoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParentezco")) {
				jButtonDuplicarParentezcoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParentezco")) {
				jButtonCopiarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("VerFormParentezco")) {
				jButtonVerFormParentezcoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParentezco")) {
				jButtonNuevoParentezcoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParentezco")) {
				jButtonDuplicarParentezcoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParentezco")) {
				jButtonNuevoParentezcoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParentezco")) {
				jButtonDuplicarParentezcoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParentezco")) {
				jButtonNuevoParentezcoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParentezco")) {
				jButtonNuevoParentezcoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParentezco")) {
				jButtonNuevoParentezcoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParentezco")) {
				jButtonModificarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParentezco")) {
				jButtonModificarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParentezco")) {
				jButtonModificarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParentezco")) {
				jButtonActualizarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParentezco")) {
				jButtonActualizarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParentezco")) {
				jButtonActualizarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("EliminarParentezco")) {
				jButtonEliminarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParentezco")) {
				jButtonEliminarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParentezco")) {
				jButtonEliminarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("CancelarParentezco")) {
				jButtonCancelarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParentezco")) {
				jButtonCancelarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParentezco")) {
				jButtonCancelarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("CerrarParentezco")) {
				jButtonCerrarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParentezco")) {
				jButtonCerrarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParentezco")) {
				jButtonCerrarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParentezco")) {
				jButtonMostrarOcultarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParentezco")) {
				jButtonCancelarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParentezco")) {
				jButtonGuardarCambiosParentezcoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParentezco")) {
				jButtonGuardarCambiosParentezcoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParentezco")) {
				jButtonCopiarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParentezco")) {
				jButtonVerFormParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParentezco")) {
				jButtonGuardarCambiosParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParentezco")) {
				jButtonCopiarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParentezco")) {
				jButtonVerFormParentezcoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParentezco")) {
				jButtonGuardarCambiosParentezcoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParentezco")) {
				jButtonGuardarCambiosParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParentezco")) {
				jButtonGuardarCambiosParentezcoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParentezco")) {
				jButtonRecargarInformacionParentezcoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParentezco")) {
				jButtonRecargarInformacionParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParentezco")) {
				jButtonRecargarInformacionParentezcoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParentezco")) {
				jButtonAnterioresParentezcoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParentezco")) {
				jButtonAnterioresParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParentezco")) {
				jButtonAnterioresParentezcoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParentezco")) {
				jButtonSiguientesParentezcoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParentezco")) {
				jButtonSiguientesParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParentezco")) {
				jButtonSiguientesParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParentezco") || sTipo.equals("MenuItemDetalleAbrirOrderByParentezco")) {
				jButtonAbrirOrderByParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParentezco") || sTipo.equals("MenuItemDetalleMostrarOcultarParentezco")) {
				jButtonMostrarOcultarParentezcoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParentezco")) {
				jButtonNuevoGuardarCambiosParentezcoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParentezco")) {
				jButtonNuevoGuardarCambiosParentezcoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParentezco")) {
				jButtonNuevoGuardarCambiosParentezcoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParentezco")) {
				jButtonCerrarReporteDinamicoParentezcoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParentezco")) {
				jButtonGenerarReporteDinamicoParentezcoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParentezco")) {
				
				jButtonGenerarExcelReporteDinamicoParentezcoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParentezco")) {
				jButtonCerrarImportacionParentezcoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParentezco")) {
				
				jButtonGenerarImportacionParentezcoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParentezco")) {
				
				jButtonAbrirImportacionParentezcoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParentezco")) {
				jComboBoxTiposAccionesParentezcoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParentezco")) {
				jComboBoxTiposRelacionesParentezcoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParentezco")) {
				jComboBoxTiposAccionesParentezcoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParentezco")) {
				
				jComboBoxTiposSeleccionarParentezcoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParentezco")) {
				jTextFieldValorCampoGeneralParentezcoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParentezco")) {
				jButtonAbrirOrderByParentezcoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParentezco")) {
				jButtonAbrirOrderByParentezcoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParentezco")) {
				jButtonCerrarOrderByParentezcoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParentezcoBusqueda")) {
				this.jButtonidParentezcoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoParentezcoBusqueda")) {
				this.jButtoncodigoParentezcoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreParentezcoBusqueda")) {
				this.jButtonnombreParentezcoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParentezco();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParentezcoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parentezco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parentezco);
				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
				
				


				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parentezco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parentezco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Parentezco parentezcoLocal=null;
			
			if(!this.getEsControlTabla()) {
				parentezcoLocal=this.parentezco;
			} else {
				parentezcoLocal=this.parentezcoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parentezco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parentezco);
				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
							
				
				


				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parentezco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parentezco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParentezcoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParentezco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoAnterior =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parentezcoAnterior =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
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
			
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
			
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
			
			


			
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParentezcoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parentezco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parentezco);
				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
								
						
				


				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parentezco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parentezco.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parentezco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parentezco);
				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
								
				
				


				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parentezco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parentezco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParentezcoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParentezco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoAnterior =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parentezcoAnterior =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parentezco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parentezco);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParentezcoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParentezco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoAnterior =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parentezcoAnterior =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParentezcoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parentezco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parentezco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parentezco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parentezco);
				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
							
				
				


				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parentezco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parentezco.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParentezcoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParentezco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parentezcoAnterior =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parentezcoAnterior =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
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
			
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
			
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
			
			


			
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParentezcoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parentezco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parentezco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parentezco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parentezco);
				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
								
				
				


				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parentezco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parentezco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParentezcoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParentezco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoAnterior =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parentezcoAnterior =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParentezcoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parentezco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parentezco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParentezcoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parentezco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parentezco);
				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParentezco")) {
					jCheckBoxSeleccionarTodosParentezcoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParentezco")) {
					jCheckBoxSeleccionadosParentezcoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParentezco")) {
					
				}
				
				


				
				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parentezco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parentezco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parentezco);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parentezco);
				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
												
				
				


				
				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parentezco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parentezco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParentezcoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParentezco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parentezcoAnterior =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parentezcoAnterior =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParentezcoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parentezco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parentezco);
				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
				
				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
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
			
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
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
			
			


			
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParentezcoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parentezco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parentezco);
				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parentezco.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parentezco.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parentezco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parentezco);
				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
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
				
				


				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Parentezco.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Parentezco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParentezcoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParentezco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parentezcoAnterior =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parentezcoAnterior =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParentezco")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParentezcoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParentezco.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parentezco =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parentezco =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parentezco);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParentezco")) {
				
				}
				
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParentezco")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParentezco.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParentezco")) {
			
			}
			
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParentezco();
			
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
			
			if(sTipo.equals("NuevoParentezco")) {
				jButtonNuevoParentezcoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParentezco")) {
				jButtonDuplicarParentezcoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParentezco")) {
				jButtonCopiarParentezcoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParentezco")) {
				jButtonVerFormParentezcoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParentezco")) {
				jButtonNuevoParentezcoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParentezco")) {
				jButtonModificarParentezcoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParentezco")) {
				jButtonActualizarParentezcoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParentezco")) {
				jButtonEliminarParentezcoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParentezco")) {
				jButtonGuardarCambiosParentezcoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParentezco")) {
				jButtonCancelarParentezcoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParentezco")) {
				jButtonCerrarParentezcoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParentezco")) {
				jButtonGuardarCambiosParentezcoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParentezco")) {
				jButtonNuevoGuardarCambiosParentezcoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParentezco")) {
				jButtonAbrirOrderByParentezcoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParentezco")) {
				jButtonRecargarInformacionParentezcoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParentezco")) {
				jButtonAnterioresParentezcoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParentezco")) {
				jButtonSiguientesParentezcoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParentezcoBusqueda")) {
				this.jButtonidParentezcoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoParentezcoBusqueda")) {
				this.jButtoncodigoParentezcoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreParentezcoBusqueda")) {
				this.jButtonnombreParentezcoBusquedaActionPerformed(evt);
			}
			
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParentezco();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParentezco")) {
				closingInternalFrameParentezco();
				
			} else if(sTipo.equals("jButtonCancelarParentezco")) {
				JInternalFrameBase jInternalFrameDetalleFormParentezco = (JInternalFrameBase)evt.getSource();
	            	
	            ParentezcoBeanSwingJInternalFrame jInternalFrameParent=(ParentezcoBeanSwingJInternalFrame)jInternalFrameDetalleFormParentezco.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParentezcoActionPerformed(null);
			}
			
			ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parentezco,new Object(),this.parentezcoParameterGeneral,this.parentezcoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParentezco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParentezco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParentezco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parentezco)) {
			if(!esControlTabla) {
				if(ParentezcoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParentezco(this.parentezco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParentezco(this.parentezco);			
				}
				
				if(this.parentezcoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParentezco(this.parentezco,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parentezcoReturnGeneral=parentezcoLogic.procesarEventosParentezcosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parentezcoLogic.getParentezcos(),this.parentezco,this.parentezcoParameterGeneral,this.isEsNuevoParentezco,classes);//this.parentezcoLogic.getParentezco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParentezco(this.parentezcoReturnGeneral,this.parentezcoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parentezcoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParentezco(classes,this.parentezcoReturnGeneral,this.parentezcoBean,false);
					}
						
					if(this.parentezcoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParentezco(this.parentezcoReturnGeneral.getParentezco());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParentezco(this.parentezcoReturnGeneral.getParentezco());	
					}
						
					if(this.parentezcoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParentezco(this.parentezcoReturnGeneral.getParentezco(),classes);//this.parentezcoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParentezco(this.parentezco,classes);//this.parentezcoBean);									
				}
			
				if(ParentezcoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParentezco(this.parentezco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParentezco(this.parentezco);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parentezcoAnterior!=null) {
						this.parentezco=this.parentezcoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parentezcoReturnGeneral=parentezcoLogic.procesarEventosParentezcosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parentezcoLogic.getParentezcos(),this.parentezco,this.parentezcoParameterGeneral,this.isEsNuevoParentezco,classes);//this.parentezcoLogic.getParentezco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parentezcoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parentezcoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parentezcoReturnGeneral.getParentezco(),parentezcoLogic.getParentezcos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parentezcoReturnGeneral.getParentezco(),this.parentezcos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParentezco.repaint();
				
				//((AbstractTableModel) this.jTableDatosParentezco.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParentezco();
			}
		}
	}
	
	public void actualizarVisualTableDatosParentezco() throws Exception {
		
		ParentezcoModel parentezcoModel=(ParentezcoModel)this.jTableDatosParentezco.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parentezcoModel.parentezcos=this.parentezcoLogic.getParentezcos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parentezcoModel.parentezcos=this.parentezcos;
		}
		
		
		((ParentezcoModel) this.jTableDatosParentezco.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParentezco() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparentezcoAnterior(),this.parentezcoLogic.getParentezcos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparentezcoAnterior(),this.parentezcos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParentezco();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParentezco(Parentezco parentezco,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Referencia.class)) {
					this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaLogic.setReferencias(parentezco.getReferencias());
					this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferencia(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
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
										
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parentezco,new Object(),generalEntityParameterGeneral,this.parentezcoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parentezcoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParentezcoConstantesFunciones.getClassesRelationshipsOfParentezco(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParentezcoConstantesFunciones.getClassesRelationshipsFromStringsOfParentezco(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParentezco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParentezcoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parentezco,new Object(),generalEntityParameterGeneral,this.parentezcoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParentezco(ParentezcoBean parentezcoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Referencia.class)) {
					this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaLogic.setReferencias(parentezco.getReferencias());
					this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferencia(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParentezco(ArrayList<Classe> classes,ParentezcoReturnGeneral parentezcoReturnGeneral,ParentezcoBean parentezcoBean,Boolean conDefault) throws Exception {
		
			this.parentezcoBean.setReferencias(parentezcoReturnGeneral.getParentezco().getReferencias());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParentezco(Parentezco parentezco,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Referencia.class)) {
					parentezco.setReferencias(this.jInternalFrameDetalleFormParentezco.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias());
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
		if(!paraTabla && !this.permiteMantenimiento(this.parentezco)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParentezco = new ParentezcoDetalleFormJInternalFrame(jDesktopPane,this.parentezcoSessionBean.getConGuardarRelaciones(),this.parentezcoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParentezco);
		this.jInternalFrameDetalleFormParentezco.setVisible(false);
		this.jInternalFrameDetalleFormParentezco.setSelected(false);						
		
		this.jInternalFrameDetalleFormParentezco.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParentezco.parentezcoLogic=this.parentezcoLogic;
		
		this.cargarCombosFrameForeignKeyParentezco("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParentezco();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParentezco();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParentezco("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParentezco();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParentezco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParentezco"));
		
		this.jInternalFrameDetalleFormParentezco.jButtonModificarParentezco.addActionListener(new ButtonActionListener(this,"ModificarParentezco"));

		
		this.jInternalFrameDetalleFormParentezco.jButtonModificarToolBarParentezco.addActionListener(new ButtonActionListener(this,"ModificarToolBarParentezco"));
					
		this.jInternalFrameDetalleFormParentezco.jMenuItemModificarParentezco.addActionListener(new ButtonActionListener(this,"MenuItemModificarParentezco"));		
		
		
		
		this.jInternalFrameDetalleFormParentezco.jButtonActualizarParentezco.addActionListener (new ButtonActionListener(this,"ActualizarParentezco"));
		
		
		this.jInternalFrameDetalleFormParentezco.jButtonActualizarToolBarParentezco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParentezco"));
						
		this.jInternalFrameDetalleFormParentezco.jMenuItemActualizarParentezco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParentezco"));		
		
		
		
		this.jInternalFrameDetalleFormParentezco.jButtonEliminarParentezco.addActionListener (new ButtonActionListener(this,"EliminarParentezco"));
		
		
		this.jInternalFrameDetalleFormParentezco.jButtonEliminarToolBarParentezco.addActionListener (new ButtonActionListener(this,"EliminarToolBarParentezco"));
								
		this.jInternalFrameDetalleFormParentezco.jMenuItemEliminarParentezco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParentezco"));		
		
		
		
		this.jInternalFrameDetalleFormParentezco.jButtonCancelarParentezco.addActionListener (new ButtonActionListener(this,"CancelarParentezco"));
		
		
		this.jInternalFrameDetalleFormParentezco.jButtonCancelarToolBarParentezco.addActionListener (new ButtonActionListener(this,"CancelarToolBarParentezco"));
					
		this.jInternalFrameDetalleFormParentezco.jMenuItemCancelarParentezco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParentezco"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParentezco.jMenuItemDetalleCerrarParentezco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParentezco"));		
		
		
		
		this.jInternalFrameDetalleFormParentezco.jButtonGuardarCambiosToolBarParentezco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParentezco"));
		
		
		
		this.jInternalFrameDetalleFormParentezco.jButtonGuardarCambiosToolBarParentezco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParentezco"));
		
		
		
		this.jInternalFrameDetalleFormParentezco.jComboBoxTiposAccionesFormularioParentezco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParentezco"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParentezco.jButtonidParentezcoBusqueda.addActionListener(new ButtonActionListener(this,"idParentezcoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParentezco.jButtoncodigoParentezcoBusqueda.addActionListener(new ButtonActionListener(this,"codigoParentezcoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParentezco.jButtonnombreParentezcoBusqueda.addActionListener(new ButtonActionListener(this,"nombreParentezcoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParentezco.jTabbedPaneRelacionesParentezco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParentezco"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParentezco"));
		
		if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParentezco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParentezco"));
		}
		
		this.jTableDatosParentezco.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParentezco"));
		
		this.jTableDatosParentezco.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParentezco"));
		
		this.jButtonNuevoParentezco.addActionListener(new ButtonActionListener(this,"NuevoParentezco"));
		
		this.jButtonDuplicarParentezco.addActionListener(new ButtonActionListener(this,"DuplicarParentezco"));
		
		this.jButtonCopiarParentezco.addActionListener(new ButtonActionListener(this,"CopiarParentezco"));
		
		this.jButtonVerFormParentezco.addActionListener(new ButtonActionListener(this,"VerFormParentezco"));
		
		
		this.jButtonNuevoToolBarParentezco.addActionListener(new ButtonActionListener(this,"NuevoToolBarParentezco"));
			
		this.jButtonDuplicarToolBarParentezco.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParentezco"));
			
		this.jMenuItemNuevoParentezco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParentezco"));
			
		this.jMenuItemDuplicarParentezco.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParentezco"));		
		
		
		this.jButtonNuevoRelacionesParentezco.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParentezco"));
		
		
		this.jButtonNuevoRelacionesToolBarParentezco.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParentezco"));
			
		this.jMenuItemNuevoRelacionesParentezco.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParentezco"));		
		
		
		if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParentezco.jButtonModificarParentezco.addActionListener(new ButtonActionListener(this,"ModificarParentezco"));
		}
		
		
		if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParentezco.jButtonModificarToolBarParentezco.addActionListener(new ButtonActionListener(this,"ModificarToolBarParentezco"));
			
			this.jInternalFrameDetalleFormParentezco.jMenuItemModificarParentezco.addActionListener(new ButtonActionListener(this,"MenuItemModificarParentezco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParentezco.jButtonActualizarParentezco.addActionListener (new ButtonActionListener(this,"ActualizarParentezco"));
		}
		
		
		if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParentezco.jButtonActualizarToolBarParentezco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParentezco"));
				
			this.jInternalFrameDetalleFormParentezco.jMenuItemActualizarParentezco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParentezco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParentezco.jButtonEliminarParentezco.addActionListener (new ButtonActionListener(this,"EliminarParentezco"));
		}
		
		
		if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParentezco.jButtonEliminarToolBarParentezco.addActionListener (new ButtonActionListener(this,"EliminarToolBarParentezco"));
						
			this.jInternalFrameDetalleFormParentezco.jMenuItemEliminarParentezco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParentezco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParentezco.jButtonCancelarParentezco.addActionListener (new ButtonActionListener(this,"CancelarParentezco"));
		}
		
		
		if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParentezco.jButtonCancelarToolBarParentezco.addActionListener (new ButtonActionListener(this,"CancelarToolBarParentezco"));
			
			this.jInternalFrameDetalleFormParentezco.jMenuItemCancelarParentezco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParentezco"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParentezco.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParentezco"));		
		
		
		this.jButtonCerrarParentezco.addActionListener (new ButtonActionListener(this,"CerrarParentezco"));
		
		
		this.jButtonCerrarToolBarParentezco.addActionListener (new ButtonActionListener(this,"CerrarToolBarParentezco"));
			
		this.jMenuItemCerrarParentezco.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParentezco"));
			
		if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParentezco.jMenuItemDetalleCerrarParentezco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParentezco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParentezco.jButtonGuardarCambiosParentezco.addActionListener (new ButtonActionListener(this,"GuardarCambiosParentezco"));
		}
		
		
		if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParentezco.jButtonGuardarCambiosToolBarParentezco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParentezco"));
		}
		
		this.jButtonCopiarToolBarParentezco.addActionListener (new ButtonActionListener(this,"CopiarToolBarParentezco"));
			
		this.jButtonVerFormToolBarParentezco.addActionListener (new ButtonActionListener(this,"VerFormToolBarParentezco"));
		
		this.jMenuItemGuardarCambiosParentezco.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParentezco"));
			
		this.jMenuItemCopiarParentezco.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParentezco"));		
		
		this.jMenuItemVerFormParentezco.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParentezco"));		
		
		
		this.jButtonGuardarCambiosTablaParentezco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParentezco"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParentezco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParentezco"));
			
		this.jMenuItemGuardarCambiosTablaParentezco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParentezco"));		
		
		
		
		this.jButtonRecargarInformacionParentezco.addActionListener (new ButtonActionListener(this,"RecargarInformacionParentezco"));
					
		this.jButtonRecargarInformacionToolBarParentezco.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParentezco"));
		
		this.jMenuItemRecargarInformacionParentezco.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParentezco"));		
		
		
		
		this.jButtonAnterioresParentezco.addActionListener (new ButtonActionListener(this,"AnterioresParentezco"));
		
		
		this.jButtonAnterioresToolBarParentezco.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParentezco"));
		
		this.jMenuItemAnterioresParentezco.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParentezco"));		
		
		
		this.jButtonSiguientesParentezco.addActionListener (new ButtonActionListener(this,"SiguientesParentezco"));
		
		
		this.jButtonSiguientesToolBarParentezco.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParentezco"));
			
		this.jMenuItemSiguientesParentezco.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParentezco"));
			
		this.jMenuItemAbrirOrderByParentezco.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParentezco"));
			
		this.jMenuItemMostrarOcultarParentezco.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParentezco"));
			
		this.jMenuItemDetalleAbrirOrderByParentezco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParentezco"));
			
		this.jMenuItemDetalleMostarOcultarParentezco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParentezco"));		
		
		
		this.jButtonNuevoGuardarCambiosParentezco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParentezco"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParentezco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParentezco"));
			
		this.jMenuItemNuevoGuardarCambiosParentezco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParentezco"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParentezco.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParentezco"));

		this.jCheckBoxSeleccionadosParentezco.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParentezco"));
		
		if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParentezco.jComboBoxTiposAccionesFormularioParentezco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParentezco"));
		}
		
		
		this.jComboBoxTiposRelacionesParentezco.addActionListener (new ButtonActionListener(this,"TiposRelacionesParentezco"));
			
		this.jComboBoxTiposAccionesParentezco.addActionListener (new ButtonActionListener(this,"TiposAccionesParentezco"));
					
		this.jComboBoxTiposSeleccionarParentezco.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParentezco"));
			
		this.jTextFieldValorCampoGeneralParentezco.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParentezco"));		
		
		
		if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParentezco.jButtonidParentezcoBusqueda.addActionListener(new ButtonActionListener(this,"idParentezcoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParentezco.jButtoncodigoParentezcoBusqueda.addActionListener(new ButtonActionListener(this,"codigoParentezcoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParentezco.jButtonnombreParentezcoBusqueda.addActionListener(new ButtonActionListener(this,"nombreParentezcoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParentezco!=null) {
				this.jInternalFrameReporteDinamicoParentezco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParentezco"));
				this.jInternalFrameReporteDinamicoParentezco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParentezco"));
				this.jInternalFrameReporteDinamicoParentezco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParentezco"));
			}
			
			//this.jButtonCerrarReporteDinamicoParentezco.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParentezco"));				
			//this.jButtonGenerarReporteDinamicoParentezco.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParentezco"));
			//this.jButtonGenerarExcelReporteDinamicoParentezco.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParentezco"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParentezco!=null) {
				this.jInternalFrameImportacionParentezco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParentezco"));
				this.jInternalFrameImportacionParentezco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParentezco"));
				this.jInternalFrameImportacionParentezco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParentezco"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParentezco.addActionListener (new ButtonActionListener(this,"AbrirOrderByParentezco"));
			
			this.jButtonAbrirOrderByToolBarParentezco.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParentezco"));			
			
			if(this.jInternalFrameOrderByParentezco!=null) {
				this.jInternalFrameOrderByParentezco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParentezco"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParentezco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParentezco.jTabbedPaneRelacionesParentezco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParentezco"));
		
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
            		closingInternalFrameParentezco();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParentezco.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParentezco = (JInternalFrameBase)event.getSource();
	            	
	            ParentezcoBeanSwingJInternalFrame jInternalFrameParent=(ParentezcoBeanSwingJInternalFrame)jInternalFrameDetalleFormParentezco.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParentezcoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParentezco.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParentezcoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParentezco.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParentezco.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParentezcoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParentezcoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParentezcoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParentezco";
		inputMap = this.jButtonNuevoParentezco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParentezco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParentezcoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParentezcoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParentezcoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParentezcoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParentezco";
		inputMap = this.jButtonNuevoRelacionesParentezco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParentezco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParentezcoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParentezco";
		inputMap = this.jButtonModificarParentezco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParentezco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParentezcoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParentezco";
		inputMap = this.jButtonActualizarParentezco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParentezco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParentezcoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParentezco";
		inputMap = this.jButtonEliminarParentezco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParentezco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParentezcoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParentezco";
		inputMap = this.jButtonCancelarParentezco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParentezco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParentezcoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParentezco";
		inputMap = this.jButtonCerrarParentezco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParentezco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParentezcoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParentezco.jButtonGuardarCambiosParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParentezco";
		inputMap = this.jInternalFrameDetalleFormParentezco.jButtonGuardarCambiosParentezco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParentezco.jButtonGuardarCambiosParentezco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParentezcoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParentezco.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParentezcoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParentezco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParentezcoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParentezco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParentezcoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParentezco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParentezcoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParentezco.jButtonidParentezcoBusqueda.addActionListener(new ButtonActionListener(this,"idParentezcoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParentezco.jButtoncodigoParentezcoBusqueda.addActionListener(new ButtonActionListener(this,"codigoParentezcoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParentezco.jButtonnombreParentezcoBusqueda.addActionListener(new ButtonActionListener(this,"nombreParentezcoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParentezco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParentezcoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParentezcoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParentezco.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParentezco(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Parentezco parentezcoAux:this.parentezcoLogic.getParentezcos()) {
					parentezcoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Parentezco parentezcoAux:parentezcos) {
					parentezcoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParentezcoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParentezco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Parentezco parentezcoAux:this.parentezcoLogic.getParentezcos()) {
						parentezcoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Parentezco parentezcoAux:parentezcos) {
						parentezcoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Parentezco parentezcoAux:this.parentezcoLogic.getParentezcos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Parentezco parentezcoAux:parentezcos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParentezco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParentezco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParentezco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParentezco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParentezcoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParentezco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParentezco.getSelectedRows();
			
			Parentezco parentezcoLocal=new Parentezco();
			
			//this.seleccionarTodosParentezco(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parentezcoLocal =(Parentezco) this.parentezcoLogic.getParentezcos().toArray()[this.jTableDatosParentezco.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parentezcoLocal =(Parentezco) this.parentezcos.toArray()[this.jTableDatosParentezco.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parentezcoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Parentezco parentezcoAux:this.parentezcoLogic.getParentezcos()) {
						parentezcoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Parentezco parentezcoAux:parentezcos) {
						parentezcoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParentezco(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParentezco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParentezco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParentezco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParentezcoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParentezcoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParentezcoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParentezco(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParentezco.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Parentezco parentezcoAux:this.parentezcoLogic.getParentezcos()) {
				
						if(sTipoSeleccionar.equals(ParentezcoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							parentezcoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParentezcoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							parentezcoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Parentezco parentezcoAux:parentezcos) {
					
						if(sTipoSeleccionar.equals(ParentezcoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							parentezcoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParentezcoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							parentezcoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParentezco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParentezcoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParentezco(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParentezco=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParentezco.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParentezco.jComboBoxTiposAccionesFormularioParentezco.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParentezco) {				
					conSplash=true;//false;										
					
					//this.startProcessParentezco(conSplash);
				
					this.generarReporteParentezcosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParentezco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParentezco.jComboBoxTiposAccionesFormularioParentezco.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParentezcosSeleccionados();
				//this.jComboBoxTiposAccionesParentezco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParentezcosSeleccionados(false);
				//this.jComboBoxTiposAccionesParentezco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParentezcosSeleccionados(true);
				//this.jComboBoxTiposAccionesParentezco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParentezco();
				
				this.exportarParentezcosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParentezco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParentezco.jComboBoxTiposAccionesFormularioParentezco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParentezcos();
				//this.importarParentezcos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParentezco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParentezco.jComboBoxTiposAccionesFormularioParentezco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParentezco();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParentezcosSeleccionados();
				//this.jComboBoxTiposAccionesParentezco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parentezco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParentezco();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParentezco)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParentezco(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parentezco",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParentezco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParentezco.jComboBoxTiposAccionesFormularioParentezco.setSelectedIndex(0);					
				}	
			} 			
			else if(ParentezcoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParentezco) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParentezco(conSplash);
					
						//this.actualizarParametrosGeneralParentezco();
						
						this.generarReporteProcesoAccionParentezcosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParentezco.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParentezco.jComboBoxTiposAccionesFormularioParentezco.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParentezcoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ParentezcoS SELECCIONADOS?", "MANTENIMIENTO DE Parentezco", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParentezco();
				
						this.actualizarParametrosGeneralParentezco();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parentezcoReturnGeneral=parentezcoLogic.procesarAccionParentezcosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parentezcoLogic.getParentezcos(),this.parentezcoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParentezcoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParentezco.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParentezco.jComboBoxTiposAccionesFormularioParentezco.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParentezco();
					
					ParentezcoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParentezcoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParentezco.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParentezco.jComboBoxTiposAccionesFormularioParentezco.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParentezco(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParentezcoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParentezco();
			
			if(this.jInternalFrameDetalleFormParentezco==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Parentezco> parentezcosSeleccionados=new ArrayList<Parentezco>();		
			Parentezco parentezco=new Parentezco();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParentezco(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParentezco.getSelectedItem();
			
			
			
			
			parentezcosSeleccionados=this.getParentezcosSeleccionados(true);
			//this.sTipoAccion;
			
			if(parentezcosSeleccionados.size()==1) {
				for(Parentezco parentezcoAux:parentezcosSeleccionados) {
					parentezco=parentezcoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Referencia")) {
					jButtonReferenciaActionPerformed(null,rowIndex,true,false,parentezco);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParentezco();
			
      		//this.finishProcessParentezco(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParentezcoReturnGeneral() throws Exception {
		if(this.parentezcoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parentezcoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parentezcoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parentezcoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parentezcoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parentezcoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParentezco(false);
		}
		
		if(this.parentezcoReturnGeneral.getConRetornoLista() || this.parentezcoReturnGeneral.getConRetornoObjeto()) {
			if(this.parentezcoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parentezcoLogic.setParentezcos(this.parentezcoReturnGeneral.getParentezcos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parentezcoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parentezcoLogic.setParentezco(this.parentezcoReturnGeneral.getParentezco());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParentezco(false);
		}
	}
	
	public void actualizarParametrosGeneralParentezco() throws Exception {
		
		
	}
	
	public ArrayList<Parentezco> getParentezcosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Parentezco> parentezcosSeleccionados=new ArrayList<Parentezco>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParentezco) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Parentezco parentezcoAux:parentezcoLogic.getParentezcos()) {
					if(parentezcoAux.getIsSelected()) {
						parentezcosSeleccionados.add(parentezcoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Parentezco parentezcoAux:this.parentezcos) {
					if(parentezcoAux.getIsSelected()) {
						parentezcosSeleccionados.add(parentezcoAux);				
					}
				}
			}
			
			if(parentezcosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parentezcosSeleccionados.addAll(this.parentezcoLogic.getParentezcos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parentezcosSeleccionados.addAll(this.parentezcos);				
					}
				}
			}
		} else {
			parentezcosSeleccionados.add(this.parentezco);
		}
		
		return parentezcosSeleccionados;
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
	
	public void generarReporteParentezcosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParentezcosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParentezcosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParentezcosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParentezcosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesParentezcosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parentezco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParentezcosSeleccionados() throws Exception {
		ArrayList<Parentezco> parentezcosSeleccionados=new ArrayList<Parentezco>();		
		
		parentezcosSeleccionados=this.getParentezcosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParentezcos("Todos",parentezcosSeleccionados);
		
	}	
	
	public void generarReporteNormalParentezcosSeleccionados() throws Exception {
		ArrayList<Parentezco> parentezcosSeleccionados=new ArrayList<Parentezco>();		
		
		parentezcosSeleccionados=this.getParentezcosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParentezcos("Todos",parentezcosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParentezcosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Parentezco> parentezcosSeleccionados=new ArrayList<Parentezco>();
		
		parentezcosSeleccionados=this.getParentezcosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParentezcos("Todos",parentezcosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParentezcosSeleccionados() throws Exception {
		ArrayList<Parentezco> parentezcosSeleccionados=new ArrayList<Parentezco>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParentezco();
		
		
		parentezcosSeleccionados=this.getParentezcosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParentezco();
		
		
		//this.generarReporteParentezcos("Todos",parentezcosSeleccionados ,parentezcoImplementable,parentezcoImplementableHome);
	}
	
	public void mostrarImportacionParentezcos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParentezco();
		
		this.abrirFrameImportacionParentezco();		
		
			
		//this.generarReporteParentezcos("Todos",parentezcosSeleccionados ,parentezcoImplementable,parentezcoImplementableHome);
	}
	
	public void importarParentezcos() throws Exception {		
	
	}
	
	public void exportarParentezcosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParentezcosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParentezcosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParentezcosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parentezco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParentezcosSeleccionados() throws Exception {
		ArrayList<Parentezco> parentezcosSeleccionados=new ArrayList<Parentezco>();		
		
		parentezcosSeleccionados=this.getParentezcosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parentezco."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParentezco(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Parentezco parentezcoAux:parentezcosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParentezco(parentezcoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parentezcoAux.setsDetalleGeneralEntityReporte(parentezcoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parentezcoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parentezco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParentezco(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParentezcoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParentezcoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParentezcoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParentezcoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParentezco(Parentezco parentezco,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parentezco.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parentezco.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parentezco.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parentezco.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParentezcosSeleccionados() throws Exception {
		ArrayList<Parentezco> parentezcosSeleccionados=new ArrayList<Parentezco>();		
		
		parentezcosSeleccionados=this.getParentezcosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parentezco.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Parentezcos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParentezco(row);				
				iRow++;
			}				
			
			for(Parentezco parentezcoAux:parentezcosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParentezco(parentezcoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parentezcoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parentezco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParentezcosSeleccionados() throws Exception {
		ArrayList<Parentezco> parentezcosSeleccionados=new ArrayList<Parentezco>();		
		
		parentezcosSeleccionados=this.getParentezcosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parentezco.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parentezcos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parentezco");
			//elementRoot.appendChild(element);
		
			for(Parentezco parentezcoAux:parentezcosSeleccionados) {
				element = document.createElement("parentezco");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParentezco(parentezcoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parentezcoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parentezco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParentezco(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParentezcoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParentezcoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParentezcoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParentezcoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParentezco(Parentezco parentezco,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parentezco.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parentezco.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(parentezco.getnombre());				
	}
	
	public void setFilaDatosExportarXmlParentezco(Parentezco parentezco,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParentezcoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parentezco.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParentezcoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parentezco.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(ParentezcoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(parentezco.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ParentezcoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(parentezco.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoParentezcosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Parentezco> parentezcosSeleccionados=new ArrayList<Parentezco>();
		
		parentezcosSeleccionados=this.getParentezcosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParentezco(parentezcosSeleccionados);
		
		this.generarReporteParentezcos("Todos",parentezcosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParentezco(ArrayList<Parentezco> parentezcosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Parentezco parentezcoAux:parentezcosSeleccionados) {
				parentezcoAux.setsDetalleGeneralEntityReporte(parentezcoAux.toString());
			
				if(sTipoSeleccionar.equals(ParentezcoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					parentezcoAux.setsDescripcionGeneralEntityReporte1(parentezcoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ParentezcoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					parentezcoAux.setsDescripcionGeneralEntityReporte1(parentezcoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParentezcoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParentezco(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParentezco=true;
				this.isVisibilidadCeldaNuevoRelacionesParentezco=true;
				this.isVisibilidadCeldaGuardarCambiosParentezco=true;
			}
			
			this.isVisibilidadCeldaModificarParentezco=false;
			this.isVisibilidadCeldaActualizarParentezco=false;
			this.isVisibilidadCeldaEliminarParentezco=false;
			this.isVisibilidadCeldaCancelarParentezco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParentezco=true;
				} else {
					this.isVisibilidadCeldaGuardarParentezco=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParentezco=false;
			this.isVisibilidadCeldaNuevoRelacionesParentezco=false;
			this.isVisibilidadCeldaGuardarCambiosParentezco=false;
			this.isVisibilidadCeldaModificarParentezco=false;
			this.isVisibilidadCeldaActualizarParentezco=true;
			this.isVisibilidadCeldaEliminarParentezco=false;
			this.isVisibilidadCeldaCancelarParentezco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParentezco=true;
				} else {
					this.isVisibilidadCeldaGuardarParentezco=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParentezco=false;
			this.isVisibilidadCeldaNuevoRelacionesParentezco=false;
			this.isVisibilidadCeldaGuardarCambiosParentezco=false;
			this.isVisibilidadCeldaModificarParentezco=false;
			this.isVisibilidadCeldaActualizarParentezco=true;
			this.isVisibilidadCeldaEliminarParentezco=true;
			this.isVisibilidadCeldaCancelarParentezco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParentezco=true;
				} else {
					this.isVisibilidadCeldaGuardarParentezco=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParentezco=false;
			this.isVisibilidadCeldaNuevoRelacionesParentezco=false;
			this.isVisibilidadCeldaGuardarCambiosParentezco=false;
			this.isVisibilidadCeldaModificarParentezco=false;
			this.isVisibilidadCeldaActualizarParentezco=true;
			this.isVisibilidadCeldaEliminarParentezco=false;
			this.isVisibilidadCeldaCancelarParentezco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParentezco=false;
				} else {
					this.isVisibilidadCeldaGuardarParentezco=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParentezco=true;
			this.isVisibilidadCeldaNuevoRelacionesParentezco=true;
			this.isVisibilidadCeldaGuardarCambiosParentezco=true;
			this.isVisibilidadCeldaModificarParentezco=false;
			this.isVisibilidadCeldaActualizarParentezco=false;
			this.isVisibilidadCeldaEliminarParentezco=false;
			this.isVisibilidadCeldaCancelarParentezco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParentezco=true;
				} else {
					this.isVisibilidadCeldaGuardarParentezco=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParentezco=false;
			this.isVisibilidadCeldaNuevoRelacionesParentezco=false;
			this.isVisibilidadCeldaGuardarCambiosParentezco=false;
			this.isVisibilidadCeldaActualizarParentezco=false;
			this.isVisibilidadCeldaEliminarParentezco=false;
			this.isVisibilidadCeldaCancelarParentezco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParentezco=false;
				} else {
					this.isVisibilidadCeldaGuardarParentezco=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParentezco=false;
			this.isVisibilidadCeldaNuevoRelacionesParentezco=false;
			this.isVisibilidadCeldaGuardarCambiosParentezco=false;
			this.isVisibilidadCeldaModificarParentezco=true;
			this.isVisibilidadCeldaActualizarParentezco=false;
			this.isVisibilidadCeldaEliminarParentezco=false;
			this.isVisibilidadCeldaCancelarParentezco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParentezco=false;
				} else {
					this.isVisibilidadCeldaGuardarParentezco=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParentezcoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParentezco=true;
			this.isVisibilidadCeldaNuevoRelacionesParentezco=true;
			this.isVisibilidadCeldaGuardarCambiosParentezco=true;
		} else {
			this.actualizarEstadoPanelsParentezco(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParentezco=false;
			//this.isVisibilidadCeldaVerFormParentezco=false;
			this.isVisibilidadCeldaDuplicarParentezco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parentezcoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParentezco=false;
		} else {
			this.isVisibilidadCeldaNuevoParentezco=false;
			this.isVisibilidadCeldaGuardarCambiosParentezco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parentezcoSessionBean.getEsGuardarRelacionado()) {
			if(!parentezcoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParentezco=false;												
			}
			
			this.jButtonCerrarParentezco.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParentezco=false;
		}
		
		if(!this.permiteMantenimiento(this.parentezco)) {
			this.isVisibilidadCeldaActualizarParentezco=false;
			this.isVisibilidadCeldaEliminarParentezco=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParentezco() {
		this.isVisibilidadCeldaNuevoParentezco=false;
		this.isVisibilidadCeldaGuardarCambiosParentezco=false;
	}
	
	public void actualizarEstadoPanelsParentezco(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParentezco!=null) {
				this.jScrollPanelDatosEdicionParentezco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParentezco!=null) {
				this.jScrollPanelDatosParentezco.setVisible(true);
			}
			
			if(this.jPanelPaginacionParentezco!=null) {
				this.jPanelPaginacionParentezco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParentezco!=null) {
				this.jPanelParametrosReportesParentezco.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParentezco!=null) {
				this.jScrollPanelDatosEdicionParentezco.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosParentezco!=null) {
				this.jScrollPanelDatosParentezco.setVisible(false);
			}
			
			if(this.jPanelPaginacionParentezco!=null) {
				this.jPanelPaginacionParentezco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParentezco!=null) {
				this.jPanelParametrosReportesParentezco.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParentezco!=null) {
				this.jScrollPanelDatosEdicionParentezco.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosParentezco!=null) {
				this.jScrollPanelDatosParentezco.setVisible(false);
			}
			
			if(this.jPanelPaginacionParentezco!=null) {
				this.jPanelPaginacionParentezco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParentezco!=null) {
				this.jPanelParametrosReportesParentezco.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParentezco!=null) {
				this.jScrollPanelDatosEdicionParentezco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParentezco!=null) {
				this.jScrollPanelDatosParentezco.setVisible(false);
			}
			
			if(this.jPanelPaginacionParentezco!=null) {
				this.jPanelPaginacionParentezco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParentezco!=null) {
				this.jPanelParametrosReportesParentezco.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParentezco!=null) {
				this.jScrollPanelDatosEdicionParentezco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParentezco!=null) {
				this.jScrollPanelDatosParentezco.setVisible(true);
			}
			
			if(this.jPanelPaginacionParentezco!=null) {
				this.jPanelPaginacionParentezco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParentezco!=null) {
				this.jPanelParametrosReportesParentezco.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParentezco!=null) {
				this.jScrollPanelDatosEdicionParentezco.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosParentezco!=null) {
				this.jScrollPanelDatosParentezco.setVisible(true);
			}
			
			if(this.jPanelPaginacionParentezco!=null) {
				this.jPanelPaginacionParentezco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParentezco!=null) {
				this.jPanelParametrosReportesParentezco.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParentezco!=null) {
				this.jScrollPanelDatosEdicionParentezco.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosParentezco!=null) {
				this.jScrollPanelDatosParentezco.setVisible(true);
			}
			
			if(this.jPanelPaginacionParentezco!=null) {
				this.jPanelPaginacionParentezco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParentezco!=null) {
				this.jPanelParametrosReportesParentezco.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parentezcoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.parentezcoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionParentezcoParaReferencias() throws Exception {
		Boolean isPaginaPopupReferencia=false;

		try {

			if(this.parentezcoSessionBean==null) {
				this.parentezcoSessionBean=new ParentezcoSessionBean();
			}

			if(this.jInternalFrameDetalleFormParentezco.referenciaSessionBean==null) {
				this.jInternalFrameDetalleFormParentezco.referenciaSessionBean=new ReferenciaSessionBean();
			}

			this.jInternalFrameDetalleFormParentezco.referenciaSessionBean.setsPathNavegacionActual(parentezcoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ReferenciaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormParentezco.referenciaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupReferencia=this.jInternalFrameDetalleFormParentezco.referenciaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormParentezco.referenciaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeReferencia(true);
			this.jInternalFrameDetalleFormParentezco.referenciaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeReferencia(ParentezcoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormParentezco.referenciaSessionBean.setisBusquedaDesdeForeignKeySesionParentezco(true);
			this.jInternalFrameDetalleFormParentezco.referenciaSessionBean.setlidParentezcoActual(this.idParentezcoActual);

			parentezcoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyParentezco(true);
			parentezcoSessionBean.setlIdParentezcoActualForeignKey(this.idParentezcoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParentezcoSessionBean parentezcoSessionBean=new ParentezcoSessionBean();
		
		if(this.parentezcoSessionBean==null) {
			this.parentezcoSessionBean=new ParentezcoSessionBean();
		}
		
		this.parentezcoSessionBean.setsUltimaBusquedaParentezco(this.getsAccionBusqueda());
		this.parentezcoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parentezcoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParentezcoSessionBean parentezcoSessionBean=new ParentezcoSessionBean();
		
		if(this.parentezcoSessionBean==null) {
			this.parentezcoSessionBean=new ParentezcoSessionBean();
		}
		
		if(this.parentezcoSessionBean.getsUltimaBusquedaParentezco()!=null&&!this.parentezcoSessionBean.getsUltimaBusquedaParentezco().equals("")) {
			this.setsAccionBusqueda(parentezcoSessionBean.getsUltimaBusquedaParentezco());
			this.setiNumeroPaginacion(parentezcoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parentezcoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.parentezcoSessionBean.setsUltimaBusquedaParentezco("");
		this.parentezcoSessionBean.setiNumeroPaginacion(ParentezcoConstantesFunciones.INUMEROPAGINACION);
		this.parentezcoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParentezco(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParentezco() {
		this.updateBorderResaltarBusquedasFormularioParentezco();
		this.updateVisibilidadBusquedasFormularioParentezco();
		this.updateHabilitarBusquedasFormularioParentezco();
	}
	
	public void updateBorderResaltarBusquedasFormularioParentezco() {					
	}
	
	public void updateVisibilidadBusquedasFormularioParentezco() {
	}
	
	public void updateHabilitarBusquedasFormularioParentezco() {
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
	
	public void updateControlesFormularioParentezco() throws Exception {

		if(this.jInternalFrameDetalleFormParentezco==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParentezco();
		this.updateVisibilidadResaltarControlesFormularioParentezco();
		this.updateHabilitarResaltarControlesFormularioParentezco();
		
	}
	
	public void updateBorderResaltarControlesFormularioParentezco() throws Exception {
		if(this.jInternalFrameDetalleFormParentezco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parentezcoConstantesFunciones.resaltaridParentezco!=null && this.jInternalFrameDetalleFormParentezco!=null) {this.jInternalFrameDetalleFormParentezco.jLabelidParentezco.setBorder(this.parentezcoConstantesFunciones.resaltaridParentezco);}
		if(this.parentezcoConstantesFunciones.resaltarcodigoParentezco!=null && this.jInternalFrameDetalleFormParentezco!=null) {this.jInternalFrameDetalleFormParentezco.jTextFieldcodigoParentezco.setBorder(this.parentezcoConstantesFunciones.resaltarcodigoParentezco);}
		if(this.parentezcoConstantesFunciones.resaltarnombreParentezco!=null && this.jInternalFrameDetalleFormParentezco!=null) {this.jInternalFrameDetalleFormParentezco.jTextAreanombreParentezco.setBorder(this.parentezcoConstantesFunciones.resaltarnombreParentezco);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParentezco() throws Exception {		
		if(this.jInternalFrameDetalleFormParentezco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParentezco!=null) {
	
		//this.jInternalFrameDetalleFormParentezco.jLabelidParentezco.setVisible(this.parentezcoConstantesFunciones.mostraridParentezco);
		this.jInternalFrameDetalleFormParentezco.jPanelidParentezco.setVisible(this.parentezcoConstantesFunciones.mostraridParentezco);
		//this.jInternalFrameDetalleFormParentezco.jTextFieldcodigoParentezco.setVisible(this.parentezcoConstantesFunciones.mostrarcodigoParentezco);
		this.jInternalFrameDetalleFormParentezco.jPanelcodigoParentezco.setVisible(this.parentezcoConstantesFunciones.mostrarcodigoParentezco);
		//this.jInternalFrameDetalleFormParentezco.jTextAreanombreParentezco.setVisible(this.parentezcoConstantesFunciones.mostrarnombreParentezco);
		this.jInternalFrameDetalleFormParentezco.jPanelnombreParentezco.setVisible(this.parentezcoConstantesFunciones.mostrarnombreParentezco);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParentezco() throws Exception {
		if(this.jInternalFrameDetalleFormParentezco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParentezco!=null) {
	
		this.jInternalFrameDetalleFormParentezco.jLabelidParentezco.setEnabled(this.parentezcoConstantesFunciones.activaridParentezco);
		this.jInternalFrameDetalleFormParentezco.jTextFieldcodigoParentezco.setEnabled(this.parentezcoConstantesFunciones.activarcodigoParentezco);
		this.jInternalFrameDetalleFormParentezco.jTextAreanombreParentezco.setEnabled(this.parentezcoConstantesFunciones.activarnombreParentezco);
		}
	}
	
		
}